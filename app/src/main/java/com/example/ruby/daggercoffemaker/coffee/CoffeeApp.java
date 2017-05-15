package com.example.ruby.daggercoffemaker.coffee;

import com.example.ruby.daggercoffemaker.coffee.code.DaggerCoffee;
import com.example.ruby.daggercoffemaker.coffee.dagger.Coffee;

public class CoffeeApp {
  public static void main(String[] args) {
    Coffee coffee = DaggerCoffee.builder().build();
    coffee.maker().brew();
  }
}
