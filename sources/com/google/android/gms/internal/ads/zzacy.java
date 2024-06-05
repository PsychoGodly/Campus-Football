package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzacy implements zzbp {
    public static final Parcelable.Creator<zzacy> CREATOR = new zzacx();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzacy(int i10, String str, String str2, String str3, boolean z10, int i11) {
        boolean z11 = true;
        if (i11 != -1 && i11 <= 0) {
            z11 = false;
        }
        zzdl.zzd(z11);
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z10;
        this.zzf = i11;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacy.class == obj.getClass()) {
            zzacy zzacy = (zzacy) obj;
            return this.zza == zzacy.zza && zzew.zzU(this.zzb, zzacy.zzb) && zzew.zzU(this.zzc, zzacy.zzc) && zzew.zzU(this.zzd, zzacy.zzd) && this.zze == zzacy.zze && this.zzf == zzacy.zzf;
        }
    }

    public final int hashCode() {
        int i10 = this.zza + 527;
        String str = this.zzb;
        int i11 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        int i12 = i10 * 31;
        String str2 = this.zzc;
        int hashCode2 = (((i12 + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.zzd;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return ((((hashCode2 + i11) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zzb;
        int i10 = this.zza;
        int i11 = this.zzf;
        return "IcyHeaders: name=\"" + str + "\", genre=\"" + str2 + "\", bitrate=" + i10 + ", metadataInterval=" + i11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeString(this.zzd);
        zzew.zzT(parcel, this.zze);
        parcel.writeInt(this.zzf);
    }

    public final void zza(zzbk zzbk) {
        String str = this.zzc;
        if (str != null) {
            zzbk.zzp(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzbk.zzi(str2);
        }
    }

    zzacy(Parcel parcel) {
        this.zza = parcel.readInt();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.readString();
        this.zze = zzew.zzaa(parcel);
        this.zzf = parcel.readInt();
    }
}
