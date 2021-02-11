package capstone.project1.landpagex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivitySyrup extends AppCompatActivity {

    private ImageView logoSyrup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syrup);

        logoSyrup = (ImageView)findViewById(R.id.logosyrup);
        logoSyrup.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View view){
                backToPage();

            }

        });
    }
    public void backToPage(){

        Intent clickBackIntent = new Intent(ActivitySyrup.this, MainActivity.class);
        startActivity(clickBackIntent);

    }
}