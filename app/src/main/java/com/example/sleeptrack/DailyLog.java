package com.example.sleeptrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class DailyLog extends AppCompatActivity {

    private Spinner spinner, spinner2, spinner3;
    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_log);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        spinner = (Spinner) findViewById(R.id.spinner); // quality
        spinner2 = (Spinner) findViewById(R.id.spinner2); // energy
        spinner3 = (Spinner) findViewById(R.id.spinner3); // sleep time
        button5 = (Button) findViewById(R.id.button5);

        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(DailyLog.this,
                        "OnClickListener : " +
                                "\nSpinner 1 : " + String.valueOf(spinner.getSelectedItem()) +
                                "\nSpinner 2 : " + String.valueOf(spinner2.getSelectedItem()) +
                                "\nSpinner 3 : " + String.valueOf(spinner3.getSelectedItem()),
                        Toast.LENGTH_SHORT).show();
                String sleep_time = String.valueOf(spinner3.getSelectedItem());
                String quality = String.valueOf(spinner.getSelectedItem());
                String energy = String.valueOf(spinner2.getSelectedItem());
                Intent intent = new Intent();
                intent.putExtra("sleep_time",sleep_time);
                intent.putExtra("quality",quality);
                intent.putExtra("energy",energy);
                setResult(1,intent);
                onBackPressed();
            }

        });
    }
}
