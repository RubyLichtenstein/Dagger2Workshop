package com.example.ruby.daggercoffemaker.mvpandroid.application;

import android.app.Application;
import android.content.Context;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by Ruby on 5/15/2017.
 */

@Module public class AppModule {
  private Application application;

  public AppModule(Application application) {
    this.application = application;
  }

  /**
   * The method names for the providers,
   * such as provideContext(),
   * are not important and can be named anything you like.
   * Dagger only looks at the return type.
   */
  @Provides @Singleton public Context provideContext() {
    return application;
  }
}
