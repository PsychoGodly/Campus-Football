package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.mediation.MaxReward;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbq implements Parcelable {
    public static final Parcelable.Creator<zzbq> CREATOR = new zzbo();
    public final long zza;
    private final zzbp[] zzb;

    public zzbq(long j10, zzbp... zzbpArr) {
        this.zza = j10;
        this.zzb = zzbpArr;
    }

    zzbq(Parcel parcel) {
        this.zzb = new zzbp[parcel.readInt()];
        int i10 = 0;
        while (true) {
            zzbp[] zzbpArr = this.zzb;
            if (i10 < zzbpArr.length) {
                zzbpArr[i10] = (zzbp) parcel.readParcelable(zzbp.class.getClassLoader());
                i10++;
            } else {
                this.zza = parcel.readLong();
                return;
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbq.class == obj.getClass()) {
            zzbq zzbq = (zzbq) obj;
            return Arrays.equals(this.zzb, zzbq.zzb) && this.zza == zzbq.zza;
        }
    }

    public final int hashCode() {
        long j10 = this.zza;
        return (Arrays.hashCode(this.zzb) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        String str;
        String arrays = Arrays.toString(this.zzb);
        long j10 = this.zza;
        if (j10 == -9223372036854775807L) {
            str = MaxReward.DEFAULT_LABEL;
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        return "entries=" + arrays + str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zzb.length);
        for (zzbp writeParcelable : this.zzb) {
            parcel.writeParcelable(writeParcelable, 0);
        }
        parcel.writeLong(this.zza);
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final zzbp zzb(int i10) {
        return this.zzb[i10];
    }

    public final zzbq zzc(zzbp... zzbpArr) {
        if (zzbpArr.length == 0) {
            return this;
        }
        return new zzbq(this.zza, (zzbp[]) zzew.zzae(this.zzb, zzbpArr));
    }

    public final zzbq zzd(zzbq zzbq) {
        return zzbq == null ? this : zzc(zzbq.zzb);
    }

    public zzbq(List list) {
        this(-9223372036854775807L, (zzbp[]) list.toArray(new zzbp[0]));
    }
}
