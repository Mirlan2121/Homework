package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LotteryImpl {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "miki212122";

    public Connection connect() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
    @Override
    public LotteryModel createLottery(LotteryModel lotteryModel){
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = connect();
            statement = connection.
                    prepareStatement("insert into  lottery (name, description, date_start, date_end)\n" +
                    "values (?, ?, ?, ?);");
            statement.setString(1,lotteryModel.getName());
        }catch (Exception e){

        }
    }
}
