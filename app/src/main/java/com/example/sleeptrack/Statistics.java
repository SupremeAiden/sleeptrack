package com.example.sleeptrack;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class Statistics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        Intent intent=getIntent();
        Bundle packageFromCaller = intent.getBundleExtra("MyPackage");
        String age = packageFromCaller.getString("age");
        String gender = packageFromCaller.getString("gender");
        String height = packageFromCaller.getString("height");
        String weight = packageFromCaller.getString("weight");
        String location = packageFromCaller.getString("location");
        String sleep_time = packageFromCaller.getString("sleep_time");
        String naps = packageFromCaller.getString("naps");
        String energy = packageFromCaller.getString("energy");
        String quality = packageFromCaller.getString("quality");
        String sleep_type = packageFromCaller.getString("sleep_type");
        String diet = packageFromCaller.getString("diet");
        TextView T1 = (TextView) findViewById(R.id.EstSleepTime);
        T1.setText(age);
        TextView T2 = (TextView) findViewById(R.id.DiffSleeptime);
        T2.setText(gender);
        TextView T3 = (TextView) findViewById(R.id.HealthState);
        T3.setText(height);
        TextView T4 = (TextView) findViewById(R.id.WeightState);
        T4.setText(weight);
        TextView T5 = (TextView) findViewById(R.id.LocationRate);
        T5.setText(sleep_time+energy+quality);
    }
}
