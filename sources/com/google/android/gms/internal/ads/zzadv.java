package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzadv extends zzadp {
    public static final Parcelable.Creator<zzadv> CREATOR = new zzadu();
    public final String zza;
    public final byte[] zzb;

    zzadv(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i10 = zzew.zza;
        this.zza = readString;
        this.zzb = (byte[]) zzew.zzH(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadv.class == obj.getClass()) {
            zzadv zzadv = (zzadv) obj;
            return zzew.zzU(this.zza, zzadv.zza) && Arrays.equals(this.zzb, zzadv.zzb);
        }
    }

    public final int hashCode() {
        String str = this.zza;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.zzb);
    }

    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        return str + ": owner=" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
    }

    public zzadv(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }
}
