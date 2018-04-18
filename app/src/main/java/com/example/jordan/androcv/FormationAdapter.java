package com.example.jordan.androcv;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FormationAdapter extends BaseAdapter {
    public Activity context;
    public ArrayList<Formation> formations;

    public FormationAdapter(Activity context, ArrayList<Formation> formations){
        this.context = context;
        this.formations = formations;
    }

    @Override
    public int getCount() {
        return this.formations.size();
    }

    @Override
    public Object getItem(int position) {
        return this.formations.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.formations.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.formation_item, null);
        TextView textView = (TextView) rowView.findViewById(R.id.textViewAnnee);
        textView.setText(this.formations.get(position).toString());

        TextView textViewEta = (TextView) rowView.findViewById(R.id.textViewEtablissement);
        textViewEta.setText(this.formations.get(position).toString());

        TextView textViewLibelle = (TextView) rowView.findViewById(R.id.textViewLibelle);
        textViewLibelle.setText(this.formations.get(position).toString());

        return rowView;
    }
}
