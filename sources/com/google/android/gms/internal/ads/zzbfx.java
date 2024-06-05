package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.c;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbfx extends c {
    public zzbfx() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof zzbek ? (zzbek) queryLocalInterface : new zzbei(iBinder);
    }

    public final zzbeh zza(View view, HashMap hashMap, HashMap hashMap2) {
        try {
            IBinder zze = ((zzbek) getRemoteCreatorInstance(view.getContext())).zze(b.B1(view), b.B1(hashMap), b.B1(hashMap2));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return queryLocalInterface instanceof zzbeh ? (zzbeh) queryLocalInterface : new zzbef(zze);
        } catch (RemoteException | c.a e10) {
            zzbza.zzk("Could not create remote NativeAdViewHolderDelegate.", e10);
            return null;
        }
    }
}
