package com.example.fragmentapp2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragmentA extends Fragment implements View.OnClickListener {

    Button button;
    connection conn;
    int count=0;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a_layout,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        conn= (connection) getActivity();
        button=getActivity().findViewById(R.id.btnsendMessage);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        count++;
        conn.con("hi this is message ! NO= "+count);


    }
}
