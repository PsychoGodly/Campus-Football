package com.google.android.gms.internal.p001firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.c0;
import com.google.firebase.auth.d;
import com.google.firebase.auth.e;
import com.google.firebase.auth.h;
import com.google.firebase.auth.i;
import com.google.firebase.auth.j;
import com.google.firebase.auth.o0;
import com.google.firebase.auth.q0;
import com.google.firebase.auth.r0;
import com.google.firebase.auth.t0;
import com.google.firebase.auth.v0;
import com.google.firebase.auth.w0;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import d7.d1;
import d7.i0;
import d7.i1;
import d7.o;
import d7.t;
import d7.w;
import d7.y1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import y6.f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaai  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzaai extends zzadh {
    public zzaai(f fVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzacg(fVar, scheduledExecutorService);
        this.zzb = executor;
    }

    public final Task<Void> zza(f fVar, String str, String str2) {
        return zza((zzaah) new zzaah(str, str2).zza(fVar));
    }

    public final Task<d> zzb(f fVar, String str, String str2) {
        return zza((zzaak) new zzaak(str, str2).zza(fVar));
    }

    public final Task<v0> zzc(f fVar, String str, String str2) {
        return zza((zzaao) new zzaao(str, str2).zza(fVar));
    }

    public final Task<Void> zzd(f fVar, a0 a0Var, String str, d1 d1Var) {
        return zza((zzaby) new zzaby(str).zza(fVar).zza(a0Var).zza(d1Var).zza((w) d1Var));
    }

    public final Task<Void> zza(f fVar, String str, String str2, String str3) {
        return zza((zzaaj) new zzaaj(str, str2, str3).zza(fVar));
    }

    public final Task<Void> zzb(f fVar, a0 a0Var, h hVar, String str, d1 d1Var) {
        return zza((zzaay) new zzaay(hVar, str).zza(fVar).zza(a0Var).zza(d1Var).zza((w) d1Var));
    }

    public final Task<i> zzc(f fVar, a0 a0Var, h hVar, String str, d1 d1Var) {
        return zza((zzaax) new zzaax(hVar, str).zza(fVar).zza(a0Var).zza(d1Var).zza((w) d1Var));
    }

    public final Task<i> zza(f fVar, String str, String str2, String str3, String str4, i1 i1Var) {
        return zza((zzaam) new zzaam(str, str2, str3, str4).zza(fVar).zza(i1Var));
    }

    public final Task<String> zzd(f fVar, String str, String str2) {
        return zza((zzacc) new zzacc(str, str2).zza(fVar));
    }

    public final Task<i> zzb(f fVar, a0 a0Var, j jVar, String str, d1 d1Var) {
        return zza((zzaaz) new zzaaz(jVar, str).zza(fVar).zza(a0Var).zza(d1Var).zza((w) d1Var));
    }

    public final Task<Void> zzc(f fVar, a0 a0Var, String str, d1 d1Var) {
        return zza((zzabv) new zzabv(str).zza(fVar).zza(a0Var).zza(d1Var).zza((w) d1Var));
    }

    public final Task<Void> zza(a0 a0Var, t tVar) {
        return zza((zzaal) new zzaal().zza(a0Var).zza(tVar).zza((w) tVar));
    }

    public final Task<Void> zza(f fVar, r0 r0Var, a0 a0Var, String str, i1 i1Var) {
        zzadt.zza();
        zzaan zzaan = new zzaan(r0Var, a0Var.zze(), str, (String) null);
        zzaan.zza(fVar).zza(i1Var);
        return zza(zzaan);
    }

    public final Task<i> zzb(f fVar, a0 a0Var, String str, String str2, String str3, String str4, d1 d1Var) {
        return zza((zzabb) new zzabb(str, str2, str3, str4).zza(fVar).zza(a0Var).zza(d1Var).zza((w) d1Var));
    }

    public final Task<Void> zza(f fVar, w0 w0Var, a0 a0Var, String str, String str2, i1 i1Var) {
        zzaan zzaan = new zzaan(w0Var, a0Var.zze(), str, str2);
        zzaan.zza(fVar).zza(i1Var);
        return zza(zzaan);
    }

    public final Task<i> zzb(f fVar, a0 a0Var, o0 o0Var, String str, d1 d1Var) {
        zzadt.zza();
        return zza((zzabd) new zzabd(o0Var, str).zza(fVar).zza(a0Var).zza(d1Var).zza((w) d1Var));
    }

    public final Task<i> zza(f fVar, a0 a0Var, r0 r0Var, String str, i1 i1Var) {
        zzadt.zza();
        zzaaq zzaaq = new zzaaq(r0Var, str, (String) null);
        zzaaq.zza(fVar).zza(i1Var);
        if (a0Var != null) {
            zzaaq.zza(a0Var);
        }
        return zza(zzaaq);
    }

    public final Task<Void> zzb(f fVar, String str, e eVar, String str2, String str3) {
        eVar.I(6);
        return zza((zzabh) new zzabh(str, eVar, str2, str3, "sendSignInLinkToEmail").zza(fVar));
    }

    public final Task<i> zza(f fVar, a0 a0Var, w0 w0Var, String str, String str2, i1 i1Var) {
        zzaaq zzaaq = new zzaaq(w0Var, str, str2);
        zzaaq.zza(fVar).zza(i1Var);
        if (a0Var != null) {
            zzaaq.zza(a0Var);
        }
        return zza(zzaaq);
    }

    public final Task<i> zzb(f fVar, String str, String str2, String str3, String str4, i1 i1Var) {
        return zza((zzabo) new zzabo(str, str2, str3, str4).zza(fVar).zza(i1Var));
    }

    public final Task<c0> zza(f fVar, a0 a0Var, String str, d1 d1Var) {
        return zza((zzaap) new zzaap(str).zza(fVar).zza(a0Var).zza(d1Var).zza((w) d1Var));
    }

    public final Task<i> zzb(f fVar, a0 a0Var, String str, d1 d1Var) {
        q.k(fVar);
        q.g(str);
        q.k(a0Var);
        q.k(d1Var);
        List<String> q02 = a0Var.q0();
        if ((q02 != null && !q02.contains(str)) || a0Var.C()) {
            return Tasks.forException(zzacf.zza(new Status(17016, str)));
        }
        str.hashCode();
        if (!str.equals(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD)) {
            return zza((zzabw) new zzabw(str).zza(fVar).zza(a0Var).zza(d1Var).zza((w) d1Var));
        }
        return zza((zzabt) new zzabt().zza(fVar).zza(a0Var).zza(d1Var).zza((w) d1Var));
    }

    public final Task<zzafj> zza() {
        return zza(new zzaas());
    }

    public final Task<zzafk> zza(String str, String str2) {
        return zza(new zzaar(str, str2));
    }

    public final Task<i> zza(f fVar, a0 a0Var, h hVar, String str, d1 d1Var) {
        q.k(fVar);
        q.k(hVar);
        q.k(a0Var);
        q.k(d1Var);
        List<String> q02 = a0Var.q0();
        if (q02 != null && q02.contains(hVar.v())) {
            return Tasks.forException(zzacf.zza(new Status(17015)));
        }
        if (hVar instanceof j) {
            j jVar = (j) hVar;
            if (!jVar.zzf()) {
                return zza((zzaau) new zzaau(jVar, str).zza(fVar).zza(a0Var).zza(d1Var).zza((w) d1Var));
            }
            return zza((zzaav) new zzaav(jVar).zza(fVar).zza(a0Var).zza(d1Var).zza((w) d1Var));
        } else if (hVar instanceof o0) {
            zzadt.zza();
            return zza((zzaaw) new zzaaw((o0) hVar).zza(fVar).zza(a0Var).zza(d1Var).zza((w) d1Var));
        } else {
            q.k(fVar);
            q.k(hVar);
            q.k(a0Var);
            q.k(d1Var);
            return zza((zzaat) new zzaat(hVar).zza(fVar).zza(a0Var).zza(d1Var).zza((w) d1Var));
        }
    }

    public final Task<Void> zza(f fVar, a0 a0Var, j jVar, String str, d1 d1Var) {
        return zza((zzaba) new zzaba(jVar, str).zza(fVar).zza(a0Var).zza(d1Var).zza((w) d1Var));
    }

    public final Task<Void> zza(f fVar, a0 a0Var, String str, String str2, String str3, String str4, d1 d1Var) {
        return zza((zzabc) new zzabc(str, str2, str3, str4).zza(fVar).zza(a0Var).zza(d1Var).zza((w) d1Var));
    }

    public final Task<Void> zza(f fVar, a0 a0Var, o0 o0Var, String str, d1 d1Var) {
        zzadt.zza();
        return zza((zzabe) new zzabe(o0Var, str).zza(fVar).zza(a0Var).zza(d1Var).zza((w) d1Var));
    }

    public final Task<Void> zza(f fVar, a0 a0Var, d1 d1Var) {
        return zza((zzabg) new zzabg().zza(fVar).zza(a0Var).zza(d1Var).zza((w) d1Var));
    }

    public final Task<Void> zza(String str, String str2, String str3, String str4) {
        return zza(new zzabf(str, str2, str3, str4));
    }

    public final Task<Void> zza(f fVar, e eVar, String str) {
        return zza((zzabi) new zzabi(str, eVar).zza(fVar));
    }

    public final Task<Void> zza(f fVar, String str, e eVar, String str2, String str3) {
        eVar.I(1);
        return zza((zzabh) new zzabh(str, eVar, str2, str3, "sendPasswordResetEmail").zza(fVar));
    }

    public final Task<Void> zza(String str) {
        return zza(new zzabk(str));
    }

    public final Task<i> zza(f fVar, i1 i1Var, String str) {
        return zza((zzabj) new zzabj(str).zza(fVar).zza(i1Var));
    }

    public final Task<i> zza(f fVar, h hVar, String str, i1 i1Var) {
        return zza((zzabm) new zzabm(hVar, str).zza(fVar).zza(i1Var));
    }

    public final Task<i> zza(f fVar, String str, String str2, i1 i1Var) {
        return zza((zzabl) new zzabl(str, str2).zza(fVar).zza(i1Var));
    }

    public final Task<i> zza(f fVar, j jVar, String str, i1 i1Var) {
        return zza((zzabn) new zzabn(jVar, str).zza(fVar).zza(i1Var));
    }

    public final Task<i> zza(f fVar, o0 o0Var, String str, i1 i1Var) {
        zzadt.zza();
        return zza((zzabq) new zzabq(o0Var, str).zza(fVar).zza(i1Var));
    }

    public final Task<Void> zza(o oVar, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12, q0.b bVar, Executor executor, Activity activity) {
        zzabp zzabp = new zzabp(oVar, str, str2, j10, z10, z11, str3, str4, z12);
        String str5 = str;
        zzabp.zza(bVar, activity, executor, str);
        return zza(zzabp);
    }

    public final Task<zzagj> zza(o oVar, String str) {
        return zza(new zzabs(oVar, str));
    }

    public final Task<Void> zza(o oVar, t0 t0Var, String str, long j10, boolean z10, boolean z11, String str2, String str3, boolean z12, q0.b bVar, Executor executor, Activity activity) {
        zzabr zzabr = new zzabr(t0Var, q.g(oVar.zzc()), str, j10, z10, z11, str2, str3, z12);
        Activity activity2 = activity;
        zzabr.zza(bVar, activity2, executor, t0Var.c());
        return zza(zzabr);
    }

    public final Task<Void> zza(f fVar, a0 a0Var, String str, String str2, d1 d1Var) {
        return zza((zzabu) new zzabu(a0Var.zze(), str, str2).zza(fVar).zza(a0Var).zza(d1Var).zza((w) d1Var));
    }

    public final Task<Void> zza(f fVar, a0 a0Var, o0 o0Var, d1 d1Var) {
        zzadt.zza();
        return zza((zzabx) new zzabx(o0Var).zza(fVar).zza(a0Var).zza(d1Var).zza((w) d1Var));
    }

    public final Task<Void> zza(f fVar, a0 a0Var, com.google.firebase.auth.d1 d1Var, d1 d1Var2) {
        return zza((zzaca) new zzaca(d1Var).zza(fVar).zza(a0Var).zza(d1Var2).zza((w) d1Var2));
    }

    public final Task<Void> zza(String str, String str2, e eVar) {
        eVar.I(7);
        return zza(new zzabz(str, str2, eVar));
    }

    static d7.d zza(f fVar, zzafc zzafc) {
        q.k(fVar);
        q.k(zzafc);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new y1(zzafc, "firebase"));
        List<zzafs> zzl = zzafc.zzl();
        if (zzl != null && !zzl.isEmpty()) {
            for (int i10 = 0; i10 < zzl.size(); i10++) {
                arrayList.add(new y1(zzl.get(i10)));
            }
        }
        d7.d dVar = new d7.d(fVar, arrayList);
        dVar.t0(new d7.f(zzafc.zzb(), zzafc.zza()));
        dVar.u0(zzafc.zzn());
        dVar.s0(zzafc.zze());
        dVar.o0(i0.b(zzafc.zzk()));
        dVar.v0(zzafc.zzd());
        return dVar;
    }

    public final void zza(f fVar, zzaga zzaga, q0.b bVar, Activity activity, Executor executor) {
        zza((zzacb) new zzacb(zzaga).zza(fVar).zza(bVar, activity, executor, zzaga.zzd()));
    }
}
