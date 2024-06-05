package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzcv;
import h5.j;
import i5.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m5.e;
import r5.c;
import r5.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class v8 extends y2 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final s9 f25131c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public i f25132d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Boolean f25133e;

    /* renamed from: f  reason: collision with root package name */
    private final u f25134f;

    /* renamed from: g  reason: collision with root package name */
    private final oa f25135g;

    /* renamed from: h  reason: collision with root package name */
    private final List<Runnable> f25136h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final u f25137i;

    protected v8(w5 w5Var) {
        super(w5Var);
        this.f25135g = new oa(w5Var.zzb());
        this.f25131c = new s9(this);
        this.f25134f = new y8(this, w5Var);
        this.f25137i = new h9(this, w5Var);
    }

    static /* synthetic */ void F(v8 v8Var, ComponentName componentName) {
        v8Var.i();
        if (v8Var.f25132d != null) {
            v8Var.f25132d = null;
            v8Var.zzj().F().b("Disconnected from device MeasurementService", componentName);
            v8Var.i();
            v8Var.T();
        }
    }

    private final void I(Runnable runnable) throws IllegalStateException {
        i();
        if (X()) {
            runnable.run();
        } else if (((long) this.f25136h.size()) >= 1000) {
            zzj().B().a("Discarding data. Max runnable queue size reached");
        } else {
            this.f25136h.add(runnable);
            this.f25137i.b(60000);
            T();
        }
    }

    /* access modifiers changed from: private */
    public final void a0() {
        i();
        zzj().F().b("Processing queued up service tasks", Integer.valueOf(this.f25136h.size()));
        for (Runnable run : this.f25136h) {
            try {
                run.run();
            } catch (RuntimeException e10) {
                zzj().B().b("Task exception while flushing queue", e10);
            }
        }
        this.f25136h.clear();
        this.f25137i.a();
    }

    /* access modifiers changed from: private */
    public final void b0() {
        i();
        this.f25135g.c();
        this.f25134f.b(e0.L.a(null).longValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean c0() {
        /*
            r5 = this;
            r5.i()
            r5.q()
            java.lang.Boolean r0 = r5.f25133e
            if (r0 != 0) goto L_0x0101
            r5.i()
            r5.q()
            com.google.android.gms.measurement.internal.y4 r0 = r5.e()
            java.lang.Boolean r0 = r0.F()
            r1 = 1
            if (r0 == 0) goto L_0x0023
            boolean r2 = r0.booleanValue()
            if (r2 == 0) goto L_0x0023
            goto L_0x00fb
        L_0x0023:
            com.google.android.gms.measurement.internal.i4 r2 = r5.k()
            int r2 = r2.x()
            r3 = 0
            if (r2 != r1) goto L_0x0031
        L_0x002e:
            r0 = 1
            goto L_0x00d7
        L_0x0031:
            com.google.android.gms.measurement.internal.n4 r2 = r5.zzj()
            com.google.android.gms.measurement.internal.p4 r2 = r2.F()
            java.lang.String r4 = "Checking service availability"
            r2.a(r4)
            com.google.android.gms.measurement.internal.ib r2 = r5.f()
            r4 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.p(r4)
            if (r2 == 0) goto L_0x00c8
            if (r2 == r1) goto L_0x00b8
            r4 = 2
            if (r2 == r4) goto L_0x0098
            r0 = 3
            if (r2 == r0) goto L_0x0089
            r0 = 9
            if (r2 == r0) goto L_0x007b
            r0 = 18
            if (r2 == r0) goto L_0x006d
            com.google.android.gms.measurement.internal.n4 r0 = r5.zzj()
            com.google.android.gms.measurement.internal.p4 r0 = r0.G()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "Unexpected service status"
            r0.b(r2, r1)
            goto L_0x0096
        L_0x006d:
            com.google.android.gms.measurement.internal.n4 r0 = r5.zzj()
            com.google.android.gms.measurement.internal.p4 r0 = r0.G()
            java.lang.String r2 = "Service updating"
            r0.a(r2)
            goto L_0x002e
        L_0x007b:
            com.google.android.gms.measurement.internal.n4 r0 = r5.zzj()
            com.google.android.gms.measurement.internal.p4 r0 = r0.G()
            java.lang.String r1 = "Service invalid"
            r0.a(r1)
            goto L_0x0096
        L_0x0089:
            com.google.android.gms.measurement.internal.n4 r0 = r5.zzj()
            com.google.android.gms.measurement.internal.p4 r0 = r0.G()
            java.lang.String r1 = "Service disabled"
            r0.a(r1)
        L_0x0096:
            r0 = 0
            goto L_0x00c6
        L_0x0098:
            com.google.android.gms.measurement.internal.n4 r2 = r5.zzj()
            com.google.android.gms.measurement.internal.p4 r2 = r2.A()
            java.lang.String r4 = "Service container out of date"
            r2.a(r4)
            com.google.android.gms.measurement.internal.ib r2 = r5.f()
            int r2 = r2.B0()
            r4 = 17443(0x4423, float:2.4443E-41)
            if (r2 >= r4) goto L_0x00b2
            goto L_0x00c5
        L_0x00b2:
            if (r0 != 0) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r1 = 0
        L_0x00b6:
            r0 = 0
            goto L_0x00d7
        L_0x00b8:
            com.google.android.gms.measurement.internal.n4 r0 = r5.zzj()
            com.google.android.gms.measurement.internal.p4 r0 = r0.F()
            java.lang.String r2 = "Service missing"
            r0.a(r2)
        L_0x00c5:
            r0 = 1
        L_0x00c6:
            r1 = 0
            goto L_0x00d7
        L_0x00c8:
            com.google.android.gms.measurement.internal.n4 r0 = r5.zzj()
            com.google.android.gms.measurement.internal.p4 r0 = r0.F()
            java.lang.String r2 = "Service available"
            r0.a(r2)
            goto L_0x002e
        L_0x00d7:
            if (r1 != 0) goto L_0x00f1
            com.google.android.gms.measurement.internal.f r2 = r5.a()
            boolean r2 = r2.N()
            if (r2 == 0) goto L_0x00f1
            com.google.android.gms.measurement.internal.n4 r0 = r5.zzj()
            com.google.android.gms.measurement.internal.p4 r0 = r0.B()
            java.lang.String r2 = "No way to upload. Consider using the full version of Analytics"
            r0.a(r2)
            goto L_0x00f2
        L_0x00f1:
            r3 = r0
        L_0x00f2:
            if (r3 == 0) goto L_0x00fb
            com.google.android.gms.measurement.internal.y4 r0 = r5.e()
            r0.r(r1)
        L_0x00fb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.f25133e = r0
        L_0x0101:
            java.lang.Boolean r0 = r5.f25133e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.v8.c0():boolean");
    }

    private final lb e0(boolean z10) {
        return k().w(z10 ? zzj().J() : null);
    }

    static /* synthetic */ void g0(v8 v8Var) {
        v8Var.i();
        if (v8Var.X()) {
            v8Var.zzj().F().a("Inactivity, disconnecting from the service");
            v8Var.U();
        }
    }

    /* access modifiers changed from: protected */
    public final void A(zzcv zzcv, String str, String str2) {
        i();
        q();
        I(new q9(this, str, str2, e0(false), zzcv));
    }

    /* access modifiers changed from: protected */
    public final void B(zzcv zzcv, String str, String str2, boolean z10) {
        i();
        q();
        I(new x8(this, str, str2, e0(false), z10, zzcv));
    }

    /* access modifiers changed from: protected */
    public final void C(d dVar) {
        q.k(dVar);
        i();
        q();
        I(new o9(this, true, e0(true), l().z(dVar), new d(dVar), dVar));
    }

    /* access modifiers changed from: protected */
    public final void D(d0 d0Var, String str) {
        q.k(d0Var);
        i();
        q();
        I(new l9(this, true, e0(true), l().A(d0Var), d0Var, str));
    }

    /* access modifiers changed from: protected */
    public final void E(p8 p8Var) {
        i();
        q();
        I(new e9(this, p8Var));
    }

    /* access modifiers changed from: protected */
    public final void H(hb hbVar) {
        i();
        q();
        I(new b9(this, e0(true), l().B(hbVar), hbVar));
    }

    public final void J(AtomicReference<String> atomicReference) {
        i();
        q();
        I(new d9(this, atomicReference, e0(false)));
    }

    /* access modifiers changed from: protected */
    public final void K(AtomicReference<List<na>> atomicReference, Bundle bundle) {
        i();
        q();
        I(new z8(this, atomicReference, e0(false), bundle));
    }

    /* access modifiers changed from: protected */
    public final void L(AtomicReference<List<d>> atomicReference, String str, String str2, String str3) {
        i();
        q();
        I(new n9(this, atomicReference, str, str2, str3, e0(false)));
    }

    /* access modifiers changed from: protected */
    public final void M(AtomicReference<List<hb>> atomicReference, String str, String str2, String str3, boolean z10) {
        i();
        q();
        I(new p9(this, atomicReference, str, str2, str3, e0(false), z10));
    }

    /* access modifiers changed from: protected */
    public final void N(i iVar) {
        i();
        q.k(iVar);
        this.f25132d = iVar;
        b0();
        a0();
    }

    /* access modifiers changed from: package-private */
    public final void O(i iVar, a aVar, lb lbVar) {
        int i10;
        i();
        q();
        int i11 = 0;
        int i12 = 100;
        while (i11 < 1001 && i12 == 100) {
            ArrayList arrayList = new ArrayList();
            List<a> x10 = l().x(100);
            if (x10 != null) {
                arrayList.addAll(x10);
                i10 = x10.size();
            } else {
                i10 = 0;
            }
            if (aVar != null && i10 < 100) {
                arrayList.add(aVar);
            }
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                a aVar2 = (a) obj;
                if (aVar2 instanceof d0) {
                    try {
                        iVar.h0((d0) aVar2, lbVar);
                    } catch (RemoteException e10) {
                        zzj().B().b("Failed to send event to the service", e10);
                    }
                } else if (aVar2 instanceof hb) {
                    try {
                        iVar.t1((hb) aVar2, lbVar);
                    } catch (RemoteException e11) {
                        zzj().B().b("Failed to send user property to the service", e11);
                    }
                } else if (aVar2 instanceof d) {
                    try {
                        iVar.r1((d) aVar2, lbVar);
                    } catch (RemoteException e12) {
                        zzj().B().b("Failed to send conditional user property to the service", e12);
                    }
                } else {
                    zzj().B().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i11++;
            i12 = i10;
        }
    }

    /* access modifiers changed from: protected */
    public final void P(boolean z10) {
        i();
        q();
        if (z10) {
            l().C();
        }
        if (Z()) {
            I(new m9(this, e0(false)));
        }
    }

    /* access modifiers changed from: protected */
    public final c Q() {
        i();
        q();
        i iVar = this.f25132d;
        if (iVar == null) {
            T();
            zzj().A().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        lb e02 = e0(false);
        q.k(e02);
        try {
            c S0 = iVar.S0(e02);
            b0();
            return S0;
        } catch (RemoteException e10) {
            zzj().B().b("Failed to get consents; remote exception", e10);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final Boolean R() {
        return this.f25133e;
    }

    /* access modifiers changed from: protected */
    public final void S() {
        i();
        q();
        lb e02 = e0(true);
        l().D();
        I(new g9(this, e02));
    }

    /* access modifiers changed from: package-private */
    public final void T() {
        i();
        q();
        if (!X()) {
            if (c0()) {
                this.f25131c.a();
            } else if (!a().N()) {
                List<ResolveInfo> queryIntentServices = zza().getPackageManager().queryIntentServices(new Intent().setClassName(zza(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    intent.setComponent(new ComponentName(zza(), "com.google.android.gms.measurement.AppMeasurementService"));
                    this.f25131c.b(intent);
                    return;
                }
                zzj().B().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
        }
    }

    public final void U() {
        i();
        q();
        this.f25131c.d();
        try {
            l5.a.b().c(zza(), this.f25131c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f25132d = null;
    }

    /* access modifiers changed from: protected */
    public final void V() {
        i();
        q();
        lb e02 = e0(false);
        l().C();
        I(new a9(this, e02));
    }

    /* access modifiers changed from: protected */
    public final void W() {
        i();
        q();
        I(new j9(this, e0(true)));
    }

    public final boolean X() {
        i();
        q();
        return this.f25132d != null;
    }

    /* access modifiers changed from: package-private */
    public final boolean Y() {
        i();
        q();
        if (c0() && f().B0() < 200900) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean Z() {
        i();
        q();
        if (c0() && f().B0() < e0.f24527r0.a(null).intValue()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ y c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ m4 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final /* bridge */ /* synthetic */ x j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ i4 k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ l4 l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ b7 m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ o8 n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ v8 o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ da p() {
        return super.p();
    }

    /* access modifiers changed from: protected */
    public final boolean v() {
        return false;
    }

    public final void x(Bundle bundle) {
        i();
        q();
        I(new i9(this, e0(false), bundle));
    }

    public final void y(zzcv zzcv) {
        i();
        q();
        I(new c9(this, e0(false), zzcv));
    }

    public final void z(zzcv zzcv, d0 d0Var, String str) {
        i();
        q();
        if (f().p(j.f18843a) != 0) {
            zzj().G().a("Not bundling data. Service unavailable or out of date");
            f().P(zzcv, new byte[0]);
            return;
        }
        I(new k9(this, d0Var, str, zzcv));
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ e zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ n4 zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ q5 zzl() {
        return super.zzl();
    }
}
