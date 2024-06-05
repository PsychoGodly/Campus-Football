package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzapz extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzaqa zza;

    zzapz(zzaqa zzaqa) {
        this.zza = zzaqa;
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzaqa.class) {
            this.zza.zza = networkCapabilities;
        }
    }

    public final void onLost(Network network) {
        synchronized (zzaqa.class) {
            this.zza.zza = null;
        }
    }
}
