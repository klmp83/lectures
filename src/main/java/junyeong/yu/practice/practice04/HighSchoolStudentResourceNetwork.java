package junyeong.yu.practice.practice04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * Created by yujun-yeong on 16-07-30.
 */
public class HighSchoolStudentResourceNetwork implements StudentResource {
    Socket socket = null;
    InputStream input = null;
    OutputStream output = null;
    HighSchoolStudent student;

    @Override
    public void setStudent(Student student) {
        this.student = (HighSchoolStudent) student;
    }

    @Override
    public void initialize() {
        try {
            socket = new Socket("127.0.0.1", 8080);
            input = socket.getInputStream();
            output = socket.getOutputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save() {
        String dataToSend = "For Network Test";
        byte[] b = dataToSend.getBytes(Charset.forName("UTF-8"));
        try {
            //output.write(b);
            output.write(b, 0, b.length);
            output.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Student load() {
        try {
            StringBuffer sb = new StringBuffer();
            for (int i; (i = input.read()) != -1;) {
                sb.append((char)i);
            }
            System.out.println("result from server : " + sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void close() {
        try {
            output.close();
            input.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
