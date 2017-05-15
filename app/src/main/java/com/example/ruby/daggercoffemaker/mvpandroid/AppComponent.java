package com.example.ruby.daggercoffemaker.mvpandroid;

import dagger.Component;
import javax.inject.Singleton;

/**
 * Created by Ruby on 5/15/2017.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
}
