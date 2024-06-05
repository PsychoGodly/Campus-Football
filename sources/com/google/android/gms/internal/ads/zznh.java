package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zznh {
    final /* synthetic */ zzni zza;
    /* access modifiers changed from: private */
    public final String zzb;
    /* access modifiers changed from: private */
    public int zzc;
    /* access modifiers changed from: private */
    public long zzd;
    /* access modifiers changed from: private */
    public zzss zze;
    /* access modifiers changed from: private */
    public boolean zzf;
    /* access modifiers changed from: private */
    public boolean zzg;

    public zznh(zzni zzni, String str, int i10, zzss zzss) {
        this.zza = zzni;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = zzss == null ? -1 : zzss.zzd;
        if (zzss != null && zzss.zzb()) {
            this.zze = zzss;
        }
    }

    public final void zzg(int i10, zzss zzss) {
        if (this.zzd == -1 && i10 == this.zzc && zzss != null) {
            this.zzd = zzss.zzd;
        }
    }

    public final boolean zzj(int i10, zzss zzss) {
        if (zzss == null) {
            return i10 == this.zzc;
        }
        zzss zzss2 = this.zze;
        return zzss2 == null ? !zzss.zzb() && zzss.zzd == this.zzd : zzss.zzd == zzss2.zzd && zzss.zzb == zzss2.zzb && zzss.zzc == zzss2.zzc;
    }

    public final boolean zzk(zzlc zzlc) {
        zzss zzss = zzlc.zzd;
        if (zzss == null) {
            return this.zzc != zzlc.zzc;
        }
        long j10 = this.zzd;
        if (j10 == -1) {
            return false;
        }
        if (zzss.zzd > j10) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        int zza2 = zzlc.zzb.zza(zzss.zza);
        int zza3 = zzlc.zzb.zza(this.zze.zza);
        zzss zzss2 = zzlc.zzd;
        if (zzss2.zzd < this.zze.zzd || zza2 < zza3) {
            return false;
        }
        if (zza2 > zza3) {
            return true;
        }
        if (zzss2.zzb()) {
            zzss zzss3 = zzlc.zzd;
            int i10 = zzss3.zzb;
            int i11 = zzss3.zzc;
            zzss zzss4 = this.zze;
            int i12 = zzss4.zzb;
            if (i10 <= i12) {
                return i10 == i12 && i11 > zzss4.zzc;
            }
            return true;
        }
        int i13 = zzlc.zzd.zze;
        return i13 == -1 || i13 > this.zze.zzb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 < r8.zzc()) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzl(com.google.android.gms.internal.ads.zzcn r7, com.google.android.gms.internal.ads.zzcn r8) {
        /*
            r6 = this;
            int r0 = r6.zzc
            int r1 = r7.zzc()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L_0x0013
            int r7 = r8.zzc()
            if (r0 >= r7) goto L_0x0011
            goto L_0x004a
        L_0x0011:
            r0 = -1
            goto L_0x004a
        L_0x0013:
            com.google.android.gms.internal.ads.zzni r1 = r6.zza
            com.google.android.gms.internal.ads.zzcm r1 = r1.zzc
            r4 = 0
            r7.zze(r0, r1, r4)
            com.google.android.gms.internal.ads.zzni r0 = r6.zza
            com.google.android.gms.internal.ads.zzcm r0 = r0.zzc
            int r0 = r0.zzo
        L_0x0026:
            com.google.android.gms.internal.ads.zzni r1 = r6.zza
            com.google.android.gms.internal.ads.zzcm r1 = r1.zzc
            int r1 = r1.zzp
            if (r0 > r1) goto L_0x0011
            java.lang.Object r1 = r7.zzf(r0)
            int r1 = r8.zza(r1)
            if (r1 == r3) goto L_0x0047
            com.google.android.gms.internal.ads.zzni r7 = r6.zza
            com.google.android.gms.internal.ads.zzck r7 = r7.zzd
            com.google.android.gms.internal.ads.zzck r7 = r8.zzd(r1, r7, r2)
            int r0 = r7.zzd
            goto L_0x004a
        L_0x0047:
            int r0 = r0 + 1
            goto L_0x0026
        L_0x004a:
            r6.zzc = r0
            if (r0 != r3) goto L_0x004f
            return r2
        L_0x004f:
            com.google.android.gms.internal.ads.zzss r7 = r6.zze
            r0 = 1
            if (r7 != 0) goto L_0x0055
            return r0
        L_0x0055:
            java.lang.Object r7 = r7.zza
            int r7 = r8.zza(r7)
            if (r7 == r3) goto L_0x005e
            return r0
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznh.zzl(com.google.android.gms.internal.ads.zzcn, com.google.android.gms.internal.ads.zzcn):boolean");
    }
}
