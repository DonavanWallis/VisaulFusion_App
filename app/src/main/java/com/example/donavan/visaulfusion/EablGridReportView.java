package com.example.donavan.visaulfusion;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class EablGridReportView extends  ArrayAdapter {

    Context context;



    public EablGridReportView(Context context)
    {
        super(context, 0);
        this.context=context;

    }

    public int getCount()
    {
        return 12;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View row = convertView;

        if (row == null)
        {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(R.layout.eabl_row_reports, parent, false);


            TextView textViewTitle = (TextView) row.findViewById(R.id.textView2);

            TextView urnNumber = (TextView) row.findViewById(R.id.textViewsub);

            textViewTitle.setText("Store Name");

            urnNumber.setText("Urn: ");




        }





        return row;

    }



}
