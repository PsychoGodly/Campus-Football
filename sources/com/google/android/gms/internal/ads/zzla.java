package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.wifi.WifiManager;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzla {
    private final WifiManager zza;

    public zzla(Context context) {
        this.zza = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }
}
