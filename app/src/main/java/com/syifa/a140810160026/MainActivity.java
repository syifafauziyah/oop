package com.syifa.a140810160026;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private double suhu;
    private String satuan;
    private String getSuhu;
    private String getSatuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOk = findViewById(R.id.button_ok);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSuhu = ((EditText) findViewById(R.id.inputSuhu)).getText().toString();
                getSatuan = ((EditText) findViewById(R.id.inputSatuan)).getText().toString();

                if (getSuhu.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Required Suhu", Toast.LENGTH_SHORT).show();
                }
                if (getSatuan.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Required Satuan", Toast.LENGTH_SHORT).show();
                } else {
                    suhu = Double.parseDouble(getSuhu);
                    satuan = getSatuan.toUpperCase();
                    onClickKonversi();
                }
            }
        });
    }

    private void onClickKonversi() {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra(Keys.VAL, this.suhu);

        switch (this.satuan) {
            case Keys.CELCIUS:
                intent.putExtra(Keys.SATUAN, Keys.CELCIUS);
                break;
            case Keys.REAMUR:
                intent.putExtra(Keys.SATUAN, Keys.REAMUR);
                break;
            case Keys.KELVIN:
                intent.putExtra(Keys.SATUAN, Keys.KELVIN);
                break;
            case Keys.FAHRENHEIT:
                intent.putExtra(Keys.SATUAN, Keys.FAHRENHEIT);
            default:
                break;
        }
        startActivity(intent);
    }
}
