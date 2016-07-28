package junyeong.yu.Intermediate.chi03strategy;

/**
 * Created by yujun-yeong on 16-07-27.
 */
public class DataAccessContext {
    private DBConnection dbConnection;
    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void connection() {
        this.dbConnection.connection();
    }

    public void create() {
        this.dbConnection.create();
    }
}
