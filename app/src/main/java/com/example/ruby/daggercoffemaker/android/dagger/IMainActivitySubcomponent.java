package com.example.ruby.daggercoffemaker.android.dagger;

import com.example.ruby.daggercoffemaker.android.plain.MainActivity;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by Ruby on 5/14/2017.
 */

@Subcomponent
public interface IMainActivitySubcomponent extends AndroidInjector<MainActivity> {

  @Subcomponent.Builder
  abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
}
