package com.example.ruby.daggercoffemaker.coffee;

import com.example.ruby.daggercoffemaker.coffee.dagger.Coffee;
import com.example.ruby.daggercoffemaker.coffee.dagger.DaggerCoffee;

public class CoffeeApp {
  public static void main(String[] args) {
    Coffee coffee = DaggerCoffee.builder().build();
    coffee.maker().brew();
  }
}
