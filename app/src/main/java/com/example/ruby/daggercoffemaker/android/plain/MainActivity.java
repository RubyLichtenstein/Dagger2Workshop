package com.example.ruby.daggercoffemaker.android.plain;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.ruby.daggercoffemaker.R;
import dagger.android.AndroidInjection;
import javax.inject.Inject;

/**
 * Created by Ruby on 5/14/2017.
 */

public class MainActivity extends Activity {

  @Inject NetworkApi networkApi;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    AndroidInjection.inject(this);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    testInjection();
  }

  private void testInjection() {
    boolean injected =  networkApi == null ? false : true;
    TextView userAvailable = (TextView) findViewById(R.id.target);
    userAvailable.setText("Dependency injection worked: " + String.valueOf(injected));
  }
}
