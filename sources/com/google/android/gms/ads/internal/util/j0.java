package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaks;
import com.google.android.gms.internal.ads.zzakx;
import com.google.android.gms.internal.ads.zzbza;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class j0 implements zzaks {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f14816a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ n0 f14817b;

    j0(q0 q0Var, String str, n0 n0Var) {
        this.f14816a = str;
        this.f14817b = n0Var;
    }

    public final void zza(zzakx zzakx) {
        String str = this.f14816a;
        String exc = zzakx.toString();
        zzbza.zzj("Failed to load URL: " + str + "\n" + exc);
        this.f14817b.zza((Object) null);
    }
}
