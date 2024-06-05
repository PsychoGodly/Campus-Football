package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.util.p1;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdzd implements zzcwc, zzcur {
    private static final Object zza = new Object();
    private static int zzb;
    private final p1 zzc;
    private final zzdzn zzd;

    public zzdzd(zzdzn zzdzn, p1 p1Var) {
        this.zzd = zzdzn;
        this.zzc = p1Var;
    }

    private final void zzb(boolean z10) {
        int i10;
        int intValue;
        if (((Boolean) a0.c().zzb(zzbar.zzfL)).booleanValue() && !this.zzc.zzP()) {
            Object obj = zza;
            synchronized (obj) {
                i10 = zzb;
                intValue = ((Integer) a0.c().zzb(zzbar.zzfM)).intValue();
            }
            if (i10 < intValue) {
                this.zzd.zzd(z10);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    public final void zza(c3 c3Var) {
        zzb(false);
    }

    public final void zzn() {
        zzb(true);
    }
}
