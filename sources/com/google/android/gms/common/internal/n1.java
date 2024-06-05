package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.concurrent.Executor;
import l5.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class n1 extends h {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f15442f = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Context f15443g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public volatile Handler f15444h;

    /* renamed from: i  reason: collision with root package name */
    private final m1 f15445i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final a f15446j;

    /* renamed from: k  reason: collision with root package name */
    private final long f15447k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final long f15448l;

    n1(Context context, Looper looper) {
        m1 m1Var = new m1(this, (l1) null);
        this.f15445i = m1Var;
        this.f15443g = context.getApplicationContext();
        this.f15444h = new zzi(looper, m1Var);
        this.f15446j = a.b();
        this.f15447k = UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS;
        this.f15448l = 300000;
    }

    /* access modifiers changed from: protected */
    public final void d(j1 j1Var, ServiceConnection serviceConnection, String str) {
        q.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f15442f) {
            k1 k1Var = (k1) this.f15442f.get(j1Var);
            if (k1Var == null) {
                String obj = j1Var.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
            } else if (k1Var.h(serviceConnection)) {
                k1Var.f(serviceConnection, str);
                if (k1Var.i()) {
                    this.f15444h.sendMessageDelayed(this.f15444h.obtainMessage(0, j1Var), this.f15447k);
                }
            } else {
                String obj2 = j1Var.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean f(j1 j1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j10;
        q.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f15442f) {
            k1 k1Var = (k1) this.f15442f.get(j1Var);
            if (k1Var == null) {
                k1Var = new k1(this, j1Var);
                k1Var.d(serviceConnection, serviceConnection, str);
                k1Var.e(str, executor);
                this.f15442f.put(j1Var, k1Var);
            } else {
                this.f15444h.removeMessages(0, j1Var);
                if (!k1Var.h(serviceConnection)) {
                    k1Var.d(serviceConnection, serviceConnection, str);
                    int a10 = k1Var.a();
                    if (a10 == 1) {
                        serviceConnection.onServiceConnected(k1Var.b(), k1Var.c());
                    } else if (a10 == 2) {
                        k1Var.e(str, executor);
                    }
                } else {
                    String obj = j1Var.toString();
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                }
            }
            j10 = k1Var.j();
        }
        return j10;
    }
}
