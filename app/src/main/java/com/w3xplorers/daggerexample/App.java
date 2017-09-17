package com.w3xplorers.daggerexample;

import android.app.Application;

/**
 * Created by Avijit on 9/17/2017.
 */

public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }


    public ApplicationComponent getComponent(){
        return component;
    }
}
