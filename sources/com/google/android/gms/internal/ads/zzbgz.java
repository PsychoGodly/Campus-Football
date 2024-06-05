package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.n1;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbgz implements zzbhp {
    zzbgz() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzcei = (zzcei) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            n1.a("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzfly zzj = zzflz.zzj();
        zzj.zzb((String) map.get("appId"));
        zzj.zzh(zzcei.getWidth());
        zzj.zzg(zzcei.zzF().getWindowToken());
        if (!map.containsKey("gravityX") || !map.containsKey("gravityY")) {
            zzj.zzd(81);
        } else {
            zzj.zzd(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        }
        if (map.containsKey("verticalMargin")) {
            zzj.zze(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzj.zze(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzj.zza((String) map.get("enifd"));
        }
        try {
            t.l().j(zzcei, zzj.zzi());
        } catch (NullPointerException e10) {
            t.q().zzu(e10, "DefaultGmsgHandlers.ShowLMDOverlay");
            n1.a("Missing parameters for LMD Overlay show request");
        }
    }
}
