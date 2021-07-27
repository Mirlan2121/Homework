package Homework.TasKA;

import Connect.PostgreSQL_Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CoachSQL extends PostgreSQL_Connect implements Coach_SQL {

    @Override
    public List<Coach> getAll() {
        List<Coach> coaches = null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try{
            connection = connect();
            statement = connection.prepareStatement("select * from coach;");
            resultSet = statement.executeQuery();
            coaches = new ArrayList<>();

            while (resultSet.next()){
                Coach coach = new Coach();
                coach.setId(resultSet.getInt("id"));
                coach.setName(resultSet.getString("coach_name"));
                coach.setSerName(resultSet.getString("coach_serName"));
                coach.setSalary(resultSet.getInt("salary"));
                coaches.add(coach);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
            }catch (SQLException sql){
                sql.printStackTrace();
            }
            try {
                statement.close();
            }catch (SQLException sql){
                sql.printStackTrace();
            }
            try {
                connection.close();
            }catch (SQLException sql){
                sql.printStackTrace();
            }
        }
        return coaches;
    }
}
