package com.estalisto.clase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView Saludo;
    private Button btn_saludar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Saludo = (TextView) findViewById(R.id.tv_saludo);
        btn_saludar = (Button) findViewById(R.id.btn_saludo);

        btn_saludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),Saludo.getText().toString(), Toast.LENGTH_SHORT).show();
               // Toast.makeText(MainActivity.this, "Nuevo Pedido...ID: "+ID+" >> "+fecha_creacion, Toast.LENGTH_SHORT).show();
            }
        });



    }
}
