package junyeong.yu.Intermediate.chi03strategy;

/**
 * Created by yujun-yeong on 16-07-27.
 */
public class DBConnectionMysql implements DBConnection {

    @Override
    public void connection() {
        System.out.println("This is action to connection Mysql database - default");
    }

    @Override
    public void create() {
        System.out.println("This is action to create table using mysql database Two - default");
    }
}
