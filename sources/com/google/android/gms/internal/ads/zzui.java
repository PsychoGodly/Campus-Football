package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzui implements zzabb {
    private boolean zzA;
    private boolean zzB;
    private zzqa zzC;
    private final zzuc zza;
    private final zzue zzb = new zzue();
    private final zzup zzc = new zzup(zzud.zza);
    private final zzpz zzd;
    private final zzpt zze;
    private zzuh zzf;
    private zzaf zzg;
    private int zzh = 1000;
    private int[] zzi = new int[1000];
    private long[] zzj = new long[1000];
    private int[] zzk = new int[1000];
    private int[] zzl = new int[1000];
    private long[] zzm = new long[1000];
    private zzaba[] zzn = new zzaba[1000];
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzv;
    private boolean zzw = true;
    private boolean zzx = true;
    private zzaf zzy;
    private zzaf zzz;

    protected zzui(zzwt zzwt, zzpz zzpz, zzpt zzpt, byte[] bArr) {
        this.zzd = zzpz;
        this.zze = zzpt;
        this.zza = new zzuc(zzwt, (byte[]) null);
    }

    private final int zzA(int i10) {
        int i11 = this.zzq + i10;
        int i12 = this.zzh;
        return i11 < i12 ? i11 : i11 - i12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
        return -3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized int zzB(com.google.android.gms.internal.ads.zzjo r6, com.google.android.gms.internal.ads.zzgr r7, boolean r8, boolean r9, com.google.android.gms.internal.ads.zzue r10) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r7.zzc = r0     // Catch:{ all -> 0x0083 }
            boolean r0 = r5.zzJ()     // Catch:{ all -> 0x0083 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x002b
            if (r9 != 0) goto L_0x0025
            boolean r9 = r5.zzv     // Catch:{ all -> 0x0083 }
            if (r9 == 0) goto L_0x0014
            goto L_0x0025
        L_0x0014:
            com.google.android.gms.internal.ads.zzaf r7 = r5.zzz     // Catch:{ all -> 0x0083 }
            if (r7 == 0) goto L_0x0023
            if (r8 != 0) goto L_0x001e
            com.google.android.gms.internal.ads.zzaf r8 = r5.zzg     // Catch:{ all -> 0x0083 }
            if (r7 == r8) goto L_0x0023
        L_0x001e:
            r5.zzG(r7, r6)     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r1
        L_0x0023:
            monitor-exit(r5)
            return r2
        L_0x0025:
            r6 = 4
            r7.zzc(r6)     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r3
        L_0x002b:
            com.google.android.gms.internal.ads.zzup r9 = r5.zzc     // Catch:{ all -> 0x0083 }
            int r0 = r5.zzp     // Catch:{ all -> 0x0083 }
            int r4 = r5.zzr     // Catch:{ all -> 0x0083 }
            int r0 = r0 + r4
            java.lang.Object r9 = r9.zza(r0)     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.zzug r9 = (com.google.android.gms.internal.ads.zzug) r9     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.zzaf r9 = r9.zza     // Catch:{ all -> 0x0083 }
            if (r8 != 0) goto L_0x007e
            com.google.android.gms.internal.ads.zzaf r8 = r5.zzg     // Catch:{ all -> 0x0083 }
            if (r9 == r8) goto L_0x0041
            goto L_0x007e
        L_0x0041:
            int r6 = r5.zzr     // Catch:{ all -> 0x0083 }
            int r6 = r5.zzA(r6)     // Catch:{ all -> 0x0083 }
            boolean r8 = r5.zzK(r6)     // Catch:{ all -> 0x0083 }
            if (r8 != 0) goto L_0x0052
            r6 = 1
            r7.zzc = r6     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r2
        L_0x0052:
            int[] r8 = r5.zzl     // Catch:{ all -> 0x0083 }
            r8 = r8[r6]     // Catch:{ all -> 0x0083 }
            r7.zzc(r8)     // Catch:{ all -> 0x0083 }
            long[] r8 = r5.zzm     // Catch:{ all -> 0x0083 }
            r0 = r8[r6]     // Catch:{ all -> 0x0083 }
            r7.zzd = r0     // Catch:{ all -> 0x0083 }
            long r8 = r5.zzs     // Catch:{ all -> 0x0083 }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x006a
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r7.zza(r8)     // Catch:{ all -> 0x0083 }
        L_0x006a:
            int[] r7 = r5.zzk     // Catch:{ all -> 0x0083 }
            r7 = r7[r6]     // Catch:{ all -> 0x0083 }
            r10.zza = r7     // Catch:{ all -> 0x0083 }
            long[] r7 = r5.zzj     // Catch:{ all -> 0x0083 }
            r8 = r7[r6]     // Catch:{ all -> 0x0083 }
            r10.zzb = r8     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.zzaba[] r7 = r5.zzn     // Catch:{ all -> 0x0083 }
            r6 = r7[r6]     // Catch:{ all -> 0x0083 }
            r10.zzc = r6     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r3
        L_0x007e:
            r5.zzG(r9, r6)     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r1
        L_0x0083:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzui.zzB(com.google.android.gms.internal.ads.zzjo, com.google.android.gms.internal.ads.zzgr, boolean, boolean, com.google.android.gms.internal.ads.zzue):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized long zzC(long r10, boolean r12, boolean r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r12 = r9.zzo     // Catch:{ all -> 0x002f }
            r0 = -1
            if (r12 == 0) goto L_0x002d
            long[] r2 = r9.zzm     // Catch:{ all -> 0x002f }
            int r4 = r9.zzq     // Catch:{ all -> 0x002f }
            r5 = r2[r4]     // Catch:{ all -> 0x002f }
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0012
            goto L_0x002d
        L_0x0012:
            if (r13 == 0) goto L_0x001a
            int r13 = r9.zzr     // Catch:{ all -> 0x002f }
            if (r13 == r12) goto L_0x001a
            int r12 = r13 + 1
        L_0x001a:
            r5 = r12
            r8 = 0
            r3 = r9
            r6 = r10
            int r10 = r3.zzz(r4, r5, r6, r8)     // Catch:{ all -> 0x002f }
            r11 = -1
            if (r10 != r11) goto L_0x0027
            monitor-exit(r9)
            return r0
        L_0x0027:
            long r10 = r9.zzE(r10)     // Catch:{ all -> 0x002f }
            monitor-exit(r9)
            return r10
        L_0x002d:
            monitor-exit(r9)
            return r0
        L_0x002f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzui.zzC(long, boolean, boolean):long");
    }

    private final synchronized long zzD() {
        int i10 = this.zzo;
        if (i10 == 0) {
            return -1;
        }
        return zzE(i10);
    }

    private final long zzE(int i10) {
        long j10 = this.zzt;
        long j11 = Long.MIN_VALUE;
        if (i10 != 0) {
            int zzA2 = zzA(i10 - 1);
            for (int i11 = 0; i11 < i10; i11++) {
                j11 = Math.max(j11, this.zzm[zzA2]);
                if ((this.zzl[zzA2] & 1) != 0) {
                    break;
                }
                zzA2--;
                if (zzA2 == -1) {
                    zzA2 = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j10, j11);
        this.zzo -= i10;
        int i12 = this.zzp + i10;
        this.zzp = i12;
        int i13 = this.zzq + i10;
        this.zzq = i13;
        int i14 = this.zzh;
        if (i13 >= i14) {
            this.zzq = i13 - i14;
        }
        int i15 = this.zzr - i10;
        this.zzr = i15;
        if (i15 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i12);
        if (this.zzo != 0) {
            return this.zzj[this.zzq];
        }
        int i16 = this.zzq;
        if (i16 == 0) {
            i16 = this.zzh;
        }
        int i17 = i16 - 1;
        return this.zzj[i17] + ((long) this.zzk[i17]);
    }

    private final synchronized void zzF(long j10, int i10, long j11, int i11, zzaba zzaba) {
        int i12 = this.zzo;
        if (i12 > 0) {
            int zzA2 = zzA(i12 - 1);
            zzdl.zzd(this.zzj[zzA2] + ((long) this.zzk[zzA2]) <= j11);
        }
        this.zzv = (536870912 & i10) != 0;
        this.zzu = Math.max(this.zzu, j10);
        int zzA3 = zzA(this.zzo);
        this.zzm[zzA3] = j10;
        this.zzj[zzA3] = j11;
        this.zzk[zzA3] = i11;
        this.zzl[zzA3] = i10;
        this.zzn[zzA3] = zzaba;
        this.zzi[zzA3] = 0;
        if (this.zzc.zzf() || !((zzug) this.zzc.zzb()).zza.equals(this.zzz)) {
            zzpy zzpy = zzpy.zzb;
            zzup zzup = this.zzc;
            int i13 = this.zzp + this.zzo;
            zzaf zzaf = this.zzz;
            Objects.requireNonNull(zzaf);
            zzup.zzc(i13, new zzug(zzaf, zzpy, (zzuf) null));
        }
        int i14 = this.zzo + 1;
        this.zzo = i14;
        int i15 = this.zzh;
        if (i14 == i15) {
            int i16 = i15 + 1000;
            int[] iArr = new int[i16];
            long[] jArr = new long[i16];
            long[] jArr2 = new long[i16];
            int[] iArr2 = new int[i16];
            int[] iArr3 = new int[i16];
            zzaba[] zzabaArr = new zzaba[i16];
            int i17 = this.zzq;
            int i18 = i15 - i17;
            System.arraycopy(this.zzj, i17, jArr, 0, i18);
            System.arraycopy(this.zzm, this.zzq, jArr2, 0, i18);
            System.arraycopy(this.zzl, this.zzq, iArr2, 0, i18);
            System.arraycopy(this.zzk, this.zzq, iArr3, 0, i18);
            System.arraycopy(this.zzn, this.zzq, zzabaArr, 0, i18);
            System.arraycopy(this.zzi, this.zzq, iArr, 0, i18);
            int i19 = this.zzq;
            System.arraycopy(this.zzj, 0, jArr, i18, i19);
            System.arraycopy(this.zzm, 0, jArr2, i18, i19);
            System.arraycopy(this.zzl, 0, iArr2, i18, i19);
            System.arraycopy(this.zzk, 0, iArr3, i18, i19);
            System.arraycopy(this.zzn, 0, zzabaArr, i18, i19);
            System.arraycopy(this.zzi, 0, iArr, i18, i19);
            this.zzj = jArr;
            this.zzm = jArr2;
            this.zzl = iArr2;
            this.zzk = iArr3;
            this.zzn = zzabaArr;
            this.zzi = iArr;
            this.zzq = 0;
            this.zzh = i16;
        }
    }

    private final void zzG(zzaf zzaf, zzjo zzjo) {
        zzx zzx2;
        zzaf zzaf2 = this.zzg;
        boolean z10 = zzaf2 == null;
        zzqa zzqa = null;
        if (z10) {
            zzx2 = null;
        } else {
            zzx2 = zzaf2.zzp;
        }
        this.zzg = zzaf;
        zzx zzx3 = zzaf.zzp;
        zzjo.zza = zzaf.zzc(this.zzd.zza(zzaf));
        zzjo.zzb = this.zzC;
        if (z10 || !zzew.zzU(zzx2, zzx3)) {
            if (zzaf.zzp != null) {
                zzqa = new zzqa(new zzpr(new zzqc(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
            }
            this.zzC = zzqa;
            zzjo.zzb = zzqa;
        }
    }

    private final void zzH() {
        if (this.zzC != null) {
            this.zzC = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzI() {
        this.zzr = 0;
        this.zza.zzg();
    }

    private final boolean zzJ() {
        return this.zzr != this.zzo;
    }

    private final boolean zzK(int i10) {
        if (this.zzC != null) {
            return (this.zzl[i10] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzL(zzaf zzaf) {
        this.zzx = false;
        if (zzew.zzU(zzaf, this.zzz)) {
            return false;
        }
        if (this.zzc.zzf() || !((zzug) this.zzc.zzb()).zza.equals(zzaf)) {
            this.zzz = zzaf;
        } else {
            this.zzz = ((zzug) this.zzc.zzb()).zza;
        }
        zzaf zzaf2 = this.zzz;
        this.zzA = zzbt.zzf(zzaf2.zzm, zzaf2.zzj);
        this.zzB = false;
        return true;
    }

    static /* synthetic */ void zzl(zzug zzug) {
        zzpy zzpy = zzug.zzb;
        int i10 = zzpx.zza;
    }

    private final int zzz(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = (this.zzm[i10] > j10 ? 1 : (this.zzm[i10] == j10 ? 0 : -1));
            if (i14 > 0) {
                break;
            }
            if (!z10 || (this.zzl[i10] & 1) != 0) {
                i12 = i13;
                if (i14 == 0) {
                    break;
                }
            }
            i10++;
            if (i10 == this.zzh) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final int zza() {
        return this.zzp + this.zzr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r9 != -1) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int zzb(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.zzr     // Catch:{ all -> 0x0038 }
            int r2 = r8.zzA(r0)     // Catch:{ all -> 0x0038 }
            boolean r1 = r8.zzJ()     // Catch:{ all -> 0x0038 }
            r7 = 0
            if (r1 == 0) goto L_0x0036
            long[] r1 = r8.zzm     // Catch:{ all -> 0x0038 }
            r3 = r1[r2]     // Catch:{ all -> 0x0038 }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0017
            goto L_0x0036
        L_0x0017:
            long r3 = r8.zzu     // Catch:{ all -> 0x0038 }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0025
            if (r11 != 0) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            int r9 = r8.zzo     // Catch:{ all -> 0x0038 }
            int r9 = r9 - r0
            monitor-exit(r8)
            return r9
        L_0x0025:
            int r11 = r8.zzo     // Catch:{ all -> 0x0038 }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.zzz(r2, r3, r4, r6)     // Catch:{ all -> 0x0038 }
            r10 = -1
            monitor-exit(r8)
            if (r9 != r10) goto L_0x0035
            return r7
        L_0x0035:
            return r9
        L_0x0036:
            monitor-exit(r8)
            return r7
        L_0x0038:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzui.zzb(long, boolean):int");
    }

    public final int zzc() {
        return this.zzp + this.zzo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r9 != 0) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzd(com.google.android.gms.internal.ads.zzjo r9, com.google.android.gms.internal.ads.zzgr r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L_0x0007
            r5 = 1
            goto L_0x0009
        L_0x0007:
            r0 = 0
            r5 = 0
        L_0x0009:
            com.google.android.gms.internal.ads.zzue r7 = r8.zzb
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.zzB(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L_0x003e
            boolean r9 = r10.zzg()
            if (r9 != 0) goto L_0x003d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L_0x0034
            if (r9 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.zzuc r9 = r8.zza
            com.google.android.gms.internal.ads.zzue r11 = r8.zzb
            r9.zzd(r10, r11)
            goto L_0x003d
        L_0x002c:
            com.google.android.gms.internal.ads.zzuc r9 = r8.zza
            com.google.android.gms.internal.ads.zzue r11 = r8.zzb
            r9.zze(r10, r11)
            goto L_0x0037
        L_0x0034:
            if (r9 == 0) goto L_0x0037
            goto L_0x003d
        L_0x0037:
            int r9 = r8.zzr
            int r9 = r9 + r1
            r8.zzr = r9
            return r12
        L_0x003d:
            r9 = -4
        L_0x003e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzui.zzd(com.google.android.gms.internal.ads.zzjo, com.google.android.gms.internal.ads.zzgr, int, boolean):int");
    }

    public final /* synthetic */ int zze(zzr zzr2, int i10, boolean z10) {
        return zzaaz.zza(this, zzr2, i10, z10);
    }

    public final int zzf(zzr zzr2, int i10, boolean z10, int i11) throws IOException {
        return this.zza.zza(zzr2, i10, z10);
    }

    public final synchronized long zzg() {
        return this.zzu;
    }

    public final synchronized zzaf zzh() {
        if (this.zzx) {
            return null;
        }
        return this.zzz;
    }

    public final void zzi(long j10, boolean z10, boolean z11) {
        this.zza.zzc(zzC(j10, false, z11));
    }

    public final void zzj() {
        this.zza.zzc(zzD());
    }

    public final void zzk(zzaf zzaf) {
        this.zzy = zzaf;
        boolean zzL = zzL(zzaf);
        zzuh zzuh = this.zzf;
        if (zzuh != null && zzL) {
            zzuh.zzL(zzaf);
        }
    }

    public final void zzm() throws IOException {
        zzqa zzqa = this.zzC;
        if (zzqa != null) {
            throw zzqa.zza();
        }
    }

    public final void zzn() {
        zzj();
        zzH();
    }

    public final void zzo() {
        zzp(true);
        zzH();
    }

    public final void zzp(boolean z10) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = false;
        this.zzc.zzd();
        if (z10) {
            this.zzy = null;
            this.zzz = null;
            this.zzx = true;
        }
    }

    public final /* synthetic */ void zzq(zzen zzen, int i10) {
        zzaaz.zzb(this, zzen, i10);
    }

    public final void zzr(zzen zzen, int i10, int i11) {
        this.zza.zzh(zzen, i10);
    }

    public final void zzs(long j10, int i10, int i11, int i12, zzaba zzaba) {
        if (this.zzw) {
            if ((i10 & 1) != 0) {
                this.zzw = false;
            } else {
                return;
            }
        }
        if (this.zzA) {
            if (j10 >= this.zzs) {
                if ((i10 & 1) == 0) {
                    if (!this.zzB) {
                        zzee.zze("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzz)));
                        this.zzB = true;
                    }
                    i10 |= 1;
                }
            } else {
                return;
            }
        }
        zzF(j10, i10, (this.zza.zzb() - ((long) i11)) - ((long) i12), i11, zzaba);
    }

    public final void zzt(long j10) {
        this.zzs = j10;
    }

    public final void zzu(zzuh zzuh) {
        this.zzf = zzuh;
    }

    public final synchronized void zzv(int i10) {
        boolean z10 = false;
        if (i10 >= 0) {
            try {
                if (this.zzr + i10 <= this.zzo) {
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzdl.zzd(z10);
        this.zzr += i10;
    }

    public final synchronized boolean zzw() {
        return this.zzv;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzx(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzJ()     // Catch:{ all -> 0x003e }
            r1 = 1
            if (r0 != 0) goto L_0x001d
            r0 = 0
            if (r4 != 0) goto L_0x001b
            boolean r4 = r3.zzv     // Catch:{ all -> 0x003e }
            if (r4 != 0) goto L_0x001b
            com.google.android.gms.internal.ads.zzaf r4 = r3.zzz     // Catch:{ all -> 0x003e }
            if (r4 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.zzaf r2 = r3.zzg     // Catch:{ all -> 0x003e }
            if (r4 == r2) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            monitor-exit(r3)
            return r0
        L_0x001a:
            r1 = 0
        L_0x001b:
            monitor-exit(r3)
            return r1
        L_0x001d:
            com.google.android.gms.internal.ads.zzup r4 = r3.zzc     // Catch:{ all -> 0x003e }
            int r0 = r3.zzp     // Catch:{ all -> 0x003e }
            int r2 = r3.zzr     // Catch:{ all -> 0x003e }
            int r0 = r0 + r2
            java.lang.Object r4 = r4.zza(r0)     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.zzug r4 = (com.google.android.gms.internal.ads.zzug) r4     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.zzaf r4 = r4.zza     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.zzaf r0 = r3.zzg     // Catch:{ all -> 0x003e }
            if (r4 == r0) goto L_0x0032
            monitor-exit(r3)
            return r1
        L_0x0032:
            int r4 = r3.zzr     // Catch:{ all -> 0x003e }
            int r4 = r3.zzA(r4)     // Catch:{ all -> 0x003e }
            boolean r4 = r3.zzK(r4)     // Catch:{ all -> 0x003e }
            monitor-exit(r3)
            return r4
        L_0x003e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzui.zzx(boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzy(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.zzI()     // Catch:{ all -> 0x003d }
            int r0 = r8.zzr     // Catch:{ all -> 0x003d }
            int r2 = r8.zzA(r0)     // Catch:{ all -> 0x003d }
            boolean r1 = r8.zzJ()     // Catch:{ all -> 0x003d }
            r7 = 0
            if (r1 == 0) goto L_0x003b
            long[] r1 = r8.zzm     // Catch:{ all -> 0x003d }
            r3 = r1[r2]     // Catch:{ all -> 0x003d }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x003b
            long r3 = r8.zzu     // Catch:{ all -> 0x003d }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0021
            if (r11 == 0) goto L_0x003b
        L_0x0021:
            int r11 = r8.zzo     // Catch:{ all -> 0x003d }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r11 = r1.zzz(r2, r3, r4, r6)     // Catch:{ all -> 0x003d }
            r0 = -1
            if (r11 != r0) goto L_0x0031
            monitor-exit(r8)
            return r7
        L_0x0031:
            r8.zzs = r9     // Catch:{ all -> 0x003d }
            int r9 = r8.zzr     // Catch:{ all -> 0x003d }
            int r9 = r9 + r11
            r8.zzr = r9     // Catch:{ all -> 0x003d }
            r9 = 1
            monitor-exit(r8)
            return r9
        L_0x003b:
            monitor-exit(r8)
            return r7
        L_0x003d:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzui.zzy(long, boolean):boolean");
    }
}
