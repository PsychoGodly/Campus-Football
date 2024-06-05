package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzemu implements zzepm {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzemu(String str, boolean z10, boolean z11, boolean z12) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = z12;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.zza.isEmpty()) {
            bundle.putString("inspector_extras", this.zza);
        }
        bundle.putInt("test_mode", this.zzb ? 1 : 0);
        bundle.putInt("linked_device", this.zzc ? 1 : 0);
        if (!((Boolean) a0.c().zzb(zzbar.zziv)).booleanValue()) {
            return;
        }
        if (this.zzb || this.zzc) {
            bundle.putInt("risd", this.zzd ^ true ? 1 : 0);
        }
    }
}
