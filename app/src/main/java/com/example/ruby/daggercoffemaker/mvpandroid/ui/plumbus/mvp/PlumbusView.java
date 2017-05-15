package com.example.ruby.daggercoffemaker.mvpandroid.ui.plumbus.mvp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.ruby.daggercoffemaker.R;
import com.example.ruby.daggercoffemaker.mvpandroid.data.PlumbusModel;
import javax.inject.Inject;

/**
 * Created by Ruby on 5/15/2017.
 */

public class PlumbusView extends LinearLayout implements PlumbusContract.View {

  TextView tvPlumbus;

  @Inject public PlumbusView(Context context) {
    super(context);
    init(context);
  }

  private void init(Context context) {
    View view = LayoutInflater.from(context).inflate(R.layout.plumbus_layout, this, true);
    tvPlumbus = (TextView) view.findViewById(R.id.tv_plumbus);
  }

  @Override public void showData(PlumbusModel plumbusModel) {
    Log.d("TAG", "showData: " + plumbusModel);
    tvPlumbus.setText("Injection success!");
  }
}
