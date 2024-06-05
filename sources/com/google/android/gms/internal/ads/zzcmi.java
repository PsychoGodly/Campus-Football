package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcmi implements zzcls {
    private final CookieManager zza;

    public zzcmi(Context context) {
        this.zza = t.s().b(context);
    }

    public final void zza(Map map) {
        if (this.zza != null) {
            if (((String) map.get("clear")) != null) {
                String str = (String) a0.c().zzb(zzbar.zzaH);
                String cookie = this.zza.getCookie(str);
                if (cookie != null) {
                    List zzf = zzfoh.zzc(zzfng.zzc(';')).zzf(cookie);
                    int i10 = 0;
                    while (i10 < zzf.size()) {
                        CookieManager cookieManager = this.zza;
                        Iterator it = zzfoh.zzc(zzfng.zzc('=')).zzd((String) zzf.get(i10)).iterator();
                        Objects.requireNonNull(it);
                        if (it.hasNext()) {
                            cookieManager.setCookie(str, String.valueOf((String) it.next()).concat(String.valueOf((String) a0.c().zzb(zzbar.zzau))));
                            i10++;
                        } else {
                            throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (" + 0 + ")");
                        }
                    }
                    return;
                }
                return;
            }
            String str2 = (String) map.get("cookie");
            if (!TextUtils.isEmpty(str2)) {
                this.zza.setCookie((String) a0.c().zzb(zzbar.zzaH), str2);
            }
        }
    }
}
