package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.v4;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.client.y4;
import com.google.android.gms.ads.internal.client.z2;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.dynamic.a;
import n4.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbrt {
    private static zzbxr zza;
    private final Context zzb;
    private final b zzc;
    private final z2 zzd;

    public zzbrt(Context context, b bVar, z2 z2Var) {
        this.zzb = context;
        this.zzc = bVar;
        this.zzd = z2Var;
    }

    public static zzbxr zza(Context context) {
        zzbxr zzbxr;
        synchronized (zzbrt.class) {
            if (zza == null) {
                zza = x.a().p(context, new zzbnc());
            }
            zzbxr = zza;
        }
        return zzbxr;
    }

    public final void zzb(z4.b bVar) {
        u4 u4Var;
        zzbxr zza2 = zza(this.zzb);
        if (zza2 == null) {
            bVar.a("Internal Error, query info generator is null.");
            return;
        }
        a B1 = com.google.android.gms.dynamic.b.B1(this.zzb);
        z2 z2Var = this.zzd;
        if (z2Var == null) {
            u4Var = new v4().a();
        } else {
            u4Var = y4.f14626a.a(this.zzb, z2Var);
        }
        try {
            zza2.zze(B1, new zzbxv((String) null, this.zzc.name(), (z4) null, u4Var), new zzbrs(this, bVar));
        } catch (RemoteException unused) {
            bVar.a("Internal Error.");
        }
    }
}
