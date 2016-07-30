package junyeong.yu.practice.practice04;

/**
 * Created by yujun-yeong on 16-07-30.
 */
public class CollegeStudent extends Student/* implements StudentDescript */{
    private String major;

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
        return  "CollegeStudent Id : "         + getId()                + "\r\n" +
                "CollegeStudent Name : "       + getName()              + "\r\n" +
                "CollegeStudent Age : "        + getAge()               + "\r\n" +
                "CollegeStudent Location : "   + getLocation()          + "\r\n" +
                "CollegeStudent Major : "      + getMajor()             + "\r\n";
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
}
