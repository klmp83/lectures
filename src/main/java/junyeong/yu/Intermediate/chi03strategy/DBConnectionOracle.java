package junyeong.yu.Intermediate.chi03strategy;

/**
 * Created by yujun-yeong on 16-07-27.
 */
public class DBConnectionOracle implements DBConnection {

    @Override
    public void connection() {
        System.out.println("This is action to connection Oracle database - default");
    }

    @Override
    public void create() {
        System.out.println("This is action to create table using Oracle database Two - default");
    }
}
