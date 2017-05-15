package com.example.ruby.daggercoffemaker.mvpandroid.ui.plumbus.dagger;

import android.content.Context;
import com.example.ruby.daggercoffemaker.mvpandroid.data.abstarct.Repository;
import com.example.ruby.daggercoffemaker.mvpandroid.ui.plumbus.mvp.PlumbusContract;
import com.example.ruby.daggercoffemaker.mvpandroid.ui.plumbus.mvp.PlumbusPresenter;
import com.example.ruby.daggercoffemaker.mvpandroid.ui.plumbus.mvp.PlumbusView;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Ruby on 5/15/2017.
 */
@Module public class PlumbusModule {
  @Provides PlumbusContract.View provideContractPlumbusView(Context context) {
    return new PlumbusView(context);
  }

  @Provides PlumbusView providePlumbusView(Context context) {
    return new PlumbusView(context);
  }

  @Provides PlumbusPresenter providePlumbusPresenter(Repository repository,
      PlumbusContract.View view) {
    return new PlumbusPresenter(repository, view);
  }
}
