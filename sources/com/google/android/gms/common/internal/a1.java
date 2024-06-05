package com.google.android.gms.common.internal;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class a1 {

    /* renamed from: a  reason: collision with root package name */
    private Object f15341a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f15342b = false;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c f15343c;

    public a1(c cVar, Object obj) {
        this.f15343c = cVar;
        this.f15341a = obj;
    }

    /* access modifiers changed from: protected */
    public abstract void a(Object obj);

    /* access modifiers changed from: protected */
    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            obj = this.f15341a;
            if (this.f15342b) {
                String obj2 = toString();
                Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                a(obj);
            } catch (RuntimeException e10) {
                throw e10;
            }
        }
        synchronized (this) {
            this.f15342b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f15341a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f15343c.zzt) {
            this.f15343c.zzt.remove(this);
        }
    }
}
