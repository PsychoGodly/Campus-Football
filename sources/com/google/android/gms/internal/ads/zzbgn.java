package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzbgn implements zzfnj {
    public static final /* synthetic */ zzbgn zza = new zzbgn();

    private /* synthetic */ zzbgn() {
    }

    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        zzbhp zzbhp = zzbho.zza;
        if (!((Boolean) zzbcj.zzk.zze()).booleanValue()) {
            return "failure_click_attok";
        }
        t.q().zzu(th, "prepareClickUrl.attestation1");
        return "failure_click_attok";
    }
}
