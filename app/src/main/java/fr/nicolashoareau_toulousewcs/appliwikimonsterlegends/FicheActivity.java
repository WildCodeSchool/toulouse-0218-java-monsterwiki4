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



        TextView fichePower = findViewById(R.id.fiche_power_value);
        TextView ficheLife = findViewById(R.id.fiche_life_value);
        TextView ficheSpeed = findViewById(R.id.fiche_speed_value);
        TextView ficheStamina = findViewById(R.id.fiche_stamina_value);



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


            //affectation des valeurs
            fichePower.setText(R.string.statPowerEvolFL0);
            ficheLife.setText(R.string.statLifeEvolFL0);
            ficheSpeed.setText(R.string.statSpeedEvolFL0);
            ficheStamina.setText(R.string.statStamina);


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




            //affectation des valeurs
            fichePower.setText(R.string.statPowerEvolRock0);
            ficheLife.setText(R.string.statLifeEvolRock0);
            ficheSpeed.setText(R.string.statSpeedEvolRock0);
            ficheStamina.setText(R.string.statStamina);

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


            //affectation des valeurs
            fichePower.setText(R.string.statPowerEvolTurtle0);
            ficheLife.setText(R.string.statLifeEvolTurtle0);
            ficheSpeed.setText(R.string.statSpeedEvolTurtle0);
            ficheStamina.setText(R.string.statStamina);



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


            //affectation des valeurs
            fichePower.setText(R.string.statPowerEvolPanda0);
            ficheLife.setText(R.string.statLifeEvolPanda0);
            ficheSpeed.setText(R.string.statSpeedEvolPanda0);
            ficheStamina.setText(R.string.statStamina);

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


            //affectation des valeurs
            fichePower.setText(R.string.statPowerEvolTE0);
            ficheLife.setText(R.string.statLifeEvolTE0);
            ficheSpeed.setText(R.string.statSpeedEvolTE0);
            ficheStamina.setText(R.string.statStamina);

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


            //affectation des valeurs
            fichePower.setText(R.string.statPowerEvolLS0);
            ficheLife.setText(R.string.statLifeEvolLS0);
            ficheSpeed.setText(R.string.statSpeedEvolLS0);
            ficheStamina.setText(R.string.statStamina);

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


            //affectation des valeurs
            fichePower.setText(R.string.statPowerEvolTK0);
            ficheLife.setText(R.string.statLifeEvolTK0);
            ficheSpeed.setText(R.string.statSpeedEvolTK0);
            ficheStamina.setText(R.string.statStamina);

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


            //affectation des valeurs
            fichePower.setText(R.string.statPowerEvolMetal0);
            ficheLife.setText(R.string.statLifeEvolMetal0);
            ficheSpeed.setText(R.string.statSpeedEvolMetal0);
            ficheStamina.setText(R.string.statStamina);

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


            //affectation des valeurs
            fichePower.setText(R.string.statPowerEvolGenie0);
            ficheLife.setText(R.string.statLifeEvolGenie0);
            ficheSpeed.setText(R.string.statSpeedEvolGenie0);
            ficheStamina.setText(R.string.statStamina);

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


            //affectation des valeurs
            fichePower.setText(R.string.statPowerEvolObsidia0);
            ficheLife.setText(R.string.statLifeEvolObsidia0);
            ficheSpeed.setText(R.string.statSpeedEvolObsidia0);
            ficheStamina.setText(R.string.statStaminaObsidia);

        }

        //RAJOUTER LES VALEURS DES STATS

        final ImageView imageViewEvol0 = findViewById(R.id.fiche_evol0);
        imageViewEvol0.setOnClickListener(new View.OnClickListener() {

            TextView fichePower = findViewById(R.id.fiche_power_value);
            TextView ficheLife = findViewById(R.id.fiche_life_value);
            TextView ficheSpeed = findViewById(R.id.fiche_speed_value);
            TextView ficheStamina = findViewById(R.id.fiche_stamina_value);

            @Override
            public void onClick(View view) {

                String nameMonster = recupname;
                switch(nameMonster) {
                    case "Fire Lion":
                        ImageView ficheimageFL = findViewById(R.id.fiche_image_monster);
                        ficheimageFL.setImageResource(R.drawable.firelionegg);

                        //affectation des valeurs
                        fichePower.setText(R.string.statPowerEvolFL0);
                        ficheLife.setText(R.string.statLifeEvolFL0);
                        ficheSpeed.setText(R.string.statSpeedEvolFL0);
                        ficheStamina.setText(R.string.statStamina);
                        break;

                    case "Rockilla":
                        ImageView ficheimageRockilla = findViewById(R.id.fiche_image_monster);
                        ficheimageRockilla.setImageResource(R.drawable.rockillaegg);

                        fichePower.setText(R.string.statPowerEvolRock0);
                        ficheLife.setText(R.string.statLifeEvolRock0);
                        ficheSpeed.setText(R.string.statSpeedEvolRock0);
                        ficheStamina.setText(R.string.statStamina);

                        break;

                    case "Turtle":
                        ImageView ficheimageTurtle = findViewById(R.id.fiche_image_monster);
                        ficheimageTurtle.setImageResource(R.drawable.turtleegg);

                        fichePower.setText(R.string.statPowerEvolTurtle0);
                        ficheLife.setText(R.string.statLifeEvolTurtle0);
                        ficheSpeed.setText(R.string.statSpeedEvolTurtle0);
                        ficheStamina.setText(R.string.statStamina);
                        break;

                    case "Panda":
                        ImageView ficheimagePanda = findViewById(R.id.fiche_image_monster);
                        ficheimagePanda.setImageResource(R.drawable.pandaegg);

                        fichePower.setText(R.string.statPowerEvolPanda0);
                        ficheLife.setText(R.string.statLifeEvolPanda0);
                        ficheSpeed.setText(R.string.statSpeedEvolPanda0);
                        ficheStamina.setText(R.string.statStamina);

                        break;

                    case "Thunder Eagle":
                        ImageView ficheimageTE= findViewById(R.id.fiche_image_monster);
                        ficheimageTE.setImageResource(R.drawable.thunderegg);

                        fichePower.setText(R.string.statPowerEvolTE0);
                        ficheLife.setText(R.string.statLifeEvolTE0);
                        ficheSpeed.setText(R.string.statSpeedEvolTE0);
                        ficheStamina.setText(R.string.statStamina);
                        break;

                    case "Light Spirit":
                        ImageView ficheimageLS = findViewById(R.id.fiche_image_monster);
                        ficheimageLS.setImageResource(R.drawable.lsegg);

                        fichePower.setText(R.string.statPowerEvolLS0);
                        ficheLife.setText(R.string.statLifeEvolLS0);
                        ficheSpeed.setText(R.string.statSpeedEvolLS0);
                        ficheStamina.setText(R.string.statStamina);
                        break;

                    case "Tyrannoking":
                        ImageView ficheimageTyranno = findViewById(R.id.fiche_image_monster);
                        ficheimageTyranno.setImageResource(R.drawable.tyrannoegg);

                        fichePower.setText(R.string.statPowerEvolTK0);
                        ficheLife.setText(R.string.statLifeEvolTK0);
                        ficheSpeed.setText(R.string.statSpeedEvolTK0);
                        ficheStamina.setText(R.string.statStamina);
                        break;

                    case "Metalsaur":
                        ImageView ficheimageMetalsaur = findViewById(R.id.fiche_image_monster);
                        ficheimageMetalsaur.setImageResource(R.drawable.metalsauregg);

                        fichePower.setText(R.string.statPowerEvolMetal0);
                        ficheLife.setText(R.string.statLifeEvolMetal0);
                        ficheSpeed.setText(R.string.statSpeedEvolMetal0);
                        ficheStamina.setText(R.string.statStamina);

                        break;

                    case "Genie":
                        ImageView ficheimageGenie = findViewById(R.id.fiche_image_monster);
                        ficheimageGenie.setImageResource(R.drawable.genieegg);

                        fichePower.setText(R.string.statPowerEvolGenie0);
                        ficheLife.setText(R.string.statLifeEvolGenie0);
                        ficheSpeed.setText(R.string.statSpeedEvolGenie0);
                        ficheStamina.setText(R.string.statStamina);
                        break;

                    case "Obsidia":
                        ImageView ficheimageObsidia = findViewById(R.id.fiche_image_monster);
                        ficheimageObsidia.setImageResource(R.drawable.obsidiaegg);

                        fichePower.setText(R.string.statPowerEvolObsidia0);
                        ficheLife.setText(R.string.statLifeEvolObsidia0);
                        ficheSpeed.setText(R.string.statSpeedEvolObsidia0);
                        ficheStamina.setText(R.string.statStaminaObsidia);
                        break;

                }

            }
        });


        final ImageView imageViewEvol1 = findViewById(R.id.fiche_evol1);
        imageViewEvol1.setOnClickListener(new View.OnClickListener() {

            TextView fichePower = findViewById(R.id.fiche_power_value);
            TextView ficheLife = findViewById(R.id.fiche_life_value);
            TextView ficheSpeed = findViewById(R.id.fiche_speed_value);
            TextView ficheStamina = findViewById(R.id.fiche_stamina_value);


            @Override
            public void onClick(View view) {

                String nameMonster = recupname;
                switch(nameMonster) {
                    case "Fire Lion":
                        ImageView ficheimageFL = findViewById(R.id.fiche_image_monster);
                        ficheimageFL.setImageResource(R.drawable.firelionone);

                        fichePower.setText(R.string.statPowerEvolFL1);
                        ficheLife.setText(R.string.statLifeEvolFL1);
                        ficheSpeed.setText(R.string.statSpeedEvolFL1);
                        ficheStamina.setText(R.string.statStamina);

                        break;

                    case "Rockilla":
                        ImageView ficheimageRockilla = findViewById(R.id.fiche_image_monster);
                        ficheimageRockilla.setImageResource(R.drawable.rockillaone);

                        fichePower.setText(R.string.statPowerEvolRock1);
                        ficheLife.setText(R.string.statLifeEvolRock1);
                        ficheSpeed.setText(R.string.statSpeedEvolRock1);
                        ficheStamina.setText(R.string.statStamina);
                        break;

                    case "Turtle":
                        ImageView ficheimageTurtle = findViewById(R.id.fiche_image_monster);
                        ficheimageTurtle.setImageResource(R.drawable.turtleone);

                        fichePower.setText(R.string.statPowerEvolTurtle1);
                        ficheLife.setText(R.string.statLifeEvolTurtle1);
                        ficheSpeed.setText(R.string.statSpeedEvolTurtle1);
                        ficheStamina.setText(R.string.statStamina);

                        break;

                    case "Panda":
                        ImageView ficheimagePanda = findViewById(R.id.fiche_image_monster);
                        ficheimagePanda.setImageResource(R.drawable.pandaone);

                        fichePower.setText(R.string.statPowerEvolPanda1);
                        ficheLife.setText(R.string.statLifeEvolPanda1);
                        ficheSpeed.setText(R.string.statSpeedEvolPanda1);
                        ficheStamina.setText(R.string.statStamina);
                        break;

                    case "Thunder Eagle":
                        ImageView ficheimageTE= findViewById(R.id.fiche_image_monster);
                        ficheimageTE.setImageResource(R.drawable.thunderone);

                        fichePower.setText(R.string.statPowerEvolTE1);
                        ficheLife.setText(R.string.statLifeEvolTE1);
                        ficheSpeed.setText(R.string.statSpeedEvolTE1);
                        ficheStamina.setText(R.string.statStamina);

                        break;

                    case "Light Spirit":
                        ImageView ficheimageLS = findViewById(R.id.fiche_image_monster);
                        ficheimageLS.setImageResource(R.drawable.lsone);

                        fichePower.setText(R.string.statPowerEvolLS1);
                        ficheLife.setText(R.string.statLifeEvolLS1);
                        ficheSpeed.setText(R.string.statSpeedEvolLS1);
                        ficheStamina.setText(R.string.statStamina);

                        break;

                    case "Tyrannoking":
                        ImageView ficheimageTyranno = findViewById(R.id.fiche_image_monster);
                        ficheimageTyranno.setImageResource(R.drawable.tyrannoone);

                        fichePower.setText(R.string.statPowerEvolTK1);
                        ficheLife.setText(R.string.statLifeEvolTK1);
                        ficheSpeed.setText(R.string.statSpeedEvolTK1);
                        ficheStamina.setText(R.string.statStamina);
                        break;

                    case "Metalsaur":
                        ImageView ficheimageMetalsaur = findViewById(R.id.fiche_image_monster);
                        ficheimageMetalsaur.setImageResource(R.drawable.metalsaurone);

                        fichePower.setText(R.string.statPowerEvolMetal1);
                        ficheLife.setText(R.string.statLifeEvolMetal1);
                        ficheSpeed.setText(R.string.statSpeedEvolMetal1);
                        ficheStamina.setText(R.string.statStamina);
                        break;

                    case "Genie":
                        ImageView ficheimageGenie = findViewById(R.id.fiche_image_monster);
                        ficheimageGenie.setImageResource(R.drawable.genieone);

                        fichePower.setText(R.string.statPowerEvolGenie1);
                        ficheLife.setText(R.string.statLifeEvolGenie1);
                        ficheSpeed.setText(R.string.statSpeedEvolGenie1);
                        ficheStamina.setText(R.string.statStamina);
                        break;

                    case "Obsidia":
                        ImageView ficheimageObsidia = findViewById(R.id.fiche_image_monster);
                        ficheimageObsidia.setImageResource(R.drawable.obsidiaone);

                        fichePower.setText(R.string.statPowerEvolObsidia1);
                        ficheLife.setText(R.string.statLifeEvolObsidia1);
                        ficheSpeed.setText(R.string.statSpeedEvolObsidia1);
                        ficheStamina.setText(R.string.statStaminaObsidia);
                        break;
                }

            }
        });


        final ImageView imageViewEvol2 = findViewById(R.id.fiche_evol2);
        imageViewEvol2.setOnClickListener(new View.OnClickListener() {

            TextView fichePower = findViewById(R.id.fiche_power_value);
            TextView ficheLife = findViewById(R.id.fiche_life_value);
            TextView ficheSpeed = findViewById(R.id.fiche_speed_value);
            TextView ficheStamina = findViewById(R.id.fiche_stamina_value);



            @Override
            public void onClick(View view) {

                String nameMonster = recupname;
                switch(nameMonster) {
                    case "Fire Lion":
                        ImageView ficheimageFL = findViewById(R.id.fiche_image_monster);
                        ficheimageFL.setImageResource(R.drawable.fireliontwo);

                        fichePower.setText(R.string.statPowerEvolFL2);
                        ficheLife.setText(R.string.statLifeEvolFL2);
                        ficheSpeed.setText(R.string.statSpeedEvolFL2);
                        ficheStamina.setText(R.string.statStamina);

                        break;

                    case "Rockilla":
                        ImageView ficheimageRockilla = findViewById(R.id.fiche_image_monster);
                        ficheimageRockilla.setImageResource(R.drawable.rockillatwo);

                        fichePower.setText(R.string.statPowerEvolRock2);
                        ficheLife.setText(R.string.statLifeEvolRock2);
                        ficheSpeed.setText(R.string.statSpeedEvolRock2);
                        ficheStamina.setText(R.string.statStamina);
                        break;

                    case "Turtle":
                        ImageView ficheimageTurtle = findViewById(R.id.fiche_image_monster);
                        ficheimageTurtle.setImageResource(R.drawable.turtletwo);

                        fichePower.setText(R.string.statPowerEvolTurtle2);
                        ficheLife.setText(R.string.statLifeEvolTurtle2);
                        ficheSpeed.setText(R.string.statSpeedEvolTurtle2);
                        ficheStamina.setText(R.string.statStamina);
                        break;

                    case "Panda":
                        ImageView ficheimagePanda = findViewById(R.id.fiche_image_monster);
                        ficheimagePanda.setImageResource(R.drawable.pandatwo);

                        fichePower.setText(R.string.statPowerEvolPanda2);
                        ficheLife.setText(R.string.statLifeEvolPanda2);
                        ficheSpeed.setText(R.string.statSpeedEvolPanda2);
                        ficheStamina.setText(R.string.statStamina);

                        break;

                    case "Thunder Eagle":
                        ImageView ficheimageTE= findViewById(R.id.fiche_image_monster);
                        ficheimageTE.setImageResource(R.drawable.thundertwo);

                        fichePower.setText(R.string.statPowerEvolTE2);
                        ficheLife.setText(R.string.statLifeEvolTE2);
                        ficheSpeed.setText(R.string.statSpeedEvolTE2);
                        ficheStamina.setText(R.string.statStamina);

                        break;

                    case "Light Spirit":
                        ImageView ficheimageLS = findViewById(R.id.fiche_image_monster);
                        ficheimageLS.setImageResource(R.drawable.lstwo);

                        fichePower.setText(R.string.statPowerEvolLS2);
                        ficheLife.setText(R.string.statLifeEvolLS2);
                        ficheSpeed.setText(R.string.statSpeedEvolLS2);
                        ficheStamina.setText(R.string.statStamina);
                        break;

                    case "Tyrannoking":
                        ImageView ficheimageTyranno = findViewById(R.id.fiche_image_monster);
                        ficheimageTyranno.setImageResource(R.drawable.tyrannotwo);

                        fichePower.setText(R.string.statPowerEvolTK2);
                        ficheLife.setText(R.string.statLifeEvolTK2);
                        ficheSpeed.setText(R.string.statSpeedEvolTK2);
                        ficheStamina.setText(R.string.statStamina);
                        break;

                    case "Metalsaur":
                        ImageView ficheimageMetalsaur = findViewById(R.id.fiche_image_monster);
                        ficheimageMetalsaur.setImageResource(R.drawable.metalsaurtwo);

                        fichePower.setText(R.string.statPowerEvolMetal2);
                        ficheLife.setText(R.string.statLifeEvolMetal2);
                        ficheSpeed.setText(R.string.statSpeedEvolMetal2);
                        ficheStamina.setText(R.string.statStaminaObsidia);
                        break;

                    case "Genie":
                        ImageView ficheimageGenie = findViewById(R.id.fiche_image_monster);
                        ficheimageGenie.setImageResource(R.drawable.genietwo);

                        fichePower.setText(R.string.statPowerEvolGenie2);
                        ficheLife.setText(R.string.statLifeEvolGenie2);
                        ficheSpeed.setText(R.string.statSpeedEvolGenie2);
                        ficheStamina.setText(R.string.statStamina);

                        break;

                    case "Obsidia":
                        ImageView ficheimageObsidia = findViewById(R.id.fiche_image_monster);
                        ficheimageObsidia.setImageResource(R.drawable.obsidiatwo);

                        fichePower.setText(R.string.statPowerEvolObsidia2);
                        ficheLife.setText(R.string.statLifeEvolObsidia2);
                        ficheSpeed.setText(R.string.statSpeedEvolObsidia2);
                        ficheStamina.setText(R.string.statStaminaObsidia);
                        break;
                }

            }
        });

        final ImageView imageViewEvol3 = findViewById(R.id.fiche_evol3);
        imageViewEvol3.setOnClickListener(new View.OnClickListener() {

            TextView fichePower = findViewById(R.id.fiche_power_value);
            TextView ficheLife = findViewById(R.id.fiche_life_value);
            TextView ficheSpeed = findViewById(R.id.fiche_speed_value);
            TextView ficheStamina = findViewById(R.id.fiche_stamina_value);

            @Override
            public void onClick(View view) {

                String nameMonster = recupname;
                switch(nameMonster) {
                    case "Fire Lion":
                        ImageView ficheimageFL = findViewById(R.id.fiche_image_monster);
                        ficheimageFL.setImageResource(R.drawable.firelionthree);

                        fichePower.setText(R.string.statPowerEvolFL3);
                        ficheLife.setText(R.string.statLifeEvolFL3);
                        ficheSpeed.setText(R.string.statSpeedEvolFL3);
                        ficheStamina.setText(R.string.statStamina);
                        break;

                    case "Rockilla":
                        ImageView ficheimageRockilla = findViewById(R.id.fiche_image_monster);
                        ficheimageRockilla.setImageResource(R.drawable.rockillathree);

                        fichePower.setText(R.string.statPowerEvolRock3);
                        ficheLife.setText(R.string.statLifeEvolRock3);
                        ficheSpeed.setText(R.string.statSpeedEvolRock3);
                        ficheStamina.setText(R.string.statStamina);
                        break;

                    case "Turtle":
                        ImageView ficheimageTurtle = findViewById(R.id.fiche_image_monster);
                        ficheimageTurtle.setImageResource(R.drawable.turtlethree);

                        fichePower.setText(R.string.statPowerEvolTurtle3);
                        ficheLife.setText(R.string.statLifeEvolTurtle3);
                        ficheSpeed.setText(R.string.statSpeedEvolTurtle3);
                        ficheStamina.setText(R.string.statStamina);
                        break;

                    case "Panda":
                        ImageView ficheimagePanda = findViewById(R.id.fiche_image_monster);
                        ficheimagePanda.setImageResource(R.drawable.pandathree);

                        fichePower.setText(R.string.statPowerEvolPanda3);
                        ficheLife.setText(R.string.statLifeEvolPanda3);
                        ficheSpeed.setText(R.string.statSpeedEvolPanda3);
                        ficheStamina.setText(R.string.statStamina);

                        break;

                    case "Thunder Eagle":
                        ImageView ficheimageTE= findViewById(R.id.fiche_image_monster);
                        ficheimageTE.setImageResource(R.drawable.thunderthree);

                        fichePower.setText(R.string.statPowerEvolTE3);
                        ficheLife.setText(R.string.statLifeEvolTE3);
                        ficheSpeed.setText(R.string.statSpeedEvolTE3);
                        ficheStamina.setText(R.string.statStamina);
                        break;

                    case "Light Spirit":
                        ImageView ficheimageLS = findViewById(R.id.fiche_image_monster);
                        ficheimageLS.setImageResource(R.drawable.lsthree);

                        fichePower.setText(R.string.statPowerEvolLS3);
                        ficheLife.setText(R.string.statLifeEvolLS3);
                        ficheSpeed.setText(R.string.statSpeedEvolLS3);
                        ficheStamina.setText(R.string.statStamina);
                        break;

                    case "Tyrannoking":
                        ImageView ficheimageTyranno = findViewById(R.id.fiche_image_monster);
                        ficheimageTyranno.setImageResource(R.drawable.tyrannothree);

                        fichePower.setText(R.string.statPowerEvolTK3);
                        ficheLife.setText(R.string.statLifeEvolTK3);
                        ficheSpeed.setText(R.string.statSpeedEvolTK3);
                        ficheStamina.setText(R.string.statStamina);

                        break;

                    case "Metalsaur":
                        ImageView ficheimageMetalsaur = findViewById(R.id.fiche_image_monster);
                        ficheimageMetalsaur.setImageResource(R.drawable.metalsaurthree);

                        fichePower.setText(R.string.statPowerEvolMetal3);
                        ficheLife.setText(R.string.statLifeEvolMetal3);
                        ficheSpeed.setText(R.string.statSpeedEvolMetal3);
                        ficheStamina.setText(R.string.statStamina);
                        break;

                    case "Genie":
                        ImageView ficheimageGenie = findViewById(R.id.fiche_image_monster);
                        ficheimageGenie.setImageResource(R.drawable.geniethree);

                        fichePower.setText(R.string.statPowerEvolGenie3);
                        ficheLife.setText(R.string.statLifeEvolGenie3);
                        ficheSpeed.setText(R.string.statSpeedEvolGenie3);
                        ficheStamina.setText(R.string.statStamina);
                        break;

                    case "Obsidia":
                        ImageView ficheimageObsidia = findViewById(R.id.fiche_image_monster);
                        ficheimageObsidia.setImageResource(R.drawable.obsidiathree);

                        fichePower.setText(R.string.statPowerEvolObsidia3);
                        ficheLife.setText(R.string.statLifeEvolObsidia3);
                        ficheSpeed.setText(R.string.statSpeedEvolObsidia3);
                        ficheStamina.setText(R.string.statStaminaObsidia);
                        break;
                }

            }
        });

    }
}
