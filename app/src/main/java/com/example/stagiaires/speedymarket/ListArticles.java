package com.example.stagiaires.speedymarket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import model.Article;

import java.util.ArrayList;

import dao.ArticleDAO;

public class ListArticles extends  android.support.v4.app.ListFragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.content_list_articles, container, false);
        String cat =  getArguments().getString("cat");

        ArticleDAO articleAcces = new ArticleDAO() {

            @Override
            public void onTacheTerminee(final ArrayList<Article> result) {

                setListAdapter(new ArticleAdapter(result, getActivity().getBaseContext()));
            }

            @Override
            public void onTacheTerminee(Article result) {

            }

            @Override
            public void onTacheTerminee(String result) {

            }

        };

        articleAcces.getArticles(cat);

        return v;
    }

}
