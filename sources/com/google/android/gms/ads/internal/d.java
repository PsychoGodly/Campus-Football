package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfec;
import com.google.android.gms.internal.ads.zzfep;
import com.google.android.gms.internal.ads.zzftq;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfut;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class d implements zzftq {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzfep f14661a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzfec f14662b;

    public /* synthetic */ d(zzfep zzfep, zzfec zzfec) {
        this.f14661a = zzfep;
        this.f14662b = zzfec;
    }

    public final zzfut zza(Object obj) {
        zzfep zzfep = this.f14661a;
        zzfec zzfec = this.f14662b;
        JSONObject jSONObject = (JSONObject) obj;
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            t.q().zzh().j(jSONObject.getString("appSettingsJson"));
        }
        zzfec.zzf(optBoolean);
        zzfep.zzb(zzfec.zzl());
        return zzfuj.zzh((Object) null);
    }
}
