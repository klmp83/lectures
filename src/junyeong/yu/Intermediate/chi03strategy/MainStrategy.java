package junyeong.yu.Intermediate.chi03strategy;

/**
 * Created by yujun-yeong on 16-07-27.
 */
public class MainStrategy {
    public static void main(String[] args) {
        DataAccessContext dataAccessContext = new DataAccessContext();
        dataAccessContext.setDbConnection(new DBConnectionMysql());
        dataAccessContext.connection();
        dataAccessContext.create();

        dataAccessContext.setDbConnection(new DBConnectionOracle());
        dataAccessContext.connection();
        dataAccessContext.create();
    }
}
