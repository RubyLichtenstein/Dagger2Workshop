package com.example.ruby.daggercoffemaker.mvpandroid.ui.plumbus;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.example.ruby.daggercoffemaker.mvpandroid.application.PlumbusApplication;
import com.example.ruby.daggercoffemaker.mvpandroid.data.impl.RepositoryImpl;
import com.example.ruby.daggercoffemaker.mvpandroid.ui.plumbus.mvp.PlumbusPresenter;
import com.example.ruby.daggercoffemaker.mvpandroid.ui.plumbus.mvp.PlumbusView;
import javax.inject.Inject;

/**
 * Created by Ruby on 5/15/2017.
 */

public class PlumbusActivity extends AppCompatActivity {

  @Inject RepositoryImpl repositoryImpl;
  @Inject PlumbusView view;
  @Inject PlumbusPresenter presenter;

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ((PlumbusApplication) getApplication()).getAppComponent().inject(this);
    setContentView(view);
    presenter.loadData();
  }
}
