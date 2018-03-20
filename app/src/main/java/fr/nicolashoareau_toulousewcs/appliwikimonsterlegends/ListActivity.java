package fr.nicolashoareau_toulousewcs.appliwikimonsterlegends;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<MonsterModel> results = new ArrayList<>();
        MonsterAdapter adapter = new MonsterAdapter(this, results);
        final ListView listMonster = findViewById(R.id.list_monster);
        listMonster.setAdapter(adapter);

        results.add(new MonsterModel(R.drawable.firelionone, "Fire Lion", R.drawable.fire));
        results.add(new MonsterModel(R.drawable.rockillaone, "Rockilla", R.drawable.earth));
        results.add(new MonsterModel(R.drawable.turtleone, "Turtle", R.drawable.water));
        results.add(new MonsterModel(R.drawable.pandaone, "Panda", R.drawable.nature));
        results.add(new MonsterModel(R.drawable.thunderone, "Thunder Eagle", R.drawable.thunder));
        results.add(new MonsterModel(R.drawable.lsone, "Light Spirit", R.drawable.light));
        results.add(new MonsterModel(R.drawable.tyrannoone, "Tyrannoking", R.drawable.dark));
        results.add(new MonsterModel(R.drawable.metalsaurone, "Metalsaur", R.drawable.metal));
        results.add(new MonsterModel(R.drawable.genieone, "Genie", R.drawable.magic));
        results.add(new MonsterModel(R.drawable.obsidiaone, "Obsidia", R.drawable.dark, R.drawable.earth));

        //On créer un élement tvBlink avec l'id du texte du titlebanniere
        TextView tvTextBanner = (TextView) findViewById(R.id.textBanner);
        //on paramètre l'animation
        Animation anim2 = new AlphaAnimation(0.0f, 1.0f);
        anim2.setDuration(950); //c'est le paramètre qui permet de paramètrer la fréquence du clignot
        anim2.setStartOffset(10);//temps qu'il reste invisible
        anim2.setRepeatMode(Animation.REVERSE);
        anim2.setRepeatCount(Animation.INFINITE);
        tvTextBanner.startAnimation(anim2);
        tvTextBanner.setTextColor(this.getResources().getColor(R.color.colorAccent));

        listMonster.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                MonsterModel item = (MonsterModel) listMonster.getItemAtPosition(position);
                Intent intent = new Intent(ListActivity.this, MonsterActivity.class);
                String name = item.getNameMonster();
                intent.putExtra("nameMonster", name);
                ListActivity.this.startActivity(intent);
            }
        });
    }
}
