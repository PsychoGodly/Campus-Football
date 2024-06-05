package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.d2;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzyr implements zzadk<zzafd> {
    private final /* synthetic */ zzadl zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ Boolean zzd;
    private final /* synthetic */ d2 zze;
    private final /* synthetic */ zzacd zzf;
    private final /* synthetic */ zzafn zzg;

    zzyr(zzyj zzyj, zzadl zzadl, String str, String str2, Boolean bool, d2 d2Var, zzacd zzacd, zzafn zzafn) {
        this.zza = zzadl;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = d2Var;
        this.zzf = zzacd;
        this.zzg = zzafn;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zza(Object obj) {
        List<zzafc> zza2 = ((zzafd) obj).zza();
        if (zza2 == null || zza2.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        boolean z10 = false;
        zzafc zzafc = zza2.get(0);
        zzafv zzf2 = zzafc.zzf();
        List<zzafs> zza3 = zzf2 != null ? zzf2.zza() : null;
        if (zza3 != null && !zza3.isEmpty()) {
            if (!TextUtils.isEmpty(this.zzb)) {
                int i10 = 0;
                while (true) {
                    if (i10 >= zza3.size()) {
                        break;
                    } else if (zza3.get(i10).zzf().equals(this.zzb)) {
                        zza3.get(i10).zza(this.zzc);
                        break;
                    } else {
                        i10++;
                    }
                }
            } else {
                zza3.get(0).zza(this.zzc);
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            zzafc.zza(bool.booleanValue());
        } else {
            if (zzafc.zzb() - zzafc.zza() < 1000) {
                z10 = true;
            }
            zzafc.zza(z10);
        }
        zzafc.zza(this.zze);
        this.zzf.zza(this.zzg, zzafc);
    }
}
