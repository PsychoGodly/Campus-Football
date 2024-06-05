package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdyg implements zzfcd {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfec zzc;
    private final zzfen zzd;

    public zzdyg(String str, zzfen zzfen, zzfec zzfec) {
        this.zzb = str;
        this.zzd = zzfen;
        this.zzc = zzfec;
    }

    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzdtf zzdtf;
        String str;
        zzdyf zzdyf = (zzdyf) obj;
        int optInt = zzdyf.zza.optInt("http_timeout_millis", 60000);
        zzbtq zza2 = zzdyf.zzb;
        int zza3 = zza2.zza();
        String str2 = MaxReward.DEFAULT_LABEL;
        if (zza3 == -2) {
            HashMap hashMap = new HashMap();
            if (zzdyf.zzb.zzh() && !TextUtils.isEmpty(this.zzb)) {
                if (((Boolean) a0.c().zzb(zzbar.zzaI)).booleanValue()) {
                    String str3 = this.zzb;
                    if (TextUtils.isEmpty(str3)) {
                        str = str2;
                    } else {
                        Matcher matcher = zza.matcher(str3);
                        str = str2;
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null) {
                                Locale locale = Locale.ROOT;
                                if (group.toLowerCase(locale).startsWith("id=") || group.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(str)) {
                                        str = str.concat("; ");
                                    }
                                    str = str.concat(group);
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put("Cookie", str);
                    }
                } else {
                    hashMap.put("Cookie", this.zzb);
                }
            }
            if (zzdyf.zzb.zzi()) {
                zzdyh.zza(hashMap, zzdyf.zza);
            }
            if (zzdyf.zzb != null && !TextUtils.isEmpty(zzdyf.zzb.zzd())) {
                str2 = zzdyf.zzb.zzd();
            }
            zzfen zzfen = this.zzd;
            zzfec zzfec = this.zzc;
            zzfec.zzf(true);
            zzfen.zza(zzfec);
            return new zzdyb(zzdyf.zzb.zze(), optInt, hashMap, str2.getBytes(zzfnh.zzc), MaxReward.DEFAULT_LABEL, zzdyf.zzb.zzi());
        }
        if (zza2.zza() == 1) {
            if (zza2.zzf() != null) {
                str2 = TextUtils.join(", ", zza2.zzf());
                zzbza.zzg(str2);
            }
            zzdtf = new zzdtf(2, "Error building request URL: ".concat(String.valueOf(str2)));
        } else {
            zzdtf = new zzdtf(1);
        }
        zzfen zzfen2 = this.zzd;
        zzfec zzfec2 = this.zzc;
        zzfec2.zzg(zzdtf);
        zzfec2.zzf(false);
        zzfen2.zza(zzfec2);
        throw zzdtf;
    }
}
