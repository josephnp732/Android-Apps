package ordo.com.example.joseph.ordo;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.api.GoogleApiClient;


public class EnteringDetails extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entering_details);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        /** Called when the user clicks the Send button */
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new Button.OnClickListener() {

            //Do something when user clicks our image
            public void onClick(View v) {
                CountDownTimer countDownTimer = new CountDownTimer(3000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        ProgressDialog progressDialog = new ProgressDialog(EnteringDetails.this);
                        progressDialog.setTitle("Verifying Details");
                        progressDialog.setMessage("Please Wait...");
                        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                        progressDialog.show();
                    }


                    public void onFinish() {
                        Intent intent = new Intent(getApplicationContext(), DetailsVerified.class);
                        startActivity(intent);
                        finish();
                        //YourActivity.finish();  outside the actvitiy
                    }
                }.start();
            }
        });


    }
}



