package com.google.android.gms.internal.measurement;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class zzw extends zzal {
    private zzaa zzk;

    public zzw(zzaa zzaa) {
        super("internal.registerCallback");
        this.zzk = zzaa;
    }

    public final zzaq zza(zzh zzh, List<zzaq> list) {
        zzg.zza(this.zza, 3, list);
        String zzf = zzh.zza(list.get(0)).zzf();
        zzaq zza = zzh.zza(list.get(1));
        if (zza instanceof zzar) {
            zzaq zza2 = zzh.zza(list.get(2));
            if (zza2 instanceof zzap) {
                zzap zzap = (zzap) zza2;
                if (zzap.zzc("type")) {
                    String zzf2 = zzap.zza("type").zzf();
                    int i10 = 1000;
                    if (zzap.zzc(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY)) {
                        i10 = zzg.zzb(zzap.zza(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY).zze().doubleValue());
                    }
                    this.zzk.zza(zzf, i10, (zzar) zza, zzf2);
                    return zzaq.zzc;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
