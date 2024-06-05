package com.applovin.sdk;

public interface AppLovinPostbackListener {
    void onPostbackFailure(String str, int i10);

    void onPostbackSuccess(String str);
}
