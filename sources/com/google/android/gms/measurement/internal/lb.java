package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import i5.a;
import i5.c;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class lb extends a {
    public static final Parcelable.Creator<lb> CREATOR = new mb();
    public final long A;
    public final int B;
    public final String C;
    public final int D;
    public final long E;

    /* renamed from: a  reason: collision with root package name */
    public final String f24779a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24780b;

    /* renamed from: c  reason: collision with root package name */
    public final String f24781c;

    /* renamed from: d  reason: collision with root package name */
    public final String f24782d;

    /* renamed from: f  reason: collision with root package name */
    public final long f24783f;

    /* renamed from: g  reason: collision with root package name */
    public final long f24784g;

    /* renamed from: h  reason: collision with root package name */
    public final String f24785h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f24786i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f24787j;

    /* renamed from: k  reason: collision with root package name */
    public final long f24788k;

    /* renamed from: l  reason: collision with root package name */
    public final String f24789l;
    @Deprecated

    /* renamed from: m  reason: collision with root package name */
    private final long f24790m;

    /* renamed from: n  reason: collision with root package name */
    public final long f24791n;

    /* renamed from: o  reason: collision with root package name */
    public final int f24792o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f24793p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f24794q;

    /* renamed from: r  reason: collision with root package name */
    public final String f24795r;

    /* renamed from: s  reason: collision with root package name */
    public final Boolean f24796s;

    /* renamed from: t  reason: collision with root package name */
    public final long f24797t;

    /* renamed from: u  reason: collision with root package name */
    public final List<String> f24798u;

    /* renamed from: v  reason: collision with root package name */
    private final String f24799v;

    /* renamed from: w  reason: collision with root package name */
    public final String f24800w;

    /* renamed from: x  reason: collision with root package name */
    public final String f24801x;

    /* renamed from: y  reason: collision with root package name */
    public final String f24802y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f24803z;

    lb(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List<String> list, String str8, String str9, String str10, String str11, boolean z14, long j16, int i11, String str12, int i12, long j17) {
        q.g(str);
        this.f24779a = str;
        this.f24780b = TextUtils.isEmpty(str2) ? null : str2;
        this.f24781c = str3;
        this.f24788k = j10;
        this.f24782d = str4;
        this.f24783f = j11;
        this.f24784g = j12;
        this.f24785h = str5;
        this.f24786i = z10;
        this.f24787j = z11;
        this.f24789l = str6;
        this.f24790m = j13;
        this.f24791n = j14;
        this.f24792o = i10;
        this.f24793p = z12;
        this.f24794q = z13;
        this.f24795r = str7;
        this.f24796s = bool;
        this.f24797t = j15;
        this.f24798u = list;
        this.f24799v = null;
        this.f24800w = str9;
        this.f24801x = str10;
        this.f24802y = str11;
        this.f24803z = z14;
        this.A = j16;
        this.B = i11;
        this.C = str12;
        this.D = i12;
        this.E = j17;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 2, this.f24779a, false);
        c.q(parcel, 3, this.f24780b, false);
        c.q(parcel, 4, this.f24781c, false);
        c.q(parcel, 5, this.f24782d, false);
        c.n(parcel, 6, this.f24783f);
        c.n(parcel, 7, this.f24784g);
        c.q(parcel, 8, this.f24785h, false);
        c.c(parcel, 9, this.f24786i);
        c.c(parcel, 10, this.f24787j);
        c.n(parcel, 11, this.f24788k);
        c.q(parcel, 12, this.f24789l, false);
        c.n(parcel, 13, this.f24790m);
        c.n(parcel, 14, this.f24791n);
        c.k(parcel, 15, this.f24792o);
        c.c(parcel, 16, this.f24793p);
        c.c(parcel, 18, this.f24794q);
        c.q(parcel, 19, this.f24795r, false);
        c.d(parcel, 21, this.f24796s, false);
        c.n(parcel, 22, this.f24797t);
        c.s(parcel, 23, this.f24798u, false);
        c.q(parcel, 24, this.f24799v, false);
        c.q(parcel, 25, this.f24800w, false);
        c.q(parcel, 26, this.f24801x, false);
        c.q(parcel, 27, this.f24802y, false);
        c.c(parcel, 28, this.f24803z);
        c.n(parcel, 29, this.A);
        c.k(parcel, 30, this.B);
        c.q(parcel, 31, this.C, false);
        c.k(parcel, 32, this.D);
        c.n(parcel, 34, this.E);
        c.b(parcel, a10);
    }

    lb(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List<String> list, String str8, String str9, String str10, String str11, boolean z14, long j16, int i11, String str12, int i12, long j17) {
        this.f24779a = str;
        this.f24780b = str2;
        this.f24781c = str3;
        this.f24788k = j12;
        this.f24782d = str4;
        this.f24783f = j10;
        this.f24784g = j11;
        this.f24785h = str5;
        this.f24786i = z10;
        this.f24787j = z11;
        this.f24789l = str6;
        this.f24790m = j13;
        this.f24791n = j14;
        this.f24792o = i10;
        this.f24793p = z12;
        this.f24794q = z13;
        this.f24795r = str7;
        this.f24796s = bool;
        this.f24797t = j15;
        this.f24798u = list;
        this.f24799v = str8;
        this.f24800w = str9;
        this.f24801x = str10;
        this.f24802y = str11;
        this.f24803z = z14;
        this.A = j16;
        this.B = i11;
        this.C = str12;
        this.D = i12;
        this.E = j17;
    }
}
