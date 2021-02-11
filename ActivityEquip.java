package capstone.project1.landpagex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityEquip extends AppCompatActivity {

    private ImageView logoEquip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equip);

        logoEquip = (ImageView)findViewById(R.id.logoequip);
        logoEquip.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                backToPage();
            }
        });

    }

    public void backToPage(){

        Intent clickBackIntent = new Intent(ActivityEquip.this, MainActivity.class);
        startActivity(clickBackIntent);

    }
}