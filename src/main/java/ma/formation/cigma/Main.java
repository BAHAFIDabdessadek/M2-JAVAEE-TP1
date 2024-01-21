package ma.formation.cigma;

import ma.formation.cigma.model.Article;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Article a1 = new Article();
        a1.setDescription("ARTICLE_1");
        a1.setId(12);
        a1.setPrice(1000d);
        a1.setQuantity(150.0);

        Article a2 = new Article(10,"ARTICLE_2",14000.0,100.0);

        System.out.println(a1.toString());
        System.out.println(a2); // he will call to toString by default

    }
}