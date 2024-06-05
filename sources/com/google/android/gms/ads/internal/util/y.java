package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.internal.ads.zzakk;
import com.google.android.gms.internal.ads.zzako;
import com.google.android.gms.internal.ads.zzakr;
import com.google.android.gms.internal.ads.zzakx;
import com.google.android.gms.internal.ads.zzalc;
import com.google.android.gms.internal.ads.zzald;
import com.google.android.gms.internal.ads.zzalk;
import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzalp;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbjk;
import com.google.android.gms.internal.ads.zzbyt;
import java.io.File;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class y extends zzald {

    /* renamed from: a  reason: collision with root package name */
    private final Context f14929a;

    private y(Context context, zzalc zzalc) {
        super(zzalc);
        this.f14929a = context;
    }

    public static zzakr a(Context context) {
        zzakr zzakr = new zzakr(new zzalk(new File(context.getCacheDir(), "admob_volley"), 20971520), new y(context, new zzalp((zzalo) null, (SSLSocketFactory) null)), 4);
        zzakr.zzd();
        return zzakr;
    }

    public final zzakk zza(zzako zzako) throws zzakx {
        if (zzako.zza() == 0) {
            if (Pattern.matches((String) a0.c().zzb(zzbar.zzdZ), zzako.zzk())) {
                x.b();
                if (zzbyt.zzt(this.f14929a, 13400000)) {
                    zzakk zza = new zzbjk(this.f14929a).zza(zzako);
                    if (zza != null) {
                        n1.a("Got gmscore asset response: ".concat(String.valueOf(zzako.zzk())));
                        return zza;
                    }
                    n1.a("Failed to get gmscore asset response: ".concat(String.valueOf(zzako.zzk())));
                }
            }
        }
        return super.zza(zzako);
    }
}
