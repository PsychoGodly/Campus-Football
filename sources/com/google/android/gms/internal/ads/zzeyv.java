package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c1;
import com.google.android.gms.ads.internal.client.f5;
import com.google.android.gms.ads.internal.client.g1;
import com.google.android.gms.ads.internal.client.n4;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.common.internal.q;
import java.util.ArrayList;
import q4.a;
import q4.h;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeyv {
    /* access modifiers changed from: private */
    public u4 zza;
    /* access modifiers changed from: private */
    public z4 zzb;
    /* access modifiers changed from: private */
    public String zzc;
    /* access modifiers changed from: private */
    public n4 zzd;
    /* access modifiers changed from: private */
    public boolean zze;
    /* access modifiers changed from: private */
    public ArrayList zzf;
    /* access modifiers changed from: private */
    public ArrayList zzg;
    /* access modifiers changed from: private */
    public zzbdl zzh;
    /* access modifiers changed from: private */
    public f5 zzi;
    /* access modifiers changed from: private */
    public a zzj;
    /* access modifiers changed from: private */
    public h zzk;
    /* access modifiers changed from: private */
    public c1 zzl;
    /* access modifiers changed from: private */
    public int zzm = 1;
    /* access modifiers changed from: private */
    public zzbjx zzn;
    /* access modifiers changed from: private */
    public final zzeyi zzo = new zzeyi();
    /* access modifiers changed from: private */
    public boolean zzp = false;
    /* access modifiers changed from: private */
    public zzeib zzq;
    /* access modifiers changed from: private */
    public boolean zzr = false;
    /* access modifiers changed from: private */
    public g1 zzs;

    public final zzeyv zzA(zzbdl zzbdl) {
        this.zzh = zzbdl;
        return this;
    }

    public final zzeyv zzB(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzeyv zzC(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzeyv zzD(h hVar) {
        this.zzk = hVar;
        if (hVar != null) {
            this.zze = hVar.zzc();
            this.zzl = hVar.v();
        }
        return this;
    }

    public final zzeyv zzE(u4 u4Var) {
        this.zza = u4Var;
        return this;
    }

    public final zzeyv zzF(n4 n4Var) {
        this.zzd = n4Var;
        return this;
    }

    public final zzeyx zzG() {
        q.l(this.zzc, "ad unit must not be null");
        q.l(this.zzb, "ad size must not be null");
        q.l(this.zza, "ad request must not be null");
        return new zzeyx(this, (zzeyw) null);
    }

    public final String zzI() {
        return this.zzc;
    }

    public final boolean zzO() {
        return this.zzp;
    }

    public final zzeyv zzQ(g1 g1Var) {
        this.zzs = g1Var;
        return this;
    }

    public final u4 zze() {
        return this.zza;
    }

    public final z4 zzg() {
        return this.zzb;
    }

    public final zzeyi zzo() {
        return this.zzo;
    }

    public final zzeyv zzp(zzeyx zzeyx) {
        this.zzo.zza(zzeyx.zzo.zza);
        this.zza = zzeyx.zzd;
        this.zzb = zzeyx.zze;
        this.zzs = zzeyx.zzr;
        this.zzc = zzeyx.zzf;
        this.zzd = zzeyx.zza;
        this.zzf = zzeyx.zzg;
        this.zzg = zzeyx.zzh;
        this.zzh = zzeyx.zzi;
        this.zzi = zzeyx.zzj;
        zzq(zzeyx.zzl);
        zzD(zzeyx.zzm);
        this.zzp = zzeyx.zzp;
        this.zzq = zzeyx.zzc;
        this.zzr = zzeyx.zzq;
        return this;
    }

    public final zzeyv zzq(a aVar) {
        this.zzj = aVar;
        if (aVar != null) {
            this.zze = aVar.v();
        }
        return this;
    }

    public final zzeyv zzr(z4 z4Var) {
        this.zzb = z4Var;
        return this;
    }

    public final zzeyv zzs(String str) {
        this.zzc = str;
        return this;
    }

    public final zzeyv zzt(f5 f5Var) {
        this.zzi = f5Var;
        return this;
    }

    public final zzeyv zzu(zzeib zzeib) {
        this.zzq = zzeib;
        return this;
    }

    public final zzeyv zzv(zzbjx zzbjx) {
        this.zzn = zzbjx;
        this.zzd = new n4(false, true, false);
        return this;
    }

    public final zzeyv zzw(boolean z10) {
        this.zzp = z10;
        return this;
    }

    public final zzeyv zzx(boolean z10) {
        this.zzr = true;
        return this;
    }

    public final zzeyv zzy(boolean z10) {
        this.zze = z10;
        return this;
    }

    public final zzeyv zzz(int i10) {
        this.zzm = i10;
        return this;
    }
}
