package junyeong.yu.practice.practice04;

/**
 * Created by yujun-yeong on 16-07-30.
 */
public class HighSchoolStudent extends Student /*implements StudentDescript */{
    private String uniformColor;
    private String parentName;

    private StudentResource studentResource;
    public void setStudentResource(StudentResource studentResource) {
        this.studentResource = studentResource;
        this.studentResource.setStudent(this);
    }

    public HighSchoolStudent() {}
    public HighSchoolStudent(long id, String name, int age, String location) {
        super(id, name, age, location);
    }
    public HighSchoolStudent(long id, String name, int age, String location, String uniformColor, String parentName) {
        this(id, name, age, location);
        this.uniformColor = uniformColor;
        this.parentName = parentName;
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
        return  "HighSchoolStudent Id : "         + getId()                + "\r\n" +
                "HighSchoolStudent Name : "       + getName()              + "\r\n" +
                "HighSchoolStudent Age : "        + getAge()               + "\r\n" +
                "HighSchoolStudent Location : "   + getLocation()          + "\r\n" +
                "HighSchoolStudent Uniform Color : " + uniformColor   + "\r\n" +
                "HighSchoolStudent Parent Name : "   + parentName     + "\r\n";
    }

    public String getUniformColor() {
        return uniformColor;
    }

    public void setUniformColor(String uniformColor) {
        this.uniformColor = uniformColor;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }
}
