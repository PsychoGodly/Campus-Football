package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzagt;
import i5.c;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class f0 extends h {
    public static final Parcelable.Creator<f0> CREATOR = new o1();

    /* renamed from: a  reason: collision with root package name */
    private final String f26220a;

    /* renamed from: b  reason: collision with root package name */
    private final String f26221b;

    f0(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        } else if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        } else if (str2 == null || str2.length() != 0) {
            this.f26220a = str;
            this.f26221b = str2;
        } else {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
    }

    public static zzagt y(f0 f0Var, String str) {
        q.k(f0Var);
        return new zzagt(f0Var.f26220a, f0Var.f26221b, f0Var.v(), (String) null, (String) null, (String) null, str, (String) null, (String) null);
    }

    public String v() {
        return "google.com";
    }

    public String w() {
        return "google.com";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, this.f26220a, false);
        c.q(parcel, 2, this.f26221b, false);
        c.b(parcel, a10);
    }

    public final h x() {
        return new f0(this.f26220a, this.f26221b);
    }
}
