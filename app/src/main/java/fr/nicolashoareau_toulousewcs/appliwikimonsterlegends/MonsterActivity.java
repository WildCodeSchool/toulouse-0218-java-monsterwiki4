package fr.nicolashoareau_toulousewcs.appliwikimonsterlegends;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

public class MonsterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster);

        setTitle(getString(R.string.monster_card));

        final Intent intent = getIntent();
        final String monsterName = intent.getStringExtra("nameMonster");
        TextView tvMonsteName = findViewById(R.id.fiche_name);
        tvMonsteName.setText(monsterName);

        ImageView ivPower = findViewById(R.id.fiche_power_logo);
        ivPower.setImageResource(R.drawable.power);
        ImageView ivLife = findViewById(R.id.fiche_life_logo);
        ivLife.setImageResource(R.drawable.life);
        ImageView ivSpeed = findViewById(R.id.fiche_speed_logo);
        ivSpeed.setImageResource(R.drawable.speed);
        ImageView ivStamina = findViewById(R.id.fiche_stamina_logo);
        ivStamina.setImageResource(R.drawable.stamina);

        //On créer un élement tvBlink avec l'id du texte du titlebanniere
        final TextView tvDescription = (TextView) findViewById(R.id.fiche_description);
        //on paramètre l'animation
        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(1000); //c'est le paramètre qui permet de paramètrer la fréquence du clignot
        anim.setStartOffset(10);//temps qu'il reste invisible
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        tvDescription.startAnimation(anim);
        tvDescription.setTextColor(this.getResources().getColor(R.color.colorAccent));

        //ajout du texte de description des monstres et méthode on click listener
        final ImageView ivPandalf = findViewById(R.id.fiche_image_pandalf);
        final TextView tvPandalf = findViewById(R.id.fiche_description_text);
        ivPandalf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView fichedescription = findViewById(R.id.fiche_description_text);
                fichedescription.setVisibility(View.VISIBLE);
                //modifie la taille de l'image au Click
                int newHeightP = 150;
                int newWidthP = 150;
                ivPandalf.requestLayout();
                ivPandalf.getLayoutParams().height = newHeightP;
                ivPandalf.getLayoutParams().width = newWidthP;
                int newHeightT = 200;
                int newWidthT = 500;
                tvPandalf.requestLayout();
                tvPandalf.getLayoutParams().height = newHeightT;
                tvPandalf.getLayoutParams().width = newWidthT;
                tvDescription.clearAnimation();
                tvDescription.setText(R.string.titreDescription);
            }
        });

        initEvolutions(monsterName);
    }

    private void initEvolutions(final String monsterName) {
        TextView tvPower = findViewById(R.id.fiche_power_value);
        TextView tvLife = findViewById(R.id.fiche_life_value);
        TextView tvSpeed = findViewById(R.id.fiche_speed_value);
        TextView tvStamina = findViewById(R.id.fiche_stamina_value);

        if (monsterName.equals("Fire Lion")) {
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
            tvPower.setText(R.string.statPowerEvolFL0);
            tvLife.setText(R.string.statLifeEvolFL0);
            tvSpeed.setText(R.string.statSpeedEvolFL0);
            tvStamina.setText(R.string.statStamina);
            //ajout de la valeur du level:
            TextView fichestatslevelValue = findViewById(R.id.fiche_stats_levelvalue);
            fichestatslevelValue.setText(R.string.valuelevelFL0);
        }

        if (monsterName.equals("Rockilla")) {
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
            tvPower.setText(R.string.statPowerEvolRock0);
            tvLife.setText(R.string.statLifeEvolRock0);
            tvSpeed.setText(R.string.statSpeedEvolRock0);
            tvStamina.setText(R.string.statStamina);
            //ajout de la valeur du level:
            TextView fichestatslevelValue = findViewById(R.id.fiche_stats_levelvalue);
            fichestatslevelValue.setText(R.string.valuelevelRock0);
        }

        if (monsterName.equals("Turtle")) {
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
            tvPower.setText(R.string.statPowerEvolTurtle0);
            tvLife.setText(R.string.statLifeEvolTurtle0);
            tvSpeed.setText(R.string.statSpeedEvolTurtle0);
            tvStamina.setText(R.string.statStamina);
            //ajout de la valeur du level:
            TextView fichestatslevelValue = findViewById(R.id.fiche_stats_levelvalue);
            fichestatslevelValue.setText(R.string.valuelevelTurtle0);
        }

        if (monsterName.equals("Panda")) {
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
            tvPower.setText(R.string.statPowerEvolPanda0);
            tvLife.setText(R.string.statLifeEvolPanda0);
            tvSpeed.setText(R.string.statSpeedEvolPanda0);
            tvStamina.setText(R.string.statStamina);
            //ajout de la valeur du level:
            TextView fichestatslevelValue = findViewById(R.id.fiche_stats_levelvalue);
            fichestatslevelValue.setText(R.string.valuelevelPanda0);
        }

        if (monsterName.equals("Thunder Eagle")) {
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
            tvPower.setText(R.string.statPowerEvolTE0);
            tvLife.setText(R.string.statLifeEvolTE0);
            tvSpeed.setText(R.string.statSpeedEvolTE0);
            tvStamina.setText(R.string.statStamina);
            //ajout de la valeur du level:
            TextView fichestatslevelValue = findViewById(R.id.fiche_stats_levelvalue);
            fichestatslevelValue.setText(R.string.valuelevelTE0);
        }

        if (monsterName.equals("Light Spirit")) {
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
            tvPower.setText(R.string.statPowerEvolLS0);
            tvLife.setText(R.string.statLifeEvolLS0);
            tvSpeed.setText(R.string.statSpeedEvolLS0);
            tvStamina.setText(R.string.statStamina);
            //ajout de la valeur du level:
            TextView fichestatslevelValue = findViewById(R.id.fiche_stats_levelvalue);
            fichestatslevelValue.setText(R.string.valuelevelLS0);
        }

        if (monsterName.equals("Tyrannoking")) {
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
            tvPower.setText(R.string.statPowerEvolTK0);
            tvLife.setText(R.string.statLifeEvolTK0);
            tvSpeed.setText(R.string.statSpeedEvolTK0);
            tvStamina.setText(R.string.statStamina);
            //ajout de la valeur du level:
            TextView fichestatslevelValue = findViewById(R.id.fiche_stats_levelvalue);
            fichestatslevelValue.setText(R.string.valuelevelTK0);
        }

        if (monsterName.equals("Metalsaur")) {
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
            tvPower.setText(R.string.statPowerEvolMetal0);
            tvLife.setText(R.string.statLifeEvolMetal0);
            tvSpeed.setText(R.string.statSpeedEvolMetal0);
            tvStamina.setText(R.string.statStamina);
            //ajout de la valeur du level:
            TextView fichestatslevelValue = findViewById(R.id.fiche_stats_levelvalue);
            fichestatslevelValue.setText(R.string.valuelevelMetal0);
        }

        if (monsterName.equals("Genie")) {
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
            tvPower.setText(R.string.statPowerEvolGenie0);
            tvLife.setText(R.string.statLifeEvolGenie0);
            tvSpeed.setText(R.string.statSpeedEvolGenie0);
            tvStamina.setText(R.string.statStamina);
            //ajout de la valeur du level:
            TextView fichestatslevelValue = findViewById(R.id.fiche_stats_levelvalue);
            fichestatslevelValue.setText(R.string.valuelevelGenie0);
        }

        if (monsterName.equals("Obsidia")) {
            ImageView ficheimageMonster = findViewById(R.id.fiche_image_monster);
            ficheimageMonster.setImageResource(R.drawable.obsidiaegg);
            ImageView fichetype = findViewById(R.id.fiche_type_logo);
            fichetype.setImageResource(R.drawable.dark);
            ImageView fichetype2 = findViewById(R.id.fiche_type_logo2);
            fichetype2.setVisibility(View.VISIBLE);
            fichetype2.setImageResource(R.drawable.earth);

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
            tvPower.setText(R.string.statPowerEvolObsidia0);
            tvLife.setText(R.string.statLifeEvolObsidia0);
            tvSpeed.setText(R.string.statSpeedEvolObsidia0);
            tvStamina.setText(R.string.statStaminaObsidia);
            //ajout de la valeur du level:
            TextView fichestatslevelValue = findViewById(R.id.fiche_stats_levelvalue);
            fichestatslevelValue.setText(R.string.valuelevelObsidia0);
        }

        final ImageView imageViewEvol0 = findViewById(R.id.fiche_evol0);
        imageViewEvol0.setOnClickListener(new View.OnClickListener() {
            TextView fichePower = findViewById(R.id.fiche_power_value);
            TextView ficheLife = findViewById(R.id.fiche_life_value);
            TextView ficheSpeed = findViewById(R.id.fiche_speed_value);
            TextView ficheStamina = findViewById(R.id.fiche_stamina_value);

            @Override
            public void onClick(View view) {
                TextView fichestatslevelValue = findViewById(R.id.fiche_stats_levelvalue);
                switch (monsterName) {
                    case "Fire Lion":
                        ImageView ficheimageFL = findViewById(R.id.fiche_image_monster);
                        ficheimageFL.setImageResource(R.drawable.firelionegg);
                        //affectation des valeurs
                        fichePower.setText(R.string.statPowerEvolFL0);
                        ficheLife.setText(R.string.statLifeEvolFL0);
                        ficheSpeed.setText(R.string.statSpeedEvolFL0);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelFL0);
                        break;

                    case "Rockilla":
                        ImageView ficheimageRockilla = findViewById(R.id.fiche_image_monster);
                        ficheimageRockilla.setImageResource(R.drawable.rockillaegg);
                        fichePower.setText(R.string.statPowerEvolRock0);
                        ficheLife.setText(R.string.statLifeEvolRock0);
                        ficheSpeed.setText(R.string.statSpeedEvolRock0);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelRock0);
                        break;

                    case "Turtle":
                        ImageView ficheimageTurtle = findViewById(R.id.fiche_image_monster);
                        ficheimageTurtle.setImageResource(R.drawable.turtleegg);
                        fichePower.setText(R.string.statPowerEvolTurtle0);
                        ficheLife.setText(R.string.statLifeEvolTurtle0);
                        ficheSpeed.setText(R.string.statSpeedEvolTurtle0);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelTurtle0);
                        break;

                    case "Panda":
                        ImageView ficheimagePanda = findViewById(R.id.fiche_image_monster);
                        ficheimagePanda.setImageResource(R.drawable.pandaegg);
                        fichePower.setText(R.string.statPowerEvolPanda0);
                        ficheLife.setText(R.string.statLifeEvolPanda0);
                        ficheSpeed.setText(R.string.statSpeedEvolPanda0);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelPanda0);
                        break;

                    case "Thunder Eagle":
                        ImageView ficheimageTE = findViewById(R.id.fiche_image_monster);
                        ficheimageTE.setImageResource(R.drawable.thunderegg);
                        fichePower.setText(R.string.statPowerEvolTE0);
                        ficheLife.setText(R.string.statLifeEvolTE0);
                        ficheSpeed.setText(R.string.statSpeedEvolTE0);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelTE0);
                        break;

                    case "Light Spirit":
                        ImageView ficheimageLS = findViewById(R.id.fiche_image_monster);
                        ficheimageLS.setImageResource(R.drawable.lsegg);
                        fichePower.setText(R.string.statPowerEvolLS0);
                        ficheLife.setText(R.string.statLifeEvolLS0);
                        ficheSpeed.setText(R.string.statSpeedEvolLS0);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelLS0);
                        break;

                    case "Tyrannoking":
                        ImageView ficheimageTyranno = findViewById(R.id.fiche_image_monster);
                        ficheimageTyranno.setImageResource(R.drawable.tyrannoegg);
                        fichePower.setText(R.string.statPowerEvolTK0);
                        ficheLife.setText(R.string.statLifeEvolTK0);
                        ficheSpeed.setText(R.string.statSpeedEvolTK0);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelTK0);
                        break;

                    case "Metalsaur":
                        ImageView ficheimageMetalsaur = findViewById(R.id.fiche_image_monster);
                        ficheimageMetalsaur.setImageResource(R.drawable.metalsauregg);
                        fichePower.setText(R.string.statPowerEvolMetal0);
                        ficheLife.setText(R.string.statLifeEvolMetal0);
                        ficheSpeed.setText(R.string.statSpeedEvolMetal0);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelMetal0);
                        break;

                    case "Genie":
                        ImageView ficheimageGenie = findViewById(R.id.fiche_image_monster);
                        ficheimageGenie.setImageResource(R.drawable.genieegg);
                        fichePower.setText(R.string.statPowerEvolGenie0);
                        ficheLife.setText(R.string.statLifeEvolGenie0);
                        ficheSpeed.setText(R.string.statSpeedEvolGenie0);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelGenie0);
                        break;

                    case "Obsidia":
                        ImageView ficheimageObsidia = findViewById(R.id.fiche_image_monster);
                        ficheimageObsidia.setImageResource(R.drawable.obsidiaegg);
                        fichePower.setText(R.string.statPowerEvolObsidia0);
                        ficheLife.setText(R.string.statLifeEvolObsidia0);
                        ficheSpeed.setText(R.string.statSpeedEvolObsidia0);
                        ficheStamina.setText(R.string.statStaminaObsidia);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelObsidia0);
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
            TextView fichestatslevelValue = findViewById(R.id.fiche_stats_levelvalue);

            @Override
            public void onClick(View view) {
                switch (monsterName) {
                    case "Fire Lion":
                        ImageView ficheimageFL = findViewById(R.id.fiche_image_monster);
                        ficheimageFL.setImageResource(R.drawable.firelionone);
                        fichePower.setText(R.string.statPowerEvolFL1);
                        ficheLife.setText(R.string.statLifeEvolFL1);
                        ficheSpeed.setText(R.string.statSpeedEvolFL1);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelFL1);
                        break;

                    case "Rockilla":
                        ImageView ficheimageRockilla = findViewById(R.id.fiche_image_monster);
                        ficheimageRockilla.setImageResource(R.drawable.rockillaone);
                        fichePower.setText(R.string.statPowerEvolRock1);
                        ficheLife.setText(R.string.statLifeEvolRock1);
                        ficheSpeed.setText(R.string.statSpeedEvolRock1);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelRock1);
                        break;

                    case "Turtle":
                        ImageView ficheimageTurtle = findViewById(R.id.fiche_image_monster);
                        ficheimageTurtle.setImageResource(R.drawable.turtleone);
                        fichePower.setText(R.string.statPowerEvolTurtle1);
                        ficheLife.setText(R.string.statLifeEvolTurtle1);
                        ficheSpeed.setText(R.string.statSpeedEvolTurtle1);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelTurtle1);
                        break;

                    case "Panda":
                        ImageView ficheimagePanda = findViewById(R.id.fiche_image_monster);
                        ficheimagePanda.setImageResource(R.drawable.pandaone);
                        fichePower.setText(R.string.statPowerEvolPanda1);
                        ficheLife.setText(R.string.statLifeEvolPanda1);
                        ficheSpeed.setText(R.string.statSpeedEvolPanda1);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelPanda1);
                        break;

                    case "Thunder Eagle":
                        ImageView ficheimageTE = findViewById(R.id.fiche_image_monster);
                        ficheimageTE.setImageResource(R.drawable.thunderone);
                        fichePower.setText(R.string.statPowerEvolTE1);
                        ficheLife.setText(R.string.statLifeEvolTE1);
                        ficheSpeed.setText(R.string.statSpeedEvolTE1);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelTE1);
                        break;

                    case "Light Spirit":
                        ImageView ficheimageLS = findViewById(R.id.fiche_image_monster);
                        ficheimageLS.setImageResource(R.drawable.lsone);
                        fichePower.setText(R.string.statPowerEvolLS1);
                        ficheLife.setText(R.string.statLifeEvolLS1);
                        ficheSpeed.setText(R.string.statSpeedEvolLS1);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelLS1);
                        break;

                    case "Tyrannoking":
                        ImageView ficheimageTyranno = findViewById(R.id.fiche_image_monster);
                        ficheimageTyranno.setImageResource(R.drawable.tyrannoone);
                        fichePower.setText(R.string.statPowerEvolTK1);
                        ficheLife.setText(R.string.statLifeEvolTK1);
                        ficheSpeed.setText(R.string.statSpeedEvolTK1);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelTK1);
                        break;

                    case "Metalsaur":
                        ImageView ficheimageMetalsaur = findViewById(R.id.fiche_image_monster);
                        ficheimageMetalsaur.setImageResource(R.drawable.metalsaurone);
                        fichePower.setText(R.string.statPowerEvolMetal1);
                        ficheLife.setText(R.string.statLifeEvolMetal1);
                        ficheSpeed.setText(R.string.statSpeedEvolMetal1);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelMetal1);
                        break;

                    case "Genie":
                        ImageView ficheimageGenie = findViewById(R.id.fiche_image_monster);
                        ficheimageGenie.setImageResource(R.drawable.genieone);
                        fichePower.setText(R.string.statPowerEvolGenie1);
                        ficheLife.setText(R.string.statLifeEvolGenie1);
                        ficheSpeed.setText(R.string.statSpeedEvolGenie1);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelGenie1);
                        break;

                    case "Obsidia":
                        ImageView ficheimageObsidia = findViewById(R.id.fiche_image_monster);
                        ficheimageObsidia.setImageResource(R.drawable.obsidiaone);
                        fichePower.setText(R.string.statPowerEvolObsidia1);
                        ficheLife.setText(R.string.statLifeEvolObsidia1);
                        ficheSpeed.setText(R.string.statSpeedEvolObsidia1);
                        ficheStamina.setText(R.string.statStaminaObsidia);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelObsidia1);
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
            TextView fichestatslevelValue = findViewById(R.id.fiche_stats_levelvalue);

            @Override
            public void onClick(View view) {
                switch (monsterName) {
                    case "Fire Lion":
                        ImageView ficheimageFL = findViewById(R.id.fiche_image_monster);
                        ficheimageFL.setImageResource(R.drawable.fireliontwo);
                        fichePower.setText(R.string.statPowerEvolFL2);
                        ficheLife.setText(R.string.statLifeEvolFL2);
                        ficheSpeed.setText(R.string.statSpeedEvolFL2);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelFL2);
                        break;

                    case "Rockilla":
                        ImageView ficheimageRockilla = findViewById(R.id.fiche_image_monster);
                        ficheimageRockilla.setImageResource(R.drawable.rockillatwo);
                        fichePower.setText(R.string.statPowerEvolRock2);
                        ficheLife.setText(R.string.statLifeEvolRock2);
                        ficheSpeed.setText(R.string.statSpeedEvolRock2);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelRock2);
                        break;

                    case "Turtle":
                        ImageView ficheimageTurtle = findViewById(R.id.fiche_image_monster);
                        ficheimageTurtle.setImageResource(R.drawable.turtletwo);
                        fichePower.setText(R.string.statPowerEvolTurtle2);
                        ficheLife.setText(R.string.statLifeEvolTurtle2);
                        ficheSpeed.setText(R.string.statSpeedEvolTurtle2);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelTurtle2);
                        break;

                    case "Panda":
                        ImageView ficheimagePanda = findViewById(R.id.fiche_image_monster);
                        ficheimagePanda.setImageResource(R.drawable.pandatwo);
                        fichePower.setText(R.string.statPowerEvolPanda2);
                        ficheLife.setText(R.string.statLifeEvolPanda2);
                        ficheSpeed.setText(R.string.statSpeedEvolPanda2);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelPanda2);
                        break;

                    case "Thunder Eagle":
                        ImageView ficheimageTE = findViewById(R.id.fiche_image_monster);
                        ficheimageTE.setImageResource(R.drawable.thundertwo);
                        fichePower.setText(R.string.statPowerEvolTE2);
                        ficheLife.setText(R.string.statLifeEvolTE2);
                        ficheSpeed.setText(R.string.statSpeedEvolTE2);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelTE2);
                        break;

                    case "Light Spirit":
                        ImageView ficheimageLS = findViewById(R.id.fiche_image_monster);
                        ficheimageLS.setImageResource(R.drawable.lstwo);
                        fichePower.setText(R.string.statPowerEvolLS2);
                        ficheLife.setText(R.string.statLifeEvolLS2);
                        ficheSpeed.setText(R.string.statSpeedEvolLS2);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelLS2);
                        break;

                    case "Tyrannoking":
                        ImageView ficheimageTyranno = findViewById(R.id.fiche_image_monster);
                        ficheimageTyranno.setImageResource(R.drawable.tyrannotwo);
                        fichePower.setText(R.string.statPowerEvolTK2);
                        ficheLife.setText(R.string.statLifeEvolTK2);
                        ficheSpeed.setText(R.string.statSpeedEvolTK2);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelTK2);
                        break;

                    case "Metalsaur":
                        ImageView ficheimageMetalsaur = findViewById(R.id.fiche_image_monster);
                        ficheimageMetalsaur.setImageResource(R.drawable.metalsaurtwo);
                        fichePower.setText(R.string.statPowerEvolMetal2);
                        ficheLife.setText(R.string.statLifeEvolMetal2);
                        ficheSpeed.setText(R.string.statSpeedEvolMetal2);
                        ficheStamina.setText(R.string.statStaminaObsidia);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelMetal2);
                        break;

                    case "Genie":
                        ImageView ficheimageGenie = findViewById(R.id.fiche_image_monster);
                        ficheimageGenie.setImageResource(R.drawable.genietwo);
                        fichePower.setText(R.string.statPowerEvolGenie2);
                        ficheLife.setText(R.string.statLifeEvolGenie2);
                        ficheSpeed.setText(R.string.statSpeedEvolGenie2);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelGenie2);
                        break;

                    case "Obsidia":
                        ImageView ficheimageObsidia = findViewById(R.id.fiche_image_monster);
                        ficheimageObsidia.setImageResource(R.drawable.obsidiatwo);
                        fichePower.setText(R.string.statPowerEvolObsidia2);
                        ficheLife.setText(R.string.statLifeEvolObsidia2);
                        ficheSpeed.setText(R.string.statSpeedEvolObsidia2);
                        ficheStamina.setText(R.string.statStaminaObsidia);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelObsidia2);
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
            TextView fichestatslevelValue = findViewById(R.id.fiche_stats_levelvalue);

            @Override
            public void onClick(View view) {
                switch (monsterName) {
                    case "Fire Lion":
                        ImageView ficheimageFL = findViewById(R.id.fiche_image_monster);
                        ficheimageFL.setImageResource(R.drawable.firelionthree);
                        fichePower.setText(R.string.statPowerEvolFL3);
                        ficheLife.setText(R.string.statLifeEvolFL3);
                        ficheSpeed.setText(R.string.statSpeedEvolFL3);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelFL3);
                        break;

                    case "Rockilla":
                        ImageView ficheimageRockilla = findViewById(R.id.fiche_image_monster);
                        ficheimageRockilla.setImageResource(R.drawable.rockillathree);
                        fichePower.setText(R.string.statPowerEvolRock3);
                        ficheLife.setText(R.string.statLifeEvolRock3);
                        ficheSpeed.setText(R.string.statSpeedEvolRock3);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelRock3);
                        break;

                    case "Turtle":
                        ImageView ficheimageTurtle = findViewById(R.id.fiche_image_monster);
                        ficheimageTurtle.setImageResource(R.drawable.turtlethree);
                        fichePower.setText(R.string.statPowerEvolTurtle3);
                        ficheLife.setText(R.string.statLifeEvolTurtle3);
                        ficheSpeed.setText(R.string.statSpeedEvolTurtle3);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelTurtle3);
                        break;

                    case "Panda":
                        ImageView ficheimagePanda = findViewById(R.id.fiche_image_monster);
                        ficheimagePanda.setImageResource(R.drawable.pandathree);
                        fichePower.setText(R.string.statPowerEvolPanda3);
                        ficheLife.setText(R.string.statLifeEvolPanda3);
                        ficheSpeed.setText(R.string.statSpeedEvolPanda3);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelPanda3);
                        break;

                    case "Thunder Eagle":
                        ImageView ficheimageTE = findViewById(R.id.fiche_image_monster);
                        ficheimageTE.setImageResource(R.drawable.thunderthree);
                        fichePower.setText(R.string.statPowerEvolTE3);
                        ficheLife.setText(R.string.statLifeEvolTE3);
                        ficheSpeed.setText(R.string.statSpeedEvolTE3);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelTE3);
                        break;

                    case "Light Spirit":
                        ImageView ficheimageLS = findViewById(R.id.fiche_image_monster);
                        ficheimageLS.setImageResource(R.drawable.lsthree);
                        fichePower.setText(R.string.statPowerEvolLS3);
                        ficheLife.setText(R.string.statLifeEvolLS3);
                        ficheSpeed.setText(R.string.statSpeedEvolLS3);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelLS3);
                        break;

                    case "Tyrannoking":
                        ImageView ficheimageTyranno = findViewById(R.id.fiche_image_monster);
                        ficheimageTyranno.setImageResource(R.drawable.tyrannothree);
                        fichePower.setText(R.string.statPowerEvolTK3);
                        ficheLife.setText(R.string.statLifeEvolTK3);
                        ficheSpeed.setText(R.string.statSpeedEvolTK3);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelTK3);
                        break;

                    case "Metalsaur":
                        ImageView ficheimageMetalsaur = findViewById(R.id.fiche_image_monster);
                        ficheimageMetalsaur.setImageResource(R.drawable.metalsaurthree);
                        fichePower.setText(R.string.statPowerEvolMetal3);
                        ficheLife.setText(R.string.statLifeEvolMetal3);
                        ficheSpeed.setText(R.string.statSpeedEvolMetal3);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelMetal3);
                        break;

                    case "Genie":
                        ImageView ficheimageGenie = findViewById(R.id.fiche_image_monster);
                        ficheimageGenie.setImageResource(R.drawable.geniethree);
                        fichePower.setText(R.string.statPowerEvolGenie3);
                        ficheLife.setText(R.string.statLifeEvolGenie3);
                        ficheSpeed.setText(R.string.statSpeedEvolGenie3);
                        ficheStamina.setText(R.string.statStamina);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelGenie3);
                        break;

                    case "Obsidia":
                        ImageView ficheimageObsidia = findViewById(R.id.fiche_image_monster);
                        ficheimageObsidia.setImageResource(R.drawable.obsidiathree);
                        fichePower.setText(R.string.statPowerEvolObsidia3);
                        ficheLife.setText(R.string.statLifeEvolObsidia3);
                        ficheSpeed.setText(R.string.statSpeedEvolObsidia3);
                        ficheStamina.setText(R.string.statStaminaObsidia);
                        //ajout de la valeur du level:
                        fichestatslevelValue.setText(R.string.valuelevelObisida3);
                        break;
                }

            }
        });
    }
}
