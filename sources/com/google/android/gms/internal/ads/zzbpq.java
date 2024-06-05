package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;
import java.util.Arrays;
import n4.z;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbpq extends a {
    public static final Parcelable.Creator<zzbpq> CREATOR = new zzbpr();
    public final int zza;
    public final int zzb;
    public final int zzc;

    zzbpq(int i10, int i11, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    public static zzbpq zza(z zVar) {
        return new zzbpq(zVar.a(), zVar.c(), zVar.b());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbpq)) {
            zzbpq zzbpq = (zzbpq) obj;
            if (zzbpq.zzc == this.zzc && zzbpq.zzb == this.zzb && zzbpq.zza == this.zza) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        int i10 = this.zza;
        int i11 = this.zzb;
        int i12 = this.zzc;
        return i10 + "." + i11 + "." + i12;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.zza);
        c.k(parcel, 2, this.zzb);
        c.k(parcel, 3, this.zzc);
        c.b(parcel, a10);
    }
}
