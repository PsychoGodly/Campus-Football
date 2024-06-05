package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzag;
import com.google.android.gms.internal.p001firebaseauthapi.zzagt;
import i5.c;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class d2 extends m0 {
    public static final Parcelable.Creator<d2> CREATOR = new c2();

    /* renamed from: a  reason: collision with root package name */
    private final String f26189a;

    /* renamed from: b  reason: collision with root package name */
    private final String f26190b;

    /* renamed from: c  reason: collision with root package name */
    private final String f26191c;

    /* renamed from: d  reason: collision with root package name */
    private final zzagt f26192d;

    /* renamed from: f  reason: collision with root package name */
    private final String f26193f;

    /* renamed from: g  reason: collision with root package name */
    private final String f26194g;

    /* renamed from: h  reason: collision with root package name */
    private final String f26195h;

    d2(String str, String str2, String str3, zzagt zzagt, String str4, String str5, String str6) {
        this.f26189a = zzag.zzb(str);
        this.f26190b = str2;
        this.f26191c = str3;
        this.f26192d = zzagt;
        this.f26193f = str4;
        this.f26194g = str5;
        this.f26195h = str6;
    }

    public static zzagt C(d2 d2Var, String str) {
        q.k(d2Var);
        zzagt zzagt = d2Var.f26192d;
        if (zzagt != null) {
            return zzagt;
        }
        return new zzagt(d2Var.z(), d2Var.y(), d2Var.v(), (String) null, d2Var.B(), (String) null, str, d2Var.f26193f, d2Var.f26195h);
    }

    public static d2 I(zzagt zzagt) {
        q.l(zzagt, "Must specify a non-null webSignInCredential");
        return new d2((String) null, (String) null, (String) null, zzagt, (String) null, (String) null, (String) null);
    }

    static d2 J(String str, String str2, String str3, String str4) {
        q.h(str, "Must specify a non-empty providerId");
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return new d2(str, str2, str3, (zzagt) null, (String) null, (String) null, str4);
        }
        throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
    }

    public static d2 K(String str, String str2, String str3, String str4, String str5) {
        q.h(str, "Must specify a non-empty providerId");
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return new d2(str, str2, str3, (zzagt) null, str4, str5, (String) null);
        }
        throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
    }

    public String B() {
        return this.f26194g;
    }

    public String v() {
        return this.f26189a;
    }

    public String w() {
        return this.f26189a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, v(), false);
        c.q(parcel, 2, z(), false);
        c.q(parcel, 3, y(), false);
        c.p(parcel, 4, this.f26192d, i10, false);
        c.q(parcel, 5, this.f26193f, false);
        c.q(parcel, 6, B(), false);
        c.q(parcel, 7, this.f26195h, false);
        c.b(parcel, a10);
    }

    public final h x() {
        return new d2(this.f26189a, this.f26190b, this.f26191c, this.f26192d, this.f26193f, this.f26194g, this.f26195h);
    }

    public String y() {
        return this.f26191c;
    }

    public String z() {
        return this.f26190b;
    }
}
