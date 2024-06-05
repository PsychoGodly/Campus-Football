package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.b;
import java.util.Map;
import m5.f;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbhv implements zzbhp {
    static final Map zza = f.e(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final b zzb;
    private final zzbpz zzc;
    private final zzbqg zzd;

    public zzbhv(b bVar, zzbpz zzbpz, zzbqg zzbqg) {
        this.zzb = bVar;
        this.zzc = zzbpz;
        this.zzd = zzbqg;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzcei = (zzcei) obj;
        int intValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i10 = 6;
        boolean z10 = true;
        if (intValue != 5) {
            if (intValue != 7) {
                if (!this.zzb.c()) {
                    this.zzb.b((String) null);
                    return;
                } else if (intValue == 1) {
                    this.zzc.zzb(map);
                    return;
                } else if (intValue == 3) {
                    new zzbqc(zzcei, map).zzb();
                    return;
                } else if (intValue == 4) {
                    new zzbpx(zzcei, map).zzc();
                    return;
                } else if (intValue != 5) {
                    if (intValue == 6) {
                        this.zzc.zza(true);
                        return;
                    } else if (intValue != 7) {
                        zzbza.zzi("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            z10 = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        }
        if (zzcei == null) {
            zzbza.zzj("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i10 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i10 = z10 ? -1 : 14;
        }
        zzcei.zzaq(i10);
    }
}
