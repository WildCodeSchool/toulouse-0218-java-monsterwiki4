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
            ficheimageMonster.setImageResource(R.drawable.firelionegg);
            ImageView fichetype = findViewById(R.id.fiche_type_logo);
            fichetype.setImageResource(R.drawable.fire);

        }
        if (recupname.equals("Rockilla")) {
            ImageView ficheimageMonster = findViewById(R.id.fiche_image_monster);
            ficheimageMonster.setImageResource(R.drawable.rockillaegg);
            ImageView fichetype = findViewById(R.id.fiche_type_logo);
            fichetype.setImageResource(R.drawable.earth);

        }
        if (recupname.equals("Turtle")) {
            ImageView ficheimageMonster = findViewById(R.id.fiche_image_monster);
            ficheimageMonster.setImageResource(R.drawable.turtleegg);
            ImageView fichetype = findViewById(R.id.fiche_type_logo);
            fichetype.setImageResource(R.drawable.water);

        }
        if (recupname.equals("Panda")) {
            ImageView ficheimageMonster = findViewById(R.id.fiche_image_monster);
            ficheimageMonster.setImageResource(R.drawable.pandaegg);
            ImageView fichetype = findViewById(R.id.fiche_type_logo);
            fichetype.setImageResource(R.drawable.nature);

        }
        if (recupname.equals("Thunder Eagle")) {
            ImageView ficheimageMonster = findViewById(R.id.fiche_image_monster);
            ficheimageMonster.setImageResource(R.drawable.thunderegg);
            ImageView fichetype = findViewById(R.id.fiche_type_logo);
            fichetype.setImageResource(R.drawable.thunder);

        }
        if (recupname.equals("Light Spirit")) {
            ImageView ficheimageMonster = findViewById(R.id.fiche_image_monster);
            ficheimageMonster.setImageResource(R.drawable.lsegg);
            ImageView fichetype = findViewById(R.id.fiche_type_logo);
            fichetype.setImageResource(R.drawable.light);

        }


    }
}
