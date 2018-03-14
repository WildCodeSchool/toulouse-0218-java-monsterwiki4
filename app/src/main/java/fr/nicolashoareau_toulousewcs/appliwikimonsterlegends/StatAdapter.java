package fr.nicolashoareau_toulousewcs.appliwikimonsterlegends;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class StatAdapter extends ArrayAdapter<StatModel> {
    public StatAdapter(Context context, ArrayList<StatModel> stats) {
        super(context, 0, stats);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        StatModel statModel = getItem(position);

        TextView fichePower = convertView.findViewById(R.id.fiche_power_value);
        TextView ficheLife = convertView.findViewById(R.id.fiche_life_value);
        TextView ficheSpeed = convertView.findViewById(R.id.fiche_speed_value);
        TextView ficheStamina = convertView.findViewById(R.id.fiche_stamina_value);

        fichePower.setText(statModel.getPower());
        ficheStamina.setText(statModel.getStamina());
        ficheLife.setText(statModel.getLife());
        ficheSpeed.setText(statModel.getSpeed());

        return convertView;
    }


}
