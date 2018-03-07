package fr.nicolashoareau_toulousewcs.appliwikimonsterlegends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        final Intent recup1 = getIntent();
        final String recupname = recup1.getStringExtra("monstername");
        TextView monsterName = findViewById(R.id.fiche_name);
        monsterName.setText(recupname);

        ImageView logopower = findViewById(R.id.fiche_power_logo);
        logopower.setImageResource(R.drawable.power);
        ImageView logolife = findViewById(R.id.fiche_life_logo);
        logolife.setImageResource(R.drawable.life);
        ImageView logospeed = findViewById(R.id.fiche_speed_logo);
        logospeed.setImageResource(R.drawable.speed);
        ImageView logostamina = findViewById(R.id.fiche_stamina_logo);
        logostamina.setImageResource(R.drawable.stamina);



        if (recupname.equals("Fire Lion")) {
            ImageView ficheimageMonster = findViewById(R.id.fiche_image_monster);
            ficheimageMonster.setImageResource(R.drawable.firelionegg);
            ImageView fichetype = findViewById(R.id.fiche_type_logo);
            fichetype.setImageResource(R.drawable.fire);
            TextView fichedescription = findViewById(R.id.fiche_description_text);
            fichedescription.setText(R.string.lionfiredesc);

            //change les imageview pour le monstre
            ImageView ficheevol0 = findViewById(R.id.fiche_evol0);
            ficheevol0.setImageResource(R.drawable.firelionegg);
            ImageView ficheevol1 = findViewById(R.id.fiche_evol1);
            ficheevol1.setImageResource(R.drawable.firelionone);
            ImageView ficheevol2 = findViewById(R.id.fiche_evol2);
            ficheevol2.setImageResource(R.drawable.fireliontwo);
            ImageView ficheevol3 = findViewById(R.id.fiche_evol3);
            ficheevol3.setImageResource(R.drawable.firelionthree);


        }

        if (recupname.equals("Rockilla")) {
            ImageView ficheimageMonster = findViewById(R.id.fiche_image_monster);
            ficheimageMonster.setImageResource(R.drawable.rockillaegg);
            ImageView fichetype = findViewById(R.id.fiche_type_logo);
            fichetype.setImageResource(R.drawable.earth);
            TextView fichedescription = findViewById(R.id.fiche_description_text);
            //TextView textrockilla = findViewById(R.id.text_rockilla);
            fichedescription.setText(R.string.rockilladesc);

            //change les imageview pour le monstre
            ImageView ficheevol0 = findViewById(R.id.fiche_evol0);
            ficheevol0.setImageResource(R.drawable.rockillaegg);
            ImageView ficheevol1 = findViewById(R.id.fiche_evol1);
            ficheevol1.setImageResource(R.drawable.rockillaone);
            ImageView ficheevol2 = findViewById(R.id.fiche_evol2);
            ficheevol2.setImageResource(R.drawable.rockillatwo);
            ImageView ficheevol3 = findViewById(R.id.fiche_evol3);
            ficheevol3.setImageResource(R.drawable.rockillathree);

        }

        if (recupname.equals("Turtle")) {
            ImageView ficheimageMonster = findViewById(R.id.fiche_image_monster);
            ficheimageMonster.setImageResource(R.drawable.turtleegg);
            ImageView fichetype = findViewById(R.id.fiche_type_logo);
            fichetype.setImageResource(R.drawable.water);
            TextView fichedescription = findViewById(R.id.fiche_description_text);
            TextView textturtle = findViewById(R.id.text_turtle);
            fichedescription.setText(R.string.turtledesc);

            //change les imageview pour le monstre
            ImageView ficheevol0 = findViewById(R.id.fiche_evol0);
            ficheevol0.setImageResource(R.drawable.turtleegg);
            ImageView ficheevol1 = findViewById(R.id.fiche_evol1);
            ficheevol1.setImageResource(R.drawable.turtleone);
            ImageView ficheevol2 = findViewById(R.id.fiche_evol2);
            ficheevol2.setImageResource(R.drawable.turtletwo);
            ImageView ficheevol3 = findViewById(R.id.fiche_evol3);
            ficheevol3.setImageResource(R.drawable.turtlethree);



        }
        if (recupname.equals("Panda")) {
            ImageView ficheimageMonster = findViewById(R.id.fiche_image_monster);
            ficheimageMonster.setImageResource(R.drawable.pandaegg);
            ImageView fichetype = findViewById(R.id.fiche_type_logo);
            fichetype.setImageResource(R.drawable.nature);
            TextView fichedescription = findViewById(R.id.fiche_description_text);
            TextView textpanda = findViewById(R.id.text_panda);
            fichedescription.setText(R.string.pandadesc);

            //change les imageview pour le monstre
            ImageView ficheevol0 = findViewById(R.id.fiche_evol0);
            ficheevol0.setImageResource(R.drawable.pandaegg);
            ImageView ficheevol1 = findViewById(R.id.fiche_evol1);
            ficheevol1.setImageResource(R.drawable.pandaone);
            ImageView ficheevol2 = findViewById(R.id.fiche_evol2);
            ficheevol2.setImageResource(R.drawable.pandatwo);
            ImageView ficheevol3 = findViewById(R.id.fiche_evol3);
            ficheevol3.setImageResource(R.drawable.pandathree);

        }
        if (recupname.equals("Thunder Eagle")) {
            ImageView ficheimageMonster = findViewById(R.id.fiche_image_monster);
            ficheimageMonster.setImageResource(R.drawable.thunderegg);
            ImageView fichetype = findViewById(R.id.fiche_type_logo);
            fichetype.setImageResource(R.drawable.thunder);
            TextView fichedescription = findViewById(R.id.fiche_description_text);
            TextView texteagle = findViewById(R.id.text_eagle);
            fichedescription.setText(R.string.thunderdesc);

            //change les imageview pour le monstre
            ImageView ficheevol0 = findViewById(R.id.fiche_evol0);
            ficheevol0.setImageResource(R.drawable.thunderegg);
            ImageView ficheevol1 = findViewById(R.id.fiche_evol1);
            ficheevol1.setImageResource(R.drawable.thunderone);
            ImageView ficheevol2 = findViewById(R.id.fiche_evol2);
            ficheevol2.setImageResource(R.drawable.thundertwo);
            ImageView ficheevol3 = findViewById(R.id.fiche_evol3);
            ficheevol3.setImageResource(R.drawable.thunderthree);

        }
        if (recupname.equals("Light Spirit")) {
            ImageView ficheimageMonster = findViewById(R.id.fiche_image_monster);
            ficheimageMonster.setImageResource(R.drawable.lsegg);
            ImageView fichetype = findViewById(R.id.fiche_type_logo);
            fichetype.setImageResource(R.drawable.light);
            TextView fichedescription = findViewById(R.id.fiche_description_text);
            TextView textspirit = findViewById(R.id.text_spirit);
            fichedescription.setText(R.string.spiritdesc);

            //change les imageview pour le monstre
            ImageView ficheevol0 = findViewById(R.id.fiche_evol0);
            ficheevol0.setImageResource(R.drawable.lsegg);
            ImageView ficheevol1 = findViewById(R.id.fiche_evol1);
            ficheevol1.setImageResource(R.drawable.lsone);
            ImageView ficheevol2 = findViewById(R.id.fiche_evol2);
            ficheevol2.setImageResource(R.drawable.lstwo);
            ImageView ficheevol3 = findViewById(R.id.fiche_evol3);
            ficheevol3.setImageResource(R.drawable.lsthree);

        }

        //RAJOUTER LES VALEURS DES STATS

        //IL FAUT TROUVER LA SOLUTION POUR ACTUALISER LES DONNEES EN CHANGEANT DE NIVEAU D'EVOLUTION

        final ImageView imageViewEvol1 = findViewById(R.id.fiche_evol1);
        imageViewEvol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nameMonster = recupname;
                switch(nameMonster) {
                    case "Fire Lion":
                        ImageView ficheimageFL = findViewById(R.id.fiche_image_monster);
                        ficheimageFL.setImageResource(R.drawable.firelionone);
                        break;

                    case "Rockilla":
                        ImageView ficheimageRockilla = findViewById(R.id.fiche_image_monster);
                        ficheimageRockilla.setImageResource(R.drawable.rockillaone);
                        break;

                    case "Turtle":
                        ImageView ficheimageTurtle = findViewById(R.id.fiche_image_monster);
                        ficheimageTurtle.setImageResource(R.drawable.turtleone);
                        break;

                    case "Panda":
                        ImageView ficheimagePanda = findViewById(R.id.fiche_image_monster);
                        ficheimagePanda.setImageResource(R.drawable.pandaone);
                        break;

                    case "Thunder Eagle":
                        ImageView ficheimageTE= findViewById(R.id.fiche_image_monster);
                        ficheimageTE.setImageResource(R.drawable.thunderone);
                        break;

                    case "Light Spirit":
                        ImageView ficheimageLS = findViewById(R.id.fiche_image_monster);
                        ficheimageLS.setImageResource(R.drawable.lsone);
                        break;
                }

            }
        });

        final ImageView imageViewEvol0 = findViewById(R.id.fiche_evol0);
        imageViewEvol0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nameMonster = recupname;
                switch(nameMonster) {
                    case "Fire Lion":
                        ImageView ficheimageFL = findViewById(R.id.fiche_image_monster);
                        ficheimageFL.setImageResource(R.drawable.firelionegg);
                        break;

                    case "Rockilla":
                        ImageView ficheimageRockilla = findViewById(R.id.fiche_image_monster);
                        ficheimageRockilla.setImageResource(R.drawable.rockillaegg);
                        break;

                    case "Turtle":
                        ImageView ficheimageTurtle = findViewById(R.id.fiche_image_monster);
                        ficheimageTurtle.setImageResource(R.drawable.turtleegg);
                        break;

                    case "Panda":
                        ImageView ficheimagePanda = findViewById(R.id.fiche_image_monster);
                        ficheimagePanda.setImageResource(R.drawable.pandaegg);
                        break;

                    case "Thunder Eagle":
                        ImageView ficheimageTE= findViewById(R.id.fiche_image_monster);
                        ficheimageTE.setImageResource(R.drawable.thunderegg);
                        break;

                    case "Light Spirit":
                        ImageView ficheimageLS = findViewById(R.id.fiche_image_monster);
                        ficheimageLS.setImageResource(R.drawable.lsegg);
                        break;
                }

            }
        });

        final ImageView imageViewEvol2 = findViewById(R.id.fiche_evol2);
        imageViewEvol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nameMonster = recupname;
                switch(nameMonster) {
                    case "Fire Lion":
                        ImageView ficheimageFL = findViewById(R.id.fiche_image_monster);
                        ficheimageFL.setImageResource(R.drawable.fireliontwo);
                        break;

                    case "Rockilla":
                        ImageView ficheimageRockilla = findViewById(R.id.fiche_image_monster);
                        ficheimageRockilla.setImageResource(R.drawable.rockillatwo);
                        break;

                    case "Turtle":
                        ImageView ficheimageTurtle = findViewById(R.id.fiche_image_monster);
                        ficheimageTurtle.setImageResource(R.drawable.turtletwo);
                        break;

                    case "Panda":
                        ImageView ficheimagePanda = findViewById(R.id.fiche_image_monster);
                        ficheimagePanda.setImageResource(R.drawable.pandatwo);
                        break;

                    case "Thunder Eagle":
                        ImageView ficheimageTE= findViewById(R.id.fiche_image_monster);
                        ficheimageTE.setImageResource(R.drawable.thundertwo);
                        break;

                    case "Light Spirit":
                        ImageView ficheimageLS = findViewById(R.id.fiche_image_monster);
                        ficheimageLS.setImageResource(R.drawable.lstwo);
                        break;
                }

            }
        });

        final ImageView imageViewEvol3 = findViewById(R.id.fiche_evol3);
        imageViewEvol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nameMonster = recupname;
                switch(nameMonster) {
                    case "Fire Lion":
                        ImageView ficheimageFL = findViewById(R.id.fiche_image_monster);
                        ficheimageFL.setImageResource(R.drawable.firelionthree);
                        break;

                    case "Rockilla":
                        ImageView ficheimageRockilla = findViewById(R.id.fiche_image_monster);
                        ficheimageRockilla.setImageResource(R.drawable.rockillathree);
                        break;

                    case "Turtle":
                        ImageView ficheimageTurtle = findViewById(R.id.fiche_image_monster);
                        ficheimageTurtle.setImageResource(R.drawable.turtlethree);
                        break;

                    case "Panda":
                        ImageView ficheimagePanda = findViewById(R.id.fiche_image_monster);
                        ficheimagePanda.setImageResource(R.drawable.pandathree);
                        break;

                    case "Thunder Eagle":
                        ImageView ficheimageTE= findViewById(R.id.fiche_image_monster);
                        ficheimageTE.setImageResource(R.drawable.thunderthree);
                        break;

                    case "Light Spirit":
                        ImageView ficheimageLS = findViewById(R.id.fiche_image_monster);
                        ficheimageLS.setImageResource(R.drawable.lsthree);
                        break;
                }

            }
        });

    }
}
