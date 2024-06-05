package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import i5.c;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new e2();

    /* renamed from: a  reason: collision with root package name */
    private String f26250a;

    /* renamed from: b  reason: collision with root package name */
    private String f26251b;

    /* renamed from: c  reason: collision with root package name */
    private final String f26252c;

    /* renamed from: d  reason: collision with root package name */
    private String f26253d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f26254f;

    j(String str, String str2) {
        this(str, str2, (String) null, (String) null, false);
    }

    public static boolean z(String str) {
        f c10;
        if (!TextUtils.isEmpty(str) && (c10 = f.c(str)) != null && c10.b() == 4) {
            return true;
        }
        return false;
    }

    public String v() {
        return URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD;
    }

    public String w() {
        return !TextUtils.isEmpty(this.f26251b) ? URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD : "emailLink";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, this.f26250a, false);
        c.q(parcel, 2, this.f26251b, false);
        c.q(parcel, 3, this.f26252c, false);
        c.q(parcel, 4, this.f26253d, false);
        c.c(parcel, 5, this.f26254f);
        c.b(parcel, a10);
    }

    public final h x() {
        return new j(this.f26250a, this.f26251b, this.f26252c, this.f26253d, this.f26254f);
    }

    public final j y(a0 a0Var) {
        this.f26253d = a0Var.zze();
        this.f26254f = true;
        return this;
    }

    public final String zzb() {
        return this.f26253d;
    }

    public final String zzc() {
        return this.f26250a;
    }

    public final String zzd() {
        return this.f26251b;
    }

    public final String zze() {
        return this.f26252c;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.f26252c);
    }

    public final boolean zzg() {
        return this.f26254f;
    }

    j(String str, String str2, String str3, String str4, boolean z10) {
        this.f26250a = q.g(str);
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            this.f26251b = str2;
            this.f26252c = str3;
            this.f26253d = str4;
            this.f26254f = z10;
            return;
        }
        throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
    }
}
