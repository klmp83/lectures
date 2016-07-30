package junyeong.yu.practice;

import junyeong.yu.practice.practice04.CollegeStudent;
import junyeong.yu.practice.practice04.HighSchoolStudent;
import junyeong.yu.practice.practice04.HighSchoolStudentResourceNetwork;
import junyeong.yu.practice.practice04.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yujun-yeong on 16-07-20.
 */
public class MainPractice04Client {

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
        highSchoolStudent.setStudentResource(new HighSchoolStudentResourceNetwork());
        highSchoolStudent.initialize();
        highSchoolStudent.save();
        highSchoolStudent.load();
        highSchoolStudent.close();

        System.out.println(highSchoolStudent.description());

    }
    /*private static interface StudentDescript {
        abstract public String description();
    }*/
}
