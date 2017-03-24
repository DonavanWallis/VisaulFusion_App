package com.example.donavan.visaulfusion;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;


public class TssUnitaryList extends AppCompatActivity
{


    GridView gridView;
    TssGridViewUnitary grisViewCustomeAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tss_unitary_list_layout);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        gridView=(GridView)findViewById(R.id.gridViewCustom);
        // Create the Custom Adapter Object
        grisViewCustomeAdapter = new TssGridViewUnitary(this);
        // Set the Adapter to GridView
        gridView.setAdapter(grisViewCustomeAdapter);




    }

    public void continuebtn(View view) {

        Intent intent = new Intent(TssUnitaryList.this, TssUploadActivity.class );
        finish();
        startActivity(intent);
    }


    //this is the main menu

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

            Intent intent = new Intent(TssUnitaryList.this, TssHome.class );

            startActivity(intent);

            // return true;
        }

        if (id == R.id.downloadBtn){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(TssUnitaryList.this, DownloadActivity.class );

            startActivity(intent);

        }

        if (id == R.id.searchbuttonnew) {

            final FragmentManager fm = getSupportFragmentManager();
            final PlayerFragments p = new PlayerFragments();
            p.show(fm, "Search");



        }

        if (id == R.id.openrequestsmenu){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(TssUnitaryList.this, TssOpenRequests.class );

            startActivity(intent);

        }

        if (id == R.id.appoinmentsmenu){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(TssUnitaryList.this, TssApoitmentsActivity.class );

            startActivity(intent);

        }

        if (id == R.id.abortmenu){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(TssUnitaryList.this, TssAbortTrip.class );

            startActivity(intent);

        }

        if (id == R.id.unitary){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(TssUnitaryList.this, TssSelectStoreActivity.class );

            startActivity(intent);

        }

        if (id == R.id.logoutbutton){
            // startActivity(new Intent(this,MainLogin.class));
        }

        return super.onOptionsItemSelected(item);
    }




}