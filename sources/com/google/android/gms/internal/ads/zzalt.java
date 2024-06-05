package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzalt extends zzako {
    private final Object zza = new Object();
    private final zzakt zzb;

    public zzalt(int i10, String str, zzakt zzakt, zzaks zzaks) {
        super(i10, str, zzaks);
        this.zzb = zzakt;
    }

    /* access modifiers changed from: protected */
    public final zzaku zzh(zzakk zzakk) {
        String str;
        try {
            byte[] bArr = zzakk.zzb;
            Map map = zzakk.zzc;
            String str2 = "ISO-8859-1";
            if (map != null) {
                String str3 = (String) map.get("Content-Type");
                if (str3 != null) {
                    String[] split = str3.split(";", 0);
                    int i10 = 1;
                    while (true) {
                        if (i10 >= split.length) {
                            break;
                        }
                        String[] split2 = split[i10].trim().split("=", 0);
                        if (split2.length == 2 && split2[0].equals("charset")) {
                            str2 = split2[1];
                            break;
                        }
                        i10++;
                    }
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzakk.zzb);
        }
        return zzaku.zzb(str, zzall.zzb(zzakk));
    }

    /* access modifiers changed from: protected */
    /* renamed from: zzz */
    public void zzo(String str) {
        zzakt zzakt;
        synchronized (this.zza) {
            zzakt = this.zzb;
        }
        zzakt.zza(str);
    }
}
