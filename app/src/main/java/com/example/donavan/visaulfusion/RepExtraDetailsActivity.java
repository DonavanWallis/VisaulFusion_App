package com.example.donavan.visaulfusion;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Donavan on 2017/01/16.
 */

public class RepExtraDetailsActivity extends AppCompatActivity {

    private Spinner  spinner2;
    private Spinner  spinner1;
    private Spinner  spinner3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rep_extradetails_layout);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        addItemsOnSpinner2();
        addItemsOnSpinner1();
        addItemsOnSpinner3();



    }


    // add items into spinner
    public void addItemsOnSpinner2() {

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        List<String> list = new ArrayList<String>();
        list.add(0, "Choose Brand");
        list.add("Brand 1");
        list.add("Brand 2");
        list.add("Brand 3");
        list.add("Brand 4");

        spinner2.setPrompt("Choose Brand");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
               R.layout.spinnerstyle, list);
        dataAdapter.setDropDownViewResource(R.layout.spinnerstyledrop);
        spinner2.setAdapter(dataAdapter);
    }

    // add items into spinner
    public void addItemsOnSpinner1() {

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        List<String> list = new ArrayList<String>();
        list.add(0, "Outlet Type");
        list.add("Outlet Type 1");
        list.add("Outlet Type 2");
        list.add("Outlet Type 3");
        list.add("Outlet Type 4");
        list.add("Outlet Type 5");
        list.add("Outlet Type 6");
        list.add("Outlet Type 7");
        spinner1.setPrompt("Outlet Type");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                R.layout.spinnerstyle, list);
        dataAdapter.setDropDownViewResource(R.layout.spinnerstyledrop);
        spinner1.setAdapter(dataAdapter);
    }

    // add items into spinner
    public void addItemsOnSpinner3() {

        spinner3 = (Spinner) findViewById(R.id.spinner3);
        List<String> list = new ArrayList<String>();
        list.add(0, "Tier Type");
        list.add(1, "Tier Type 1");
        list.add(2, "Tier Type 2");
        list.add(3, "Tier Type 3");
        list.add(4, "Tier Type 4");

        spinner3.setPrompt("Tier Type");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                R.layout.spinnerstyle, list);
        dataAdapter.setDropDownViewResource(R.layout.spinnerstyledrop);
        spinner3.setAdapter(dataAdapter);







    }


    // add items into spinner



    public void stockinput(View view) {

        Intent intent = new Intent(RepExtraDetailsActivity.this, RepUploadActivity.class );

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

        if (id == R.id.homebutton) {

            Intent intent = new Intent(RepExtraDetailsActivity.this, RepHomeActivity.class );

            startActivity(intent);

            // return true;
        }

        if (id == R.id.downloadBtn){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(RepExtraDetailsActivity.this, DownloadActivity.class );

            startActivity(intent);

        }

        if (id == R.id.ViewStore) {

            Intent intent = new Intent(RepExtraDetailsActivity.this, RepProgressActivity.class );

            startActivity(intent);

            // return true;
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












