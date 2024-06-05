package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzbgr implements zzbhp {
    public static final /* synthetic */ zzbgr zza = new zzbgr();

    private /* synthetic */ zzbgr() {
    }

    public final void zza(Object obj, Map map) {
        zzcfq zzcfq = (zzcfq) obj;
        zzbhp zzbhp = zzbho.zza;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            zzapw zzI = zzcfq.zzI();
            if (zzI != null) {
                zzI.zzc().zzl(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            zzbza.zzj("Could not parse touch parameters from gmsg.");
        }
    }
}
