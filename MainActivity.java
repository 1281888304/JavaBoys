package capstone1.javaboys.sprint1menu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.simple_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.tea:
                Toast.makeText(this, "Tea leaf selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.fruitJam:
                Toast.makeText(this, "Fruit Jam selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.mangoJam:
                Toast.makeText(this, "Mango Jam selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.strawberryJam:
                Toast.makeText(this, "Mango Jam selected", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }
}