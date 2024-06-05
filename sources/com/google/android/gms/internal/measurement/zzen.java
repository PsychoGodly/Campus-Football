package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.0 */
final class zzen extends zzdf.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Object zze;
    private final /* synthetic */ boolean zzf;
    private final /* synthetic */ zzdf zzg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzen(zzdf zzdf, String str, String str2, Object obj, boolean z10) {
        super(zzdf);
        this.zzg = zzdf;
        this.zzc = str;
        this.zzd = str2;
        this.zze = obj;
        this.zzf = z10;
    }

    /* access modifiers changed from: package-private */
    public final void zza() throws RemoteException {
        ((zzcu) q.k(this.zzg.zzj)).setUserProperty(this.zzc, this.zzd, b.B1(this.zze), this.zzf, this.zza);
    }
}
