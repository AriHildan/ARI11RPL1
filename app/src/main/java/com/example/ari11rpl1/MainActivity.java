package com.example.ari11rpl1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    EditText editText1,editText2;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferences = getSharedPreferences("Login", MODE_PRIVATE);
        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1.getText().toString().equalsIgnoreCase("admin")
                && editText2.getText().toString().equalsIgnoreCase("admin")){
                    //saving ke sp
                    editor = preferences.edit();
                    editor.putString("username", editText1.getText().toString());
                    editor.putString("status", "Login");
                    editor.apply();
                    //menuju main menu
                    startActivity(new Intent(getApplicationContext(), MainMenu.class));
                    finish();
                }
            }
        });

    }
}

