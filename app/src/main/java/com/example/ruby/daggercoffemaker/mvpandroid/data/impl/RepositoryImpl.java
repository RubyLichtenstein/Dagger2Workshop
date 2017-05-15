package com.example.ruby.daggercoffemaker.mvpandroid.data.impl;

import com.example.ruby.daggercoffemaker.mvpandroid.data.PlumbusModel;
import com.example.ruby.daggercoffemaker.mvpandroid.data.abstarct.LocalData;
import com.example.ruby.daggercoffemaker.mvpandroid.data.abstarct.RemoteData;
import com.example.ruby.daggercoffemaker.mvpandroid.data.abstarct.Repository;
import javax.inject.Inject;

/**
 * Created by Ruby on 5/15/2017.
 */

public class RepositoryImpl implements Repository {
  public LocalData localData;
  public RemoteData remoteData;

  @Inject public RepositoryImpl(LocalData localData, RemoteData remoteData) {
    this.localData = localData;
    this.remoteData = remoteData;
  }

  @Override public PlumbusModel getPlumbusModel() {
    return localData.getFromLocal();
  }
}
