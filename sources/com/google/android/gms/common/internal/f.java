package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.j;
import h5.d;
import i5.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new i1();

    /* renamed from: p  reason: collision with root package name */
    static final Scope[] f15381p = new Scope[0];

    /* renamed from: q  reason: collision with root package name */
    static final d[] f15382q = new d[0];

    /* renamed from: a  reason: collision with root package name */
    final int f15383a;

    /* renamed from: b  reason: collision with root package name */
    final int f15384b;

    /* renamed from: c  reason: collision with root package name */
    int f15385c;

    /* renamed from: d  reason: collision with root package name */
    String f15386d;

    /* renamed from: f  reason: collision with root package name */
    IBinder f15387f;

    /* renamed from: g  reason: collision with root package name */
    Scope[] f15388g;

    /* renamed from: h  reason: collision with root package name */
    Bundle f15389h;

    /* renamed from: i  reason: collision with root package name */
    Account f15390i;

    /* renamed from: j  reason: collision with root package name */
    d[] f15391j;

    /* renamed from: k  reason: collision with root package name */
    d[] f15392k;

    /* renamed from: l  reason: collision with root package name */
    boolean f15393l;

    /* renamed from: m  reason: collision with root package name */
    int f15394m;

    /* renamed from: n  reason: collision with root package name */
    boolean f15395n;

    /* renamed from: o  reason: collision with root package name */
    private String f15396o;

    f(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, d[] dVarArr, d[] dVarArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f15381p : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        dVarArr = dVarArr == null ? f15382q : dVarArr;
        dVarArr2 = dVarArr2 == null ? f15382q : dVarArr2;
        this.f15383a = i10;
        this.f15384b = i11;
        this.f15385c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f15386d = "com.google.android.gms";
        } else {
            this.f15386d = str;
        }
        if (i10 < 2) {
            this.f15390i = iBinder != null ? a.A1(j.a.M0(iBinder)) : null;
        } else {
            this.f15387f = iBinder;
            this.f15390i = account;
        }
        this.f15388g = scopeArr;
        this.f15389h = bundle;
        this.f15391j = dVarArr;
        this.f15392k = dVarArr2;
        this.f15393l = z10;
        this.f15394m = i13;
        this.f15395n = z11;
        this.f15396o = str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        i1.a(this, parcel, i10);
    }

    public final String zza() {
        return this.f15396o;
    }
}
