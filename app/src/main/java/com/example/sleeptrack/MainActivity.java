package com.example.sleeptrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.EditText;

//import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    private String sleep_time = "-1";
    private String quality = "-1";
    private String energy = "-1";
    private String age = "-1";
    private String gender = "-1";
    private String height = "-1";
    private String weight = "-1";
    private String location = "-1";
    private String naps = "-1";
    private String sleep_type = "-1";
    private String diet = "-1";
    private int requestCode = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        //EditText editText = (EditText) findViewById(R.id.editText);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent,requestCode);

    }
    public void goStati(View view) {
        Intent myIntent=new Intent(MainActivity.this, Statistics.class);
        Bundle bundle=new Bundle();
        bundle.putString("age", age);
        bundle.putString("gender", gender);
        bundle.putString("height", height);
        bundle.putString("weight", weight);
        bundle.putString("location", location);
        bundle.putString("sleep_time", sleep_time);
        bundle.putString("naps", naps);
        bundle.putString("energy", energy);
        bundle.putString("quality", quality);
        bundle.putString("sleep_type", sleep_type);
        myIntent.putExtra("MyPackage", bundle);
        startActivity(myIntent);
    }
    public void goDaily(View view) {
        Intent intent = new Intent(this, DailyLog.class);
        startActivityForResult(intent,requestCode);
    }
    public void goAlarm(View view) {
        Intent intent = new Intent(this, AlarmSettings.class);
        //EditText editText = (EditText) findViewById(R.id.editText);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==1){
            sleep_time = data.getStringExtra("sleep_time");
            quality = data.getStringExtra("quality");
            energy = data.getStringExtra("energy");
        }
        else if (resultCode==2){
            gender = data.getStringExtra("gender");
            naps = data.getStringExtra("naps");
            sleep_type = data.getStringExtra("sleep_type");
            diet = data.getStringExtra("diet");
            age = data.getStringExtra("age");
            height = data.getStringExtra("height");
            weight = data.getStringExtra("weight");
            location = data.getStringExtra("location");
        }
    }
}
