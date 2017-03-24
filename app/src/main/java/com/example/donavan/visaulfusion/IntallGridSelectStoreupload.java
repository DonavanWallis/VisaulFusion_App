package com.example.donavan.visaulfusion;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class IntallGridSelectStoreupload extends  ArrayAdapter {

    Context context;



    public IntallGridSelectStoreupload(Context context)
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
            row = inflater.inflate(R.layout.install_row_selectstore_upload, parent, false);


            TextView textViewTitle = (TextView) row.findViewById(R.id.textView2);

            TextView urnNumber = (TextView) row.findViewById(R.id.textViewsub);
            TextView progress = (TextView) row.findViewById(R.id.textViewsub2);





            textViewTitle.setText("Upload docs to "+"Store Name");

            urnNumber.setText("Urn: ");






        }







        return row;



    }




}
