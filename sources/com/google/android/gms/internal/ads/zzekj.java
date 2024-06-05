package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.f5;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzekj implements zzepm {
    private final f5 zza;
    private final zzbzg zzb;
    private final boolean zzc;

    public zzekj(f5 f5Var, zzbzg zzbzg, boolean z10) {
        this.zza = f5Var;
        this.zzb = zzbzg;
        this.zzc = z10;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zzb.zzc >= ((Integer) a0.c().zzb(zzbar.zzeN)).intValue()) {
            bundle.putString("app_open_version", CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
        }
        if (((Boolean) a0.c().zzb(zzbar.zzeO)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzc);
        }
        f5 f5Var = this.zza;
        if (f5Var != null) {
            int i10 = f5Var.f14465a;
            if (i10 == 1) {
                bundle.putString("avo", "p");
            } else if (i10 == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
