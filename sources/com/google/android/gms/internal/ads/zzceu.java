package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.l;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzceu {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.google.android.gms.internal.ads.zzcei] */
    public static final zzcei zza(Context context, zzcfx zzcfx, String str, boolean z10, boolean z11, zzapw zzapw, zzbbt zzbbt, zzbzg zzbzg, zzbbj zzbbj, l lVar, a aVar, zzawe zzawe, zzeyc zzeyc, zzeyf zzeyf) throws zzcet {
        StrictMode.ThreadPolicy threadPolicy;
        zzbar.zzc(context);
        try {
            zzceq zzceq = new zzceq(context, zzcfx, str, z10, z11, zzapw, zzbbt, zzbzg, (zzbbj) null, lVar, aVar, zzawe, zzeyc, zzeyf);
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            ? zza = zzceq.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return zza;
        } catch (Throwable th) {
            throw new zzcet("Webview initialization failed.", th);
        }
    }
}
