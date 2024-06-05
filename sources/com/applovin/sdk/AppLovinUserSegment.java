package com.applovin.sdk;

import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;

public class AppLovinUserSegment {

    /* renamed from: a  reason: collision with root package name */
    private String f14114a;

    @Deprecated
    public AppLovinUserSegment() {
    }

    public AppLovinUserSegment(String str) {
        this.f14114a = str;
    }

    public String getName() {
        return this.f14114a;
    }

    @Deprecated
    public void setName(String str) {
        if (str != null) {
            if (str.length() > 32) {
                t.h("AppLovinUserSegment", "Setting name greater than 32 characters: " + str);
            }
            if (!StringUtils.isAlphaNumeric(str)) {
                t.h("AppLovinUserSegment", "Setting name that is not alphanumeric: " + str);
            }
        }
        this.f14114a = str;
    }

    public String toString() {
        return "AppLovinUserSegment{name=" + getName() + '}';
    }
}
