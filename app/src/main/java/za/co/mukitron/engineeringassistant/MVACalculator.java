package za.co.mukitron.engineeringassistant;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

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
        EditText eKV = (EditText) findViewById(R.id.kv);
        String sKV = eKV.getText().toString();
        EditText eCurrent = (EditText) findViewById(R.id.current);
        String sCurrent = eCurrent.getText().toString();

        if (TextUtils.isEmpty(sMVA) || TextUtils.isEmpty(sKV) || TextUtils.isEmpty(sCurrent)) {
            TextView currentTextView = (TextView) findViewById(R.id.maxoutput);
            currentTextView.setText("Please enter required values");
        } else {
            int iMVA = Integer.parseInt(sMVA);
            int iKV = Integer.parseInt(sKV);
            int iCurrent = Integer.parseInt(sCurrent);

            double result = (iMVA * 1000000) / (Math.sqrt(3) * 1000 * iKV);
            DecimalFormat f = new DecimalFormat("##.00");
            String answer = f.format(result);

            double loading = (iCurrent/result *100);
            String sloading = f.format(loading);

            TextView currentTextView = (TextView) findViewById(R.id.maxoutput);
            currentTextView.setText("Max current = " + "" + answer + " A" );

            TextView loadingTextView = (TextView) findViewById(R.id.currentoutput);
            loadingTextView.setText("Transformer is " + "" + sloading + "% loaded" );
        }

    }
}
