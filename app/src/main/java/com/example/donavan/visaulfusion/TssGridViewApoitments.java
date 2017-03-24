package com.example.donavan.visaulfusion;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class TssGridViewApoitments extends  ArrayAdapter {

    Context context;



    public TssGridViewApoitments(Context context)
    {
        super(context, 0);
        this.context=context;

    }

    public int getCount()
    {
        return 6;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View row = convertView;

        if (row == null)
        {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(R.layout.tss_row_appointments, parent, false);


            TextView textViewTitle = (TextView) row.findViewById(R.id.textView2);

            TextView urnNumber = (TextView) row.findViewById(R.id.textViewsub);
            TextView progress = (TextView) row.findViewById(R.id.textViewsub2);





            textViewTitle.setText("Request Reviced for: Jumbo Liquers");

            urnNumber.setText("Urn: ");
            progress.setText("Set Apppointment / View Appointment");





        }







        return row;



    }




}
