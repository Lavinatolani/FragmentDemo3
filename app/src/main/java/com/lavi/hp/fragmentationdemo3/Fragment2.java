package com.lavi.hp.fragmentationdemo3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by hp on 2/2/2017.
 */

public class Fragment2 extends Fragment {
    private Button btnpegion;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);
        btnpegion = (Button) view.findViewById(R.id.btnpigeon);
        btnpegion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment3 fragment3 = new Fragment3();
                getFragmentManager().beginTransaction().replace(R.id.l1, fragment3).addToBackStack("").commit();

            }
        });
        return view;
    }
}