package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzsn extends zzut {
    private final boolean zzb;
    private final zzcm zzc;
    private final zzck zzd;
    private zzsl zze;
    private zzsk zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzsn(zzsu zzsu, boolean z10) {
        super(zzsu);
        boolean z11;
        if (z10) {
            zzsu.zzu();
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzb = z11;
        this.zzc = new zzcm();
        this.zzd = new zzck();
        zzsu.zzL();
        this.zze = zzsl.zzq(zzsu.zzI());
    }

    private final Object zzJ(Object obj) {
        return (this.zze.zzf == null || !obj.equals(zzsl.zzd)) ? obj : this.zze.zzf;
    }

    private final void zzK(long j10) {
        zzsk zzsk = this.zzf;
        int zza = this.zze.zza(zzsk.zza.zza);
        if (zza != -1) {
            zzsl zzsl = this.zze;
            zzck zzck = this.zzd;
            zzsl.zzd(zza, zzck, false);
            long j11 = zzck.zze;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                j10 = Math.max(0, j11 - 1);
            }
            zzsk.zzs(j10);
        }
    }

    public final zzcn zzB() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final zzss zzC(zzss zzss) {
        Object obj = zzss.zza;
        if (this.zze.zzf != null && this.zze.zzf.equals(obj)) {
            obj = zzsl.zzd;
        }
        return zzss.zzc(obj);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzD(com.google.android.gms.internal.ads.zzcn r15) {
        /*
            r14 = this;
            boolean r0 = r14.zzh
            r1 = 0
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.zzsl r0 = r14.zze
            com.google.android.gms.internal.ads.zzsl r15 = r0.zzp(r15)
            r14.zze = r15
            com.google.android.gms.internal.ads.zzsk r15 = r14.zzf
            if (r15 == 0) goto L_0x009b
            long r2 = r15.zzn()
            r14.zzK(r2)
            goto L_0x009b
        L_0x001a:
            boolean r0 = r15.zzo()
            if (r0 == 0) goto L_0x0036
            boolean r0 = r14.zzi
            if (r0 == 0) goto L_0x002b
            com.google.android.gms.internal.ads.zzsl r0 = r14.zze
            com.google.android.gms.internal.ads.zzsl r15 = r0.zzp(r15)
            goto L_0x0033
        L_0x002b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzcm.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzsl.zzd
            com.google.android.gms.internal.ads.zzsl r15 = com.google.android.gms.internal.ads.zzsl.zzr(r15, r0, r2)
        L_0x0033:
            r14.zze = r15
            goto L_0x009b
        L_0x0036:
            com.google.android.gms.internal.ads.zzcm r0 = r14.zzc
            r2 = 0
            r3 = 0
            r15.zze(r2, r0, r3)
            com.google.android.gms.internal.ads.zzcm r0 = r14.zzc
            java.lang.Object r0 = r0.zzc
            com.google.android.gms.internal.ads.zzsk r5 = r14.zzf
            if (r5 == 0) goto L_0x0062
            long r6 = r5.zzq()
            com.google.android.gms.internal.ads.zzsl r8 = r14.zze
            com.google.android.gms.internal.ads.zzss r5 = r5.zza
            java.lang.Object r5 = r5.zza
            com.google.android.gms.internal.ads.zzck r9 = r14.zzd
            r8.zzn(r5, r9)
            com.google.android.gms.internal.ads.zzsl r5 = r14.zze
            com.google.android.gms.internal.ads.zzcm r8 = r14.zzc
            r5.zze(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0062
            r12 = r6
            goto L_0x0063
        L_0x0062:
            r12 = r3
        L_0x0063:
            com.google.android.gms.internal.ads.zzcm r9 = r14.zzc
            com.google.android.gms.internal.ads.zzck r10 = r14.zzd
            r11 = 0
            r8 = r15
            android.util.Pair r2 = r8.zzl(r9, r10, r11, r12)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r14.zzi
            if (r2 == 0) goto L_0x0082
            com.google.android.gms.internal.ads.zzsl r0 = r14.zze
            com.google.android.gms.internal.ads.zzsl r15 = r0.zzp(r15)
            goto L_0x0086
        L_0x0082:
            com.google.android.gms.internal.ads.zzsl r15 = com.google.android.gms.internal.ads.zzsl.zzr(r15, r0, r3)
        L_0x0086:
            r14.zze = r15
            com.google.android.gms.internal.ads.zzsk r15 = r14.zzf
            if (r15 == 0) goto L_0x009b
            r14.zzK(r4)
            com.google.android.gms.internal.ads.zzss r15 = r15.zza
            java.lang.Object r0 = r15.zza
            java.lang.Object r0 = r14.zzJ(r0)
            com.google.android.gms.internal.ads.zzss r1 = r15.zzc(r0)
        L_0x009b:
            r15 = 1
            r14.zzi = r15
            r14.zzh = r15
            com.google.android.gms.internal.ads.zzsl r15 = r14.zze
            r14.zzo(r15)
            if (r1 == 0) goto L_0x00af
            com.google.android.gms.internal.ads.zzsk r15 = r14.zzf
            java.util.Objects.requireNonNull(r15)
            r15.zzr(r1)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsn.zzD(com.google.android.gms.internal.ads.zzcn):void");
    }

    public final void zzE() {
        if (!this.zzb) {
            this.zzg = true;
            zzA((Object) null, this.zza);
        }
    }

    public final void zzF(zzsq zzsq) {
        ((zzsk) zzsq).zzt();
        if (zzsq == this.zzf) {
            this.zzf = null;
        }
    }

    /* renamed from: zzG */
    public final zzsk zzH(zzss zzss, zzwt zzwt, long j10) {
        zzsk zzsk = new zzsk(zzss, zzwt, j10, (byte[]) null);
        zzsk.zzu(this.zza);
        if (this.zzh) {
            zzsk.zzr(zzss.zzc(zzJ(zzss.zza)));
        } else {
            this.zzf = zzsk;
            if (!this.zzg) {
                this.zzg = true;
                zzA((Object) null, this.zza);
            }
        }
        return zzsk;
    }

    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    public final void zzy() {
    }
}
