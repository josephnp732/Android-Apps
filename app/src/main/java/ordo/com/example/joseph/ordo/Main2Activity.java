package ordo.com.example.joseph.ordo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class Main2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton mainButton = (ImageButton) findViewById(R.id.imageButton);
        ImageButton mainButton2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton mainButton3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton mainButton4 = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton mainButton5 = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton mainButton6 = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton mainButton7 = (ImageButton) findViewById(R.id.imageButton7);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Order gas Instantly", Snackbar.LENGTH_LONG)
                        .setAction("PRIME", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intentLoadNewActivity = new Intent(Main2Activity.this,Confirmation.class );
                                startActivity(intentLoadNewActivity);
                            }
                        }).show();
            }
        });

        mainButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Delivery_Type.class);
                startActivity(intent);

            }
        });

        mainButton3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Refill_History.class);
                startActivity(intent);

            }
        });

        mainButton4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, RatingYourDistributer.class);
                startActivity(intent);

            }
        });

        mainButton5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, GiveUp.class);
                startActivity(intent);

            }
        });

        mainButton6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Contact_Us.class);
                startActivity(intent);

            }
        });

        mainButton7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Tell_Us.class);
                startActivity(intent);

            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(Main2Activity.this, Settings.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_Book) {
            Intent intent = new Intent(Main2Activity.this, Delivery_Type.class);
            startActivity(intent);
            // Handle the camera action
        } else if (id == R.id.nav_Nearby) {

        } else if (id == R.id.nav_Refill) {
            Intent intent = new Intent(Main2Activity.this, Refill_History.class);
            startActivity(intent);

        } else if (id == R.id.nav_Rate) {
            Intent intent = new Intent(Main2Activity.this, RatingYourDistributer.class);
            startActivity(intent);

        } else if (id == R.id.nav_Give) {
            Intent intent = new Intent(Main2Activity.this, GiveUp.class);
            startActivity(intent);

        } else if (id == R.id.nav_Conatact) {
            Intent intent = new Intent(Main2Activity.this, Contact_Us.class);
            startActivity(intent);

        } else if (id == R.id.nav_Tell) {
            Intent intent = new Intent(Main2Activity.this, Tell_Us.class);
            startActivity(intent);
        } else if (id == R.id.nav_share) {
            Intent intent = new Intent(Main2Activity.this, Share.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main2 Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
