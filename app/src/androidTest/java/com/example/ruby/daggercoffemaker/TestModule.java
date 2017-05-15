//package com.example.ruby.daggercoffemaker;
//
//import android.content.Context;
//import com.example.ruby.daggercoffemaker.mvpandroid.data.abstarct.LocalData;
//import com.example.ruby.daggercoffemaker.mvpandroid.data.abstarct.RemoteData;
//import com.example.ruby.daggercoffemaker.mvpandroid.data.abstarct.Repository;
//import com.example.ruby.daggercoffemaker.mvpandroid.data.dagger.DataModule;
//import com.example.ruby.daggercoffemaker.mvpandroid.data.impl.LocalDataImpl;
//import com.example.ruby.daggercoffemaker.mvpandroid.data.impl.RemoteDataImpl;
//import dagger.Module;
//import dagger.Provides;
//import javax.inject.Singleton;
//
///**
// * Created by Ruby on 5/15/2017.
// */
//@Module
//public class TestModule extends DataModule {
//  @Singleton @Provides public LocalData provideLocalData(Context context) {
//    return new LocalDataImpl(context);
//  }
//
//  @Singleton @Provides public RemoteData provideRemoteData(Context context) {
//    return new RemoteDataImpl(context);
//  }
//
//  @Singleton @Provides
//  public Repository providePlumbusRepository(LocalDataImpl localDataImpl, RemoteData remoteData) {
//    return new RepositoryMock();
//  }
//}