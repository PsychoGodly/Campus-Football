package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzfmn implements IBinder.DeathRecipient {
    public final /* synthetic */ zzfmv zza;

    public /* synthetic */ zzfmn(zzfmv zzfmv) {
        this.zza = zzfmv;
    }

    public final void binderDied() {
        zzfmv.zzj(this.zza);
    }
}
