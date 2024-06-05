package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.internal.util.w0;
import java.util.concurrent.Executor;
import n4.d0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzebz implements zzeba {
    private final Context zza;
    private final zzcph zzb;
    private final Executor zzc;

    public zzebz(Context context, zzcph zzcph, Executor executor) {
        this.zza = context;
        this.zzb = zzcph;
        this.zzc = executor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzeyo r7, com.google.android.gms.internal.ads.zzeyc r8, com.google.android.gms.internal.ads.zzeaw r9) throws com.google.android.gms.internal.ads.zzezc, com.google.android.gms.internal.ads.zzeek {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzhh
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0077
            boolean r0 = r8.zzah
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r9.zzb
            com.google.android.gms.internal.ads.zzezs r0 = (com.google.android.gms.internal.ads.zzezs) r0
            com.google.android.gms.internal.ads.zzbno r0 = r0.zzc()
            if (r0 == 0) goto L_0x0067
            com.google.android.gms.dynamic.a r2 = r0.zze()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.Object r2 = com.google.android.gms.dynamic.b.A1(r2)     // Catch:{ RemoteException -> 0x0060 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ RemoteException -> 0x0060 }
            boolean r0 = r0.zzf()     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x0053
            if (r0 == 0) goto L_0x007f
            com.google.android.gms.internal.ads.zzfut r0 = com.google.android.gms.internal.ads.zzfuj.zzh(r1)
            com.google.android.gms.internal.ads.zzeby r3 = new com.google.android.gms.internal.ads.zzeby
            r3.<init>(r6, r2, r8)
            com.google.android.gms.internal.ads.zzfuu r2 = com.google.android.gms.internal.ads.zzbzn.zze
            com.google.android.gms.internal.ads.zzfut r0 = com.google.android.gms.internal.ads.zzfuj.zzm(r0, r3, r2)
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            r2 = r0
            android.view.View r2 = (android.view.View) r2     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            goto L_0x007f
        L_0x004a:
            r7 = move-exception
            goto L_0x004d
        L_0x004c:
            r7 = move-exception
        L_0x004d:
            com.google.android.gms.internal.ads.zzezc r8 = new com.google.android.gms.internal.ads.zzezc
            r8.<init>(r7)
            throw r8
        L_0x0053:
            com.google.android.gms.internal.ads.zzezc r7 = new com.google.android.gms.internal.ads.zzezc
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "BannerAdapterWrapper interscrollerView should not be null"
            r8.<init>(r9)
            r7.<init>(r8)
            throw r7
        L_0x0060:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzezc r8 = new com.google.android.gms.internal.ads.zzezc
            r8.<init>(r7)
            throw r8
        L_0x0067:
            java.lang.String r7 = "getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."
            com.google.android.gms.internal.ads.zzbza.zzg(r7)
            com.google.android.gms.internal.ads.zzezc r8 = new com.google.android.gms.internal.ads.zzezc
            java.lang.Exception r9 = new java.lang.Exception
            r9.<init>(r7)
            r8.<init>(r9)
            throw r8
        L_0x0077:
            java.lang.Object r0 = r9.zzb
            com.google.android.gms.internal.ads.zzezs r0 = (com.google.android.gms.internal.ads.zzezs) r0
            android.view.View r2 = r0.zza()
        L_0x007f:
            com.google.android.gms.internal.ads.zzcph r0 = r6.zzb
            com.google.android.gms.internal.ads.zzcrb r3 = new com.google.android.gms.internal.ads.zzcrb
            java.lang.String r4 = r9.zza
            r3.<init>(r7, r8, r4)
            com.google.android.gms.internal.ads.zzcor r7 = new com.google.android.gms.internal.ads.zzcor
            java.lang.Object r4 = r9.zzb
            com.google.android.gms.internal.ads.zzezs r4 = (com.google.android.gms.internal.ads.zzezs) r4
            com.google.android.gms.internal.ads.zzebx r5 = new com.google.android.gms.internal.ads.zzebx
            r5.<init>(r4)
            java.util.List r8 = r8.zzv
            r4 = 0
            java.lang.Object r8 = r8.get(r4)
            com.google.android.gms.internal.ads.zzeyd r8 = (com.google.android.gms.internal.ads.zzeyd) r8
            r7.<init>(r2, r1, r5, r8)
            com.google.android.gms.internal.ads.zzcol r7 = r0.zza(r3, r7)
            com.google.android.gms.internal.ads.zzdbw r8 = r7.zzg()
            r8.zza(r2)
            com.google.android.gms.internal.ads.zzcvn r8 = r7.zzd()
            com.google.android.gms.internal.ads.zzcmm r0 = new com.google.android.gms.internal.ads.zzcmm
            java.lang.Object r1 = r9.zzb
            com.google.android.gms.internal.ads.zzezs r1 = (com.google.android.gms.internal.ads.zzezs) r1
            r0.<init>(r1)
            java.util.concurrent.Executor r1 = r6.zzc
            r8.zzm(r0, r1)
            com.google.android.gms.internal.ads.zzcvy r8 = r9.zzc
            com.google.android.gms.internal.ads.zzecq r8 = (com.google.android.gms.internal.ads.zzecq) r8
            com.google.android.gms.internal.ads.zzefy r9 = r7.zzj()
            r8.zzc(r9)
            com.google.android.gms.internal.ads.zzcok r7 = r7.zza()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzebz.zza(com.google.android.gms.internal.ads.zzeyo, com.google.android.gms.internal.ads.zzeyc, com.google.android.gms.internal.ads.zzeaw):java.lang.Object");
    }

    public final void zzb(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) throws zzezc {
        z4 zza2;
        z4 z4Var = zzeyo.zza.zza.zze;
        if (z4Var.f14659o) {
            zza2 = new z4(this.zza, d0.d(z4Var.f14650f, z4Var.f14647b));
        } else {
            if (!((Boolean) a0.c().zzb(zzbar.zzhh)).booleanValue() || !zzeyc.zzah) {
                zza2 = zzezb.zza(this.zza, zzeyc.zzv);
            } else {
                zza2 = new z4(this.zza, d0.e(z4Var.f14650f, z4Var.f14647b));
            }
        }
        z4 z4Var2 = zza2;
        if (!((Boolean) a0.c().zzb(zzbar.zzhh)).booleanValue() || !zzeyc.zzah) {
            ((zzezs) zzeaw.zzb).zzm(this.zza, z4Var2, zzeyo.zza.zza.zzd, zzeyc.zzw.toString(), w0.l(zzeyc.zzt), (zzbnl) zzeaw.zzc);
        } else {
            ((zzezs) zzeaw.zzb).zzn(this.zza, z4Var2, zzeyo.zza.zza.zzd, zzeyc.zzw.toString(), w0.l(zzeyc.zzt), (zzbnl) zzeaw.zzc);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzc(View view, zzeyc zzeyc, Object obj) throws Exception {
        return zzfuj.zzh(zzcpy.zza(this.zza, view, zzeyc));
    }
}
