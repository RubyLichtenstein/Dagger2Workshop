package com.example.ruby.daggercoffemaker.mvpandroid.application;

import android.app.Application;

/**
 * Created by Ruby on 5/15/2017.
 *
 */

public class PlumbusApplication extends Application {
  private AppComponent appComponent;

  @Override public void onCreate() {
    super.onCreate();
    appComponent = initDagger(this);
  }

  public AppComponent getAppComponent() {
    return appComponent;
  }

  protected AppComponent initDagger(PlumbusApplication application) {
    return DaggerAppComponent.builder().appModule(new AppModule(application)).build();
  }
}
