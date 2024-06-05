package j5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.base.zad;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class e extends g<a> {

    /* renamed from: a  reason: collision with root package name */
    private final x f19499a;

    public e(Context context, Looper looper, d dVar, x xVar, com.google.android.gms.common.api.internal.e eVar, m mVar) {
        super(context, looper, 270, dVar, eVar, mVar);
        this.f19499a = xVar;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    public final h5.d[] getApiFeatures() {
        return zad.zab;
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f19499a.d();
    }

    public final int getMinApkVersion() {
        return 203400000;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    /* access modifiers changed from: protected */
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
