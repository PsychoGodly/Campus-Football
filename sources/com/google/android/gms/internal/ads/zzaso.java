package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzaso implements PackageManager.OnChecksumsReadyListener {
    public final /* synthetic */ zzfvc zza;

    public /* synthetic */ zzaso(zzfvc zzfvc) {
        this.zza = zzfvc;
    }

    public final void onChecksumsReady(List list) {
        zzfvc zzfvc = this.zza;
        if (list == null) {
            zzfvc.zzd((Object) null);
            return;
        }
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ApkChecksum apkChecksum = (ApkChecksum) list.get(i10);
                if (apkChecksum.getType() == 8) {
                    zzfvc.zzd(zzarb.zzc(apkChecksum.getValue()));
                    return;
                }
            }
            zzfvc.zzd((Object) null);
        } catch (Throwable unused) {
            zzfvc.zzd((Object) null);
        }
    }
}
