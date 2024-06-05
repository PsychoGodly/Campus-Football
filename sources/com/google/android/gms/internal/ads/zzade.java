package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzade extends zzadp {
    public static final Parcelable.Creator<zzade> CREATOR = new zzadd();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzadp[] zzg;

    zzade(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i10 = zzew.zza;
        this.zza = readString;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzg = new zzadp[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.zzg[i11] = (zzadp) parcel.readParcelable(zzadp.class.getClassLoader());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzade.class == obj.getClass()) {
            zzade zzade = (zzade) obj;
            return this.zzb == zzade.zzb && this.zzc == zzade.zzc && this.zzd == zzade.zzd && this.zze == zzade.zze && zzew.zzU(this.zza, zzade.zza) && Arrays.equals(this.zzg, zzade.zzg);
        }
    }

    public final int hashCode() {
        int i10 = ((this.zzb + 527) * 31) + this.zzc;
        int i11 = (int) this.zzd;
        int i12 = (int) this.zze;
        String str = this.zza;
        return (((((i10 * 31) + i11) * 31) + i12) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (zzadp writeParcelable : this.zzg) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public zzade(String str, int i10, int i11, long j10, long j11, zzadp[] zzadpArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10;
        this.zze = j11;
        this.zzg = zzadpArr;
    }
}
