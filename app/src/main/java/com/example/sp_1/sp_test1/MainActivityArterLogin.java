/*package com.example.sp_1.sp_test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.Place);
        adapter = ArrayAdapter.createFromResource(this,R.array.city, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                {

                    Toast.makeText(MainActivity.this, "Hyderabad Only", Toast.LENGTH_SHORT).show();
                    getFragmentManager().beginTransaction()
                            .replace(R.id.main_container, new SPA_hyderabad(), "hyderabad")
                            .addToBackStack("hyderabad")
                            .commit();
                }

                else if(position==1)
                {
                    Toast.makeText(MainActivity.this, "Delhi Only", Toast.LENGTH_SHORT).show();
                    getFragmentManager().beginTransaction()
                            .replace(R.id.main_container, new SPA_Delhi(), "Delhi")
                            .addToBackStack("Delhi")
                            .commit();

                }
                else{

                    Toast.makeText(getBaseContext(), parent.getItemAtPosition(position)+ " selected ", Toast.LENGTH_SHORT).show();
                }

            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
*/