package com.example.ruby.daggercoffemaker.android.plain;

import android.app.Activity;
import android.app.Application;
import com.example.ruby.daggercoffemaker.android.DaggerIApplicationComponent;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasDispatchingActivityInjector;
import javax.inject.Inject;

/**
 * Created by Ruby on 5/14/2017.
 */

public class MyApplication extends Application implements HasDispatchingActivityInjector {
  @Inject DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

  @Override
  public void onCreate() {
    super.onCreate();
    DaggerIApplicationComponent.create().inject(this);
  }

  @Override
  public DispatchingAndroidInjector<Activity> activityInjector() {
    return dispatchingAndroidInjector;
  }
}
