package com.startapp;

import android.app.Activity;
import android.content.Context;
import com.applovin.mediation.MaxReward;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.adsbase.remoteconfig.c;
import java.util.Map;
import java.util.UUID;

/* compiled from: Sta */
public class t7 {

    /* renamed from: d  reason: collision with root package name */
    public static final t7 f17299d = new t7();

    /* renamed from: a  reason: collision with root package name */
    public String f17300a = MaxReward.DEFAULT_LABEL;

    /* renamed from: b  reason: collision with root package name */
    public long f17301b = 0;

    /* renamed from: c  reason: collision with root package name */
    public MetaDataRequest.RequestReason f17302c = MetaDataRequest.RequestReason.LAUNCH;

    public String a() {
        return this.f17300a;
    }

    public long b() {
        return this.f17301b;
    }

    public synchronized void a(Context context, MetaDataRequest.RequestReason requestReason) {
        this.f17300a = UUID.randomUUID().toString();
        this.f17301b = System.currentTimeMillis();
        this.f17302c = requestReason;
        Map<Activity, Integer> map = j9.f15982a;
        f fVar = f.f15802d;
        fVar.f15803a.clear();
        fVar.f15804b.clear();
        fVar.f15805c.clear();
        MetaData.f17070k.a(context, new AdPreferences(), requestReason, false, (c) null, true);
    }
}
