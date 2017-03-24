package com.example.donavan.visaulfusion;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ManagmentSearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.managment_search_layout);
    }

    public void SearchStores(View view) {

        Intent intent = new Intent(ManagmentSearch.this, ManagmentStoreDetails.class );
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

            Intent intent = new Intent(ManagmentSearch.this, ManagementHome.class );

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
            Intent intent = new Intent(ManagmentSearch.this, ManagmentSelectBrand.class );

            startActivity(intent);

        }
        if (id == R.id.overallreportmenu){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(ManagmentSearch.this, ManagmentSelectOverall.class );

            startActivity(intent);

        }
        if (id == R.id.teammanagmentmenu){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(ManagmentSearch.this, ManagmentTeamManagment.class );

            startActivity(intent);

        }
        if (id == R.id.searchmanmenu){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(ManagmentSearch.this, ManagmentSearch.class );

            startActivity(intent);

        }

        if (id == R.id.downloadBtn){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(ManagmentSearch.this, DownloadActivity.class );

            startActivity(intent);

        }

        if (id == R.id.logoutbutton){
            // startActivity(new Intent(this,MainLogin.class));
        }




        return super.onOptionsItemSelected(item);
    }
}
