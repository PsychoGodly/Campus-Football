package com.google.android.gms.ads.internal.util;

import com.google.android.gms.common.internal.p;
import com.unity3d.ads.metadata.MediationMetaData;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f14789a;

    /* renamed from: b  reason: collision with root package name */
    public final double f14790b;

    /* renamed from: c  reason: collision with root package name */
    public final double f14791c;

    /* renamed from: d  reason: collision with root package name */
    public final double f14792d;

    /* renamed from: e  reason: collision with root package name */
    public final int f14793e;

    public e0(String str, double d10, double d11, double d12, int i10) {
        this.f14789a = str;
        this.f14791c = d10;
        this.f14790b = d11;
        this.f14792d = d12;
        this.f14793e = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (p.a(this.f14789a, e0Var.f14789a) && this.f14790b == e0Var.f14790b && this.f14791c == e0Var.f14791c && this.f14793e == e0Var.f14793e && Double.compare(this.f14792d, e0Var.f14792d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return p.b(this.f14789a, Double.valueOf(this.f14790b), Double.valueOf(this.f14791c), Double.valueOf(this.f14792d), Integer.valueOf(this.f14793e));
    }

    public final String toString() {
        return p.c(this).a(MediationMetaData.KEY_NAME, this.f14789a).a("minBound", Double.valueOf(this.f14791c)).a("maxBound", Double.valueOf(this.f14790b)).a("percent", Double.valueOf(this.f14792d)).a("count", Integer.valueOf(this.f14793e)).toString();
    }
}
