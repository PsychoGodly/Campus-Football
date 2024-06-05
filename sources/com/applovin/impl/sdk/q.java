package com.applovin.impl.sdk;

import com.applovin.impl.oj;
import com.applovin.impl.ve;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class q {

    /* renamed from: j  reason: collision with root package name */
    private static final a f12008j = new a();

    /* renamed from: a  reason: collision with root package name */
    private final k f12009a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f12010b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private long f12011c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f12012d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f12013e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    private long f12014f;

    /* renamed from: g  reason: collision with root package name */
    private Object f12015g;

    /* renamed from: h  reason: collision with root package name */
    private final Map f12016h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private final Object f12017i = new Object();

    q(k kVar) {
        this.f12009a = kVar;
    }

    public void a(boolean z10) {
        synchronized (this.f12012d) {
            this.f12013e.set(z10);
            if (z10) {
                this.f12014f = System.currentTimeMillis();
                this.f12009a.L();
                if (t.a()) {
                    t L = this.f12009a.L();
                    L.a("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f12014f);
                }
                Long l10 = (Long) this.f12009a.a(oj.f10275c2);
                if (l10.longValue() >= 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new o1(this, l10), l10.longValue());
                }
            } else {
                this.f12014f = 0;
                this.f12009a.L();
                if (t.a()) {
                    t L2 = this.f12009a.L();
                    L2.a("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                }
            }
        }
    }

    public long b() {
        return this.f12011c;
    }

    public boolean c() {
        return this.f12010b.get();
    }

    public boolean d() {
        return this.f12013e.get();
    }

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public long f12018a = -1;

        /* renamed from: b  reason: collision with root package name */
        private int f12019b;

        /* access modifiers changed from: protected */
        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.f12018a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a((Object) this) && b() == aVar.b() && a() == aVar.a();
        }

        public int hashCode() {
            long b10 = b();
            return ((((int) (b10 ^ (b10 >>> 32))) + 59) * 59) + a();
        }

        public String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + b() + ", attemptCount=" + a() + ")";
        }

        static /* synthetic */ int a(a aVar) {
            int i10 = aVar.f12019b;
            aVar.f12019b = i10 + 1;
            return i10;
        }

        public int a() {
            return this.f12019b;
        }
    }

    public void b(Object obj) {
        if (!ve.b(obj) && this.f12010b.compareAndSet(true, false)) {
            this.f12015g = null;
            this.f12009a.L();
            if (t.a()) {
                t L = this.f12009a.L();
                L.a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public void c(String str) {
        synchronized (this.f12017i) {
            a aVar = (a) this.f12016h.get(str);
            if (aVar == null) {
                aVar = new a();
                this.f12016h.put(str, aVar);
            }
            long unused = aVar.f12018a = System.currentTimeMillis();
            a.a(aVar);
        }
    }

    public a b(String str) {
        a aVar;
        synchronized (this.f12017i) {
            aVar = (a) this.f12016h.get(str);
            if (aVar == null) {
                aVar = f12008j;
            }
        }
        return aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Long l10) {
        if (d() && System.currentTimeMillis() - this.f12014f >= l10.longValue()) {
            this.f12009a.L();
            if (t.a()) {
                this.f12009a.L().a("FullScreenAdTracker", "Resetting \"pending display\" state...");
            }
            this.f12013e.set(false);
        }
    }

    public Object a() {
        return this.f12015g;
    }

    public void a(Object obj) {
        if (!ve.b(obj) && this.f12010b.compareAndSet(false, true)) {
            this.f12015g = obj;
            this.f12011c = System.currentTimeMillis();
            this.f12009a.L();
            if (t.a()) {
                t L = this.f12009a.L();
                L.a("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.f12011c);
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            Long l10 = (Long) this.f12009a.a(oj.f10283d2);
            if (l10.longValue() >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new p1(this, l10, obj), l10.longValue());
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Long l10, Object obj) {
        if (this.f12010b.get() && System.currentTimeMillis() - this.f12011c >= l10.longValue()) {
            this.f12009a.L();
            if (t.a()) {
                this.f12009a.L().a("FullScreenAdTracker", "Resetting \"display\" state...");
            }
            b(obj);
        }
    }

    public void a(String str) {
        synchronized (this.f12017i) {
            this.f12016h.remove(str);
        }
    }
}
