package za.co.mukitron.engineeringassistant;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Oil_Basic_1 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oil__basic_1);
    }

    public void basicOilTest(View view) {
        EditText em1 = (EditText) findViewById(R.id.moisture1);
        String sm1 = em1.getText().toString();
        int im1 = Integer.parseInt(sm1);
        TextView mTextView = (TextView) findViewById(
                R.id.c1);
        if (im1 >= 0 && im1 <= 10) {
            mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));

        } else if (im1 > 10 && im1 <= 20) {
            mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));
        } else mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));

        EditText ek1 = (EditText) findViewById(R.id.kv1);
        String sk1 = ek1.getText().toString();
        int ik1 = Integer.parseInt(sk1);
        TextView kvTextView = (TextView) findViewById(
                R.id.c2);
        if (ik1 >= 0 && ik1 <= 60) {
            kvTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));

        } else if (ik1 > 60 && ik1 <= 70) {
            kvTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));
        } else
            kvTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));


        EditText eh2 = (EditText) findViewById(R.id.h2);
        String sh2 = eh2.getText().toString();
        int ih2 = Integer.parseInt(sh2);
        TextView mTextView = (TextView) findViewById(
                R.id.h2);
        if (im1 >= 0 && im1 <= 150) {
            mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        } else if (im1 > 150 && im1 <= 1000) {
            mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));
        } else mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));


//        EditText eh2 = (EditText) findViewById(R.id.h2);
//        String sh2 = eh2.getText().toString();
//        int ih2 = Integer.parseInt(sh2);
//        TextView mTextView = (TextView) findViewById(
//                R.id.h2);
//        if (im1 >= 0 && im1 <= 150) {
//            mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
//        } else if (im1 > 150 && im1 <= 1000) {
//            mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));
//        }
//        else mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));;
//


    }
}
