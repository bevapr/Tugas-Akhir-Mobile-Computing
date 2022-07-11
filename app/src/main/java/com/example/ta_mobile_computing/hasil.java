package com.example.ta_mobile_computing;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class hasil extends AppCompatActivity {
    TextView txtNama, txtBb, txtTb, txtBmi, txtHasil, txtKet;
    String nama,hasil,ket;
    double bb,tb,bmi;
    double defaultValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        txtNama = findViewById(R.id.text_view_hasil_nama);
        txtBb=findViewById(R.id.text_view_hasil_bb);
        txtTb=findViewById(R.id.text_view_hasil_tb);
        txtBmi=findViewById(R.id.text_view_hasil_bmi);
        txtHasil=findViewById(R.id.text_view_hasil);
        txtKet=findViewById(R.id.text_view_hasil_ket);

        Intent intent = getIntent();
        nama = intent.getStringExtra("EXTRA_NAMA");
        bb = intent.getDoubleExtra("EXTRA_BB",defaultValue);
        tb = intent.getDoubleExtra("EXTRA_TB",defaultValue);
        bmi = intent.getDoubleExtra("EXTRA_BMI",defaultValue);
        hasil = intent.getStringExtra("EXTRA_HASIL");
        ket = intent.getStringExtra("EXTRA_KET");

        txtNama.setText("Nama : "+nama);
        txtBb.setText("Berat Badani : "+bb);
        txtTb.setText("Tinggi Badan : "+tb);
        txtBmi.setText("BMI : "+bmi);
        txtHasil.setText("Hasil : "+hasil);
        txtKet.setText("Keterangan : "+ket);
    }

    public void Menu(View view) {
        Intent intent = new Intent(hasil.this,MainActivity.class);
        startActivity(intent);
        }
    }
