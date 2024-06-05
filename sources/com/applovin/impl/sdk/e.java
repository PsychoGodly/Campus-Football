package com.applovin.impl.sdk;

import android.os.Handler;
import android.os.HandlerThread;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.o;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public class e {

    /* renamed from: l  reason: collision with root package name */
    private static final e f11577l = new e();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final AtomicLong f11578a = new AtomicLong(0);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Handler f11579b;

    /* renamed from: c  reason: collision with root package name */
    private final HandlerThread f11580c = new HandlerThread("AppLovinSdk:anr_detector");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Handler f11581d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f11582e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f11583f = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public k f11584g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public Thread f11585h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public long f11586i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public long f11587j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public long f11588k;

    private class b implements Runnable {
        private b() {
        }

        public void run() {
            String str;
            if (!e.this.f11582e.get()) {
                long currentTimeMillis = System.currentTimeMillis() - e.this.f11578a.get();
                if (currentTimeMillis < 0 || currentTimeMillis > e.this.f11586i) {
                    e.this.a();
                    if (e.this.f11585h == null || e.this.f11585h.getStackTrace().length <= 0) {
                        str = "None";
                    } else {
                        StackTraceElement stackTraceElement = e.this.f11585h.getStackTrace()[0];
                        str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
                    }
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - k.j());
                    HashMap hashMap = new HashMap(3);
                    hashMap.put("top_main_method", str);
                    hashMap.put("source", e.this.f11584g.w0() ? "non_first_session" : "first_session");
                    hashMap.put("details", "seconds_since_app_launch=" + seconds);
                    e.this.f11584g.B().a(o.b.ANR, (Map) hashMap);
                }
                e.this.f11581d.postDelayed(this, e.this.f11588k);
            }
        }
    }

    private class c implements Runnable {
        private c() {
        }

        public void run() {
            if (!e.this.f11582e.get()) {
                e.this.f11578a.set(System.currentTimeMillis());
                e.this.f11579b.postDelayed(this, e.this.f11587j);
            }
        }
    }

    private e() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f11586i = timeUnit.toMillis(4);
        this.f11587j = timeUnit.toMillis(3);
        this.f11588k = timeUnit.toMillis(3);
    }

    private void a(k kVar) {
        if (this.f11583f.compareAndSet(false, true)) {
            this.f11584g = kVar;
            AppLovinSdkUtils.runOnUiThread(new f0(this));
            this.f11586i = ((Long) kVar.a(oj.U5)).longValue();
            this.f11587j = ((Long) kVar.a(oj.V5)).longValue();
            this.f11588k = ((Long) kVar.a(oj.W5)).longValue();
            this.f11579b = new Handler(k.k().getMainLooper());
            this.f11580c.start();
            this.f11579b.post(new c());
            Handler handler = new Handler(this.f11580c.getLooper());
            this.f11581d = handler;
            handler.postDelayed(new b(), this.f11588k / 2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f11585h = Thread.currentThread();
    }

    public static void b(k kVar) {
        if (kVar == null) {
            return;
        }
        if (!((Boolean) kVar.a(oj.T5)).booleanValue() || zp.c(kVar)) {
            f11577l.a();
        } else {
            f11577l.a(kVar);
        }
    }

    /* access modifiers changed from: private */
    public void a() {
        if (this.f11583f.get()) {
            this.f11582e.set(true);
        }
    }
}
