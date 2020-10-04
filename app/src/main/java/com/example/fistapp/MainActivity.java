package com.example.fistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void onClickBtnMostrar(View v){
        EditText editText = findViewById(R.id.et_1);
        EditText editText2 = findViewById(R.id.et_2);
        Toast.makeText(MainActivity.this, editText.getText().toString() + editText2.getText().toString(), Toast.LENGTH_LONG).show();
    }
    public  void onClickBtnClean(View v){
        EditText editText = findViewById(R.id.et_1);
        EditText editText2 = findViewById(R.id.et_2);
        editText.setText("");
        editText2.setText("");
    }
}