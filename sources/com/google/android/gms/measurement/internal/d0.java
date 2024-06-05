package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import i5.a;
import i5.c;
import r5.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class d0 extends a {
    public static final Parcelable.Creator<d0> CREATOR = new e();

    /* renamed from: a  reason: collision with root package name */
    public final String f24457a;

    /* renamed from: b  reason: collision with root package name */
    public final z f24458b;

    /* renamed from: c  reason: collision with root package name */
    public final String f24459c;

    /* renamed from: d  reason: collision with root package name */
    public final long f24460d;

    d0(d0 d0Var, long j10) {
        q.k(d0Var);
        this.f24457a = d0Var.f24457a;
        this.f24458b = d0Var.f24458b;
        this.f24459c = d0Var.f24459c;
        this.f24460d = j10;
    }

    public final String toString() {
        String str = this.f24459c;
        String str2 = this.f24457a;
        String valueOf = String.valueOf(this.f24458b);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 2, this.f24457a, false);
        c.p(parcel, 3, this.f24458b, i10, false);
        c.q(parcel, 4, this.f24459c, false);
        c.n(parcel, 5, this.f24460d);
        c.b(parcel, a10);
    }

    public d0(String str, z zVar, String str2, long j10) {
        this.f24457a = str;
        this.f24458b = zVar;
        this.f24459c = str2;
        this.f24460d = j10;
    }
}
