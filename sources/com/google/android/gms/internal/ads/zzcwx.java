package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.b5;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcwx extends zzczy implements zzcvi, zzcwn {
    private final zzeyc zzb;
    private final AtomicBoolean zzc = new AtomicBoolean();

    public zzcwx(Set set, zzeyc zzeyc) {
        super(set);
        this.zzb = zzeyc;
    }

    private final void zzb() {
        b5 b5Var;
        if (((Boolean) a0.c().zzb(zzbar.zzhg)).booleanValue() && this.zzc.compareAndSet(false, true) && (b5Var = this.zzb.zzaf) != null && b5Var.f14422a == 3) {
            zzp(new zzcww(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzcwz zzcwz) throws Exception {
        zzcwz.zzh(this.zzb.zzaf);
    }

    public final void zzg() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    public final void zzl() {
        int i10 = this.zzb.zzb;
        if (i10 == 2 || i10 == 5 || i10 == 4 || i10 == 6 || i10 == 7) {
            zzb();
        }
    }
}
