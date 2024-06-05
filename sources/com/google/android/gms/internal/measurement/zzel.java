package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.0 */
final class zzel extends zzdf.zza {
    private final /* synthetic */ Long zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ boolean zzg;
    private final /* synthetic */ boolean zzh;
    private final /* synthetic */ zzdf zzi;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzel(zzdf zzdf, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(zzdf);
        this.zzi = zzdf;
        this.zzc = l10;
        this.zzd = str;
        this.zze = str2;
        this.zzf = bundle;
        this.zzg = z10;
        this.zzh = z11;
    }

    /* access modifiers changed from: package-private */
    public final void zza() throws RemoteException {
        Long l10 = this.zzc;
        ((zzcu) q.k(this.zzi.zzj)).logEvent(this.zzd, this.zze, this.zzf, this.zzg, this.zzh, l10 == null ? this.zza : l10.longValue());
    }
}
