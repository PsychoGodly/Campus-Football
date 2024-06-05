package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.q;
import h5.b;
import l5.a;
import r5.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class s9 implements ServiceConnection, c.a, c.b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f25055a;

    /* renamed from: b  reason: collision with root package name */
    private volatile o4 f25056b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ v8 f25057c;

    protected s9(v8 v8Var) {
        this.f25057c = v8Var;
    }

    public final void a() {
        this.f25057c.i();
        Context zza = this.f25057c.zza();
        synchronized (this) {
            if (this.f25055a) {
                this.f25057c.zzj().F().a("Connection attempt already in progress");
            } else if (this.f25056b == null || (!this.f25056b.isConnecting() && !this.f25056b.isConnected())) {
                this.f25056b = new o4(zza, Looper.getMainLooper(), this, this);
                this.f25057c.zzj().F().a("Connecting to remote service");
                this.f25055a = true;
                q.k(this.f25056b);
                this.f25056b.checkAvailabilityAndConnect();
            } else {
                this.f25057c.zzj().F().a("Already awaiting connection attempt");
            }
        }
    }

    public final void b(Intent intent) {
        this.f25057c.i();
        Context zza = this.f25057c.zza();
        a b10 = a.b();
        synchronized (this) {
            if (this.f25055a) {
                this.f25057c.zzj().F().a("Connection attempt already in progress");
                return;
            }
            this.f25057c.zzj().F().a("Using local app measurement service");
            this.f25055a = true;
            b10.a(zza, intent, this.f25057c.f25131c, 129);
        }
    }

    public final void d() {
        if (this.f25056b != null && (this.f25056b.isConnected() || this.f25056b.isConnecting())) {
            this.f25056b.disconnect();
        }
        this.f25056b = null;
    }

    public final void onConnected(Bundle bundle) {
        q.f("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                q.k(this.f25056b);
                this.f25057c.zzl().y(new t9(this, (i) this.f25056b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f25056b = null;
                this.f25055a = false;
            }
        }
    }

    public final void onConnectionFailed(b bVar) {
        q.f("MeasurementServiceConnection.onConnectionFailed");
        n4 z10 = this.f25057c.f25124a.z();
        if (z10 != null) {
            z10.G().b("Service connection failed", bVar);
        }
        synchronized (this) {
            this.f25055a = false;
            this.f25056b = null;
        }
        this.f25057c.zzl().y(new v9(this));
    }

    public final void onConnectionSuspended(int i10) {
        q.f("MeasurementServiceConnection.onConnectionSuspended");
        this.f25057c.zzj().A().a("Service connection suspended");
        this.f25057c.zzl().y(new w9(this));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.f25057c.zzj().B().a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.q.f(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.f25055a = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.v8 r4 = r3.f25057c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.n4 r4 = r4.zzj()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.p4 r4 = r4.B()     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.a(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x0096
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x005f }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x005f }
            if (r2 == 0) goto L_0x004f
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x005f }
            boolean r2 = r1 instanceof r5.i     // Catch:{ RemoteException -> 0x005f }
            if (r2 == 0) goto L_0x0039
            r5.i r1 = (r5.i) r1     // Catch:{ RemoteException -> 0x005f }
            goto L_0x003e
        L_0x0039:
            com.google.android.gms.measurement.internal.j4 r1 = new com.google.android.gms.measurement.internal.j4     // Catch:{ RemoteException -> 0x005f }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x005f }
        L_0x003e:
            r0 = r1
            com.google.android.gms.measurement.internal.v8 r5 = r3.f25057c     // Catch:{ RemoteException -> 0x005f }
            com.google.android.gms.measurement.internal.n4 r5 = r5.zzj()     // Catch:{ RemoteException -> 0x005f }
            com.google.android.gms.measurement.internal.p4 r5 = r5.F()     // Catch:{ RemoteException -> 0x005f }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.a(r1)     // Catch:{ RemoteException -> 0x005f }
            goto L_0x006e
        L_0x004f:
            com.google.android.gms.measurement.internal.v8 r5 = r3.f25057c     // Catch:{ RemoteException -> 0x005f }
            com.google.android.gms.measurement.internal.n4 r5 = r5.zzj()     // Catch:{ RemoteException -> 0x005f }
            com.google.android.gms.measurement.internal.p4 r5 = r5.B()     // Catch:{ RemoteException -> 0x005f }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.b(r2, r1)     // Catch:{ RemoteException -> 0x005f }
            goto L_0x006e
        L_0x005f:
            com.google.android.gms.measurement.internal.v8 r5 = r3.f25057c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.n4 r5 = r5.zzj()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.p4 r5 = r5.B()     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.a(r1)     // Catch:{ all -> 0x001c }
        L_0x006e:
            if (r0 != 0) goto L_0x0086
            r3.f25055a = r4     // Catch:{ all -> 0x001c }
            l5.a r4 = l5.a.b()     // Catch:{ IllegalArgumentException -> 0x0094 }
            com.google.android.gms.measurement.internal.v8 r5 = r3.f25057c     // Catch:{ IllegalArgumentException -> 0x0094 }
            android.content.Context r5 = r5.zza()     // Catch:{ IllegalArgumentException -> 0x0094 }
            com.google.android.gms.measurement.internal.v8 r0 = r3.f25057c     // Catch:{ IllegalArgumentException -> 0x0094 }
            com.google.android.gms.measurement.internal.s9 r0 = r0.f25131c     // Catch:{ IllegalArgumentException -> 0x0094 }
            r4.c(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0094 }
            goto L_0x0094
        L_0x0086:
            com.google.android.gms.measurement.internal.v8 r4 = r3.f25057c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.q5 r4 = r4.zzl()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.r9 r5 = new com.google.android.gms.measurement.internal.r9     // Catch:{ all -> 0x001c }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001c }
            r4.y(r5)     // Catch:{ all -> 0x001c }
        L_0x0094:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x0096:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.s9.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        q.f("MeasurementServiceConnection.onServiceDisconnected");
        this.f25057c.zzj().A().a("Service disconnected");
        this.f25057c.zzl().y(new u9(this, componentName));
    }
}
