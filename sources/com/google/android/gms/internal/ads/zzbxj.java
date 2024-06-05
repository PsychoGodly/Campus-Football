package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbxj implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbxk zza;
    private final String zzb;

    public zzbxj(zzbxk zzbxk, String str) {
        this.zza = zzbxk;
        this.zzb = str;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zza) {
            for (zzbxi zzbxi : this.zza.zzb) {
                zzbxi.zza.zzb(zzbxi.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
