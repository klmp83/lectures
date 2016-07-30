package junyeong.yu.practice.practice04;

/**
 * Created by yujun-yeong on 16-07-30.
 */
interface StudentResource {
    abstract public void setStudent(Student student);
    abstract public void initialize();
    abstract public void save();
    abstract public Student load();
    abstract public void close();
}
