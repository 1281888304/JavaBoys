package capstone.project1.landpagex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityCup extends AppCompatActivity {

      private ImageView logoCup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cup);

        logoCup = (ImageView)findViewById(R.id.logocup);
        logoCup.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View view){
                backToPage();

            }

        });
    }
    public void backToPage(){

        Intent clickBackIntent = new Intent(ActivityCup.this, MainActivity.class);
        startActivity(clickBackIntent);

    }
}