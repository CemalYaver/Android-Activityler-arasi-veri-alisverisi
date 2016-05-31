package com.cemalyaver.activity_veri_aktarimi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       Button btnsifre=(Button)findViewById(R.id.button1);
        final EditText editText= (EditText) findViewById(R.id.editText);
        btnsifre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*Intent intent = new Intent(getApplicationContext(),deneme.class);
                Bundle  bundle = new Bundle();
                bundle.putString("gonderilen", String.valueOf(editText));
                intent.putExtras(bundle);
                startActivity(intent);*/


                Intent intent = new Intent(MainActivity.this,deneme.class);
                intent.putExtra("veri", editText.getText().toString());
                startActivity(intent);
            }
        });

    }
}
