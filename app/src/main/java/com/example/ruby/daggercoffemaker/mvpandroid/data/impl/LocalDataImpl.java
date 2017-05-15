package com.example.ruby.daggercoffemaker.mvpandroid.data.impl;

import android.content.Context;
import com.example.ruby.daggercoffemaker.mvpandroid.data.PlumbusModel;
import com.example.ruby.daggercoffemaker.mvpandroid.data.abstarct.LocalData;
import javax.inject.Inject;

/**
 * Created by Ruby on 5/15/2017.
 */

public class LocalDataImpl implements LocalData {
  public Context context;

  @Inject public LocalDataImpl(Context context) {
    this.context = context;
  }

  @Override public PlumbusModel getFromLocal() {
    return new PlumbusModel();
  }
}
