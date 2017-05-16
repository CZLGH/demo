package com.example.czm.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FirstActivity extends AppCompatActivity {
        private String[] data={"联系人1","联系人二","联系人3","联系人4","联系人5","联系人6",
                "联系人7","联系人8","联系人9","联系人10","联系人11","联系人12",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(FirstActivity.this, android.R.layout.simple_list_item_1,data
        );
        ListView listView=(ListView) findViewById(R.id.list_view
        );
        listView.setAdapter(adapter);
    }
}