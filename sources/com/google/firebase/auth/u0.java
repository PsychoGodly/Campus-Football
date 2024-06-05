package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzagt;
import i5.c;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class u0 extends h {
    public static final Parcelable.Creator<u0> CREATOR = new v1();

    /* renamed from: a  reason: collision with root package name */
    private final String f26333a;

    u0(String str) {
        this.f26333a = q.g(str);
    }

    public static zzagt y(u0 u0Var, String str) {
        q.k(u0Var);
        return new zzagt((String) null, (String) null, u0Var.v(), (String) null, (String) null, u0Var.f26333a, str, (String) null, (String) null);
    }

    public String v() {
        return "playgames.google.com";
    }

    public String w() {
        return "playgames.google.com";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, this.f26333a, false);
        c.b(parcel, a10);
    }

    public final h x() {
        return new u0(this.f26333a);
    }
}
