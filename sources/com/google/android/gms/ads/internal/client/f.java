package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzbze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class f extends w {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f14461b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzbnf f14462c;

    f(v vVar, Context context, zzbnf zzbnf) {
        this.f14461b = context;
        this.f14462c = zzbnf;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) throws RemoteException {
        return f1Var.u(b.B1(this.f14461b), this.f14462c, ModuleDescriptor.MODULE_VERSION);
    }

    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        try {
            return ((zzbxu) zzbze.zzb(this.f14461b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", e.f14458a)).zze(b.B1(this.f14461b), this.f14462c, ModuleDescriptor.MODULE_VERSION);
        } catch (RemoteException | zzbzd | NullPointerException unused) {
            return null;
        }
    }
}
