package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.client.u4;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzedz implements zzeat {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    public final zzfut zza(zzeyo zzeyo, zzeyc zzeyc) {
        zzeyc zzeyc2 = zzeyc;
        String optString = zzeyc2.zzw.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, MaxReward.DEFAULT_LABEL);
        zzeyx zzeyx = zzeyo.zza.zza;
        zzeyv zzeyv = new zzeyv();
        zzeyv.zzp(zzeyx);
        zzeyv.zzs(optString);
        Bundle zzd = zzd(zzeyx.zzd.f14563n);
        Bundle zzd2 = zzd(zzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzd2.putInt("gw", 1);
        String optString2 = zzeyc2.zzw.optString("mad_hac", (String) null);
        if (optString2 != null) {
            zzd2.putString("mad_hac", optString2);
        }
        String optString3 = zzeyc2.zzw.optString("adJson", (String) null);
        if (optString3 != null) {
            zzd2.putString("_ad", optString3);
        }
        zzd2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzeyc2.zzE.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzeyc2.zzE.optString(next, (String) null);
            if (next != null) {
                zzd2.putString(next, optString4);
            }
        }
        zzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzd2);
        u4 u4Var = zzeyx.zzd;
        u4 u4Var2 = r5;
        u4 u4Var3 = new u4(u4Var.f14551a, u4Var.f14552b, zzd2, u4Var.f14554d, u4Var.f14555f, u4Var.f14556g, u4Var.f14557h, u4Var.f14558i, u4Var.f14559j, u4Var.f14560k, u4Var.f14561l, u4Var.f14562m, zzd, u4Var.f14564o, u4Var.f14565p, u4Var.f14566q, u4Var.f14567r, u4Var.f14568s, u4Var.f14569t, u4Var.f14570u, u4Var.f14571v, u4Var.f14572w, u4Var.f14573x, u4Var.f14574y);
        zzeyv.zzE(u4Var2);
        zzeyx zzG = zzeyv.zzG();
        Bundle bundle = new Bundle();
        zzeyo zzeyo2 = zzeyo;
        zzeyf zzeyf = zzeyo2.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList(zzeyf.zza));
        bundle2.putInt("refresh_interval", zzeyf.zzc);
        bundle2.putString("gws_query_id", zzeyf.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzeyo2.zza.zza.zzf;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        zzeyc zzeyc3 = zzeyc;
        bundle3.putString("allocation_id", zzeyc3.zzx);
        bundle3.putStringArrayList("click_urls", new ArrayList(zzeyc3.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList(zzeyc3.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList(zzeyc3.zzq));
        bundle3.putStringArrayList("fill_urls", new ArrayList(zzeyc3.zzn));
        bundle3.putStringArrayList("video_start_urls", new ArrayList(zzeyc3.zzh));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList(zzeyc3.zzi));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList(zzeyc3.zzj));
        bundle3.putString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, zzeyc3.zzk);
        bundle3.putString("valid_from_timestamp", zzeyc3.zzl);
        bundle3.putBoolean("is_closable_area_disabled", zzeyc3.zzQ);
        bundle3.putString("recursive_server_response_data", zzeyc3.zzap);
        if (zzeyc3.zzm != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzeyc3.zzm.zzb);
            bundle4.putString("rb_type", zzeyc3.zzm.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzG, bundle, zzeyc3, zzeyo2);
    }

    public final boolean zzb(zzeyo zzeyo, zzeyc zzeyc) {
        return !TextUtils.isEmpty(zzeyc.zzw.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, MaxReward.DEFAULT_LABEL));
    }

    /* access modifiers changed from: protected */
    public abstract zzfut zzc(zzeyx zzeyx, Bundle bundle, zzeyc zzeyc, zzeyo zzeyo);
}
