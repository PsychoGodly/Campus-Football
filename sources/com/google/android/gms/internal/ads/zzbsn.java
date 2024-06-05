package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.common.internal.c;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbsn extends c {
    public zzbsn(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(zzbub.zza(context), looper, 8, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof zzbsz ? (zzbsz) queryLocalInterface : new zzbsx(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }

    public final zzbsz zzp() throws DeadObjectException {
        return (zzbsz) super.getService();
    }
}
