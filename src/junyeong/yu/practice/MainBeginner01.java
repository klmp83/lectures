package junyeong.yu.practice;

import java.util.ArrayList;
import java.util.List;

public class MainBeginner01 {
    public static void main(String[] args) {
        // bad because it is impossible to use loop for this.
        long id = 3;
        String name = "Junyeong";
        int age = 33;
        String location = "Barrie";

        long idX = 4;
        String nameX = "JungWhan";
        int ageX = 30;
        String locationX = "Toronto";

        long idY = 5;
        String nameY = "JungSu";
        int ageY = 36;
        String locationY = "Vancouver";

        // improved but still bad because there is integrity issue
        long[] idArray =            {3,         4,          5};//,          6};
        String[] nameArray =        {name,      nameX,      nameY};
        int[] ageArray =            {age,       ageX,       ageY};
        String[] locationArray =    {location,  locationX,  locationY};

        if ((idArray.length == nameArray.length && idArray.length == ageArray.length && idArray.length == locationArray.length) == false) {
            System.out.println("Array length should be same.");
            return;
        }

        for (int i = 0; i < idArray.length; i++) {
            System.out.println(
                    "Student Id : "         + idArray[i]        + "\r\n" +
                    "Student Name : "       + nameArray[i]      + "\r\n" +
                    "Student Age : "        + ageArray[i]       + "\r\n" +
                    "Student Location : "   + locationArray[i]  + "\r\n"
            );
        }

        System.out.println("==================================================================================");

        // suggestion - using structural type
        /*Student studentOne = new Student();
        studentOne.id = 3;
        studentOne.name = "Junyeong";
        studentOne.age = 33;
        studentOne.location = "Barrie";

        Student studentTwo = new Student();
        studentTwo.id = 4;
        studentTwo.name = "JungWhan";
        studentTwo.age = 30;
        studentTwo.location = "Toronto";

        Student studentThree = new Student();
        studentThree.id = 5;
        studentThree.name = "JungSu";
        studentThree.age = 36;
        studentThree.location = "Vancouver";*/

        Student studentOne =    new Student(3, "Junyeong", 33, "Barrie");
        Student studentTwo =    new Student(4, "JungWhan", 30, "Toronto");
        Student studentThree =  new Student(5, "JungSu", 36, "Vancouver");

        Student[] students = {studentOne, studentTwo, studentThree};

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }

        System.out.println("==================================================================================");

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(3, "Junyeong", 33, "Barrie"));
        studentList.add(new Student(4, "JungWhan", 30, "Toronto"));
        studentList.add(new Student(5, "JungSu", 36, "Vancouver"));

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).toString());
        }

        System.out.println("==================================================================================");


    } // of main()

    private static class Student {
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

        @Override
        public String toString() {
            return  "Student Id : "         + id            + "\r\n" +
                    "Student Name : "       + name          + "\r\n" +
                    "Student Age : "        + age           + "\r\n" +
                    "Student Location : "   + location      + "\r\n";
        };
    }


} // of MainBeginner
