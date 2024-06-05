package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaiv implements zzzu {
    public static final zzaab zza = zzais.zza;
    /* access modifiers changed from: private */
    public final List zzb;
    private final zzen zzc;
    private final SparseIntArray zzd;
    /* access modifiers changed from: private */
    public final zzaiy zze;
    /* access modifiers changed from: private */
    public final SparseArray zzf;
    /* access modifiers changed from: private */
    public final SparseBooleanArray zzg;
    /* access modifiers changed from: private */
    public final SparseBooleanArray zzh;
    private final zzair zzi;
    private zzaiq zzj;
    /* access modifiers changed from: private */
    public zzzx zzk;
    /* access modifiers changed from: private */
    public int zzl;
    /* access modifiers changed from: private */
    public boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    /* access modifiers changed from: private */
    public int zzq;

    public zzaiv() {
        this(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0194, code lost:
        if (r1 == false) goto L_0x0196;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(com.google.android.gms.internal.ads.zzzv r19, com.google.android.gms.internal.ads.zzaau r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            long r11 = r19.zzd()
            boolean r3 = r0.zzm
            r13 = -1
            r15 = 1
            r10 = 0
            if (r3 == 0) goto L_0x009e
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.zzair r3 = r0.zzi
            boolean r4 = r3.zzd()
            if (r4 == 0) goto L_0x001f
            goto L_0x0026
        L_0x001f:
            int r4 = r0.zzq
            int r1 = r3.zza(r1, r2, r4)
            return r1
        L_0x0026:
            boolean r3 = r0.zzn
            r7 = 0
            if (r3 != 0) goto L_0x0075
            r0.zzn = r15
            com.google.android.gms.internal.ads.zzair r3 = r0.zzi
            long r4 = r3.zzb()
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r6 == 0) goto L_0x0065
            com.google.android.gms.internal.ads.zzaiq r9 = new com.google.android.gms.internal.ads.zzaiq
            com.google.android.gms.internal.ads.zzeu r4 = r3.zzc()
            long r5 = r3.zzb()
            int r3 = r0.zzq
            r16 = 112800(0x1b8a0, float:1.58066E-40)
            r17 = r3
            r3 = r9
            r13 = r7
            r7 = r11
            r15 = r9
            r9 = r17
            r10 = r16
            r3.<init>(r4, r5, r7, r9, r10)
            r0.zzj = r15
            com.google.android.gms.internal.ads.zzzx r3 = r0.zzk
            com.google.android.gms.internal.ads.zzaax r4 = r15.zzb()
            r3.zzN(r4)
            goto L_0x0076
        L_0x0065:
            r13 = r7
            com.google.android.gms.internal.ads.zzzx r4 = r0.zzk
            com.google.android.gms.internal.ads.zzaaw r5 = new com.google.android.gms.internal.ads.zzaaw
            long r6 = r3.zzb()
            r5.<init>(r6, r13)
            r4.zzN(r5)
            goto L_0x0076
        L_0x0075:
            r13 = r7
        L_0x0076:
            boolean r3 = r0.zzo
            if (r3 == 0) goto L_0x008d
            r3 = 0
            r0.zzo = r3
            r0.zzc(r13, r13)
            long r4 = r19.zzf()
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x0089
            goto L_0x008e
        L_0x0089:
            r2.zza = r13
            r1 = 1
            return r1
        L_0x008d:
            r3 = 0
        L_0x008e:
            com.google.android.gms.internal.ads.zzaiq r4 = r0.zzj
            if (r4 == 0) goto L_0x009f
            boolean r5 = r4.zze()
            if (r5 != 0) goto L_0x0099
            goto L_0x009f
        L_0x0099:
            int r1 = r4.zza(r1, r2)
            return r1
        L_0x009e:
            r3 = 0
        L_0x009f:
            com.google.android.gms.internal.ads.zzen r2 = r0.zzc
            byte[] r4 = r2.zzH()
            int r5 = r2.zzc()
            int r5 = 9400 - r5
            r6 = 188(0xbc, float:2.63E-43)
            if (r5 < r6) goto L_0x00b0
            goto L_0x00c2
        L_0x00b0:
            int r5 = r2.zza()
            if (r5 <= 0) goto L_0x00bd
            int r2 = r2.zzc()
            java.lang.System.arraycopy(r4, r2, r4, r3, r5)
        L_0x00bd:
            com.google.android.gms.internal.ads.zzen r2 = r0.zzc
            r2.zzD(r4, r5)
        L_0x00c2:
            com.google.android.gms.internal.ads.zzen r2 = r0.zzc
            int r5 = r2.zza()
            r7 = -1
            if (r5 >= r6) goto L_0x00df
            int r2 = r2.zzd()
            int r5 = 9400 - r2
            int r5 = r1.zza(r4, r2, r5)
            if (r5 != r7) goto L_0x00d8
            return r7
        L_0x00d8:
            com.google.android.gms.internal.ads.zzen r7 = r0.zzc
            int r2 = r2 + r5
            r7.zzE(r2)
            goto L_0x00c2
        L_0x00df:
            int r1 = r2.zzc()
            int r4 = r2.zzd()
            byte[] r2 = r2.zzH()
            int r2 = com.google.android.gms.internal.ads.zzajb.zza(r2, r1, r4)
            com.google.android.gms.internal.ads.zzen r5 = r0.zzc
            r5.zzF(r2)
            int r5 = r2 + 188
            if (r5 <= r4) goto L_0x00ff
            int r4 = r0.zzp
            int r2 = r2 - r1
            int r4 = r4 + r2
            r0.zzp = r4
            goto L_0x0101
        L_0x00ff:
            r0.zzp = r3
        L_0x0101:
            com.google.android.gms.internal.ads.zzen r1 = r0.zzc
            int r2 = r1.zzd()
            if (r5 <= r2) goto L_0x010a
            return r3
        L_0x010a:
            int r1 = r1.zze()
            r4 = 8388608(0x800000, float:1.17549435E-38)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x0119
            com.google.android.gms.internal.ads.zzen r1 = r0.zzc
            r1.zzF(r5)
            return r3
        L_0x0119:
            r4 = 4194304(0x400000, float:5.877472E-39)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x0120
            r10 = 1
            goto L_0x0121
        L_0x0120:
            r10 = 0
        L_0x0121:
            int r4 = r1 >> 8
            r6 = r1 & 32
            r8 = r1 & 16
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            if (r8 == 0) goto L_0x0134
            android.util.SparseArray r8 = r0.zzf
            java.lang.Object r8 = r8.get(r4)
            com.google.android.gms.internal.ads.zzaja r8 = (com.google.android.gms.internal.ads.zzaja) r8
            goto L_0x0135
        L_0x0134:
            r8 = 0
        L_0x0135:
            if (r8 != 0) goto L_0x013d
            com.google.android.gms.internal.ads.zzen r1 = r0.zzc
            r1.zzF(r5)
            return r3
        L_0x013d:
            r1 = r1 & 15
            android.util.SparseIntArray r9 = r0.zzd
            int r13 = r1 + -1
            int r9 = r9.get(r4, r13)
            android.util.SparseIntArray r13 = r0.zzd
            r13.put(r4, r1)
            if (r9 != r1) goto L_0x0154
            com.google.android.gms.internal.ads.zzen r1 = r0.zzc
            r1.zzF(r5)
            return r3
        L_0x0154:
            r13 = 1
            int r9 = r9 + r13
            r9 = r9 & 15
            if (r1 == r9) goto L_0x015d
            r8.zzc()
        L_0x015d:
            if (r6 == 0) goto L_0x0179
            com.google.android.gms.internal.ads.zzen r1 = r0.zzc
            int r1 = r1.zzk()
            com.google.android.gms.internal.ads.zzen r6 = r0.zzc
            int r6 = r6.zzk()
            r6 = r6 & 64
            if (r6 == 0) goto L_0x0171
            r6 = 2
            goto L_0x0172
        L_0x0171:
            r6 = 0
        L_0x0172:
            r10 = r10 | r6
            com.google.android.gms.internal.ads.zzen r6 = r0.zzc
            int r1 = r1 + r7
            r6.zzG(r1)
        L_0x0179:
            boolean r1 = r0.zzm
            if (r1 != 0) goto L_0x0185
            android.util.SparseBooleanArray r6 = r0.zzh
            boolean r4 = r6.get(r4, r3)
            if (r4 != 0) goto L_0x0196
        L_0x0185:
            com.google.android.gms.internal.ads.zzen r4 = r0.zzc
            r4.zzE(r5)
            com.google.android.gms.internal.ads.zzen r4 = r0.zzc
            r8.zza(r4, r10)
            com.google.android.gms.internal.ads.zzen r4 = r0.zzc
            r4.zzE(r2)
            if (r1 != 0) goto L_0x01a3
        L_0x0196:
            boolean r1 = r0.zzm
            if (r1 == 0) goto L_0x01a3
            r1 = -1
            int r4 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x01a3
            r1 = 1
            r0.zzo = r1
        L_0x01a3:
            com.google.android.gms.internal.ads.zzen r1 = r0.zzc
            r1.zzF(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiv.zza(com.google.android.gms.internal.ads.zzzv, com.google.android.gms.internal.ads.zzaau):int");
    }

    public final void zzb(zzzx zzzx) {
        this.zzk = zzzx;
    }

    public final void zzc(long j10, long j11) {
        zzaiq zzaiq;
        int size = this.zzb.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzeu zzeu = (zzeu) this.zzb.get(i10);
            if (zzeu.zze() != -9223372036854775807L) {
                long zzc2 = zzeu.zzc();
                if (zzc2 != -9223372036854775807L) {
                    if (zzc2 != 0) {
                        if (zzc2 == j11) {
                        }
                    }
                }
            }
            zzeu.zzf(j11);
        }
        if (!(j11 == 0 || (zzaiq = this.zzj) == null)) {
            zzaiq.zzd(j11);
        }
        this.zzc.zzC(0);
        this.zzd.clear();
        for (int i11 = 0; i11 < this.zzf.size(); i11++) {
            ((zzaja) this.zzf.valueAt(i11)).zzc();
        }
        this.zzp = 0;
    }

    public final boolean zzd(zzzv zzzv) throws IOException {
        byte[] zzH = this.zzc.zzH();
        zzzk zzzk = (zzzk) zzzv;
        zzzk.zzm(zzH, 0, 940, false);
        int i10 = 0;
        while (i10 < 188) {
            int i11 = 0;
            while (i11 < 5) {
                if (zzH[(i11 * 188) + i10] != 71) {
                    i10++;
                } else {
                    i11++;
                }
            }
            zzzk.zzo(i10, false);
            return true;
        }
        return false;
    }

    public zzaiv(int i10) {
        this(1, new zzeu(0), new zzahk(0), 112800);
    }

    public zzaiv(int i10, zzeu zzeu, zzaiy zzaiy, int i11) {
        this.zze = zzaiy;
        this.zzb = Collections.singletonList(zzeu);
        this.zzc = new zzen(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzg = sparseBooleanArray;
        this.zzh = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzf = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzi = new zzair(112800);
        this.zzk = zzzx.zza;
        this.zzq = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.zzf.put(sparseArray2.keyAt(i12), (zzaja) sparseArray2.valueAt(i12));
        }
        this.zzf.put(0, new zzain(new zzait(this)));
    }
}
