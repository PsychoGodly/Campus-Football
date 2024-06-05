package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzacu implements zzbp {
    public static final Parcelable.Creator<zzacu> CREATOR = new zzact();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzacu(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = i13;
        this.zzg = i14;
        this.zzh = bArr;
    }

    zzacu(Parcel parcel) {
        this.zza = parcel.readInt();
        String readString = parcel.readString();
        int i10 = zzew.zza;
        this.zzb = readString;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = (byte[]) zzew.zzH(parcel.createByteArray());
    }

    public static zzacu zzb(zzen zzen) {
        int zze2 = zzen.zze();
        String zzx = zzen.zzx(zzen.zze(), zzfnh.zza);
        String zzx2 = zzen.zzx(zzen.zze(), zzfnh.zzc);
        int zze3 = zzen.zze();
        int zze4 = zzen.zze();
        int zze5 = zzen.zze();
        int zze6 = zzen.zze();
        int zze7 = zzen.zze();
        byte[] bArr = new byte[zze7];
        zzen.zzB(bArr, 0, zze7);
        return new zzacu(zze2, zzx, zzx2, zze3, zze4, zze5, zze6, bArr);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacu.class == obj.getClass()) {
            zzacu zzacu = (zzacu) obj;
            return this.zza == zzacu.zza && this.zzb.equals(zzacu.zzb) && this.zzc.equals(zzacu.zzc) && this.zzd == zzacu.zzd && this.zze == zzacu.zze && this.zzf == zzacu.zzf && this.zzg == zzacu.zzg && Arrays.equals(this.zzh, zzacu.zzh);
        }
    }

    public final int hashCode() {
        return ((((((((((((((this.zza + 527) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zzc;
        return "Picture: mimeType=" + str + ", description=" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    public final void zza(zzbk zzbk) {
        zzbk.zza(this.zzh, this.zza);
    }
}
