package com.example.donavan.visaulfusion;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class TssHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tss_home_layout);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mainmenutss, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        int id = item.getItemId();

        if (id == R.id.homebutton) {

            Intent intent = new Intent(TssHome.this, TssHome.class );

            startActivity(intent);

            // return true;
        }

        if (id == R.id.openrequestsmenu){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(TssHome.this, TssOpenRequests.class );

            startActivity(intent);

        }

        if (id == R.id.appoinmentsmenu){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(TssHome.this, TssApoitmentsActivity.class );

            startActivity(intent);

        }

        if (id == R.id.abortmenu){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(TssHome.this, TssAbortTrip.class );

            startActivity(intent);

        }

        if (id == R.id.unitary){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(TssHome.this, TssSelectStoreActivity.class );

            startActivity(intent);

        }


        if (id == R.id.downloadBtn){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(TssHome.this, DownloadActivity.class );

            startActivity(intent);

        }

        if (id == R.id.searchbuttonnew) {

            final FragmentManager fm = getSupportFragmentManager();
            final PlayerFragments p = new PlayerFragments();
            p.show(fm, "Search");



        }

        if (id == R.id.logoutbutton){
            // startActivity(new Intent(this,MainLogin.class));
        }

        return super.onOptionsItemSelected(item);
    }


    public void requests(View view) {

        Intent intent = new Intent(TssHome.this, TssOpenRequests.class );
        startActivity(intent);
    }

    public void appointments(View view) {

        Intent intent = new Intent(TssHome.this, TssApoitmentsActivity.class );
        startActivity(intent);
    }

    public void Upload(View view) {

        Intent intent = new Intent(TssHome.this, TssSelectStoreActivity.class );
        startActivity(intent);
    }


    public void Abort(View view) {

        Intent intent = new Intent(TssHome.this, TssAbortTrip.class );
        startActivity(intent);
    }
}
