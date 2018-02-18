package com.example.android.labbaika_1202152330;

/**
 * Created by Labbaika Putri on 2/18/2018.
 */

public class menuList {
    int image;
    String menu;
    int harga;
    String komposisi;

    //method settter
    public menuList (int image, String menu, int harga, String komposisi){
        this.image= image;
        this.menu= menu;
        this.harga= harga;
        this.komposisi= komposisi;
    }

    //method getter
    public int getImage() {
        return image;
    }

    public String getMenu() {
        return menu;
    }

    public int getHarga() {
        return harga;
    }

    public String getKomposisi(){
        return komposisi;
    }
}
