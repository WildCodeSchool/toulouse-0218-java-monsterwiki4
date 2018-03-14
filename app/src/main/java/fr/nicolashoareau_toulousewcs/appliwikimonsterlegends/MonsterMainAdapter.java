package fr.nicolashoareau_toulousewcs.appliwikimonsterlegends;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonsterMainAdapter extends ArrayAdapter<MonsterMainModel> {
    public MonsterMainAdapter(Context context, ArrayList<MonsterMainModel> trips) {
        super(context, 0, trips);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MonsterMainModel trip = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_monster, parent, false);
        }
        ImageView imgMonsterMain = convertView.findViewById(R.id.image_monster_main);
        TextView textNameMonsterMain = convertView.findViewById(R.id.text_monster_name_main);
        ImageView imgElementMain = convertView.findViewById(R.id.image_element_main);

        //Ajout de l'élément2 si besoin
        ImageView imgElementMain2 = convertView.findViewById(R.id.image_element_main2);
        //condition si le monstre a 2 éléments alors on lui donne une ressource sinon rien
            if (trip.getImgElement2()!=0) {
                imgElementMain2.setImageResource(trip.getImgElement2());
            }
            else {
                imgElementMain2.setImageDrawable(null);
            }
        imgMonsterMain.setImageResource(trip.getImgMonster());
        textNameMonsterMain.setText(trip.getNameMonster());
        imgElementMain.setImageResource(trip.getImgElement());
        return convertView;
    }
}
