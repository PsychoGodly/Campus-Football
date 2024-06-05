package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class q3 extends a {
    public static final Parcelable.Creator<q3> CREATOR = new r3();

    /* renamed from: a  reason: collision with root package name */
    private final int f14528a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14529b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14530c;

    public q3() {
        this(ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION, "22.0.0");
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f14528a);
        c.k(parcel, 2, this.f14529b);
        c.q(parcel, 3, this.f14530c, false);
        c.b(parcel, a10);
    }

    public final int zza() {
        return this.f14529b;
    }

    public q3(int i10, int i11, String str) {
        this.f14528a = i10;
        this.f14529b = i11;
        this.f14530c = str;
    }
}
