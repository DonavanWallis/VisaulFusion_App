package com.example.donavan.visaulfusion;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;


public class InstallGridViewValidateImages extends  ArrayAdapter {

    Context context;



    public InstallGridViewValidateImages(Context context)
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
            row = inflater.inflate(R.layout.install_row_validate_images, parent, false);



            ImageView imageViewIte = (ImageView) row.findViewById(R.id.imageView4);


            imageViewIte.setImageResource(R.drawable.dis2);




        }





        return row;

    }

}
