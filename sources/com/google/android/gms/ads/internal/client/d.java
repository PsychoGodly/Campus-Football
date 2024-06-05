package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzbze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class d extends w {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f14432b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzbnf f14433c;

    d(v vVar, Context context, zzbnf zzbnf) {
        this.f14432b = context;
        this.f14433c = zzbnf;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        v.r(this.f14432b, "out_of_context_tester");
        return null;
    }

    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) throws RemoteException {
        a B1 = b.B1(this.f14432b);
        zzbar.zzc(this.f14432b);
        if (((Boolean) a0.c().zzb(zzbar.zziC)).booleanValue()) {
            return f1Var.o(B1, this.f14433c, ModuleDescriptor.MODULE_VERSION);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        a B1 = b.B1(this.f14432b);
        zzbar.zzc(this.f14432b);
        if (!((Boolean) a0.c().zzb(zzbar.zziC)).booleanValue()) {
            return null;
        }
        try {
            return ((m2) zzbze.zzb(this.f14432b, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", c.f14426a)).M0(B1, this.f14433c, ModuleDescriptor.MODULE_VERSION);
        } catch (RemoteException | zzbzd | NullPointerException e10) {
            zzbsf.zza(this.f14432b).zzf(e10, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }
}
