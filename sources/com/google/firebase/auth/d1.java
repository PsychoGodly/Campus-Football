package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import i5.c;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class d1 extends i5.a {
    public static final Parcelable.Creator<d1> CREATOR = new y1();

    /* renamed from: a  reason: collision with root package name */
    private String f26180a;

    /* renamed from: b  reason: collision with root package name */
    private String f26181b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f26182c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f26183d;

    /* renamed from: f  reason: collision with root package name */
    private Uri f26184f;

    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f26185a;

        /* renamed from: b  reason: collision with root package name */
        private Uri f26186b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f26187c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f26188d;

        public d1 a() {
            String str = this.f26185a;
            Uri uri = this.f26186b;
            return new d1(str, uri == null ? null : uri.toString(), this.f26187c, this.f26188d);
        }

        public a b(String str) {
            if (str == null) {
                this.f26187c = true;
            } else {
                this.f26185a = str;
            }
            return this;
        }

        public a c(Uri uri) {
            if (uri == null) {
                this.f26188d = true;
            } else {
                this.f26186b = uri;
            }
            return this;
        }
    }

    d1(String str, String str2, boolean z10, boolean z11) {
        this.f26180a = str;
        this.f26181b = str2;
        this.f26182c = z10;
        this.f26183d = z11;
        this.f26184f = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    public String m() {
        return this.f26180a;
    }

    public Uri v() {
        return this.f26184f;
    }

    public final boolean w() {
        return this.f26182c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 2, m(), false);
        c.q(parcel, 3, this.f26181b, false);
        c.c(parcel, 4, this.f26182c);
        c.c(parcel, 5, this.f26183d);
        c.b(parcel, a10);
    }

    public final String zza() {
        return this.f26181b;
    }

    public final boolean zzc() {
        return this.f26183d;
    }
}
