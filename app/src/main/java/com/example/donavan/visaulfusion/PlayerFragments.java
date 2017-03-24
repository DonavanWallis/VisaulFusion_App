package com.example.donavan.visaulfusion;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;


/**
 * Created by Donavan on 2017/02/12.
 */

public class PlayerFragments extends DialogFragment {

    Button btn;
    ListView Lv;
    SearchView sv;
    ArrayAdapter<String> adapter;
    String[] Players = {"Store1", "Store2", "Store3","Store4","Store4","Store6","Store7","Store8"};



    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.sports, null);


        //Set dialog fragment
        getDialog().setTitle("Best Players In The World");


        //button ,  listview , searchview  initilastions
        Lv = (ListView) rootView.findViewById(R.id.Listview);
        btn= (Button) rootView.findViewById(R.id.dismiss);
        sv = (SearchView) rootView.findViewById(R.id.searchvw);

        //Create and set adpator to gridview
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Players);
        Lv.setAdapter(adapter);

        sv.setQueryHint("Search..");
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String txt) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String txt) {
                adapter.getFilter().filter(txt);


                return false;
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                dismiss();
            }
        });


        return rootView;

    }
}
