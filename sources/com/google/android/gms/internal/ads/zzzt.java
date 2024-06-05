package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzzt implements zzabb {
    private final byte[] zza = new byte[4096];

    public final /* synthetic */ int zze(zzr zzr, int i10, boolean z10) {
        return zzaaz.zza(this, zzr, i10, z10);
    }

    public final int zzf(zzr zzr, int i10, boolean z10, int i11) throws IOException {
        int zza2 = zzr.zza(this.zza, 0, Math.min(4096, i10));
        if (zza2 != -1) {
            return zza2;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public final void zzk(zzaf zzaf) {
    }

    public final /* synthetic */ void zzq(zzen zzen, int i10) {
        zzaaz.zzb(this, zzen, i10);
    }

    public final void zzr(zzen zzen, int i10, int i11) {
        zzen.zzG(i10);
    }

    public final void zzs(long j10, int i10, int i11, int i12, zzaba zzaba) {
    }
}
