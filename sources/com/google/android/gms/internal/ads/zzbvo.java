package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;
import n4.m;
import n4.t;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbvo extends zzbuy {
    private m zza;
    private t zzb;

    public final void zzb(m mVar) {
        this.zza = mVar;
    }

    public final void zzc(t tVar) {
        this.zzb = tVar;
    }

    public final void zze() {
        m mVar = this.zza;
        if (mVar != null) {
            mVar.a();
        }
    }

    public final void zzf() {
        m mVar = this.zza;
        if (mVar != null) {
            mVar.d();
        }
    }

    public final void zzg() {
        m mVar = this.zza;
        if (mVar != null) {
            mVar.b();
        }
    }

    public final void zzh(int i10) {
    }

    public final void zzi(c3 c3Var) {
        m mVar = this.zza;
        if (mVar != null) {
            mVar.c(c3Var.v());
        }
    }

    public final void zzj() {
        m mVar = this.zza;
        if (mVar != null) {
            mVar.e();
        }
    }

    public final void zzk(zzbut zzbut) {
        t tVar = this.zzb;
        if (tVar != null) {
            tVar.onUserEarnedReward(new zzbvg(zzbut));
        }
    }
}
