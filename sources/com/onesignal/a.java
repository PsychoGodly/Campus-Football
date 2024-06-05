package com.onesignal;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.view.ViewTreeObserver;
import com.applovin.mediation.MaxReward;
import com.onesignal.k3;
import com.onesignal.y2;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ActivityLifecycleHandler */
class a implements y2.b {

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, b> f27538d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, y2.c> f27539e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    private static final Map<String, c> f27540f = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final OSFocusHandler f27541a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f27542b = null;

    /* renamed from: c  reason: collision with root package name */
    private boolean f27543c = false;

    /* renamed from: com.onesignal.a$a  reason: collision with other inner class name */
    /* compiled from: ActivityLifecycleHandler */
    class C0289a extends Thread {
        C0289a() {
        }

        public void run() {
            k3.m0().c();
            a.this.f27541a.k("FOCUS_LOST_WORKER_TAG", 2000, k3.f27912f);
        }
    }

    /* compiled from: ActivityLifecycleHandler */
    static abstract class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public void a(Activity activity) {
        }

        /* access modifiers changed from: package-private */
        public void b(Activity activity) {
        }
    }

    /* compiled from: ActivityLifecycleHandler */
    static class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        private final y2.c f27545a;

        /* renamed from: b  reason: collision with root package name */
        private final y2.b f27546b;

        /* renamed from: c  reason: collision with root package name */
        private final String f27547c;

        /* synthetic */ c(y2.b bVar, y2.c cVar, String str, C0289a aVar) {
            this(bVar, cVar, str);
        }

        public void onGlobalLayout() {
            if (!h3.l(new WeakReference(k3.Z()))) {
                this.f27546b.a(this.f27547c, this);
                this.f27545a.c();
            }
        }

        private c(y2.b bVar, y2.c cVar, String str) {
            this.f27546b = bVar;
            this.f27545a = cVar;
            this.f27547c = str;
        }
    }

    public a(OSFocusHandler oSFocusHandler) {
        this.f27541a = oSFocusHandler;
    }

    private void f() {
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.A1(r0Var, "ActivityLifecycleHandler handleFocus, nextResumeIsFirstActivity: " + this.f27543c);
        if (this.f27541a.f() || this.f27543c) {
            k3.A1(r0Var, "ActivityLifecycleHandler reset background state, call app focus");
            this.f27543c = false;
            this.f27541a.j();
            return;
        }
        k3.A1(r0Var, "ActivityLifecycleHandler cancel background lost focus worker");
        this.f27541a.e("FOCUS_LOST_WORKER_TAG", k3.f27912f);
    }

    private void g() {
        k3.A1(k3.r0.DEBUG, "ActivityLifecycleHandler Handling lost focus");
        OSFocusHandler oSFocusHandler = this.f27541a;
        if (oSFocusHandler == null) {
            return;
        }
        if (!oSFocusHandler.f() || this.f27541a.g()) {
            new C0289a().start();
        }
    }

    private void h() {
        String str;
        k3.r0 r0Var = k3.r0.DEBUG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("curActivity is NOW: ");
        if (this.f27542b != null) {
            str = MaxReward.DEFAULT_LABEL + this.f27542b.getClass().getName() + ":" + this.f27542b;
        } else {
            str = "null";
        }
        sb2.append(str);
        k3.a(r0Var, sb2.toString());
    }

    private void i(int i10, Activity activity) {
        if (i10 == 2) {
            k3.r0 r0Var = k3.r0.DEBUG;
            k3.A1(r0Var, "Configuration Orientation Change: LANDSCAPE (" + i10 + ") on activity: " + activity);
        } else if (i10 == 1) {
            k3.r0 r0Var2 = k3.r0.DEBUG;
            k3.A1(r0Var2, "Configuration Orientation Change: PORTRAIT (" + i10 + ") on activity: " + activity);
        }
    }

    private void q(Activity activity) {
        g();
        for (Map.Entry<String, b> value : f27538d.entrySet()) {
            ((b) value.getValue()).b(activity);
        }
        for (Map.Entry<String, b> value2 : f27538d.entrySet()) {
            ((b) value2.getValue()).a(this.f27542b);
        }
        ViewTreeObserver viewTreeObserver = this.f27542b.getWindow().getDecorView().getViewTreeObserver();
        for (Map.Entry next : f27539e.entrySet()) {
            c cVar = new c(this, (y2.c) next.getValue(), (String) next.getKey(), (C0289a) null);
            viewTreeObserver.addOnGlobalLayoutListener(cVar);
            f27540f.put((String) next.getKey(), cVar);
        }
        f();
    }

    public void a(String str, c cVar) {
        Activity activity = this.f27542b;
        if (activity != null) {
            ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
            if (Build.VERSION.SDK_INT < 16) {
                viewTreeObserver.removeGlobalOnLayoutListener(cVar);
            } else {
                viewTreeObserver.removeOnGlobalLayoutListener(cVar);
            }
        }
        f27540f.remove(str);
        f27539e.remove(str);
    }

    /* access modifiers changed from: package-private */
    public void c(String str, b bVar) {
        f27538d.put(str, bVar);
        Activity activity = this.f27542b;
        if (activity != null) {
            bVar.a(activity);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(String str, y2.c cVar) {
        Activity activity = this.f27542b;
        if (activity != null) {
            ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
            c cVar2 = new c(this, cVar, str, (C0289a) null);
            viewTreeObserver.addOnGlobalLayoutListener(cVar2);
            f27540f.put(str, cVar2);
        }
        f27539e.put(str, cVar);
    }

    public Activity e() {
        return this.f27542b;
    }

    /* access modifiers changed from: package-private */
    public void j(Activity activity) {
    }

    /* access modifiers changed from: package-private */
    public void k(Activity activity) {
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.a(r0Var, "onActivityDestroyed: " + activity);
        f27540f.clear();
        if (activity == this.f27542b) {
            this.f27542b = null;
            g();
        }
        h();
    }

    /* access modifiers changed from: package-private */
    public void l(Activity activity) {
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.a(r0Var, "onActivityPaused: " + activity);
        if (activity == this.f27542b) {
            this.f27542b = null;
            g();
        }
        h();
    }

    /* access modifiers changed from: package-private */
    public void m(Activity activity) {
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.a(r0Var, "onActivityResumed: " + activity);
        s(activity);
        h();
        f();
    }

    /* access modifiers changed from: package-private */
    public void n(Activity activity) {
        this.f27541a.l();
    }

    /* access modifiers changed from: package-private */
    public void o(Activity activity) {
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.a(r0Var, "onActivityStopped: " + activity);
        if (activity == this.f27542b) {
            this.f27542b = null;
            g();
        }
        for (Map.Entry<String, b> value : f27538d.entrySet()) {
            ((b) value.getValue()).b(activity);
        }
        h();
        if (this.f27542b == null) {
            this.f27541a.m();
        }
    }

    /* access modifiers changed from: package-private */
    public void p(Configuration configuration, Activity activity) {
        Activity activity2 = this.f27542b;
        if (activity2 != null && OSUtils.q(activity2, 128)) {
            i(configuration.orientation, activity);
            q(activity);
        }
    }

    /* access modifiers changed from: package-private */
    public void r(String str) {
        f27538d.remove(str);
    }

    public void s(Activity activity) {
        this.f27542b = activity;
        for (Map.Entry<String, b> value : f27538d.entrySet()) {
            ((b) value.getValue()).a(this.f27542b);
        }
        try {
            ViewTreeObserver viewTreeObserver = this.f27542b.getWindow().getDecorView().getViewTreeObserver();
            for (Map.Entry next : f27539e.entrySet()) {
                c cVar = new c(this, (y2.c) next.getValue(), (String) next.getKey(), (C0289a) null);
                viewTreeObserver.addOnGlobalLayoutListener(cVar);
                f27540f.put((String) next.getKey(), cVar);
            }
        } catch (RuntimeException e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public void t(boolean z10) {
        this.f27543c = z10;
    }
}
