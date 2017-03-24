package com.example.donavan.visaulfusion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class EablManagementHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eabl_home_layout);
    }

    public void BrandReport(View view) {

        Intent intent = new Intent(EablManagementHome.this, EablSelectBrand.class );

        startActivity(intent);

    }

    public void OveralReport(View view) {


        Intent intent = new Intent(EablManagementHome.this, EablSelectOverall.class );

        startActivity(intent);

    }

    public void SearchStores(View view) {

        Intent intent = new Intent(EablManagementHome.this, EablSearch.class );

        startActivity(intent);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mainmenueabl, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        int id = item.getItemId();

        if (id == R.id.homebutton) {

            Intent intent = new Intent(EablManagementHome.this, RepHomeActivity.class );

            startActivity(intent);

            // return true;
        }

        if (id == R.id.eablbrand) {

            Intent intent = new Intent(EablManagementHome.this, EablSelectBrand.class );

            startActivity(intent);

            // return true;
        }

        if (id == R.id.eabloverall) {

            Intent intent = new Intent(EablManagementHome.this, EablSelectReport.class );

            startActivity(intent);

            // return true;
        }

        if (id == R.id.eablstore) {

            Intent intent = new Intent(EablManagementHome.this, EablSearch.class );

            startActivity(intent);

            // return true;
        }





        if (id == R.id.searchbuttonnew) {

            final FragmentManager fm = getSupportFragmentManager();
            final PlayerFragments p = new PlayerFragments();
            p.show(fm, "Search");



        }

        if (id == R.id.downloadBtn){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(EablManagementHome.this, DownloadActivity.class );

            startActivity(intent);

        }

        if (id == R.id.logoutbutton){
            // startActivity(new Intent(this,MainLogin.class));
        }




        return super.onOptionsItemSelected(item);
    }

}
