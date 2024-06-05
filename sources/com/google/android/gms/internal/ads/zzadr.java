package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzadr extends zzadp {
    public static final Parcelable.Creator<zzadr> CREATOR = new zzadq();
    public final String zza;
    public final String zzb;
    public final String zzc;

    zzadr(Parcel parcel) {
        super("----");
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
        if (obj != null && zzadr.class == obj.getClass()) {
            zzadr zzadr = (zzadr) obj;
            return zzew.zzU(this.zzb, zzadr.zzb) && zzew.zzU(this.zza, zzadr.zza) && zzew.zzU(this.zzc, zzadr.zzc);
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
        return str + ": domain=" + str2 + ", description=" + str3;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzc);
    }

    public zzadr(String str, String str2, String str3) {
        super("----");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }
}
