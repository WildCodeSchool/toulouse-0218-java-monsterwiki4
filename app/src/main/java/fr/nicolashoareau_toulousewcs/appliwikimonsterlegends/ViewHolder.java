package fr.nicolashoareau_toulousewcs.appliwikimonsterlegends;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by wilder on 14/03/18.
 */

public class ViewHolder {
    ImageView imgMonsterMain;
    TextView textNameMonsterMain;
    ImageView imgElementMain;

    public ViewHolder(View view) {
        imgMonsterMain = (ImageView) view.findViewById(R.id.image_monster_main);
        textNameMonsterMain = (TextView) view.findViewById(R.id.text_monster_name_main);
        imgElementMain = (ImageView) view.findViewById(R.id.image_element_main);
    }
}
