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

public class Fragment1 extends Fragment {
    private Button btnparrot;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment1,container,false);
        btnparrot=(Button)view.findViewById(R.id.btnparrot);
        btnparrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment2 fragment2=new Fragment2();
                getFragmentManager() .beginTransaction() .replace(R.id.l1,fragment2) .addToBackStack("") .commit();

            }
        });
        return view;
    }
}
