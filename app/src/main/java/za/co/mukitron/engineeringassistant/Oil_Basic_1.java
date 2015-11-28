package za.co.mukitron.engineeringassistant;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.TextUtils;
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

        //Moisture
        EditText em1 = (EditText) findViewById(R.id.moisture1);
        String sm1 = em1.getText().toString();

        TextView mTextView = (TextView) findViewById(R.id.c1);
        if (TextUtils.isEmpty(sm1)) {
            mTextView.setBackgroundColor(getResources().getColor(android.R.color.white));
        } else {
            int im1 = Integer.parseInt(sm1);
            if (im1 >= 0 && im1 <= 10) {
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            } else if (im1 > 10 && im1 <= 20) {
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));
            } else
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
        }
        //kV
        em1 = (EditText) findViewById(R.id.kv1);
        sm1 = em1.getText().toString();

        TextView kvTextView = (TextView) findViewById(R.id.c2);
        if (TextUtils.isEmpty(sm1)) {
            kvTextView.setBackgroundColor(getResources().getColor(android.R.color.white));
        } else {
            int ik1 = Integer.parseInt(sm1);
            if (ik1 >= 0 && ik1 <= 60) {
                kvTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            } else if (ik1 > 60 && ik1 <= 70) {
                kvTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));
            } else
                kvTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        }



        //Hydrogen
        EditText eh2 = (EditText) findViewById(R.id.h2);
        String sh2 = eh2.getText().toString();

        TextView h2TextView = (TextView) findViewById(R.id.ch2);
        if (TextUtils.isEmpty(sh2)) {
            h2TextView.setBackgroundColor(getResources().getColor(android.R.color.white));
        } else {
            int im1 = Integer.parseInt(sh2);
            if (im1 >= 0 && im1 <= 150) {
                h2TextView.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            } else if (im1 > 150 && im1 <= 1000) {
                h2TextView.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));
            } else
                h2TextView.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
        }
        //Carbon Monoxide
        eh2 = (EditText) findViewById(R.id.co);
        sh2 = eh2.getText().toString();

        mTextView = (TextView) findViewById(R.id.cCO);
        if (TextUtils.isEmpty(sh2)) {
            mTextView.setBackgroundColor(getResources().getColor(android.R.color.white));
        } else {
            int im1 = Integer.parseInt(sh2);
            if (im1 >= 0 && im1 <= 500) {
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            } else if (im1 > 500 && im1 <= 1000) {
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));
            } else
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
        }

        //Carbon Dioxide
        eh2 = (EditText) findViewById(R.id.co2);
        sh2 = eh2.getText().toString();

        mTextView = (TextView) findViewById(R.id.cCO2);
        if (TextUtils.isEmpty(sh2)) {
            mTextView.setBackgroundColor(getResources().getColor(android.R.color.white));
        } else {
            int im1 = Integer.parseInt(sh2);
            if (im1 >= 0 && im1 <= 10000) {
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            } else if (im1 > 10000 && im1 <= 15000) {
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));
            } else
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
        }
        //Methane
        eh2 = (EditText) findViewById(R.id.ch4);
        sh2 = eh2.getText().toString();

        mTextView = (TextView) findViewById(R.id.cCH4);
        if (TextUtils.isEmpty(sh2)) {
            mTextView.setBackgroundColor(getResources().getColor(android.R.color.white));
        } else {
            int im1 = Integer.parseInt(sh2);
            if (im1 >= 0 && im1 <= 25) {
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            } else if (im1 > 25 && im1 <= 80) {
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));
            } else
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
        }
        //Ethane
        eh2 = (EditText) findViewById(R.id.c2h6);
        sh2 = eh2.getText().toString();

        mTextView = (TextView) findViewById(R.id.cC2H6);
        if (TextUtils.isEmpty(sh2)) {
            mTextView.setBackgroundColor(getResources().getColor(android.R.color.white));
        } else {
            int im1 = Integer.parseInt(sh2);
            if (im1 >= 0 && im1 <= 10) {
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            } else if (im1 > 10 && im1 <= 35) {
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));
            } else
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
        }
        //Ethylene
        eh2 = (EditText) findViewById(R.id.c2h4);
        sh2 = eh2.getText().toString();

        mTextView = (TextView) findViewById(R.id.cC2H4);
        if (TextUtils.isEmpty(sh2)) {
            mTextView.setBackgroundColor(getResources().getColor(android.R.color.white));
        } else {
            int im1 = Integer.parseInt(sh2);
            if (im1 >= 0 && im1 <= 20) {
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            } else if (im1 > 20 && im1 <= 100) {
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));
            } else
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
        }

        //Acetylene
        eh2 = (EditText) findViewById(R.id.c2h2);
        sh2 = eh2.getText().toString();

        mTextView = (TextView) findViewById(R.id.cC2H2);
        if (TextUtils.isEmpty(sh2)) {
            mTextView.setBackgroundColor(getResources().getColor(android.R.color.white));
        } else {
            int im1 = Integer.parseInt(sh2);
            if (im1 >= 0 && im1 <= 15) {
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            } else if (im1 > 15 && im1 <= 70) {
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));
            } else
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
        }
        //dp
        eh2 = (EditText) findViewById(R.id.dp);
        sh2 = eh2.getText().toString();

        mTextView = (TextView) findViewById(R.id.cdp);
        if (TextUtils.isEmpty(sh2)) {
            mTextView.setBackgroundColor(getResources().getColor(android.R.color.white));
        } else {
            int im1 = Integer.parseInt(sh2);
            if (im1 >= 0 && im1 <= 450) {
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            } else if (im1 > 450 && im1 <= 600) {
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));
            } else
                mTextView.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        }

    }
}
