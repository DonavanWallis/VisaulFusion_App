package com.example.donavan.visaulfusion;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class MangmentGridSelectBrandReport extends  ArrayAdapter {

    Context context;



    public MangmentGridSelectBrandReport(Context context)
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
            row = inflater.inflate(R.layout.mangment_row_selectbrand_report, parent, false);


            TextView textViewTitle1 = (TextView) row.findViewById(R.id.textView2);

            textViewTitle1.setText("Brand 1");






        }



        return row;



    }






}
