package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzada extends zzadp {
    public static final Parcelable.Creator<zzada> CREATOR = new zzacz();
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    zzada(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i10 = zzew.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = (byte[]) zzew.zzH(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzada.class == obj.getClass()) {
            zzada zzada = (zzada) obj;
            return this.zzc == zzada.zzc && zzew.zzU(this.zza, zzada.zza) && zzew.zzU(this.zzb, zzada.zzb) && Arrays.equals(this.zzd, zzada.zzd);
        }
    }

    public final int hashCode() {
        int i10 = this.zzc + 527;
        String str = this.zza;
        int i11 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        int i12 = i10 * 31;
        String str2 = this.zzb;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return ((((i12 + hashCode) * 31) + i11) * 31) + Arrays.hashCode(this.zzd);
    }

    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        String str3 = this.zzb;
        return str + ": mimeType=" + str2 + ", description=" + str3;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public final void zza(zzbk zzbk) {
        zzbk.zza(this.zzd, this.zzc);
    }

    public zzada(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = bArr;
    }
}
