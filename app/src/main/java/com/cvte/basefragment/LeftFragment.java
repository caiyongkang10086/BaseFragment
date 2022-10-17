package com.cvte.basefragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class LeftFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.left_fragment, container, false);
        return view;
    }
    public void useOtherFragmentMethod() {
        MainActivity activity = (MainActivity) getActivity();
        RightFragment rightFragment = (RightFragment) activity.getSupportFragmentManager().findFragmentById(R.id.right_fragment);
    }
}
