package com.syifa.a140810160026;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private String celcius = "Celcius : ";
    private String Reamur = "Reamur : ";
    private String Farenheit = "Farenheit : ";
    private String Kelvin = "Kelvin : ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClikKonversi(View view){
        try {
            EditText getSuhu = (EditText) findViewById(R.id.editSuhu);
            EditText getSatuan = (EditText) findViewById(R.id.editSatuan);
            String suhu = getSuhu.getText().toString();
            String satuan = getSatuan.getText().toString();
            if (! suhu.isEmpty() || ! satuan.isEmpty()){
                switch (satuan){
                    case satuan="celcius":
                        break;
                    case satuan="reamur":
                        break;
                    case satuan="farenheit":
                        break;
                    case satuan="kelvin":
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public void openAvtivity2(){
        Intent i = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(i);
    }

}
