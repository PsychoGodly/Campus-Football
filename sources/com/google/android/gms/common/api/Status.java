package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p;
import h5.b;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class Status extends a implements i, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new r();

    /* renamed from: g  reason: collision with root package name */
    public static final Status f15008g = new Status(-1);

    /* renamed from: h  reason: collision with root package name */
    public static final Status f15009h = new Status(0);

    /* renamed from: i  reason: collision with root package name */
    public static final Status f15010i = new Status(14);

    /* renamed from: j  reason: collision with root package name */
    public static final Status f15011j = new Status(8);

    /* renamed from: k  reason: collision with root package name */
    public static final Status f15012k = new Status(15);

    /* renamed from: l  reason: collision with root package name */
    public static final Status f15013l = new Status(16);

    /* renamed from: m  reason: collision with root package name */
    public static final Status f15014m = new Status(18);

    /* renamed from: n  reason: collision with root package name */
    public static final Status f15015n = new Status(17);

    /* renamed from: a  reason: collision with root package name */
    final int f15016a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15017b;

    /* renamed from: c  reason: collision with root package name */
    private final String f15018c;

    /* renamed from: d  reason: collision with root package name */
    private final PendingIntent f15019d;

    /* renamed from: f  reason: collision with root package name */
    private final b f15020f;

    public Status(int i10) {
        this(i10, (String) null);
    }

    Status(int i10, int i11, String str, PendingIntent pendingIntent, b bVar) {
        this.f15016a = i10;
        this.f15017b = i11;
        this.f15018c = str;
        this.f15019d = pendingIntent;
        this.f15020f = bVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f15016a != status.f15016a || this.f15017b != status.f15017b || !p.a(this.f15018c, status.f15018c) || !p.a(this.f15019d, status.f15019d) || !p.a(this.f15020f, status.f15020f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return p.b(Integer.valueOf(this.f15016a), Integer.valueOf(this.f15017b), this.f15018c, this.f15019d, this.f15020f);
    }

    public Status p() {
        return this;
    }

    public String toString() {
        p.a c10 = p.c(this);
        c10.a("statusCode", zza());
        c10.a("resolution", this.f15019d);
        return c10.toString();
    }

    public b v() {
        return this.f15020f;
    }

    public int w() {
        return this.f15017b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, w());
        c.q(parcel, 2, x(), false);
        c.p(parcel, 3, this.f15019d, i10, false);
        c.p(parcel, 4, v(), i10, false);
        c.k(parcel, 1000, this.f15016a);
        c.b(parcel, a10);
    }

    public String x() {
        return this.f15018c;
    }

    public boolean y() {
        return this.f15019d != null;
    }

    public boolean z() {
        return this.f15017b <= 0;
    }

    public final String zza() {
        String str = this.f15018c;
        return str != null ? str : d.a(this.f15017b);
    }

    public Status(int i10, String str) {
        this(1, i10, str, (PendingIntent) null, (b) null);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(1, i10, str, pendingIntent, (b) null);
    }

    public Status(b bVar, String str) {
        this(bVar, str, 17);
    }

    @Deprecated
    public Status(b bVar, String str, int i10) {
        this(1, i10, str, bVar.x(), bVar);
    }
}
