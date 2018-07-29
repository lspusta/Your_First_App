package com.itkido.hello_world;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnDisplay;
    TextView txtContent;
    TextView editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDisplay = findViewById(R.id.btnDisplay);
        txtContent = findViewById(R.id.txtContent);
        editText = findViewById(R.id.editText);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtContent.setText(editText.getText());
            }
        });
    }
}
