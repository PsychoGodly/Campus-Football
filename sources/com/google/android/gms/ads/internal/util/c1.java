package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzbza;
import h5.g;
import h5.h;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class c1 extends b0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f14784a;

    c1(Context context) {
        this.f14784a = context;
    }

    public final void zza() {
        boolean z10;
        try {
            z10 = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.f14784a);
        } catch (g | h | IOException | IllegalStateException e10) {
            zzbza.zzh("Fail to get isAdIdFakeForDebugLogging", e10);
            z10 = false;
        }
        zzbyz.zzj(z10);
        zzbza.zzj("Update ad debug logging enablement as " + z10);
    }
}
