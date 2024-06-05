package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.p;
import h5.d;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class k1 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b<?> f15172a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final d f15173b;

    /* synthetic */ k1(b bVar, d dVar, j1 j1Var) {
        this.f15172a = bVar;
        this.f15173b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof k1)) {
            k1 k1Var = (k1) obj;
            if (!p.a(this.f15172a, k1Var.f15172a) || !p.a(this.f15173b, k1Var.f15173b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return p.b(this.f15172a, this.f15173b);
    }

    public final String toString() {
        return p.c(this).a("key", this.f15172a).a("feature", this.f15173b).toString();
    }
}
