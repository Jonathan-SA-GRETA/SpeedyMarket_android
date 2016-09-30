package com.example.stagiaires.speedymarket;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.example.stagiaires.speedymarket.MainActivity;

import model.Categorie;

import static android.R.attr.fragment;

public class Categories extends  android.support.v4.app.Fragment{

    ImageButton gBtn_viandes;
    ImageButton gBtn_poissons;
    ImageButton gBtn_fruits;
    ImageButton gBtn_legumes;
    ImageButton gBtn_softs;
    ImageButton gBtn_alcools;
    ImageButton gBtn_fromages;
    ImageButton gBtn_yaourts;
    ImageButton gBtn_conserves;
    ImageButton gBtn_epi_sal;
    ImageButton gBtn_epi_suc;
    ImageButton gBtn_pdts_secs;

    private View.OnClickListener gBtn_viandesOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Bundle bundl = new Bundle();
            bundl.putString("cat", "VIAPOI_VIA");
            ListArticles fragment2 = new ListArticles();
            fragment2.setArguments(bundl);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment2);
            fragmentTransaction.commit();
        }
    };

    private View.OnClickListener gBtn_poissonsOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Bundle bundl = new Bundle();
            bundl.putString("cat", "VIAPOI_POI");
            ListArticles fragment2 = new ListArticles();
            fragment2.setArguments(bundl);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment2);
            fragmentTransaction.commit();
        }
    };
    private View.OnClickListener gBtn_fruitsOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Bundle bundl = new Bundle();
            bundl.putString("cat", "FRULEG_FRU");
            ListArticles fragment2 = new ListArticles();
            fragment2.setArguments(bundl);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment2);
            fragmentTransaction.commit();
        }
    };
    private View.OnClickListener gBtn_legumesOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Bundle bundl = new Bundle();
            bundl.putString("cat", "FRULEG_LEG");
            ListArticles fragment2 = new ListArticles();
            fragment2.setArguments(bundl);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment2);
            fragmentTransaction.commit();
        }
    };
    private View.OnClickListener gBtn_softsOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Bundle bundl = new Bundle();
            bundl.putString("cat", "BOISSO_NON");
            ListArticles fragment2 = new ListArticles();
            fragment2.setArguments(bundl);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment2);
            fragmentTransaction.commit();
        }
    };
    private View.OnClickListener gBtn_alcoolsOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Bundle bundl = new Bundle();
            bundl.putString("cat", "BOISSO_ALC");
            ListArticles fragment2 = new ListArticles();
            fragment2.setArguments(bundl);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment2);
            fragmentTransaction.commit();
        }
    };
    private View.OnClickListener gBtn_fromagesOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Bundle bundl = new Bundle();
            bundl.putString("cat", "PROLAI_FRO");
            ListArticles fragment2 = new ListArticles();
            fragment2.setArguments(bundl);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment2);
            fragmentTransaction.commit();
        }
    };
    private View.OnClickListener gBtn_yaourtsOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Bundle bundl = new Bundle();
            bundl.putString("cat", "PROLAI_YAO");
            ListArticles fragment2 = new ListArticles();
            fragment2.setArguments(bundl);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment2);
            fragmentTransaction.commit();
        }
    };
    private View.OnClickListener gBtn_conservesOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Bundle bundl = new Bundle();
            bundl.putString("cat", "CONBOC_CON");
            ListArticles fragment2 = new ListArticles();
            fragment2.setArguments(bundl);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment2);
            fragmentTransaction.commit();
        }
    };
    private View.OnClickListener gBtn_epi_salOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Bundle bundl = new Bundle();
            bundl.putString("cat", "EPISAL");
            ListArticles fragment2 = new ListArticles();
            fragment2.setArguments(bundl);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment2);
            fragmentTransaction.commit();
        }
    };
    private View.OnClickListener gBtn_epi_sucOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Bundle bundl = new Bundle();
            bundl.putString("cat", "EPISUC");
            ListArticles fragment2 = new ListArticles();
            fragment2.setArguments(bundl);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment2);
            fragmentTransaction.commit();
        }
    };
    private View.OnClickListener gBtn_pdts_secsOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Bundle bundl = new Bundle();
            bundl.putString("cat", "PROSEC");
            ListArticles fragment2 = new ListArticles();
            fragment2.setArguments(bundl);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment2);
            fragmentTransaction.commit();
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.content_categories, container, false);

        gBtn_viandes = (ImageButton) v.findViewById(R.id.btn_categorie_viande);
        gBtn_poissons = (ImageButton) v.findViewById(R.id.btn_categorie_poisson);
        gBtn_fruits = (ImageButton) v.findViewById(R.id.btn_categorie_fruit);
        gBtn_legumes = (ImageButton) v.findViewById(R.id.btn_categorie_legume);
        gBtn_softs = (ImageButton) v.findViewById(R.id.btn_categorie_soft);
        gBtn_alcools = (ImageButton) v.findViewById(R.id.btn_categorie_alcool);
        gBtn_fromages = (ImageButton) v.findViewById(R.id.btn_categorie_fromage);
        gBtn_yaourts = (ImageButton) v.findViewById(R.id.btn_categorie_yaourts);
        gBtn_conserves = (ImageButton) v.findViewById(R.id.btn_categorie_conserves);
        gBtn_epi_sal = (ImageButton) v.findViewById(R.id.btn_categorie_epi_sale);
        gBtn_epi_suc = (ImageButton) v.findViewById(R.id.btn_categorie_epi_suc);
        gBtn_pdts_secs = (ImageButton) v.findViewById(R.id.btn_categorie_pdt_secs);

        gBtn_viandes.setOnClickListener(gBtn_viandesOnClick);
        gBtn_poissons.setOnClickListener(gBtn_poissonsOnClick);
        gBtn_fruits.setOnClickListener(gBtn_fruitsOnClick);
        gBtn_legumes.setOnClickListener(gBtn_legumesOnClick);
        gBtn_softs.setOnClickListener(gBtn_softsOnClick);
        gBtn_alcools.setOnClickListener(gBtn_alcoolsOnClick);
        gBtn_fromages.setOnClickListener(gBtn_fromagesOnClick);
        gBtn_yaourts.setOnClickListener(gBtn_yaourtsOnClick);
        gBtn_conserves.setOnClickListener(gBtn_conservesOnClick);
        gBtn_epi_sal.setOnClickListener(gBtn_epi_salOnClick);
        gBtn_epi_suc.setOnClickListener(gBtn_epi_sucOnClick);
        gBtn_pdts_secs.setOnClickListener(gBtn_pdts_secsOnClick);

        return v;
    }



}
