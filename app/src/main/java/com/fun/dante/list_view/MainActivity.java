package com.fun.dante.list_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ArrayList nameItem = new ArrayList();
    private ArrayList classItem = new ArrayList();
    private ArrayList numItem = new ArrayList();

    private final static String Name="Name";
    private final static String Class_="Class_";
    private final static String Num="Num";

    private ListView list;
    private SimpleAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameItem.add("DanteFun");
        nameItem.add("AssCrying");
        nameItem.add("Fun");

        classItem.add("计科1504班");
        classItem.add("计科1505班");
        classItem.add("计科1506班");

        numItem.add("2015011317");
        numItem.add("2015011318");
        numItem.add("2015011319");
        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();
        for(int i=0;i<nameItem.size();i++) {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(Name,nameItem.get(i));
            item.put(Class_, classItem.get(i));
            item.put(Num, numItem.get(i));
            items.add(item);
        }
        adapter=new SimpleAdapter(this,items,R.layout.item,new String[]{Name,Class_,Num},new int[]{R.id.name,R.id.class_,R.id.num});
        list=(ListView)findViewById(R.id.student_info);
        list.setAdapter(adapter);
    }
}
