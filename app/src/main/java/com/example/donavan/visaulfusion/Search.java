package com.example.donavan.visaulfusion;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

public class Search extends DialogFragment {

    Button btn;
    GridView  Gridvw;
    SearchView  Searchvw;
    ArrayAdapter<String> adapter;
    String[] stores = {"Store1, Store2, Store3,Store4,Store4,Store6,Store7,Store8"};



  @Override
public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
  {
  View rootView = inflater.inflate(R.layout.search_layout, null);


      //Set dialog fragment
      getDialog().setTitle("Search stores");


      //button ,  listview , searchview  initilastions
      Gridvw = (GridView) rootView.findViewById(R.id.gridViewCustom3);
      btn= (Button) rootView.findViewById(R.id.dismiss);
      Searchvw = (SearchView) rootView.findViewById(R.id.searchvw);

      //Create and set adpator to gridview
      adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, stores);
      Gridvw.setAdapter(adapter);

      Searchvw.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
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
          public void onClick(View v) {
              dismiss();
          }
      });


      return rootView;

  }
}
