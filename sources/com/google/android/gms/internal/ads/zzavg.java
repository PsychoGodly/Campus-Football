package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.f5;
import com.google.android.gms.ads.internal.client.u0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.client.y4;
import com.google.android.gms.ads.internal.client.z2;
import com.google.android.gms.ads.internal.client.z4;
import p4.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzavg {
    private u0 zza;
    private final Context zzb;
    private final String zzc;
    private final z2 zzd;
    private final int zze;
    private final a.C0225a zzf;
    private final zzbnc zzg = new zzbnc();
    private final y4 zzh;

    public zzavg(Context context, String str, z2 z2Var, int i10, a.C0225a aVar) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = z2Var;
        this.zze = i10;
        this.zzf = aVar;
        this.zzh = y4.f14626a;
    }

    public final void zza() {
        try {
            u0 d10 = x.a().d(this.zzb, z4.v(), this.zzc, this.zzg);
            this.zza = d10;
            if (d10 != null) {
                if (this.zze != 3) {
                    this.zza.zzI(new f5(this.zze));
                }
                this.zza.zzH(new zzaut(this.zzf, this.zzc));
                this.zza.zzaa(this.zzh.a(this.zzb, this.zzd));
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }
}
