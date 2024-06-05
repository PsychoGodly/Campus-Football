package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.common.internal.c;
import h5.d;
import m5.b;
import n4.i0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzavp extends c {
    zzavp(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(zzbub.zza(context), looper, 123, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof zzavs ? (zzavs) queryLocalInterface : new zzavs(iBinder);
    }

    public final d[] getApiFeatures() {
        return i0.f20951b;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean zzp() {
        return ((Boolean) a0.c().zzb(zzbar.zzbG)).booleanValue() && b.b(getAvailableFeatures(), i0.f20950a);
    }

    public final zzavs zzq() throws DeadObjectException {
        return (zzavs) super.getService();
    }
}
