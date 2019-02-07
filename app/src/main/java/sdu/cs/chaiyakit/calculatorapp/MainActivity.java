package sdu.cs.chaiyakit.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText number1EditText = findViewById(R.id.edtNumber1);
        final EditText number2EditText = findViewById(R.id.edtNumber2);
        Button addButton = findViewById(R.id.btAdd);
        final TextView resultTextView = findViewById(R.id.tvResult);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(number1EditText.getText().toString());
                int num2 = Integer.parseInt(number2EditText.getText().toString());
                int result = num1 + num2;
                resultTextView.setText(result + "");
            }
        });

    }//end onCreats
}//end class



