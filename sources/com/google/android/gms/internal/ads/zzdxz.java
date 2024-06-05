package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdxz extends zzbtc {
    private final Context zza;
    private final zzeqv zzb;
    private final zzeqt zzc;
    private final zzdyh zzd;
    private final zzfuu zze;
    private final zzdye zzf;
    private final zzbtz zzg;

    zzdxz(Context context, zzeqv zzeqv, zzeqt zzeqt, zzdye zzdye, zzdyh zzdyh, zzfuu zzfuu, zzbtz zzbtz, byte[] bArr) {
        this.zza = context;
        this.zzb = zzeqv;
        this.zzc = zzeqt;
        this.zzf = zzdye;
        this.zzd = zzdyh;
        this.zze = zzfuu;
        this.zzg = zzbtz;
    }

    private final void zzc(zzfut zzfut, zzbtg zzbtg) {
        zzfuj.zzq(zzfuj.zzm(zzfua.zzv(zzfut), new zzdxr(this), zzbzn.zza), new zzdxy(this, zzbtg), zzbzn.zzf);
    }

    public final zzfut zzb(zzbsv zzbsv, int i10) {
        zzfut zzfut;
        String str = zzbsv.zza;
        int i11 = zzbsv.zzb;
        Bundle bundle = zzbsv.zzc;
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                String string = bundle.getString(str2);
                if (string != null) {
                    hashMap.put(str2, string);
                }
            }
        }
        zzdyb zzdyb = new zzdyb(str, i11, hashMap, zzbsv.zzd, MaxReward.DEFAULT_LABEL, zzbsv.zze);
        zzeqt zzeqt = this.zzc;
        zzeqt.zza(new zzesa(zzbsv));
        zzequ zzb2 = zzeqt.zzb();
        if (zzdyb.zzf) {
            String str3 = zzbsv.zza;
            String str4 = (String) zzbcr.zzc.zze();
            if (!TextUtils.isEmpty(str4)) {
                String host = Uri.parse(str3).getHost();
                if (!TextUtils.isEmpty(host)) {
                    Iterator it = zzfoh.zzc(zzfng.zzc(';')).zzd(str4).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (host.endsWith((String) it.next())) {
                                zzfut = zzfuj.zzl(zzb2.zza().zza(new JSONObject()), new zzdxx(zzdyb), this.zze);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        zzfut = zzfuj.zzh(zzdyb);
        zzfda zzb3 = zzb2.zzb();
        return zzfuj.zzm(zzb3.zzb(zzfcu.HTTP, zzfut).zze(new zzdyd(this.zza, MaxReward.DEFAULT_LABEL, this.zzg, i10, (byte[]) null)).zza(), zzdxt.zza, this.zze);
    }

    public final void zze(zzbsv zzbsv, zzbtg zzbtg) {
        zzc(zzb(zzbsv, Binder.getCallingUid()), zzbtg);
    }

    public final void zzf(zzbsr zzbsr, zzbtg zzbtg) {
        int callingUid = Binder.getCallingUid();
        zzeqv zzeqv = this.zzb;
        zzeqv.zza(new zzeqk(zzbsr, callingUid));
        zzeqw zzb2 = zzeqv.zzb();
        zzfda zzb3 = zzb2.zzb();
        zzfcf zza2 = zzb3.zzb(zzfcu.GMS_SIGNALS, zzfuj.zzi()).zzf(new zzdxw(zzb2)).zze(zzdxv.zza).zzf(zzdxu.zza).zza();
        zzc(zza2, zzbtg);
        if (((Boolean) zzbck.zzd.zze()).booleanValue()) {
            zzdyh zzdyh = this.zzd;
            zzdyh.getClass();
            zza2.zzc(new zzdxs(zzdyh), this.zze);
        }
    }
}
