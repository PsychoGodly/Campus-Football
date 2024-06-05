package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbza;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class r4 extends c {
    public r4() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public final q0 a(Context context, String str, zzbnf zzbnf) {
        try {
            IBinder zze = ((r0) getRemoteCreatorInstance(context)).zze(b.B1(context), str, zzbnf, ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof q0 ? (q0) queryLocalInterface : new o0(zze);
        } catch (RemoteException | c.a e10) {
            zzbza.zzk("Could not create remote builder for AdLoader.", e10);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof r0 ? (r0) queryLocalInterface : new r0(iBinder);
    }
}
