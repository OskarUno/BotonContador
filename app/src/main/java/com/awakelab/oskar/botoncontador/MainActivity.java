package com.awakelab.oskar.botoncontador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListeners();
    }

    private void initListeners() {
        Button btnToast = findViewById(R.id.btnToast);
        Button btnCounter = findViewById(R.id.btnCount);
        TextView texNumero = findViewById(R.id.texNumero);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Hello Toast!!", Toast.LENGTH_SHORT).show();
            }
        });

        btnCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer numAdd = Integer.parseInt(texNumero.getText().toString());
                numAdd++;
                texNumero.setText(numAdd.toString());
            }
        });
    }
}