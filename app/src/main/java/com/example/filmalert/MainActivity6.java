package com.example.filmalert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.filmalert.databinding.ActivityMain3Binding;
import com.example.filmalert.databinding.ActivityMain6Binding;

public class MainActivity6 extends AppCompatActivity {
ActivityMain6Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMain6Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}