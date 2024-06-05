package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfj {
    private Uri zza;
    private Map zzb = Collections.emptyMap();
    private long zzc;
    private int zzd;

    public final zzfj zza(int i10) {
        this.zzd = 6;
        return this;
    }

    public final zzfj zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzfj zzc(long j10) {
        this.zzc = j10;
        return this;
    }

    public final zzfj zzd(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzfl zze() {
        if (this.zza != null) {
            return new zzfl(this.zza, 0, 1, (byte[]) null, this.zzb, this.zzc, -1, (String) null, this.zzd, (Object) null, (zzfk) null);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
