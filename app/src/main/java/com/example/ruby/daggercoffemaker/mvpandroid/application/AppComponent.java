package com.example.ruby.daggercoffemaker.mvpandroid.application;

import com.example.ruby.daggercoffemaker.mvpandroid.data.dagger.DataModule;
import com.example.ruby.daggercoffemaker.mvpandroid.ui.plumbus.PlumbusActivity;
import com.example.ruby.daggercoffemaker.mvpandroid.ui.plumbus.dagger.PlumbusModule;
import dagger.Component;
import javax.inject.Singleton;

/**
 * Created by Ruby on 5/15/2017.
 */

@Singleton @Component(modules = { AppModule.class, DataModule.class , PlumbusModule.class})
public interface AppComponent {
  void inject(PlumbusActivity target);
}
