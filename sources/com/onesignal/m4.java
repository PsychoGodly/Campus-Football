package com.onesignal;

import android.content.Context;
import android.os.Bundle;
import com.applovin.mediation.MaxReward;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: TrackFirebaseAnalytics */
class m4 {

    /* renamed from: c  reason: collision with root package name */
    private static Class<?> f28052c;

    /* renamed from: d  reason: collision with root package name */
    private static AtomicLong f28053d;

    /* renamed from: e  reason: collision with root package name */
    private static AtomicLong f28054e;

    /* renamed from: f  reason: collision with root package name */
    private static w1 f28055f;

    /* renamed from: a  reason: collision with root package name */
    private Object f28056a;

    /* renamed from: b  reason: collision with root package name */
    private Context f28057b;

    m4(Context context) {
        this.f28057b = context;
    }

    static boolean a() {
        try {
            f28052c = FirebaseAnalytics.class;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private String b(w1 w1Var) {
        if (w1Var.B().isEmpty() || w1Var.A().isEmpty()) {
            return w1Var.C() != null ? w1Var.C().substring(0, Math.min(10, w1Var.C().length())) : MaxReward.DEFAULT_LABEL;
        }
        return w1Var.B() + " - " + w1Var.A();
    }

    private Object c(Context context) {
        if (this.f28056a == null) {
            try {
                this.f28056a = d(f28052c).invoke((Object) null, new Object[]{context});
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return this.f28056a;
    }

    private static Method d(Class cls) {
        try {
            return cls.getMethod("getInstance", new Class[]{Context.class});
        } catch (NoSuchMethodException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static Method e(Class cls) {
        try {
            return cls.getMethod("logEvent", new Class[]{String.class, Bundle.class});
        } catch (NoSuchMethodException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (f28053d != null && f28055f != null) {
            long b10 = k3.N0().b();
            if (b10 - f28053d.get() <= 120000) {
                AtomicLong atomicLong = f28054e;
                if (atomicLong == null || b10 - atomicLong.get() >= 30000) {
                    try {
                        Object c10 = c(this.f28057b);
                        Method e10 = e(f28052c);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "OneSignal");
                        bundle.putString("medium", "notification");
                        bundle.putString("notification_id", f28055f.t());
                        bundle.putString("campaign", b(f28055f));
                        e10.invoke(c10, new Object[]{"os_notification_influence_open", bundle});
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(f2 f2Var) {
        if (f28054e == null) {
            f28054e = new AtomicLong();
        }
        f28054e.set(k3.N0().b());
        try {
            Object c10 = c(this.f28057b);
            Method e10 = e(f28052c);
            Bundle bundle = new Bundle();
            bundle.putString("source", "OneSignal");
            bundle.putString("medium", "notification");
            bundle.putString("notification_id", f2Var.e().t());
            bundle.putString("campaign", b(f2Var.e()));
            e10.invoke(c10, new Object[]{"os_notification_opened", bundle});
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public void h(f2 f2Var) {
        try {
            Object c10 = c(this.f28057b);
            Method e10 = e(f28052c);
            Bundle bundle = new Bundle();
            bundle.putString("source", "OneSignal");
            bundle.putString("medium", "notification");
            bundle.putString("notification_id", f2Var.e().t());
            bundle.putString("campaign", b(f2Var.e()));
            e10.invoke(c10, new Object[]{"os_notification_received", bundle});
            if (f28053d == null) {
                f28053d = new AtomicLong();
            }
            f28053d.set(k3.N0().b());
            f28055f = f2Var.e();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
