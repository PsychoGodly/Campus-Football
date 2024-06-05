package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

public class el {

    /* renamed from: a  reason: collision with root package name */
    private final WeakHashMap f7455a = new WeakHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Object f7456b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Handler f7457c = new Handler();

    /* renamed from: d  reason: collision with root package name */
    private boolean f7458d = false;

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference f7459e;

    /* renamed from: f  reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f7460f;

    /* renamed from: g  reason: collision with root package name */
    private a f7461g;

    public interface a {
        void a(int i10, int i11);
    }

    public el(View view) {
        this.f7459e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            jw jwVar = new jw(this);
            this.f7460f = jwVar;
            viewTreeObserver.addOnPreDrawListener(jwVar);
            return;
        }
        this.f7460f = null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean b() {
        d();
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.f7456b) {
            this.f7458d = false;
            int i10 = -1;
            int i11 = -1;
            for (Map.Entry entry : this.f7455a.entrySet()) {
                if (a((View) entry.getKey())) {
                    Integer num = (Integer) entry.getValue();
                    if (i10 == -1 && i11 == -1) {
                        i10 = num.intValue();
                        i11 = num.intValue();
                    } else {
                        i10 = Math.min(i10, ((Integer) entry.getValue()).intValue());
                        i11 = Math.max(i11, ((Integer) entry.getValue()).intValue());
                    }
                }
            }
            a aVar = this.f7461g;
            if (aVar != null) {
                aVar.a(i10, i11);
            }
        }
    }

    private void d() {
        if (!this.f7458d) {
            this.f7458d = true;
            this.f7457c.postDelayed(new kw(this), 100);
        }
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f7461g = null;
        View view = (View) this.f7459e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f7460f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f7459e.clear();
        }
    }

    public void b(View view) {
        synchronized (this.f7456b) {
            this.f7455a.remove(view);
        }
    }

    private boolean a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }

    public void a(a aVar) {
        this.f7461g = aVar;
    }

    public void a(View view, int i10) {
        synchronized (this.f7456b) {
            this.f7455a.put(view, Integer.valueOf(i10));
            d();
        }
    }
}
