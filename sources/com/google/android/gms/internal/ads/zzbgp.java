package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzbgp implements zzfnj {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzbgp(String str) {
        this.zza = str;
    }

    public final Object apply(Object obj) {
        String str = this.zza;
        Throwable th = (Throwable) obj;
        zzbhp zzbhp = zzbho.zza;
        if (((Boolean) zzbcj.zzk.zze()).booleanValue()) {
            t.q().zzu(th, "prepareClickUrl.attestation2");
        }
        return str;
    }
}
