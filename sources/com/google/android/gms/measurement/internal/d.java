package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new g();

    /* renamed from: a  reason: collision with root package name */
    public String f24446a;

    /* renamed from: b  reason: collision with root package name */
    public String f24447b;

    /* renamed from: c  reason: collision with root package name */
    public hb f24448c;

    /* renamed from: d  reason: collision with root package name */
    public long f24449d;

    /* renamed from: f  reason: collision with root package name */
    public boolean f24450f;

    /* renamed from: g  reason: collision with root package name */
    public String f24451g;

    /* renamed from: h  reason: collision with root package name */
    public d0 f24452h;

    /* renamed from: i  reason: collision with root package name */
    public long f24453i;

    /* renamed from: j  reason: collision with root package name */
    public d0 f24454j;

    /* renamed from: k  reason: collision with root package name */
    public long f24455k;

    /* renamed from: l  reason: collision with root package name */
    public d0 f24456l;

    d(d dVar) {
        q.k(dVar);
        this.f24446a = dVar.f24446a;
        this.f24447b = dVar.f24447b;
        this.f24448c = dVar.f24448c;
        this.f24449d = dVar.f24449d;
        this.f24450f = dVar.f24450f;
        this.f24451g = dVar.f24451g;
        this.f24452h = dVar.f24452h;
        this.f24453i = dVar.f24453i;
        this.f24454j = dVar.f24454j;
        this.f24455k = dVar.f24455k;
        this.f24456l = dVar.f24456l;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 2, this.f24446a, false);
        c.q(parcel, 3, this.f24447b, false);
        c.p(parcel, 4, this.f24448c, i10, false);
        c.n(parcel, 5, this.f24449d);
        c.c(parcel, 6, this.f24450f);
        c.q(parcel, 7, this.f24451g, false);
        c.p(parcel, 8, this.f24452h, i10, false);
        c.n(parcel, 9, this.f24453i);
        c.p(parcel, 10, this.f24454j, i10, false);
        c.n(parcel, 11, this.f24455k);
        c.p(parcel, 12, this.f24456l, i10, false);
        c.b(parcel, a10);
    }

    d(String str, String str2, hb hbVar, long j10, boolean z10, String str3, d0 d0Var, long j11, d0 d0Var2, long j12, d0 d0Var3) {
        this.f24446a = str;
        this.f24447b = str2;
        this.f24448c = hbVar;
        this.f24449d = j10;
        this.f24450f = z10;
        this.f24451g = str3;
        this.f24452h = d0Var;
        this.f24453i = j11;
        this.f24454j = d0Var2;
        this.f24455k = j12;
        this.f24456l = d0Var3;
    }
}
