package fr.nicolashoareau_toulousewcs.appliwikimonsterlegends;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FicheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiche);

        //Bundle bundle1 =this.getIntent().getExtras();
        //int pic=bundle1.getInt("image1");
        //ImageView v = findViewById(R.id.fiche_image_monster);
        //v.setImageDrawable(ContextCompat.getDrawable(this,pic));
        Intent recup1 = getIntent();
        String recupname = recup1.getStringExtra("monstername");
        TextView monsterName = findViewById(R.id.fiche_name);
        monsterName.setText(recupname);

        if (recupname.equals("Fire Lion")) {
            ImageView ficheimageMonster = findViewById(R.id.fiche_image_monster);


        }


    }
}
