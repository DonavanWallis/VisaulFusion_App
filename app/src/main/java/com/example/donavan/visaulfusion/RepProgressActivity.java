package com.example.donavan.visaulfusion;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class RepProgressActivity extends AppCompatActivity
{


    GridView gridView;
    RepGridViewCustomProgress grisViewCustomeAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rep_progress_layout);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        gridView=(GridView)findViewById(R.id.gridViewCustom3);
        // Create the Custom Adapter Object
        grisViewCustomeAdapter = new RepGridViewCustomProgress(this);
        // Set the Adapter to GridView
        gridView.setAdapter(grisViewCustomeAdapter);



        //sets where list item is clicking too
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int pos, long id) {
                //Toast.makeText(getApplicationContext(), names[pos], Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(RepProgressActivity.this, RepInfoActivity.class );
                //Sending data to another Activity
                //intent.putExtra("xname", names[pos].toString());
                //intent.putExtra("xpos", pos);



                startActivity(intent);
            }

        } );

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

            Intent intent = new Intent(RepProgressActivity.this, RepHomeActivity.class );

            startActivity(intent);

            // return true;
        }

        if (id == R.id.AddStoresmenu) {

            Intent intent = new Intent(RepProgressActivity.this, RepStoreDetailsActivity.class );

            startActivity(intent);

            // return trViewStoreue;
        }

        if (id == R.id.downloadBtn){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(RepProgressActivity.this, DownloadActivity.class );

            startActivity(intent);

        }

        if (id == R.id.searchbuttonnew) {

            final FragmentManager fm = getSupportFragmentManager();
            final PlayerFragments p = new PlayerFragments();
            p.show(fm, "Search");



        }

        if (id == R.id.ViewStore) {

            Intent intent = new Intent(RepProgressActivity.this, RepProgressActivity.class );

            startActivity(intent);

            // return true;
        }


        if (id == R.id.logoutbutton){
            // startActivity(new Intent(this,MainLogin.class));
        }

        return super.onOptionsItemSelected(item);
    }




}