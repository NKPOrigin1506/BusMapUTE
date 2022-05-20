package hcmute.edu.vn.busmapute_14new;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;

import com.google.android.gms.maps.MapFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView navView;
    HomeFragment homeFragment = new HomeFragment();
    SearchFragment searchFragment = new SearchFragment();
    AboutFragment aboutFragment = new AboutFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        navView = findViewById(R.id.bottomNavView);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, homeFragment).commit();

        navView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, homeFragment).commit();
                    break;

                case R.id.search:
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, searchFragment).commit();
                    break;

                case R.id.about:
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, aboutFragment).commit();
                    break;
            }
            return true;
        });
    }
}