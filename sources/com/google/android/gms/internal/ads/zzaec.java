package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaec implements zzbp {
    public static final Parcelable.Creator<zzaec> CREATOR = new zzaea();
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* synthetic */ zzaec(Parcel parcel, zzaeb zzaeb) {
        String readString = parcel.readString();
        int i10 = zzew.zza;
        this.zza = readString;
        this.zzb = (byte[]) zzew.zzH(parcel.createByteArray());
        this.zzc = parcel.readInt();
        this.zzd = parcel.readInt();
    }

    public zzaec(String str, byte[] bArr, int i10, int i11) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i10;
        this.zzd = i11;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaec.class == obj.getClass()) {
            zzaec zzaec = (zzaec) obj;
            return this.zza.equals(zzaec.zza) && Arrays.equals(this.zzb, zzaec.zzb) && this.zzc == zzaec.zzc && this.zzd == zzaec.zzd;
        }
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + 527) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    public final String toString() {
        return "mdta: key=".concat(String.valueOf(this.zza));
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    public final /* synthetic */ void zza(zzbk zzbk) {
    }
}
