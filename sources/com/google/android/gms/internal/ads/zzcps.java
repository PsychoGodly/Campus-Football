package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.dynamic.b;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcps extends zzcok {
    private final zzbfo zzc;
    private final Runnable zzd;
    private final Executor zze;

    public zzcps(zzcql zzcql, zzbfo zzbfo, Runnable runnable, Executor executor) {
        super(zzcql);
        this.zzc = zzbfo;
        this.zzd = runnable;
        this.zze = executor;
    }

    static /* synthetic */ void zzi(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet((Object) null);
        if (runnable != null) {
            runnable.run();
        }
    }

    public final int zza() {
        return 0;
    }

    public final View zzc() {
        return null;
    }

    public final s2 zzd() {
        return null;
    }

    public final zzeyd zze() {
        return null;
    }

    public final zzeyd zzf() {
        return null;
    }

    public final void zzg() {
    }

    public final void zzh(ViewGroup viewGroup, z4 z4Var) {
    }

    public final void zzj() {
        this.zze.execute(new zzcpr(this, new zzcpq(new AtomicReference(this.zzd))));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(Runnable runnable) {
        try {
            if (!this.zzc.zzb(b.B1(runnable))) {
                zzi(((zzcpq) runnable).zza);
            }
        } catch (RemoteException unused) {
            zzi(((zzcpq) runnable).zza);
        }
    }
}
