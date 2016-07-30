package junyeong.yu.practice.practice04;

/**
 * Created by yujun-yeong on 16-07-30.
 */
abstract public class Student implements StudentResource {
    private long id;
    private String name;
    private int age;
    private String location;

    public Student() {} // default constructor
    public Student(long id, String name, int age, String location) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    abstract public String description();

    // TODO ; later change
    @Override
    public void setStudent(Student student) {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
