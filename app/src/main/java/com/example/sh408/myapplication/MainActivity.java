package com.example.sh408.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v)
    {
        //Toast.makeText(getApplicationContext(),"버튼이 눌러졌습니다",Toast.LENGTH_SHORT).show();
        //Toast.makeText(MainActivity.this,"버튼이 눌러졌습니다",Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"버튼이 눌러졌습니다",Toast.LENGTH_SHORT).show();
    }

}
