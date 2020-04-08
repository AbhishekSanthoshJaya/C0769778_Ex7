package com.aby.c0769778_ex7.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.aby.c0769778_ex7.R;

public class AndroidFragment extends Fragment {

    private AndroidViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(AndroidViewModel.class);
        View root = inflater.inflate(R.layout.fragment_android, container, false);
        final TextView textView = root.findViewById(R.id.text_android);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText("WHAT IS ANDROID?");
            }
        });
        return root;
    }
}
