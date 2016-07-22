package junyeong.yu.practice;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yujun-yeong on 16-07-21.
 */
public class MainBeginner04Server {

    public static void main(String[] args) {
        MainBeginner04Server server = new MainBeginner04Server();
        server.await();
    }

    Map<String, String> memory = new HashMap<>();

    public void await() {
        ServerSocket serverSocket = null;
        int port = 8080;
        try {
            serverSocket =  new ServerSocket(port, 1, InetAddress.getByName("127.0.0.1"));
            System.out.println("Server starts");
        } catch (Exception e) {
            e.printStackTrace();
        }

        while (true) {
            Socket socket = null;
            InputStream input = null;
            OutputStream output = null;
            try {
                socket = serverSocket.accept();
                System.out.println("Client tries to connect to server");
                input = socket.getInputStream();
                output = socket.getOutputStream();

                StringBuffer sb = new StringBuffer();
                for (int i; (i = input.read()) != -1;) {
                    sb.append((char)i);
                }

                memory.put("data", sb.toString());
                System.out.print(sb.toString());

                socket.close();
            }
            catch (Exception e) {
                e.printStackTrace();
                continue;
            }
        }
    }
}
