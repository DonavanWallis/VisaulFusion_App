package com.example.donavan.visaulfusion;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;

/**
 * Created by Donavan on 2017/01/16.
 */

public class RepUploadActivity extends AppCompatActivity {



   // Activity for image uploads page for reps
    //style xml files are grid_row_uploads.xml



    GridView gridView;
    RepGridViewCustomAdapterUploads grisViewCustomeAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rep_upload_layout);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        gridView=(GridView)findViewById(R.id.gridViewCustom2);
        // Create the Custom Adapter Object
        grisViewCustomeAdapter = new RepGridViewCustomAdapterUploads(this);
        // Set the Adapter to GridView
        gridView.setAdapter(grisViewCustomeAdapter);




    }


    public void stockinput(View view) {

        Intent intent = new Intent(RepUploadActivity.this, RepItemsActivity.class );
        finish();
        startActivity(intent);
    }


    //this is the main menu

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mainmenurep, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.homebutton) {

            Intent intent = new Intent(RepUploadActivity.this, RepHomeActivity.class );

            startActivity(intent);

            // return true;
        }

        if (id == R.id.AddStoresmenu) {

            Intent intent = new Intent(RepUploadActivity.this, RepStoreDetailsActivity.class );

            startActivity(intent);

            // return trViewStoreue;
        }

        if (id == R.id.downloadBtn){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(RepUploadActivity.this, DownloadActivity.class );

            startActivity(intent);

        }

        if (id == R.id.searchbuttonnew) {

            final FragmentManager fm = getSupportFragmentManager();
            final PlayerFragments p = new PlayerFragments();
            p.show(fm, "Search");



        }

        if (id == R.id.ViewStore) {

            Intent intent = new Intent(RepUploadActivity.this, RepProgressActivity.class );

            startActivity(intent);

            // return true;
        }


        return super.onOptionsItemSelected(item);
    }


  

    public void Next(View view) {
        Intent intent = new Intent(RepUploadActivity.this, RepAgreementActivy.class );
        startActivity(intent);
    }
}












