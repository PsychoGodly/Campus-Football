package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfbf {
    private final zzfaj zza;
    private final zzfbd zzb;
    private final zzfaf zzc;
    /* access modifiers changed from: private */
    public final ArrayDeque zzd;
    /* access modifiers changed from: private */
    public zzfbl zze;
    /* access modifiers changed from: private */
    public int zzf = 1;

    public zzfbf(zzfaj zzfaj, zzfaf zzfaf, zzfbd zzfbd) {
        this.zza = zzfaj;
        this.zzc = zzfaf;
        this.zzb = zzfbd;
        this.zzd = new ArrayDeque();
        zzfaf.zzb(new zzfba(this));
    }

    /* access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((Boolean) a0.c().zzb(zzbar.zzfR)).booleanValue()) {
            if (!t.q().zzh().zzh().zzh()) {
                this.zzd.clear();
                return;
            }
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzfbe zzfbe = (zzfbe) this.zzd.pollFirst();
                if (zzfbe == null || (zzfbe.zza() != null && this.zza.zze(zzfbe.zza()))) {
                    zzfbl zzfbl = new zzfbl(this.zza, this.zzb, zzfbe);
                    this.zze = zzfbl;
                    zzfbl.zzd(new zzfbb(this, zzfbe));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized zzfut zza(zzfbe zzfbe) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zza(zzfbe);
    }

    public final synchronized void zze(zzfbe zzfbe) {
        this.zzd.add(zzfbe);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
