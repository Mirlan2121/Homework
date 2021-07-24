package Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Connect_SQL_Creat extends PostgreSQL_Connect implements Connect_SQL_Interface {

    @Override
    public void CreateTableSQL(String write) {
        try {
            Connection connection = connect();
            Statement statement = connection.createStatement();
            statement.executeUpdate(write);
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("таблица создана");
    }

    @Override
    public void InsertTableSQL(String insert) {
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(insert)) {
            statement.executeUpdate();

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    @Override
    public void UpdateTableSQL(String table, String column) {
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(String.format(""))) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
