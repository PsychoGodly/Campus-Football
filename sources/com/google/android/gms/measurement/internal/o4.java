package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.c;
import h5.j;
import r5.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class o4 extends c<i> {
    public o4(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(context, looper, 93, aVar, bVar, (String) null);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof i) {
            return (i) queryLocalInterface;
        }
        return new j4(iBinder);
    }

    public final int getMinApkVersion() {
        return j.f18843a;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.measurement.START";
    }
}
