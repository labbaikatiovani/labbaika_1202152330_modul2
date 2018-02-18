package com.example.android.labbaika_1202152330;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class custDetail extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner_d; //varible spinner
    ArrayAdapter adapter; //array adapter dari string array

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cust_detail);

        spinner_d = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinner_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_d.setAdapter(adapter);

        spinner_d.setOnItemSelectedListener(this);



    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(), "You selected " + text,1).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void pesan(View view) {
        Intent intent = new Intent(this, daftarMenu.class );
        startActivity(intent);
    }
}
