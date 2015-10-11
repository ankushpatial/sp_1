package com.example.sp_1.sp_test1;

import android.app.Fragment;

import android.os.Bundle;
//import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageButton;
import android.widget.Toast;


/**
 * Created by ankush on 10/4/2015.
 */
public class SPA_hyderabad extends Fragment {
   // @Nullable



    public SPA_hyderabad(){

    }
        @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

             final View view = inflater.inflate(R.layout.layout_selectsport_hyderabad, container, false);

            ImageButton Cricket, Football, Badminton, Tennis;

            Cricket = (ImageButton) view.findViewById(R.id.Cricket);
            Football = (ImageButton) view.findViewById(R.id.Football);
            Badminton = (ImageButton) view.findViewById(R.id.Badminton);
            Tennis = (ImageButton) view.findViewById(R.id.Tennis);


            Football.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    /*getChildFragmentManager().beginTransaction()
                            .replace(R.layout.layout_selectsport_hyderabad,new hyd_football(),"hyd_foot")
                            .commit();*/

                    getFragmentManager().beginTransaction()
                            .replace(R.id.select_sport_hyd, new Hyd_football(), "hyder")
                            .commit();
                }
            });


            Cricket.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });



            return view;
    }
}
