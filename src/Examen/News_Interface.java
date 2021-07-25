package Examen;

import java.util.List;

public interface News_Interface {
    void CreateNews(String create);
    void InsertNews(String displaying);
    void DeleteNews (int delete);
    void UpdateNews(String headline, String textNews, int id);

    List<News> OutNews();

}
