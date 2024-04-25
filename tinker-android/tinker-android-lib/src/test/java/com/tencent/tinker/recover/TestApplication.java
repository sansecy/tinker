package com.tencent.tinker.recover;

import android.content.Context;

import com.tencent.tinker.loader.app.TinkerApplication;

public class TestApplication extends TinkerApplication {
    public TestApplication() {
        super(15, "com.tencent.tinker.recover.TestApplicationLike", "com.tencent.tinker.loader.TinkerLoader", false, true);
    }

    @Override
    public void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
