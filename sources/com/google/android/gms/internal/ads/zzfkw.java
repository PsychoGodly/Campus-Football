package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfkw extends zzfkt {
    private static zzfkw zzc;

    private zzfkw(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzfkw zzi(Context context) {
        zzfkw zzfkw;
        synchronized (zzfkw.class) {
            if (zzc == null) {
                zzc = new zzfkw(context);
            }
            zzfkw = zzc;
        }
        return zzfkw;
    }

    public final zzfks zzh(long j10, boolean z10) throws IOException {
        synchronized (zzfkw.class) {
            if (!zzo()) {
                zzfks zzfks = new zzfks();
                return zzfks;
            }
            zzfks zzb = zzb((String) null, (String) null, j10, z10);
            return zzb;
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzfkw.class) {
            if (zzg(false)) {
                zzf(false);
            }
        }
    }

    public final void zzk() throws IOException {
        this.zzb.zze("paidv2_publisher_option");
    }

    public final void zzl() throws IOException {
        this.zzb.zze("paidv2_user_option");
    }

    public final void zzm(boolean z10) throws IOException {
        this.zzb.zzd("paidv2_user_option", Boolean.valueOf(z10));
    }

    public final void zzn(boolean z10) throws IOException {
        this.zzb.zzd("paidv2_publisher_option", Boolean.valueOf(z10));
        if (!z10) {
            zzj();
        }
    }

    public final boolean zzo() {
        return this.zzb.zzf("paidv2_publisher_option", true);
    }

    public final boolean zzp() {
        return this.zzb.zzf("paidv2_user_option", true);
    }
}
