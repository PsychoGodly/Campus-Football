package com.startapp;

import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.cache.h;
import com.startapp.sdk.adsbase.d;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class k1 extends j1 {
    public k1(h hVar) {
        super(hVar);
    }

    public boolean a() {
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.d.f16847a;
        return startAppSDKInternal.f16809c && !startAppSDKInternal.f16812f && (!startAppSDKInternal.f16810d || (this.f15944a.f16951a == AdPreferences.Placement.INAPP_RETURN && CacheMetaData.f16922a.a().g()));
    }

    public long b() {
        d dVar = this.f15944a.f16955e;
        if (dVar == null) {
            return -1;
        }
        Long c10 = dVar.c();
        Long b10 = dVar.b();
        if (c10 == null || b10 == null) {
            return -1;
        }
        long longValue = c10.longValue() - (System.currentTimeMillis() - b10.longValue());
        if (longValue >= 0) {
            return longValue;
        }
        return 0;
    }
}
