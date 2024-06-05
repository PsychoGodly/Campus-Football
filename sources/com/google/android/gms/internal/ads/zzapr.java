package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzapr {
    protected static volatile zzfjr zza = null;
    /* access modifiers changed from: private */
    public static final ConditionVariable zzc = new ConditionVariable();
    private static volatile Random zzd = null;
    protected volatile Boolean zzb;
    /* access modifiers changed from: private */
    public final zzaqx zze;

    public zzapr(zzaqx zzaqx) {
        this.zze = zzaqx;
        zzaqx.zzk().execute(new zzapq(this));
    }

    public static final int zzd() {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ThreadLocalRandom.current().nextInt();
            }
            return zze().nextInt();
        } catch (RuntimeException unused) {
            return zze().nextInt();
        }
    }

    private static Random zze() {
        if (zzd == null) {
            synchronized (zzapr.class) {
                if (zzd == null) {
                    zzd = new Random();
                }
            }
        }
        return zzd;
    }

    public final void zzc(int i10, int i11, long j10, String str, Exception exc) {
        try {
            zzc.block();
            if (this.zzb.booleanValue() && zza != null) {
                zzamh zza2 = zzaml.zza();
                zza2.zza(this.zze.zza.getPackageName());
                zza2.zze(j10);
                if (str != null) {
                    zza2.zzb(str);
                }
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    exc.printStackTrace(new PrintWriter(stringWriter));
                    zza2.zzf(stringWriter.toString());
                    zza2.zzd(exc.getClass().getName());
                }
                zzfjq zza3 = zza.zza(((zzaml) zza2.zzal()).zzax());
                zza3.zza(i10);
                if (i11 != -1) {
                    zza3.zzb(i11);
                }
                zza3.zzc();
            }
        } catch (Exception unused) {
        }
    }
}
