package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzagt;
import i5.c;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class l extends h {
    public static final Parcelable.Creator<l> CREATOR = new f2();

    /* renamed from: a  reason: collision with root package name */
    private final String f26268a;

    l(String str) {
        this.f26268a = q.g(str);
    }

    public static zzagt y(l lVar, String str) {
        q.k(lVar);
        return new zzagt((String) null, lVar.f26268a, lVar.v(), (String) null, (String) null, (String) null, str, (String) null, (String) null);
    }

    public String v() {
        return "facebook.com";
    }

    public String w() {
        return "facebook.com";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, this.f26268a, false);
        c.b(parcel, a10);
    }

    public final h x() {
        return new l(this.f26268a);
    }
}
