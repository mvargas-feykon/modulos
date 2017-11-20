package com.feykon.modulos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.feykon.library.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent ListSong = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(ListSong);
    }
}
