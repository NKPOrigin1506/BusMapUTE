package hcmute.edu.vn.busmapute_14new;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView navView;
    MapFragment mapFragment = new MapFragment();
    AboutFragment aboutFragment = new AboutFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        navView = findViewById(R.id.bottomNavView);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, mapFragment).commit();

        navView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.map:
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, mapFragment).commit();
                    break;

                case R.id.about:
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, aboutFragment).commit();
                    break;
            }
            return true;
        });
    }
}