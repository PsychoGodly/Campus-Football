package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

class v {

    /* renamed from: a  reason: collision with root package name */
    private final Queue f12075a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    private final Object f12076b = new Object();

    v() {
    }

    /* access modifiers changed from: package-private */
    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f12076b) {
            if (b() <= 25) {
                this.f12075a.offer(appLovinAdImpl);
            } else {
                t.h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        int size;
        synchronized (this.f12076b) {
            size = this.f12075a.size();
        }
        return size;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        boolean z10;
        synchronized (this.f12076b) {
            z10 = b() == 0;
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public AppLovinAdImpl d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f12076b) {
            appLovinAdImpl = (AppLovinAdImpl) this.f12075a.peek();
        }
        return appLovinAdImpl;
    }

    /* access modifiers changed from: package-private */
    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f12076b) {
            this.f12075a.remove(appLovinAdImpl);
        }
    }

    /* access modifiers changed from: package-private */
    public AppLovinAdImpl a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f12076b) {
            appLovinAdImpl = !c() ? (AppLovinAdImpl) this.f12075a.poll() : null;
        }
        return appLovinAdImpl;
    }
}
