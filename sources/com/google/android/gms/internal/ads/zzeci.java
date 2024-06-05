package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.t;
import t4.s;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzeci implements zzdee {
    public final /* synthetic */ zzbzs zza;

    public /* synthetic */ zzeci(zzbzs zzbzs) {
        this.zza = zzbzs;
    }

    public final void zza(boolean z10, Context context, zzcvb zzcvb) {
        zzbzs zzbzs = this.zza;
        try {
            t.k();
            s.a(context, (AdOverlayInfoParcel) zzbzs.get(), true);
        } catch (Exception unused) {
        }
    }
}
