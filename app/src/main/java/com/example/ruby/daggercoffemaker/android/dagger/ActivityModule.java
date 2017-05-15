package com.example.ruby.daggercoffemaker.android.dagger;

import android.app.Activity;
import com.example.ruby.daggercoffemaker.android.plain.MainActivity;
import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by Ruby on 5/14/2017.
 */

@Module(subcomponents = {IMainActivitySubcomponent.class})
public abstract class ActivityModule {

  @Binds
  @IntoMap
  @ActivityKey(MainActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindYourActivityInjectorFactory(IMainActivitySubcomponent.Builder builder);
}