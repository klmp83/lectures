package junyeong.yu.basic.chi04network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by yujun-yeong on 16-07-29.
 */
public class MainServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server is running");
            Socket socket = serverSocket.accept();
            System.out.println("Server received data from client");

            InputStream is = socket.getInputStream();
            System.out.println("result: " + is.read());

            OutputStream os = socket.getOutputStream();
            os.write(30);

            is.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
