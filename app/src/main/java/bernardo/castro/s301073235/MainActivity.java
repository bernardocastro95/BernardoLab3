package bernardo.castro.s301073235;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

//Bernardo Silveira dos Santos Castro, 301073235, Section 02
public class MainActivity extends AppCompatActivity {

    BottomNavigationView bnv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnv = findViewById(R.id.bernardoNavigation);
        bnv.setOnNavigationItemSelectedListener(navListener);
        
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()){
                        case R.id.bernardoDraw:
                            return true;
                        case R.id.bernardoAnimation:
                            return true;
                        case R.id.bernardoTweeney:
                            return true;
                        default:
                            return false;
                    }
                }
            };

}
