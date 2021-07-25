package Examen;

import java.util.List;

public class Main {
    public static void main(String[] args) {
    News_Interface newsInterface = new NewsSQL();
    newsInterface.InsertNews("insert into news (headline, text_news, publication_time)" +
                                      "values('Заголовка','Новости','2021-07-24 22:00');" +
                                      "commit;" );

        List<News> news = newsInterface.OutNews();

        for (int i = 0; i < news.size(); i++) {
            System.out.println(news.get(i).getNameNews());
            System.out.println(news.get(i).getTextNews());
        }

    newsInterface.DeleteNews(5);


    newsInterface.UpdateNews("Эаголо87686вка","Нов76577ости",4);
    }

}
