package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zztk extends zzsb {
    private static final zzbg zza;
    private final zzsu[] zzb;
    private final zzcn[] zzc;
    private final ArrayList zzd;
    private final Map zze;
    private final zzfrg zzf;
    private int zzg = -1;
    private long[][] zzh;
    private zztj zzi;
    private final zzsd zzj;

    static {
        zzaj zzaj = new zzaj();
        zzaj.zza("MergingMediaSource");
        zza = zzaj.zzc();
    }

    public zztk(boolean z10, boolean z11, zzsu... zzsuArr) {
        zzsd zzsd = new zzsd();
        this.zzb = zzsuArr;
        this.zzj = zzsd;
        this.zzd = new ArrayList(Arrays.asList(zzsuArr));
        this.zzc = new zzcn[zzsuArr.length];
        this.zzh = new long[0][];
        this.zze = new HashMap();
        this.zzf = zzfrn.zzb(8).zzb(2).zza();
    }

    public final void zzF(zzsq zzsq) {
        zzti zzti = (zzti) zzsq;
        int i10 = 0;
        while (true) {
            zzsu[] zzsuArr = this.zzb;
            if (i10 < zzsuArr.length) {
                zzsuArr[i10].zzF(zzti.zzn(i10));
                i10++;
            } else {
                return;
            }
        }
    }

    public final zzsq zzH(zzss zzss, zzwt zzwt, long j10) {
        int length = this.zzb.length;
        zzsq[] zzsqArr = new zzsq[length];
        int zza2 = this.zzc[0].zza(zzss.zza);
        for (int i10 = 0; i10 < length; i10++) {
            zzsqArr[i10] = this.zzb[i10].zzH(zzss.zzc(this.zzc[i10].zzf(zza2)), zzwt, j10 - this.zzh[zza2][i10]);
        }
        return new zzti(this.zzj, this.zzh[zza2], zzsqArr, (byte[]) null);
    }

    public final zzbg zzI() {
        zzsu[] zzsuArr = this.zzb;
        return zzsuArr.length > 0 ? zzsuArr[0].zzI() : zza;
    }

    /* access modifiers changed from: protected */
    public final void zzn(zzgi zzgi) {
        super.zzn(zzgi);
        for (int i10 = 0; i10 < this.zzb.length; i10++) {
            zzA(Integer.valueOf(i10), this.zzb[i10]);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, (Object) null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ zzss zzx(Object obj, zzss zzss) {
        if (((Integer) obj).intValue() == 0) {
            return zzss;
        }
        return null;
    }

    public final void zzy() throws IOException {
        zztj zztj = this.zzi;
        if (zztj == null) {
            super.zzy();
            return;
        }
        throw zztj;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void zzz(Object obj, zzsu zzsu, zzcn zzcn) {
        int i10;
        if (this.zzi == null) {
            if (this.zzg == -1) {
                i10 = zzcn.zzb();
                this.zzg = i10;
            } else {
                int zzb2 = zzcn.zzb();
                int i11 = this.zzg;
                if (zzb2 != i11) {
                    this.zzi = new zztj(0);
                    return;
                }
                i10 = i11;
            }
            if (this.zzh.length == 0) {
                int[] iArr = new int[2];
                iArr[1] = this.zzc.length;
                iArr[0] = i10;
                this.zzh = (long[][]) Array.newInstance(long.class, iArr);
            }
            this.zzd.remove(zzsu);
            this.zzc[((Integer) obj).intValue()] = zzcn;
            if (this.zzd.isEmpty()) {
                zzo(this.zzc[0]);
            }
        }
    }
}
