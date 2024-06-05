package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzagt;
import i5.c;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class d0 extends h {
    public static final Parcelable.Creator<d0> CREATOR = new n1();

    /* renamed from: a  reason: collision with root package name */
    private String f26179a;

    d0(String str) {
        this.f26179a = q.g(str);
    }

    public static zzagt y(d0 d0Var, String str) {
        q.k(d0Var);
        return new zzagt((String) null, d0Var.f26179a, d0Var.v(), (String) null, (String) null, (String) null, str, (String) null, (String) null);
    }

    public String v() {
        return "github.com";
    }

    public String w() {
        return "github.com";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, this.f26179a, false);
        c.b(parcel, a10);
    }

    public final h x() {
        return new d0(this.f26179a);
    }
}
