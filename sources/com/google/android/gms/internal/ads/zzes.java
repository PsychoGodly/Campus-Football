package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzes implements zzdv {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzes(Handler handler) {
        this.zzb = handler;
    }

    static /* bridge */ /* synthetic */ void zzl(zzer zzer) {
        List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzer);
            }
        }
    }

    private static zzer zzm() {
        zzer zzer;
        List list = zza;
        synchronized (list) {
            if (list.isEmpty()) {
                zzer = new zzer((zzeq) null);
            } else {
                zzer = (zzer) list.remove(list.size() - 1);
            }
        }
        return zzer;
    }

    public final Looper zza() {
        return this.zzb.getLooper();
    }

    public final zzdu zzb(int i10) {
        zzer zzm = zzm();
        zzm.zzb(this.zzb.obtainMessage(i10), this);
        return zzm;
    }

    public final zzdu zzc(int i10, Object obj) {
        zzer zzm = zzm();
        zzm.zzb(this.zzb.obtainMessage(i10, obj), this);
        return zzm;
    }

    public final zzdu zzd(int i10, int i11, int i12) {
        zzer zzm = zzm();
        zzm.zzb(this.zzb.obtainMessage(1, i11, i12), this);
        return zzm;
    }

    public final void zze(Object obj) {
        this.zzb.removeCallbacksAndMessages((Object) null);
    }

    public final void zzf(int i10) {
        this.zzb.removeMessages(2);
    }

    public final boolean zzg(int i10) {
        return this.zzb.hasMessages(0);
    }

    public final boolean zzh(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    public final boolean zzi(int i10) {
        return this.zzb.sendEmptyMessage(i10);
    }

    public final boolean zzj(int i10, long j10) {
        return this.zzb.sendEmptyMessageAtTime(2, j10);
    }

    public final boolean zzk(zzdu zzdu) {
        return ((zzer) zzdu).zzc(this.zzb);
    }
}
