package com.applovin.impl;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

public class cr {

    /* renamed from: a  reason: collision with root package name */
    private final t f7034a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f7035b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Rect f7036c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    private final Handler f7037d;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f7038e;

    /* renamed from: f  reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f7039f;

    /* renamed from: g  reason: collision with root package name */
    private final WeakReference f7040g;

    /* renamed from: h  reason: collision with root package name */
    private final long f7041h;

    /* renamed from: i  reason: collision with root package name */
    private WeakReference f7042i = new WeakReference((Object) null);

    /* renamed from: j  reason: collision with root package name */
    private WeakReference f7043j = new WeakReference((Object) null);

    /* renamed from: k  reason: collision with root package name */
    private int f7044k;

    /* renamed from: l  reason: collision with root package name */
    private float f7045l;

    /* renamed from: m  reason: collision with root package name */
    private float f7046m;

    /* renamed from: n  reason: collision with root package name */
    private long f7047n;

    /* renamed from: o  reason: collision with root package name */
    private long f7048o = Long.MIN_VALUE;

    public interface a {
        void onLogVisibilityImpression();
    }

    public cr(View view, k kVar, a aVar) {
        this.f7034a = kVar.L();
        this.f7041h = ((Long) kVar.a(oj.S1)).longValue();
        this.f7037d = new Handler(Looper.getMainLooper());
        this.f7040g = new WeakReference(view);
        this.f7038e = new yv(this, new WeakReference(aVar));
        this.f7039f = new xv(this, view);
    }

    private boolean a(View view, View view2) {
        if (!b(view, view2)) {
            return false;
        }
        if (this.f7048o == Long.MIN_VALUE) {
            this.f7048o = SystemClock.uptimeMillis();
        }
        if (SystemClock.uptimeMillis() - this.f7048o >= this.f7047n) {
            return true;
        }
        return false;
    }

    private boolean b(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f7036c)) {
            return false;
        }
        long pxToDp = (long) (AppLovinSdkUtils.pxToDp(view2.getContext(), this.f7036c.width()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f7036c.height()));
        if (pxToDp < ((long) this.f7044k)) {
            return false;
        }
        if ((((float) pxToDp) / ((float) ((long) (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()))))) * 100.0f < this.f7045l) {
            return false;
        }
        if ((((float) ((long) (this.f7036c.width() * this.f7036c.height()))) / ((float) ((long) (view2.getWidth() * view2.getHeight())))) * 100.0f < this.f7046m) {
            return false;
        }
        return true;
    }

    private void c(View view) {
        View b10 = ar.b((View) this.f7040g.get());
        if (b10 == null) {
            b10 = ar.b(view);
        }
        if (b10 != null) {
            ViewTreeObserver viewTreeObserver = b10.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                this.f7042i = new WeakReference(viewTreeObserver);
                viewTreeObserver.addOnPreDrawListener(this.f7039f);
            } else if (t.a()) {
                this.f7034a.k("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
            }
        } else if (t.a()) {
            this.f7034a.a("VisibilityTracker", "Unable to set view tree observer due to no root view.");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(WeakReference weakReference) {
        View view = (View) this.f7040g.get();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View view2 = (View) this.f7043j.get();
        if (viewGroup != null && view2 != null) {
            if (a((View) viewGroup, view2)) {
                if (t.a()) {
                    this.f7034a.a("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
                }
                b();
                a aVar = (a) weakReference.get();
                if (aVar != null) {
                    aVar.onLogVisibilityImpression();
                    return;
                }
                return;
            }
            a();
        }
    }

    private void b(View view) {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f7042i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f7039f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f7039f);
            } else if (t.a()) {
                this.f7034a.a("VisibilityTracker", "Could not remove on pre-draw listener. View tree observer is not alive.");
            }
        } else if (t.a()) {
            this.f7034a.a("VisibilityTracker", "Could not remove on pre-draw listener. Root view is null.");
        }
        this.f7042i.clear();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        a();
        b(view);
        return true;
    }

    private void a() {
        this.f7037d.postDelayed(this.f7038e, this.f7041h);
    }

    public void a(int i10, float f10, float f11, long j10, View view) {
        synchronized (this.f7035b) {
            if (t.a()) {
                t tVar = this.f7034a;
                tVar.a("VisibilityTracker", "Tracking visibility for " + view);
            }
            b();
            WeakReference weakReference = new WeakReference(view);
            this.f7043j = weakReference;
            this.f7044k = i10;
            this.f7045l = f10;
            this.f7046m = f11;
            this.f7047n = j10;
            c((View) weakReference.get());
        }
    }

    public void b() {
        synchronized (this.f7035b) {
            this.f7037d.removeMessages(0);
            b((View) this.f7040g.get());
            this.f7048o = Long.MIN_VALUE;
            this.f7043j.clear();
        }
    }

    public void a(ie ieVar) {
        View l02;
        if (ieVar instanceof ce) {
            l02 = ieVar.x();
        } else if (ieVar instanceof ee) {
            l02 = ((ee) ieVar).l0();
        } else {
            return;
        }
        a(ieVar.d0(), ieVar.f0(), ieVar.g0(), ieVar.h0(), l02);
    }
}
