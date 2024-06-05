package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfhp {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    zzfhp(Context context, Executor executor, Task task, boolean z10) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z10;
    }

    public static zzfhp zza(Context context, Executor executor, boolean z10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z10) {
            executor.execute(new zzfhl(context, taskCompletionSource));
        } else {
            executor.execute(new zzfhm(taskCompletionSource));
        }
        return new zzfhp(context, executor, taskCompletionSource.getTask(), z10);
    }

    static void zzg(int i10) {
        zzf = i10;
    }

    private final Task zzh(int i10, long j10, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, zzfhn.zza);
        }
        zzamh zza2 = zzaml.zza();
        zza2.zza(this.zzb.getPackageName());
        zza2.zze(j10);
        zza2.zzg(zzf);
        if (exc != null) {
            zza2.zzf(zzfol.zza(exc));
            zza2.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zza2.zzb(str2);
        }
        if (str != null) {
            zza2.zzc(str);
        }
        return this.zzd.continueWith(this.zzc, new zzfho(zza2, i10));
    }

    public final Task zzb(int i10, String str) {
        return zzh(i10, 0, (Exception) null, (String) null, (Map) null, str);
    }

    public final Task zzc(int i10, long j10, Exception exc) {
        return zzh(i10, j10, exc, (String) null, (Map) null, (String) null);
    }

    public final Task zzd(int i10, long j10) {
        return zzh(i10, j10, (Exception) null, (String) null, (Map) null, (String) null);
    }

    public final Task zze(int i10, long j10, String str) {
        return zzh(i10, j10, (Exception) null, (String) null, (Map) null, str);
    }

    public final Task zzf(int i10, long j10, String str, Map map) {
        return zzh(i10, j10, (Exception) null, str, (Map) null, (String) null);
    }
}
