package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzvg implements zzvx {
    public final /* synthetic */ zzvq zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzvg(zzvq zzvq, String str) {
        this.zza = zzvq;
        this.zzb = str;
    }

    public final List zza(int i10, zzcp zzcp, int[] iArr) {
        zzvq zzvq = this.zza;
        String str = this.zzb;
        int i11 = zzwc.zzb;
        zzfqh zzi = zzfqk.zzi();
        int i12 = 0;
        while (true) {
            int i13 = zzcp.zzb;
            if (i12 > 0) {
                return zzi.zzi();
            }
            zzi.zzf(new zzvw(i10, zzcp, i12, zzvq, iArr[i12], str));
            i12++;
        }
    }
}
