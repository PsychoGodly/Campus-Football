package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfkv extends zzfkt {
    private static zzfkv zzc;

    private zzfkv(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzfkv zzj(Context context) {
        zzfkv zzfkv;
        synchronized (zzfkv.class) {
            if (zzc == null) {
                zzc = new zzfkv(context);
            }
            zzfkv = zzc;
        }
        return zzfkv;
    }

    public final zzfks zzh(long j10, boolean z10) throws IOException {
        zzfks zzb;
        synchronized (zzfkv.class) {
            zzb = zzb((String) null, (String) null, j10, z10);
        }
        return zzb;
    }

    public final zzfks zzi(String str, String str2, long j10, boolean z10) throws IOException {
        zzfks zzb;
        synchronized (zzfkv.class) {
            zzb = zzb(str, str2, j10, z10);
        }
        return zzb;
    }

    public final void zzk() throws IOException {
        synchronized (zzfkv.class) {
            zzf(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzfkv.class) {
            zzf(true);
        }
    }
}
