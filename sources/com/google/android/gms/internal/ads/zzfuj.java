package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfuj extends zzful {
    public static zzfui zza(Iterable iterable) {
        return new zzfui(false, zzfqk.zzl(iterable), (zzfuh) null);
    }

    public static zzfui zzb(Iterable iterable) {
        return new zzfui(true, zzfqk.zzl(iterable), (zzfuh) null);
    }

    @SafeVarargs
    public static zzfui zzc(zzfut... zzfutArr) {
        return new zzfui(true, zzfqk.zzn(zzfutArr), (zzfuh) null);
    }

    public static zzfut zzd(Iterable iterable) {
        return new zzftr(zzfqk.zzl(iterable), true);
    }

    public static zzfut zze(zzfut zzfut, Class cls, zzfnj zzfnj, Executor executor) {
        zzfsu zzfsu = new zzfsu(zzfut, cls, zzfnj);
        zzfut.zzc(zzfsu, zzfva.zzc(executor, zzfsu));
        return zzfsu;
    }

    public static zzfut zzf(zzfut zzfut, Class cls, zzftq zzftq, Executor executor) {
        zzfst zzfst = new zzfst(zzfut, cls, zzftq);
        zzfut.zzc(zzfst, zzfva.zzc(executor, zzfst));
        return zzfst;
    }

    public static zzfut zzg(Throwable th) {
        Objects.requireNonNull(th);
        return new zzfum(th);
    }

    public static zzfut zzh(Object obj) {
        if (obj == null) {
            return zzfun.zza;
        }
        return new zzfun(obj);
    }

    public static zzfut zzi() {
        return zzfun.zza;
    }

    public static zzfut zzj(Callable callable, Executor executor) {
        zzfvj zzfvj = new zzfvj(callable);
        executor.execute(zzfvj);
        return zzfvj;
    }

    public static zzfut zzk(zzftp zzftp, Executor executor) {
        zzfvj zzfvj = new zzfvj(zzftp);
        executor.execute(zzfvj);
        return zzfvj;
    }

    public static zzfut zzl(zzfut zzfut, zzfnj zzfnj, Executor executor) {
        int i10 = zzftf.zzc;
        Objects.requireNonNull(zzfnj);
        zzfte zzfte = new zzfte(zzfut, zzfnj);
        zzfut.zzc(zzfte, zzfva.zzc(executor, zzfte));
        return zzfte;
    }

    public static zzfut zzm(zzfut zzfut, zzftq zzftq, Executor executor) {
        int i10 = zzftf.zzc;
        Objects.requireNonNull(executor);
        zzftd zzftd = new zzftd(zzfut, zzftq);
        zzfut.zzc(zzftd, zzfva.zzc(executor, zzftd));
        return zzftd;
    }

    public static zzfut zzn(zzfut zzfut, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (zzfut.isDone()) {
            return zzfut;
        }
        return zzfvg.zzg(zzfut, j10, timeUnit, scheduledExecutorService);
    }

    public static Object zzo(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzfvl.zza(future);
        }
        throw new IllegalStateException(zzfoj.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzp(Future future) {
        try {
            return zzfvl.zza(future);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof Error) {
                throw new zzfty((Error) cause);
            }
            throw new zzfvk(cause);
        }
    }

    public static void zzq(zzfut zzfut, zzfuf zzfuf, Executor executor) {
        Objects.requireNonNull(zzfuf);
        zzfut.zzc(new zzfug(zzfut, zzfuf), executor);
    }
}
