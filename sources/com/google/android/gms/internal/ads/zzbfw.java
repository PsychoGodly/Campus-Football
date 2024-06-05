package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbfw extends c {
    public zzbfw() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof zzbee ? (zzbee) queryLocalInterface : new zzbec(iBinder);
    }

    public final zzbeb zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder zze = ((zzbee) getRemoteCreatorInstance(context)).zze(b.B1(context), b.B1(frameLayout), b.B1(frameLayout2), ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof zzbeb ? (zzbeb) queryLocalInterface : new zzbdz(zze);
        } catch (RemoteException | c.a e10) {
            zzbza.zzk("Could not create remote NativeAdViewDelegate.", e10);
            return null;
        }
    }
}
