package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.p3;
import z4.a;
import z4.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class zzbrs extends zzbxn {
    final /* synthetic */ b zza;

    zzbrs(zzbrt zzbrt, b bVar) {
        this.zza = bVar;
    }

    public final void zzb(String str) {
        this.zza.a(str);
    }

    public final void zzc(String str, String str2, Bundle bundle) {
        this.zza.b(new a(new p3(str, bundle, str2)));
    }
}
