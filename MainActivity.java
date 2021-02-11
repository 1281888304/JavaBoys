package capstone.project1.landpagex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton buttonLeaf;
    ImageButton buttonEquip;
    ImageButton buttonSyrup;
    ImageButton buttonCup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLeaf = (ImageButton) findViewById(R.id.imageButton4);
        buttonSyrup = (ImageButton) findViewById(R.id.imageButton5);
        buttonCup = (ImageButton) findViewById(R.id.imageButton6);
        buttonEquip = (ImageButton) findViewById(R.id.imageButton7);



        buttonLeaf.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

               openActivity4();


            }


        });
        buttonSyrup.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){



                openActivity5();

            }


        });

        buttonCup.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){



                openActivity6();

            }


        });

        buttonEquip.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){



                openActivity7();

            }


        });
    }

        public void openActivity4(){
            Intent clickLeafIntent = new Intent(MainActivity.this, ActivityLeaf.class);
            startActivity(clickLeafIntent);
        }


       public void openActivity5(){
        Intent clickSyrupIntent = new Intent(MainActivity.this, ActivitySyrup.class);
        startActivity( clickSyrupIntent);
       }

    public void openActivity6(){
        Intent clickCupIntent = new Intent(MainActivity.this, ActivityCup.class);
        startActivity(clickCupIntent);
    }


    public void openActivity7(){
        Intent clickEquipIntent = new Intent(MainActivity.this, ActivityEquip.class);
        startActivity(clickEquipIntent);
    }

}

