package com.example.ruby.daggercoffemaker.mvpandroid;

import android.app.Application;

/**
 * Created by Ruby on 5/15/2017.
 */

public class App extends Application {
  private AppComponent appComponent;

  public AppComponent getAppComponent() {
    return appComponent;
  }

  protected AppComponent initDagger(App application) {
    return DaggerAppComponent.builder()
        .appModule(new AppModule(application))
        .build();
  }
}
