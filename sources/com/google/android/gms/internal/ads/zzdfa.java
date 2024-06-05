package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzdfa implements zzbhp {
    private final WeakReference zza;

    /* synthetic */ zzdfa(zzdff zzdff, zzdez zzdez) {
        this.zza = new WeakReference(zzdff);
    }

    public final void zza(Object obj, Map map) {
        zzdff zzdff = (zzdff) this.zza.get();
        if (zzdff != null && "_ac".equals((String) map.get("eventName"))) {
            zzdff.zzh.onAdClicked();
            if (((Boolean) a0.c().zzb(zzbar.zzjf)).booleanValue()) {
                zzdff.zzi.zzr();
                if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    zzdff.zzi.zzs();
                }
            }
        }
    }
}
