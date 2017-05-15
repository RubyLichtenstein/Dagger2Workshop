package com.example.ruby.daggercoffemaker.coffee.dagger;

import com.example.ruby.daggercoffemaker.coffee.code.Pump;
import com.example.ruby.daggercoffemaker.coffee.code.Thermosiphon;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class PumpModule {
  @Binds
  abstract Pump providePump(Thermosiphon pump);
}
