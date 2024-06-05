package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b0;
import com.google.android.gms.ads.internal.util.b2;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzccm extends b0 {
    final zzcbj zza;
    final zzccu zzb;
    private final String zzc;
    private final String[] zzd;

    zzccm(zzcbj zzcbj, zzccu zzccu, String str, String[] strArr) {
        this.zza = zzcbj;
        this.zzb = zzccu;
        this.zzc = str;
        this.zzd = strArr;
        t.A().zzb(this);
    }

    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        } finally {
            b2.f14773i.post(new zzccl(this));
        }
    }

    public final zzfut zzb() {
        if (!((Boolean) a0.c().zzb(zzbar.zzbM)).booleanValue() || !(this.zzb instanceof zzcdd)) {
            return super.zzb();
        }
        return zzbzn.zze.zzb(new zzcck(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Boolean zzd() throws Exception {
        return Boolean.valueOf(this.zzb.zzw(this.zzc, this.zzd, this));
    }

    public final String zze() {
        return this.zzc;
    }
}
