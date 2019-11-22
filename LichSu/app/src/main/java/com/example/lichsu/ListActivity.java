package com.example.lichsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.me, menu);
        return super.onCreateOptionsMenu(menu);
    }
public void doi(MenuItem item) {
    Intent intent = new Intent(ListActivity.this, ThongkeActivity.class);
    startActivity(intent);

}

    public void thoat(MenuItem item) {
        finish();
    }

    public void them(MenuItem item) {
        Intent intent = new Intent(ListActivity.this,HomeActivity.class);
        startActivity(intent);
    }



    public void t(View view) {
        Intent intent = new Intent(ListActivity.this,QuestionActivity.class);
        startActivity(intent);
    }
    public void t1(View view) {
        Intent intent = new Intent(ListActivity.this,QuestionActivity.class);
        startActivity(intent);
    }
    public void t2(View view) {
        Intent intent = new Intent(ListActivity.this,QuestionActivity.class);
        startActivity(intent);
    }
    public void t3(View view) {
        Intent intent = new Intent(ListActivity.this,QuestionActivity.class);
        startActivity(intent);
    }
    public void t4(View view) {
        Intent intent = new Intent(ListActivity.this,QuestionActivity.class);
        startActivity(intent);
    }
    public void t5(View view) {
        Intent intent = new Intent(ListActivity.this,QuestionActivity.class);
        startActivity(intent);
    }
}
