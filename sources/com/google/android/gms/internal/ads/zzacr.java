package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzacr implements zzbp {
    public static final Parcelable.Creator<zzacr> CREATOR = new zzacq();
    private static final zzaf zzf;
    private static final zzaf zzg;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzh;

    static {
        zzad zzad = new zzad();
        zzad.zzS("application/id3");
        zzf = zzad.zzY();
        zzad zzad2 = new zzad();
        zzad2.zzS("application/x-scte35");
        zzg = zzad2.zzY();
    }

    zzacr(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = zzew.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = (byte[]) zzew.zzH(parcel.createByteArray());
    }

    public zzacr(String str, String str2, long j10, long j11, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacr.class == obj.getClass()) {
            zzacr zzacr = (zzacr) obj;
            return this.zzc == zzacr.zzc && this.zzd == zzacr.zzd && zzew.zzU(this.zza, zzacr.zza) && zzew.zzU(this.zzb, zzacr.zzb) && Arrays.equals(this.zze, zzacr.zze);
        }
    }

    public final int hashCode() {
        int i10 = this.zzh;
        if (i10 != 0) {
            return i10;
        }
        String str = this.zza;
        int i11 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.zzb;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        long j10 = this.zzc;
        long j11 = this.zzd;
        int hashCode2 = ((((((((hashCode + 527) * 31) + i11) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.zze);
        this.zzh = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        String str = this.zza;
        long j10 = this.zzd;
        long j11 = this.zzc;
        String str2 = this.zzb;
        return "EMSG: scheme=" + str + ", id=" + j10 + ", durationMs=" + j11 + ", value=" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }

    public final /* synthetic */ void zza(zzbk zzbk) {
    }
}
