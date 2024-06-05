package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbza;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class t3 extends c {
    public t3() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    public final p1 a(Context context) {
        try {
            IBinder M0 = ((q1) getRemoteCreatorInstance(context)).M0(b.B1(context), ModuleDescriptor.MODULE_VERSION);
            if (M0 == null) {
                return null;
            }
            IInterface queryLocalInterface = M0.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof p1 ? (p1) queryLocalInterface : new n1(M0);
        } catch (RemoteException | c.a e10) {
            zzbza.zzk("Could not get remote MobileAdsSettingManager.", e10);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof q1 ? (q1) queryLocalInterface : new q1(iBinder);
    }
}
