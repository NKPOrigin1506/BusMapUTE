package hcmute.edu.vn.busmapute_14new;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {

    EditText etFrom, etTo;
    Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // Set the title for the action bar:
        getSupportActionBar().setTitle("Search Location");

        // Set the back button for the action bar:
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        etFrom = findViewById(R.id.et_From);
        etTo = findViewById(R.id.et_To);
        search = findViewById(R.id.btnSearch);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get value from edit text
                String from = etFrom.getText().toString().trim();
                String to = etTo.getText().toString().trim();

                if (from.equals("") && to.equals("")) {
                    Toast.makeText(getApplicationContext(), "Enter both location", Toast.LENGTH_SHORT).show();
                } else {
                    DisplayTrack(from, to);
                }
            }
        });
    }

    private void DisplayTrack(String from, String to) {
        try {
            Uri uri = Uri.parse("https://www.google.com/maps/dir/" + from + "/" + to);
            // Initialize intent
            Intent i = new Intent(Intent.ACTION_VIEW, uri);
            i.setPackage("com.google.android.apps.maps");
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(i);
        } catch (ActivityNotFoundException e) {
            Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
            Intent i = new Intent(Intent.ACTION_VIEW, uri);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(i);
        }
    }

    // this event will enable the back function to the button on press:
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}