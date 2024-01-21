package ma.formation.cigma.Dao;

import ma.formation.cigma.model.Article;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    database.add(article);
    }

    @Override
    public void updateArticle(Integer id, Article article) {

        Article articleFound= getArticleById(id);

        if(articleFound == null){
            System.out.println("There is no article with this id :"+id);
        }else {

            database.remove(articleFound);
            article.setId(id);
            database.add(article);
        }


    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Article getArticleById(Integer id) {



   /*
   Example 1 :
      1 -   return  database.stream().filter(a -> a.getId().equals(id)).findFirst().orElse(null);
      2 - make Article Optional<Article>
    */
  // Example 2 :
        for(i=0; i<database.size();i++){

            if (database.get(i).getId().equals(id) ){
                return database.get(id);
            }
        }
        return null;


       for (Article a : database){
           if (a.getId().equals(a)){
               return  a;
           }
       }
    }

    public List<Article> getArticlesByCriteria(String criteria ) {

        return database.stream().filter(a -> a.getDescription().contains(criteria)).collect(Collectors.toList());
    }

    public List<String> getArticlesByCriteria2(String criteria ) {

        return database.stream().
                filter(a -> a.getDescription().
                contains(criteria)).
                map(a-> a.getDescription())
                .collect(Collectors.toList());
    }

    public List<String> getArticlesByCriteria3(String criteria ) {

        return database.stream().
                filter(a -> a.getDescription().
                        contains(criteria)).
                map(a-> "["+a.getDescription() +" "+a.getPrice() +"]@" )
                .collect(Collectors.toList());
    }

}
