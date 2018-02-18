package com.example.android.labbaika_1202152330;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detailMenu extends AppCompatActivity {
    ImageView image;
    TextView menu, harga, komposisi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        image.findViewById(R.id.d_image);
        menu.findViewById(R.id.d_menu);
        harga.findViewById(R.id.d_harga);
        komposisi.findViewById(R.id.d_komposisi);

        image.setImageDrawable(this.getResources().getDrawable(Integer.valueOf(getIntent().getStringExtra("image"))));
        menu.setText(getIntent().getStringExtra("menu"));
        harga.setText(getIntent().getStringExtra("harga"));
        komposisi.setText(getIntent().getStringExtra("komposisi"));
    }
}
