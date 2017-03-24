package com.example.donavan.visaulfusion;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
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
import android.widget.Button;
import android.widget.Spinner;

import android.widget.TextView;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Donavan on 2017/01/16.
 */

public class RepStoreDetailsActivity extends AppCompatActivity {
    Button searchbtn;

    private Spinner spinner2;

    private TextView tvDisplayTime;
    private TimePicker timePicker1;
    private Button btnChangeTime;
    private TextView tvDisplayTime2;
    private TimePicker timePicker2;
    private Button btnChangeTime2;

    private int hour;
    private int minute;
    private int hour2;
    private int minute2;

    static final int TIME_DIALOG_ID = 999;
    static final int TIME_DIALOG_ID2 = 888;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rep_storedetails_layout);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        addItemsOnSpinner2();

        setCurrentTimeOnView();
        addListenerOnButton();
        setCurrentTimeOnView2();
        addListenerOnButton2();


    }

    public void setCurrentTimeOnView2() {
        tvDisplayTime2 = (TextView) findViewById(R.id.tvTime2);
        timePicker2 = (TimePicker) findViewById(R.id.timePicker2);

        final Calendar B = Calendar.getInstance();
        hour2 = B.get(Calendar.HOUR_OF_DAY);
        minute2 = B.get(Calendar.MINUTE);

        // set current time into textview;
        tvDisplayTime2.setText(
                new StringBuilder().append(pad2(hour2))
                        .append(":").append(pad2(minute2)));

        // set current time into timepicker
        timePicker2.setCurrentHour(hour2);
        timePicker2.setCurrentMinute(minute2);


    }

    //date and time picket open time starts here
    // display current time
    public void setCurrentTimeOnView() {

        tvDisplayTime = (TextView) findViewById(R.id.tvTime);
        timePicker1 = (TimePicker) findViewById(R.id.timePicker1);


        final Calendar c = Calendar.getInstance();
        hour = c.get(Calendar.HOUR_OF_DAY);
        minute = c.get(Calendar.MINUTE);

        // set current time into textview
        tvDisplayTime.setText(
                new StringBuilder().append(pad(hour))
                        .append(":").append(pad(minute)));

        // set current time into timepicker
        timePicker1.setCurrentHour(hour);
        timePicker1.setCurrentMinute(minute);


    }

    public void addListenerOnButton2() {

        btnChangeTime2 = (Button) findViewById(R.id.btnChangeTime2);
        btnChangeTime2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(TIME_DIALOG_ID2);
            }
        });
    }

    public void addListenerOnButton() {

        btnChangeTime = (Button) findViewById(R.id.btnChangeTime);

        btnChangeTime.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                showDialog(TIME_DIALOG_ID);

            }

        });

    }


    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case TIME_DIALOG_ID:
                // set time picker as current time
                return new TimePickerDialog(this,
                        timePickerListener, hour, minute, false);


            case TIME_DIALOG_ID2:
                // set time picker as current time
                return new TimePickerDialog(this, timePickerListener2, hour2, minute2, false);


        }
        return null;
    }


    private TimePickerDialog.OnTimeSetListener timePickerListener2 =
            new TimePickerDialog.OnTimeSetListener()

            {
                public void onTimeSet(TimePicker view, int selectedHour,
                                      int selectedMinute)

                {


                    hour2 = selectedHour;
                    minute2 = selectedMinute;

                    // set current time into textview
                    tvDisplayTime2.setText(new StringBuilder().append(pad2(hour2))
                            .append(":").append(pad2(minute2)));

                    // set current time into timepicker
                    timePicker2.setCurrentHour(hour2);
                    timePicker2.setCurrentMinute(minute2);


                }
            };


    private TimePickerDialog.OnTimeSetListener timePickerListener =
            new TimePickerDialog.OnTimeSetListener()

            {
                public void onTimeSet(TimePicker view, int selectedHour,
                                      int selectedMinute)

                {


                    hour = selectedHour;
                    minute = selectedMinute;

                    // set current time into textview
                    tvDisplayTime.setText(new StringBuilder().append(pad(hour))
                            .append(":").append(pad(minute)));

                    // set current time into timepicker
                    timePicker1.setCurrentHour(hour);
                    timePicker1.setCurrentMinute(minute);


                }
            };

    private static String pad(int c) {
        if (c >= 10)
            return String.valueOf(c);
        else
            return "0" + String.valueOf(c);
    }

    private static String pad2(int B) {
        if (B >= 10)
            return String.valueOf(B);
        else
            return "0" + String.valueOf(B);
    }

    //date and time picket open time ends here

    //date and time picket close time starts here


    // add items into spinner dynamically
    public void addItemsOnSpinner2() {

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        List<String> list = new ArrayList<String>();
        list.add(0, "Choose Region");
        list.add("Western Cape");
        list.add("Eastern Cape");
        list.add("Northern Cape");
        list.add("Free State Cape");
        list.add("Gauteng");
        list.add("KwaZulu Natal");
        list.add("Mpumalanga");
        spinner2.setPrompt("Choose Region");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                R.layout.spinnerstyle, list);
        dataAdapter.setDropDownViewResource(R.layout.spinnerstyledrop);
        spinner2.setAdapter(dataAdapter);
    }

    // add items into spinner dynamically


    public void stockinput(View view) {

        Intent intent = new Intent(RepStoreDetailsActivity.this, RepExtraDetailsActivity.class);
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

            Intent intent = new Intent(RepStoreDetailsActivity.this, RepHomeActivity.class);

            startActivity(intent);

            // return true;
        }

        if (id == R.id.AddStoresmenu) {

            Intent intent = new Intent(RepStoreDetailsActivity.this, RepStoreDetailsActivity.class );

            startActivity(intent);

            // return trViewStoreue;
        }

        if (id == R.id.downloadBtn) {
            // startActivity(new Intent(this,MainLogin.class));
            Intent intent = new Intent(RepStoreDetailsActivity.this, DownloadActivity.class);

            startActivity(intent);

        }

        if (id == R.id.searchbuttonnew) {

            final FragmentManager fm = getSupportFragmentManager();
            final PlayerFragments p = new PlayerFragments();
            p.show(fm, "Search");



        }

        if (id == R.id.ViewStore) {

            Intent intent = new Intent(RepStoreDetailsActivity.this, RepProgressActivity.class );

            startActivity(intent);

            // return true;
        }


        if (id == R.id.searchbuttonnew) {

            final FragmentManager fm = getSupportFragmentManager();
            final PlayerFragments p = new PlayerFragments();
            p.show(fm, "Best Players");



        }

            if (id == R.id.logoutbutton) {
                // startActivity(new Intent(this,MainLogin.class));
            }

            return super.onOptionsItemSelected(item);
        }


    }













