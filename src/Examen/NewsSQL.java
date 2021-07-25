package Examen;

import Connect.PostgreSQL_Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NewsSQL extends PostgreSQL_Connect implements News_Interface {


    @Override
    public void CreateNews(String create) {
        try {

            Connection connection = connect();
            Statement statement = connection.createStatement();
            statement.executeUpdate(create);


        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
            System.out.println("Таблица создана");
        }
    }

    @Override
    public void InsertNews(String displaying) {
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(displaying)) {
            statement.executeUpdate();

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.out.println("Установка параметров");
        }

    }

    public void DeleteNews(int delete) {
        try(Connection connection = connect();
        Statement statement = connection.createStatement();){
        statement.executeUpdate(String.format("DELETE FROM public.news WHERE id = %s;" , delete));

        }catch (Exception e){
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

    }

    @Override
    public void UpdateNews(String headline, String textNews, int id) {
        try (Connection connection = connect();
             Statement statement = connection.createStatement())
             {
                statement.executeUpdate(String.format("update news set \"headline\" = '%s'" +
                        "where id = %s;" +
                                "update news set \"text_news\" = '%s'" +
                                " where id = %s;" , headline,id, textNews, id ));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }



    public List<News> OutNews() {
        List<News> newsAll = new ArrayList<>();
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("select * from news;");
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                News news1 = new News();
                news1.setId(resultSet.getInt("id"));
                news1.setNameNews(resultSet.getString("headline"));
                news1.setTextNews(resultSet.getString("text_news"));
                news1.setPublication(resultSet.getString("publication_time"));
                newsAll.add(news1);
            }
        } catch (Exception e) {
            System.err.println(getClass().getName() + ": " + e.getMessage());
            System.exit(0);

        }
        return newsAll;

    }
}