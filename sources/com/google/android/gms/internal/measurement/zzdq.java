package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.0 */
final class zzdq extends zzdf.zza {
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ zzdf zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdq(zzdf zzdf, Bundle bundle) {
        super(zzdf);
        this.zzd = zzdf;
        this.zzc = bundle;
    }

    /* access modifiers changed from: package-private */
    public final void zza() throws RemoteException {
        ((zzcu) q.k(this.zzd.zzj)).setConsentThirdParty(this.zzc, this.zza);
    }
}
