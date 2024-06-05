package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzezt {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzfuu zzc;

    public zzezt(Callable callable, zzfuu zzfuu) {
        this.zzb = callable;
        this.zzc = zzfuu;
    }

    public final synchronized zzfut zza() {
        zzc(1);
        return (zzfut) this.zza.poll();
    }

    public final synchronized void zzb(zzfut zzfut) {
        this.zza.addFirst(zzfut);
    }

    public final synchronized void zzc(int i10) {
        int size = i10 - this.zza.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }
}
