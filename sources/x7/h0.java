package x7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import dd.b;
import dd.c;
import dd.u0;
import dd.v0;
import dd.z0;
import h5.h;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p8.r;
import r7.l;
import t5.a;
import y7.g;
import y7.p;
import y7.v;
import y7.y;

/* compiled from: GrpcCallProvider */
public class h0 {

    /* renamed from: h  reason: collision with root package name */
    private static y<v0<?>> f31040h;

    /* renamed from: a  reason: collision with root package name */
    private Task<u0> f31041a;

    /* renamed from: b  reason: collision with root package name */
    private final g f31042b;

    /* renamed from: c  reason: collision with root package name */
    private c f31043c;

    /* renamed from: d  reason: collision with root package name */
    private g.b f31044d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f31045e;

    /* renamed from: f  reason: collision with root package name */
    private final l f31046f;

    /* renamed from: g  reason: collision with root package name */
    private final b f31047g;

    h0(g gVar, Context context, l lVar, b bVar) {
        this.f31042b = gVar;
        this.f31045e = context;
        this.f31046f = lVar;
        this.f31047g = bVar;
        k();
    }

    private void h() {
        if (this.f31044d != null) {
            v.a("GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
            this.f31044d.c();
            this.f31044d = null;
        }
    }

    private u0 j(Context context, l lVar) {
        v0<?> v0Var;
        try {
            a.a(context);
        } catch (h5.g | h | IllegalStateException e10) {
            v.e("GrpcCallProvider", "Failed to update ssl context: %s", e10);
        }
        y<v0<?>> yVar = f31040h;
        if (yVar != null) {
            v0Var = yVar.get();
        } else {
            v0<?> b10 = v0.b(lVar.b());
            if (!lVar.d()) {
                b10.d();
            }
            v0Var = b10;
        }
        v0Var.c(30, TimeUnit.SECONDS);
        return ed.a.k(v0Var).i(context).a();
    }

    private void k() {
        this.f31041a = Tasks.call(p.f31401c, new g0(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task l(z0 z0Var, Task task) throws Exception {
        return Tasks.forResult(((u0) task.getResult()).f(z0Var, this.f31043c));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ u0 n() throws Exception {
        u0 j10 = j(this.f31045e, this.f31046f);
        this.f31042b.l(new e0(this, j10));
        this.f31043c = ((r.b) ((r.b) r.f(j10).c(this.f31047g)).d(this.f31042b.o())).b();
        v.a("GrpcCallProvider", "Channel successfully reset.", new Object[0]);
        return j10;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void o(u0 u0Var) {
        v.a("GrpcCallProvider", "connectivityAttemptTimer elapsed. Resetting the channel.", new Object[0]);
        h();
        t(u0Var);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q(u0 u0Var) {
        this.f31042b.l(new b0(this, u0Var));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r(u0 u0Var) {
        u0Var.n();
        k();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void p(u0 u0Var) {
        dd.p k10 = u0Var.k(true);
        v.a("GrpcCallProvider", "Current gRPC connectivity state: " + k10, new Object[0]);
        h();
        if (k10 == dd.p.CONNECTING) {
            v.a("GrpcCallProvider", "Setting the connectivityAttemptTimer", new Object[0]);
            this.f31044d = this.f31042b.k(g.d.CONNECTIVITY_ATTEMPT_TIMER, 15000, new d0(this, u0Var));
        }
        u0Var.l(k10, new c0(this, u0Var));
    }

    private void t(u0 u0Var) {
        this.f31042b.l(new f0(this, u0Var));
    }

    /* access modifiers changed from: package-private */
    public <ReqT, RespT> Task<dd.g<ReqT, RespT>> i(z0<ReqT, RespT> z0Var) {
        return this.f31041a.continueWithTask(this.f31042b.o(), new a0(this, z0Var));
    }

    /* access modifiers changed from: package-private */
    public void u() {
        Class<y> cls = y.class;
        try {
            u0 u0Var = (u0) Tasks.await(this.f31041a);
            u0Var.m();
            try {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (!u0Var.i(1, timeUnit)) {
                    v.a(cls.getSimpleName(), "Unable to gracefully shutdown the gRPC ManagedChannel. Will attempt an immediate shutdown.", new Object[0]);
                    u0Var.n();
                    if (!u0Var.i(60, timeUnit)) {
                        v.e(cls.getSimpleName(), "Unable to forcefully shutdown the gRPC ManagedChannel.", new Object[0]);
                    }
                }
            } catch (InterruptedException unused) {
                u0Var.n();
                v.e(cls.getSimpleName(), "Interrupted while shutting down the gRPC Managed Channel", new Object[0]);
                Thread.currentThread().interrupt();
            }
        } catch (ExecutionException e10) {
            v.e(cls.getSimpleName(), "Channel is not initialized, shutdown will just do nothing. Channel initializing run into exception: %s", e10);
        } catch (InterruptedException unused2) {
            v.e(cls.getSimpleName(), "Interrupted while retrieving the gRPC Managed Channel", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }
}
