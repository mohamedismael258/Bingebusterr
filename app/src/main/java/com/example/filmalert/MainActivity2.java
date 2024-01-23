package com.example.filmalert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.filmalert.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {
ActivityMain2Binding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
binding.Start.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(intent);
    }
});
binding.research.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity2.this,MainActivity4.class);
        startActivity(intent);
    }
});
binding.contacUs.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity2.this,MainActivity5.class);
        startActivity(intent);
    }
});
binding.aboutUs.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity2.this,MainActivity6.class);
        startActivity(intent);
    }
});
    }
}