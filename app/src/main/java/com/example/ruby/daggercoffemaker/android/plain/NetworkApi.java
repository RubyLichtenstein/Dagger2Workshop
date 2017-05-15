package com.example.ruby.daggercoffemaker.android.plain;

import javax.inject.Inject;

/**
 * Created by Ruby on 5/14/2017.
 */

public class NetworkApi {

  /**
   * Tells Dagger that an object of this class is injectable into other objects. Dagger automatically
   * calls this constructor, if an instance of this class is requested.
   */
  @Inject public NetworkApi() {
  }

  public boolean validateUser(String username, String password) {
    // imagine an actual network call here
    // for demo purpose return false in "real" life
    if (username == null || username.length() == 0) {
      return false;
    } else {
      return true;
    }
  }
}