package com.startapp.sdk.components;

import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;
import com.startapp.sdk.adsbase.crashreport.b;
import com.startapp.sdk.components.ComponentLocator;

/* compiled from: Sta */
public class i implements b.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ANRRemoteConfig f17215a;

    public i(ComponentLocator.v vVar, ANRRemoteConfig aNRRemoteConfig) {
        this.f17215a = aNRRemoteConfig;
    }

    public long a(long j10) {
        return this.f17215a.b() - j10;
    }
}
