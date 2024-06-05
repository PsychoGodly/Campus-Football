package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcda extends zzccu implements zzgi {
    private String zzd;
    private final zzcbi zze;
    private boolean zzf;
    private final zzccz zzg = new zzccz();
    private final zzccf zzh = new zzccf();
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk = new Object();
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcda(zzcbj zzcbj, zzcbi zzcbi) {
        super(zzcbj);
        this.zze = zzcbi;
        this.zzl = (String) zzfnq.zzd(zzcbj != null ? zzcbj.zzbl() : null).zzb(MaxReward.DEFAULT_LABEL);
        this.zzm = zzcbj != null ? zzcbj.zzf() : 0;
    }

    protected static final String zzm(String str) {
        return "cache:".concat(String.valueOf(zzbyt.zze(str)));
    }

    private final void zzv() {
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round(((float) zza2) * (((float) position) / ((float) zza)));
        int zzs = zzcba.zzs();
        int zzu = zzcba.zzu();
        String str = this.zzd;
        zzn(str, zzm(str), position, zza, (long) round, (long) zza2, round > 0, zzs, zzu);
    }

    public final void zza(zzfg zzfg, zzfl zzfl, boolean z10, int i10) {
    }

    public final void zzb(zzfg zzfg, zzfl zzfl, boolean z10) {
    }

    public final void zzc(zzfg zzfg, zzfl zzfl, boolean z10) {
    }

    public final void zzd(zzfg zzfg, zzfl zzfl, boolean z10) {
        if (zzfg instanceof zzft) {
            this.zzg.zzb((zzft) zzfg);
        }
    }

    public final void zzf() {
        this.zzf = true;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final ByteBuffer zzk() {
        synchronized (this.zzk) {
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && !this.zzj) {
                byteBuffer.flip();
                this.zzj = true;
            }
            this.zzf = true;
        }
        return this.zzi;
    }

    public final boolean zzl() {
        return this.zzn;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: com.google.android.gms.internal.ads.zzft} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.google.android.gms.internal.ads.zzft} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: com.google.android.gms.internal.ads.zzccd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.google.android.gms.internal.ads.zzft} */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d2, code lost:
        if (r1.zzi.remaining() > 0) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d4, code lost:
        zzv();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00dc, code lost:
        if (r1.zzf != false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00de, code lost:
        r5 = r0.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e6, code lost:
        if ((r5 - r16) < r10) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e8, code lost:
        zzv();
        r16 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f4, code lost:
        if ((r5 - r7) > (1000 * r12)) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0119, code lost:
        throw new java.io.IOException("Timeout exceeded. Limit: " + r12 + " sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011c, code lost:
        r3 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013f, code lost:
        throw new java.io.IOException("Precache abort at " + r1.zzi.limit() + " bytes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0140, code lost:
        r0 = e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzt(java.lang.String r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r1.zzd = r2
            java.lang.String r3 = "error"
            java.lang.String r4 = zzm(r22)
            r5 = 0
            com.google.android.gms.internal.ads.zzfo r0 = new com.google.android.gms.internal.ads.zzfo     // Catch:{ Exception -> 0x0149 }
            r0.<init>()     // Catch:{ Exception -> 0x0149 }
            java.lang.String r6 = r1.zzb     // Catch:{ Exception -> 0x0149 }
            r0.zzf(r6)     // Catch:{ Exception -> 0x0149 }
            com.google.android.gms.internal.ads.zzcbi r6 = r1.zze     // Catch:{ Exception -> 0x0149 }
            int r6 = r6.zzd     // Catch:{ Exception -> 0x0149 }
            r0.zzc(r6)     // Catch:{ Exception -> 0x0149 }
            com.google.android.gms.internal.ads.zzcbi r6 = r1.zze     // Catch:{ Exception -> 0x0149 }
            int r6 = r6.zzf     // Catch:{ Exception -> 0x0149 }
            r0.zzd(r6)     // Catch:{ Exception -> 0x0149 }
            r6 = 1
            r0.zzb(r6)     // Catch:{ Exception -> 0x0149 }
            r0.zze(r1)     // Catch:{ Exception -> 0x0149 }
            com.google.android.gms.internal.ads.zzft r9 = r0.zza()     // Catch:{ Exception -> 0x0149 }
            com.google.android.gms.internal.ads.zzcbi r0 = r1.zze     // Catch:{ Exception -> 0x0149 }
            boolean r0 = r0.zzj     // Catch:{ Exception -> 0x0149 }
            if (r0 == 0) goto L_0x0045
            com.google.android.gms.internal.ads.zzccd r0 = new com.google.android.gms.internal.ads.zzccd     // Catch:{ Exception -> 0x0149 }
            android.content.Context r8 = r1.zza     // Catch:{ Exception -> 0x0149 }
            java.lang.String r10 = r1.zzl     // Catch:{ Exception -> 0x0149 }
            int r11 = r1.zzm     // Catch:{ Exception -> 0x0149 }
            r12 = 0
            r13 = 0
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0149 }
            r9 = r0
        L_0x0045:
            android.net.Uri r0 = android.net.Uri.parse(r22)     // Catch:{ Exception -> 0x0149 }
            com.google.android.gms.internal.ads.zzfl r7 = new com.google.android.gms.internal.ads.zzfl     // Catch:{ Exception -> 0x0149 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x0149 }
            r9.zzb(r7)     // Catch:{ Exception -> 0x0149 }
            java.lang.ref.WeakReference r0 = r1.zzc     // Catch:{ Exception -> 0x0149 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0149 }
            com.google.android.gms.internal.ads.zzcbj r0 = (com.google.android.gms.internal.ads.zzcbj) r0     // Catch:{ Exception -> 0x0149 }
            if (r0 == 0) goto L_0x005e
            r0.zzt(r4, r1)     // Catch:{ Exception -> 0x0149 }
        L_0x005e:
            m5.e r0 = com.google.android.gms.ads.internal.t.b()     // Catch:{ Exception -> 0x0149 }
            long r7 = r0.a()     // Catch:{ Exception -> 0x0149 }
            com.google.android.gms.internal.ads.zzbaj r10 = com.google.android.gms.internal.ads.zzbar.zzw     // Catch:{ Exception -> 0x0149 }
            com.google.android.gms.internal.ads.zzbap r11 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ Exception -> 0x0149 }
            java.lang.Object r10 = r11.zzb(r10)     // Catch:{ Exception -> 0x0149 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ Exception -> 0x0149 }
            long r10 = r10.longValue()     // Catch:{ Exception -> 0x0149 }
            com.google.android.gms.internal.ads.zzbaj r12 = com.google.android.gms.internal.ads.zzbar.zzv     // Catch:{ Exception -> 0x0149 }
            com.google.android.gms.internal.ads.zzbap r13 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ Exception -> 0x0149 }
            java.lang.Object r12 = r13.zzb(r12)     // Catch:{ Exception -> 0x0149 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ Exception -> 0x0149 }
            long r12 = r12.longValue()     // Catch:{ Exception -> 0x0149 }
            com.google.android.gms.internal.ads.zzcbi r14 = r1.zze     // Catch:{ Exception -> 0x0149 }
            int r14 = r14.zzc     // Catch:{ Exception -> 0x0149 }
            java.nio.ByteBuffer r14 = java.nio.ByteBuffer.allocate(r14)     // Catch:{ Exception -> 0x0149 }
            r1.zzi = r14     // Catch:{ Exception -> 0x0149 }
            r14 = 8192(0x2000, float:1.14794E-41)
            byte[] r15 = new byte[r14]     // Catch:{ Exception -> 0x0149 }
            r16 = r7
        L_0x0096:
            java.nio.ByteBuffer r6 = r1.zzi     // Catch:{ Exception -> 0x0149 }
            int r6 = r6.remaining()     // Catch:{ Exception -> 0x0149 }
            int r6 = java.lang.Math.min(r6, r14)     // Catch:{ Exception -> 0x0149 }
            int r6 = r9.zza(r15, r5, r6)     // Catch:{ Exception -> 0x0149 }
            r14 = -1
            if (r6 != r14) goto L_0x00b9
            r14 = 1
            r1.zzn = r14     // Catch:{ Exception -> 0x0149 }
            com.google.android.gms.internal.ads.zzccf r0 = r1.zzh     // Catch:{ Exception -> 0x0149 }
            java.nio.ByteBuffer r6 = r1.zzi     // Catch:{ Exception -> 0x0149 }
            long r6 = r0.zza(r6)     // Catch:{ Exception -> 0x0149 }
            int r0 = (int) r6     // Catch:{ Exception -> 0x0149 }
            long r6 = (long) r0     // Catch:{ Exception -> 0x0149 }
            r1.zzj(r2, r4, r6)     // Catch:{ Exception -> 0x0149 }
        L_0x00b7:
            r3 = 1
            goto L_0x00d8
        L_0x00b9:
            java.lang.Object r14 = r1.zzk     // Catch:{ Exception -> 0x0149 }
            monitor-enter(r14)     // Catch:{ Exception -> 0x0149 }
            boolean r5 = r1.zzf     // Catch:{ all -> 0x0144 }
            if (r5 != 0) goto L_0x00c9
            java.nio.ByteBuffer r5 = r1.zzi     // Catch:{ all -> 0x0144 }
            r18 = r3
            r3 = 0
            r5.put(r15, r3, r6)     // Catch:{ all -> 0x0142 }
            goto L_0x00cb
        L_0x00c9:
            r18 = r3
        L_0x00cb:
            monitor-exit(r14)     // Catch:{ all -> 0x0142 }
            java.nio.ByteBuffer r3 = r1.zzi     // Catch:{ Exception -> 0x0140 }
            int r3 = r3.remaining()     // Catch:{ Exception -> 0x0140 }
            if (r3 > 0) goto L_0x00d9
            r21.zzv()     // Catch:{ Exception -> 0x0140 }
            goto L_0x00b7
        L_0x00d8:
            return r3
        L_0x00d9:
            r3 = 1
            boolean r5 = r1.zzf     // Catch:{ Exception -> 0x0140 }
            if (r5 != 0) goto L_0x011c
            long r5 = r0.a()     // Catch:{ Exception -> 0x0140 }
            long r19 = r5 - r16
            int r14 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r14 < 0) goto L_0x00ed
            r21.zzv()     // Catch:{ Exception -> 0x0140 }
            r16 = r5
        L_0x00ed:
            long r5 = r5 - r7
            r19 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r12
            int r14 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r14 > 0) goto L_0x00fc
            r3 = r18
            r5 = 0
            r14 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0096
        L_0x00fc:
            java.lang.String r3 = "downloadTimeout"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011a }
            r0.<init>()     // Catch:{ Exception -> 0x011a }
            java.lang.String r5 = "Timeout exceeded. Limit: "
            r0.append(r5)     // Catch:{ Exception -> 0x011a }
            r0.append(r12)     // Catch:{ Exception -> 0x011a }
            java.lang.String r5 = " sec"
            r0.append(r5)     // Catch:{ Exception -> 0x011a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x011a }
            java.io.IOException r5 = new java.io.IOException     // Catch:{ Exception -> 0x011a }
            r5.<init>(r0)     // Catch:{ Exception -> 0x011a }
            throw r5     // Catch:{ Exception -> 0x011a }
        L_0x011a:
            r0 = move-exception
            goto L_0x014e
        L_0x011c:
            java.lang.String r3 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x011a }
            java.nio.ByteBuffer r5 = r1.zzi     // Catch:{ Exception -> 0x011a }
            int r5 = r5.limit()     // Catch:{ Exception -> 0x011a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011a }
            r6.<init>()     // Catch:{ Exception -> 0x011a }
            java.lang.String r7 = "Precache abort at "
            r6.append(r7)     // Catch:{ Exception -> 0x011a }
            r6.append(r5)     // Catch:{ Exception -> 0x011a }
            java.lang.String r5 = " bytes"
            r6.append(r5)     // Catch:{ Exception -> 0x011a }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x011a }
            r0.<init>(r5)     // Catch:{ Exception -> 0x011a }
            throw r0     // Catch:{ Exception -> 0x011a }
        L_0x0140:
            r0 = move-exception
            goto L_0x014c
        L_0x0142:
            r0 = move-exception
            goto L_0x0147
        L_0x0144:
            r0 = move-exception
            r18 = r3
        L_0x0147:
            monitor-exit(r14)     // Catch:{ all -> 0x0142 }
            throw r0     // Catch:{ Exception -> 0x0140 }
        L_0x0149:
            r0 = move-exception
            r18 = r3
        L_0x014c:
            r3 = r18
        L_0x014e:
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = ":"
            r6.append(r5)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to preload url "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = " Exception: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.google.android.gms.internal.ads.zzbza.zzj(r5)
            r1.zzg(r2, r4, r3, r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcda.zzt(java.lang.String):boolean");
    }
}
