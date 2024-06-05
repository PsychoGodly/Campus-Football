package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzftw extends zzfti {
    /* access modifiers changed from: private */
    public zzftv zza;

    zzftw(zzfqf zzfqf, boolean z10, Executor executor, Callable callable) {
        super(zzfqf, z10, false);
        this.zza = new zzftu(this, callable, executor);
        zzw();
    }

    /* access modifiers changed from: package-private */
    public final void zzg(int i10, Object obj) {
    }

    /* access modifiers changed from: protected */
    public final void zzr() {
        zzftv zzftv = this.zza;
        if (zzftv != null) {
            zzftv.zzh();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzv() {
        zzftv zzftv = this.zza;
        if (zzftv != null) {
            zzftv.zzf();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzz(int i10) {
        super.zzz(i10);
        if (i10 == 1) {
            this.zza = null;
        }
    }
}
