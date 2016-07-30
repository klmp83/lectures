package junyeong.yu.basic.chi04network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by yujun-yeong on 16-07-29.
 */
public class MainClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            OutputStream os = socket.getOutputStream();
            os.write(5);
            os.flush();

            InputStream is = socket.getInputStream();
            System.out.println("received : " + is.read());

            os.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
