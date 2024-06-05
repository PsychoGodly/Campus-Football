package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzadi extends zzadp {
    public static final Parcelable.Creator<zzadi> CREATOR = new zzadh();
    public final String zza;
    public final String zzb;
    public final String zzc;

    zzadi(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i10 = zzew.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadi.class == obj.getClass()) {
            zzadi zzadi = (zzadi) obj;
            return zzew.zzU(this.zzb, zzadi.zzb) && zzew.zzU(this.zza, zzadi.zza) && zzew.zzU(this.zzc, zzadi.zzc);
        }
    }

    public final int hashCode() {
        String str = this.zza;
        int i10 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.zzb;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i11 = hashCode + 527;
        String str3 = this.zzc;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return (((i11 * 31) + hashCode2) * 31) + i10;
    }

    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        String str3 = this.zzb;
        return str + ": language=" + str2 + ", description=" + str3;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzc);
    }

    public zzadi(String str, String str2, String str3) {
        super("COMM");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }
}
