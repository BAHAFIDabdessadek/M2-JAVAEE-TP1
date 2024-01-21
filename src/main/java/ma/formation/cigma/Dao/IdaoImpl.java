package ma.formation.cigma.Dao;

import ma.formation.cigma.model.Article;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class IdaoImpl implements Idao {


    private  static final List<Article> database = new ArrayList<>();

    @PostConstruct
    public void init(){
        database.add(Article.builder()
                .id(1)
                .description("ARTICLE_2")
                .price(1400.0)
                .quantity(150.0)
                .build());
        database.add(Article.builder()
                .id(2)
                .description("ARTICLE_2")
                .price(1900.0)
                .quantity(110.0)
                .build());
        database.add(Article.builder()
                .id(3)
                .description("ARTICLE_3")
                .price(1200.0)
                .quantity(130.0)
                .build());
        database.add(Article.builder()
                .id(4)
                .description("ARTICLE_4")
                .price(1240.0)
                .quantity(180.0)
                .build());
    }


    @Override
    public void addArticle(Article article) {

    }

    @Override
    public void updateArticle(Integer id, Article article) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void getArticleById(Integer integer) {

    }

    @Override
    public List<Article> getArticles() {
        return null;
    }
}
