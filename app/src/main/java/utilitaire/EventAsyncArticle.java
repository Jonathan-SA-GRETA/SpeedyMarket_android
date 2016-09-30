package utilitaire;

import model.Article;

import java.util.ArrayList;



/**
 * Created by Karim le  30/09/16.
 */
public interface EventAsyncArticle {
    public void onTacheTerminee(String result);
    public void onTacheTerminee(ArrayList<Article> result);
    public void onTacheTerminee(Article result);
}
