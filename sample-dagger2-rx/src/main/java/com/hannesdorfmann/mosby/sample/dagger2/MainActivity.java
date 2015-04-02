package com.hannesdorfmann.mosby.sample.dagger2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import com.hannesdorfmann.mosby.sample.dagger2.repos.ReposFragment;

public class MainActivity extends ActionBarActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    if (savedInstanceState == null) {
      getSupportFragmentManager().beginTransaction()
          .add(R.id.fragmentContainer, new ReposFragment())
          .commit();
    }
  }
}
