package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class hb extends a {
    public static final Parcelable.Creator<hb> CREATOR = new gb();

    /* renamed from: a  reason: collision with root package name */
    private final int f24639a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24640b;

    /* renamed from: c  reason: collision with root package name */
    public final long f24641c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f24642d;

    /* renamed from: f  reason: collision with root package name */
    private final Float f24643f;

    /* renamed from: g  reason: collision with root package name */
    public final String f24644g;

    /* renamed from: h  reason: collision with root package name */
    public final String f24645h;

    /* renamed from: i  reason: collision with root package name */
    public final Double f24646i;

    hb(jb jbVar) {
        this(jbVar.f24733c, jbVar.f24734d, jbVar.f24735e, jbVar.f24732b);
    }

    public final Object v() {
        Long l10 = this.f24642d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f24646i;
        if (d10 != null) {
            return d10;
        }
        String str = this.f24644g;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f24639a);
        c.q(parcel, 2, this.f24640b, false);
        c.n(parcel, 3, this.f24641c);
        c.o(parcel, 4, this.f24642d, false);
        c.i(parcel, 5, (Float) null, false);
        c.q(parcel, 6, this.f24644g, false);
        c.q(parcel, 7, this.f24645h, false);
        c.g(parcel, 8, this.f24646i, false);
        c.b(parcel, a10);
    }

    hb(String str, long j10, Object obj, String str2) {
        q.g(str);
        this.f24639a = 2;
        this.f24640b = str;
        this.f24641c = j10;
        this.f24645h = str2;
        if (obj == null) {
            this.f24642d = null;
            this.f24643f = null;
            this.f24646i = null;
            this.f24644g = null;
        } else if (obj instanceof Long) {
            this.f24642d = (Long) obj;
            this.f24643f = null;
            this.f24646i = null;
            this.f24644g = null;
        } else if (obj instanceof String) {
            this.f24642d = null;
            this.f24643f = null;
            this.f24646i = null;
            this.f24644g = (String) obj;
        } else if (obj instanceof Double) {
            this.f24642d = null;
            this.f24643f = null;
            this.f24646i = (Double) obj;
            this.f24644g = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    hb(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f24639a = i10;
        this.f24640b = str;
        this.f24641c = j10;
        this.f24642d = l10;
        Double d11 = null;
        this.f24643f = null;
        if (i10 == 1) {
            this.f24646i = f10 != null ? Double.valueOf(f10.doubleValue()) : d11;
        } else {
            this.f24646i = d10;
        }
        this.f24644g = str2;
        this.f24645h = str3;
    }
}
