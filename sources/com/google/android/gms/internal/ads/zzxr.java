package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzxr {
    private final zzyd zza;
    private final zzxs zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private final ArrayDeque zzd = new ArrayDeque();
    private boolean zze = true;
    private final zzda zzf = zzda.zza;

    public zzxr(zzyd zzyd, zzxs zzxs) {
        this.zza = zzyd;
        this.zzb = zzxs;
    }

    public final void zza(String str) {
        Context zzab = this.zzb.zze;
        if (zzew.zza >= 29 && zzab.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            zzfnb.zzb(str).startsWith("OMX.");
        }
    }

    public final boolean zzb(zzaf zzaf) throws zzhj {
        if (!this.zze) {
            return false;
        }
        this.zze = false;
        return false;
    }
}
