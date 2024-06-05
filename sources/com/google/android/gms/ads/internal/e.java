package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.n1;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzblv;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbmc;
import com.google.android.gms.internal.ads.zzbmf;
import com.google.android.gms.internal.ads.zzbyd;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzfeb;
import com.google.android.gms.internal.ads.zzfec;
import com.google.android.gms.internal.ads.zzfep;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfut;
import com.google.android.gms.internal.ads.zzfuu;
import com.unity3d.services.UnityAdsConstants;
import o5.c;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private Context f14663a;

    /* renamed from: b  reason: collision with root package name */
    private long f14664b = 0;

    public final void a(Context context, zzbzg zzbzg, String str, Runnable runnable, zzfep zzfep) {
        b(context, zzbzg, true, (zzbyd) null, str, (String) null, runnable, zzfep);
    }

    /* access modifiers changed from: package-private */
    public final void b(Context context, zzbzg zzbzg, boolean z10, zzbyd zzbyd, String str, String str2, Runnable runnable, zzfep zzfep) {
        PackageInfo f10;
        if (t.b().b() - this.f14664b < UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS) {
            zzbza.zzj("Not retrying to fetch app settings");
            return;
        }
        this.f14664b = t.b().b();
        if (zzbyd != null) {
            if (t.b().a() - zzbyd.zza() <= ((Long) a0.c().zzb(zzbar.zzdF)).longValue() && zzbyd.zzi()) {
                return;
            }
        }
        if (context == null) {
            zzbza.zzj("Context not provided to fetch application settings");
        } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.f14663a = applicationContext;
            zzfec zza = zzfeb.zza(context, 4);
            zza.zzh();
            zzbmf zza2 = t.h().zza(this.f14663a, zzbzg, zzfep);
            zzblz zzblz = zzbmc.zza;
            zzblv zza3 = zza2.zza("google.afma.config.fetchAppSettings", zzblz, zzblz);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z10);
                jSONObject.put("pn", context.getPackageName());
                jSONObject.put("experiment_ids", TextUtils.join(",", zzbar.zza()));
                try {
                    ApplicationInfo applicationInfo = this.f14663a.getApplicationInfo();
                    if (!(applicationInfo == null || (f10 = c.a(context).f(applicationInfo.packageName, 0)) == null)) {
                        jSONObject.put("version", f10.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    n1.a("Error fetching PackageInfo.");
                }
                zzfut zzb = zza3.zzb(jSONObject);
                d dVar = new d(zzfep, zza);
                zzfuu zzfuu = zzbzn.zzf;
                zzfut zzm = zzfuj.zzm(zzb, dVar, zzfuu);
                if (runnable != null) {
                    zzb.zzc(runnable, zzfuu);
                }
                zzbzq.zza(zzm, "ConfigLoader.maybeFetchNewAppSettings");
            } catch (Exception e10) {
                zzbza.zzh("Error requesting application settings", e10);
                zza.zzg(e10);
                zza.zzf(false);
                zzfep.zzb(zza.zzl());
            }
        } else {
            zzbza.zzj("App settings could not be fetched. Required parameters missing");
        }
    }

    public final void c(Context context, zzbzg zzbzg, String str, zzbyd zzbyd, zzfep zzfep) {
        b(context, zzbzg, false, zzbyd, zzbyd != null ? zzbyd.zzb() : null, str, (Runnable) null, zzfep);
    }
}
