package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbij;
import com.google.android.gms.internal.ads.zzbis;
import com.google.android.gms.internal.ads.zzbiw;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzbze;
import r4.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class j extends w {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f14479b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzbnf f14480c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ b f14481d;

    j(v vVar, Context context, zzbnf zzbnf, b bVar) {
        this.f14479b = context;
        this.f14480c = zzbnf;
        this.f14481d = bVar;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a() {
        return new zzbiw();
    }

    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) throws RemoteException {
        return f1Var.T(com.google.android.gms.dynamic.b.B1(this.f14479b), this.f14480c, ModuleDescriptor.MODULE_VERSION, new zzbij(this.f14481d));
    }

    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        try {
            return ((zzbis) zzbze.zzb(this.f14479b, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", i.f14475a)).zze(com.google.android.gms.dynamic.b.B1(this.f14479b), this.f14480c, ModuleDescriptor.MODULE_VERSION, new zzbij(this.f14481d));
        } catch (RemoteException | zzbzd | NullPointerException unused) {
            return null;
        }
    }
}
