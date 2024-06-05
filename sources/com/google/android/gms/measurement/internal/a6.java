package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zznp;
import com.unity3d.services.UnityAdsConstants;
import h5.j;
import h5.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m5.r;
import r5.c;
import r5.h;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class a6 extends h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final va f24356a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f24357b;

    /* renamed from: c  reason: collision with root package name */
    private String f24358c;

    public a6(va vaVar) {
        this(vaVar, (String) null);
    }

    private final void A1(Runnable runnable) {
        q.k(runnable);
        if (this.f24356a.zzl().E()) {
            runnable.run();
        } else {
            this.f24356a.zzl().y(runnable);
        }
    }

    private final void C1(String str, boolean z10) {
        boolean z11;
        if (!TextUtils.isEmpty(str)) {
            if (z10) {
                try {
                    if (this.f24357b == null) {
                        if (!"com.google.android.gms".equals(this.f24358c) && !r.a(this.f24356a.zza(), Binder.getCallingUid())) {
                            if (!k.a(this.f24356a.zza()).c(Binder.getCallingUid())) {
                                z11 = false;
                                this.f24357b = Boolean.valueOf(z11);
                            }
                        }
                        z11 = true;
                        this.f24357b = Boolean.valueOf(z11);
                    }
                    if (this.f24357b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e10) {
                    this.f24356a.zzj().B().b("Measurement Service called with invalid calling package. appId", n4.q(str));
                    throw e10;
                }
            }
            if (this.f24358c == null && j.l(this.f24356a.zza(), Binder.getCallingUid(), str)) {
                this.f24358c = str;
            }
            if (!str.equals(this.f24358c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f24356a.zzj().B().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    private final void E1(lb lbVar, boolean z10) {
        q.k(lbVar);
        q.g(lbVar.f24779a);
        C1(lbVar.f24779a, false);
        this.f24356a.i0().e0(lbVar.f24780b, lbVar.f24795r);
    }

    private final void G1(d0 d0Var, lb lbVar) {
        this.f24356a.j0();
        this.f24356a.o(d0Var, lbVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void B1(String str, Bundle bundle) {
        this.f24356a.Z().c0(str, bundle);
    }

    /* access modifiers changed from: package-private */
    public final d0 D1(d0 d0Var, lb lbVar) {
        z zVar;
        boolean z10 = false;
        if (!(!"_cmp".equals(d0Var.f24457a) || (zVar = d0Var.f24458b) == null || zVar.zza() == 0)) {
            String z11 = d0Var.f24458b.z("_cis");
            if ("referrer broadcast".equals(z11) || "referrer API".equals(z11)) {
                z10 = true;
            }
        }
        if (!z10) {
            return d0Var;
        }
        this.f24356a.zzj().E().b("Event has been filtered ", d0Var.toString());
        return new d0("_cmpx", d0Var.f24458b, d0Var.f24459c, d0Var.f24460d);
    }

    /* access modifiers changed from: package-private */
    public final void F1(d0 d0Var, lb lbVar) {
        zzb zzb;
        if (!this.f24356a.c0().R(lbVar.f24779a)) {
            G1(d0Var, lbVar);
            return;
        }
        this.f24356a.zzj().F().b("EES config found for", lbVar.f24779a);
        i5 c02 = this.f24356a.c0();
        String str = lbVar.f24779a;
        if (TextUtils.isEmpty(str)) {
            zzb = null;
        } else {
            zzb = c02.f24673j.get(str);
        }
        if (zzb == null) {
            this.f24356a.zzj().F().b("EES not loaded for", lbVar.f24779a);
            G1(d0Var, lbVar);
            return;
        }
        boolean z10 = false;
        try {
            Map<String, Object> J = this.f24356a.h0().J(d0Var.f24458b.w(), true);
            String a10 = r5.r.a(d0Var.f24457a);
            if (a10 == null) {
                a10 = d0Var.f24457a;
            }
            z10 = zzb.zza(new zzad(a10, d0Var.f24460d, J));
        } catch (zzc unused) {
            this.f24356a.zzj().B().c("EES error. appId, eventName", lbVar.f24780b, d0Var.f24457a);
        }
        if (!z10) {
            this.f24356a.zzj().F().b("EES was not applied to event", d0Var.f24457a);
            G1(d0Var, lbVar);
            return;
        }
        if (zzb.zzd()) {
            this.f24356a.zzj().F().b("EES edited event", d0Var.f24457a);
            G1(this.f24356a.h0().B(zzb.zza().zzb()), lbVar);
        } else {
            G1(d0Var, lbVar);
        }
        if (zzb.zzc()) {
            for (zzad next : zzb.zza().zzc()) {
                this.f24356a.zzj().F().b("EES logging created event", next.zzb());
                G1(this.f24356a.h0().B(next), lbVar);
            }
        }
    }

    public final List<hb> G(String str, String str2, String str3, boolean z10) {
        C1(str, true);
        try {
            List<jb> list = (List) this.f24356a.zzl().r(new i6(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (jb jbVar : list) {
                if (z10 || !ib.C0(jbVar.f24733c)) {
                    arrayList.add(new hb(jbVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f24356a.zzj().B().c("Failed to get user properties as. appId", n4.q(str), e10);
            return Collections.emptyList();
        }
    }

    public final void L(lb lbVar) {
        q.g(lbVar.f24779a);
        q.k(lbVar.f24800w);
        m6 m6Var = new m6(this, lbVar);
        q.k(m6Var);
        if (this.f24356a.zzl().E()) {
            m6Var.run();
        } else {
            this.f24356a.zzl().B(m6Var);
        }
    }

    public final void M(Bundle bundle, lb lbVar) {
        E1(lbVar, false);
        String str = lbVar.f24779a;
        q.k(str);
        A1(new z5(this, str, bundle));
    }

    public final void N(lb lbVar) {
        E1(lbVar, false);
        A1(new c6(this, lbVar));
    }

    public final void O0(d dVar) {
        q.k(dVar);
        q.k(dVar.f24448c);
        q.g(dVar.f24446a);
        C1(dVar.f24446a, true);
        A1(new g6(this, new d(dVar)));
    }

    public final c S0(lb lbVar) {
        E1(lbVar, false);
        q.g(lbVar.f24779a);
        if (!zznp.zza()) {
            return new c((Bundle) null);
        }
        try {
            return (c) this.f24356a.zzl().w(new l6(this, lbVar)).get(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            this.f24356a.zzj().B().c("Failed to get consent. appId", n4.q(lbVar.f24779a), e10);
            return new c((Bundle) null);
        }
    }

    public final List<hb> Y0(String str, String str2, boolean z10, lb lbVar) {
        E1(lbVar, false);
        String str3 = lbVar.f24779a;
        q.k(str3);
        try {
            List<jb> list = (List) this.f24356a.zzl().r(new f6(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (jb jbVar : list) {
                if (z10 || !ib.C0(jbVar.f24733c)) {
                    arrayList.add(new hb(jbVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f24356a.zzj().B().c("Failed to query user properties. appId", n4.q(lbVar.f24779a), e10);
            return Collections.emptyList();
        }
    }

    public final String Z(lb lbVar) {
        E1(lbVar, false);
        return this.f24356a.M(lbVar);
    }

    public final void c1(d0 d0Var, String str, String str2) {
        q.k(d0Var);
        q.g(str);
        C1(str, true);
        A1(new n6(this, d0Var, str));
    }

    public final List<na> e1(lb lbVar, Bundle bundle) {
        E1(lbVar, false);
        q.k(lbVar.f24779a);
        try {
            return (List) this.f24356a.zzl().r(new t6(this, lbVar, bundle)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f24356a.zzj().B().c("Failed to get trigger URIs. appId", n4.q(lbVar.f24779a), e10);
            return Collections.emptyList();
        }
    }

    public final void h0(d0 d0Var, lb lbVar) {
        q.k(d0Var);
        E1(lbVar, false);
        A1(new o6(this, d0Var, lbVar));
    }

    public final List<hb> j1(lb lbVar, boolean z10) {
        E1(lbVar, false);
        String str = lbVar.f24779a;
        q.k(str);
        try {
            List<jb> list = (List) this.f24356a.zzl().r(new s6(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (jb jbVar : list) {
                if (z10 || !ib.C0(jbVar.f24733c)) {
                    arrayList.add(new hb(jbVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f24356a.zzj().B().c("Failed to get user properties. appId", n4.q(lbVar.f24779a), e10);
            return null;
        }
    }

    public final void l0(long j10, String str, String str2, String str3) {
        A1(new e6(this, str2, str3, str, j10));
    }

    public final List<d> n(String str, String str2, lb lbVar) {
        E1(lbVar, false);
        String str3 = lbVar.f24779a;
        q.k(str3);
        try {
            return (List) this.f24356a.zzl().r(new h6(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f24356a.zzj().B().b("Failed to get conditional user properties", e10);
            return Collections.emptyList();
        }
    }

    public final byte[] n0(d0 d0Var, String str) {
        q.g(str);
        q.k(d0Var);
        C1(str, true);
        this.f24356a.zzj().A().b("Log and bundle. event", this.f24356a.a0().c(d0Var.f24457a));
        long c10 = this.f24356a.zzb().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f24356a.zzl().w(new q6(this, d0Var, str)).get();
            if (bArr == null) {
                this.f24356a.zzj().B().b("Log and bundle returned null. appId", n4.q(str));
                bArr = new byte[0];
            }
            this.f24356a.zzj().A().d("Log and bundle processed. event, size, time_ms", this.f24356a.a0().c(d0Var.f24457a), Integer.valueOf(bArr.length), Long.valueOf((this.f24356a.zzb().c() / 1000000) - c10));
            return bArr;
        } catch (InterruptedException | ExecutionException e10) {
            this.f24356a.zzj().B().d("Failed to log and bundle. appId, event, error", n4.q(str), this.f24356a.a0().c(d0Var.f24457a), e10);
            return null;
        }
    }

    public final void p0(lb lbVar) {
        E1(lbVar, false);
        A1(new b6(this, lbVar));
    }

    public final List<d> q0(String str, String str2, String str3) {
        C1(str, true);
        try {
            return (List) this.f24356a.zzl().r(new k6(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f24356a.zzj().B().b("Failed to get conditional user properties as", e10);
            return Collections.emptyList();
        }
    }

    public final void r1(d dVar, lb lbVar) {
        q.k(dVar);
        q.k(dVar.f24448c);
        E1(lbVar, false);
        d dVar2 = new d(dVar);
        dVar2.f24446a = lbVar.f24779a;
        A1(new d6(this, dVar2, lbVar));
    }

    public final void s(lb lbVar) {
        q.g(lbVar.f24779a);
        C1(lbVar.f24779a, false);
        A1(new j6(this, lbVar));
    }

    public final void t1(hb hbVar, lb lbVar) {
        q.k(hbVar);
        E1(lbVar, false);
        A1(new p6(this, hbVar, lbVar));
    }

    private a6(va vaVar, String str) {
        q.k(vaVar);
        this.f24356a = vaVar;
        this.f24358c = null;
    }
}
