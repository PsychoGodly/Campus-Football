package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.internal.ads.zzbzb;
import i5.a;
import i5.c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class u4 extends a {
    public static final Parcelable.Creator<u4> CREATOR = new w4();

    /* renamed from: a  reason: collision with root package name */
    public final int f14551a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public final long f14552b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f14553c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public final int f14554d;

    /* renamed from: f  reason: collision with root package name */
    public final List f14555f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f14556g;

    /* renamed from: h  reason: collision with root package name */
    public final int f14557h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f14558i;

    /* renamed from: j  reason: collision with root package name */
    public final String f14559j;

    /* renamed from: k  reason: collision with root package name */
    public final k4 f14560k;

    /* renamed from: l  reason: collision with root package name */
    public final Location f14561l;

    /* renamed from: m  reason: collision with root package name */
    public final String f14562m;

    /* renamed from: n  reason: collision with root package name */
    public final Bundle f14563n;

    /* renamed from: o  reason: collision with root package name */
    public final Bundle f14564o;

    /* renamed from: p  reason: collision with root package name */
    public final List f14565p;

    /* renamed from: q  reason: collision with root package name */
    public final String f14566q;

    /* renamed from: r  reason: collision with root package name */
    public final String f14567r;
    @Deprecated

    /* renamed from: s  reason: collision with root package name */
    public final boolean f14568s;

    /* renamed from: t  reason: collision with root package name */
    public final a1 f14569t;

    /* renamed from: u  reason: collision with root package name */
    public final int f14570u;

    /* renamed from: v  reason: collision with root package name */
    public final String f14571v;

    /* renamed from: w  reason: collision with root package name */
    public final List f14572w;

    /* renamed from: x  reason: collision with root package name */
    public final int f14573x;

    /* renamed from: y  reason: collision with root package name */
    public final String f14574y;

    public u4(int i10, long j10, Bundle bundle, int i11, List list, boolean z10, int i12, boolean z11, String str, k4 k4Var, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z12, a1 a1Var, int i13, String str5, List list3, int i14, String str6) {
        this.f14551a = i10;
        this.f14552b = j10;
        this.f14553c = bundle == null ? new Bundle() : bundle;
        this.f14554d = i11;
        this.f14555f = list;
        this.f14556g = z10;
        this.f14557h = i12;
        this.f14558i = z11;
        this.f14559j = str;
        this.f14560k = k4Var;
        this.f14561l = location;
        this.f14562m = str2;
        this.f14563n = bundle2 == null ? new Bundle() : bundle2;
        this.f14564o = bundle3;
        this.f14565p = list2;
        this.f14566q = str3;
        this.f14567r = str4;
        this.f14568s = z12;
        this.f14569t = a1Var;
        this.f14570u = i13;
        this.f14571v = str5;
        this.f14572w = list3 == null ? new ArrayList() : list3;
        this.f14573x = i14;
        this.f14574y = str6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        if (this.f14551a != u4Var.f14551a || this.f14552b != u4Var.f14552b || !zzbzb.zza(this.f14553c, u4Var.f14553c) || this.f14554d != u4Var.f14554d || !p.a(this.f14555f, u4Var.f14555f) || this.f14556g != u4Var.f14556g || this.f14557h != u4Var.f14557h || this.f14558i != u4Var.f14558i || !p.a(this.f14559j, u4Var.f14559j) || !p.a(this.f14560k, u4Var.f14560k) || !p.a(this.f14561l, u4Var.f14561l) || !p.a(this.f14562m, u4Var.f14562m) || !zzbzb.zza(this.f14563n, u4Var.f14563n) || !zzbzb.zza(this.f14564o, u4Var.f14564o) || !p.a(this.f14565p, u4Var.f14565p) || !p.a(this.f14566q, u4Var.f14566q) || !p.a(this.f14567r, u4Var.f14567r) || this.f14568s != u4Var.f14568s || this.f14570u != u4Var.f14570u || !p.a(this.f14571v, u4Var.f14571v) || !p.a(this.f14572w, u4Var.f14572w) || this.f14573x != u4Var.f14573x || !p.a(this.f14574y, u4Var.f14574y)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return p.b(Integer.valueOf(this.f14551a), Long.valueOf(this.f14552b), this.f14553c, Integer.valueOf(this.f14554d), this.f14555f, Boolean.valueOf(this.f14556g), Integer.valueOf(this.f14557h), Boolean.valueOf(this.f14558i), this.f14559j, this.f14560k, this.f14561l, this.f14562m, this.f14563n, this.f14564o, this.f14565p, this.f14566q, this.f14567r, Boolean.valueOf(this.f14568s), Integer.valueOf(this.f14570u), this.f14571v, this.f14572w, Integer.valueOf(this.f14573x), this.f14574y);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f14551a);
        c.n(parcel, 2, this.f14552b);
        c.e(parcel, 3, this.f14553c, false);
        c.k(parcel, 4, this.f14554d);
        c.s(parcel, 5, this.f14555f, false);
        c.c(parcel, 6, this.f14556g);
        c.k(parcel, 7, this.f14557h);
        c.c(parcel, 8, this.f14558i);
        c.q(parcel, 9, this.f14559j, false);
        c.p(parcel, 10, this.f14560k, i10, false);
        c.p(parcel, 11, this.f14561l, i10, false);
        c.q(parcel, 12, this.f14562m, false);
        c.e(parcel, 13, this.f14563n, false);
        c.e(parcel, 14, this.f14564o, false);
        c.s(parcel, 15, this.f14565p, false);
        c.q(parcel, 16, this.f14566q, false);
        c.q(parcel, 17, this.f14567r, false);
        c.c(parcel, 18, this.f14568s);
        c.p(parcel, 19, this.f14569t, i10, false);
        c.k(parcel, 20, this.f14570u);
        c.q(parcel, 21, this.f14571v, false);
        c.s(parcel, 22, this.f14572w, false);
        c.k(parcel, 23, this.f14573x);
        c.q(parcel, 24, this.f14574y, false);
        c.b(parcel, a10);
    }
}
