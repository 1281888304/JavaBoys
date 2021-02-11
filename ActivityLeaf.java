package capstone.project1.landpagex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLeaf extends AppCompatActivity {

    private ImageView logoLeaf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaf);

        logoLeaf = (ImageView)findViewById(R.id.logoleaf);
        logoLeaf.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                backToPage();
            }
        });

    }

    public void backToPage(){

        Intent clickBackIntent = new Intent(ActivityLeaf.this, MainActivity.class);
        startActivity(clickBackIntent);

    }
}