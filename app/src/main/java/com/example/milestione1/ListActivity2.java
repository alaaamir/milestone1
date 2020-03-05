package com.example.milestione1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import android.content.Intent;


public class ListActivity2 extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);
        listView=(ListView)findViewById(R.id.listview);
        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Android");
        arrayList.add("iPhone");
        arrayList.add("Windows");
        arrayList.add("Bluckberry");
        arrayList.add("Lunix");
        ArrayAdapter arrayAdapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListActivity2.this,"clicked item: "+position+" "+arrayList.get(position).toString(),Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ListActivity2.this,DeviceDetail.class);
                startActivity(intent);
            }
        });


    }
}
