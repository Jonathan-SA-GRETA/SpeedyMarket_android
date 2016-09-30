package com.example.stagiaires.speedymarket;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.NumberPicker;
import android.widget.TextView;

/**
 * Created by Jean-Mimi le guedin qui craint déguin !!!! on 30/09/2016.
 */

public class Article extends  android.support.v4.app.Fragment{


    TextView LibelleArticle;
    ImageButton imgPhotoArticle, imgPhotoProd;
    Button btn_add_article, btn_remove_article;
    EditText descriptionArticle, descriptionProd;
    NumberPicker NumberPicker;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.page_article, container, false);
    }


    private View.OnClickListener btn_add_article_onclick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };


    private View.OnClickListener btn_remove_article_onclick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    LibelleArticle = (TextView) v.findViewById(R.id.
    descriptionArticle = (EditText) v.findViewById(R.id.description_text);
    descriptionProd = (EditText) v.findViewById(R.id.producer_text);
    btn_add_article = (Button) v.findViewById(R.id.add_article);
    btn_remove_article = (Button) v.findViewById(R.id.remove_article);
    imgPhotoArticle = (ImageButton) v.findViewById(R.id.img_article);
    imgPhotoProd = (ImageButton) v.findViewById(R.id.img_producer);

    btn_add_article.setOnClickListener(btn_add_article_onclick);
    btn_remove_article.setOnClickListener(btn_remove_article_onclick);

}