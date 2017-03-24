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

public class InstallUploadActivity extends AppCompatActivity {


    // Activity for image uploads page for reps
    //style xml files are grid_row_uploads.xml



    GridView gridView;
    InstallGridUploads grisViewCustomeAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.install_upload_layout);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        gridView=(GridView)findViewById(R.id.gridViewCustom2);
        // Create the Custom Adapter Object
        grisViewCustomeAdapter = new InstallGridUploads(this);
        // Set the Adapter to GridView
        gridView.setAdapter(grisViewCustomeAdapter);




    }


    public void stockinput(View view) {

        Intent intent = new Intent(InstallUploadActivity.this, RepItemsActivity.class );
        finish();
        startActivity(intent);
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

            Intent intent = new Intent(InstallUploadActivity.this, InstilationHome.class );

            startActivity(intent);

            // return true;
        }

        if (id == R.id.openrequestsmenu){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(InstallUploadActivity.this, InstallRequest.class );

            startActivity(intent);

        }

        if (id == R.id.appoinmentsmenu){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(InstallUploadActivity.this, InstallApointments.class );

            startActivity(intent);

        }

        if (id == R.id.abortmenu){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(InstallUploadActivity.this, InstallAbortTrip.class );

            startActivity(intent);

        }

        if (id == R.id.unitary){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(InstallUploadActivity.this, InstalSelectStoreUpload.class );

            startActivity(intent);

        }

        if (id == R.id.downloadBtn){
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(InstallUploadActivity.this, DownloadActivity.class );

            startActivity(intent);

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




    public void NewValidate(View view) {
        Intent intent = new Intent(InstallUploadActivity.this, InstallationValidateStore.class );
        startActivity(intent);
    }
}
