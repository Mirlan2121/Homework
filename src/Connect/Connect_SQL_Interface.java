package Connect;

public interface Connect_SQL_Interface {
    void CreateTableSQL(String write);
    void InsertTableSQL(String insert);
    void UpdateTableSQL(String table, String column);
}
