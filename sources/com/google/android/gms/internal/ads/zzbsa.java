package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import i5.a;
import i5.c;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbsa extends a {
    public static final Parcelable.Creator<zzbsa> CREATOR = new zzbsb();
    public final View zza;
    public final Map zzb;

    public zzbsa(IBinder iBinder, IBinder iBinder2) {
        this.zza = (View) b.A1(a.C0158a.M0(iBinder));
        this.zzb = (Map) b.A1(a.C0158a.M0(iBinder2));
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 1, b.B1(this.zza).asBinder(), false);
        c.j(parcel, 2, b.B1(this.zzb).asBinder(), false);
        c.b(parcel, a10);
    }
}
