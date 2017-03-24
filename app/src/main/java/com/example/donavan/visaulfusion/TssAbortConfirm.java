package com.example.donavan.visaulfusion;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class TssAbortConfirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tss_abort_confirm_layout);
    }

    public void Yes(View view) {

        Intent intent = new Intent(TssAbortConfirm.this, TssHome.class );

        startActivity(intent);

        Toast.makeText(TssAbortConfirm.this,
                "Appointement Aborted", Toast.LENGTH_SHORT).show();
    }

    public void no(View view) {

        Intent intent = new Intent(TssAbortConfirm.this, TssHome.class );

        startActivity(intent);

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

            Intent intent = new Intent(TssAbortConfirm.this, TssHome.class );

            startActivity(intent);

            // return true;
        }

        if (id == R.id.downloadBtn){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(TssAbortConfirm.this, DownloadActivity.class );

            startActivity(intent);

        }

        if (id == R.id.openrequestsmenu){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(TssAbortConfirm.this, TssOpenRequests.class );

            startActivity(intent);

        }

        if (id == R.id.appoinmentsmenu){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(TssAbortConfirm.this, TssApoitmentsActivity.class );

            startActivity(intent);

        }

        if (id == R.id.abortmenu){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(TssAbortConfirm.this, TssAbortTrip.class );

            startActivity(intent);

        }

        if (id == R.id.unitary){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(TssAbortConfirm.this, TssSelectStoreActivity.class );

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
}
