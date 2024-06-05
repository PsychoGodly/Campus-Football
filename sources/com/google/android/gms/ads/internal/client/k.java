package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbnf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class k extends w {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f14482b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ z4 f14483c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f14484d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzbnf f14485e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ v f14486f;

    k(v vVar, Context context, z4 z4Var, String str, zzbnf zzbnf) {
        this.f14486f = vVar;
        this.f14482b = context;
        this.f14483c = z4Var;
        this.f14484d = str;
        this.f14485e = zzbnf;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        v.r(this.f14482b, "banner");
        return new z3();
    }

    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) throws RemoteException {
        return f1Var.y(b.B1(this.f14482b), this.f14483c, this.f14484d, this.f14485e, ModuleDescriptor.MODULE_VERSION);
    }

    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        return this.f14486f.f14575a.a(this.f14482b, this.f14483c, this.f14484d, this.f14485e, 1);
    }
}
