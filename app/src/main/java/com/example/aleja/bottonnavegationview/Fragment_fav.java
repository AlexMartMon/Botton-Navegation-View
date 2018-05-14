package com.example.aleja.bottonnavegationview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_fav extends Fragment {
    private TextView text;
    private View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_empresa,container,false);
        view.setBackgroundColor(3);
        text = view.findViewById(R.id.text);
        text.setText(getArguments().getString("message"));
        return view;    }
}
