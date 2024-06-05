package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbbj {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbbj(boolean z10, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbbg zzf() {
        return new zzbbg(t.b().b(), (String) null, (zzbbg) null);
    }

    public final zzbbi zza() {
        zzbbi zzbbi;
        boolean booleanValue = ((Boolean) a0.c().zzb(zzbar.zzbG)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            for (zzbbg zzbbg : this.zza) {
                long zza2 = zzbbg.zza();
                String zzc2 = zzbbg.zzc();
                zzbbg zzb2 = zzbbg.zzb();
                if (zzb2 != null && zza2 > 0) {
                    sb2.append(zzc2);
                    sb2.append('.');
                    sb2.append(zza2 - zzb2.zza());
                    sb2.append(',');
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(zzb2.zza()))) {
                            hashMap.put(Long.valueOf(zzb2.zza()), new StringBuilder(zzc2));
                        } else {
                            StringBuilder sb3 = (StringBuilder) hashMap.get(Long.valueOf(zzb2.zza()));
                            sb3.append('+');
                            sb3.append(zzc2);
                        }
                    }
                }
            }
            this.zza.clear();
            String str = null;
            if (!TextUtils.isEmpty((CharSequence) null)) {
                sb2.append((String) null);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            StringBuilder sb4 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb4.append((CharSequence) entry.getValue());
                    sb4.append('.');
                    sb4.append(t.b().a() + (((Long) entry.getKey()).longValue() - t.b().b()));
                    sb4.append(',');
                }
                if (sb4.length() > 0) {
                    sb4.setLength(sb4.length() - 1);
                }
                str = sb4.toString();
            }
            zzbbi = new zzbbi(sb2.toString(), str);
        }
        return zzbbi;
    }

    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            t.q().zzf();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(zzbbj zzbbj) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbaz zzf;
        if (!TextUtils.isEmpty(str2) && (zzf = t.q().zzf()) != null) {
            synchronized (this.zzc) {
                zzbbf zza2 = zzf.zza(str);
                Map map = this.zzb;
                map.put(str, zza2.zza((String) map.get(str), str2));
            }
        }
    }

    public final boolean zze(zzbbg zzbbg, long j10, String... strArr) {
        synchronized (this.zzc) {
            for (int i10 = 0; i10 <= 0; i10++) {
                this.zza.add(new zzbbg(j10, strArr[i10], zzbbg));
            }
        }
        return true;
    }
}
