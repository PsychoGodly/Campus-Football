package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzbze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class p extends w {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f14519b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f14520c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ zzbnf f14521d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ v f14522e;

    p(v vVar, Context context, String str, zzbnf zzbnf) {
        this.f14522e = vVar;
        this.f14519b = context;
        this.f14520c = str;
        this.f14521d = zzbnf;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        v.r(this.f14519b, "native_ad");
        return new x3();
    }

    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) throws RemoteException {
        return f1Var.n1(b.B1(this.f14519b), this.f14520c, this.f14521d, ModuleDescriptor.MODULE_VERSION);
    }

    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        zzbar.zzc(this.f14519b);
        if (!((Boolean) a0.c().zzb(zzbar.zzjb)).booleanValue()) {
            return this.f14522e.f14576b.a(this.f14519b, this.f14520c, this.f14521d);
        }
        try {
            IBinder zze = ((r0) zzbze.zzb(this.f14519b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", o.f14516a)).zze(b.B1(this.f14519b), this.f14520c, this.f14521d, ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof q0 ? (q0) queryLocalInterface : new o0(zze);
        } catch (RemoteException | zzbzd | NullPointerException e10) {
            this.f14522e.f14582h = zzbsf.zza(this.f14519b);
            this.f14522e.f14582h.zzf(e10, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
