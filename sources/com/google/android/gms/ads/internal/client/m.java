package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbnf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class m extends w {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f14494b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ z4 f14495c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f14496d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ v f14497e;

    m(v vVar, Context context, z4 z4Var, String str) {
        this.f14497e = vVar;
        this.f14494b = context;
        this.f14495c = z4Var;
        this.f14496d = str;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        v.r(this.f14494b, AppLovinEventTypes.USER_EXECUTED_SEARCH);
        return new z3();
    }

    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) throws RemoteException {
        return f1Var.z0(b.B1(this.f14494b), this.f14495c, this.f14496d, ModuleDescriptor.MODULE_VERSION);
    }

    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        return this.f14497e.f14575a.a(this.f14494b, this.f14495c, this.f14496d, (zzbnf) null, 3);
    }
}
