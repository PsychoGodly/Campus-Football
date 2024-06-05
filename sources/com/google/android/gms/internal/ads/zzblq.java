package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.d0;
import com.google.android.gms.ads.internal.util.n1;
import com.google.android.gms.common.internal.q;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzblq extends zzbzz {
    private final Object zza = new Object();
    private final d0 zzb;
    private boolean zzc;
    private int zzd;

    public zzblq(d0 d0Var) {
        this.zzb = d0Var;
        this.zzc = false;
        this.zzd = 0;
    }

    public final zzbll zza() {
        zzbll zzbll = new zzbll(this);
        synchronized (this.zza) {
            zzi(new zzblm(this, zzbll), new zzbln(this, zzbll));
            q.n(this.zzd >= 0);
            this.zzd++;
        }
        return zzbll;
    }

    public final void zzb() {
        synchronized (this.zza) {
            q.n(this.zzd >= 0);
            n1.a("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            zzc();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzc() {
        synchronized (this.zza) {
            q.n(this.zzd >= 0);
            if (!this.zzc || this.zzd != 0) {
                n1.a("There are still references to the engine. Not destroying.");
            } else {
                n1.a("No reference is left (including root). Cleaning up engine.");
                zzi(new zzblp(this), new zzbzv());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzd() {
        synchronized (this.zza) {
            q.n(this.zzd > 0);
            n1.a("Releasing 1 reference for JS Engine");
            this.zzd--;
            zzc();
        }
    }
}
