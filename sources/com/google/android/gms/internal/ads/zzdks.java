package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a;
import t4.e0;
import t4.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzdks implements a, zzbgi, t, zzbgk, e0 {
    private a zza;
    private zzbgi zzb;
    private t zzc;
    private zzbgk zzd;
    private e0 zze;

    public final synchronized void onAdClicked() {
        a aVar = this.zza;
        if (aVar != null) {
            aVar.onAdClicked();
        }
    }

    public final synchronized void zza(String str, Bundle bundle) {
        zzbgi zzbgi = this.zzb;
        if (zzbgi != null) {
            zzbgi.zza(str, bundle);
        }
    }

    public final synchronized void zzb() {
        t tVar = this.zzc;
        if (tVar != null) {
            tVar.zzb();
        }
    }

    public final synchronized void zzbF() {
        t tVar = this.zzc;
        if (tVar != null) {
            tVar.zzbF();
        }
    }

    public final synchronized void zzbo() {
        t tVar = this.zzc;
        if (tVar != null) {
            tVar.zzbo();
        }
    }

    public final synchronized void zzby() {
        t tVar = this.zzc;
        if (tVar != null) {
            tVar.zzby();
        }
    }

    public final synchronized void zzbz(String str, String str2) {
        zzbgk zzbgk = this.zzd;
        if (zzbgk != null) {
            zzbgk.zzbz(str, str2);
        }
    }

    public final synchronized void zze() {
        t tVar = this.zzc;
        if (tVar != null) {
            tVar.zze();
        }
    }

    public final synchronized void zzf(int i10) {
        t tVar = this.zzc;
        if (tVar != null) {
            tVar.zzf(i10);
        }
    }

    public final synchronized void zzg() {
        e0 e0Var = this.zze;
        if (e0Var != null) {
            e0Var.zzg();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzh(a aVar, zzbgi zzbgi, t tVar, zzbgk zzbgk, e0 e0Var) {
        this.zza = aVar;
        this.zzb = zzbgi;
        this.zzc = tVar;
        this.zzd = zzbgk;
        this.zze = e0Var;
    }
}
