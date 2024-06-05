package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.collection.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.k0;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.unity3d.services.UnityAdsConstants;
import h5.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import m5.i;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class f implements Handler.Callback {

    /* renamed from: s  reason: collision with root package name */
    public static final Status f15101s = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public static final Status f15102t = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public static final Object f15103u = new Object();

    /* renamed from: v  reason: collision with root package name */
    private static f f15104v;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public long f15105a = UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public long f15106b = 120000;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public long f15107c = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f15108d = false;

    /* renamed from: f  reason: collision with root package name */
    private u f15109f;

    /* renamed from: g  reason: collision with root package name */
    private w f15110g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final Context f15111h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final e f15112i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final k0 f15113j;

    /* renamed from: k  reason: collision with root package name */
    private final AtomicInteger f15114k = new AtomicInteger(1);

    /* renamed from: l  reason: collision with root package name */
    private final AtomicInteger f15115l = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Map<b<?>, i1<?>> f15116m = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public z f15117n = null;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Set<b<?>> f15118o = new b();

    /* renamed from: p  reason: collision with root package name */
    private final Set<b<?>> f15119p = new b();
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final Handler f15120q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public volatile boolean f15121r = true;

    private f(Context context, Looper looper, e eVar) {
        this.f15111h = context;
        zaq zaq = new zaq(looper, this);
        this.f15120q = zaq;
        this.f15112i = eVar;
        this.f15113j = new k0(eVar);
        if (i.a(context)) {
            this.f15121r = false;
        }
        zaq.sendMessage(zaq.obtainMessage(6));
    }

    /* access modifiers changed from: private */
    public static Status h(b<?> bVar, h5.b bVar2) {
        String b10 = bVar.b();
        String valueOf = String.valueOf(bVar2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(b10).length() + 63 + valueOf.length());
        sb2.append("API: ");
        sb2.append(b10);
        sb2.append(" is not available on this device. Connection failed with: ");
        sb2.append(valueOf);
        return new Status(bVar2, sb2.toString());
    }

    private final i1<?> i(com.google.android.gms.common.api.e<?> eVar) {
        b<?> apiKey = eVar.getApiKey();
        i1<?> i1Var = this.f15116m.get(apiKey);
        if (i1Var == null) {
            i1Var = new i1<>(this, eVar);
            this.f15116m.put(apiKey, i1Var);
        }
        if (i1Var.M()) {
            this.f15119p.add(apiKey);
        }
        i1Var.B();
        return i1Var;
    }

    private final w j() {
        if (this.f15110g == null) {
            this.f15110g = v.a(this.f15111h);
        }
        return this.f15110g;
    }

    private final void k() {
        u uVar = this.f15109f;
        if (uVar != null) {
            if (uVar.v() > 0 || f()) {
                j().a(uVar);
            }
            this.f15109f = null;
        }
    }

    private final <T> void l(TaskCompletionSource<T> taskCompletionSource, int i10, com.google.android.gms.common.api.e eVar) {
        u1 a10;
        if (i10 != 0 && (a10 = u1.a(this, i10, eVar.getApiKey())) != null) {
            Task<T> task = taskCompletionSource.getTask();
            Handler handler = this.f15120q;
            handler.getClass();
            task.addOnCompleteListener((Executor) new c1(handler), (OnCompleteListener<T>) a10);
        }
    }

    public static f x(Context context) {
        f fVar;
        synchronized (f15103u) {
            if (f15104v == null) {
                f15104v = new f(context.getApplicationContext(), h.c().getLooper(), e.q());
            }
            fVar = f15104v;
        }
        return fVar;
    }

    public final <O extends a.d> Task<Boolean> A(com.google.android.gms.common.api.e<O> eVar, j.a aVar, int i10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        l(taskCompletionSource, i10, eVar);
        p2 p2Var = new p2(aVar, taskCompletionSource);
        Handler handler = this.f15120q;
        handler.sendMessage(handler.obtainMessage(13, new y1(p2Var, this.f15115l.get(), eVar)));
        return taskCompletionSource.getTask();
    }

    public final <O extends a.d> void F(com.google.android.gms.common.api.e<O> eVar, int i10, d<? extends com.google.android.gms.common.api.i, a.b> dVar) {
        n2 n2Var = new n2(i10, dVar);
        Handler handler = this.f15120q;
        handler.sendMessage(handler.obtainMessage(4, new y1(n2Var, this.f15115l.get(), eVar)));
    }

    public final <O extends a.d, ResultT> void G(com.google.android.gms.common.api.e<O> eVar, int i10, s<a.b, ResultT> sVar, TaskCompletionSource<ResultT> taskCompletionSource, r rVar) {
        l(taskCompletionSource, sVar.d(), eVar);
        o2 o2Var = new o2(i10, sVar, taskCompletionSource, rVar);
        Handler handler = this.f15120q;
        handler.sendMessage(handler.obtainMessage(4, new y1(o2Var, this.f15115l.get(), eVar)));
    }

    /* access modifiers changed from: package-private */
    public final void H(o oVar, int i10, long j10, int i11) {
        Handler handler = this.f15120q;
        handler.sendMessage(handler.obtainMessage(18, new v1(oVar, i10, j10, i11)));
    }

    public final void I(h5.b bVar, int i10) {
        if (!g(bVar, i10)) {
            Handler handler = this.f15120q;
            handler.sendMessage(handler.obtainMessage(5, i10, 0, bVar));
        }
    }

    public final void a() {
        Handler handler = this.f15120q;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void b(com.google.android.gms.common.api.e<?> eVar) {
        Handler handler = this.f15120q;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void c(z zVar) {
        synchronized (f15103u) {
            if (this.f15117n != zVar) {
                this.f15117n = zVar;
                this.f15118o.clear();
            }
            this.f15118o.addAll(zVar.i());
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(z zVar) {
        synchronized (f15103u) {
            if (this.f15117n == zVar) {
                this.f15117n = null;
                this.f15118o.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        if (this.f15108d) {
            return false;
        }
        s a10 = r.b().a();
        if (a10 != null && !a10.x()) {
            return false;
        }
        int a11 = this.f15113j.a(this.f15111h, 203400000);
        if (a11 == -1 || a11 == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean g(h5.b bVar, int i10) {
        return this.f15112i.A(this.f15111h, bVar, i10);
    }

    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        long j10 = 300000;
        i1 i1Var = null;
        switch (i10) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j10 = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
                }
                this.f15107c = j10;
                this.f15120q.removeMessages(12);
                for (b<?> obtainMessage : this.f15116m.keySet()) {
                    Handler handler = this.f15120q;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f15107c);
                }
                break;
            case 2:
                t2 t2Var = (t2) message.obj;
                Iterator<b<?>> it = t2Var.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        b next = it.next();
                        i1 i1Var2 = this.f15116m.get(next);
                        if (i1Var2 == null) {
                            t2Var.b(next, new h5.b(13), (String) null);
                            break;
                        } else if (i1Var2.L()) {
                            t2Var.b(next, h5.b.f18803f, i1Var2.s().getEndpointPackageName());
                        } else {
                            h5.b q10 = i1Var2.q();
                            if (q10 != null) {
                                t2Var.b(next, q10, (String) null);
                            } else {
                                i1Var2.G(t2Var);
                                i1Var2.B();
                            }
                        }
                    }
                }
            case 3:
                for (i1 next2 : this.f15116m.values()) {
                    next2.A();
                    next2.B();
                }
                break;
            case 4:
            case 8:
            case 13:
                y1 y1Var = (y1) message.obj;
                i1<?> i1Var3 = this.f15116m.get(y1Var.f15334c.getApiKey());
                if (i1Var3 == null) {
                    i1Var3 = i(y1Var.f15334c);
                }
                if (i1Var3.M() && this.f15115l.get() != y1Var.f15333b) {
                    y1Var.f15332a.a(f15101s);
                    i1Var3.I();
                    break;
                } else {
                    i1Var3.C(y1Var.f15332a);
                    break;
                }
                break;
            case 5:
                int i11 = message.arg1;
                h5.b bVar = (h5.b) message.obj;
                Iterator<i1<?>> it2 = this.f15116m.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        i1 next3 = it2.next();
                        if (next3.o() == i11) {
                            i1Var = next3;
                        }
                    }
                }
                if (i1Var != null) {
                    if (bVar.v() != 13) {
                        i1Var.d(h(i1Var.f15143c, bVar));
                        break;
                    } else {
                        String g10 = this.f15112i.g(bVar.v());
                        String w10 = bVar.w();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(g10).length() + 69 + String.valueOf(w10).length());
                        sb2.append("Error resolution was canceled by the user, original error message: ");
                        sb2.append(g10);
                        sb2.append(": ");
                        sb2.append(w10);
                        i1Var.d(new Status(17, sb2.toString()));
                        break;
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder(76);
                    sb3.append("Could not find API instance ");
                    sb3.append(i11);
                    sb3.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb3.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.f15111h.getApplicationContext() instanceof Application) {
                    c.c((Application) this.f15111h.getApplicationContext());
                    c.b().a(new d1(this));
                    if (!c.b().e(true)) {
                        this.f15107c = 300000;
                        break;
                    }
                }
                break;
            case 7:
                i((com.google.android.gms.common.api.e) message.obj);
                break;
            case 9:
                if (this.f15116m.containsKey(message.obj)) {
                    this.f15116m.get(message.obj).H();
                    break;
                }
                break;
            case 10:
                for (b<?> remove : this.f15119p) {
                    i1 remove2 = this.f15116m.remove(remove);
                    if (remove2 != null) {
                        remove2.I();
                    }
                }
                this.f15119p.clear();
                break;
            case 11:
                if (this.f15116m.containsKey(message.obj)) {
                    this.f15116m.get(message.obj).J();
                    break;
                }
                break;
            case 12:
                if (this.f15116m.containsKey(message.obj)) {
                    this.f15116m.get(message.obj).a();
                    break;
                }
                break;
            case 14:
                a0 a0Var = (a0) message.obj;
                b<?> a10 = a0Var.a();
                if (this.f15116m.containsKey(a10)) {
                    a0Var.b().setResult(Boolean.valueOf(this.f15116m.get(a10).n(false)));
                    break;
                } else {
                    a0Var.b().setResult(Boolean.FALSE);
                    break;
                }
            case 15:
                k1 k1Var = (k1) message.obj;
                if (this.f15116m.containsKey(k1Var.f15172a)) {
                    i1.y(this.f15116m.get(k1Var.f15172a), k1Var);
                    break;
                }
                break;
            case 16:
                k1 k1Var2 = (k1) message.obj;
                if (this.f15116m.containsKey(k1Var2.f15172a)) {
                    i1.z(this.f15116m.get(k1Var2.f15172a), k1Var2);
                    break;
                }
                break;
            case 17:
                k();
                break;
            case 18:
                v1 v1Var = (v1) message.obj;
                if (v1Var.f15288c != 0) {
                    u uVar = this.f15109f;
                    if (uVar != null) {
                        List<o> w11 = uVar.w();
                        if (uVar.v() != v1Var.f15287b || (w11 != null && w11.size() >= v1Var.f15289d)) {
                            this.f15120q.removeMessages(17);
                            k();
                        } else {
                            this.f15109f.x(v1Var.f15286a);
                        }
                    }
                    if (this.f15109f == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(v1Var.f15286a);
                        this.f15109f = new u(v1Var.f15287b, arrayList);
                        Handler handler2 = this.f15120q;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), v1Var.f15288c);
                        break;
                    }
                } else {
                    j().a(new u(v1Var.f15287b, Arrays.asList(new o[]{v1Var.f15286a})));
                    break;
                }
                break;
            case 19:
                this.f15108d = false;
                break;
            default:
                StringBuilder sb4 = new StringBuilder(31);
                sb4.append("Unknown message id: ");
                sb4.append(i10);
                Log.w("GoogleApiManager", sb4.toString());
                return false;
        }
        return true;
    }

    public final int m() {
        return this.f15114k.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    public final i1 w(b<?> bVar) {
        return this.f15116m.get(bVar);
    }

    public final Task<Boolean> z(com.google.android.gms.common.api.e<?> eVar) {
        a0 a0Var = new a0(eVar.getApiKey());
        Handler handler = this.f15120q;
        handler.sendMessage(handler.obtainMessage(14, a0Var));
        return a0Var.b().getTask();
    }
}
