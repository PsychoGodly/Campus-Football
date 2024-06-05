package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbax {
    private final String zza = ((String) zzbce.zzb.zze());
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbax(Context context, String str) {
        String str2;
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        t.r();
        linkedHashMap.put("device", b2.O());
        if (context.getApplicationContext() != null) {
            str2 = context.getApplicationContext().getPackageName();
        } else {
            str2 = context.getPackageName();
        }
        linkedHashMap.put("app", str2);
        t.r();
        String str3 = "0";
        linkedHashMap.put("is_lite_sdk", true != b2.a(context) ? str3 : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        Future zzb2 = t.o().zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbts) zzb2.get()).zzk));
            linkedHashMap.put("network_fine", Integer.toString(((zzbts) zzb2.get()).zzl));
        } catch (Exception e10) {
            t.q().zzu(e10, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) a0.c().zzb(zzbar.zzjA)).booleanValue()) {
            Map map = this.zzb;
            t.r();
            map.put("is_bstar", true == b2.W(context) ? UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION : str3);
        }
    }

    /* access modifiers changed from: package-private */
    public final Context zza() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final String zzc() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final Map zzd() {
        return this.zzb;
    }
}
