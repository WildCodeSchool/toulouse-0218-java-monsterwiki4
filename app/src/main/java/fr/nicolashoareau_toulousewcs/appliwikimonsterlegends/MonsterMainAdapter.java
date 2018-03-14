package fr.nicolashoareau_toulousewcs.appliwikimonsterlegends;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 *
 */

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



        imgMonsterMain.setImageResource(trip.getImgMonster());
        textNameMonsterMain.setText(trip.getNameMonster());
        imgElementMain.setImageResource(trip.getImgElement());

        return convertView;
    }
}
