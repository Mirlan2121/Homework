package com.company.Draft;

import Connect.PostgreSQL_Connect;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HumanModel extends PostgreSQL_Connect implements Connect_SQL{
    List<Human> humans = null;
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    @Override
    public List<Human> getAll() {
        try {
            connection = connect();
            statement = connection.prepareStatement("select * from Human;");
            resultSet = statement.executeQuery();
            humans = new ArrayList<>();
            while (resultSet.next()){
                Human man = new Human();
                man.setId(resultSet.getInt("id"));
                man.setName(resultSet.getString("name"));
                man.setSerName(resultSet.getString("ser_name"));
                man.setDateOfBirth(resultSet.getDate("date_of_birth"));
                humans.add(man);
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
        return humans;
    }
}


