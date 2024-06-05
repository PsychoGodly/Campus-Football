package y4;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbcd;
import com.google.android.gms.internal.ads.zzbxo;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzdpd;
import com.google.android.gms.internal.ads.zzdpn;
import com.google.android.gms.internal.ads.zzfec;
import com.google.android.gms.internal.ads.zzfen;
import com.google.android.gms.internal.ads.zzfuf;
import com.google.android.gms.internal.ads.zzfut;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class s0 implements zzfuf {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzfut f23991a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzbxv f23992b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzbxo f23993c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ zzfec f23994d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ long f23995e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ e f23996f;

    s0(e eVar, zzfut zzfut, zzbxv zzbxv, zzbxo zzbxo, zzfec zzfec, long j10) {
        this.f23996f = eVar;
        this.f23991a = zzfut;
        this.f23992b = zzbxv;
        this.f23993c = zzbxo;
        this.f23994d = zzfec;
        this.f23995e = j10;
    }

    public final void zza(Throwable th) {
        long a10 = t.b().a() - this.f23995e;
        String message = th.getMessage();
        t.q().zzu(th, "SignalGeneratorImpl.generateSignals");
        e eVar = this.f23996f;
        a0.c(eVar.f23923n, eVar.f23915f, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(a10)));
        zzfen f22 = e.f2(this.f23991a, this.f23992b);
        if (((Boolean) zzbcd.zze.zze()).booleanValue() && f22 != null) {
            zzfec zzfec = this.f23994d;
            zzfec.zzg(th);
            zzfec.zzf(false);
            f22.zza(zzfec);
            f22.zzg();
        }
        try {
            zzbxo zzbxo = this.f23993c;
            zzbxo.zzb("Internal error. " + message);
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        q qVar = (q) obj;
        zzfen f22 = e.f2(this.f23991a, this.f23992b);
        if (!((Boolean) a0.c().zzb(zzbar.zzhd)).booleanValue()) {
            try {
                this.f23993c.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e10) {
                zzbza.zzg("QueryInfo generation has been disabled.".concat(e10.toString()));
            }
            if (((Boolean) zzbcd.zze.zze()).booleanValue() && f22 != null) {
                zzfec zzfec = this.f23994d;
                zzfec.zzc("QueryInfo generation has been disabled.");
                zzfec.zzf(false);
                f22.zza(zzfec);
                f22.zzg();
                return;
            }
            return;
        }
        long a10 = t.b().a() - this.f23995e;
        if (qVar == null) {
            try {
                this.f23993c.zzc((String) null, (String) null, (Bundle) null);
                e eVar = this.f23996f;
                a0.c(eVar.f23923n, eVar.f23915f, "sgs", new Pair("rid", "-1"));
                this.f23994d.zzf(true);
                if (((Boolean) zzbcd.zze.zze()).booleanValue() && f22 != null) {
                    f22.zza(this.f23994d);
                    f22.zzg();
                }
            } catch (RemoteException e11) {
                zzfec zzfec2 = this.f23994d;
                zzfec2.zzg(e11);
                zzfec2.zzf(false);
                zzbza.zzh(MaxReward.DEFAULT_LABEL, e11);
                t.q().zzu(e11, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (((Boolean) zzbcd.zze.zze()).booleanValue() && f22 != null) {
                    f22.zza(this.f23994d);
                    f22.zzg();
                }
            } catch (Throwable th) {
                if (((Boolean) zzbcd.zze.zze()).booleanValue() && f22 != null) {
                    f22.zza(this.f23994d);
                    f22.zzg();
                }
                throw th;
            }
        } else {
            try {
                JSONObject jSONObject = new JSONObject(qVar.f23982b);
                String optString = jSONObject.optString("request_id", MaxReward.DEFAULT_LABEL);
                if (TextUtils.isEmpty(optString)) {
                    zzbza.zzj("The request ID is empty in request JSON.");
                    this.f23993c.zzb("Internal error: request ID is empty in request JSON.");
                    e eVar2 = this.f23996f;
                    a0.c(eVar2.f23923n, eVar2.f23915f, "sgf", new Pair("sgf_reason", "rid_missing"));
                    zzfec zzfec3 = this.f23994d;
                    zzfec3.zzc("Request ID empty");
                    zzfec3.zzf(false);
                    if (((Boolean) zzbcd.zze.zze()).booleanValue() && f22 != null) {
                        f22.zza(this.f23994d);
                        f22.zzg();
                        return;
                    }
                    return;
                }
                e eVar3 = this.f23996f;
                e.F1(eVar3, optString, qVar.f23982b, eVar3.f23915f);
                Bundle bundle = qVar.f23983c;
                e eVar4 = this.f23996f;
                if (eVar4.f23928s && bundle != null && bundle.getInt(eVar4.f23930u, -1) == -1) {
                    e eVar5 = this.f23996f;
                    bundle.putInt(eVar5.f23930u, eVar5.f23931v.get());
                }
                e eVar6 = this.f23996f;
                if (eVar6.f23927r && bundle != null && TextUtils.isEmpty(bundle.getString(eVar6.f23929t))) {
                    if (TextUtils.isEmpty(this.f23996f.f23933x)) {
                        e eVar7 = this.f23996f;
                        b2 r10 = t.r();
                        e eVar8 = this.f23996f;
                        eVar7.f23933x = r10.B(eVar8.f23912b, eVar8.f23932w.zza);
                    }
                    e eVar9 = this.f23996f;
                    bundle.putString(eVar9.f23929t, eVar9.f23933x);
                }
                this.f23993c.zzc(qVar.f23981a, qVar.f23982b, bundle);
                e eVar10 = this.f23996f;
                zzdpn d22 = eVar10.f23923n;
                zzdpd c22 = eVar10.f23915f;
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair("tqgt", String.valueOf(a10));
                String str = "na";
                if (((Boolean) a0.c().zzb(zzbar.zziK)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION : "0";
                    } catch (JSONException e12) {
                        zzbza.zzh("Error retrieving JSONObject from the requestJson, ", e12);
                    }
                }
                pairArr[1] = new Pair("tpc", str);
                a0.c(d22, c22, "sgs", pairArr);
                this.f23994d.zzf(true);
                if (((Boolean) zzbcd.zze.zze()).booleanValue() && f22 != null) {
                    f22.zza(this.f23994d);
                    f22.zzg();
                }
            } catch (JSONException e13) {
                zzbza.zzj("Failed to create JSON object from the request string.");
                zzbxo zzbxo = this.f23993c;
                String obj2 = e13.toString();
                zzbxo.zzb("Internal error for request JSON: " + obj2);
                e eVar11 = this.f23996f;
                a0.c(eVar11.f23923n, eVar11.f23915f, "sgf", new Pair("sgf_reason", "request_invalid"));
                zzfec zzfec4 = this.f23994d;
                zzfec4.zzg(e13);
                zzfec4.zzf(false);
                t.q().zzu(e13, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (((Boolean) zzbcd.zze.zze()).booleanValue() && f22 != null) {
                    f22.zza(this.f23994d);
                    f22.zzg();
                }
            }
        }
    }
}
