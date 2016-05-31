package com.cemalyaver.activity_veri_aktarimi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class deneme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deneme);

        TextView sonuc=(TextView)findViewById(R.id.sonuc);

        /*Bundle veri = getIntent().getExtras();
       sonuc.setText(veri.getString("gonderilen"));*/

        sonuc.setText(getIntent().getExtras().getString("veri"));
    }
}
