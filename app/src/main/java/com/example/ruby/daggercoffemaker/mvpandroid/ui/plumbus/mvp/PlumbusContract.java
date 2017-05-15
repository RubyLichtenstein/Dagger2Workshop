package com.example.ruby.daggercoffemaker.mvpandroid.ui.plumbus.mvp;

import com.example.ruby.daggercoffemaker.mvpandroid.data.PlumbusModel;

/**
 * Created by Ruby on 5/15/2017.
 */

public interface PlumbusContract {
  interface View {
    void showData(PlumbusModel model);
  }

  interface Presenter {
    void loadData();
  }
}
