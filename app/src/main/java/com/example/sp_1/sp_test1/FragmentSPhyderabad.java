package com.example.sp_1.sp_test1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by ankush on 10/4/2015.
 */
public class FragmentSPhyderabad extends Fragment {
    @Nullable


    public FragmentSPhyderabad(){

    }
        @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            View view = inflater.inflate(R.layout.fragment_layout_selectsport_hyderabad,container,false);
            Spinner  sport_spinner = (Spinner)view.findViewById(R.id.Select_sport);

            ArrayAdapter<CharSequence> sport_adapter = ArrayAdapter.createFromResource(getActivity()
                            .getBaseContext(),R.array.city,
                            android.R.layout.simple_spinner_dropdown_item);

            sport_adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
            sport_spinner.setAdapter(sport_adapter);
            sport_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    if (position == 0) {
                        Toast.makeText(MainActivity.this, "Football", Toast.LENGTH_SHORT).show();

                    }
                    return view;


                }
            }
    }
}
