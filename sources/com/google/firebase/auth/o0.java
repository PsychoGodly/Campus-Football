package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import i5.c;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class o0 extends h implements Cloneable {
    public static final Parcelable.Creator<o0> CREATOR = new s1();

    /* renamed from: a  reason: collision with root package name */
    private String f26289a;

    /* renamed from: b  reason: collision with root package name */
    private String f26290b;

    /* renamed from: c  reason: collision with root package name */
    private String f26291c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f26292d;

    /* renamed from: f  reason: collision with root package name */
    private String f26293f;

    o0(String str, String str2, String str3, boolean z10, String str4) {
        q.b((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)), "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.");
        this.f26289a = str;
        this.f26290b = str2;
        this.f26291c = str3;
        this.f26292d = z10;
        this.f26293f = str4;
    }

    public static o0 C(String str, String str2) {
        return new o0((String) null, (String) null, str, true, str2);
    }

    public static o0 z(String str, String str2) {
        return new o0(str, str2, (String) null, true, (String) null);
    }

    public final o0 B(boolean z10) {
        this.f26292d = false;
        return this;
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new o0(this.f26289a, y(), this.f26291c, this.f26292d, this.f26293f);
    }

    public String v() {
        return "phone";
    }

    public String w() {
        return "phone";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, this.f26289a, false);
        c.q(parcel, 2, y(), false);
        c.q(parcel, 4, this.f26291c, false);
        c.c(parcel, 5, this.f26292d);
        c.q(parcel, 6, this.f26293f, false);
        c.b(parcel, a10);
    }

    public final h x() {
        return (o0) clone();
    }

    public String y() {
        return this.f26290b;
    }

    public final String zzb() {
        return this.f26291c;
    }

    public final String zzc() {
        return this.f26289a;
    }

    public final String zzd() {
        return this.f26293f;
    }

    public final boolean zze() {
        return this.f26292d;
    }
}
