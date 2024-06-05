package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.f5;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzetk implements zzeir {
    protected final zzcgd zza;
    private final Context zzb;
    /* access modifiers changed from: private */
    public final Executor zzc;
    /* access modifiers changed from: private */
    public final zzeua zzd;
    /* access modifiers changed from: private */
    public final zzevt zze;
    private final zzbzg zzf;
    private final ViewGroup zzg;
    /* access modifiers changed from: private */
    public final zzfep zzh;
    private final zzeyv zzi;
    /* access modifiers changed from: private */
    public zzfut zzj;

    protected zzetk(Context context, Executor executor, zzcgd zzcgd, zzevt zzevt, zzeua zzeua, zzeyv zzeyv, zzbzg zzbzg) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcgd;
        this.zze = zzevt;
        this.zzd = zzeua;
        this.zzi = zzeyv;
        this.zzf = zzbzg;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcgd.zzy();
    }

    /* access modifiers changed from: private */
    public final synchronized zzctv zzm(zzevr zzevr) {
        zzetj zzetj = (zzetj) zzevr;
        if (((Boolean) a0.c().zzb(zzbar.zzhz)).booleanValue()) {
            zzcoh zzcoh = new zzcoh(this.zzg);
            zzctx zzctx = new zzctx();
            zzctx.zzd(this.zzb);
            zzctx.zzh(zzetj.zza);
            zzctz zzi2 = zzctx.zzi();
            zzczz zzczz = new zzczz();
            zzczz.zzc(this.zzd, this.zzc);
            zzczz.zzl(this.zzd, this.zzc);
            return zze(zzcoh, zzi2, zzczz.zzn());
        }
        zzeua zzi3 = zzeua.zzi(this.zzd);
        zzczz zzczz2 = new zzczz();
        zzczz2.zzb(zzi3, this.zzc);
        zzczz2.zzg(zzi3, this.zzc);
        zzczz2.zzh(zzi3, this.zzc);
        zzczz2.zzi(zzi3, this.zzc);
        zzczz2.zzc(zzi3, this.zzc);
        zzczz2.zzl(zzi3, this.zzc);
        zzczz2.zzm(zzi3);
        zzcoh zzcoh2 = new zzcoh(this.zzg);
        zzctx zzctx2 = new zzctx();
        zzctx2.zzd(this.zzb);
        zzctx2.zzh(zzetj.zza);
        return zze(zzcoh2, zzctx2.zzi(), zzczz2.zzn());
    }

    public final boolean zza() {
        zzfut zzfut = this.zzj;
        return zzfut != null && !zzfut.isDone();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056 A[SYNTHETIC, Splitter:B:16:0x0056] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.u4 r8, java.lang.String r9, com.google.android.gms.internal.ads.zzeip r10, com.google.android.gms.internal.ads.zzeiq r11) throws android.os.RemoteException {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.android.gms.internal.ads.zzbbw r10 = com.google.android.gms.internal.ads.zzbci.zzd     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r10.zze()     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L_0x0025
            com.google.android.gms.internal.ads.zzbaj r10 = com.google.android.gms.internal.ads.zzbar.zzjw     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbap r2 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r2.zzb(r10)     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x0025
            r10 = 1
            goto L_0x0026
        L_0x0025:
            r10 = 0
        L_0x0026:
            com.google.android.gms.internal.ads.zzbzg r2 = r7.zzf     // Catch:{ all -> 0x00f4 }
            int r2 = r2.zzc     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbaj r3 = com.google.android.gms.internal.ads.zzbar.zzjx     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbap r4 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x00f4 }
            java.lang.Object r3 = r4.zzb(r3)     // Catch:{ all -> 0x00f4 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x00f4 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x00f4 }
            if (r2 < r3) goto L_0x003e
            if (r10 != 0) goto L_0x0043
        L_0x003e:
            java.lang.String r10 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.q.f(r10)     // Catch:{ all -> 0x00f4 }
        L_0x0043:
            if (r9 != 0) goto L_0x0056
            java.lang.String r8 = "Ad unit ID should not be null for app open ad."
            com.google.android.gms.internal.ads.zzbza.zzg(r8)     // Catch:{ all -> 0x00f4 }
            java.util.concurrent.Executor r8 = r7.zzc     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzete r9 = new com.google.android.gms.internal.ads.zzete     // Catch:{ all -> 0x00f4 }
            r9.<init>(r7)     // Catch:{ all -> 0x00f4 }
            r8.execute(r9)     // Catch:{ all -> 0x00f4 }
            monitor-exit(r7)
            return r1
        L_0x0056:
            com.google.android.gms.internal.ads.zzfut r10 = r7.zzj     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x005c
            monitor-exit(r7)
            return r1
        L_0x005c:
            com.google.android.gms.internal.ads.zzbbw r10 = com.google.android.gms.internal.ads.zzbcd.zzc     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r10.zze()     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            r1 = 7
            r2 = 0
            if (r10 == 0) goto L_0x0088
            com.google.android.gms.internal.ads.zzevt r10 = r7.zze     // Catch:{ all -> 0x00f4 }
            java.lang.Object r3 = r10.zzd()     // Catch:{ all -> 0x00f4 }
            if (r3 == 0) goto L_0x0088
            java.lang.Object r10 = r10.zzd()     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzcnu r10 = (com.google.android.gms.internal.ads.zzcnu) r10     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfen r10 = r10.zzh()     // Catch:{ all -> 0x00f4 }
            r10.zzh(r1)     // Catch:{ all -> 0x00f4 }
            java.lang.String r3 = r8.f14566q     // Catch:{ all -> 0x00f4 }
            r10.zzb(r3)     // Catch:{ all -> 0x00f4 }
            r4 = r10
            goto L_0x0089
        L_0x0088:
            r4 = r2
        L_0x0089:
            android.content.Context r10 = r7.zzb     // Catch:{ all -> 0x00f4 }
            boolean r3 = r8.f14556g     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzezr.zza(r10, r3)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbaj r10 = com.google.android.gms.internal.ads.zzbar.zzif     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbap r3 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r3.zzb(r10)     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x00af
            boolean r10 = r8.f14556g     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x00af
            com.google.android.gms.internal.ads.zzcgd r10 = r7.zza     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzdsf r10 = r10.zzj()     // Catch:{ all -> 0x00f4 }
            r10.zzm(r0)     // Catch:{ all -> 0x00f4 }
        L_0x00af:
            com.google.android.gms.internal.ads.zzeyv r10 = r7.zzi     // Catch:{ all -> 0x00f4 }
            r10.zzs(r9)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.ads.internal.client.z4 r9 = com.google.android.gms.ads.internal.client.z4.v()     // Catch:{ all -> 0x00f4 }
            r10.zzr(r9)     // Catch:{ all -> 0x00f4 }
            r10.zzE(r8)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzeyx r9 = r10.zzG()     // Catch:{ all -> 0x00f4 }
            android.content.Context r10 = r7.zzb     // Catch:{ all -> 0x00f4 }
            int r3 = com.google.android.gms.internal.ads.zzfem.zzf(r9)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfec r5 = com.google.android.gms.internal.ads.zzfeb.zzb(r10, r3, r1, r8)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzetj r6 = new com.google.android.gms.internal.ads.zzetj     // Catch:{ all -> 0x00f4 }
            r6.<init>(r2)     // Catch:{ all -> 0x00f4 }
            r6.zza = r9     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzevt r8 = r7.zze     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzevu r9 = new com.google.android.gms.internal.ads.zzevu     // Catch:{ all -> 0x00f4 }
            r9.<init>(r6, r2)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzetf r10 = new com.google.android.gms.internal.ads.zzetf     // Catch:{ all -> 0x00f4 }
            r10.<init>(r7)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfut r8 = r8.zzc(r9, r10, r2)     // Catch:{ all -> 0x00f4 }
            r7.zzj = r8     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzeth r9 = new com.google.android.gms.internal.ads.zzeth     // Catch:{ all -> 0x00f4 }
            r1 = r9
            r2 = r7
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00f4 }
            java.util.concurrent.Executor r10 = r7.zzc     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfuj.zzq(r8, r9, r10)     // Catch:{ all -> 0x00f4 }
            monitor-exit(r7)
            return r0
        L_0x00f4:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzetk.zzb(com.google.android.gms.ads.internal.client.u4, java.lang.String, com.google.android.gms.internal.ads.zzeip, com.google.android.gms.internal.ads.zzeiq):boolean");
    }

    /* access modifiers changed from: protected */
    public abstract zzctv zze(zzcoh zzcoh, zzctz zzctz, zzdab zzdab);

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk() {
        this.zzd.zza(zzezx.zzd(6, (String) null, (c3) null));
    }

    public final void zzl(f5 f5Var) {
        this.zzi.zzt(f5Var);
    }
}
