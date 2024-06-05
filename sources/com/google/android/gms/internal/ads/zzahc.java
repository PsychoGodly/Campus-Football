package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzahc implements zzzu {
    public static final zzaab zza = zzahb.zza;
    private final zzahd zzb = new zzahd((String) null);
    private final zzen zzc = new zzen(2786);
    private boolean zzd;

    public final int zza(zzzv zzzv, zzaau zzaau) throws IOException {
        int zza2 = zzzv.zza(this.zzc.zzH(), 0, 2786);
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

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        r9.zzj();
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0046, code lost:
        if ((r5 - r3) >= 8192) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzd(com.google.android.gms.internal.ads.zzzv r9) throws java.io.IOException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzen r0 = new com.google.android.gms.internal.ads.zzen
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.zzH()
            r5 = r9
            com.google.android.gms.internal.ads.zzzk r5 = (com.google.android.gms.internal.ads.zzzk) r5
            r5.zzm(r4, r2, r1, r2)
            r0.zzF(r2)
            int r4 = r0.zzm()
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r6) goto L_0x0065
            r9.zzj()
            r4 = r9
            com.google.android.gms.internal.ads.zzzk r4 = (com.google.android.gms.internal.ads.zzzk) r4
            r4.zzl(r3, r2)
            r5 = r3
        L_0x0029:
            r1 = 0
        L_0x002a:
            byte[] r6 = r0.zzH()
            r7 = 6
            r4.zzm(r6, r2, r7, r2)
            r0.zzF(r2)
            int r6 = r0.zzo()
            r7 = 2935(0xb77, float:4.113E-42)
            if (r6 == r7) goto L_0x004d
            r9.zzj()
            int r5 = r5 + 1
            int r1 = r5 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L_0x004c
            r4.zzl(r5, r2)
            goto L_0x0029
        L_0x004c:
            return r2
        L_0x004d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L_0x0053
            return r6
        L_0x0053:
            byte[] r6 = r0.zzH()
            int r6 = com.google.android.gms.internal.ads.zzyv.zzb(r6)
            r7 = -1
            if (r6 != r7) goto L_0x005f
            return r2
        L_0x005f:
            int r6 = r6 + -6
            r4.zzl(r6, r2)
            goto L_0x002a
        L_0x0065:
            r4 = 3
            r0.zzG(r4)
            int r4 = r0.zzj()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.zzl(r4, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahc.zzd(com.google.android.gms.internal.ads.zzzv):boolean");
    }
}
