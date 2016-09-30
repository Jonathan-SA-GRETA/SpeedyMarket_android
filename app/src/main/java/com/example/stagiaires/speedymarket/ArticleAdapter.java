package com.example.stagiaires.speedymarket;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;


import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.ArrayList;
import model.Article;

/**
 * Created by Karim on 30/09/2016.
 */

public class ArticleAdapter extends BaseAdapter{
    private ArrayList<Article> lesArticles;

    private LayoutInflater mInflater;
    private Context context;

    public ArticleAdapter(ArrayList<Article> lesArticles, Context context) {
        this.lesArticles = lesArticles;
        this.context = context;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return lesArticles.size();
    }

    @Override
    public Article getItem(int position) {
        return lesArticles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v;
        ViewHolder holder;

        String URL = "http://192.168.167.217/~alex/cuisine";

        if(convertView == null) {
            v = mInflater.inflate(R.layout.list_articles_row, parent, false);
            holder = new ViewHolder();
            holder.prixArticle = (TextView) v.findViewById(R.id.edtPrix);
            holder.photoArticle = (ImageView) v.findViewById(R.id.img_banane);
;
            v.setTag(holder);
        }
        else {
            v = convertView;
            holder = (ViewHolder) v.getTag();
        }

        Article unArticle = lesArticles.get(position);

        if(unArticle.getPhotoArticle() != null) {
            URL += unArticle.getPhotoArticle();
            ImageLoader imgLoader = ImageLoader.getInstance();
            imgLoader.init(ImageLoaderConfiguration.createDefault(context));
            DisplayImageOptions options = new DisplayImageOptions.Builder()
                    .showStubImage(R.drawable.banane)
                    .cacheInMemory()
                    .cacheOnDisc()
                    .build();
            imgLoader.displayImage(URL, holder.photoArticle, options);
        }
        holder.libelleArticle.setText(unArticle.getLibelleArticle());
        holder.prixArticle.setText(unArticle.getPrixArticle().toString());

        return v;
    }

    static class ViewHolder {
        TextView libelleArticle;
        ImageView photoArticle;
        TextView prixArticle;
    }
}
