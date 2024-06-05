package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeb {
    private final zzdm zza;
    private final zzdv zzb;
    private final zzdz zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;
    private boolean zzh;
    private boolean zzi;

    public zzeb(Looper looper, zzdm zzdm, zzdz zzdz) {
        this(new CopyOnWriteArraySet(), looper, zzdm, zzdz);
    }

    public static /* synthetic */ boolean zzg(zzeb zzeb, Message message) {
        Iterator it = zzeb.zzd.iterator();
        while (it.hasNext()) {
            ((zzea) it.next()).zzb(zzeb.zzc);
            if (zzeb.zzb.zzg(0)) {
                return true;
            }
        }
        return true;
    }

    private final void zzh() {
        if (this.zzi) {
            zzdl.zzf(Thread.currentThread() == this.zzb.zza().getThread());
        }
    }

    public final zzeb zza(Looper looper, zzdz zzdz) {
        return new zzeb(this.zzd, looper, this.zza, zzdz);
    }

    public final void zzb(Object obj) {
        synchronized (this.zzg) {
            if (!this.zzh) {
                this.zzd.add(new zzea(obj));
            }
        }
    }

    public final void zzc() {
        zzh();
        if (!this.zzf.isEmpty()) {
            if (!this.zzb.zzg(0)) {
                zzdv zzdv = this.zzb;
                zzdv.zzk(zzdv.zzb(0));
            }
            boolean z10 = !this.zze.isEmpty();
            this.zze.addAll(this.zzf);
            this.zzf.clear();
            if (!z10) {
                while (!this.zze.isEmpty()) {
                    ((Runnable) this.zze.peekFirst()).run();
                    this.zze.removeFirst();
                }
            }
        }
    }

    public final void zzd(int i10, zzdy zzdy) {
        zzh();
        this.zzf.add(new zzdx(new CopyOnWriteArraySet(this.zzd), i10, zzdy));
    }

    public final void zze() {
        zzh();
        synchronized (this.zzg) {
            this.zzh = true;
        }
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzea) it.next()).zzc(this.zzc);
        }
        this.zzd.clear();
    }

    public final void zzf(Object obj) {
        zzh();
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            zzea zzea = (zzea) it.next();
            if (zzea.zza.equals(obj)) {
                zzea.zzc(this.zzc);
                this.zzd.remove(zzea);
            }
        }
    }

    private zzeb(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, zzdm zzdm, zzdz zzdz) {
        this.zza = zzdm;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzdz;
        this.zzg = new Object();
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = zzdm.zzb(looper, new zzdw(this));
        this.zzi = true;
    }
}
