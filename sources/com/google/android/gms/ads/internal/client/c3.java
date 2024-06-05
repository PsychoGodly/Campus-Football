package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;
import n4.n;
import n4.y;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class c3 extends a {
    public static final Parcelable.Creator<c3> CREATOR = new d4();

    /* renamed from: a  reason: collision with root package name */
    public final int f14427a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14428b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14429c;

    /* renamed from: d  reason: collision with root package name */
    public c3 f14430d;

    /* renamed from: f  reason: collision with root package name */
    public IBinder f14431f;

    public c3(int i10, String str, String str2, c3 c3Var, IBinder iBinder) {
        this.f14427a = i10;
        this.f14428b = str;
        this.f14429c = str2;
        this.f14430d = c3Var;
        this.f14431f = iBinder;
    }

    public final n4.a v() {
        c3 c3Var = this.f14430d;
        return new n4.a(this.f14427a, this.f14428b, this.f14429c, c3Var == null ? null : new n4.a(c3Var.f14427a, c3Var.f14428b, c3Var.f14429c));
    }

    public final n w() {
        n4.a aVar;
        c3 c3Var = this.f14430d;
        p2 p2Var = null;
        if (c3Var == null) {
            aVar = null;
        } else {
            aVar = new n4.a(c3Var.f14427a, c3Var.f14428b, c3Var.f14429c);
        }
        int i10 = this.f14427a;
        String str = this.f14428b;
        String str2 = this.f14429c;
        IBinder iBinder = this.f14431f;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            p2Var = queryLocalInterface instanceof p2 ? (p2) queryLocalInterface : new n2(iBinder);
        }
        return new n(i10, str, str2, aVar, y.f(p2Var));
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f14427a);
        c.q(parcel, 2, this.f14428b, false);
        c.q(parcel, 3, this.f14429c, false);
        c.p(parcel, 4, this.f14430d, i10, false);
        c.j(parcel, 5, this.f14431f, false);
        c.b(parcel, a10);
    }
}
