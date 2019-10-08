package com.alkhalildevelopers.homelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.myList);
        final ArrayList <String> myArrayList = new ArrayList<String>();
        myArrayList.add("Books");
        myArrayList.add("Pencil");
        myArrayList.add("food");
        myArrayList.add("chicken");
        myArrayList.add("cow");

        ArrayAdapter myArrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_activated_1,myArrayList);
        listView.setAdapter(myArrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = myArrayList.get(position);
                Toast.makeText(MainActivity.this, selectedItem, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
