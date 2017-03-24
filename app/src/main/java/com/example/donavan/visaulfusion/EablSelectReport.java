package com.example.donavan.visaulfusion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class EablSelectReport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eabl_select_report_layout);
    }

    public void viewReports(View view) {


        Intent intent = new Intent(EablSelectReport.this, EablReportViews.class );

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

            Intent intent = new Intent(EablSelectReport.this, RepHomeActivity.class );

            startActivity(intent);

            // return true;
        }


        if (id == R.id.eablbrand) {

            Intent intent = new Intent(EablSelectReport.this, EablSelectBrand.class );

            startActivity(intent);

            // return true;
        }

        if (id == R.id.eabloverall) {

            Intent intent = new Intent(EablSelectReport.this, EablSelectReport.class );

            startActivity(intent);

            // return true;
        }

        if (id == R.id.eablstore) {

            Intent intent = new Intent(EablSelectReport.this, EablSearch.class );

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
            Intent intent = new Intent(EablSelectReport.this, DownloadActivity.class );

            startActivity(intent);

        }

        if (id == R.id.logoutbutton){
            // startActivity(new Intent(this,MainLogin.class));
        }




        return super.onOptionsItemSelected(item);
    }
}
