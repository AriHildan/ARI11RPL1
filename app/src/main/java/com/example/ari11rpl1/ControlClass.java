package com.example.ari11rpl1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class ControlClass extends AppCompatActivity {
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences = getSharedPreferences("Login", Context.MODE_PRIVATE);
        if (sharedPreferences.getString("Username", "").isEmpty() ||
        sharedPreferences.getString("Username", "").equalsIgnoreCase("")){
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
        }else{
            startActivity(new Intent(getApplicationContext(), Main2Activity.class));
            finish();
        }
    }
}
