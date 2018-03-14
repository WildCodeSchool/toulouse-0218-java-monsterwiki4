package fr.nicolashoareau_toulousewcs.appliwikimonsterlegends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

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
    }
}
