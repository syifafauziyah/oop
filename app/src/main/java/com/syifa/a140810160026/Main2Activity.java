package com.syifa.a140810160026;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private Convert convert;
    private String satuan;
    private Double value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value = (Double) extras.get(Keys.VAL);
            satuan = (String) extras.get(Keys.SATUAN);

            this.initConvertValue();
            this.showConvertedValue();
            this.onButtonBack();
        } else {
            Toast.makeText(this, "No value provide", Toast.LENGTH_SHORT).show();
        }

    }

    /*
     * Show the converted value*/
    private void showConvertedValue() {
        TextView valCelcius = findViewById(R.id.val_celcius);
        valCelcius.setText("Celcius : " + convert.getCelcius());

        TextView valReamur = findViewById(R.id.val_reamur);
        valReamur.setText("Reamur : " + convert.getReamur());

        TextView valKelvin = findViewById(R.id.val_kelvin);
        valKelvin.setText("Kelvin :" + convert.getKelvin());

        TextView valFahrenheit = findViewById(R.id.val_fahrenheit);
        valFahrenheit.setText("Fahrenheit : " + convert.getFarenheit());
    }

    /*
     * Cek jenis satuan, lalu construct @convert sesuai jenisnya*/
    private void initConvertValue() {
        switch (satuan) {
            case Keys.CELCIUS:
                this.convert = new Convert(value, Keys.CELCIUS);
                break;

            case Keys.REAMUR:
                this.convert = new Convert(value, Keys.REAMUR);
                break;

            case Keys.KELVIN:
                this.convert = new Convert(value, Keys.KELVIN);
                break;

            case Keys.FAHRENHEIT:
                this.convert = new Convert(value, Keys.FAHRENHEIT);
                break;
        }
    }

    public void onButtonBack() {
        findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
