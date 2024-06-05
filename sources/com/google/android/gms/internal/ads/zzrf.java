package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzrf implements zzro {
    public static final /* synthetic */ zzrf zza = new zzrf();

    private /* synthetic */ zzrf() {
    }

    public final int zza(Object obj) {
        int i10 = zzrp.zza;
        String str = ((zzqx) obj).zza;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        if (zzew.zza >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
            return 0;
        }
        return -1;
    }
}
