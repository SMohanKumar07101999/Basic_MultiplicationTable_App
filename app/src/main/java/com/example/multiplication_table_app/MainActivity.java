package com.example.multiplication_table_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView heading;
    TextView answer;
    Button multiplier;
    EditText userinput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        heading= findViewById(R.id.heading);
        answer=findViewById(R.id.result_view);
        multiplier=findViewById(R.id.multiplier);
        userinput=findViewById(R.id.Userinput);

        multiplier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=userinput.getText().toString();
                int number=Integer.parseInt(s);
                answer.setText(number+" "+"x 1"+"="+number*1 +"\n"+"\n"+
                        number +" "+"x 2"+"="+number*2 +"\n"+"\n"+
                        number +" "+"x 3"+"="+number*3 +"\n"+"\n"+
                        number +" "+"x 4"+"="+number*4 +"\n"+"\n"+
                        number +" "+"x 5"+"="+number*5 +"\n"+"\n"+
                        number +" "+"x 6"+"="+number*6 +"\n"+"\n"+
                        number +" "+"x 7"+"="+number*7 +"\n"+"\n"+
                        number +" "+"x 8"+"="+number*8 +"\n"+"\n"+
                        number +" "+"x 9"+"="+number*9 +"\n"+ "\n"+
                        number +" "+"x 10"+"="+number*10 +"\n"+"+\n");



            }
        });

    }
}