package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfiz extends a {
    public static final Parcelable.Creator<zzfiz> CREATOR = new zzfja();
    public final int zza;
    private zzans zzb = null;
    private byte[] zzc;

    zzfiz(int i10, byte[] bArr) {
        this.zza = i10;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzans zzans = this.zzb;
        if (zzans == null && this.zzc != null) {
            return;
        }
        if (zzans != null && this.zzc == null) {
            return;
        }
        if (zzans != null && this.zzc != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (zzans == null && this.zzc == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.zza);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzax();
        }
        c.f(parcel, 2, bArr, false);
        c.b(parcel, a10);
    }

    public final zzans zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzans.zze(this.zzc, zzgpy.zza());
                this.zzc = null;
            } catch (zzgqy | NullPointerException e10) {
                throw new IllegalStateException(e10);
            }
        }
        zzb();
        return this.zzb;
    }
}
