package com.applovin.impl;

import com.applovin.sdk.AppLovinSdkConfiguration;

public class k3 {

    /* renamed from: a  reason: collision with root package name */
    private final AppLovinSdkConfiguration.ConsentFlowUserGeography f8866a;

    public k3(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        this.f8866a = consentFlowUserGeography;
    }

    /* access modifiers changed from: protected */
    public boolean a(Object obj) {
        return obj instanceof k3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj;
        if (!k3Var.a(this)) {
            return false;
        }
        AppLovinSdkConfiguration.ConsentFlowUserGeography a10 = a();
        AppLovinSdkConfiguration.ConsentFlowUserGeography a11 = k3Var.a();
        return a10 != null ? a10.equals(a11) : a11 == null;
    }

    public int hashCode() {
        AppLovinSdkConfiguration.ConsentFlowUserGeography a10 = a();
        return (a10 == null ? 43 : a10.hashCode()) + 59;
    }

    public String toString() {
        return "CmpAdapterParameters(debugUserGeography=" + a() + ")";
    }

    public AppLovinSdkConfiguration.ConsentFlowUserGeography a() {
        return this.f8866a;
    }
}
