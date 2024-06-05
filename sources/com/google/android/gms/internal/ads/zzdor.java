package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.browser.customtabs.b;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.unity3d.services.UnityAdsConstants;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdor implements zzczg, a, zzcvi, zzcus {
    private final Context zza;
    private final zzezm zzb;
    private final zzdpi zzc;
    private final zzeyo zzd;
    private final zzeyc zze;
    private final zzeaf zzf;
    private Boolean zzg;
    private final boolean zzh = ((Boolean) a0.c().zzb(zzbar.zzgt)).booleanValue();

    public zzdor(Context context, zzezm zzezm, zzdpi zzdpi, zzeyo zzeyo, zzeyc zzeyc, zzeaf zzeaf) {
        this.zza = context;
        this.zzb = zzezm;
        this.zzc = zzdpi;
        this.zzd = zzeyo;
        this.zze = zzeyc;
        this.zzf = zzeaf;
    }

    private final zzdph zzf(String str) {
        zzdph zza2 = this.zzc.zza();
        zza2.zze(this.zzd.zzb.zzb);
        zza2.zzd(this.zze);
        zza2.zzb("action", str);
        boolean z10 = false;
        if (!this.zze.zzu.isEmpty()) {
            zza2.zzb("ancn", (String) this.zze.zzu.get(0));
        }
        if (this.zze.zzaj) {
            zza2.zzb("device_connectivity", true != t.q().zzx(this.zza) ? "offline" : b.ONLINE_EXTRAS_KEY);
            zza2.zzb("event_timestamp", String.valueOf(t.b().a()));
            zza2.zzb("offline_ad", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        }
        if (((Boolean) a0.c().zzb(zzbar.zzgC)).booleanValue()) {
            if (y4.a0.e(this.zzd.zza.zza) != 1) {
                z10 = true;
            }
            zza2.zzb("scar", String.valueOf(z10));
            if (z10) {
                u4 u4Var = this.zzd.zza.zza.zzd;
                zza2.zzc("ragent", u4Var.f14566q);
                zza2.zzc("rtype", y4.a0.a(y4.a0.b(u4Var)));
            }
        }
        return zza2;
    }

    private final void zzg(zzdph zzdph) {
        if (this.zze.zzaj) {
            this.zzf.zzd(new zzeah(t.b().a(), this.zzd.zzb.zzb.zzb, zzdph.zzf(), 2));
            return;
        }
        zzdph.zzg();
    }

    private final boolean zzh() {
        if (this.zzg == null) {
            synchronized (this) {
                if (this.zzg == null) {
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
                    this.zzg = Boolean.valueOf(z10);
                }
            }
        }
        return this.zzg.booleanValue();
    }

    public final void onAdClicked() {
        if (this.zze.zzaj) {
            zzg(zzf("click"));
        }
    }

    public final void zza(c3 c3Var) {
        c3 c3Var2;
        if (this.zzh) {
            zzdph zzf2 = zzf("ifts");
            zzf2.zzb("reason", "adapter");
            int i10 = c3Var.f14427a;
            String str = c3Var.f14428b;
            if (c3Var.f14429c.equals(MobileAds.ERROR_DOMAIN) && (c3Var2 = c3Var.f14430d) != null && !c3Var2.f14429c.equals(MobileAds.ERROR_DOMAIN)) {
                c3 c3Var3 = c3Var.f14430d;
                i10 = c3Var3.f14427a;
                str = c3Var3.f14428b;
            }
            if (i10 >= 0) {
                zzf2.zzb("arec", String.valueOf(i10));
            }
            String zza2 = this.zzb.zza(str);
            if (zza2 != null) {
                zzf2.zzb("areec", zza2);
            }
            zzf2.zzg();
        }
    }

    public final void zzb() {
        if (this.zzh) {
            zzdph zzf2 = zzf("ifts");
            zzf2.zzb("reason", "blocked");
            zzf2.zzg();
        }
    }

    public final void zzc(zzded zzded) {
        if (this.zzh) {
            zzdph zzf2 = zzf("ifts");
            zzf2.zzb("reason", "exception");
            if (!TextUtils.isEmpty(zzded.getMessage())) {
                zzf2.zzb("msg", zzded.getMessage());
            }
            zzf2.zzg();
        }
    }

    public final void zzd() {
        if (zzh()) {
            zzf("adapter_shown").zzg();
        }
    }

    public final void zze() {
        if (zzh()) {
            zzf("adapter_impression").zzg();
        }
    }

    public final void zzl() {
        if (zzh() || this.zze.zzaj) {
            zzg(zzf(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }
}
