package com.example.homework_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Test_2 extends AppCompatActivity {

    private EditText editText;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        editText = findViewById(R.id.edt_text);
        String a1 = getIntent().getStringExtra("Test_2");
        if (a1 != null){
            editText.setText(a1);
        }

        findViewById(R.id.btn_export).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Test_2.this, MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("Test_2", editText.getText().toString());
                startActivity(intent);
            }
        });

    }

}