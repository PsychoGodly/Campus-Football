package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzei extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    private final zzel zza;

    public zzei(zzel zzel) {
        this.zza = zzel;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i10 = 5;
        boolean z10 = overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5;
        zzel zzel = this.zza;
        if (true == z10) {
            i10 = 10;
        }
        zzel.zzc(zzel, i10);
    }
}
