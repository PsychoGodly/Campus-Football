package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbqz extends c {
    public zzbqz() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof zzbrf ? (zzbrf) queryLocalInterface : new zzbrd(iBinder);
    }

    public final zzbrc zza(Activity activity) {
        try {
            IBinder zze = ((zzbrf) getRemoteCreatorInstance(activity)).zze(b.B1(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof zzbrc ? (zzbrc) queryLocalInterface : new zzbra(zze);
        } catch (RemoteException e10) {
            zzbza.zzk("Could not create remote AdOverlay.", e10);
            return null;
        } catch (c.a e11) {
            zzbza.zzk("Could not create remote AdOverlay.", e11);
            return null;
        }
    }
}
