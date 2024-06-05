package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzalz extends zzgwj {
    private static final zzgwq zza = zzgwq.zzb(zzalz.class);

    public zzalz(zzgwk zzgwk, zzaly zzaly) throws IOException {
        zzf(zzgwk, zzgwk.zzc(), zzaly);
    }

    public final void close() throws IOException {
    }

    public final String toString() {
        String obj = this.zzd.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 7);
        sb2.append("model(");
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
