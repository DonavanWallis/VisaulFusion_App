package com.example.donavan.visaulfusion;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class EablGridTssTeam extends  ArrayAdapter {

    Context context;




    public EablGridTssTeam(Context context)
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
            row = inflater.inflate(R.layout.eabl_row_tss_team, parent, false);


            TextView textViewteam = (TextView) row.findViewById(R.id.textViewTeam);
            TextView textViewallocate = (TextView) row.findViewById(R.id.textViewAllocate);
            TextView textViewschedual = (TextView) row.findViewById(R.id.textViewSchedual);
            TextView textViewcomplete = (TextView) row.findViewById(R.id.textViewComplete);



            textViewteam.setText("Team A");
            textViewallocate.setText("14");
            textViewschedual.setText("18");
            textViewcomplete.setText("22");





        }





        return row;

    }

}
