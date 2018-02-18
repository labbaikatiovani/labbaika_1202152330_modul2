package com.example.android.labbaika_1202152330;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class daftarMenu extends AppCompatActivity {
    RecyclerView rv;
    adaptermenu adapter;
    List<menuList> daftar_menus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        setTitle("Nyan The Menu");

        daftar_menus = new ArrayList<>();
        rv = findViewById(R.id.daftar_menu);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        initdata();
    }

    private void initdata() {
        //memasukkan list data ke daftar menu
        daftar_menus.add(new menuList(R.drawable.fish_chips, "Fish and Chips", 35000, "French Fries, Fish, and Guacamole"));
        daftar_menus.add(new menuList(R.drawable.pizza, "Pizza", 60000, "Sausages, Mozzarella, Pepperoni "));
        daftar_menus.add(new menuList(R.drawable.spaghetti, "Spaghetti", 30000, "Spaghetti bolognese topped with sausage"));
        daftar_menus.add(new menuList(R.drawable.wrap, "Chicken Wraps", 25000, "Chicken, salads"));
        daftar_menus.add(new menuList(R.drawable.taco, "Tacos", 25000, "Tex-Mex ground-beef tacos"));

        //membuat data dan memberi data untuk ditampilkan
        adapter = new adaptermenu(this, daftar_menus);
        rv.setAdapter(adapter);


    }
}
