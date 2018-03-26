package com.sudoku.sudoku;

import android.app.Activity;
import android.content.Intent;
import android.content.SearchRecentSuggestionsProvider;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main2Activity extends AppCompatActivity {

    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        TextView text = (TextView) findViewById(R.id.text2ID);
        Bundle objetbunble = this.getIntent().getExtras();
        String InfoPasse= objetbunble.getString("passInfo");
        text.setText(InfoPasse);

        final ListView listview = (ListView) findViewById(R.id.listId);
        List<String> val = new ArrayList<String>();
        String[] values = new String[] {};
        for(int i = 1; i <100; i++) {
            val.add("niveau " + i);
        }
        Object valArray = val.toArray();

        String[] tabVal = new String[val.size()];
        tabVal = val.toArray(tabVal);


        ArrayAdapter <String>adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,android.R.id.text1,tabVal);
        listview.setAdapter(adapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Main2Activity.this, view.toString() , Toast.LENGTH_SHORT).show();

                startActivity(new Intent(getApplicationContext(),Main3Activity.class));


            }
        });


    }

}
