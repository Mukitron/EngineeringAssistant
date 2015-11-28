package za.co.mukitron.engineeringassistant;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import java.text.DecimalFormat;
import java.lang.Math;

public class Normalise_Moisture extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normalise__moisture);
    }

    public void normaliseMoisture(View view) {
        EditText eMoisture = (EditText) findViewById(R.id.moisture);
        String sMoisture = eMoisture.getText().toString();
        EditText eTemps = (EditText) findViewById(R.id.tempS);
        String sTemps = eTemps.getText().toString();

        if (TextUtils.isEmpty(sMoisture) || TextUtils.isEmpty(sTemps)) {
            TextView currentTextView = (TextView) findViewById(R.id.normalisedMoisture);
            currentTextView.setText("Please enter required values");
        } else {
            int iMoisture = Integer.parseInt(sMoisture);
            int iTemps = Integer.parseInt(sTemps);

            double result = iMoisture * 2.24 * (Math.exp((-0.04 * iTemps)));
            DecimalFormat f = new DecimalFormat("##.00");
            String answer = f.format(result);

            TextView currentTextView = (TextView) findViewById(
                    R.id.normalisedMoisture);
            currentTextView.setText(answer + "ppm");
        }

    }
}
