package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.util.n1;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzevl implements zzfnj {
    final /* synthetic */ zzevp zza;

    zzevl(zzevp zzevp) {
        this.zza = zzevp;
    }

    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzbza.zzh(MaxReward.DEFAULT_LABEL, (zzdvi) obj);
        n1.a("Failed to get a cache key, reverting to legacy flow.");
        zzevp zzevp = this.zza;
        zzevp.zzd = new zzevo((zzbtn) null, zzevp.zze(), (zzevn) null);
        return this.zza.zzd;
    }
}
