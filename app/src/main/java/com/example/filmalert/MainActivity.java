package com.example.filmalert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.filmalert.databinding.ActivityMain2Binding;
import com.example.filmalert.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        Handler handler =new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
startActivity(intent);
            }
        },3000);
    }
}