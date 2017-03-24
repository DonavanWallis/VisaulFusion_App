package com.example.donavan.visaulfusion;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class InstalSelectStoreUpload extends AppCompatActivity {

    GridView gridView;
    IntallGridSelectStoreupload grisViewCustomeAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instal_select_store_upload_layout);



        gridView=(GridView)findViewById(R.id.gridViewCustom3);
        // Create the Custom Adapter Object
        grisViewCustomeAdapter = new IntallGridSelectStoreupload(this);
        // Set the Adapter to GridView
        gridView.setAdapter(grisViewCustomeAdapter);



        //sets where list item is clicking too
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int pos, long id) {
                //Toast.makeText(getApplicationContext(), names[pos], Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(InstalSelectStoreUpload.this, InstallUnitaryList.class );
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
        getMenuInflater().inflate(R.menu.mainmenuinstall, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        int id = item.getItemId();

        if (id == R.id.homebutton) {

            Intent intent = new Intent(InstalSelectStoreUpload.this, InstilationHome.class );

            startActivity(intent);

            // return true;
        }

        if (id == R.id.searchbuttonnew) {

            final FragmentManager fm = getSupportFragmentManager();
            final PlayerFragments p = new PlayerFragments();
            p.show(fm, "Search");



        }

        if (id == R.id.openrequestsmenu){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(InstalSelectStoreUpload.this, InstallRequest.class );

            startActivity(intent);

        }

        if (id == R.id.appoinmentsmenu){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(InstalSelectStoreUpload.this, InstallApointments.class );

            startActivity(intent);

        }

        if (id == R.id.abortmenu){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(InstalSelectStoreUpload.this, InstallAbortTrip.class );

            startActivity(intent);

        }

        if (id == R.id.unitary){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(InstalSelectStoreUpload.this, InstalSelectStoreUpload.class );

            startActivity(intent);

        }

        if (id == R.id.downloadBtn){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(InstalSelectStoreUpload.this, DownloadActivity.class );

            startActivity(intent);

        }

        if (id == R.id.logoutbutton){
            // startActivity(new Intent(this,MainLogin.class));
        }

        return super.onOptionsItemSelected(item);
    }
}

