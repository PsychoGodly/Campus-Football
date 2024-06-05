package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaei implements zzbp {
    public static final Parcelable.Creator<zzaei> CREATOR = new zzaeg();
    public final float zza;
    public final int zzb;

    public zzaei(float f10, int i10) {
        this.zza = f10;
        this.zzb = i10;
    }

    /* synthetic */ zzaei(Parcel parcel, zzaeh zzaeh) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaei.class == obj.getClass()) {
            zzaei zzaei = (zzaei) obj;
            return this.zza == zzaei.zza && this.zzb == zzaei.zzb;
        }
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + 527) * 31) + this.zzb;
    }

    public final String toString() {
        float f10 = this.zza;
        int i10 = this.zzb;
        return "smta: captureFrameRate=" + f10 + ", svcTemporalLayerCount=" + i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.zza);
        parcel.writeInt(this.zzb);
    }

    public final /* synthetic */ void zza(zzbk zzbk) {
    }
}
