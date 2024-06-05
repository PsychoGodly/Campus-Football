package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzepk;
import java.util.Map;
import java.util.TreeMap;
import o5.c;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class r {

    /* renamed from: a  reason: collision with root package name */
    private final Context f14723a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14724b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f14725c = new TreeMap();

    /* renamed from: d  reason: collision with root package name */
    private String f14726d;

    /* renamed from: e  reason: collision with root package name */
    private String f14727e;

    /* renamed from: f  reason: collision with root package name */
    private final String f14728f;

    public r(Context context, String str) {
        String str2;
        this.f14723a = context.getApplicationContext();
        this.f14724b = str;
        String packageName = context.getPackageName();
        try {
            str2 = packageName + "-" + c.a(context).f(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            zzbza.zzh("Unable to get package version name for reporting", e10);
            str2 = String.valueOf(packageName).concat("-missing");
        }
        this.f14728f = str2;
    }

    public final String a() {
        return this.f14728f;
    }

    public final String b() {
        return this.f14727e;
    }

    public final String c() {
        return this.f14724b;
    }

    public final String d() {
        return this.f14726d;
    }

    public final Map e() {
        return this.f14725c;
    }

    public final void f(u4 u4Var, zzbzg zzbzg) {
        this.f14726d = u4Var.f14560k.f14487a;
        Bundle bundle = u4Var.f14563n;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) zzbby.zzc.zze();
            for (String str2 : bundle2.keySet()) {
                if (str.equals(str2)) {
                    this.f14727e = bundle2.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    this.f14725c.put(str2.substring(4), bundle2.getString(str2));
                }
            }
            this.f14725c.put("SDKVersion", zzbzg.zza);
            if (((Boolean) zzbby.zza.zze()).booleanValue()) {
                try {
                    Bundle zzc = zzepk.zzc(this.f14723a, new JSONArray((String) zzbby.zzb.zze()));
                    for (String str3 : zzc.keySet()) {
                        this.f14725c.put(str3, zzc.get(str3).toString());
                    }
                } catch (JSONException e10) {
                    zzbza.zzh("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e10);
                }
            }
        }
    }
}
