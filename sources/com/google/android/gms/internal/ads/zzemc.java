package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.t;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzemc implements Callable {
    public final /* synthetic */ zzemd zza;

    public /* synthetic */ zzemc(zzemd zzemd) {
        this.zza = zzemd;
    }

    public final Object call() {
        String str;
        String str2;
        String str3;
        t.r();
        zzaue zzg = t.q().zzh().zzg();
        Bundle bundle = null;
        if (zzg != null && (!t.q().zzh().zzM() || !t.q().zzh().zzN())) {
            if (zzg.zzh()) {
                zzg.zzg();
            }
            zzatu zza2 = zzg.zza();
            if (zza2 != null) {
                str2 = zza2.zzd();
                str = zza2.zze();
                str3 = zza2.zzf();
                if (str2 != null) {
                    t.q().zzh().h(str2);
                }
                if (str3 != null) {
                    t.q().zzh().m(str3);
                }
            } else {
                str2 = t.q().zzh().zzj();
                str3 = t.q().zzh().zzk();
                str = null;
            }
            Bundle bundle2 = new Bundle(1);
            if (!t.q().zzh().zzN()) {
                if (str3 == null || TextUtils.isEmpty(str3)) {
                    bundle2.putString("v_fp_vertical", "no_hash");
                } else {
                    bundle2.putString("v_fp_vertical", str3);
                }
            }
            if (str2 != null && !t.q().zzh().zzM()) {
                bundle2.putString("fingerprint", str2);
                if (!str2.equals(str)) {
                    bundle2.putString("v_fp", str);
                }
            }
            if (!bundle2.isEmpty()) {
                bundle = bundle2;
            }
        }
        return new zzeme(bundle);
    }
}
