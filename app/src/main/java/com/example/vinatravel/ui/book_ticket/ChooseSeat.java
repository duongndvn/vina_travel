package com.example.vinatravel.ui.book_ticket;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.vinatravel.R;

public class ChooseSeat extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_seat_screen);
        Intent intent = getIntent();
        String name = intent.getStringExtra("chooseSeat");
        Log.d("AAA", String.valueOf(name));
    }
}