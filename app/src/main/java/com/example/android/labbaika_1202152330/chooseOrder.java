package com.example.android.labbaika_1202152330;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class chooseOrder extends AppCompatActivity {
    RadioGroup r_group; //buat variable radio group
    Button b_pesan; //buat variable button
    RadioButton r_button , dinein, takeaway; //buat variable radio button


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_order);

        r_group = findViewById(R.id.radioGroup);
        b_pesan = findViewById(R.id.btn_order);
        dinein = findViewById(R.id.dineIn);
        takeaway = findViewById(R.id.takeAway);

        b_pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId = r_group.getCheckedRadioButtonId(); //cek radio button apa yang dipilih
                r_button = findViewById(radioId); //memilih apapun yang dipilih pada radio button

                if ( radioId == dinein.getId()) { //Jika memilih dine in
                    Intent intent = new Intent(chooseOrder.this, custDetail.class);
                    startActivity(intent);

                } else { //Jika memilih take away
                    Intent intent = new Intent(chooseOrder.this, take_away.class);
                    startActivity(intent);
                }

            }
        });

    }


    public void checkButton(View view) {
        int radioId = r_group.getCheckedRadioButtonId(); //cek radio button apa yang dipilih
        r_button = findViewById(radioId); //memilih apapun yang dipilih pada radio button

        Toast.makeText(chooseOrder.this, "Anda memilih pesanan untuk " + r_button.getText(), 1).show(); //membuat toast

    }
}
