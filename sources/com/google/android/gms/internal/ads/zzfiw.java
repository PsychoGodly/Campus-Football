package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.common.internal.c;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfiw extends c {
    private final int zze;

    public zzfiw(Context context, Looper looper, c.a aVar, c.b bVar, int i10) {
        super(context, looper, 116, aVar, bVar, (String) null);
        this.zze = i10;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof zzfjb ? (zzfjb) queryLocalInterface : new zzfjb(iBinder);
    }

    public final int getMinApkVersion() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }

    public final zzfjb zzp() throws DeadObjectException {
        return (zzfjb) super.getService();
    }
}
