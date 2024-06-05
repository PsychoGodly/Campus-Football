package com.startapp;

import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.AppSessionConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Sta */
public class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final a f15771a;

    /* renamed from: b  reason: collision with root package name */
    public final i2<AppSessionConfig> f15772b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<AdPreferences.Placement, Integer> f15773c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public long f15774d;

    /* renamed from: e  reason: collision with root package name */
    public long f15775e;

    /* compiled from: Sta */
    public interface a {
    }

    public e0(a aVar, i2<AppSessionConfig> i2Var) {
        this.f15771a = aVar;
        this.f15772b = i2Var;
    }
}
