package com.example.sh408.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
//        implements View.OnClickListener {
//
//    @Override
//    public void onClick(View v) {
//        //
//    }
//
//    class MyListenerClass implements View.OnClickListener{
//        @Override
//        public void onClick(View v) {
//            Toast.makeText(getApplicationContext(),"sdfdf",Toast.LENGTH_SHORT).show();
//        }
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CheckBox chk_meat = (CheckBox) findViewById(R.id.meat);
        chk_meat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean b = ((CheckBox) v).isChecked();
                String str = (b) ? "selected" : "no";
                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
            }
        });

        CheckBox chk_bread = (CheckBox) findViewById(R.id.bread);
        chk_bread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print_Msg(v);
            }

        });
    }

    public void print_Msg(View v) {
        boolean b = ((CheckBox) v).isChecked();
        //String str = (b)? "selected" : "sdfsdf";
        Toast.makeText(getApplicationContext(), ((CheckBox) v).getText(), Toast.LENGTH_SHORT).show();
    }
}

// innerClass
//        Button btn = (Button)findViewById(R.id.button);
//        btn.setOnClickListener(this);
//        MyListenerClass lis = new MyListenerClass();
//        btn.setOnClickListener(lis);

//  무명 클래스
//        //btn.setOnClickListener(new MyListenerClass());

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Toast.makeText(sdkfjdf)
//            }
//        });


//    public void chk_onClick(View v)
//    {
//        boolean b = ((CheckBox)v).isChecked();
//        String str = "";
//        switch (v.getId())
//        {
//            case R.id.meat:
//                str = (b)? "meat selected" : "meat diselected";
//                break;
//            case R.id.bread:
//                str = (b)? "bread selected" : "bread diselected";
//                break;
//        }
//        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();
//    }


//    public void onClick(View v)
//    {   아래 3개가 다 같음.
//        //Toast.makeText(getApplicationContext(),"버튼이 눌러졌습니다",Toast.LENGTH_SHORT).show();
//        //Toast.makeText(MainActivity.this,"버튼이 눌러졌습니다",Toast.LENGTH_SHORT).show();
//        Toast.makeText(this,"토글 테스트",Toast.LENGTH_SHORT).show();
//    }
//    public void onToggleBtnClicked(View v)
//    {
//        boolean state = ((ToggleButton)v).isChecked();
//        String str;
//        str = (state)? "on" : "off";
//        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
//    }


