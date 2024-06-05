package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.common.internal.c;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbix extends c {
    zzbix(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(zzbub.zza(context), looper, 166, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof zzbje ? (zzbje) queryLocalInterface : new zzbje(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    public final zzbje zzp() throws DeadObjectException {
        return (zzbje) super.getService();
    }
}
