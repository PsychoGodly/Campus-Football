package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.common.internal.q;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeji implements zzepm {
    final zzeyx zza;
    private final long zzb;

    public zzeji(zzeyx zzeyx, long j10) {
        q.l(zzeyx, "the targeting must not be null");
        this.zza = zzeyx;
        this.zzb = j10;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        u4 u4Var = this.zza.zzd;
        bundle.putInt("http_timeout_millis", u4Var.f14573x);
        bundle.putString("slotname", this.zza.zzf);
        int i10 = this.zza.zzo.zza;
        int i11 = i10 - 1;
        if (i10 != 0) {
            boolean z10 = true;
            if (i11 == 1) {
                bundle.putBoolean("is_new_rewarded", true);
            } else if (i11 == 2) {
                bundle.putBoolean("is_rewarded_interstitial", true);
            }
            bundle.putLong("start_signals_timestamp", this.zzb);
            zzezi.zzf(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(u4Var.f14552b)), u4Var.f14552b != -1);
            zzezi.zzb(bundle, "extras", u4Var.f14553c);
            int i12 = u4Var.f14554d;
            zzezi.zze(bundle, "cust_gender", i12, i12 != -1);
            zzezi.zzd(bundle, "kw", u4Var.f14555f);
            int i13 = u4Var.f14557h;
            zzezi.zze(bundle, "tag_for_child_directed_treatment", i13, i13 != -1);
            if (u4Var.f14556g) {
                bundle.putBoolean("test_request", true);
            }
            zzezi.zze(bundle, "d_imp_hdr", 1, u4Var.f14551a >= 2 && u4Var.f14558i);
            String str = u4Var.f14559j;
            zzezi.zzf(bundle, "ppid", str, u4Var.f14551a >= 2 && !TextUtils.isEmpty(str));
            Location location = u4Var.f14561l;
            if (location != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putFloat("radius", location.getAccuracy() * 1000.0f);
                bundle2.putLong("lat", (long) (location.getLatitude() * 1.0E7d));
                bundle2.putLong("long", (long) (1.0E7d * location.getLongitude()));
                bundle2.putLong("time", location.getTime() * 1000);
                bundle.putBundle("uule", bundle2);
            }
            zzezi.zzc(bundle, "url", u4Var.f14562m);
            zzezi.zzd(bundle, "neighboring_content_urls", u4Var.f14572w);
            zzezi.zzb(bundle, "custom_targeting", u4Var.f14564o);
            zzezi.zzd(bundle, "category_exclusions", u4Var.f14565p);
            zzezi.zzc(bundle, "request_agent", u4Var.f14566q);
            zzezi.zzc(bundle, "request_pkg", u4Var.f14567r);
            zzezi.zzg(bundle, "is_designed_for_families", u4Var.f14568s, u4Var.f14551a >= 7);
            if (u4Var.f14551a >= 8) {
                int i14 = u4Var.f14570u;
                if (i14 == -1) {
                    z10 = false;
                }
                zzezi.zze(bundle, "tag_for_under_age_of_consent", i14, z10);
                zzezi.zzc(bundle, "max_ad_content_rating", u4Var.f14571v);
                return;
            }
            return;
        }
        throw null;
    }
}
