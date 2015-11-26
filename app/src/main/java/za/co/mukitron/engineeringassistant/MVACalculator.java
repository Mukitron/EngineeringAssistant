package za.co.mukitron.engineeringassistant;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MVACalculator extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvacalculator);
    }


    public void calculate(View view) {
        EditText eMVA = (EditText) findViewById(R.id.mva);
        String sMVA = eMVA.getText().toString();
        int iMVA = Integer.parseInt(sMVA);
        EditText eKV = (EditText) findViewById(R.id.kv);
        String sKV = eKV.getText().toString();
        int iKV = Integer.parseInt(sKV);

        double result = (iMVA * 1000000) / (Math.sqrt(3) * 1000 * iKV);
        DecimalFormat f = new DecimalFormat("##.00");
        String answer = f.format(result);

        TextView currentTextView = (TextView) findViewById(
                R.id.current);
        currentTextView.setText("" + answer + " A");


    }
}
