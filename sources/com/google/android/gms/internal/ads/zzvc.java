package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzvc implements zzvx {
    public final /* synthetic */ zzwc zza;
    public final /* synthetic */ zzvq zzb;
    public final /* synthetic */ boolean zzc;

    public /* synthetic */ zzvc(zzwc zzwc, zzvq zzvq, boolean z10) {
        this.zza = zzwc;
        this.zzb = zzvq;
        this.zzc = z10;
    }

    public final List zza(int i10, zzcp zzcp, int[] iArr) {
        zzwc zzwc = this.zza;
        zzvq zzvq = this.zzb;
        boolean z10 = this.zzc;
        zzvb zzvb = new zzvb(zzwc);
        zzfqh zzi = zzfqk.zzi();
        zzcp zzcp2 = zzcp;
        int i11 = 0;
        while (true) {
            int i12 = zzcp2.zzb;
            if (i11 > 0) {
                return zzi.zzi();
            }
            zzi.zzf(new zzvk(i10, zzcp, i11, zzvq, iArr[i11], z10, zzvb));
            i11++;
        }
    }
}
