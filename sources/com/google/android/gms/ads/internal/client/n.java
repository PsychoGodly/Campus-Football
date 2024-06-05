package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbnf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class n extends w {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f14508b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ z4 f14509c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f14510d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzbnf f14511e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ v f14512f;

    n(v vVar, Context context, z4 z4Var, String str, zzbnf zzbnf) {
        this.f14512f = vVar;
        this.f14508b = context;
        this.f14509c = z4Var;
        this.f14510d = str;
        this.f14511e = zzbnf;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        v.r(this.f14508b, "interstitial");
        return new z3();
    }

    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) throws RemoteException {
        return f1Var.S(b.B1(this.f14508b), this.f14509c, this.f14510d, this.f14511e, ModuleDescriptor.MODULE_VERSION);
    }

    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        return this.f14512f.f14575a.a(this.f14508b, this.f14509c, this.f14510d, this.f14511e, 2);
    }
}
