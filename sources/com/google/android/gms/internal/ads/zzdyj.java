package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.browser.customtabs.b;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.unity3d.services.UnityAdsConstants;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdyj implements zzczg, a, zzcvi, zzcus {
    private final Context zza;
    private final zzezm zzb;
    private final zzeyo zzc;
    private final zzeyc zzd;
    private final zzeaf zze;
    private Boolean zzf;
    private final boolean zzg = ((Boolean) a0.c().zzb(zzbar.zzgt)).booleanValue();
    private final zzfdk zzh;
    private final String zzi;

    public zzdyj(Context context, zzezm zzezm, zzeyo zzeyo, zzeyc zzeyc, zzeaf zzeaf, zzfdk zzfdk, String str) {
        this.zza = context;
        this.zzb = zzezm;
        this.zzc = zzeyo;
        this.zzd = zzeyc;
        this.zze = zzeaf;
        this.zzh = zzfdk;
        this.zzi = str;
    }

    private final zzfdj zzf(String str) {
        zzfdj zzb2 = zzfdj.zzb(str);
        zzb2.zzh(this.zzc, (zzbyn) null);
        zzb2.zzf(this.zzd);
        zzb2.zza("request_id", this.zzi);
        if (!this.zzd.zzu.isEmpty()) {
            zzb2.zza("ancn", (String) this.zzd.zzu.get(0));
        }
        if (this.zzd.zzaj) {
            zzb2.zza("device_connectivity", true != t.q().zzx(this.zza) ? "offline" : b.ONLINE_EXTRAS_KEY);
            zzb2.zza("event_timestamp", String.valueOf(t.b().a()));
            zzb2.zza("offline_ad", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        }
        return zzb2;
    }

    private final void zzg(zzfdj zzfdj) {
        if (this.zzd.zzaj) {
            this.zze.zzd(new zzeah(t.b().a(), this.zzc.zzb.zzb.zzb, this.zzh.zza(zzfdj), 2));
            return;
        }
        this.zzh.zzb(zzfdj);
    }

    private final boolean zzh() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
                    String str = (String) a0.c().zzb(zzbar.zzbm);
                    t.r();
                    String M = b2.M(this.zza);
                    boolean z10 = false;
                    if (!(str == null || M == null)) {
                        try {
                            z10 = Pattern.matches(str, M);
                        } catch (RuntimeException e10) {
                            t.q().zzu(e10, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzf = Boolean.valueOf(z10);
                }
            }
        }
        return this.zzf.booleanValue();
    }

    public final void onAdClicked() {
        if (this.zzd.zzaj) {
            zzg(zzf("click"));
        }
    }

    public final void zza(c3 c3Var) {
        c3 c3Var2;
        if (this.zzg) {
            int i10 = c3Var.f14427a;
            String str = c3Var.f14428b;
            if (c3Var.f14429c.equals(MobileAds.ERROR_DOMAIN) && (c3Var2 = c3Var.f14430d) != null && !c3Var2.f14429c.equals(MobileAds.ERROR_DOMAIN)) {
                c3 c3Var3 = c3Var.f14430d;
                i10 = c3Var3.f14427a;
                str = c3Var3.f14428b;
            }
            String zza2 = this.zzb.zza(str);
            zzfdj zzf2 = zzf("ifts");
            zzf2.zza("reason", "adapter");
            if (i10 >= 0) {
                zzf2.zza("arec", String.valueOf(i10));
            }
            if (zza2 != null) {
                zzf2.zza("areec", zza2);
            }
            this.zzh.zzb(zzf2);
        }
    }

    public final void zzb() {
        if (this.zzg) {
            zzfdk zzfdk = this.zzh;
            zzfdj zzf2 = zzf("ifts");
            zzf2.zza("reason", "blocked");
            zzfdk.zzb(zzf2);
        }
    }

    public final void zzc(zzded zzded) {
        if (this.zzg) {
            zzfdj zzf2 = zzf("ifts");
            zzf2.zza("reason", "exception");
            if (!TextUtils.isEmpty(zzded.getMessage())) {
                zzf2.zza("msg", zzded.getMessage());
            }
            this.zzh.zzb(zzf2);
        }
    }

    public final void zzd() {
        if (zzh()) {
            this.zzh.zzb(zzf("adapter_shown"));
        }
    }

    public final void zze() {
        if (zzh()) {
            this.zzh.zzb(zzf("adapter_impression"));
        }
    }

    public final void zzl() {
        if (zzh() || this.zzd.zzaj) {
            zzg(zzf(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }
}
