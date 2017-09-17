package com.w3xplorers.daggerexample;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by DELL on 9/17/2017.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(MainActivity target);

}
