package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzadk extends zzadp {
    public static final Parcelable.Creator<zzadk> CREATOR = new zzadj();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    zzadk(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i10 = zzew.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = (byte[]) zzew.zzH(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadk.class == obj.getClass()) {
            zzadk zzadk = (zzadk) obj;
            return zzew.zzU(this.zza, zzadk.zza) && zzew.zzU(this.zzb, zzadk.zzb) && zzew.zzU(this.zzc, zzadk.zzc) && Arrays.equals(this.zzd, zzadk.zzd);
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
        return (((((i11 * 31) + hashCode2) * 31) + i10) * 31) + Arrays.hashCode(this.zzd);
    }

    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        String str3 = this.zzb;
        String str4 = this.zzc;
        return str + ": mimeType=" + str2 + ", filename=" + str3 + ", description=" + str4;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzadk(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bArr;
    }
}
