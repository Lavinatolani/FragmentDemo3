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

public class Fragment3  extends Fragment  {
    private Button btnpeacock;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3, container, false);
        btnpeacock = (Button) view.findViewById(R.id.btnpeacock);
        btnpeacock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStack();
                ;

            }
        });
            return view;





    }
    }
