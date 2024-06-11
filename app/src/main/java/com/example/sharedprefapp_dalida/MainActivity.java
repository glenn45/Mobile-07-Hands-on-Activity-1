package com.example.sharedprefapp_dalida;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends Activity {

    EditText et1;
    EditText et2;
    EditText et3;
    Button bt;
    String myPreference = "MyPrefs";
    String name = "+";
    String password = "passKey";
    String email = "emailKey";

    SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        bt = findViewById(R.id.bt);
        sharedPref = getSharedPreferences(myPreference, Context.MODE_PRIVATE);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = et1.getText().toString();
                String pw = et2.getText().toString();
                String e = et3.getText().toString();

                SharedPreferences.Editor editor = sharedPref.edit();

                editor.putString(name,n);
                editor.putString(password,pw);
                editor.putString(email,e);
                editor.commit();
                Toast.makeText(MainActivity.this,"Thanks",Toast.LENGTH_LONG).show();
            }
        });

    }






}