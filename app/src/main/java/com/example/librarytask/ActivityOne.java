package com.example.librarytask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.example.activitycount.ActivityCounter;
import com.example.librarytask.databinding.ActivityOneBinding;

public class ActivityOne extends AppCompatActivity {
    //Declared Instance Activity Binding Variable
    private ActivityOneBinding binding;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityOneBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Object Creation
        ActivityCounter activityCounter=new ActivityCounter(this);

        //Calling the increment method
        activityCounter.increaseCount();

        //Fetch the counter and set text
        binding.count.setText("Count : "+activityCounter.getCounter());

        //Open a new activity for Screen/Activity Change
        binding.nextActivity.setOnClickListener(view -> {
            startActivity(new Intent(ActivityOne.this,MainActivity.class));
            finish();
        });

    }
}