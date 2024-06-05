package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzw implements Parcelable {
    public static final Parcelable.Creator<zzw> CREATOR = new zzv();
    public final UUID zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;
    private int zze;

    zzw(Parcel parcel) {
        this.zza = new UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        String readString = parcel.readString();
        int i10 = zzew.zza;
        this.zzc = readString;
        this.zzd = parcel.createByteArray();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzw)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzw zzw = (zzw) obj;
        return zzew.zzU(this.zzb, zzw.zzb) && zzew.zzU(this.zzc, zzw.zzc) && zzew.zzU(this.zza, zzw.zza) && Arrays.equals(this.zzd, zzw.zzd);
    }

    public final int hashCode() {
        int i10;
        int i11 = this.zze;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = this.zza.hashCode() * 31;
        String str = this.zzb;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int hashCode2 = ((((hashCode + i10) * 31) + this.zzc.hashCode()) * 31) + Arrays.hashCode(this.zzd);
        this.zze = hashCode2;
        return hashCode2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.zza.getMostSignificantBits());
        parcel.writeLong(this.zza.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzw(UUID uuid, String str, String str2, byte[] bArr) {
        Objects.requireNonNull(uuid);
        this.zza = uuid;
        this.zzb = null;
        this.zzc = str2;
        this.zzd = bArr;
    }
}
