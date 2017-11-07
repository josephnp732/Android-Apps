package ordo.com.example.joseph.ordo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Tell_Us extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tell__us);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button btn = (Button) findViewById(R.id.button4);
        Button callBtn = (Button) findViewById(R.id.button5);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"ordoteam@gmail.com"});
                emailIntent.putExtra(Intent.EXTRA_CC, new String[]{"ancj14is@cmrit.ac.in"});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT,"Subject");
                emailIntent.putExtra(Intent.EXTRA_TEXT,"body");

                emailIntent.setType("message/rfc822");
                startActivity(Intent.createChooser(emailIntent,"Choose email client..."));

            }
        });
                callBtn.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                       Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:+917411009743"));
                        startActivity(callIntent);
                    }
                });
    }
}
