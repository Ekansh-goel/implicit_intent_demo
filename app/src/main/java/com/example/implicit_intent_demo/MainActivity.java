package com.example.implicit_intent_demo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edt_call;
    private Button btn_call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_call = findViewById(R.id.edt_call);
        btn_call = findViewById(R.id.btn_call);
    }

    public void call(View view) {
        String mob = edt_call.getText().toString().trim();
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + mob));
        startActivity(intent);
    }

    public void web_open(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
        startActivity(intent);
    }
}
