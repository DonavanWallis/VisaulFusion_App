package com.example.donavan.visaulfusion;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class TssGridViewUnitary extends  ArrayAdapter {

    Context context;




    public TssGridViewUnitary(Context context)
    {
        super(context, 0);
        this.context=context;

    }

    public int getCount()
    {
        return 10;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View row = convertView;

        if (row == null)
        {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(R.layout.tss_row_unitary, parent, false);


            TextView textViewTitle = (TextView) row.findViewById(R.id.textView);
            ImageView imageViewIte = (ImageView) row.findViewById(R.id.imageView);
            TextView numberinput = (TextView) row.findViewById(R.id.textViewsub);

            TextView textUnitsSet = (TextView) row.findViewById(R.id.amount);




            textViewTitle.setText("Display Item 12");
            imageViewIte.setImageResource(R.drawable.dis1);
            numberinput.setText("Price & Other info ");
            textUnitsSet.setText("2");




        }





        return row;

    }

}
