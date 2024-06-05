package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbvi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class u extends w {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f14545b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f14546c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ zzbnf f14547d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ v f14548e;

    u(v vVar, Context context, String str, zzbnf zzbnf) {
        this.f14548e = vVar;
        this.f14545b = context;
        this.f14546c = str;
        this.f14547d = zzbnf;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        v.r(this.f14545b, "rewarded");
        return new f4();
    }

    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) throws RemoteException {
        return f1Var.s0(b.B1(this.f14545b), this.f14546c, this.f14547d, ModuleDescriptor.MODULE_VERSION);
    }

    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        return zzbvi.zza(this.f14545b, this.f14546c, this.f14547d);
    }
}
