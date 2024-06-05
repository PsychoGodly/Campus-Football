package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzx implements Comparator<zzw>, Parcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new zzu();
    public final String zza;
    public final int zzb;
    private final zzw[] zzc;
    private int zzd;

    zzx(Parcel parcel) {
        this.zza = parcel.readString();
        zzw[] zzwArr = (zzw[]) zzew.zzH((zzw[]) parcel.createTypedArray(zzw.CREATOR));
        this.zzc = zzwArr;
        this.zzb = zzwArr.length;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzw zzw = (zzw) obj;
        zzw zzw2 = (zzw) obj2;
        UUID uuid = zzo.zza;
        if (uuid.equals(zzw.zza)) {
            return !uuid.equals(zzw2.zza) ? 1 : 0;
        }
        return zzw.zza.compareTo(zzw2.zza);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzx.class == obj.getClass()) {
            zzx zzx = (zzx) obj;
            return zzew.zzU(this.zza, zzx.zza) && Arrays.equals(this.zzc, zzx.zzc);
        }
    }

    public final int hashCode() {
        int i10;
        int i11 = this.zzd;
        if (i11 != 0) {
            return i11;
        }
        String str = this.zza;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int hashCode = (i10 * 31) + Arrays.hashCode(this.zzc);
        this.zzd = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final zzw zza(int i10) {
        return this.zzc[i10];
    }

    public final zzx zzb(String str) {
        if (zzew.zzU(this.zza, str)) {
            return this;
        }
        return new zzx(str, false, this.zzc);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.android.gms.internal.ads.zzw[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzx(java.lang.String r1, boolean r2, com.google.android.gms.internal.ads.zzw... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.zza = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            com.google.android.gms.internal.ads.zzw[] r3 = (com.google.android.gms.internal.ads.zzw[]) r3
        L_0x000e:
            r0.zzc = r3
            int r1 = r3.length
            r0.zzb = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzx.<init>(java.lang.String, boolean, com.google.android.gms.internal.ads.zzw[]):void");
    }

    public zzx(String str, zzw... zzwArr) {
        this((String) null, true, zzwArr);
    }

    public zzx(List list) {
        this((String) null, false, (zzw[]) list.toArray(new zzw[0]));
    }
}
