package DAO;

import android.util.Log;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import model.Article;
import utilitaire.AccesHTTP;
import utilitaire.EventAsyncArticle;


/**
 * Created by Karim on 23/09/2016.
 */

public abstract class ArticleDAO implements EventAsyncArticle {
    private static final String server = "91.121.161.48";
    private static final String path = "/speedymarket/";

    public ArticleDAO() {
    }

    public void getArticle(){
        AccesHTTP objAsyncTask = new AccesHTTP() {

            @Override
            protected void onPostExecute(Long result) {
                Log.d("log", "onPostExecute ArticleDAO");
                onTaskCompleted(jsonStringToArticleArrayList(this.ret));
            }
        };
        objAsyncTask.execute("http://"+server+path+"getArticle.php");
    }
    public void getArctileById(Integer NumArticle){
        AccesHTTP requetteHttp = new AccesHTTP(){

            @Override
            protected void onPostExecute(Long result) {
                Log.d("log","onPostExecute ArticleDAO");
                onTaskCompleted(jsonStringToArticle(this.ret));
            }
        };
        requetteHttp.addParam("NumArticle", NumArticle.toString());
        requetteHttp.execute("http://"+server+path+"getArticleById.php");
    }
    private ArrayList<Article> jsonStringToArticleArrayList(String jsonString) {
        Log.d("log","conversion jsonToArticleArray : "+jsonString);

        ArrayList<Article> listeArticle = new ArrayList<Article>();
        String codeArticle;
        String libelleArticle;
        String descriptionArticle;
        Integer qtArticle;
        Float prixArticle;
        String photoArticle;
        try {
            JSONArray tabJson = new JSONArray(jsonString);
            for (int i=0; i<tabJson.length(); i++){
                codeArticle = tabJson.getJSONObject(i).getString("codeArticle");
                libelleArticle = tabJson.getJSONObject(i).getString("LibelleArticle");
                descriptionArticle = tabJson.getJSONObject(i).getString("descriptionArticle");
                qtArticle = Integer.parseInt(tabJson.getJSONObject(i).getString("qtArticle"));
                prixArticle = Float.parseFloat(tabJson.getJSONObject(i).getString("prixArticle"));
                photoArticle = tabJson.getJSONObject(i).getString("photoArticle");
                listeArticle.add(new Article(codeArticle, libelleArticle, descriptionArticle, qtArticle, prixArticle,photoArticle) );
            }
        } catch (JSONException e) {
            Log.d("log","pb decodage JSON Array");
        }
        return listeArticle;
    }

    private Article jsonStringToArticle(String jsonString) {
        Log.d("log","conversion jsonToArticle : "+ jsonString);

        Article unArticle=null;
        String codeArticle;
        String libelleArticle;
        String descriptionArticle;
        Integer qtArticle;
        Float prixArticle;
        String photoArticle;

        try {
            JSONObject objJson = new JSONObject(jsonString);
            codeArticle = objJson.getString("codeArticle");
            libelleArticle = objJson.getString("libelleArticle");
            descriptionArticle = objJson.getString("descriptionArticle");
            qtArticle = Integer.parseInt(objJson.getString("qtArticle"));
            prixArticle = Float.parseFloat(objJson.getString("prixArticle"));
            photoArticle = objJson.getString("photoArticle");

            unArticle = new Article(codeArticle, libelleArticle, descriptionArticle, qtArticle, prixArticle,photoArticle) ;
        } catch (JSONException e) {
            Log.d("log","pb decodage JSON Objet");
        }

        return unArticle;
    }
}
