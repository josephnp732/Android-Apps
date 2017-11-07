package ordo.com.example.joseph.ordo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar bar = getSupportActionBar();
        bar.setTitle("Ordo");
        ImageView bgview = (ImageView) findViewById(R.id.bg); // declaring of Image Button

        bgview.setOnClickListener(new View.OnClickListener() {

            //Do something when user clicks our image
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EnteringDetails.class);
                startActivity(intent);
            }
        });

        ImageView hpgview = (ImageView) findViewById(R.id.hpg); // declaring of Image Button

        hpgview.setOnClickListener(new View.OnClickListener() {

            //Do something when user clicks our image
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EnteringDetails.class);
                startActivity(intent);
            }
        });



        ImageView igview = (ImageView) findViewById(R.id.ig); // declaring of Image Button

        igview.setOnClickListener(new View.OnClickListener() {

            //Do something when user clicks our image
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EnteringDetails.class);
                startActivity(intent);
            }
        });


        ImageView shaktiview = (ImageView) findViewById(R.id.shakti); // declaring of Image Button

        shaktiview.setOnClickListener(new View.OnClickListener() {

            //Do something when user clicks our image
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EnteringDetails.class);
                startActivity(intent);
            }
        });

        ImageView sgview = (ImageView) findViewById(R.id.sg); // declaring of Image Button

        sgview.setOnClickListener(new View.OnClickListener() {

            //Do something when user clicks our image
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EnteringDetails.class);
                startActivity(intent);
            }
        });
    }
}
