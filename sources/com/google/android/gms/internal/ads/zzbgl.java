package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.t;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbgl implements zzbhp {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzcei = (zzcei) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                zzbza.zzj("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                zzbza.zzj("No timestamp given for CSI tick.");
            } else {
                try {
                    long b10 = t.b().b() + (Long.parseLong(str4) - t.b().a());
                    if (true == TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    zzcei.zzm().zzc(str2, str3, b10);
                } catch (NumberFormatException e10) {
                    zzbza.zzk("Malformed timestamp for CSI tick.", e10);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                zzbza.zzj("No value given for CSI experiment.");
            } else {
                zzcei.zzm().zza().zzd("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get(MediationMetaData.KEY_NAME);
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                zzbza.zzj("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                zzbza.zzj("No name given for CSI extra.");
            } else {
                zzcei.zzm().zza().zzd(str6, str7);
            }
        }
    }
}
