package junyeong.yu.practice;

import java.io.*;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yujun-yeong on 16-07-20.
 */
public class MainBeginner04Resource {

    public static void main(String args[]) throws Exception {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new HighSchoolStudent(3, "Junyeong", 33, "Barrie"));
        studentList.add(new HighSchoolStudent(4, "JungWhan", 30, "Toronto", "Red", "JungMi"));
        studentList.add(new HighSchoolStudent(5, "JungSu", 36, "Vancouver"));
        studentList.add(new CollegeStudent(6, "Maria", 33, "Seoul"));
        studentList.add(new CollegeStudent(7, "Chan", 30, "Tokyo"));
        studentList.add(new CollegeStudent(8, "Can", 36, "Hirosima"));

        /*for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).description());
        }*/

        HighSchoolStudent highSchoolStudent = new HighSchoolStudent(9, "JungWhanX", 35, "Torontol", "Yellow", "Jones");
        //highSchoolStudent.setHighSchoolStudentResourceFile(new HighSchoolStudentResourceFile());
        highSchoolStudent.setHighSchoolStudentResourceFile(new HighSchoolStudentResourceNetwork());
        highSchoolStudent.initialize();
        highSchoolStudent.save();
        highSchoolStudent.load();
        //highSchoolStudent.close();

        System.out.println(highSchoolStudent.description());

    }
    /*private static interface StudentDescript {
        abstract public String description();
    }*/
    abstract interface StudentResource {
        abstract public void setStudent(Student student);
        abstract public void initialize();
        abstract public void save();
        abstract public Student load();
        abstract public void close();
    }

    private static class HighSchoolStudentResourceNetwork implements StudentResource {
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
                output.write(b);
                output.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public Student load() {


            return null;
        }

        @Override
        public void close() {

        }
    }

    private static class HighSchoolStudentResourceFile implements StudentResource {
        Reader reader;
        Writer writer;
        HighSchoolStudent student;

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
                String studentText = String.format("%d,%s,%d,%s,%s,%s", student.id, student.name, student.age, student.location, student.uniformColor, student.parentName);
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
                student.id = Long.valueOf(results[0]);
                student.name = results[1];
                student.age = Integer.valueOf(results[2]);
                student.location = results[3];
                student.uniformColor = results[4];
                student.parentName = results[5];

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

    abstract private static class Student implements StudentResource {
        public Student() {} // default constructor
        public Student(long id, String name, int age, String location) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.location = location;
        }
        long id;
        String name;
        int age;
        String location;

        abstract public String description();

        // TODO ; later change
        @Override
        public void setStudent(Student student) {}
    }

    private static class HighSchoolStudent extends Student /*implements StudentDescript */{
        String uniformColor;
        String parentName;

        StudentResource studentResource;
        public void setHighSchoolStudentResourceFile(StudentResource studentResource) {
            this.studentResource = studentResource;
            this.studentResource.setStudent(this);
        }

        public HighSchoolStudent() {}
        public HighSchoolStudent(long id, String name, int age, String location) {
            super(id, name, age, location);
        }

        @Override
        public void initialize() {
            this.studentResource.initialize();
        }

        @Override
        public void save() {
            this.studentResource.save();
        }

        @Override
        public Student load() {
            return this.studentResource.load();
        }

        @Override
        public void close() {
            this.studentResource.close();
        }

        @Override
        public String description() {
            return  "HighSchoolStudent Id : "         + id                + "\r\n" +
                    "HighSchoolStudent Name : "       + name              + "\r\n" +
                    "HighSchoolStudent Age : "        + age               + "\r\n" +
                    "HighSchoolStudent Location : "   + location          + "\r\n" +
                    "HighSchoolStudent Uniform Color : " + uniformColor   + "\r\n" +
                    "HighSchoolStudent Parent Name : "   + parentName     + "\r\n";
        }

        public HighSchoolStudent(long id, String name, int age, String location, String uniformColor, String parentName) {
            this(id, name, age, location);
            this.uniformColor = uniformColor;
            this.parentName = parentName;
        }
    }

    private static class CollegeStudent extends Student/* implements StudentDescript */{
        String major;

        public CollegeStudent() {}
        public CollegeStudent(long id, String name, int age, String location) {
            super(id, name, age, location);
        }
        public CollegeStudent(long id, String name, int age, String location, String major) {
            this(id, name, age, location);
            this.major = major;
        }

        @Override
        public void setStudent(Student student) {

        }

        @Override
        public void initialize() {

        }

        @Override
        public void save() {

        }

        @Override
        public CollegeStudent load() {
            return null;
        }

        @Override
        public void close() {

        }

        @Override
        public String description() {
            return  "CollegeStudent Id : "         + id                + "\r\n" +
                    "CollegeStudent Name : "       + name              + "\r\n" +
                    "CollegeStudent Age : "        + age               + "\r\n" +
                    "CollegeStudent Location : "   + location          + "\r\n" +
                    "CollegeStudent Major : "      + major             + "\r\n";
        }
    }
}
