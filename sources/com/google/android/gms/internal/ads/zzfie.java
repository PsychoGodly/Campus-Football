package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzfie implements OnFailureListener {
    public final /* synthetic */ zzfii zza;

    public /* synthetic */ zzfie(zzfii zzfii) {
        this.zza = zzfii;
    }

    public final void onFailure(Exception exc) {
        this.zza.zzf(exc);
    }
}
