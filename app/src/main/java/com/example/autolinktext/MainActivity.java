package com.example.autolinktext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text);

        textView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) { //implict intent
        if(view.getId() == R.id.text){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:098990"));
            startActivity(intent);
        }
    }
}