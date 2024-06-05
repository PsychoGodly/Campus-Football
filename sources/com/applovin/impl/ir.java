package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.k;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

public class ir {

    /* renamed from: f  reason: collision with root package name */
    private static final Set f8589f = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8590a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final k f8591b;

    /* renamed from: c  reason: collision with root package name */
    private Runnable f8592c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f8593d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final Timer f8594e;

    class a extends TimerTask {

        /* renamed from: com.applovin.impl.ir$a$a  reason: collision with other inner class name */
        class C0121a implements AppLovinBroadcastManager.Receiver {
            C0121a() {
            }

            public void onReceive(Intent intent, Map map) {
                AppLovinBroadcastManager.unregisterReceiver(this);
                ir.this.c();
            }
        }

        a() {
        }

        public void run() {
            if (!ir.this.f8591b.f0().isApplicationPaused() || ir.this.f8590a) {
                ir.this.c();
            } else {
                AppLovinBroadcastManager.registerReceiver(new C0121a(), new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
        }
    }

    private ir(long j10, boolean z10, k kVar, Runnable runnable) {
        Timer timer = new Timer();
        this.f8594e = timer;
        if (j10 < 0) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Invalid timer length: " + j10);
        } else if (kVar == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Sdk is null");
        } else if (runnable != null) {
            this.f8590a = z10;
            this.f8591b = kVar;
            this.f8592c = runnable;
            f8589f.add(this);
            timer.schedule(b(), j10);
        } else {
            throw new IllegalArgumentException("Cannot create wall clock timer. Runnable is null.");
        }
    }

    private TimerTask b() {
        return new a();
    }

    /* access modifiers changed from: private */
    public void c() {
        Runnable runnable = this.f8592c;
        if (runnable != null) {
            runnable.run();
            a();
        }
    }

    public void a() {
        synchronized (this.f8593d) {
            this.f8594e.cancel();
            this.f8592c = null;
            f8589f.remove(this);
        }
    }

    public static ir a(long j10, boolean z10, k kVar, Runnable runnable) {
        return new ir(j10, z10, kVar, runnable);
    }
}
