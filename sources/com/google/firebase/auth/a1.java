package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzagt;
import i5.c;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class a1 extends h {
    public static final Parcelable.Creator<a1> CREATOR = new x1();

    /* renamed from: a  reason: collision with root package name */
    private String f26174a;

    /* renamed from: b  reason: collision with root package name */
    private String f26175b;

    a1(String str, String str2) {
        this.f26174a = q.g(str);
        this.f26175b = q.g(str2);
    }

    public static zzagt y(a1 a1Var, String str) {
        q.k(a1Var);
        return new zzagt((String) null, a1Var.f26174a, a1Var.v(), (String) null, a1Var.f26175b, (String) null, str, (String) null, (String) null);
    }

    public String v() {
        return "twitter.com";
    }

    public String w() {
        return "twitter.com";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, this.f26174a, false);
        c.q(parcel, 2, this.f26175b, false);
        c.b(parcel, a10);
    }

    public final h x() {
        return new a1(this.f26174a, this.f26175b);
    }
}
