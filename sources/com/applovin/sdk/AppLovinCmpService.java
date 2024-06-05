package com.applovin.sdk;

import android.app.Activity;

public interface AppLovinCmpService {

    public interface OnCompletedListener {
        void onCompleted(AppLovinCmpError appLovinCmpError);
    }

    boolean hasSupportedCmp();

    void showCmpForExistingUser(Activity activity, OnCompletedListener onCompletedListener);
}
