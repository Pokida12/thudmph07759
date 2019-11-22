package com.example.lichsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.men, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void World(View view) {
        Intent intent = new Intent(HomeActivity.this,ListActivity.class);
        startActivity(intent);
    }

    public void Vn(View view) {
        Intent intent = new Intent(HomeActivity.this,ListActivity.class);
        startActivity(intent);
    }
    public void doi(MenuItem item) {
        Intent intent = new Intent(HomeActivity.this, ThongkeActivity.class);
        startActivity(intent);

    }

    public void thoat(MenuItem item) {
        finish();
    }

    public void them(MenuItem item) {
        Intent intent = new Intent(HomeActivity.this,HomeActivity.class);
        startActivity(intent);
    }
}
