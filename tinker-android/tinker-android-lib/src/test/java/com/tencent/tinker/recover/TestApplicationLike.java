package com.tencent.tinker.recover;

import android.app.Application;
import android.content.Intent;

import com.tencent.tinker.entry.ApplicationLike;

public class TestApplicationLike extends ApplicationLike {

    public TestApplicationLike(Application application, int tinkerFlags, boolean tinkerLoadVerifyFlag, long applicationStartElapsedTime, long applicationStartMillisTime, Intent tinkerResultIntent) {
        super(application, tinkerFlags, tinkerLoadVerifyFlag, applicationStartElapsedTime, applicationStartMillisTime, tinkerResultIntent);
    }
}
