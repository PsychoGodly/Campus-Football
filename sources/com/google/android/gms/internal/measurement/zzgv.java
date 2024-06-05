package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import com.applovin.mediation.MaxReward;
import r6.g;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class zzgv {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final g<Context, Boolean> zzh;
    private final boolean zzi;

    public zzgv(Uri uri) {
        this((String) null, uri, MaxReward.DEFAULT_LABEL, MaxReward.DEFAULT_LABEL, false, false, false, false, (g<Context, Boolean>) null);
    }

    public final zzgv zza() {
        return new zzgv(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, true, this.zzg, this.zzh);
    }

    public final zzgv zzb() {
        if (this.zzc.isEmpty()) {
            g<Context, Boolean> gVar = this.zzh;
            if (gVar == null) {
                return new zzgv(this.zza, this.zzb, this.zzc, this.zzd, true, this.zzf, this.zzi, this.zzg, gVar);
            }
            throw new IllegalStateException("Cannot skip gservices both always and conditionally");
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    private zzgv(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, g<Context, Boolean> gVar) {
        this.zza = str;
        this.zzb = uri;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z10;
        this.zzf = z11;
        this.zzi = z12;
        this.zzg = z13;
        this.zzh = gVar;
    }

    public final zzgn<Double> zza(String str, double d10) {
        return zzgn.zza(this, str, Double.valueOf(-3.0d), true);
    }

    public final zzgn<Long> zza(String str, long j10) {
        return zzgn.zza(this, str, Long.valueOf(j10), true);
    }

    public final zzgn<String> zza(String str, String str2) {
        return zzgn.zza(this, str, str2, true);
    }

    public final zzgn<Boolean> zza(String str, boolean z10) {
        return zzgn.zza(this, str, Boolean.valueOf(z10), true);
    }
}
