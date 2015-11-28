package za.co.mukitron.engineeringassistant;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void startSilica(View v) {
        startActivity(new Intent(MainActivity.this, SilicaCalculator.class));
    }

    public void startMVA(View v) {
        startActivity(new Intent(MainActivity.this, MVACalculator.class));
    }

    public void startNormalise(View v) {
        startActivity(new Intent(MainActivity.this, Normalise_Moisture.class));
    }

    public void startOilBasic(View v) {
        startActivity(new Intent(MainActivity.this, Oil_Basic_1.class));
    }
}

