package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzgwg extends zzgwj implements zzamb {
    zzamc zza;
    protected final String zzb = "moov";

    public zzgwg(String str) {
    }

    public final String zza() {
        return this.zzb;
    }

    public final void zzb(zzgwk zzgwk, ByteBuffer byteBuffer, long j10, zzaly zzaly) throws IOException {
        zzgwk.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzd = zzgwk;
        this.zzf = zzgwk.zzb();
        zzgwk.zze(zzgwk.zzb() + j10);
        this.zzg = zzgwk.zzb();
        this.zzc = zzaly;
    }

    public final void zzc(zzamc zzamc) {
        this.zza = zzamc;
    }
}
