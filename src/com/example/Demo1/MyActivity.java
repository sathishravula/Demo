package com.example.Demo1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MyActivity extends Activity {
  /**
   * Called when the activity is first created.
   */
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
      Log.d("test","oncreate");
      Log.d("addedby","mithun");
      Log.d("addedBy","akash");
  }
}
