package com.example.android.labbaika_1202152330;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

/**
 * Created by Labbaika Putri on 2/18/2018.
 */

public class adaptermenu extends RecyclerView.Adapter<adaptermenu.holdermenu> {
    CardView cv;
    private Context context;
    private List<menuList> daftar_menus;

    public adaptermenu(Context context, List<menuList> daftar_menus) {
        this.context = context;
        this.daftar_menus = daftar_menus;
    }

    @Override
    public adaptermenu.holdermenu onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_view, parent, false);
        holdermenu holder = new holdermenu(view);
        return holder;
    }

    @Override
    //menghubungkan data dengan view holder pada posisi yang ditentukan oleh RecyclerView
    public void onBindViewHolder(adaptermenu.holdermenu holder, int position) {

        menuList daftarMenus = daftar_menus.get(position);
        holder.image.setImageDrawable(context.getResources().getDrawable(daftarMenus.getImage()));
        holder.image.setTag(daftarMenus.getImage());
        holder.menu.setText(daftarMenus.getMenu());
        holder.menu.setTag(daftarMenus.getKomposisi());
        holder.harga.setText("Harga: Rp. "+ NumberFormat.getInstance(Locale.US).format(daftarMenus.getHarga()));

    }

    @Override
    public int getItemCount() {
        return daftar_menus.size();
    }
    class holdermenu extends RecyclerView.ViewHolder{
        ImageView image;
        TextView menu, harga;
        public holdermenu (View i_view){
            super (i_view);
            image = i_view.findViewById(R.id.image_menu);
            menu = i_view.findViewById(R.id.nama_menu);
            harga = i_view.findViewById(R.id.harga_menu);
            //mengimplementasikan onClickListener
            i_view.setOnClickListener(new View.OnClickListener() {
                @Override
                //Ketika item diklik
                public void onClick(View view) {
                    Intent intent = new Intent (context, detailMenu.class );

                    intent.putExtra("menu" , menu.getText());
                    intent.putExtra("harga", harga.getText());
                    intent.putExtra("komposisi", menu.getTag().toString());
                    intent.putExtra("image", image.getTag().toString());
                    context.startActivity(intent);
                }
            });
        }


    }
}
