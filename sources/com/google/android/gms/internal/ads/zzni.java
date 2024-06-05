package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzni implements zznm {
    public static final zzfok zza = zzng.zza;
    private static final Random zzb = new Random();
    /* access modifiers changed from: private */
    public final zzcm zzc;
    /* access modifiers changed from: private */
    public final zzck zzd;
    private final HashMap zze;
    private final zzfok zzf;
    private zznl zzg;
    private zzcn zzh;
    private String zzi;

    public zzni() {
        throw null;
    }

    private final zznh zzk(int i10, zzss zzss) {
        int i11;
        long j10 = Long.MAX_VALUE;
        zznh zznh = null;
        for (zznh zznh2 : this.zze.values()) {
            zznh2.zzg(i10, zzss);
            if (zznh2.zzj(i10, zzss)) {
                long zzb2 = zznh2.zzd;
                if (zzb2 == -1 || zzb2 < j10) {
                    zznh = zznh2;
                    j10 = zzb2;
                } else if (i11 == 0) {
                    int i12 = zzew.zza;
                    if (!(zznh.zze == null || zznh2.zze == null)) {
                        zznh = zznh2;
                    }
                }
            }
        }
        if (zznh != null) {
            return zznh;
        }
        String zzl = zzl();
        zznh zznh3 = new zznh(this, zzl, i10, zzss);
        this.zze.put(zzl, zznh3);
        return zznh3;
    }

    /* access modifiers changed from: private */
    public static String zzl() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzm(zzlc zzlc) {
        if (zzlc.zzb.zzo()) {
            this.zzi = null;
            return;
        }
        zznh zznh = (zznh) this.zze.get(this.zzi);
        zznh zzk = zzk(zzlc.zzc, zzlc.zzd);
        this.zzi = zzk.zzb;
        zzh(zzlc);
        zzss zzss = zzlc.zzd;
        if (zzss != null && zzss.zzb()) {
            if (zznh == null || zznh.zzd != zzlc.zzd.zzd || zznh.zze == null || zznh.zze.zzb != zzlc.zzd.zzb || zznh.zze.zzc != zzlc.zzd.zzc) {
                zzss zzss2 = zzlc.zzd;
                String unused = zzk(zzlc.zzc, new zzss(zzss2.zza, zzss2.zzd)).zzb;
                String unused2 = zzk.zzb;
            }
        }
    }

    public final synchronized String zzd() {
        return this.zzi;
    }

    public final synchronized String zze(zzcn zzcn, zzss zzss) {
        return zzk(zzcn.zzn(zzss.zza, this.zzd).zzd, zzss).zzb;
    }

    public final synchronized void zzf(zzlc zzlc) {
        zznl zznl;
        this.zzi = null;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zznh zznh = (zznh) it.next();
            it.remove();
            if (zznh.zzf && (zznl = this.zzg) != null) {
                zznl.zzd(zzlc, zznh.zzb, false);
            }
        }
    }

    public final void zzg(zznl zznl) {
        this.zzg = zznl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r10.zzd.zzd < com.google.android.gms.internal.ads.zznh.zzb(r0)) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ca, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzh(com.google.android.gms.internal.ads.zzlc r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zznl r0 = r9.zzg     // Catch:{ all -> 0x00cb }
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzcn r0 = r10.zzb     // Catch:{ all -> 0x00cb }
            boolean r0 = r0.zzo()     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x0010
            monitor-exit(r9)
            return
        L_0x0010:
            java.util.HashMap r0 = r9.zze     // Catch:{ all -> 0x00cb }
            java.lang.String r1 = r9.zzi     // Catch:{ all -> 0x00cb }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zznh r0 = (com.google.android.gms.internal.ads.zznh) r0     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzss r1 = r10.zzd     // Catch:{ all -> 0x00cb }
            if (r1 == 0) goto L_0x0041
            if (r0 == 0) goto L_0x0041
            long r1 = r0.zzd     // Catch:{ all -> 0x00cb }
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0033
            int r0 = r0.zzc     // Catch:{ all -> 0x00cb }
            int r1 = r10.zzc     // Catch:{ all -> 0x00cb }
            if (r0 != r1) goto L_0x003f
            goto L_0x0041
        L_0x0033:
            com.google.android.gms.internal.ads.zzss r1 = r10.zzd     // Catch:{ all -> 0x00cb }
            long r1 = r1.zzd     // Catch:{ all -> 0x00cb }
            long r3 = r0.zzd     // Catch:{ all -> 0x00cb }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0041
        L_0x003f:
            monitor-exit(r9)
            return
        L_0x0041:
            int r0 = r10.zzc     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzss r1 = r10.zzd     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zznh r0 = r9.zzk(r0, r1)     // Catch:{ all -> 0x00cb }
            java.lang.String r1 = r9.zzi     // Catch:{ all -> 0x00cb }
            if (r1 != 0) goto L_0x0053
            java.lang.String r1 = r0.zzb     // Catch:{ all -> 0x00cb }
            r9.zzi = r1     // Catch:{ all -> 0x00cb }
        L_0x0053:
            com.google.android.gms.internal.ads.zzss r1 = r10.zzd     // Catch:{ all -> 0x00cb }
            r2 = 1
            if (r1 == 0) goto L_0x009d
            boolean r3 = r1.zzb()     // Catch:{ all -> 0x00cb }
            if (r3 == 0) goto L_0x009d
            com.google.android.gms.internal.ads.zzss r3 = new com.google.android.gms.internal.ads.zzss     // Catch:{ all -> 0x00cb }
            java.lang.Object r4 = r1.zza     // Catch:{ all -> 0x00cb }
            long r5 = r1.zzd     // Catch:{ all -> 0x00cb }
            int r1 = r1.zzb     // Catch:{ all -> 0x00cb }
            r3.<init>(r4, r5, r1)     // Catch:{ all -> 0x00cb }
            int r1 = r10.zzc     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zznh r1 = r9.zzk(r1, r3)     // Catch:{ all -> 0x00cb }
            boolean r3 = r1.zzf     // Catch:{ all -> 0x00cb }
            if (r3 != 0) goto L_0x009d
            r1.zzf = true     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzcn r3 = r10.zzb     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzss r4 = r10.zzd     // Catch:{ all -> 0x00cb }
            java.lang.Object r4 = r4.zza     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzck r5 = r9.zzd     // Catch:{ all -> 0x00cb }
            r3.zzn(r4, r5)     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzck r3 = r9.zzd     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzss r4 = r10.zzd     // Catch:{ all -> 0x00cb }
            int r4 = r4.zzb     // Catch:{ all -> 0x00cb }
            r3.zzh(r4)     // Catch:{ all -> 0x00cb }
            r3 = 0
            long r5 = com.google.android.gms.internal.ads.zzew.zzz(r3)     // Catch:{ all -> 0x00cb }
            long r7 = com.google.android.gms.internal.ads.zzew.zzz(r3)     // Catch:{ all -> 0x00cb }
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x00cb }
            java.lang.String unused = r1.zzb     // Catch:{ all -> 0x00cb }
        L_0x009d:
            boolean r1 = r0.zzf     // Catch:{ all -> 0x00cb }
            if (r1 != 0) goto L_0x00a9
            r0.zzf = true     // Catch:{ all -> 0x00cb }
            java.lang.String unused = r0.zzb     // Catch:{ all -> 0x00cb }
        L_0x00a9:
            java.lang.String r1 = r0.zzb     // Catch:{ all -> 0x00cb }
            java.lang.String r3 = r9.zzi     // Catch:{ all -> 0x00cb }
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x00cb }
            if (r1 == 0) goto L_0x00c9
            boolean r1 = r0.zzg     // Catch:{ all -> 0x00cb }
            if (r1 != 0) goto L_0x00c9
            r0.zzg = true     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zznl r1 = r9.zzg     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = r0.zzb     // Catch:{ all -> 0x00cb }
            r1.zzc(r10, r0)     // Catch:{ all -> 0x00cb }
            monitor-exit(r9)
            return
        L_0x00c9:
            monitor-exit(r9)
            return
        L_0x00cb:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzni.zzh(com.google.android.gms.internal.ads.zzlc):void");
    }

    public final synchronized void zzi(zzlc zzlc, int i10) {
        Objects.requireNonNull(this.zzg);
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zznh zznh = (zznh) it.next();
            if (zznh.zzk(zzlc)) {
                it.remove();
                if (zznh.zzf) {
                    boolean equals = zznh.zzb.equals(this.zzi);
                    boolean z10 = false;
                    if (i10 == 0 && equals && zznh.zzg) {
                        z10 = true;
                    }
                    if (equals) {
                        this.zzi = null;
                    }
                    this.zzg.zzd(zzlc, zznh.zzb, z10);
                }
            }
        }
        zzm(zzlc);
    }

    public final synchronized void zzj(zzlc zzlc) {
        Objects.requireNonNull(this.zzg);
        zzcn zzcn = this.zzh;
        this.zzh = zzlc.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zznh zznh = (zznh) it.next();
            if (!zznh.zzl(zzcn, this.zzh) || zznh.zzk(zzlc)) {
                it.remove();
                if (zznh.zzf) {
                    if (zznh.zzb.equals(this.zzi)) {
                        this.zzi = null;
                    }
                    this.zzg.zzd(zzlc, zznh.zzb, false);
                }
            }
        }
        zzm(zzlc);
    }

    public zzni(zzfok zzfok) {
        this.zzf = zzfok;
        this.zzc = new zzcm();
        this.zzd = new zzck();
        this.zze = new HashMap();
        this.zzh = zzcn.zza;
    }
}
