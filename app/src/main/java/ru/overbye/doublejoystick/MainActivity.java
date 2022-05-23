package ru.overbye.doublejoystick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText latency;
    private CheckBox checkBox;
    private Button buttonConnect;
    private Button buttonSettings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        latency = findViewById(R.id.latency);
        checkBox = findViewById(R.id.checkBox);
        buttonConnect = findViewById(R.id.buttonConnect);
        buttonSettings = findViewById(R.id.buttonSettings);



        buttonConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.connect_info, Toast.LENGTH_LONG).show();
            }
        });

    }
}