package Examen;

import java.util.List;

public class Main {
    public static void main(String[] args) {
    News_Interface newsInterface = new NewsSQL();
    // устанавление параметров insert
    newsInterface.InsertNews("insert into news (headline, text_news, publication_time)" +
                                      "values('Заголовка','Новости','2021-07-24 22:00');" +
                                      "commit;" );
    // вызов и сохранение таблицы
        List<News> news = newsInterface.OutNews();

        for (int i = 0; i < news.size(); i++) {
            System.out.println(news.get(i).getNameNews());
            System.out.println(news.get(i).getTextNews());
        }
        // удаление колону под определен индексом id
    newsInterface.DeleteNews(5);

        // добавление или улучшение таблицы посредством изменинений колонок и строк данных
    newsInterface.UpdateNews("Эаголо87686вка","Нов76577ости",4);
    }

}
