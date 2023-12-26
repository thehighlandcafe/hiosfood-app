package com.nugget.hios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nugget.hios.ui.tc.TcFragment;

public class TcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, TcFragment.newInstance())
                    .commitNow();
        }
    }
}
