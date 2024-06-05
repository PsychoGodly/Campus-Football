package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzakz {
    public static final boolean zza = zzala.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    zzakz() {
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        if (!this.zzc) {
            zzb("Request on the loose");
            zzala.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    public final synchronized void zza(String str, long j10) {
        if (!this.zzc) {
            this.zzb.add(new zzaky(str, j10, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    public final synchronized void zzb(String str) {
        long j10;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j10 = 0;
        } else {
            long j11 = ((zzaky) this.zzb.get(0)).zzc;
            List list = this.zzb;
            j10 = ((zzaky) list.get(list.size() - 1)).zzc - j11;
        }
        if (j10 > 0) {
            long j12 = ((zzaky) this.zzb.get(0)).zzc;
            zzala.zza("(%-4d ms) %s", Long.valueOf(j10), str);
            for (zzaky zzaky : this.zzb) {
                long j13 = zzaky.zzc;
                zzala.zza("(+%-4d) [%2d] %s", Long.valueOf(j13 - j12), Long.valueOf(zzaky.zzb), zzaky.zza);
                j12 = j13;
            }
        }
    }
}
