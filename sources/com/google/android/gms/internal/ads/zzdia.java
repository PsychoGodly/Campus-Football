package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdia implements zzbhp {
    public final /* synthetic */ zzdic zza;
    public final /* synthetic */ View zzb;
    public final /* synthetic */ WindowManager zzc;

    public /* synthetic */ zzdia(zzdic zzdic, View view, WindowManager windowManager) {
        this.zza = zzdic;
        this.zzb = view;
        this.zzc = windowManager;
    }

    public final void zza(Object obj, Map map) {
        this.zza.zze(this.zzb, this.zzc, (zzcei) obj, map);
    }
}
