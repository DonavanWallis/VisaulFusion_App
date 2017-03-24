package com.example.donavan.visaulfusion;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class WareHouseHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ware_house_home_layout);
    }

    public void ViewPick(View view) {
        Intent intent = new Intent(WareHouseHomeActivity.this, WarhousePickRequests.class );
        startActivity(intent);


    }

    public void PickRequests(View view) {
        Intent intent = new Intent(WareHouseHomeActivity.this, WarehouseViewAccepted.class );
        startActivity(intent);
    }

    public void UploadDocs(View view) {
        Intent intent = new Intent(WareHouseHomeActivity.this, WarehouseSelectDocuments.class );
        startActivity(intent);
    }

    //this is the main menu

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mainmenuwarehouse, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        int id = item.getItemId();

        if (id == R.id.homebutton) {

            Intent intent = new Intent(WareHouseHomeActivity.this, WareHouseHomeActivity.class);

            startActivity(intent);

            // return true;
        }


        if (id == R.id.openpickmenu) {

            Intent intent = new Intent(WareHouseHomeActivity.this, WarhousePickRequests.class);

            startActivity(intent);

            // return true;
        }

        if (id == R.id.viewrequestsmenu) {

            Intent intent = new Intent(WareHouseHomeActivity.this, WarehouseViewAccepted.class);

            startActivity(intent);

            // return true;
        }

        if (id == R.id.Uploaddocsmenu) {

            Intent intent = new Intent(WareHouseHomeActivity.this, WarehouseSelectDocuments.class);

            startActivity(intent);

            // return true;
        }

        if (id == R.id.downloadBtn) {
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(WareHouseHomeActivity.this, DownloadActivity.class);

            startActivity(intent);

        }

        if (id == R.id.searchbuttonnew) {

            final FragmentManager fm = getSupportFragmentManager();
            final PlayerFragments p = new PlayerFragments();
            p.show(fm, "Search");



        }


        if (id == R.id.logoutbutton) {
            // startActivity(new Intent(this,MainLogin.class));
        }

        return super.onOptionsItemSelected(item);
    }
}
