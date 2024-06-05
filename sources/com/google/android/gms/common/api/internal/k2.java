package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.q;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class k2<R extends i> extends m<R> implements j<R> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public l<? super R, ? extends i> f15174a;

    /* renamed from: b  reason: collision with root package name */
    private k2<? extends i> f15175b;

    /* renamed from: c  reason: collision with root package name */
    private volatile k<? super R> f15176c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f15177d;

    /* renamed from: e  reason: collision with root package name */
    private Status f15178e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final WeakReference<GoogleApiClient> f15179f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final i2 f15180g;

    private final void g(Status status) {
        synchronized (this.f15177d) {
            this.f15178e = status;
            h(status);
        }
    }

    private final void h(Status status) {
        synchronized (this.f15177d) {
            l<? super R, ? extends i> lVar = this.f15174a;
            if (lVar != null) {
                ((k2) q.k(this.f15175b)).g((Status) q.l(lVar.a(status), "onFailure must not return null"));
            } else if (i()) {
                ((k) q.k(this.f15176c)).b(status);
            }
        }
    }

    private final boolean i() {
        return (this.f15176c == null || ((GoogleApiClient) this.f15179f.get()) == null) ? false : true;
    }

    /* access modifiers changed from: private */
    public static final void j(i iVar) {
        if (iVar instanceof g) {
            try {
                ((g) iVar).release();
            } catch (RuntimeException e10) {
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(iVar)), e10);
            }
        }
    }

    public final void a(R r10) {
        synchronized (this.f15177d) {
            if (!r10.p().z()) {
                g(r10.p());
                j(r10);
            } else if (this.f15174a != null) {
                a2.a().submit(new h2(this, r10));
            } else if (i()) {
                ((k) q.k(this.f15176c)).c(r10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        this.f15176c = null;
    }
}
