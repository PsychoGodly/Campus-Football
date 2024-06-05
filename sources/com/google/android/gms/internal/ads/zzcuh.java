package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.d5;
import com.google.android.gms.ads.internal.client.o2;
import com.google.android.gms.ads.internal.t;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcuh extends o2 {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzeay zzh;
    private final Bundle zzi;

    public zzcuh(zzeyc zzeyc, String str, zzeay zzeay, zzeyf zzeyf, String str2) {
        String str3;
        String str4;
        String str5 = null;
        if (zzeyc == null) {
            str3 = null;
        } else {
            str3 = zzeyc.zzac;
        }
        this.zzb = str3;
        this.zzc = str2;
        if (zzeyf == null) {
            str4 = null;
        } else {
            str4 = zzeyf.zzb;
        }
        this.zzd = str4;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str5 = zzeyc.zzw.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = str5 != null ? str5 : str;
        this.zze = zzeay.zzc();
        this.zzh = zzeay;
        this.zzf = t.b().a() / 1000;
        if (!((Boolean) a0.c().zzb(zzbar.zzgs)).booleanValue() || zzeyf == null) {
            this.zzi = new Bundle();
        } else {
            this.zzi = zzeyf.zzj;
        }
        this.zzg = (!((Boolean) a0.c().zzb(zzbar.zziw)).booleanValue() || zzeyf == null || TextUtils.isEmpty(zzeyf.zzh)) ? MaxReward.DEFAULT_LABEL : zzeyf.zzh;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final Bundle zze() {
        return this.zzi;
    }

    public final d5 zzf() {
        zzeay zzeay = this.zzh;
        if (zzeay != null) {
            return zzeay.zza();
        }
        return null;
    }

    public final String zzg() {
        return this.zza;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final String zzi() {
        return this.zzb;
    }

    public final List zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}
