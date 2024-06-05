package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzadt extends zzadp {
    public static final Parcelable.Creator<zzadt> CREATOR = new zzads();
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public zzadt(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadt.class == obj.getClass()) {
            zzadt zzadt = (zzadt) obj;
            return this.zza == zzadt.zza && this.zzb == zzadt.zzb && this.zzc == zzadt.zzc && Arrays.equals(this.zzd, zzadt.zzd) && Arrays.equals(this.zze, zzadt.zze);
        }
    }

    public final int hashCode() {
        return ((((((((this.zza + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + Arrays.hashCode(this.zzd)) * 31) + Arrays.hashCode(this.zze);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeIntArray(this.zzd);
        parcel.writeIntArray(this.zze);
    }

    zzadt(Parcel parcel) {
        super("MLLT");
        this.zza = parcel.readInt();
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = (int[]) zzew.zzH(parcel.createIntArray());
        this.zze = (int[]) zzew.zzH(parcel.createIntArray());
    }
}
