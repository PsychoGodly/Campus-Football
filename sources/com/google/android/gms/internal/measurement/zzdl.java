package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.0 */
final class zzdl extends zzdf.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ zzdf zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdl(zzdf zzdf, Activity activity, String str, String str2) {
        super(zzdf);
        this.zzf = zzdf;
        this.zzc = activity;
        this.zzd = str;
        this.zze = str2;
    }

    /* access modifiers changed from: package-private */
    public final void zza() throws RemoteException {
        ((zzcu) q.k(this.zzf.zzj)).setCurrentScreen(b.B1(this.zzc), this.zzd, this.zze, this.zza);
    }
}
