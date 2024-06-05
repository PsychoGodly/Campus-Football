package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfsx;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
abstract class zzfto extends zzfsx.zzi {
    private static final zzftk zzbb;
    private static final Logger zzbc = Logger.getLogger(zzfto.class.getName());
    /* access modifiers changed from: private */
    public volatile int remaining;
    /* access modifiers changed from: private */
    public volatile Set<Throwable> seenExceptions = null;

    static {
        Throwable th;
        zzftk zzftk;
        try {
            zzftk = new zzftl(AtomicReferenceFieldUpdater.newUpdater(zzfto.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzfto.class, "remaining"));
            th = null;
        } catch (Error | RuntimeException e10) {
            th = e10;
            zzftk = new zzftn((zzftm) null);
        }
        zzbb = zzftk;
        if (th != null) {
            zzbc.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzfto(int i10) {
        this.remaining = i10;
    }

    /* access modifiers changed from: package-private */
    public final int zzB() {
        return zzbb.zza(this);
    }

    /* access modifiers changed from: package-private */
    public final Set zzD() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(newSetFromMap);
        zzbb.zzb(this, (Set) null, newSetFromMap);
        Set<Throwable> set2 = this.seenExceptions;
        set2.getClass();
        return set2;
    }

    /* access modifiers changed from: package-private */
    public final void zzG() {
        this.seenExceptions = null;
    }

    /* access modifiers changed from: package-private */
    public abstract void zzf(Set set);
}
