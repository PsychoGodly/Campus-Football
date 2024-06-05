package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzadg extends zzadp {
    public static final Parcelable.Creator<zzadg> CREATOR = new zzadf();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzadp[] zze;

    zzadg(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i10 = zzew.zza;
        this.zza = readString;
        boolean z10 = true;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() == 0 ? false : z10;
        this.zzd = (String[]) zzew.zzH(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.zze = new zzadp[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.zze[i11] = (zzadp) parcel.readParcelable(zzadp.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadg.class == obj.getClass()) {
            zzadg zzadg = (zzadg) obj;
            return this.zzb == zzadg.zzb && this.zzc == zzadg.zzc && zzew.zzU(this.zza, zzadg.zza) && Arrays.equals(this.zzd, zzadg.zzd) && Arrays.equals(this.zze, zzadg.zze);
        }
    }

    public final int hashCode() {
        int i10 = (((this.zzb ? 1 : 0) + true) * 31) + (this.zzc ? 1 : 0);
        String str = this.zza;
        return (i10 * 31) + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : 0);
        parcel.writeByte(this.zzc ? (byte) 1 : 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzadp writeParcelable : this.zze) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public zzadg(String str, boolean z10, boolean z11, String[] strArr, zzadp[] zzadpArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = strArr;
        this.zze = zzadpArr;
    }
}
