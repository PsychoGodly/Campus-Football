package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdhz implements zzbhp {
    public final /* synthetic */ zzdic zza;
    public final /* synthetic */ WindowManager zzb;
    public final /* synthetic */ View zzc;

    public /* synthetic */ zzdhz(zzdic zzdic, WindowManager windowManager, View view) {
        this.zza = zzdic;
        this.zzb = windowManager;
        this.zzc = view;
    }

    public final void zza(Object obj, Map map) {
        this.zza.zzc(this.zzb, this.zzc, (zzcei) obj, map);
    }
}
