package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.internal.ads.zzezx;
import com.google.android.gms.internal.ads.zzfoj;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class a0 extends a {
    public static final Parcelable.Creator<a0> CREATOR = new c0();

    /* renamed from: a  reason: collision with root package name */
    public final String f14765a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14766b;

    a0(String str, int i10) {
        this.f14765a = str == null ? MaxReward.DEFAULT_LABEL : str;
        this.f14766b = i10;
    }

    public static a0 w(Throwable th) {
        String str;
        c3 zza = zzezx.zza(th);
        if (zzfoj.zzd(th.getMessage())) {
            str = zza.f14428b;
        } else {
            str = th.getMessage();
        }
        return new a0(str, zza.f14427a);
    }

    public final z v() {
        return new z(this.f14765a, this.f14766b);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, this.f14765a, false);
        c.k(parcel, 2, this.f14766b);
        c.b(parcel, a10);
    }
}
