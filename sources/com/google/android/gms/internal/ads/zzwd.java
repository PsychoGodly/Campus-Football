package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzwd {
    public final zzcp zza;
    public final int[] zzb;

    public zzwd(zzcp zzcp, int[] iArr, int i10) {
        if (iArr.length == 0) {
            zzee.zzc("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzcp;
        this.zzb = iArr;
    }
}
