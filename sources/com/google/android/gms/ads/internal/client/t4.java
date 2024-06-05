package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzbze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class t4 extends c {

    /* renamed from: a  reason: collision with root package name */
    private zzbsh f14544a;

    public t4() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final u0 a(Context context, z4 z4Var, String str, zzbnf zzbnf, int i10) {
        zzbar.zzc(context);
        if (((Boolean) a0.c().zzb(zzbar.zzjb)).booleanValue()) {
            try {
                IBinder M0 = ((v0) zzbze.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", s4.f14539a)).M0(b.B1(context), z4Var, str, zzbnf, ModuleDescriptor.MODULE_VERSION, i10);
                if (M0 == null) {
                    return null;
                }
                IInterface queryLocalInterface = M0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof u0 ? (u0) queryLocalInterface : new s0(M0);
            } catch (RemoteException | zzbzd | NullPointerException e10) {
                zzbsh zza = zzbsf.zza(context);
                this.f14544a = zza;
                zza.zzf(e10, "AdManagerCreator.newAdManagerByDynamiteLoader");
                zzbza.zzl("#007 Could not call remote method.", e10);
                return null;
            }
        } else {
            try {
                IBinder M02 = ((v0) getRemoteCreatorInstance(context)).M0(b.B1(context), z4Var, str, zzbnf, ModuleDescriptor.MODULE_VERSION, i10);
                if (M02 == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = M02.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface2 instanceof u0 ? (u0) queryLocalInterface2 : new s0(M02);
            } catch (RemoteException | c.a e11) {
                zzbza.zzf("Could not create remote AdManager.", e11);
                return null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof v0 ? (v0) queryLocalInterface : new v0(iBinder);
    }
}
