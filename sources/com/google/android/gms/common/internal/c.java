package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import h5.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class c<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private static final h5.d[] zze = new h5.d[0];
    private volatile String zzA;
    /* access modifiers changed from: private */
    public h5.b zzB;
    /* access modifiers changed from: private */
    public boolean zzC;
    private volatile f1 zzD;
    q1 zza;
    final Handler zzb;
    protected C0157c zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final h zzn;
    private final f zzo;
    private final Object zzp;
    /* access modifiers changed from: private */
    public final Object zzq;
    /* access modifiers changed from: private */
    public m zzr;
    private IInterface zzs;
    /* access modifiers changed from: private */
    public final ArrayList zzt;
    private c1 zzu;
    private int zzv;
    /* access modifiers changed from: private */
    public final a zzw;
    /* access modifiers changed from: private */
    public final b zzx;
    private final int zzy;
    private final String zzz;

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface a {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i10);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface b {
        void onConnectionFailed(h5.b bVar);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface C0157c {
        void a(h5.b bVar);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    protected class d implements C0157c {
        public d() {
        }

        public final void a(h5.b bVar) {
            if (bVar.z()) {
                c cVar = c.this;
                cVar.getRemoteService((j) null, cVar.getScopes());
            } else if (c.this.zzx != null) {
                c.this.zzx.onConnectionFailed(bVar);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface e {
        void a();
    }

    protected c(Context context, Handler handler, h hVar, f fVar, int i10, a aVar, b bVar) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        q.l(context, "Context must not be null");
        this.zzl = context;
        q.l(handler, "Handler must not be null");
        this.zzb = handler;
        this.zzm = handler.getLooper();
        q.l(hVar, "Supervisor must not be null");
        this.zzn = hVar;
        q.l(fVar, "API availability must not be null");
        this.zzo = fVar;
        this.zzy = i10;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = null;
    }

    static /* bridge */ /* synthetic */ void zzj(c cVar, f1 f1Var) {
        s sVar;
        cVar.zzD = f1Var;
        if (cVar.usesClientTelemetry()) {
            e eVar = f1Var.f15400d;
            r b10 = r.b();
            if (eVar == null) {
                sVar = null;
            } else {
                sVar = eVar.B();
            }
            b10.c(sVar);
        }
    }

    static /* bridge */ /* synthetic */ void zzk(c cVar, int i10) {
        int i11;
        int i12;
        synchronized (cVar.zzp) {
            i11 = cVar.zzv;
        }
        if (i11 == 3) {
            cVar.zzC = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = cVar.zzb;
        handler.sendMessage(handler.obtainMessage(i12, cVar.zzd.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean zzn(c cVar, int i10, int i11, IInterface iInterface) {
        synchronized (cVar.zzp) {
            if (cVar.zzv != i10) {
                return false;
            }
            cVar.zzp(i11, iInterface);
            return true;
        }
    }

    static /* bridge */ /* synthetic */ boolean zzo(c cVar) {
        if (cVar.zzC || TextUtils.isEmpty(cVar.getServiceDescriptor()) || TextUtils.isEmpty(cVar.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(cVar.getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public final void zzp(int i10, IInterface iInterface) {
        q1 q1Var;
        q1 q1Var2;
        boolean z10 = false;
        if ((i10 == 4) == (iInterface != null)) {
            z10 = true;
        }
        q.a(z10);
        synchronized (this.zzp) {
            this.zzv = i10;
            this.zzs = iInterface;
            if (i10 == 1) {
                c1 c1Var = this.zzu;
                if (c1Var != null) {
                    h hVar = this.zzn;
                    String c10 = this.zza.c();
                    q.k(c10);
                    hVar.e(c10, this.zza.b(), this.zza.a(), c1Var, zze(), this.zza.d());
                    this.zzu = null;
                }
            } else if (i10 == 2 || i10 == 3) {
                c1 c1Var2 = this.zzu;
                if (!(c1Var2 == null || (q1Var2 = this.zza) == null)) {
                    String c11 = q1Var2.c();
                    String b10 = q1Var2.b();
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + c11 + " on " + b10);
                    h hVar2 = this.zzn;
                    String c12 = this.zza.c();
                    q.k(c12);
                    hVar2.e(c12, this.zza.b(), this.zza.a(), c1Var2, zze(), this.zza.d());
                    this.zzd.incrementAndGet();
                }
                c1 c1Var3 = new c1(this, this.zzd.get());
                this.zzu = c1Var3;
                if (this.zzv != 3 || getLocalStartServiceAction() == null) {
                    q1Var = new q1(getStartServicePackage(), getStartServiceAction(), false, h.a(), getUseDynamicLookup());
                } else {
                    q1Var = new q1(getContext().getPackageName(), getLocalStartServiceAction(), true, h.a(), false);
                }
                this.zza = q1Var;
                if (q1Var.d()) {
                    if (getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.c())));
                    }
                }
                h hVar3 = this.zzn;
                String c13 = this.zza.c();
                q.k(c13);
                if (!hVar3.f(new j1(c13, this.zza.b(), this.zza.a(), this.zza.d()), c1Var3, zze(), getBindServiceExecutor())) {
                    String c14 = this.zza.c();
                    String b11 = this.zza.b();
                    Log.w("GmsClient", "unable to connect to service: " + c14 + " on " + b11);
                    zzl(16, (Bundle) null, this.zzd.get());
                }
            } else if (i10 == 4) {
                q.k(iInterface);
                onConnectedLocked(iInterface);
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int j10 = this.zzo.j(this.zzl, getMinApkVersion());
        if (j10 != 0) {
            zzp(1, (IInterface) null);
            triggerNotAvailable(new d(), j10, (PendingIntent) null);
            return;
        }
        connect(new d());
    }

    /* access modifiers changed from: protected */
    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(C0157c cVar) {
        q.l(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        zzp(2, (IInterface) null);
    }

    /* access modifiers changed from: protected */
    public abstract T createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            int size = this.zzt.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((a1) this.zzt.get(i10)).d();
            }
            this.zzt.clear();
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, (IInterface) null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i10;
        IInterface iInterface;
        m mVar;
        synchronized (this.zzp) {
            i10 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            mVar = this.zzr;
        }
        printWriter.append(str).append("mConnectState=");
        if (i10 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i10 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i10 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i10 == 4) {
            printWriter.print("CONNECTED");
        } else if (i10 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append(getServiceDescriptor()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (mVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(mVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j10 = this.zzh;
            String format = simpleDateFormat.format(new Date(j10));
            append.println(j10 + " " + format);
        }
        if (this.zzg > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i11 = this.zzf;
            if (i11 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i11 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i11 != 3) {
                printWriter.append(String.valueOf(i11));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.zzg;
            String format2 = simpleDateFormat.format(new Date(j11));
            append2.println(j11 + " " + format2);
        }
        if (this.zzj > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(com.google.android.gms.common.api.d.a(this.zzi));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.zzj;
            String format3 = simpleDateFormat.format(new Date(j12));
            append3.println(j12 + " " + format3);
        }
    }

    /* access modifiers changed from: protected */
    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public h5.d[] getApiFeatures() {
        return zze;
    }

    public final h5.d[] getAvailableFeatures() {
        f1 f1Var = this.zzD;
        if (f1Var == null) {
            return null;
        }
        return f1Var.f15398b;
    }

    /* access modifiers changed from: protected */
    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        q1 q1Var;
        if (isConnected() && (q1Var = this.zza) != null) {
            return q1Var.b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    /* access modifiers changed from: protected */
    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return f.f18834a;
    }

    public void getRemoteService(j jVar, Set<Scope> set) {
        Set<Scope> set2 = set;
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        int i10 = this.zzy;
        String str = this.zzA;
        int i11 = f.f18834a;
        Scope[] scopeArr = f.f15381p;
        Bundle bundle = new Bundle();
        h5.d[] dVarArr = f.f15382q;
        f fVar = r3;
        f fVar2 = new f(6, i10, i11, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, dVarArr, dVarArr, true, 0, false, str);
        f fVar3 = fVar;
        fVar3.f15386d = this.zzl.getPackageName();
        fVar3.f15389h = getServiceRequestExtraArgs;
        if (set2 != null) {
            fVar3.f15388g = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            fVar3.f15390i = account;
            if (jVar != null) {
                fVar3.f15387f = jVar.asBinder();
            }
        } else if (requiresAccount()) {
            fVar3.f15390i = getAccount();
        }
        fVar3.f15391j = zze;
        fVar3.f15392k = getApiFeatures();
        if (usesClientTelemetry()) {
            fVar3.f15395n = true;
        }
        try {
            synchronized (this.zzq) {
                m mVar = this.zzr;
                if (mVar != null) {
                    mVar.P(new b1(this, this.zzd.get()), fVar3);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            triggerConnectionSuspended(3);
        } catch (SecurityException e11) {
            throw e11;
        } catch (RemoteException | RuntimeException e12) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e12);
            onPostInitHandler(8, (IBinder) null, (Bundle) null, this.zzd.get());
        }
    }

    /* access modifiers changed from: protected */
    public Set<Scope> getScopes() {
        return Collections.emptySet();
    }

    public final T getService() throws DeadObjectException {
        T t10;
        synchronized (this.zzp) {
            if (this.zzv != 5) {
                checkConnected();
                t10 = this.zzs;
                q.l(t10, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t10;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            m mVar = this.zzr;
            if (mVar == null) {
                return null;
            }
            IBinder asBinder = mVar.asBinder();
            return asBinder;
        }
    }

    /* access modifiers changed from: protected */
    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* access modifiers changed from: protected */
    public abstract String getStartServiceAction();

    /* access modifiers changed from: protected */
    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public e getTelemetryConfiguration() {
        f1 f1Var = this.zzD;
        if (f1Var == null) {
            return null;
        }
        return f1Var.f15400d;
    }

    /* access modifiers changed from: protected */
    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z10;
        synchronized (this.zzp) {
            z10 = this.zzv == 4;
        }
        return z10;
    }

    public boolean isConnecting() {
        boolean z10;
        synchronized (this.zzp) {
            int i10 = this.zzv;
            z10 = true;
            if (i10 != 2) {
                if (i10 != 3) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    /* access modifiers changed from: protected */
    public void onConnectedLocked(T t10) {
        this.zzh = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void onConnectionFailed(h5.b bVar) {
        this.zzi = bVar.v();
        this.zzj = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void onConnectionSuspended(int i10) {
        this.zzf = i10;
        this.zzg = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, new d1(this, i10, iBinder, bundle)));
    }

    public void onUserSignOut(e eVar) {
        eVar.a();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i10) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.zzd.get(), i10));
    }

    /* access modifiers changed from: protected */
    public void triggerNotAvailable(C0157c cVar, int i10, PendingIntent pendingIntent) {
        q.l(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, this.zzd.get(), i10, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    /* access modifiers changed from: protected */
    public final void zzl(int i10, Bundle bundle, int i11) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, new e1(this, i10, (Bundle) null)));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected c(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.c.a r13, com.google.android.gms.common.internal.c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.h r3 = com.google.android.gms.common.internal.h.b(r10)
            h5.f r4 = h5.f.h()
            com.google.android.gms.common.internal.q.k(r13)
            com.google.android.gms.common.internal.q.k(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.c.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.c$a, com.google.android.gms.common.internal.c$b, java.lang.String):void");
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    protected c(Context context, Looper looper, h hVar, f fVar, int i10, a aVar, b bVar, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        q.l(context, "Context must not be null");
        this.zzl = context;
        q.l(looper, "Looper must not be null");
        this.zzm = looper;
        q.l(hVar, "Supervisor must not be null");
        this.zzn = hVar;
        q.l(fVar, "API availability must not be null");
        this.zzo = fVar;
        this.zzb = new z0(this, looper);
        this.zzy = i10;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = str;
    }
}
