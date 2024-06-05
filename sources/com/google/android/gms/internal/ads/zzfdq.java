package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfdq implements zzfdk {
    private final zzfdu zza;
    private final zzfds zzb;
    private final zzfdh zzc;

    public zzfdq(zzfdh zzfdh, zzfdu zzfdu, zzfds zzfds, byte[] bArr) {
        this.zzc = zzfdh;
        this.zza = zzfdu;
        this.zzb = zzfds;
    }

    public final String zza(zzfdj zzfdj) {
        zzfdu zzfdu = this.zza;
        Map zzj = zzfdj.zzj();
        this.zzb.zza(zzj);
        return zzfdu.zza(zzj);
    }

    public final void zzb(zzfdj zzfdj) {
        this.zzc.zzb(zza(zzfdj));
    }
}
