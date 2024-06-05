package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdmv implements zzcvj {
    private final zzcei zza;

    zzdmv(zzcei zzcei) {
        this.zza = zzcei;
    }

    public final void zzbn(Context context) {
        zzcei zzcei = this.zza;
        if (zzcei != null) {
            zzcei.destroy();
        }
    }

    public final void zzbp(Context context) {
        zzcei zzcei = this.zza;
        if (zzcei != null) {
            zzcei.onPause();
        }
    }

    public final void zzbq(Context context) {
        zzcei zzcei = this.zza;
        if (zzcei != null) {
            zzcei.onResume();
        }
    }
}
