package ordo.com.example.joseph.ordo;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GiveUp extends AppCompatActivity {
    public static Button button2_click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_up);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void showAlertDialog(View v){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("#GiveUp");
        alertDialog.setMessage("Confirm Subsidy GiveUp?");
        alertDialog.setIcon(R.drawable.ic_delete);
alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialog, int which) {
        Toast.makeText(getApplicationContext(),"Subsidy Giveup confirmed",Toast.LENGTH_SHORT).show();
    }
});
        alertDialog.setNegativeButton("No",new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"You have pressed NO",Toast.LENGTH_SHORT).show();
            }
        });
        alertDialog.show();
    }
}
