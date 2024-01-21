package ma.formation.cigma.Dao;

import ma.formation.cigma.model.Article;

import java.util.List;

public interface Idao {

    public void addArticle(Article article);

    public void updateArticle(Integer id , Article article);

    public void delete(Integer id);

    public Article getArticleById(Integer integer);

    List<Article>getArticles();
}
