package com.example.jordan.androcv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Formation> formations = new ArrayList<Formation>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        formations.add(new Formation("2012 - 2015", "Université Paris X", "Licence MIAGE"));
        formations.add(new Formation("2015 - 2017", "IMC Randstad", "BTS SIO"));
        formations.add(new Formation("2017 - 2020", "CFA Insta", "ARCHITECTE TECHNIQUE EN INFORMATIQUE ET RÉSEAUX"));

        ListView listView = (ListView) findViewById(R.id.listViewFormation);
        FormationAdapter adapter = new FormationAdapter(this, formations);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }
}
