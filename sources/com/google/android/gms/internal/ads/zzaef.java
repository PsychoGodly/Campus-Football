package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaef implements zzbp {
    public static final Parcelable.Creator<zzaef> CREATOR = new zzaed();
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzaef(long j10, long j11, long j12, long j13, long j14) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = j12;
        this.zzd = j13;
        this.zze = j14;
    }

    /* synthetic */ zzaef(Parcel parcel, zzaee zzaee) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaef.class == obj.getClass()) {
            zzaef zzaef = (zzaef) obj;
            return this.zza == zzaef.zza && this.zzb == zzaef.zzb && this.zzc == zzaef.zzc && this.zzd == zzaef.zzd && this.zze == zzaef.zze;
        }
    }

    public final int hashCode() {
        long j10 = this.zza;
        long j11 = j10 ^ (j10 >>> 32);
        long j12 = this.zzb;
        long j13 = j12 ^ (j12 >>> 32);
        long j14 = this.zzc;
        long j15 = j14 ^ (j14 >>> 32);
        long j16 = this.zzd;
        long j17 = j16 ^ (j16 >>> 32);
        long j18 = this.zze;
        return ((((((((((int) j11) + 527) * 31) + ((int) j13)) * 31) + ((int) j15)) * 31) + ((int) j17)) * 31) + ((int) (j18 ^ (j18 >>> 32)));
    }

    public final String toString() {
        long j10 = this.zza;
        long j11 = this.zzb;
        long j12 = this.zzc;
        long j13 = this.zzd;
        long j14 = this.zze;
        return "Motion photo metadata: photoStartPosition=" + j10 + ", photoSize=" + j11 + ", photoPresentationTimestampUs=" + j12 + ", videoStartPosition=" + j13 + ", videoSize=" + j14;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
    }

    public final /* synthetic */ void zza(zzbk zzbk) {
    }
}
