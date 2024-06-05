package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzafh extends zzafj {
    public final long zza;
    public final List zzb = new ArrayList();
    public final List zzc = new ArrayList();

    public zzafh(int i10, long j10) {
        super(i10);
        this.zza = j10;
    }

    public final String toString() {
        String zzf = zzafj.zzf(this.zzd);
        String arrays = Arrays.toString(this.zzb.toArray());
        String arrays2 = Arrays.toString(this.zzc.toArray());
        return zzf + " leaves: " + arrays + " containers: " + arrays2;
    }

    public final zzafh zza(int i10) {
        int size = this.zzc.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzafh zzafh = (zzafh) this.zzc.get(i11);
            if (zzafh.zzd == i10) {
                return zzafh;
            }
        }
        return null;
    }

    public final zzafi zzb(int i10) {
        int size = this.zzb.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzafi zzafi = (zzafi) this.zzb.get(i11);
            if (zzafi.zzd == i10) {
                return zzafi;
            }
        }
        return null;
    }

    public final void zzc(zzafh zzafh) {
        this.zzc.add(zzafh);
    }

    public final void zzd(zzafi zzafi) {
        this.zzb.add(zzafi);
    }
}
