package utilitaire;

import model.Article;

import java.util.ArrayList;



/**
 * Created by Karim le  30/09/16.
 */
public interface EventAsyncArticle {
    public void onTaskCompleted(String result);
    public void onTaskCompleted(ArrayList<Article> result);
    public void onTaskCompleted(Article result);
}
