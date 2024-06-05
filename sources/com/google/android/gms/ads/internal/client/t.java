package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbea;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzbze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class t extends w {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FrameLayout f14540b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FrameLayout f14541c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Context f14542d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ v f14543e;

    t(v vVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f14543e = vVar;
        this.f14540b = frameLayout;
        this.f14541c = frameLayout2;
        this.f14542d = context;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        v.r(this.f14542d, "native_ad_view_delegate");
        return new c4();
    }

    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) throws RemoteException {
        return f1Var.I0(b.B1(this.f14540b), b.B1(this.f14541c));
    }

    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        zzbar.zzc(this.f14542d);
        if (!((Boolean) a0.c().zzb(zzbar.zzjb)).booleanValue()) {
            return this.f14543e.f14578d.zza(this.f14542d, this.f14540b, this.f14541c);
        }
        try {
            return zzbea.zzbx(((zzbee) zzbze.zzb(this.f14542d, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", s.f14535a)).zze(b.B1(this.f14542d), b.B1(this.f14540b), b.B1(this.f14541c), ModuleDescriptor.MODULE_VERSION));
        } catch (RemoteException | zzbzd | NullPointerException e10) {
            this.f14543e.f14582h = zzbsf.zza(this.f14542d);
            this.f14543e.f14582h.zzf(e10, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
