package junyeong.yu.practice.practice04;

import java.io.*;

/**
 * Created by yujun-yeong on 16-07-30.
 */
public class HighSchoolStudentResourceFile implements StudentResource {
    private Reader reader;
    private Writer writer;
    private HighSchoolStudent student;

    @Override
    public void setStudent(Student student) {
        this.student = (HighSchoolStudent) student;
    }

    @Override
    public void initialize() {
        try {
            File file = new File("highSchoolStudents.csv");
            writer = new BufferedWriter(new FileWriter(file));
            reader = new BufferedReader(new FileReader(file));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save() {
        try {
            String studentText = String.format("%d,%s,%d,%s,%s,%s",
                    student.getId(), student.getName(), student.getAge(), student.getLocation(),
                    student.getUniformColor(), student.getParentName());
            writer.append(studentText);
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public HighSchoolStudent load() {
        try {
            StringBuffer sb = new StringBuffer();
            for (int i; (i = reader.read()) != -1;) {
                sb.append((char)i);
            }
            System.out.print(sb.toString());

            //String result = sb.toString();
            String[] results = sb.toString().split(",");

            HighSchoolStudent student = new HighSchoolStudent();
            student.setId(Long.valueOf(results[0]));
            student.setName(results[1]);
            student.setAge(Integer.valueOf(results[2]));
            student.setLocation(results[3]);
            student.setUniformColor(results[4]);
            student.setParentName(results[5]);

            return student;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void close() {
        try {
            reader.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
