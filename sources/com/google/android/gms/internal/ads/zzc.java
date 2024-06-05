package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzc {
    public static final zzn zza = zzb.zza;
    private static final String zzi = zzew.zzP(0);
    private static final String zzj = zzew.zzP(1);
    private static final String zzk = zzew.zzP(2);
    private static final String zzl = zzew.zzP(3);
    private static final String zzm = zzew.zzP(4);
    private static final String zzn = zzew.zzP(5);
    private static final String zzo = zzew.zzP(6);
    private static final String zzp = zzew.zzP(7);
    public final long zzb;
    public final int zzc;
    public final Uri[] zzd;
    public final int[] zze;
    public final long[] zzf;
    public final long zzg;
    public final boolean zzh;

    public zzc(long j10) {
        this(0, -1, -1, new int[0], new Uri[0], new long[0], 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzc.class == obj.getClass()) {
            zzc zzc2 = (zzc) obj;
            return this.zzc == zzc2.zzc && Arrays.equals(this.zzd, zzc2.zzd) && Arrays.equals(this.zze, zzc2.zze) && Arrays.equals(this.zzf, zzc2.zzf);
        }
    }

    public final int hashCode() {
        return ((((((((this.zzc * 31) - 1) * 961) + Arrays.hashCode(this.zzd)) * 31) + Arrays.hashCode(this.zze)) * 31) + Arrays.hashCode(this.zzf)) * 961;
    }

    public final int zza(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.zze;
            if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
                return i12;
            }
            i12++;
        }
        return i12;
    }

    public final zzc zzb(int i10) {
        int[] iArr = this.zze;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.zzf;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        return new zzc(0, 0, -1, copyOf, (Uri[]) Arrays.copyOf(this.zzd, 0), copyOf2, 0, false);
    }

    private zzc(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
        zzdl.zzd(iArr.length == uriArr.length);
        this.zzb = 0;
        this.zzc = i10;
        this.zze = iArr;
        this.zzd = uriArr;
        this.zzf = jArr;
        this.zzg = 0;
        this.zzh = false;
    }
}
