package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.t;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdtp implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzdtp(zzgxl zzgxl, zzgxl zzgxl2) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        CookieManager b10 = t.s().b((Context) this.zzb.zzb());
        zzfcu zzfcu = zzfcu.WEBVIEW_COOKIE;
        return zzfck.zza(new zzdtm(b10), zzfcu, (zzfda) this.zza.zzb()).zzi(1, TimeUnit.SECONDS).zzc(Exception.class, new zzfcn(zzdtn.zza)).zza();
    }
}
