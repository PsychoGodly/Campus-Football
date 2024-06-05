package com.google.android.gms.internal.appset;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.appset.zze;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.g;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class zzd extends g<zzg> {
    protected zzd(Context context, Looper looper, d dVar, e eVar, m mVar) {
        super(context, looper, 300, dVar, eVar, mVar);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof zzg ? (zzg) queryLocalInterface : new zzg(iBinder);
    }

    public final h5.d[] getApiFeatures() {
        return zze.zzb;
    }

    public final int getMinApkVersion() {
        return 212800000;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.appset.service.START";
    }

    /* access modifiers changed from: protected */
    public final boolean getUseDynamicLookup() {
        return true;
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}
