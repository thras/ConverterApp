package gr.aueb.cf.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView amountText;
    private TextView DrachmasText;
    private Button convertBtn;
    private Double euros;
    private Double drachmas;
    static Double exchange_rate = 340.75;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amountText = findViewById(R.id.amountText);
        DrachmasText = findViewById(R.id.DrachmasText);
        convertBtn = findViewById(R.id.convertBtn);

        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                euros = Double.parseDouble(amountText.getText().toString().trim());
                drachmas = euros*exchange_rate;
                DrachmasText.setText(drachmas.toString());
            }
        });

    }
}