package com.roakstudio.roomie;

import com.firebase.client.Firebase;

/**
 * Created by Diego Laurentino on 07/04/2016.
 */
public class Roomie extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
