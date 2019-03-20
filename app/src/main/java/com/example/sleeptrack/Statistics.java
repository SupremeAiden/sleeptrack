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
        int a = Integer.parseInt(age);
        int h = Integer.parseInt(height);
        int w = Integer.parseInt(weight);
        int s = Integer.parseInt(sleep_time);
        int q = Integer.parseInt(quality);
        int d = 0;
        TextView T1 = (TextView) findViewById(R.id.EstSleepTime);
        if (a<12){
            T1.setText("Suitable Sleep time:10 hrs");
            d = s - 10;
        }
        else if (a<40){
            T1.setText("Suitable Sleep time:8 hrs");
            d = s - 8;
        }
        else{
            T1.setText("Suitable Sleep time:6 hrs");
            d = s - 6;
        }
        TextView T2 = (TextView) findViewById(R.id.DiffSleeptime);
        if (d<0){
            T2.setText("You need sleep more");
        }
        else{
            T2.setText("You need sleep less");
        }

        TextView T3 = (TextView) findViewById(R.id.HealthState);
        if (d<0&& diet =="unhealthy"){
            T3.setText("Your health state is bad");
        }
        else{
            T3.setText("Your health state is good");
        }

        TextView T4 = (TextView) findViewById(R.id.WeightState);
        if (w>= h-105){
            T4.setText("Good sleep help you lose weight");
        }
        else{
            T4.setText("Good sleep help you increase weight");
        }
        TextView T5 = (TextView) findViewById(R.id.LocationRate);
        if (q>5){
            T5.setText("Your home is a good place for sleeping");
        }
        else{
            T5.setText("Your home is a bad place for sleeping");
        }
    }
}
