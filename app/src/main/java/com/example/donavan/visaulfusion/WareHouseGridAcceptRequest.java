package com.example.donavan.visaulfusion;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class WareHouseGridAcceptRequest extends  ArrayAdapter {

    Context context;



    public WareHouseGridAcceptRequest(Context context)
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
            row = inflater.inflate(R.layout.ware_house_row_acceptrequests, parent, false);



            ImageView imageViewIte = (ImageView) row.findViewById(R.id.imageView4);


            imageViewIte.setImageResource(R.drawable.dis1);










        }







        return row;



    }




}
