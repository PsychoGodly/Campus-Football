package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfl {
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;
    @Deprecated
    public final long zze;
    public final long zzf;
    public final long zzg;
    public final String zzh;
    public final int zzi;

    static {
        zzbh.zzb("media3.datasource");
    }

    public zzfl(Uri uri) {
        this(uri, 0, 1, (byte[]) null, Collections.emptyMap(), 0, -1, (String) null, 0, (Object) null);
    }

    /* synthetic */ zzfl(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj, zzfk zzfk) {
        this(uri, 0, 1, (byte[]) null, map, j11, -1, (String) null, i11, (Object) null);
    }

    public static String zza(int i10) {
        return "GET";
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        long j10 = this.zzf;
        long j11 = this.zzg;
        int i10 = this.zzi;
        return "DataSpec[" + "GET" + " " + valueOf + ", " + j10 + ", " + j11 + ", null, " + i10 + "]";
    }

    public final boolean zzb(int i10) {
        return (this.zzi & i10) == i10;
    }

    @Deprecated
    public zzfl(Uri uri, byte[] bArr, long j10, long j11, long j12, String str, int i10) {
        this(uri, j10 - j11, 1, (byte[]) null, Collections.emptyMap(), j11, j12, (String) null, i10, (Object) null);
    }

    private zzfl(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        long j13 = j11;
        long j14 = j10 + j13;
        boolean z10 = false;
        zzdl.zzd(j14 >= 0);
        zzdl.zzd(j13 >= 0);
        long j15 = -1;
        if (j12 > 0) {
            j15 = j12;
        } else if (j12 != -1) {
            j15 = j12;
            zzdl.zzd(z10);
            this.zza = uri;
            this.zzb = 1;
            this.zzc = null;
            this.zzd = Collections.unmodifiableMap(new HashMap(map));
            this.zzf = j13;
            this.zze = j14;
            this.zzg = j15;
            this.zzh = null;
            this.zzi = i11;
        }
        z10 = true;
        zzdl.zzd(z10);
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zzf = j13;
        this.zze = j14;
        this.zzg = j15;
        this.zzh = null;
        this.zzi = i11;
    }
}
