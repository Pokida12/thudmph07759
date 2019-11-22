package com.example.lichsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ThongkeActivity extends AppCompatActivity {
    private Spinner spnCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongke);
        spnCategory = (Spinner) findViewById(R.id.spinnerSubjec);


        List<String> list = new ArrayList<>();
        list.add("Bai 1");
        list.add("Bài 2");
        list.add("Bài 3");
        list.add("Bài 4");
        list.add("Bài 5");

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spnCategory.setAdapter(adapter);
        spnCategory.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menut, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public void doi(MenuItem item) {
        Intent intent = new Intent(ThongkeActivity.this, ThongkeActivity.class);
        startActivity(intent);

    }

    public void thoat(MenuItem item) {
        finish();
    }

    public void them(MenuItem item) {
        Intent intent = new Intent(ThongkeActivity.this,HomeActivity.class);
        startActivity(intent);
    }

}
