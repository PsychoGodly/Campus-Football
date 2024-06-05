package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
abstract class zzfti extends zzfto {
    private static final Logger zza = Logger.getLogger(zzfti.class.getName());
    private zzfqf zzb;
    private final boolean zzc;
    private final boolean zze;

    zzfti(zzfqf zzfqf, boolean z10, boolean z11) {
        super(zzfqf.size());
        this.zzb = zzfqf;
        this.zzc = z10;
        this.zze = z11;
    }

    private final void zzH(int i10, Future future) {
        try {
            zzg(i10, zzfuj.zzo(future));
        } catch (ExecutionException e10) {
            zzJ(e10.getCause());
        } catch (Error | RuntimeException e11) {
            zzJ(e11);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzI */
    public final void zzy(zzfqf zzfqf) {
        int zzB = zzB();
        int i10 = 0;
        zzfnu.zzi(zzB >= 0, "Less than 0 remaining futures");
        if (zzB == 0) {
            if (zzfqf != null) {
                zzfsj zze2 = zzfqf.iterator();
                while (zze2.hasNext()) {
                    Future future = (Future) zze2.next();
                    if (!future.isCancelled()) {
                        zzH(i10, future);
                    }
                    i10++;
                }
            }
            zzG();
            zzv();
            zzz(2);
        }
    }

    private final void zzJ(Throwable th) {
        Objects.requireNonNull(th);
        if (this.zzc && !zze(th) && zzL(zzD(), th)) {
            zzK(th);
        } else if (th instanceof Error) {
            zzK(th);
        }
    }

    private static void zzK(Throwable th) {
        zza.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean zzL(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final String zza() {
        zzfqf zzfqf = this.zzb;
        if (zzfqf != null) {
            return "futures=".concat(zzfqf.toString());
        }
        return super.zza();
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzfqf zzfqf = this.zzb;
        boolean z10 = true;
        zzz(1);
        boolean isCancelled = isCancelled();
        if (zzfqf == null) {
            z10 = false;
        }
        if (z10 && isCancelled) {
            boolean zzu = zzu();
            zzfsj zze2 = zzfqf.iterator();
            while (zze2.hasNext()) {
                ((Future) zze2.next()).cancel(zzu);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzf(Set set) {
        Objects.requireNonNull(set);
        if (!isCancelled()) {
            Throwable zzm = zzm();
            zzm.getClass();
            zzL(set, zzm);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void zzg(int i10, Object obj);

    /* access modifiers changed from: package-private */
    public abstract void zzv();

    /* access modifiers changed from: package-private */
    public final void zzw() {
        zzfqf zzfqf = this.zzb;
        zzfqf.getClass();
        if (zzfqf.isEmpty()) {
            zzv();
        } else if (this.zzc) {
            zzfsj zze2 = this.zzb.iterator();
            int i10 = 0;
            while (zze2.hasNext()) {
                zzfut zzfut = (zzfut) zze2.next();
                zzfut.zzc(new zzftg(this, zzfut, i10), zzftx.INSTANCE);
                i10++;
            }
        } else {
            zzfth zzfth = new zzfth(this, this.zze ? this.zzb : null);
            zzfsj zze3 = this.zzb.iterator();
            while (zze3.hasNext()) {
                ((zzfut) zze3.next()).zzc(zzfth, zzftx.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzx(zzfut zzfut, int i10) {
        try {
            if (zzfut.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzH(i10, zzfut);
            }
        } finally {
            zzy((zzfqf) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void zzz(int i10) {
        this.zzb = null;
    }
}
