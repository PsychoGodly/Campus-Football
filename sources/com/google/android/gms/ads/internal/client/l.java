package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbnf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class l extends w {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f14488b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ z4 f14489c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f14490d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzbnf f14491e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ v f14492f;

    l(v vVar, Context context, z4 z4Var, String str, zzbnf zzbnf) {
        this.f14492f = vVar;
        this.f14488b = context;
        this.f14489c = z4Var;
        this.f14490d = str;
        this.f14491e = zzbnf;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        v.r(this.f14488b, "app_open");
        return new z3();
    }

    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) throws RemoteException {
        return f1Var.t0(b.B1(this.f14488b), this.f14489c, this.f14490d, this.f14491e, ModuleDescriptor.MODULE_VERSION);
    }

    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        return this.f14492f.f14575a.a(this.f14488b, this.f14489c, this.f14490d, this.f14491e, 4);
    }
}
