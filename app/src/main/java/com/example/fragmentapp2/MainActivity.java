package com.example.fragmentapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.Fragment;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements connection {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void con(String data) {
        FragmentManager fragmentManager= getSupportFragmentManager();
        fragmentB b= (fragmentB) fragmentManager.findFragmentById(R.id.fragment2);
        b.modifyText(data);

    }
}
