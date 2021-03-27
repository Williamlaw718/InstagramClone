package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("1q59So2R8sdi1XIqOUWOgIpvU4zPgCPFnf5rzSY7")
                .clientKey("oM0oGHh8TX2mLcQkH7UFChEaLSHQrbnQipKiiLB9")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
