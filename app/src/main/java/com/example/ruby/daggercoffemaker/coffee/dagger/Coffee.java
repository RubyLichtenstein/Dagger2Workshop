package com.example.ruby.daggercoffemaker.coffee.dagger;

import com.example.ruby.daggercoffemaker.coffee.code.CoffeeMaker;
import dagger.Component;
import javax.inject.Singleton;

/**
 * Created by Ruby on 5/14/2017.
 *
 */

@Singleton
@Component(modules = { DripCoffeeModule.class })
public interface Coffee {
  CoffeeMaker maker();
}