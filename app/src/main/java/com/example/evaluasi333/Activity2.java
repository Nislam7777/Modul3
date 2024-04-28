package com.example.evaluasi333;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Mendapatkan data dari MainActivity
        Intent intent = getIntent();
        String stambuk = intent.getStringExtra("stambuk");
        String nama = intent.getStringExtra("nama");
        String angkatan = intent.getStringExtra("angkatan");
        String programStudi = intent.getStringExtra("programStudi");
        String minat = intent.getStringExtra("minat");

        // Menampilkan ringkasan informasi
        TextView textViewRingkasanData = findViewById(R.id.textViewRingkasanData);
        String ringkasan = "Stambuk: " + stambuk + "\n"
                + "Nama: " + nama + "\n"
                + "Angkatan: " + angkatan + "\n"
                + "Program Studi: " + programStudi + "\n"
                + "Minat: " + minat;
        textViewRingkasanData.setText(ringkasan);
    }
}
