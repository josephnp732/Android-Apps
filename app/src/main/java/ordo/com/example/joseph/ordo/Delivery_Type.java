package ordo.com.example.joseph.ordo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Delivery_Type extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery__type);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton mainButton = (ImageButton) findViewById(R.id.imageButton10);
        ImageButton mainButton2 = (ImageButton) findViewById(R.id.imageButton11);
        ImageButton mainButton3 = (ImageButton) findViewById(R.id.imageButton12);

        mainButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Delivery_Type.this,Confirmation.class);
                startActivity(intent);

            }
        });

        mainButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Delivery_Type.this,Confirmation2.class);
                startActivity(intent1);

            }
        });

        mainButton3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Delivery_Type.this,Confirmation3.class);
                startActivity(intent2);

            }
        });

    }
}
