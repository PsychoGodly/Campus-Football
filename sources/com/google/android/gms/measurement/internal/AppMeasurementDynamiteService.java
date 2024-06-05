package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.zzct;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.util.Map;
import r5.u;
import r5.v;

@DynamiteApi
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.0 */
public class AppMeasurementDynamiteService extends zzct {

    /* renamed from: a  reason: collision with root package name */
    w5 f24328a = null;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, u> f24329b = new androidx.collection.a();

    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.0 */
    class a implements v {

        /* renamed from: a  reason: collision with root package name */
        private zzda f24330a;

        a(zzda zzda) {
            this.f24330a = zzda;
        }

        public final void a(String str, String str2, Bundle bundle, long j10) {
            try {
                this.f24330a.zza(str, str2, bundle, j10);
            } catch (RemoteException e10) {
                w5 w5Var = AppMeasurementDynamiteService.this.f24328a;
                if (w5Var != null) {
                    w5Var.zzj().G().b("Event interceptor threw exception", e10);
                }
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.0 */
    class b implements u {

        /* renamed from: a  reason: collision with root package name */
        private zzda f24332a;

        b(zzda zzda) {
            this.f24332a = zzda;
        }

        public final void a(String str, String str2, Bundle bundle, long j10) {
            try {
                this.f24332a.zza(str, str2, bundle, j10);
            } catch (RemoteException e10) {
                w5 w5Var = AppMeasurementDynamiteService.this.f24328a;
                if (w5Var != null) {
                    w5Var.zzj().G().b("Event listener threw exception", e10);
                }
            }
        }
    }

    private final void M0(zzcv zzcv, String str) {
        zza();
        this.f24328a.G().M(zzcv, str);
    }

    private final void zza() {
        if (this.f24328a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void beginAdUnitExposure(String str, long j10) throws RemoteException {
        zza();
        this.f24328a.t().u(str, j10);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        zza();
        this.f24328a.C().Q(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j10) throws RemoteException {
        zza();
        this.f24328a.C().K((Boolean) null);
    }

    public void endAdUnitExposure(String str, long j10) throws RemoteException {
        zza();
        this.f24328a.t().y(str, j10);
    }

    public void generateEventId(zzcv zzcv) throws RemoteException {
        zza();
        long K0 = this.f24328a.G().K0();
        zza();
        this.f24328a.G().K(zzcv, K0);
    }

    public void getAppInstanceId(zzcv zzcv) throws RemoteException {
        zza();
        this.f24328a.zzl().y(new r6(this, zzcv));
    }

    public void getCachedAppInstanceId(zzcv zzcv) throws RemoteException {
        zza();
        M0(zzcv, this.f24328a.C().d0());
    }

    public void getConditionalUserProperties(String str, String str2, zzcv zzcv) throws RemoteException {
        zza();
        this.f24328a.zzl().y(new f9(this, zzcv, str, str2));
    }

    public void getCurrentScreenClass(zzcv zzcv) throws RemoteException {
        zza();
        M0(zzcv, this.f24328a.C().e0());
    }

    public void getCurrentScreenName(zzcv zzcv) throws RemoteException {
        zza();
        M0(zzcv, this.f24328a.C().f0());
    }

    public void getGmpAppId(zzcv zzcv) throws RemoteException {
        zza();
        M0(zzcv, this.f24328a.C().g0());
    }

    public void getMaxUserProperties(String str, zzcv zzcv) throws RemoteException {
        zza();
        this.f24328a.C();
        q.g(str);
        zza();
        this.f24328a.G().J(zzcv, 25);
    }

    public void getSessionId(zzcv zzcv) throws RemoteException {
        zza();
        b7 C = this.f24328a.C();
        C.zzl().y(new y7(C, zzcv));
    }

    public void getTestFlag(zzcv zzcv, int i10) throws RemoteException {
        zza();
        if (i10 == 0) {
            this.f24328a.G().M(zzcv, this.f24328a.C().h0());
        } else if (i10 == 1) {
            this.f24328a.G().K(zzcv, this.f24328a.C().c0().longValue());
        } else if (i10 == 2) {
            ib G = this.f24328a.G();
            double doubleValue = this.f24328a.C().a0().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, doubleValue);
            try {
                zzcv.zza(bundle);
            } catch (RemoteException e10) {
                G.f25124a.zzj().G().b("Error returning double value to wrapper", e10);
            }
        } else if (i10 == 3) {
            this.f24328a.G().J(zzcv, this.f24328a.C().b0().intValue());
        } else if (i10 == 4) {
            this.f24328a.G().O(zzcv, this.f24328a.C().Z().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z10, zzcv zzcv) throws RemoteException {
        zza();
        this.f24328a.zzl().y(new i7(this, zzcv, str, str2, z10));
    }

    public void initForTests(Map map) throws RemoteException {
        zza();
    }

    public void initialize(com.google.android.gms.dynamic.a aVar, zzdd zzdd, long j10) throws RemoteException {
        w5 w5Var = this.f24328a;
        if (w5Var == null) {
            this.f24328a = w5.a((Context) q.k((Context) com.google.android.gms.dynamic.b.A1(aVar)), zzdd, Long.valueOf(j10));
        } else {
            w5Var.zzj().G().a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(zzcv zzcv) throws RemoteException {
        zza();
        this.f24328a.zzl().y(new eb(this, zzcv));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException {
        zza();
        this.f24328a.C().S(str, str2, bundle, z10, z11, j10);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcv zzcv, long j10) throws RemoteException {
        Bundle bundle2;
        zza();
        q.g(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f24328a.zzl().y(new h8(this, zzcv, new d0(str2, new z(bundle), "app", j10), str));
    }

    public void logHealthData(int i10, String str, com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2, com.google.android.gms.dynamic.a aVar3) throws RemoteException {
        Object obj;
        Object obj2;
        zza();
        Object obj3 = null;
        if (aVar == null) {
            obj = null;
        } else {
            obj = com.google.android.gms.dynamic.b.A1(aVar);
        }
        if (aVar2 == null) {
            obj2 = null;
        } else {
            obj2 = com.google.android.gms.dynamic.b.A1(aVar2);
        }
        if (aVar3 != null) {
            obj3 = com.google.android.gms.dynamic.b.A1(aVar3);
        }
        this.f24328a.zzj().u(i10, true, false, str, obj, obj2, obj3);
    }

    public void onActivityCreated(com.google.android.gms.dynamic.a aVar, Bundle bundle, long j10) throws RemoteException {
        zza();
        f8 f8Var = this.f24328a.C().f24388c;
        if (f8Var != null) {
            this.f24328a.C().j0();
            f8Var.onActivityCreated((Activity) com.google.android.gms.dynamic.b.A1(aVar), bundle);
        }
    }

    public void onActivityDestroyed(com.google.android.gms.dynamic.a aVar, long j10) throws RemoteException {
        zza();
        f8 f8Var = this.f24328a.C().f24388c;
        if (f8Var != null) {
            this.f24328a.C().j0();
            f8Var.onActivityDestroyed((Activity) com.google.android.gms.dynamic.b.A1(aVar));
        }
    }

    public void onActivityPaused(com.google.android.gms.dynamic.a aVar, long j10) throws RemoteException {
        zza();
        f8 f8Var = this.f24328a.C().f24388c;
        if (f8Var != null) {
            this.f24328a.C().j0();
            f8Var.onActivityPaused((Activity) com.google.android.gms.dynamic.b.A1(aVar));
        }
    }

    public void onActivityResumed(com.google.android.gms.dynamic.a aVar, long j10) throws RemoteException {
        zza();
        f8 f8Var = this.f24328a.C().f24388c;
        if (f8Var != null) {
            this.f24328a.C().j0();
            f8Var.onActivityResumed((Activity) com.google.android.gms.dynamic.b.A1(aVar));
        }
    }

    public void onActivitySaveInstanceState(com.google.android.gms.dynamic.a aVar, zzcv zzcv, long j10) throws RemoteException {
        zza();
        f8 f8Var = this.f24328a.C().f24388c;
        Bundle bundle = new Bundle();
        if (f8Var != null) {
            this.f24328a.C().j0();
            f8Var.onActivitySaveInstanceState((Activity) com.google.android.gms.dynamic.b.A1(aVar), bundle);
        }
        try {
            zzcv.zza(bundle);
        } catch (RemoteException e10) {
            this.f24328a.zzj().G().b("Error returning bundle value to wrapper", e10);
        }
    }

    public void onActivityStarted(com.google.android.gms.dynamic.a aVar, long j10) throws RemoteException {
        zza();
        f8 f8Var = this.f24328a.C().f24388c;
        if (f8Var != null) {
            this.f24328a.C().j0();
            f8Var.onActivityStarted((Activity) com.google.android.gms.dynamic.b.A1(aVar));
        }
    }

    public void onActivityStopped(com.google.android.gms.dynamic.a aVar, long j10) throws RemoteException {
        zza();
        f8 f8Var = this.f24328a.C().f24388c;
        if (f8Var != null) {
            this.f24328a.C().j0();
            f8Var.onActivityStopped((Activity) com.google.android.gms.dynamic.b.A1(aVar));
        }
    }

    public void performAction(Bundle bundle, zzcv zzcv, long j10) throws RemoteException {
        zza();
        zzcv.zza((Bundle) null);
    }

    public void registerOnMeasurementEventListener(zzda zzda) throws RemoteException {
        u uVar;
        zza();
        synchronized (this.f24329b) {
            uVar = this.f24329b.get(Integer.valueOf(zzda.zza()));
            if (uVar == null) {
                uVar = new b(zzda);
                this.f24329b.put(Integer.valueOf(zzda.zza()), uVar);
            }
        }
        this.f24328a.C().X(uVar);
    }

    public void resetAnalyticsData(long j10) throws RemoteException {
        zza();
        b7 C = this.f24328a.C();
        C.M((String) null);
        C.zzl().y(new s7(C, j10));
    }

    public void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException {
        zza();
        if (bundle == null) {
            this.f24328a.zzj().B().a("Conditional user property must not be null");
        } else {
            this.f24328a.C().C(bundle, j10);
        }
    }

    public void setConsent(Bundle bundle, long j10) throws RemoteException {
        zza();
        b7 C = this.f24328a.C();
        C.zzl().B(new f7(C, bundle, j10));
    }

    public void setConsentThirdParty(Bundle bundle, long j10) throws RemoteException {
        zza();
        this.f24328a.C().B(bundle, -20, j10);
    }

    public void setCurrentScreen(com.google.android.gms.dynamic.a aVar, String str, String str2, long j10) throws RemoteException {
        zza();
        this.f24328a.D().C((Activity) com.google.android.gms.dynamic.b.A1(aVar), str, str2);
    }

    public void setDataCollectionEnabled(boolean z10) throws RemoteException {
        zza();
        b7 C = this.f24328a.C();
        C.q();
        C.zzl().y(new k7(C, z10));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        zza();
        b7 C = this.f24328a.C();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        C.zzl().y(new d7(C, bundle2));
    }

    public void setEventInterceptor(zzda zzda) throws RemoteException {
        zza();
        a aVar = new a(zzda);
        if (this.f24328a.zzl().E()) {
            this.f24328a.C().Y(aVar);
        } else {
            this.f24328a.zzl().y(new fa(this, aVar));
        }
    }

    public void setInstanceIdProvider(zzdb zzdb) throws RemoteException {
        zza();
    }

    public void setMeasurementEnabled(boolean z10, long j10) throws RemoteException {
        zza();
        this.f24328a.C().K(Boolean.valueOf(z10));
    }

    public void setMinimumSessionDuration(long j10) throws RemoteException {
        zza();
    }

    public void setSessionTimeoutDuration(long j10) throws RemoteException {
        zza();
        b7 C = this.f24328a.C();
        C.zzl().y(new m7(C, j10));
    }

    public void setUserId(String str, long j10) throws RemoteException {
        zza();
        b7 C = this.f24328a.C();
        if (str == null || !TextUtils.isEmpty(str)) {
            C.zzl().y(new g7(C, str));
            C.V((String) null, "_id", str, true, j10);
            return;
        }
        C.f25124a.zzj().G().a("User ID must be non-empty or null");
    }

    public void setUserProperty(String str, String str2, com.google.android.gms.dynamic.a aVar, boolean z10, long j10) throws RemoteException {
        zza();
        this.f24328a.C().V(str, str2, com.google.android.gms.dynamic.b.A1(aVar), z10, j10);
    }

    public void unregisterOnMeasurementEventListener(zzda zzda) throws RemoteException {
        u remove;
        zza();
        synchronized (this.f24329b) {
            remove = this.f24329b.remove(Integer.valueOf(zzda.zza()));
        }
        if (remove == null) {
            remove = new b(zzda);
        }
        this.f24328a.C().t0(remove);
    }
}
