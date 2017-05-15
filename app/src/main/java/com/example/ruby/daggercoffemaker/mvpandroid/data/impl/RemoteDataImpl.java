package com.example.ruby.daggercoffemaker.mvpandroid.data.impl;

import android.content.Context;
import com.example.ruby.daggercoffemaker.mvpandroid.data.PlumbusModel;
import com.example.ruby.daggercoffemaker.mvpandroid.data.abstarct.RemoteData;
import javax.inject.Inject;

/**
 * Created by Ruby on 5/15/2017.
 *
 */

public class RemoteDataImpl implements RemoteData {
  public Context context;

  @Inject public RemoteDataImpl(Context context) {
    this.context = context;
  }

  @Override public PlumbusModel getFromRemote() {
    return new PlumbusModel();
  }
}
