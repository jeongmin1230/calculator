package com.example.real_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv_input;
    private double storedValue;
    private String curOperator;

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
          // 연산 버튼 기능
          case R.id.plus:
              if(current.equals("")){ // current 에 값이 없을 경우
                  Toast.makeText(getApplicationContext(), "입력된 숫자가 없습니다.", Toast.LENGTH_SHORT).show();
              } else {
                  storedValue = Double.parseDouble(current);
                  curOperator = "+";
                  tv_input.setText("");
                  break;
              }
            case R.id.sub:
                if(current.equals("")) {
                    Toast.makeText(getApplicationContext(), "입력된 숫자가 없습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    storedValue = Double.parseDouble(current);
                    curOperator = "-";
                    tv_input.setText("");
                    break;
                }
            case R.id.mul:
                if (current.equals("")) {
                    Toast.makeText(getApplicationContext(), "입력된 숫자가 없습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    storedValue = Double.parseDouble(current);
                    curOperator = "X";
                    tv_input.setText("");
                    break;
                }
            case R.id.div:
                if (current.equals("")) {
                    Toast.makeText(getApplicationContext(), "입력된 숫자가 없습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    storedValue = Double.parseDouble(current);
                    curOperator = "÷";
                    tv_input.setText("");
                    break;
                }
            case R.id.clear: // clear 를 눌렀을 경우 tv_input 값과 storedValue 초기화
                tv_input.setText("");
                storedValue = 0.0;
                break;
            case R.id.equal: // 연산 수행할 때
                if(current.equals("")) {
                    Toast.makeText(getApplicationContext(), "입력된 숫자가 없습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    double result = 0;
                    double thisValue = Double.parseDouble(tv_input.getText().toString());
                    switch (curOperator) {
                        case "+":
                            result = storedValue + thisValue;
                            break;
                        case "-":
                            result = storedValue - thisValue;
                            break;
                        case "X":
                            result = storedValue * thisValue;
                            break;
                        case "÷":
                            result = storedValue / thisValue;
                            break;
                    }
                    tv_input.setText("" + result);
                    storedValue = 0.0;
                    break;
                }
        }
    }
}