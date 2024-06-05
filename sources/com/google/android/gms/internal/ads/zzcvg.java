package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcvg extends zzczy {
    private boolean zzb = false;

    public zzcvg(Set set) {
        super(set);
    }

    public final synchronized void zza() {
        if (!this.zzb) {
            zzp(zzcvf.zza);
            this.zzb = true;
        }
    }
}
