package fr.nicolashoareau_toulousewcs.appliwikimonsterlegends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<MonsterMainModel> results = new ArrayList<>();
        MonsterMainAdapter adapter = new MonsterMainAdapter(this,results);
        final ListView listMonster = findViewById(R.id.list_monster);
        listMonster.setAdapter(adapter);
        try {
            results.add(new MonsterMainModel(R.drawable.firelionone, "Fire Lion", R.drawable.fire));
            results.add(new MonsterMainModel(R.drawable.rockillaone, "Rockilla", R.drawable.earth));
            results.add(new MonsterMainModel(R.drawable.turtleone, "Turtle", R.drawable.water));
            results.add(new MonsterMainModel(R.drawable.pandaone, "Panda", R.drawable.nature));
            results.add(new MonsterMainModel(R.drawable.thunderone, "Thunder Eagle", R.drawable.thunder));
            results.add(new MonsterMainModel(R.drawable.lsone, "Light Spirit", R.drawable.light));
            results.add(new MonsterMainModel(R.drawable.tyrannoone, "Tyrannoking", R.drawable.dark));
            results.add(new MonsterMainModel(R.drawable.metalsaurone, "Metalsaur", R.drawable.metal));
            results.add(new MonsterMainModel(R.drawable.genieone, "Genie", R.drawable.magic));
            results.add(new MonsterMainModel(R.drawable.obsidiaone, "Obsidia", R.drawable.dark, R.drawable.earth));
        } catch (Exception e) {
        }
        //On créer un élement tvBlink avec l'id du texte du titlebanniere
        TextView tvBlink2 = (TextView) findViewById(R.id.textBanner);
        //on paramètre l'animation
        Animation anim2 = new AlphaAnimation(0.0f, 1.0f);
        anim2.setDuration(950); //c'est le paramètre qui permet de paramètrer la fréquence du clignot
        anim2.setStartOffset(10);//temps qu'il reste invisible
        anim2.setRepeatMode(Animation.REVERSE);
        anim2.setRepeatCount(Animation.INFINITE);
        tvBlink2.startAnimation(anim2);
        tvBlink2.setTextColor(this.getResources().getColor(R.color.colorAccent));

        listMonster.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                MonsterMainModel item = (MonsterMainModel)listMonster.getItemAtPosition(position);
                Intent intent = new Intent(ListActivity.this, FicheActivity.class);
                String name = item.getNameMonster();
                intent.putExtra("nameMonster",name);
                ListActivity.this.startActivity(intent);
            }
        });

        Button buttonKnowMore = findViewById(R.id.button_konw);
        buttonKnowMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentButtonKnow = new Intent(ListActivity.this,KnowMoreActivity.class);
                ListActivity.this.startActivity(intentButtonKnow);
            }
        });


    }
}
