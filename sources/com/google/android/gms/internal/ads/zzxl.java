package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzxl {
    private static final Comparator zza = zzxh.zza;
    private static final Comparator zzb = zzxi.zza;
    private final ArrayList zzc = new ArrayList();
    private final zzxk[] zzd = new zzxk[5];
    private int zze = -1;
    private int zzf;
    private int zzg;
    private int zzh;

    public zzxl(int i10) {
    }

    public final float zza(float f10) {
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f11 = (float) this.zzg;
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzc.size(); i11++) {
            zzxk zzxk = (zzxk) this.zzc.get(i11);
            i10 += zzxk.zzb;
            if (((float) i10) >= 0.5f * f11) {
                return zzxk.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        ArrayList arrayList = this.zzc;
        return ((zzxk) arrayList.get(arrayList.size() - 1)).zzc;
    }

    public final void zzb(int i10, float f10) {
        zzxk zzxk;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i11 = this.zzh;
        if (i11 > 0) {
            zzxk[] zzxkArr = this.zzd;
            int i12 = i11 - 1;
            this.zzh = i12;
            zzxk = zzxkArr[i12];
        } else {
            zzxk = new zzxk((zzxj) null);
        }
        int i13 = this.zzf;
        this.zzf = i13 + 1;
        zzxk.zza = i13;
        zzxk.zzb = i10;
        zzxk.zzc = f10;
        this.zzc.add(zzxk);
        this.zzg += i10;
        while (true) {
            int i14 = this.zzg;
            if (i14 > 2000) {
                int i15 = i14 - 2000;
                zzxk zzxk2 = (zzxk) this.zzc.get(0);
                int i16 = zzxk2.zzb;
                if (i16 <= i15) {
                    this.zzg -= i16;
                    this.zzc.remove(0);
                    int i17 = this.zzh;
                    if (i17 < 5) {
                        zzxk[] zzxkArr2 = this.zzd;
                        this.zzh = i17 + 1;
                        zzxkArr2[i17] = zzxk2;
                    }
                } else {
                    zzxk2.zzb = i16 - i15;
                    this.zzg -= i15;
                }
            } else {
                return;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
