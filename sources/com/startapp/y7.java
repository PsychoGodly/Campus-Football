package com.startapp;

import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.ads.splash.a;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.adsbase.remoteconfig.c;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Sta */
public class y7 implements c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f17566a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f17567b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SplashEventHandler f17568c;

    public y7(SplashEventHandler splashEventHandler, Runnable runnable, AtomicReference atomicReference) {
        this.f17568c = splashEventHandler;
        this.f17566a = runnable;
        this.f17567b = atomicReference;
    }

    public void a(MetaDataRequest.RequestReason requestReason, boolean z10) {
        SplashEventHandler splashEventHandler = this.f17568c;
        splashEventHandler.getClass();
        new Handler(Looper.getMainLooper()).post(new a(splashEventHandler, this.f17566a, (CacheKey) this.f17567b.get()));
    }

    public void a(MetaDataRequest.RequestReason requestReason) {
        SplashEventHandler splashEventHandler = this.f17568c;
        splashEventHandler.getClass();
        new Handler(Looper.getMainLooper()).post(new a(splashEventHandler, this.f17566a, (CacheKey) this.f17567b.get()));
    }
}
