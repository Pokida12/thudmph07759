package com.example.lichsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuq, menu);
        return super.onCreateOptionsMenu(menu);
    }
public void doi(MenuItem item) {
    Intent intent = new Intent(QuestionActivity.this, ThongkeActivity.class);
    startActivity(intent);

}

    public void thoat(MenuItem item) {
        finish();
    }

    public void them(MenuItem item) {
        Intent intent = new Intent(QuestionActivity.this,HomeActivity.class);
        startActivity(intent);
    }
}
