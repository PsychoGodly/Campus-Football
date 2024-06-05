package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zztq implements zzxc, zzsh {
    final /* synthetic */ zztv zza;
    /* access modifiers changed from: private */
    public final long zzb = zzsj.zza();
    private final Uri zzc;
    /* access modifiers changed from: private */
    public final zzgh zzd;
    private final zztl zze;
    private final zzzx zzf;
    private final zzdo zzg;
    private final zzaau zzh = new zzaau();
    private volatile boolean zzi;
    private boolean zzj = true;
    /* access modifiers changed from: private */
    public long zzk;
    /* access modifiers changed from: private */
    public zzfl zzl = zzi(0);
    private zzabb zzm;
    private boolean zzn;

    public zztq(zztv zztv, Uri uri, zzfg zzfg, zztl zztl, zzzx zzzx, zzdo zzdo) {
        this.zza = zztv;
        this.zzc = uri;
        this.zzd = new zzgh(zzfg);
        this.zze = zztl;
        this.zzf = zzzx;
        this.zzg = zzdo;
    }

    static /* bridge */ /* synthetic */ void zzf(zztq zztq, long j10, long j11) {
        zztq.zzh.zza = j10;
        zztq.zzk = j11;
        zztq.zzj = true;
        zztq.zzn = false;
    }

    private final zzfl zzi(long j10) {
        zzfj zzfj = new zzfj();
        zzfj.zzd(this.zzc);
        zzfj.zzc(j10);
        zzfj.zza(6);
        zzfj.zzb(zztv.zzb);
        return zzfj.zze();
    }

    public final void zza(zzen zzen) {
        long j10;
        if (!this.zzn) {
            j10 = this.zzk;
        } else {
            j10 = Math.max(this.zza.zzQ(true), this.zzk);
        }
        int zza2 = zzen.zza();
        zzabb zzabb = this.zzm;
        Objects.requireNonNull(zzabb);
        zzaaz.zzb(zzabb, zzen, zza2);
        zzabb.zzs(j10, 1, zza2, 0, (zzaba) null);
        this.zzn = true;
    }

    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:50|51|54|55|(0)|59|(0)(0)|65|(0)|68|(0)(0)|76|(2:(0)(0)|113)|(0)(0)|100|(0)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x0104 */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x020b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01c9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082 A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098 A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a2 A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ae A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b8 A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c4 A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d4 A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e0 A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0116 A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0132 A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014e A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x016a A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0173 A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0186 A[SYNTHETIC, Splitter:B:78:0x0186] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzh() throws java.io.IOException {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r0 = "Invalid metadata interval: "
        L_0x0004:
            boolean r2 = r1.zzi
            if (r2 != 0) goto L_0x020b
            r2 = -1
            r5 = 0
            com.google.android.gms.internal.ads.zzaau r6 = r1.zzh     // Catch:{ all -> 0x01eb }
            long r13 = r6.zza     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzfl r6 = r1.zzi(r13)     // Catch:{ all -> 0x01eb }
            r1.zzl = r6     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzgh r7 = r1.zzd     // Catch:{ all -> 0x01eb }
            long r6 = r7.zzb(r6)     // Catch:{ all -> 0x01eb }
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x0025
            long r6 = r6 + r13
            com.google.android.gms.internal.ads.zztv r8 = r1.zza     // Catch:{ all -> 0x01eb }
            r8.zzp.post(new com.google.android.gms.internal.ads.zzto(r8))     // Catch:{ all -> 0x01eb }
        L_0x0025:
            r15 = r6
            com.google.android.gms.internal.ads.zztv r6 = r1.zza     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzgh r7 = r1.zzd     // Catch:{ all -> 0x01eb }
            java.util.Map r7 = r7.zze()     // Catch:{ all -> 0x01eb }
            java.lang.String r8 = "icy-br"
            java.lang.Object r8 = r7.get(r8)     // Catch:{ all -> 0x01eb }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x01eb }
            java.lang.String r9 = "IcyHeaders"
            r10 = -1
            if (r8 == 0) goto L_0x0074
            java.lang.Object r8 = r8.get(r5)     // Catch:{ all -> 0x01eb }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01eb }
            int r11 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0062 }
            int r11 = r11 * 1000
            if (r11 <= 0) goto L_0x004d
            r18 = r11
            r2 = 1
            goto L_0x0077
        L_0x004d:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0063 }
            r12.<init>()     // Catch:{ NumberFormatException -> 0x0063 }
            java.lang.String r2 = "Invalid bitrate: "
            r12.append(r2)     // Catch:{ NumberFormatException -> 0x0063 }
            r12.append(r8)     // Catch:{ NumberFormatException -> 0x0063 }
            java.lang.String r2 = r12.toString()     // Catch:{ NumberFormatException -> 0x0063 }
            com.google.android.gms.internal.ads.zzee.zze(r9, r2)     // Catch:{ NumberFormatException -> 0x0063 }
            goto L_0x0074
        L_0x0062:
            r11 = -1
        L_0x0063:
            java.lang.String r2 = "Invalid bitrate header: "
            java.lang.String r3 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x01eb }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzee.zze(r9, r2)     // Catch:{ all -> 0x01eb }
            r18 = r11
            r2 = 0
            goto L_0x0077
        L_0x0074:
            r2 = 0
            r18 = -1
        L_0x0077:
            java.lang.String r3 = "icy-genre"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01eb }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01eb }
            r8 = 0
            if (r3 == 0) goto L_0x008c
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x01eb }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01eb }
            r19 = r2
            r2 = 1
            goto L_0x008e
        L_0x008c:
            r19 = r8
        L_0x008e:
            java.lang.String r3 = "icy-name"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01eb }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01eb }
            if (r3 == 0) goto L_0x00a2
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x01eb }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01eb }
            r20 = r2
            r2 = 1
            goto L_0x00a4
        L_0x00a2:
            r20 = r8
        L_0x00a4:
            java.lang.String r3 = "icy-url"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01eb }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01eb }
            if (r3 == 0) goto L_0x00b8
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x01eb }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01eb }
            r21 = r2
            r2 = 1
            goto L_0x00ba
        L_0x00b8:
            r21 = r8
        L_0x00ba:
            java.lang.String r3 = "icy-pub"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01eb }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01eb }
            if (r3 == 0) goto L_0x00d4
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x01eb }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01eb }
            java.lang.String r3 = "1"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x01eb }
            r22 = r2
            r2 = 1
            goto L_0x00d6
        L_0x00d4:
            r22 = 0
        L_0x00d6:
            java.lang.String r3 = "icy-metaint"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x01eb }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01eb }
            if (r3 == 0) goto L_0x0112
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x01eb }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x01eb }
            int r7 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0103 }
            if (r7 <= 0) goto L_0x00f0
            r23 = r7
            r2 = 1
            goto L_0x0114
        L_0x00f0:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0104 }
            r11.<init>()     // Catch:{ NumberFormatException -> 0x0104 }
            r11.append(r0)     // Catch:{ NumberFormatException -> 0x0104 }
            r11.append(r3)     // Catch:{ NumberFormatException -> 0x0104 }
            java.lang.String r11 = r11.toString()     // Catch:{ NumberFormatException -> 0x0104 }
            com.google.android.gms.internal.ads.zzee.zze(r9, r11)     // Catch:{ NumberFormatException -> 0x0104 }
            goto L_0x0112
        L_0x0103:
            r7 = -1
        L_0x0104:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x01eb }
            java.lang.String r3 = r0.concat(r3)     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzee.zze(r9, r3)     // Catch:{ all -> 0x01eb }
            r23 = r7
            goto L_0x0114
        L_0x0112:
            r23 = -1
        L_0x0114:
            if (r2 == 0) goto L_0x011d
            com.google.android.gms.internal.ads.zzacy r8 = new com.google.android.gms.internal.ads.zzacy     // Catch:{ all -> 0x01eb }
            r17 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x01eb }
        L_0x011d:
            r6.zzr = r8     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzgh r2 = r1.zzd     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zztv r3 = r1.zza     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzacy r6 = r3.zzr     // Catch:{ all -> 0x01eb }
            if (r6 == 0) goto L_0x014e
            com.google.android.gms.internal.ads.zzacy r6 = r3.zzr     // Catch:{ all -> 0x01eb }
            int r6 = r6.zzf     // Catch:{ all -> 0x01eb }
            if (r6 == r10) goto L_0x014e
            com.google.android.gms.internal.ads.zzsi r6 = new com.google.android.gms.internal.ads.zzsi     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzacy r3 = r3.zzr     // Catch:{ all -> 0x01eb }
            int r3 = r3.zzf     // Catch:{ all -> 0x01eb }
            r6.<init>(r2, r3, r1)     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zztv r2 = r1.zza     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzabb r2 = r2.zzu()     // Catch:{ all -> 0x01eb }
            r1.zzm = r2     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzaf r3 = com.google.android.gms.internal.ads.zztv.zzc     // Catch:{ all -> 0x01eb }
            r2.zzk(r3)     // Catch:{ all -> 0x01eb }
            r8 = r6
            goto L_0x014f
        L_0x014e:
            r8 = r2
        L_0x014f:
            com.google.android.gms.internal.ads.zztl r7 = r1.zze     // Catch:{ all -> 0x01eb }
            android.net.Uri r9 = r1.zzc     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzgh r2 = r1.zzd     // Catch:{ all -> 0x01eb }
            java.util.Map r10 = r2.zze()     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzzx r2 = r1.zzf     // Catch:{ all -> 0x01eb }
            r11 = r13
            r4 = r13
            r13 = r15
            r15 = r2
            r7.zzd(r8, r9, r10, r11, r13, r15)     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zztv r2 = r1.zza     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzacy r2 = r2.zzr     // Catch:{ all -> 0x01eb }
            if (r2 == 0) goto L_0x016f
            com.google.android.gms.internal.ads.zztl r2 = r1.zze     // Catch:{ all -> 0x01eb }
            r2.zzc()     // Catch:{ all -> 0x01eb }
        L_0x016f:
            boolean r2 = r1.zzj     // Catch:{ all -> 0x01eb }
            if (r2 == 0) goto L_0x0181
            com.google.android.gms.internal.ads.zztl r2 = r1.zze     // Catch:{ all -> 0x01eb }
            long r7 = r1.zzk     // Catch:{ all -> 0x01eb }
            r2.zzf(r4, r7)     // Catch:{ all -> 0x01eb }
            r2 = 0
            r1.zzj = r2     // Catch:{ all -> 0x017e }
            goto L_0x0182
        L_0x017e:
            r0 = move-exception
            goto L_0x01ed
        L_0x0181:
            r2 = 0
        L_0x0182:
            r13 = r4
            r4 = 0
        L_0x0184:
            if (r4 != 0) goto L_0x01c9
            boolean r5 = r1.zzi     // Catch:{ all -> 0x01c5 }
            if (r5 != 0) goto L_0x01c2
            com.google.android.gms.internal.ads.zzdo r5 = r1.zzg     // Catch:{ InterruptedException -> 0x01bc }
            r5.zza()     // Catch:{ InterruptedException -> 0x01bc }
            com.google.android.gms.internal.ads.zztl r5 = r1.zze     // Catch:{ all -> 0x01c5 }
            com.google.android.gms.internal.ads.zzaau r6 = r1.zzh     // Catch:{ all -> 0x01c5 }
            int r4 = r5.zza(r6)     // Catch:{ all -> 0x01c5 }
            com.google.android.gms.internal.ads.zztl r5 = r1.zze     // Catch:{ all -> 0x01c5 }
            long r5 = r5.zzb()     // Catch:{ all -> 0x01c5 }
            com.google.android.gms.internal.ads.zztv r7 = r1.zza     // Catch:{ all -> 0x01c5 }
            long r7 = r7.zzj     // Catch:{ all -> 0x01c5 }
            long r7 = r7 + r13
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0184
            com.google.android.gms.internal.ads.zzdo r7 = r1.zzg     // Catch:{ all -> 0x01c5 }
            r7.zzc()     // Catch:{ all -> 0x01c5 }
            com.google.android.gms.internal.ads.zztv r7 = r1.zza     // Catch:{ all -> 0x01c5 }
            android.os.Handler r8 = r7.zzp     // Catch:{ all -> 0x01c5 }
            java.lang.Runnable r7 = r7.zzo     // Catch:{ all -> 0x01c5 }
            r8.post(r7)     // Catch:{ all -> 0x01c5 }
            r13 = r5
            goto L_0x0184
        L_0x01bc:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x01c5 }
            r0.<init>()     // Catch:{ all -> 0x01c5 }
            throw r0     // Catch:{ all -> 0x01c5 }
        L_0x01c2:
            r3 = 1
            r4 = 0
            goto L_0x01ca
        L_0x01c5:
            r0 = move-exception
            r5 = r4
            r2 = 1
            goto L_0x01ef
        L_0x01c9:
            r3 = 1
        L_0x01ca:
            if (r4 != r3) goto L_0x01ce
            r5 = 0
            goto L_0x01e3
        L_0x01ce:
            com.google.android.gms.internal.ads.zztl r2 = r1.zze
            long r5 = r2.zzb()
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x01e2
            com.google.android.gms.internal.ads.zzaau r3 = r1.zzh
            long r5 = r2.zzb()
            r3.zza = r5
        L_0x01e2:
            r5 = r4
        L_0x01e3:
            com.google.android.gms.internal.ads.zzgh r2 = r1.zzd
            com.google.android.gms.internal.ads.zzfi.zza(r2)
            if (r5 == 0) goto L_0x0004
            goto L_0x020b
        L_0x01eb:
            r0 = move-exception
            r2 = 0
        L_0x01ed:
            r2 = 1
            r5 = 0
        L_0x01ef:
            if (r5 == r2) goto L_0x0205
            com.google.android.gms.internal.ads.zztl r2 = r1.zze
            long r3 = r2.zzb()
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0205
            com.google.android.gms.internal.ads.zzaau r3 = r1.zzh
            long r4 = r2.zzb()
            r3.zza = r4
        L_0x0205:
            com.google.android.gms.internal.ads.zzgh r2 = r1.zzd
            com.google.android.gms.internal.ads.zzfi.zza(r2)
            throw r0
        L_0x020b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztq.zzh():void");
    }
}
