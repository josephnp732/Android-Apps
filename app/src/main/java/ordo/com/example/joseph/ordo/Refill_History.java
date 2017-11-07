package ordo.com.example.joseph.ordo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Refill_History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refill__history);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Please contact us for corrections. ", Snackbar.LENGTH_LONG)
                        .setAction("CONTACT US", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intentLoadNewActivity = new Intent(Refill_History.this,Tell_Us.class );
                                startActivity(intentLoadNewActivity);
                            }
                        }).show();
            }
        });
    }
}
