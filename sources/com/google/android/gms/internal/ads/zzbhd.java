package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbhd implements zzbhp {
    zzbhd() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzcei = (zzcei) obj;
        try {
            zzfkv.zzj(zzcei.getContext()).zzk();
            zzfkw.zzi(zzcei.getContext()).zzj();
        } catch (IOException e10) {
            t.q().zzu(e10, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
