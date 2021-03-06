package com.example.protohype;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.Scanner;


public class SearchFrag extends Fragment implements View.OnClickListener{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_search, container, false);
        Button foundButton = v.findViewById(R.id.find_button);
        foundButton.setOnClickListener(this);
        return v;

    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.find_button:
                startActivity(new Intent(getActivity(), PersonalActivity.class));
                break;
        }
    }

}

