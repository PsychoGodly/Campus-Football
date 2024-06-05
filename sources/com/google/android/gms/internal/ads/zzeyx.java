package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c1;
import com.google.android.gms.ads.internal.client.f5;
import com.google.android.gms.ads.internal.client.g1;
import com.google.android.gms.ads.internal.client.n4;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.internal.util.b2;
import java.util.ArrayList;
import java.util.List;
import q4.a;
import q4.e;
import q4.h;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeyx {
    public final n4 zza;
    public final zzbjx zzb;
    public final zzeib zzc;
    public final u4 zzd;
    public final z4 zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbdl zzi;
    public final f5 zzj;
    public final int zzk;
    public final a zzl;
    public final h zzm;
    public final c1 zzn;
    public final zzeyk zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final g1 zzr;

    /* synthetic */ zzeyx(zzeyv zzeyv, zzeyw zzeyw) {
        n4 n4Var;
        zzbdl zzbdl;
        this.zze = zzeyv.zzb;
        this.zzf = zzeyv.zzc;
        this.zzr = zzeyv.zzs;
        int i10 = zzeyv.zza.f14551a;
        long j10 = zzeyv.zza.f14552b;
        Bundle bundle = zzeyv.zza.f14553c;
        int i11 = zzeyv.zza.f14554d;
        List list = zzeyv.zza.f14555f;
        boolean z10 = zzeyv.zza.f14556g;
        int i12 = zzeyv.zza.f14557h;
        boolean z11 = true;
        if (!zzeyv.zza.f14558i && !zzeyv.zze) {
            z11 = false;
        }
        this.zzd = new u4(i10, j10, bundle, i11, list, z10, i12, z11, zzeyv.zza.f14559j, zzeyv.zza.f14560k, zzeyv.zza.f14561l, zzeyv.zza.f14562m, zzeyv.zza.f14563n, zzeyv.zza.f14564o, zzeyv.zza.f14565p, zzeyv.zza.f14566q, zzeyv.zza.f14567r, zzeyv.zza.f14568s, zzeyv.zza.f14569t, zzeyv.zza.f14570u, zzeyv.zza.f14571v, zzeyv.zza.f14572w, b2.z(zzeyv.zza.f14573x), zzeyv.zza.f14574y);
        if (zzeyv.zzd != null) {
            n4Var = zzeyv.zzd;
        } else {
            n4Var = zzeyv.zzh != null ? zzeyv.zzh.zzf : null;
        }
        this.zza = n4Var;
        this.zzg = zzeyv.zzf;
        this.zzh = zzeyv.zzg;
        if (zzeyv.zzf == null) {
            zzbdl = null;
        } else {
            zzbdl = zzeyv.zzh == null ? new zzbdl(new e.a().a()) : zzeyv.zzh;
        }
        this.zzi = zzbdl;
        this.zzj = zzeyv.zzi;
        this.zzk = zzeyv.zzm;
        this.zzl = zzeyv.zzj;
        this.zzm = zzeyv.zzk;
        this.zzn = zzeyv.zzl;
        this.zzb = zzeyv.zzn;
        this.zzo = new zzeyk(zzeyv.zzo, (zzeyj) null);
        this.zzp = zzeyv.zzp;
        this.zzc = zzeyv.zzq;
        this.zzq = zzeyv.zzr;
    }

    public final zzbfo zza() {
        h hVar = this.zzm;
        if (hVar == null && this.zzl == null) {
            return null;
        }
        if (hVar != null) {
            return hVar.w();
        }
        return this.zzl.w();
    }

    public final boolean zzb() {
        return this.zzf.matches((String) a0.c().zzb(zzbar.zzcI));
    }
}
