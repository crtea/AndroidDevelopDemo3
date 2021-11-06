package com.example.androiddevelopdemo3;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends Activity {

    private String[] animals = new String[]{"lion", "cat", "dog", "elephant", "monkey", "tiger"};
    private int[] imageIds = new int[]{R.drawable.lion, R.drawable.cat, R.drawable.dog, R.drawable.elephant, R.drawable.monkey, R.drawable.tiger};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < animals.length; i++) {
            Map<String, Object> showitem = new HashMap<>();
            showitem.put("tximage", imageIds[i]);
            showitem.put("name", animals[i]);
            listItems.add(showitem);


            SimpleAdapter myAdapter = new SimpleAdapter(getApplicationContext(), listItems, R.layout.list_item, new String[]{"tximage", "name"}, new int[]{R.id.imgtou, R.id.name});
            ListView listView = (ListView) findViewById(R.id.list_test);
            listView.setAdapter(myAdapter);
            //设置setOnItemClickListener
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                    Toast.makeText(getApplicationContext(), animals[position], Toast.LENGTH_LONG).show();
                }
            });
            listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
                @Override
                public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(getApplicationContext(),animals[position]+"longClicked",Toast.LENGTH_LONG).show();

                 
                    return true;
                }
            });
        }
    }
}