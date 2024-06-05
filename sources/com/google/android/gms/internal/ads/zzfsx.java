package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzfsx<V> extends zzfvm implements zzfut<V> {
    private static final Logger zzaZ = Logger.getLogger(zzfsx.class.getName());
    /* access modifiers changed from: private */
    public static final zza zzba;
    private static final Object zzbd = new Object();
    static final boolean zzd;
    /* access modifiers changed from: private */
    public volatile zzd listeners;
    /* access modifiers changed from: private */
    public volatile Object value;
    /* access modifiers changed from: private */
    public volatile zzk waiters;

    /* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
    abstract class zza {
        /* synthetic */ zza(zzfsw zzfsw) {
        }

        /* access modifiers changed from: package-private */
        public abstract zzd zza(zzfsx zzfsx, zzd zzd);

        /* access modifiers changed from: package-private */
        public abstract zzk zzb(zzfsx zzfsx, zzk zzk);

        /* access modifiers changed from: package-private */
        public abstract void zzc(zzk zzk, zzk zzk2);

        /* access modifiers changed from: package-private */
        public abstract void zzd(zzk zzk, Thread thread);

        /* access modifiers changed from: package-private */
        public abstract boolean zze(zzfsx zzfsx, zzd zzd, zzd zzd2);

        /* access modifiers changed from: package-private */
        public abstract boolean zzf(zzfsx zzfsx, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean zzg(zzfsx zzfsx, zzk zzk, zzk zzk2);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
    final class zzb {
        static final zzb zza;
        static final zzb zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzfsx.zzd) {
                zzb = null;
                zza = null;
                return;
            }
            zzb = new zzb(false, (Throwable) null);
            zza = new zzb(true, (Throwable) null);
        }

        zzb(boolean z10, Throwable th) {
            this.zzc = z10;
            this.zzd = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") {
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        zzc(Throwable th) {
            Objects.requireNonNull(th);
            this.zzb = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
    final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        final AtomicReferenceFieldUpdater<zzfsx, zzk> zzc;
        final AtomicReferenceFieldUpdater<zzfsx, zzd> zzd;
        final AtomicReferenceFieldUpdater<zzfsx, Object> zze;

        zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super((zzfsw) null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public final zzd zza(zzfsx zzfsx, zzd zzd2) {
            return this.zzd.getAndSet(zzfsx, zzd2);
        }

        /* access modifiers changed from: package-private */
        public final zzk zzb(zzfsx zzfsx, zzk zzk) {
            return this.zzc.getAndSet(zzfsx, zzk);
        }

        /* access modifiers changed from: package-private */
        public final void zzc(zzk zzk, zzk zzk2) {
            this.zzb.lazySet(zzk, zzk2);
        }

        /* access modifiers changed from: package-private */
        public final void zzd(zzk zzk, Thread thread) {
            this.zza.lazySet(zzk, thread);
        }

        /* access modifiers changed from: package-private */
        public final boolean zze(zzfsx zzfsx, zzd zzd2, zzd zzd3) {
            return zzfsy.zza(this.zzd, zzfsx, zzd2, zzd3);
        }

        /* access modifiers changed from: package-private */
        public final boolean zzf(zzfsx zzfsx, Object obj, Object obj2) {
            return zzfsy.zza(this.zze, zzfsx, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public final boolean zzg(zzfsx zzfsx, zzk zzk, zzk zzk2) {
            return zzfsy.zza(this.zzc, zzfsx, zzk, zzk2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
    final class zzf<V> implements Runnable {
        final zzfsx<V> zza;
        final zzfut<? extends V> zzb;

        zzf(zzfsx zzfsx, zzfut zzfut) {
            this.zza = zzfsx;
            this.zzb = zzfut;
        }

        public final void run() {
            if (this.zza.value == this) {
                if (zzfsx.zzba.zzf(this.zza, this, zzfsx.zzf(this.zzb))) {
                    zzfsx.zzy(this.zza, false);
                }
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
    final class zzg extends zza {
        private zzg() {
            super((zzfsw) null);
        }

        /* synthetic */ zzg(zzfsz zzfsz) {
            super((zzfsw) null);
        }

        /* access modifiers changed from: package-private */
        public final zzd zza(zzfsx zzfsx, zzd zzd) {
            zzd zzi;
            synchronized (zzfsx) {
                zzi = zzfsx.listeners;
                if (zzi != zzd) {
                    zzfsx.listeners = zzd;
                }
            }
            return zzi;
        }

        /* access modifiers changed from: package-private */
        public final zzk zzb(zzfsx zzfsx, zzk zzk) {
            zzk zzj;
            synchronized (zzfsx) {
                zzj = zzfsx.waiters;
                if (zzj != zzk) {
                    zzfsx.waiters = zzk;
                }
            }
            return zzj;
        }

        /* access modifiers changed from: package-private */
        public final void zzc(zzk zzk, zzk zzk2) {
            zzk.next = zzk2;
        }

        /* access modifiers changed from: package-private */
        public final void zzd(zzk zzk, Thread thread) {
            zzk.thread = thread;
        }

        /* access modifiers changed from: package-private */
        public final boolean zze(zzfsx zzfsx, zzd zzd, zzd zzd2) {
            synchronized (zzfsx) {
                if (zzfsx.listeners != zzd) {
                    return false;
                }
                zzfsx.listeners = zzd2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean zzf(zzfsx zzfsx, Object obj, Object obj2) {
            synchronized (zzfsx) {
                if (zzfsx.value != obj) {
                    return false;
                }
                zzfsx.value = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean zzg(zzfsx zzfsx, zzk zzk, zzk zzk2) {
            synchronized (zzfsx) {
                if (zzfsx.waiters != zzk) {
                    return false;
                }
                zzfsx.waiters = zzk2;
                return true;
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
    interface zzh<V> extends zzfut<V> {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
    abstract class zzi<V> extends zzfsx<V> implements zzh<V> {
        zzi() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
    final class zzj extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x005c, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
            r1 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.ads.zzfsx.zzj.AnonymousClass1());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        static {
            /*
                java.lang.Class<com.google.android.gms.internal.ads.zzfsx$zzk> r0 = com.google.android.gms.internal.ads.zzfsx.zzk.class
                sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0007 }
                goto L_0x0012
            L_0x0007:
                com.google.android.gms.internal.ads.zzfsx$zzj$1 r1 = new com.google.android.gms.internal.ads.zzfsx$zzj$1     // Catch:{ PrivilegedActionException -> 0x005c }
                r1.<init>()     // Catch:{ PrivilegedActionException -> 0x005c }
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ PrivilegedActionException -> 0x005c }
                sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch:{ PrivilegedActionException -> 0x005c }
            L_0x0012:
                java.lang.Class<com.google.android.gms.internal.ads.zzfsx> r2 = com.google.android.gms.internal.ads.zzfsx.class
                java.lang.String r3 = "waiters"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                zzc = r3     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                java.lang.String r3 = "listeners"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                zzb = r3     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                java.lang.String r3 = "value"
                java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                zzd = r2     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                java.lang.String r2 = "thread"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                zze = r2     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                java.lang.String r2 = "next"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                long r2 = r1.objectFieldOffset(r0)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                zzf = r2     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                zza = r1     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                return
            L_0x0053:
                r0 = move-exception
                throw r0
            L_0x0055:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005c:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r0 = r0.getCause()
                java.lang.String r2 = "Could not initialize intrinsics"
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfsx.zzj.<clinit>():void");
        }

        private zzj() {
            super((zzfsw) null);
        }

        /* synthetic */ zzj(zzftb zzftb) {
            super((zzfsw) null);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        final com.google.android.gms.internal.ads.zzfsx.zzd zza(com.google.android.gms.internal.ads.zzfsx r3, com.google.android.gms.internal.ads.zzfsx.zzd r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.android.gms.internal.ads.zzfsx$zzd r0 = r3.listeners
                if (r4 != r0) goto L_0x0007
                return r0
            L_0x0007:
                boolean r1 = r2.zze(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfsx.zzj.zza(com.google.android.gms.internal.ads.zzfsx, com.google.android.gms.internal.ads.zzfsx$zzd):com.google.android.gms.internal.ads.zzfsx$zzd");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        final com.google.android.gms.internal.ads.zzfsx.zzk zzb(com.google.android.gms.internal.ads.zzfsx r3, com.google.android.gms.internal.ads.zzfsx.zzk r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.android.gms.internal.ads.zzfsx$zzk r0 = r3.waiters
                if (r4 != r0) goto L_0x0007
                return r0
            L_0x0007:
                boolean r1 = r2.zzg(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfsx.zzj.zzb(com.google.android.gms.internal.ads.zzfsx, com.google.android.gms.internal.ads.zzfsx$zzk):com.google.android.gms.internal.ads.zzfsx$zzk");
        }

        /* access modifiers changed from: package-private */
        public final void zzc(zzk zzk, zzk zzk2) {
            zza.putObject(zzk, zzf, zzk2);
        }

        /* access modifiers changed from: package-private */
        public final void zzd(zzk zzk, Thread thread) {
            zza.putObject(zzk, zze, thread);
        }

        /* access modifiers changed from: package-private */
        public final boolean zze(zzfsx zzfsx, zzd zzd2, zzd zzd3) {
            return zzfta.zza(zza, zzfsx, zzb, zzd2, zzd3);
        }

        /* access modifiers changed from: package-private */
        public final boolean zzf(zzfsx zzfsx, Object obj, Object obj2) {
            return zzfta.zza(zza, zzfsx, zzd, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public final boolean zzg(zzfsx zzfsx, zzk zzk, zzk zzk2) {
            return zzfta.zza(zza, zzfsx, zzc, zzk, zzk2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
    final class zzk {
        static final zzk zza = new zzk(false);
        volatile zzk next;
        volatile Thread thread;

        zzk() {
            zzfsx.zzba.zzd(this, Thread.currentThread());
        }

        zzk(boolean z10) {
        }
    }

    static {
        boolean z10;
        Throwable th;
        Throwable th2;
        zza zza2;
        Class<zzk> cls = zzk.class;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        zzd = z10;
        try {
            zza2 = new zzj((zzftb) null);
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e10) {
            try {
                th2 = e10;
                zza2 = new zze(AtomicReferenceFieldUpdater.newUpdater(cls, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(cls, cls, "next"), AtomicReferenceFieldUpdater.newUpdater(zzfsx.class, cls, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzfsx.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzfsx.class, Object.class, "value"));
                th = null;
            } catch (Error | RuntimeException e11) {
                th = e11;
                th2 = e10;
                zza2 = new zzg((zzfsz) null);
            }
        }
        zzba = zza2;
        if (th != null) {
            Logger logger = zzaZ;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    protected zzfsx() {
    }

    private final void zzA(zzk zzk2) {
        zzk2.thread = null;
        while (true) {
            zzk zzk3 = this.waiters;
            if (zzk3 != zzk.zza) {
                zzk zzk4 = null;
                while (zzk3 != null) {
                    zzk zzk5 = zzk3.next;
                    if (zzk3.thread != null) {
                        zzk4 = zzk3;
                    } else if (zzk4 != null) {
                        zzk4.next = zzk5;
                        if (zzk4.thread == null) {
                        }
                    } else if (!zzba.zzg(this, zzk3, zzk5)) {
                    }
                    zzk3 = zzk5;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzB(Object obj) throws ExecutionException {
        if (obj instanceof zzb) {
            Throwable th = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        } else if (obj == zzbd) {
            return null;
        } else {
            return obj;
        }
    }

    /* access modifiers changed from: private */
    public static Object zzf(zzfut zzfut) {
        Throwable zzm;
        if (zzfut instanceof zzh) {
            Object obj = ((zzfsx) zzfut).value;
            if (obj instanceof zzb) {
                zzb zzb2 = (zzb) obj;
                if (zzb2.zzc) {
                    Throwable th = zzb2.zzd;
                    obj = th != null ? new zzb(false, th) : zzb.zzb;
                }
            }
            obj.getClass();
            return obj;
        } else if ((zzfut instanceof zzfvm) && (zzm = ((zzfvm) zzfut).zzm()) != null) {
            return new zzc(zzm);
        } else {
            boolean isCancelled = zzfut.isCancelled();
            if ((!zzd) && isCancelled) {
                zzb zzb3 = zzb.zzb;
                zzb3.getClass();
                return zzb3;
            }
            try {
                Object zzg2 = zzg(zzfut);
                if (!isCancelled) {
                    return zzg2 == null ? zzbd : zzg2;
                }
                String valueOf = String.valueOf(zzfut);
                return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + valueOf));
            } catch (ExecutionException e10) {
                if (isCancelled) {
                    return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzfut)), e10));
                }
                return new zzc(e10.getCause());
            } catch (CancellationException e11) {
                if (!isCancelled) {
                    return new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzfut)), e11));
                }
                return new zzb(false, e11);
            } catch (Error | RuntimeException e12) {
                return new zzc(e12);
            }
        }
    }

    private static Object zzg(Future future) throws ExecutionException {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void zzv(StringBuilder sb2) {
        try {
            Object zzg2 = zzg(this);
            sb2.append("SUCCESS, result=[");
            if (zzg2 == null) {
                sb2.append("null");
            } else if (zzg2 == this) {
                sb2.append("this future");
            } else {
                sb2.append(zzg2.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(zzg2)));
            }
            sb2.append("]");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    private final void zzw(StringBuilder sb2) {
        String str;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb2.append(", setFuture=[");
            zzx(sb2, ((zzf) obj).zzb);
            sb2.append("]");
        } else {
            try {
                str = zzfoj.zza(zza());
            } catch (RuntimeException | StackOverflowError e10) {
                str = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
            }
            if (str != null) {
                sb2.append(", info=[");
                sb2.append(str);
                sb2.append("]");
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            zzv(sb2);
        }
    }

    private final void zzx(StringBuilder sb2, Object obj) {
        if (obj == this) {
            try {
                sb2.append("this future");
            } catch (RuntimeException | StackOverflowError e10) {
                sb2.append("Exception thrown from implementation: ");
                sb2.append(e10.getClass());
            }
        } else {
            sb2.append(obj);
        }
    }

    /* access modifiers changed from: private */
    public static void zzy(zzfsx<V> zzfsx, boolean z10) {
        zzd zzd2 = null;
        while (true) {
            for (zzk zzb2 = zzba.zzb(zzfsx, zzk.zza); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z10) {
                zzfsx.zzr();
            }
            zzfsx.zzb();
            zzd zzd3 = zzd2;
            zzd zza2 = zzba.zza(zzfsx, zzd.zza);
            zzd zzd4 = zzd3;
            while (zza2 != null) {
                zzd zzd5 = zza2.next;
                zza2.next = zzd4;
                zzd4 = zza2;
                zza2 = zzd5;
            }
            while (zzd4 != null) {
                zzd2 = zzd4.next;
                Runnable runnable = zzd4.zzb;
                runnable.getClass();
                if (runnable instanceof zzf) {
                    zzf zzf2 = (zzf) runnable;
                    zzfsx = zzf2.zza;
                    if (zzfsx.value == zzf2) {
                        if (zzba.zzf(zzfsx, zzf2, zzf(zzf2.zzb))) {
                            z10 = false;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzd4.zzc;
                    executor.getClass();
                    zzz(runnable, executor);
                }
                zzd4 = zzd2;
            }
            return;
        }
    }

    private static void zzz(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = zzaZ;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + valueOf + " with executor " + valueOf2, e10);
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, com.google.android.gms.internal.ads.zzfut<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzfsx.zzf
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x000a
            r4 = 1
            goto L_0x000b
        L_0x000a:
            r4 = 0
        L_0x000b:
            r1 = r1 | r4
            if (r1 == 0) goto L_0x005f
            boolean r1 = zzd
            if (r1 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.zzfsx$zzb r1 = new com.google.android.gms.internal.ads.zzfsx$zzb
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L_0x0029
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzfsx$zzb r1 = com.google.android.gms.internal.ads.zzfsx.zzb.zza
            goto L_0x0026
        L_0x0024:
            com.google.android.gms.internal.ads.zzfsx$zzb r1 = com.google.android.gms.internal.ads.zzfsx.zzb.zzb
        L_0x0026:
            r1.getClass()
        L_0x0029:
            r5 = 0
            r4 = r7
        L_0x002b:
            com.google.android.gms.internal.ads.zzfsx$zza r6 = zzba
            boolean r6 = r6.zzf(r4, r0, r1)
            if (r6 == 0) goto L_0x0058
            zzy(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfsx.zzf
            if (r4 == 0) goto L_0x0056
            com.google.android.gms.internal.ads.zzfsx$zzf r0 = (com.google.android.gms.internal.ads.zzfsx.zzf) r0
            com.google.android.gms.internal.ads.zzfut<? extends V> r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfsx.zzh
            if (r4 == 0) goto L_0x0053
            r4 = r0
            com.google.android.gms.internal.ads.zzfsx r4 = (com.google.android.gms.internal.ads.zzfsx) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L_0x004b
            r5 = 1
            goto L_0x004c
        L_0x004b:
            r5 = 0
        L_0x004c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzfsx.zzf
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0056
            r5 = 1
            goto L_0x002b
        L_0x0053:
            r0.cancel(r8)
        L_0x0056:
            r2 = 1
            goto L_0x005f
        L_0x0058:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzfsx.zzf
            if (r6 != 0) goto L_0x002b
            r2 = r5
        L_0x005f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfsx.cancel(boolean):boolean");
    }

    public Object get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                return zzB(obj2);
            }
            zzk zzk2 = this.waiters;
            if (zzk2 != zzk.zza) {
                zzk zzk3 = new zzk();
                do {
                    zza zza2 = zzba;
                    zza2.zzc(zzk3, zzk2);
                    if (zza2.zzg(this, zzk2, zzk3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                zzA(zzk3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof zzf))));
                        return zzB(obj);
                    }
                    zzk2 = this.waiters;
                } while (zzk2 != zzk.zza);
            }
            Object obj3 = this.value;
            obj3.getClass();
            return zzB(obj3);
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.value instanceof zzb;
    }

    public boolean isDone() {
        Object obj = this.value;
        boolean z10 = true;
        boolean z11 = !(obj instanceof zzf);
        if (obj == null) {
            z10 = false;
        }
        return z10 & z11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            zzv(sb2);
        } else {
            zzw(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public String zza() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        return "remaining delay=[" + delay + " ms]";
    }

    /* access modifiers changed from: protected */
    public void zzb() {
    }

    public void zzc(Runnable runnable, Executor executor) {
        zzd zzd2;
        zzfnu.zzc(runnable, "Runnable was null.");
        zzfnu.zzc(executor, "Executor was null.");
        if (isDone() || (zzd2 = this.listeners) == zzd.zza) {
            zzz(runnable, executor);
        }
        zzd zzd3 = new zzd(runnable, executor);
        do {
            zzd3.next = zzd2;
            if (!zzba.zze(this, zzd2, zzd3)) {
                zzd2 = this.listeners;
            } else {
                return;
            }
        } while (zzd2 != zzd.zza);
        zzz(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public boolean zzd(Object obj) {
        if (obj == null) {
            obj = zzbd;
        }
        if (!zzba.zzf(this, (Object) null, obj)) {
            return false;
        }
        zzy(this, false);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean zze(Throwable th) {
        Objects.requireNonNull(th);
        if (!zzba.zzf(this, (Object) null, new zzc(th))) {
            return false;
        }
        zzy(this, false);
        return true;
    }

    /* access modifiers changed from: protected */
    public final Throwable zzm() {
        if (!(this instanceof zzh)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void zzr() {
    }

    /* access modifiers changed from: package-private */
    public final void zzs(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzu());
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzt(zzfut zzfut) {
        zzc zzc2;
        Objects.requireNonNull(zzfut);
        Object obj = this.value;
        if (obj == null) {
            if (zzfut.isDone()) {
                if (!zzba.zzf(this, (Object) null, zzf(zzfut))) {
                    return false;
                }
                zzy(this, false);
                return true;
            }
            zzf zzf2 = new zzf(this, zzfut);
            if (zzba.zzf(this, (Object) null, zzf2)) {
                try {
                    zzfut.zzc(zzf2, zzftx.INSTANCE);
                } catch (Error | RuntimeException e10) {
                    try {
                        zzc2 = new zzc(e10);
                    } catch (Error | RuntimeException unused) {
                        zzc2 = zzc.zza;
                    }
                    zzba.zzf(this, zzf2, zzc2);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzb) {
            zzfut.cancel(((zzb) obj).zzc);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean zzu() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }

    public Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j11 = j10;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z10 = true;
            if ((obj != null) && (!(obj instanceof zzf))) {
                return zzB(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                zzk zzk2 = this.waiters;
                if (zzk2 != zzk.zza) {
                    zzk zzk3 = new zzk();
                    do {
                        zza zza2 = zzba;
                        zza2.zzc(zzk3, zzk2);
                        if (zza2.zzg(this, zzk2, zzk3)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                                        return zzB(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    zzA(zzk3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zzA(zzk3);
                        } else {
                            zzk2 = this.waiters;
                        }
                    } while (zzk2 != zzk.zza);
                }
                Object obj3 = this.value;
                obj3.getClass();
                return zzB(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.value;
                if ((obj4 != null) && (!(obj4 instanceof zzf))) {
                    return zzB(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String zzfsx = toString();
            String timeUnit3 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit3.toLowerCase(locale);
            String str = "Waited " + j11 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j12 = -nanos;
                long convert = timeUnit2.convert(j12, TimeUnit.NANOSECONDS);
                long nanos2 = j12 - timeUnit2.toNanos(convert);
                int i10 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                if (i10 != 0 && nanos2 <= 1000) {
                    z10 = false;
                }
                if (i10 > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z10) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z10) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + zzfsx);
        }
        throw new InterruptedException();
    }
}
