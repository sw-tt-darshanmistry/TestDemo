package com.insiderapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

  private static final String TAG = MainActivity.class.getSimpleName();

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Log.e(TAG, "onCreate: -----------first line");
    Log.e(TAG, "onCreate: -----------QA line");
    Log.e(TAG, "onCreate: -----------QA phase 1 tag created");
    Log.e(TAG, "onCreate: -----------not include in tag");

    Log.e(TAG, "onCreate: -----------QA phase 1 tag added");
    Log.e(TAG, "onCreate: -----------QA phase 2 tag added");
  }
}
