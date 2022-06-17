package hcmute.edu.vn.busmapute_14new;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.splashscreen.SplashScreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.Toast;

import java.util.Objects;

public class MenuActivity extends AppCompatActivity {

    boolean showContent = false;
    Button maps, about, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Start the splash screen before the MenuActivity
        SplashScreen splashScreen = SplashScreen.installSplashScreen(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Set the title for the action bar:
        Objects.requireNonNull(getSupportActionBar()).setTitle("Menu");

        // Disable Night mode:
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        maps = findViewById(R.id.btnMap);
        about = findViewById(R.id.btnAbout);
        exit = findViewById(R.id.btnExit);

        // Keep splash screen for longer time:
        final View content = findViewById(android.R.id.content);
        // Add pre draw listener to the view observer:
        content.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public boolean onPreDraw() {
                if (showContent) {
                    content.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                // a method to alter the showContent boolean
                dismissSplashScreen();
                return false;
            }
        });

        // click listener for 'Go to Map' button
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        // Click listener for 'About' button
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "A Mobile App Project created by Group 14\nNguyen Kha Phuong - 18110039\nPham Nguyen Hoang Duy - 18110008", Toast.LENGTH_LONG).show();
            }
        });

        // Click listener for 'Exit' button
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
    }

    // A method to handle the time delay for the splash screen:
    private void dismissSplashScreen() {
        // handler
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //change the showContent boolean
                showContent = true;
                handler.removeCallbacks(this);
            }
        }, 3000);
    }
}