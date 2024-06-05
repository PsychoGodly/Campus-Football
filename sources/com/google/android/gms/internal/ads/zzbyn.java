package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.p1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import m5.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbyn implements zzaty {
    final zzbyk zza;
    final HashSet zzb = new HashSet();
    final HashSet zzc = new HashSet();
    private final Object zzd = new Object();
    private final p1 zze;
    private final zzbyl zzf;
    private boolean zzg = false;

    public zzbyn(String str, p1 p1Var) {
        this.zza = new zzbyk(str, p1Var);
        this.zze = p1Var;
        this.zzf = new zzbyl();
    }

    public final void zza(boolean z10) {
        long a10 = t.b().a();
        if (z10) {
            if (a10 - this.zze.zzd() > ((Long) a0.c().zzb(zzbar.zzaN)).longValue()) {
                this.zza.zzd = -1;
            } else {
                this.zza.zzd = this.zze.zzc();
            }
            this.zzg = true;
            return;
        }
        this.zze.i(a10);
        this.zze.k(this.zza.zzd);
    }

    public final zzbyc zzb(e eVar, String str) {
        return new zzbyc(eVar, this, this.zzf.zza(), str);
    }

    public final void zzc(zzbyc zzbyc) {
        synchronized (this.zzd) {
            this.zzb.add(zzbyc);
        }
    }

    public final void zzd() {
        synchronized (this.zzd) {
            this.zza.zzb();
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            this.zza.zzc();
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            this.zza.zzd();
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zza.zze();
        }
    }

    public final void zzh(u4 u4Var, long j10) {
        synchronized (this.zzd) {
            this.zza.zzf(u4Var, j10);
        }
    }

    public final void zzi(HashSet hashSet) {
        synchronized (this.zzd) {
            this.zzb.addAll(hashSet);
        }
    }

    public final boolean zzj() {
        return this.zzg;
    }

    public final Bundle zzk(Context context, zzfad zzfad) {
        HashSet hashSet = new HashSet();
        synchronized (this.zzd) {
            hashSet.addAll(this.zzb);
            this.zzb.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.zza.zza(context, this.zzf.zzb()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.zzc.iterator();
        if (!it.hasNext()) {
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(((zzbyc) it2.next()).zza());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            zzfad.zzc(hashSet);
            return bundle;
        }
        zzbym zzbym = (zzbym) it.next();
        throw null;
    }
}
