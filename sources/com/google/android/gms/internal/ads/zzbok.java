package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import q4.d;
import v4.x;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbok extends zzbnt {
    private final x zza;

    public zzbok(x xVar) {
        this.zza = xVar;
    }

    public final boolean zzA() {
        return this.zza.l();
    }

    public final boolean zzB() {
        return this.zza.m();
    }

    public final double zze() {
        if (this.zza.o() != null) {
            return this.zza.o().doubleValue();
        }
        return -1.0d;
    }

    public final float zzf() {
        return this.zza.k();
    }

    public final float zzg() {
        return this.zza.e();
    }

    public final float zzh() {
        return this.zza.f();
    }

    public final Bundle zzi() {
        return this.zza.g();
    }

    public final s2 zzj() {
        if (this.zza.H() != null) {
            return this.zza.H().b();
        }
        return null;
    }

    public final zzbdp zzk() {
        return null;
    }

    public final zzbdx zzl() {
        d i10 = this.zza.i();
        if (i10 != null) {
            return new zzbdj(i10.getDrawable(), i10.getUri(), i10.getScale(), i10.zzb(), i10.zza());
        }
        return null;
    }

    public final a zzm() {
        View a10 = this.zza.a();
        if (a10 == null) {
            return null;
        }
        return b.B1(a10);
    }

    public final a zzn() {
        View G = this.zza.G();
        if (G == null) {
            return null;
        }
        return b.B1(G);
    }

    public final a zzo() {
        Object I = this.zza.I();
        if (I == null) {
            return null;
        }
        return b.B1(I);
    }

    public final String zzp() {
        return this.zza.b();
    }

    public final String zzq() {
        return this.zza.c();
    }

    public final String zzr() {
        return this.zza.d();
    }

    public final String zzs() {
        return this.zza.h();
    }

    public final String zzt() {
        return this.zza.n();
    }

    public final String zzu() {
        return this.zza.p();
    }

    public final List zzv() {
        List<d> j10 = this.zza.j();
        ArrayList arrayList = new ArrayList();
        if (j10 != null) {
            for (d next : j10) {
                arrayList.add(new zzbdj(next.getDrawable(), next.getUri(), next.getScale(), next.zzb(), next.zza()));
            }
        }
        return arrayList;
    }

    public final void zzw(a aVar) {
        this.zza.q((View) b.A1(aVar));
    }

    public final void zzx() {
        this.zza.s();
    }

    public final void zzy(a aVar, a aVar2, a aVar3) {
        this.zza.E((View) b.A1(aVar), (HashMap) b.A1(aVar2), (HashMap) b.A1(aVar3));
    }

    public final void zzz(a aVar) {
        this.zza.F((View) b.A1(aVar));
    }
}
