package com.car.synergy.ui;

/**
 * Created by yujun-yeong on 16-08-06.
 */

import com.car.synergy.Car;
import com.car.synergy.GasTank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CarUIComponent extends JFrame {
    public static final int CANVAS_WIDTH = 400;
    public static final int CANVAS_HEIGHT = 400;
    public static final Color CANVAS_BG_COLOR = Color.BLACK;

    private DrawCanvas canvas; // the custom drawing canvas (an inner class extends JPanel)
    private CarSpeedSprite sprite;     // the moving object

    private Car car;
    public void setCar(Car car) {
        this.car = car;
    }

    // Constructor to set up the GUI components and event handlers
    public CarUIComponent() {
        // Construct a sprite given x, y, width, height, color
        sprite = new CarSpeedSprite(CANVAS_WIDTH / 2 - 5, CANVAS_HEIGHT / 2 - 40, 10, 20, Color.RED);

        // Set up the custom drawing canvas (JPanel)
        canvas = new DrawCanvas();
        canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

        // Add both panels to this JFrame
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(canvas, BorderLayout.CENTER);
        cp.add(getResultPanel(), BorderLayout.WEST);
        cp.add(getInstructorPanel(), BorderLayout.EAST);
        cp.add(getBtnPanel(), BorderLayout.SOUTH);

        CarUIComponent ui = this;

        // "super" JFrame fires KeyEvent
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                switch(evt.getKeyCode()) {
                    case KeyEvent.VK_S: start(); break;
                    case KeyEvent.VK_T: stop(); break;
                    case KeyEvent.VK_UP:  moveUp();  break;
                    case KeyEvent.VK_DOWN: moveDown(); break;
                    case KeyEvent.VK_I: insertGas(); break;
                    case KeyEvent.VK_O: openDoor(); break;
                    case KeyEvent.VK_C: closeDoor(); break;
                }
            }
            private void start() {
                //System.out.println("Start Car");
                car.startCar();
            }
            private void stop() {
                //System.out.println("Stop Car");
                car.stopCar();
            }
            private void moveUp() {
                car.pushAccelerator();
                ui.moveUp();
            }
            private void moveDown() {
                car.pushBreaker();
                ui.moveDown();
            }
            private void insertGas() {
                //System.out.println("Insert Gas");
                car.insertGasoline(GasTank.MAXIMUM_GASOLINE / 2);
            }
            private void openDoor() {
                //System.out.println("Open Door");
                car.openDoor();
            }
            private void closeDoor() {
                //System.out.println("Close Door");
                car.closeDoor();
            }
        });

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Move a Sprite");
        pack();            // pack all the components in the JFrame
        setVisible(true);  // show it
        requestFocus();    // "super" JFrame requests focus to receive KeyEvent
    }
    
    private JPanel getResultPanel() {
        JPanel panel = new JPanel(new FlowLayout());
        JTextArea jTextArea = new JTextArea();
        String text = "---- Result ----";
        jTextArea.setText(text);
        panel.add(jTextArea);
        return panel;
    }

    private JPanel getInstructorPanel() {
        JPanel panel = new JPanel(new FlowLayout());
        JTextArea jTextArea = new JTextArea();
        String text = "---- Instructor ----\n";
        text += "Start : s \nStop : t \nAccel : up \nBreak : down \n";
        text += "Insert gas : i\nOpen door : o\nClose door : c";
        jTextArea.setText(text);
        panel.add(jTextArea);
        return panel;
    }

    private JPanel getBtnPanel() {
        // Set up a panel for the buttons
        JPanel btnPanel = new JPanel(new FlowLayout());

        JButton btnUp = new JButton("Move Up ");
        btnPanel.add(btnUp);
        btnUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                moveUp();
                requestFocus(); // change the focus to JFrame to receive KeyEvent
            }
        });
        JButton btnDown = new JButton("Move Down");
        btnPanel.add(btnDown);
        btnDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                moveDown();
                requestFocus(); // change the focus to JFrame to receive KeyEvent
            }
        });
        return btnPanel;
    }
    
    // Helper method to move the sprite up
    private void moveUp() {
        // Save the current dimensions for repaint to erase the sprite
        int savedY = sprite.y;
        // update sprite
        sprite.y -= 10;
        // Repaint only the affected areas, not the entire JFrame, for efficiency
        canvas.repaint(sprite.x, savedY, sprite.width, sprite.height); // Clear old area to background
        canvas.repaint(sprite.x, sprite.y, sprite.width, sprite.height); // Paint new location
    }

    // Helper method to move the sprite down
    private void moveDown() {
        // Save the current dimensions for repaint to erase the sprite
        int savedY = sprite.y;
        // update sprite
        sprite.y += 10;
        // Repaint only the affected areas, not the entire JFrame, for efficiency
        canvas.repaint(sprite.x, savedY, sprite.width, sprite.height); // Clear old area to background
        canvas.repaint(sprite.x, sprite.y, sprite.width, sprite.height); // Paint at new location
    }

    // Define inner class DrawCanvas, which is a JPanel used for custom drawing
    class DrawCanvas extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(CANVAS_BG_COLOR);
            sprite.paint(g);  // the sprite paints itself
        }
    }

    // The entry main() method
    public static void main(String[] args) {
        // Run GUI construction on the Event-Dispatching Thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CarUIComponent(); // Let the constructor do the job
            }
        });
    }
}

