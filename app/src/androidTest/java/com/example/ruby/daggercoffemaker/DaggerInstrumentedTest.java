//package com.example.ruby.daggercoffemaker;
//
//import android.support.test.runner.AndroidJUnit4;
//import com.example.ruby.daggercoffemaker.mvpandroid.data.abstarct.Repository;
//import com.example.ruby.daggercoffemaker.TestModule;
//import javax.inject.Inject;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//import static org.junit.Assert.assertEquals;
//
///**
// * Instrumentation test, which will execute on an Android device.
// *
// * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
// */
//@RunWith(AndroidJUnit4.class) public class DaggerInstrumentedTest {
//
//  @Inject Repository repository;
//
//  @Before public void setUp() {
//    TestComponent component = DaggerTestComponent.builder().myModule(new TestModule()).build();
//    component.inject(this);
//  }
//
//  @Test public void testDoSomething() {
//
//  }
//}
