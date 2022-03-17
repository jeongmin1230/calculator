package com.example.real_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_input = findViewById(R.id.tv_input);
    }

    public void onClick(View view) {
        String current = tv_input.getText().toString(); // tv_input 에 현재 있는 값 가져오기

        switch(view.getId()){ // 버튼을 누를 때마다 switch - case 문으로 버튼 누를 때마다 글자 추가되게 함
          case R.id.n0:
              tv_input.setText(current + "0");
            break;
          case R.id.n1:
              tv_input.setText(current + "1");
              break;
          case R.id.n2:
              tv_input.setText(current + "2");
              break;
           case R.id.n3:
              tv_input.setText(current + "3");
              break;
          case R.id.n4:
              tv_input.setText(current + "4");
              break;
          case R.id.n5:
              tv_input.setText(current + "5");
              break;
          case R.id.n6:
              tv_input.setText(current + "6");
              break;
          case R.id.n7:
              tv_input.setText(current + "7");
              break;
          case R.id.n8:
              tv_input.setText(current + "8");
              break;
          case R.id.n9:
              tv_input.setText(current + "9");
              break;
          case R.id.dot:
              tv_input.setText(current + ".");
              break;
        }
    }
}