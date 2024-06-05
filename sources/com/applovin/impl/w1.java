package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.k;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class w1 implements AppLovinBroadcastManager.Receiver {

    /* renamed from: c  reason: collision with root package name */
    private static final Set f12904c = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    private final ho f12905a;

    /* renamed from: b  reason: collision with root package name */
    private final k f12906b;

    private w1(long j10, k kVar, Runnable runnable) {
        this.f12905a = ho.a(j10, kVar, new s60(this, runnable));
        this.f12906b = kVar;
        f12904c.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void a() {
        this.f12905a.a();
        AppLovinBroadcastManager.unregisterReceiver(this);
        f12904c.remove(this);
    }

    public long b() {
        return this.f12905a.c();
    }

    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f12905a.d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f12905a.e();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Runnable runnable) {
        a();
        if (runnable != null) {
            runnable.run();
        }
    }

    public static w1 a(long j10, k kVar, Runnable runnable) {
        return new w1(j10, kVar, runnable);
    }
}
