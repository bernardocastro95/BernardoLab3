package bernardo.castro.s301073235;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

//Bernardo Silveira dos Santos Castro, 301073235, Section 02
public class MainActivity extends AppCompatActivity {

    BottomNavigationView bnv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bnv = findViewById(R.id.bernardoNavigation);
        setContentView(R.layout.activity_main);


    }
}