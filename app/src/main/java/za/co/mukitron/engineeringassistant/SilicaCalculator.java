package za.co.mukitron.engineeringassistant;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class SilicaCalculator extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silica_calculator);
    }

    public void silicaSizing(View view) {
        EditText eoVol = (EditText) findViewById(R.id.oilVolume);
        String soVol = eoVol.getText().toString();

        String result = "";
        if (TextUtils.isEmpty(soVol)) {
            TextView currentTextView = (TextView) findViewById(
                    R.id.breather);
            currentTextView.setText("Please enter required values");
        } else {
            int ioVol = Integer.parseInt(soVol);
            if (ioVol >= 0 && ioVol <= 1700) {
                result = "Minimum Breather type is  SA 90";
            } else if (ioVol > 1700 && ioVol <= 3800) {
                result = "Minimum Breather type is SA 100-2";
            } else if (ioVol > 3800 && ioVol <= 5600) {
                result = "Minimum Breather type is SA 100-3";
            } else if (ioVol > 5600 && ioVol <= 7600) {
                result = "Minimum Breather type is SA 100-4";
            } else if (ioVol > 7600 && ioVol <= 9600) {
                result = "Minimum Breather type is SA 100-5";
            } else if (ioVol > 9600 && ioVol <= 11600) {
                result = "Minimum Breather type is SA 100-6";
            } else if (ioVol > 11600 && ioVol <= 13000) {
                result = "Minimum Breather type is SA 200-2";
            } else if (ioVol > 13000 && ioVol <= 19000) {
                result = "Minimum Breather type is SA 200-3";
            } else if (ioVol > 19000 && ioVol <= 25000) {
                result = "Minimum Breather type is SA 200-4";
            } else if (ioVol > 25000 && ioVol <= 31500) {
                result = "Minimum Breather type is SA 200-5";
            } else if (ioVol > 31500 && ioVol <= 37500) {
                result = "Minimum Breather type is SA 200-6";
            } else if (ioVol > 37500 && ioVol <= 43500) {
                result = "Minimum Breather type is SA 200-7";
            } else if (ioVol > 43500 && ioVol <= 50000) {
                result = "Minimum Breather type is SA 200-8";
            } else
                result = "No single breather type for this volume";

            TextView currentTextView = (TextView) findViewById(
                    R.id.breather);
            currentTextView.setText(result);
        }

    }
}
