package com.example.asus.yudhabhaktiislami_1202154203_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //memanggil id agar variabel berfungsi
        final EditText username = (EditText) findViewById(R.id.userName);
        final EditText password = (EditText) findViewById(R.id.password);
        Button login = (Button) findViewById(R.id.Login);

        //menginisasi dan memanggil id agar dapat berfungsi
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //membuat pengkondisian jika password benar akan pindah ke activity selanjutnya jika salah tetap stay diactivity ini dan akan ada toast yang mengingatkan
                String user_name = username.getText().toString();
                String pass_ =  password.getText().toString();
                if (user_name.equals("EAD")&&pass_.equals("MOBILE")){
                    Toast.makeText(getApplicationContext(),"Username dan Password benar Anda berhasil Login",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Username dan Password tidak sesuai Anda gagal Login",Toast.LENGTH_SHORT).show();
                }
                Intent list = new Intent(getApplicationContext(),ListAirMineral.class);
                startActivity(list);
            }
        });
    }
}