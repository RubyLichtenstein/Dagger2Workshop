package com.example.ruby.daggercoffemaker.android.dagger;

import com.example.ruby.daggercoffemaker.android.plain.MyApplication;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by Ruby on 5/14/2017.
 */


@Component(modules = {ActivityModule.class, AndroidInjectionModule.class})
public interface IApplicationComponent {
  void inject(MyApplication application);
}
