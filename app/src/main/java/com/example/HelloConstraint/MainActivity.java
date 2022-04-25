package com.example.HelloConstraint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class
MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = MainActivity.EXTRA_MESSAGE;

    private int mCount = 0;
    private TextView mShowCount;
    private TextView mCurrentCount;


    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = (TextView) findViewById(R.id.show_count);

     }

    public void launchToastActivity(View view) {
        Log.d(LOG_TAG, "Hello Button Clicked");
        Intent intent = new Intent(this, ToastActivity.class);
        String CurrentCount = mCurrentCount.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, CurrentCount);
        startActivity(intent);

        /*
        //Load a message on the screen
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);

        toast.show();
         */
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}