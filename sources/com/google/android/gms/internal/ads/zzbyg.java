package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbyg extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzbyj zza;

    zzbyg(zzbyj zzbyj) {
        this.zza = zzbyj;
    }

    public final void onAvailable(Network network) {
        this.zza.zzn.set(true);
    }

    public final void onLost(Network network) {
        this.zza.zzn.set(false);
    }
}
