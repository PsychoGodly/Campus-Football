package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdxu implements zzftq {
    public static final /* synthetic */ zzdxu zza = new zzdxu();

    private /* synthetic */ zzdxu() {
    }

    public final zzfut zza(Object obj) {
        return zzfuj.zzh(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
    }
}
