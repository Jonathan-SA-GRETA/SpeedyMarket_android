package com.example.stagiaires.speedymarket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

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

        //TODO : Listeners onClick

        return v;
    }


}
