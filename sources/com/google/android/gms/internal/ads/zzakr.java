package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzakr {
    private final AtomicInteger zza = new AtomicInteger();
    private final Set zzb = new HashSet();
    private final PriorityBlockingQueue zzc = new PriorityBlockingQueue();
    private final PriorityBlockingQueue zzd = new PriorityBlockingQueue();
    private final zzajy zze;
    private final zzakh zzf;
    private final zzaki[] zzg;
    private zzaka zzh;
    private final List zzi = new ArrayList();
    private final List zzj = new ArrayList();
    private final zzakf zzk;

    public zzakr(zzajy zzajy, zzakh zzakh, int i10) {
        zzakf zzakf = new zzakf(new Handler(Looper.getMainLooper()));
        this.zze = zzajy;
        this.zzf = zzakh;
        this.zzg = new zzaki[4];
        this.zzk = zzakf;
    }

    public final zzako zza(zzako zzako) {
        zzako.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzako);
        }
        zzako.zzg(this.zza.incrementAndGet());
        zzako.zzm("add-to-queue");
        zzc(zzako, 0);
        this.zzc.add(zzako);
        return zzako;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzako zzako) {
        synchronized (this.zzb) {
            this.zzb.remove(zzako);
        }
        synchronized (this.zzi) {
            for (zzakq zza2 : this.zzi) {
                zza2.zza();
            }
        }
        zzc(zzako, 5);
    }

    /* access modifiers changed from: package-private */
    public final void zzc(zzako zzako, int i10) {
        synchronized (this.zzj) {
            for (zzakp zza2 : this.zzj) {
                zza2.zza();
            }
        }
    }

    public final void zzd() {
        zzaka zzaka = this.zzh;
        if (zzaka != null) {
            zzaka.zzb();
        }
        zzaki[] zzakiArr = this.zzg;
        for (int i10 = 0; i10 < 4; i10++) {
            zzaki zzaki = zzakiArr[i10];
            if (zzaki != null) {
                zzaki.zza();
            }
        }
        zzaka zzaka2 = new zzaka(this.zzc, this.zzd, this.zze, this.zzk, (byte[]) null);
        this.zzh = zzaka2;
        zzaka2.start();
        for (int i11 = 0; i11 < 4; i11++) {
            zzaki zzaki2 = new zzaki(this.zzd, this.zzf, this.zze, this.zzk, (byte[]) null);
            this.zzg[i11] = zzaki2;
            zzaki2.start();
        }
    }
}
