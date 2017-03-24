package com.example.donavan.visaulfusion;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ManagementHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.management_home_layout);
    }

    public void BrandReport(View view) {

        Intent intent = new Intent(ManagementHome.this, ManagmentSelectBrand.class );

        startActivity(intent);

    }

    public void OveralReport(View view) {


        Intent intent = new Intent(ManagementHome.this, ManagmentSelectOverall.class );

        startActivity(intent);

    }

    public void SearchStores(View view) {

        Intent intent = new Intent(ManagementHome.this, ManagmentSearch.class );

        startActivity(intent);
    }

    public void TeamManagment(View view) {
        Intent intent = new Intent(ManagementHome.this, ManagmentTeamManagment.class );

        startActivity(intent);
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mainmenumangment, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        int id = item.getItemId();

        if (id == R.id.homebutton) {

            Intent intent = new Intent(ManagementHome.this, ManagementHome.class );

            startActivity(intent);

            // return true;
        }




        if (id == R.id.searchbuttonnew) {

            final FragmentManager fm = getSupportFragmentManager();
            final PlayerFragments p = new PlayerFragments();
            p.show(fm, "Search");



        }
        if (id == R.id.brandreportmenu){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(ManagementHome.this, ManagmentSelectBrand.class );

            startActivity(intent);

        }
        if (id == R.id.overallreportmenu){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(ManagementHome.this, ManagmentSelectOverall.class );

            startActivity(intent);

        }
        if (id == R.id.teammanagmentmenu){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(ManagementHome.this, ManagmentTeamManagment.class );

            startActivity(intent);

        }
        if (id == R.id.searchmanmenu){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(ManagementHome.this, ManagmentSearch.class );

            startActivity(intent);

        }

        if (id == R.id.downloadBtn){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(ManagementHome.this, DownloadActivity.class );

            startActivity(intent);

        }

        if (id == R.id.logoutbutton){
            // startActivity(new Intent(this,MainLogin.class));
        }




        return super.onOptionsItemSelected(item);
    }


}
