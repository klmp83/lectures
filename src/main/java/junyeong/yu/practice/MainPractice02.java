package junyeong.yu.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yujun-yeong on 16-07-20.
 */
public class MainPractice02 {

    public static void main(String args[]) throws Exception {
        List<StudentDescript> studentList = new ArrayList<>();
        studentList.add(new HighSchoolStudent(3, "Junyeong", 33, "Barrie"));
        studentList.add(new HighSchoolStudent(4, "JungWhan", 30, "Toronto", "Red", "JungMi"));
        studentList.add(new HighSchoolStudent(5, "JungSu", 36, "Vancouver"));
        studentList.add(new CollegeStudent(6, "Maria", 33, "Seoul"));
        studentList.add(new CollegeStudent(7, "Chan", 30, "Tokyo"));
        studentList.add(new CollegeStudent(8, "Can", 36, "Hirosima"));
        StudentDescript studentDescript = new StudentDescript() {
            @Override
            public String description() {
                // TODO Auto-generated method stub
                return "ABCCCCCCCCCCCC";
            }
        };
        StudentDescript studentDescriptLamda = () -> {return "ABCCCCCCCC-Lamda";};

        studentList.add(studentDescript);
        studentList.add(studentDescriptLamda);

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).description());
        }
    }
    private static interface StudentDescript {
        abstract public String description();
    }
    abstract private static class Student {
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

        /*abstract public String description(); /*{
            return  "Student Id : "         + id            + "\r\n" +
                    "Student Name : "       + name          + "\r\n" +
                    "Student Age : "        + age           + "\r\n" +
                    "Student Location : "   + location      + "\r\n";
        };*/
    }

    private static class HighSchoolStudent extends Student implements StudentDescript {
        String uniformColor;
        String parentName;

        public HighSchoolStudent() {}
        public HighSchoolStudent(long id, String name, int age, String location) {
            super(id, name, age, location);
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

    private static class CollegeStudent extends Student implements StudentDescript {
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
        public String description() {
            return  "CollegeStudent Id : "         + id                + "\r\n" +
                    "CollegeStudent Name : "       + name              + "\r\n" +
                    "CollegeStudent Age : "        + age               + "\r\n" +
                    "CollegeStudent Location : "   + location          + "\r\n" +
                    "CollegeStudent Major : "      + major             + "\r\n";
        }
    }
}
