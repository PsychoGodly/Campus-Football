package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.p1;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcmc implements zzcls {
    private final Context zza;
    private final p1 zzb = t.q().zzh();

    public zzcmc(Context context) {
        this.zza = context;
    }

    public final void zza(Map map) {
        if (!map.isEmpty()) {
            String str = (String) map.get("gad_idless");
            if (str != null) {
                boolean parseBoolean = Boolean.parseBoolean(str);
                map.remove("gad_idless");
                if (parseBoolean) {
                    try {
                        if (((Boolean) a0.c().zzb(zzbar.zzcy)).booleanValue()) {
                            zzfkv.zzj(this.zza).zzk();
                        }
                        if (((Boolean) a0.c().zzb(zzbar.zzcH)).booleanValue()) {
                            zzfkv.zzj(this.zza).zzl();
                        }
                        if (((Boolean) a0.c().zzb(zzbar.zzcz)).booleanValue()) {
                            zzfkw.zzi(this.zza).zzj();
                            if (((Boolean) a0.c().zzb(zzbar.zzcD)).booleanValue()) {
                                zzfkw.zzi(this.zza).zzk();
                            }
                            if (((Boolean) a0.c().zzb(zzbar.zzcE)).booleanValue()) {
                                zzfkw.zzi(this.zza).zzl();
                            }
                        }
                    } catch (IOException e10) {
                        t.q().zzu(e10, "SetAppMeasurementConsentConfig.run");
                    }
                }
                if (((Boolean) a0.c().zzb(zzbar.zzar)).booleanValue()) {
                    this.zzb.f(parseBoolean);
                    if (((Boolean) a0.c().zzb(zzbar.zzfL)).booleanValue() && parseBoolean) {
                        this.zza.deleteDatabase("OfflineUpload.db");
                    }
                }
            }
            Bundle bundle = new Bundle();
            for (Map.Entry entry : map.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            if (((Boolean) a0.c().zzb(zzbar.zzam)).booleanValue()) {
                t.p().zzr(bundle);
            }
        }
    }
}
