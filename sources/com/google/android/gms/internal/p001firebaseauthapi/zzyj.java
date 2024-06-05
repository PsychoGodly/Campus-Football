package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.q;
import com.google.firebase.auth.d1;
import com.google.firebase.auth.d2;
import com.google.firebase.auth.e;
import com.google.firebase.auth.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzyj {
    /* access modifiers changed from: private */
    public final zzadi zza;

    public zzyj(zzadi zzadi) {
        this.zza = (zzadi) q.k(zzadi);
    }

    static /* synthetic */ void zza(zzyj zzyj, zzagv zzagv, zzacd zzacd, zzadl zzadl) {
        Status status;
        if (zzagv.zzo()) {
            d2 zzb = zzagv.zzb();
            String zzc = zzagv.zzc();
            String zzj = zzagv.zzj();
            if (zzagv.zzm()) {
                status = new Status(17012);
            } else {
                status = d7.q.a(zzagv.zzd());
            }
            zzacd.zza(new zzyh(status, zzb, zzc, zzj));
            return;
        }
        zzyj.zza(new zzafn(zzagv.zzi(), zzagv.zze(), Long.valueOf(zzagv.zza()), "Bearer"), zzagv.zzh(), zzagv.zzg(), Boolean.valueOf(zzagv.zzn()), zzagv.zzb(), zzacd, zzadl);
    }

    public final void zzb(String str, String str2, zzacd zzacd) {
        q.g(str);
        q.g(str2);
        q.k(zzacd);
        zza(str, (zzadk<zzafn>) new zzaab(this, str2, zzacd));
    }

    public final void zzc(String str, String str2, zzacd zzacd) {
        q.g(str);
        q.g(str2);
        q.k(zzacd);
        zza(str, (zzadk<zzafn>) new zzaae(this, str2, zzacd));
    }

    public final void zzd(String str, String str2, zzacd zzacd) {
        q.g(str);
        q.k(zzacd);
        this.zza.zza(new zzafx(str, (String) null, str2), (zzadk<zzafw>) new zzyw(this, zzacd));
    }

    public final void zze(String str, String str2, zzacd zzacd) {
        q.g(str);
        q.k(zzacd);
        this.zza.zza(new zzaek(str, str2), (zzadk<zzaen>) new zzyu(this, zzacd));
    }

    public final void zzf(String str, zzacd zzacd) {
        q.g(str);
        q.k(zzacd);
        zza(str, (zzadk<zzafn>) new zzzf(this, zzacd));
    }

    public final void zzf(String str, String str2, zzacd zzacd) {
        q.g(str);
        q.g(str2);
        q.k(zzacd);
        zza(str2, (zzadk<zzafn>) new zzzi(this, str, zzacd));
    }

    public final void zzb(String str, zzacd zzacd) {
        q.g(str);
        q.k(zzacd);
        this.zza.zza(new zzafb(str), (zzadk<zzafn>) new zzym(this, zzacd));
    }

    public final void zzc(String str, zzacd zzacd) {
        q.g(str);
        q.k(zzacd);
        zza(str, (zzadk<zzafn>) new zzzu(this, zzacd));
    }

    public final void zzd(String str, zzacd zzacd) {
        q.k(zzacd);
        this.zza.zza(str, (zzadk<Void>) new zzzy(this, zzacd));
    }

    public final void zze(String str, zzacd zzacd) {
        q.k(zzacd);
        this.zza.zza(new zzage(str), (zzadk<zzagh>) new zzaaa(this, zzacd));
    }

    private final void zzb(zzafe zzafe, zzacd zzacd) {
        q.k(zzafe);
        q.k(zzacd);
        this.zza.zza(zzafe, (zzadk<zzafh>) new zzzx(this, zzacd));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzacd zzacd) {
        q.g(str);
        q.g(str2);
        q.k(zzacd);
        this.zza.zza(new zzagw(str, str2, str3, str4), (zzadk<zzagz>) new zzyo(this, zzacd));
    }

    public final void zzb(String str, String str2, String str3, zzacd zzacd) {
        q.g(str);
        q.g(str2);
        q.k(zzacd);
        zza(str, (zzadk<zzafn>) new zzzk(this, str2, str3, zzacd));
    }

    static /* synthetic */ void zza(zzyj zzyj, zzacd zzacd, zzage zzage, zzadl zzadl) {
        q.k(zzacd);
        q.k(zzage);
        q.k(zzadl);
        zzyj.zza.zza(zzage, (zzadk<zzagh>) new zzzc(zzyj, zzacd, zzadl));
    }

    static /* synthetic */ void zza(zzyj zzyj, zzacd zzacd, zzafn zzafn, zzagc zzagc, zzadl zzadl) {
        q.k(zzacd);
        q.k(zzafn);
        q.k(zzagc);
        q.k(zzadl);
        zzyj.zza.zza(new zzafa(zzafn.zzc()), (zzadk<zzafd>) new zzyp(zzyj, zzadl, zzacd, zzafn, zzagc));
    }

    static /* synthetic */ void zza(zzyj zzyj, zzacd zzacd, zzafn zzafn, zzafc zzafc, zzagc zzagc, zzadl zzadl) {
        q.k(zzacd);
        q.k(zzafn);
        q.k(zzafc);
        q.k(zzagc);
        q.k(zzadl);
        zzyj.zza.zza(zzagc, (zzadk<zzagf>) new zzys(zzyj, zzagc, zzafc, zzacd, zzafn, zzadl));
    }

    public final void zza(String str, String str2, zzacd zzacd) {
        q.g(str);
        q.k(zzacd);
        zzagc zzagc = new zzagc();
        zzagc.zze(str);
        zzagc.zzh(str2);
        this.zza.zza(zzagc, (zzadk<zzagf>) new zzaad(this, zzacd));
    }

    public final void zza(String str, String str2, String str3, zzacd zzacd) {
        q.g(str);
        q.g(str2);
        q.k(zzacd);
        this.zza.zza(new zzafx(str, str2, str3), (zzadk<zzafw>) new zzyy(this, zzacd));
    }

    public final void zza(String str, String str2, String str3, String str4, zzacd zzacd) {
        q.g(str);
        q.g(str2);
        q.k(zzacd);
        this.zza.zza(new zzage(str, str2, (String) null, str3, str4, (String) null), (zzadk<zzagh>) new zzyl(this, zzacd));
    }

    public final void zza(String str, zzacd zzacd) {
        q.g(str);
        q.k(zzacd);
        zza(str, (zzadk<zzafn>) new zzzw(this, zzacd));
    }

    private final void zza(String str, zzadk<zzafn> zzadk) {
        q.k(zzadk);
        q.g(str);
        zzafn zzb = zzafn.zzb(str);
        if (zzb.zzg()) {
            zzadk.zza(zzb);
            return;
        }
        this.zza.zza(new zzafb(zzb.zzd()), (zzadk<zzafn>) new zzaag(this, zzadk));
    }

    public final void zza(zzaer zzaer, String str, zzacd zzacd) {
        q.k(zzaer);
        q.k(zzacd);
        zza(str, (zzadk<zzafn>) new zzzo(this, zzaer, zzacd));
    }

    public final void zza(zzaet zzaet, zzacd zzacd) {
        q.k(zzaet);
        q.k(zzacd);
        this.zza.zza(zzaet, (zzadk<zzaes>) new zzzq(this, zzacd));
    }

    /* access modifiers changed from: private */
    public final void zza(zzaep zzaep, zzacd zzacd) {
        q.k(zzaep);
        q.k(zzacd);
        this.zza.zza(zzaep, (zzadk<zzaeo>) new zzyq(this, zzacd));
    }

    /* access modifiers changed from: private */
    public final void zza(zzafn zzafn, String str, String str2, Boolean bool, d2 d2Var, zzacd zzacd, zzadl zzadl) {
        q.k(zzafn);
        q.k(zzadl);
        q.k(zzacd);
        this.zza.zza(new zzafa(zzafn.zzc()), (zzadk<zzafd>) new zzyr(this, zzadl, str2, str, bool, d2Var, zzacd, zzafn));
    }

    public final void zza(zzafg zzafg, zzacd zzacd) {
        q.k(zzafg);
        q.k(zzacd);
        this.zza.zza(zzafg, (zzadk<zzafj>) new zzzr(this, zzacd));
    }

    public final void zza(zzafl zzafl, zzacd zzacd) {
        q.k(zzafl);
        q.k(zzacd);
        this.zza.zza(zzafl, (zzadk<zzafk>) new zzzs(this, zzacd));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzacd zzacd) {
        q.g(str);
        q.g(str2);
        q.g(str3);
        q.k(zzacd);
        zza(str3, (zzadk<zzafn>) new zzyz(this, str, str2, str4, str5, zzacd));
    }

    public final void zza(String str, zzagt zzagt, zzacd zzacd) {
        q.g(str);
        q.k(zzagt);
        q.k(zzacd);
        zza(str, (zzadk<zzafn>) new zzzd(this, zzagt, zzacd));
    }

    public final void zza(String str, zzagy zzagy, zzacd zzacd) {
        q.g(str);
        q.k(zzagy);
        q.k(zzacd);
        zza(str, (zzadk<zzafn>) new zzzb(this, zzagy, zzacd));
    }

    public final void zza(zzafz zzafz, zzacd zzacd) {
        this.zza.zza(zzafz, (zzadk<zzagb>) new zzzz(this, zzacd));
    }

    public final void zza(String str, e eVar, zzacd zzacd) {
        q.g(str);
        q.k(zzacd);
        zzafe zzafe = new zzafe(4);
        zzafe.zzd(str);
        if (eVar != null) {
            zzafe.zza(eVar);
        }
        zzb(zzafe, zzacd);
    }

    public final void zza(String str, e eVar, String str2, String str3, zzacd zzacd) {
        q.g(str);
        q.k(zzacd);
        zzafe zzafe = new zzafe(eVar.zza());
        zzafe.zzb(str);
        zzafe.zza(eVar);
        zzafe.zzc(str2);
        zzafe.zza(str3);
        this.zza.zza(zzafe, (zzadk<zzafh>) new zzyt(this, zzacd));
    }

    public final void zza(zzaga zzaga, zzacd zzacd) {
        q.g(zzaga.zzd());
        q.k(zzacd);
        this.zza.zza(zzaga, (zzadk<zzagd>) new zzyx(this, zzacd));
    }

    public final void zza(zzagt zzagt, zzacd zzacd) {
        q.k(zzagt);
        q.k(zzacd);
        zzagt.zzb(true);
        this.zza.zza(zzagt, (zzadk<zzagv>) new zzzm(this, zzacd));
    }

    public final void zza(zzagu zzagu, zzacd zzacd) {
        q.k(zzagu);
        q.k(zzacd);
        this.zza.zza(zzagu, (zzadk<zzagx>) new zzyv(this, zzacd));
    }

    public final void zza(j jVar, String str, zzacd zzacd) {
        q.k(jVar);
        q.k(zzacd);
        if (jVar.zzg()) {
            zza(jVar.zzb(), (zzadk<zzafn>) new zzyn(this, jVar, str, zzacd));
        } else {
            zza(new zzaep(jVar, (String) null, str), zzacd);
        }
    }

    public final void zza(zzagy zzagy, zzacd zzacd) {
        q.k(zzagy);
        q.k(zzacd);
        this.zza.zza(zzagy, (zzadk<zzahb>) new zzza(this, zzacd));
    }

    public final void zza(zzagg zzagg, zzacd zzacd) {
        q.k(zzagg);
        q.k(zzacd);
        this.zza.zza(zzagg, (zzadk<zzagj>) new zzzl(this, zzagg, zzacd));
    }

    public final void zza(zzagi zzagi, zzacd zzacd) {
        q.k(zzagi);
        q.k(zzacd);
        this.zza.zza(zzagi, (zzadk<zzagl>) new zzzp(this, zzacd));
    }

    public final void zza(String str, d1 d1Var, zzacd zzacd) {
        q.g(str);
        q.k(d1Var);
        q.k(zzacd);
        zza(str, (zzadk<zzafn>) new zzaac(this, d1Var, zzacd));
    }

    public final void zza(zzafe zzafe, zzacd zzacd) {
        zzb(zzafe, zzacd);
    }
}
