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

        if (recupname.equals("Tyrannoking")) {
            ImageView ficheimageMonster = findViewById(R.id.fiche_image_monster);
            ficheimageMonster.setImageResource(R.drawable.tyrannoegg);
            ImageView fichetype = findViewById(R.id.fiche_type_logo);
            fichetype.setImageResource(R.drawable.dark);
            TextView fichedescription = findViewById(R.id.fiche_description_text);
            fichedescription.setText(R.string.tyrannodesc);

            //change les imageview pour le monstre
            ImageView ficheevol0 = findViewById(R.id.fiche_evol0);
            ficheevol0.setImageResource(R.drawable.tyrannoegg);
            ImageView ficheevol1 = findViewById(R.id.fiche_evol1);
            ficheevol1.setImageResource(R.drawable.tyrannoone);
            ImageView ficheevol2 = findViewById(R.id.fiche_evol2);
            ficheevol2.setImageResource(R.drawable.tyrannotwo);
            ImageView ficheevol3 = findViewById(R.id.fiche_evol3);
            ficheevol3.setImageResource(R.drawable.tyrannothree);

        }

        if (recupname.equals("Metalsaur")) {
            ImageView ficheimageMonster = findViewById(R.id.fiche_image_monster);
            ficheimageMonster.setImageResource(R.drawable.metalsauregg);
            ImageView fichetype = findViewById(R.id.fiche_type_logo);
            fichetype.setImageResource(R.drawable.metal);
            TextView fichedescription = findViewById(R.id.fiche_description_text);
            fichedescription.setText(R.string.metalsaurdesc);

            //change les imageview pour le monstre
            ImageView ficheevol0 = findViewById(R.id.fiche_evol0);
            ficheevol0.setImageResource(R.drawable.metalsauregg);
            ImageView ficheevol1 = findViewById(R.id.fiche_evol1);
            ficheevol1.setImageResource(R.drawable.metalsaurone);
            ImageView ficheevol2 = findViewById(R.id.fiche_evol2);
            ficheevol2.setImageResource(R.drawable.metalsaurtwo);
            ImageView ficheevol3 = findViewById(R.id.fiche_evol3);
            ficheevol3.setImageResource(R.drawable.metalsaurthree);

        }
        if (recupname.equals("Genie")) {
            ImageView ficheimageMonster = findViewById(R.id.fiche_image_monster);
            ficheimageMonster.setImageResource(R.drawable.genieegg);
            ImageView fichetype = findViewById(R.id.fiche_type_logo);
            fichetype.setImageResource(R.drawable.magic);
            TextView fichedescription = findViewById(R.id.fiche_description_text);
            fichedescription.setText(R.string.geniedesc);

            //change les imageview pour le monstre
            ImageView ficheevol0 = findViewById(R.id.fiche_evol0);
            ficheevol0.setImageResource(R.drawable.genieegg);
            ImageView ficheevol1 = findViewById(R.id.fiche_evol1);
            ficheevol1.setImageResource(R.drawable.genieone);
            ImageView ficheevol2 = findViewById(R.id.fiche_evol2);
            ficheevol2.setImageResource(R.drawable.genietwo);
            ImageView ficheevol3 = findViewById(R.id.fiche_evol3);
            ficheevol3.setImageResource(R.drawable.geniethree);

        }

        if (recupname.equals("Obsidia")) {
            ImageView ficheimageMonster = findViewById(R.id.fiche_image_monster);
            ficheimageMonster.setImageResource(R.drawable.obsidiaegg);
            ImageView fichetype = findViewById(R.id.fiche_type_logo);
            fichetype.setImageResource(R.drawable.earth);
            ImageView fichetype2 = findViewById(R.id.fiche_type_logo2);
            fichetype2.setVisibility(View.VISIBLE);
            fichetype2.setImageResource(R.drawable.dark);


            TextView fichedescription = findViewById(R.id.fiche_description_text);
            fichedescription.setText(R.string.obsidiadesc);

            //change les imageview pour le monstre
            ImageView ficheevol0 = findViewById(R.id.fiche_evol0);
            ficheevol0.setImageResource(R.drawable.obsidiaegg);
            ImageView ficheevol1 = findViewById(R.id.fiche_evol1);
            ficheevol1.setImageResource(R.drawable.obsidiaone);
            ImageView ficheevol2 = findViewById(R.id.fiche_evol2);
            ficheevol2.setImageResource(R.drawable.obsidiatwo);
            ImageView ficheevol3 = findViewById(R.id.fiche_evol3);
            ficheevol3.setImageResource(R.drawable.obsidiathree);

        }

        //RAJOUTER LES VALEURS DES STATS

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

                    case "Tyrannoking":
                        ImageView ficheimageTyranno = findViewById(R.id.fiche_image_monster);
                        ficheimageTyranno.setImageResource(R.drawable.tyrannoegg);
                        break;

                    case "Metalsaur":
                        ImageView ficheimageMetalsaur = findViewById(R.id.fiche_image_monster);
                        ficheimageMetalsaur.setImageResource(R.drawable.metalsauregg);
                        break;

                    case "Genie":
                        ImageView ficheimageGenie = findViewById(R.id.fiche_image_monster);
                        ficheimageGenie.setImageResource(R.drawable.genieegg);
                        break;

                    case "Obsidia":
                        ImageView ficheimageObsidia = findViewById(R.id.fiche_image_monster);
                        ficheimageObsidia.setImageResource(R.drawable.obsidiaegg);
                        break;
                }

            }
        });


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

                    case "Tyrannoking":
                        ImageView ficheimageTyranno = findViewById(R.id.fiche_image_monster);
                        ficheimageTyranno.setImageResource(R.drawable.tyrannoone);
                        break;

                    case "Metalsaur":
                        ImageView ficheimageMetalsaur = findViewById(R.id.fiche_image_monster);
                        ficheimageMetalsaur.setImageResource(R.drawable.metalsaurone);
                        break;

                    case "Genie":
                        ImageView ficheimageGenie = findViewById(R.id.fiche_image_monster);
                        ficheimageGenie.setImageResource(R.drawable.genieone);
                        break;

                    case "Obsidia":
                        ImageView ficheimageObsidia = findViewById(R.id.fiche_image_monster);
                        ficheimageObsidia.setImageResource(R.drawable.obsidiaone);
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

                    case "Tyrannoking":
                        ImageView ficheimageTyranno = findViewById(R.id.fiche_image_monster);
                        ficheimageTyranno.setImageResource(R.drawable.tyrannotwo);
                        break;

                    case "Metalsaur":
                        ImageView ficheimageMetalsaur = findViewById(R.id.fiche_image_monster);
                        ficheimageMetalsaur.setImageResource(R.drawable.metalsaurtwo);
                        break;

                    case "Genie":
                        ImageView ficheimageGenie = findViewById(R.id.fiche_image_monster);
                        ficheimageGenie.setImageResource(R.drawable.genietwo);
                        break;

                    case "Obsidia":
                        ImageView ficheimageObsidia = findViewById(R.id.fiche_image_monster);
                        ficheimageObsidia.setImageResource(R.drawable.obsidiatwo);
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

                    case "Tyrannoking":
                        ImageView ficheimageTyranno = findViewById(R.id.fiche_image_monster);
                        ficheimageTyranno.setImageResource(R.drawable.tyrannothree);
                        break;

                    case "Metalsaur":
                        ImageView ficheimageMetalsaur = findViewById(R.id.fiche_image_monster);
                        ficheimageMetalsaur.setImageResource(R.drawable.metalsaurthree);
                        break;

                    case "Genie":
                        ImageView ficheimageGenie = findViewById(R.id.fiche_image_monster);
                        ficheimageGenie.setImageResource(R.drawable.geniethree);
                        break;

                    case "Obsidia":
                        ImageView ficheimageObsidia = findViewById(R.id.fiche_image_monster);
                        ficheimageObsidia.setImageResource(R.drawable.obsidiathree);
                        break;
                }

            }
        });

    }
}
