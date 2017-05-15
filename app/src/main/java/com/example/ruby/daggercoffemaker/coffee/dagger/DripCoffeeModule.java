package com.example.ruby.daggercoffemaker.coffee.dagger;

import com.example.ruby.daggercoffemaker.coffee.code.ElectricHeater;
import com.example.ruby.daggercoffemaker.coffee.code.Heater;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module(includes = PumpModule.class) public class DripCoffeeModule {
  @Provides @Singleton Heater provideHeater() {
    return new ElectricHeater();
  }
}
