package com.example.sleeptrack;

//import android.content.Intent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
//import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    private Spinner spinner4, spinner5, spinner6, spinner7, spinner8, spinner9;
    private Button button6;
    private EditText editText, editText2, editText3, editText4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        saveProfileOnButton();
/*
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);*/
    }
    public void saveProfileOnButton(){

        spinner4 = (Spinner) findViewById(R.id.spinner4); // gender
        spinner5 = (Spinner) findViewById(R.id.spinner5); // ignore
        spinner6 = (Spinner) findViewById(R.id.spinner6); // naps
        spinner7 = (Spinner) findViewById(R.id.spinner7); // energy
        spinner8 = (Spinner) findViewById(R.id.spinner8); // sleep_type
        spinner9 = (Spinner) findViewById(R.id.spinner9); // diet
        editText = (EditText) findViewById(R.id.editText);// age
        editText2 = (EditText) findViewById(R.id.editText2); // height
        editText3 = (EditText) findViewById(R.id.editText3); // weight
        editText4 = (EditText) findViewById(R.id.editText4);//location
        button6 = (Button) findViewById(R.id.button6);

        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(DisplayMessageActivity.this,
                        "OnClickListener : " +
                                "\nSpinner 1 : "+ String.valueOf(spinner4.getSelectedItem()) +
                                "\nSpinner 2 : "+ String.valueOf(spinner5.getSelectedItem()) +
                                "\nSpinner 3 : "+ String.valueOf(spinner6.getSelectedItem()) +
                                "\nEditText "+ String.valueOf(editText.getText()),
                        Toast.LENGTH_SHORT).show();
                String gender = String.valueOf(spinner4.getSelectedItem());
                String naps = String.valueOf(spinner6.getSelectedItem());
                String sleep_type = String.valueOf(spinner8.getSelectedItem());
                String diet = String.valueOf(spinner9.getSelectedItem());
                String age = String.valueOf(editText.getText());
                String height = String.valueOf(editText2.getText());
                String weight = String.valueOf(editText3.getText());
                String location = String.valueOf(editText4.getText());
                Intent intent = new Intent();
                intent.putExtra("gender",gender);
                intent.putExtra("naps",naps);
                intent.putExtra("sleep_type",sleep_type);
                intent.putExtra("diet",diet);
                intent.putExtra("age",age);
                intent.putExtra("height",height);
                intent.putExtra("weight",weight);
                intent.putExtra("location",location);
                setResult(2,intent);
                onBackPressed();
            }

        });
    }
}
