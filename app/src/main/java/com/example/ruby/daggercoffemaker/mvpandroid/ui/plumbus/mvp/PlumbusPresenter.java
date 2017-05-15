package com.example.ruby.daggercoffemaker.mvpandroid.ui.plumbus.mvp;

import com.example.ruby.daggercoffemaker.mvpandroid.data.abstarct.Repository;
import javax.inject.Inject;

/**
 * Created by Ruby on 5/15/2017.
 */

public class PlumbusPresenter implements PlumbusContract.Presenter {
  Repository repository;
  PlumbusContract.View view;

  @Inject public PlumbusPresenter(Repository repository, PlumbusContract.View view) {
    this.repository = repository;
    this.view = view;
  }

  @Override public void loadData() {
    view.showData(repository.getPlumbusModel());
  }
}
