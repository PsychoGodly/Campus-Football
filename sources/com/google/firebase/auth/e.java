package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import i5.c;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class e extends i5.a {
    public static final Parcelable.Creator<e> CREATOR = new z1();

    /* renamed from: a  reason: collision with root package name */
    private final String f26196a;

    /* renamed from: b  reason: collision with root package name */
    private final String f26197b;

    /* renamed from: c  reason: collision with root package name */
    private final String f26198c;

    /* renamed from: d  reason: collision with root package name */
    private final String f26199d;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f26200f;

    /* renamed from: g  reason: collision with root package name */
    private final String f26201g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f26202h;

    /* renamed from: i  reason: collision with root package name */
    private String f26203i;

    /* renamed from: j  reason: collision with root package name */
    private int f26204j;

    /* renamed from: k  reason: collision with root package name */
    private String f26205k;

    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f26206a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f26207b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f26208c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public boolean f26209d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public String f26210e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public boolean f26211f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public String f26212g;

        private a() {
            this.f26211f = false;
        }

        public e a() {
            if (this.f26206a != null) {
                return new e(this);
            }
            throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
        }

        public a b(String str, boolean z10, String str2) {
            this.f26208c = str;
            this.f26209d = z10;
            this.f26210e = str2;
            return this;
        }

        public a c(String str) {
            this.f26212g = str;
            return this;
        }

        public a d(boolean z10) {
            this.f26211f = z10;
            return this;
        }

        public a e(String str) {
            this.f26207b = str;
            return this;
        }

        public a f(String str) {
            this.f26206a = str;
            return this;
        }
    }

    private e(a aVar) {
        this.f26196a = aVar.f26206a;
        this.f26197b = aVar.f26207b;
        this.f26198c = null;
        this.f26199d = aVar.f26208c;
        this.f26200f = aVar.f26209d;
        this.f26201g = aVar.f26210e;
        this.f26202h = aVar.f26211f;
        this.f26205k = aVar.f26212g;
    }

    public static a C() {
        return new a();
    }

    public static e K() {
        return new e(new a());
    }

    public String B() {
        return this.f26196a;
    }

    public final void I(int i10) {
        this.f26204j = i10;
    }

    public final void J(String str) {
        this.f26203i = str;
    }

    public boolean v() {
        return this.f26202h;
    }

    public boolean w() {
        return this.f26200f;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, B(), false);
        c.q(parcel, 2, z(), false);
        c.q(parcel, 3, this.f26198c, false);
        c.q(parcel, 4, y(), false);
        c.c(parcel, 5, w());
        c.q(parcel, 6, x(), false);
        c.c(parcel, 7, v());
        c.q(parcel, 8, this.f26203i, false);
        c.k(parcel, 9, this.f26204j);
        c.q(parcel, 10, this.f26205k, false);
        c.b(parcel, a10);
    }

    public String x() {
        return this.f26201g;
    }

    public String y() {
        return this.f26199d;
    }

    public String z() {
        return this.f26197b;
    }

    public final int zza() {
        return this.f26204j;
    }

    public final String zzc() {
        return this.f26205k;
    }

    public final String zzd() {
        return this.f26198c;
    }

    public final String zze() {
        return this.f26203i;
    }

    e(String str, String str2, String str3, String str4, boolean z10, String str5, boolean z11, String str6, int i10, String str7) {
        this.f26196a = str;
        this.f26197b = str2;
        this.f26198c = str3;
        this.f26199d = str4;
        this.f26200f = z10;
        this.f26201g = str5;
        this.f26202h = z11;
        this.f26203i = str6;
        this.f26204j = i10;
        this.f26205k = str7;
    }
}
