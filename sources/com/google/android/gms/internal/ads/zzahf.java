package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzahf implements zzzu {
    public static final zzaab zza = zzahe.zza;
    private final zzahg zzb = new zzahg((String) null);
    private final zzen zzc = new zzen(16384);
    private boolean zzd;

    public final int zza(zzzv zzzv, zzaau zzaau) throws IOException {
        int zza2 = zzzv.zza(this.zzc.zzH(), 0, 16384);
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzF(0);
        this.zzc.zzE(zza2);
        if (!this.zzd) {
            this.zzb.zzd(0, 4);
            this.zzd = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    public final void zzb(zzzx zzzx) {
        this.zzb.zzb(zzzx, new zzaiz(RecyclerView.UNDEFINED_DURATION, 0, 1));
        zzzx.zzC();
        zzzx.zzN(new zzaaw(-9223372036854775807L, 0));
    }

    public final void zzc(long j10, long j11) {
        this.zzd = false;
        this.zzb.zze();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0055, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0046, code lost:
        r16.zzj();
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004f, code lost:
        if ((r5 - r3) >= 8192) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzd(com.google.android.gms.internal.ads.zzzv r16) throws java.io.IOException {
        /*
            r15 = this;
            com.google.android.gms.internal.ads.zzen r0 = new com.google.android.gms.internal.ads.zzen
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.zzH()
            r5 = r16
            com.google.android.gms.internal.ads.zzzk r5 = (com.google.android.gms.internal.ads.zzzk) r5
            r5.zzm(r4, r2, r1, r2)
            r0.zzF(r2)
            int r4 = r0.zzm()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L_0x009e
            r16.zzj()
            r4 = r16
            com.google.android.gms.internal.ads.zzzk r4 = (com.google.android.gms.internal.ads.zzzk) r4
            r4.zzl(r3, r2)
            r5 = r3
        L_0x002c:
            r1 = 0
        L_0x002d:
            byte[] r6 = r0.zzH()
            r8 = 7
            r4.zzm(r6, r2, r8, r2)
            r0.zzF(r2)
            int r6 = r0.zzo()
            r9 = 44096(0xac40, float:6.1792E-41)
            r10 = 44097(0xac41, float:6.1793E-41)
            if (r6 == r9) goto L_0x0056
            if (r6 == r10) goto L_0x0056
            r16.zzj()
            int r5 = r5 + 1
            int r1 = r5 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L_0x0055
            r4.zzl(r5, r2)
            goto L_0x002c
        L_0x0055:
            return r2
        L_0x0056:
            r9 = 1
            int r1 = r1 + r9
            r11 = 4
            if (r1 < r11) goto L_0x005c
            return r9
        L_0x005c:
            byte[] r9 = r0.zzH()
            int r12 = com.google.android.gms.internal.ads.zzyy.zza
            int r12 = r9.length
            r13 = -1
            if (r12 >= r8) goto L_0x0068
            r12 = -1
            goto L_0x0095
        L_0x0068:
            r12 = 2
            byte r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            byte r14 = r9[r7]
            int r12 = r12 << 8
            r14 = r14 & 255(0xff, float:3.57E-43)
            r12 = r12 | r14
            r14 = 65535(0xffff, float:9.1834E-41)
            if (r12 != r14) goto L_0x008f
            byte r11 = r9[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r12 = 5
            byte r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 16
            int r12 = r12 << 8
            r14 = 6
            byte r9 = r9[r14]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r11 = r11 | r12
            r12 = r11 | r9
            goto L_0x0090
        L_0x008f:
            r8 = 4
        L_0x0090:
            if (r6 != r10) goto L_0x0094
            int r8 = r8 + 2
        L_0x0094:
            int r12 = r12 + r8
        L_0x0095:
            if (r12 != r13) goto L_0x0098
            return r2
        L_0x0098:
            int r12 = r12 + -7
            r4.zzl(r12, r2)
            goto L_0x002d
        L_0x009e:
            r0.zzG(r7)
            int r4 = r0.zzj()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.zzl(r4, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahf.zzd(com.google.android.gms.internal.ads.zzzv):boolean");
    }
}
