package x7;

import android.content.Context;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.z;
import dd.g;
import dd.j1;
import dd.y0;
import dd.z;
import dd.z0;
import p7.j;
import r7.l;
import u7.f;
import y7.g;
import y7.g0;

/* compiled from: FirestoreChannel */
public class y {

    /* renamed from: g  reason: collision with root package name */
    private static final y0.g<String> f31173g;

    /* renamed from: h  reason: collision with root package name */
    private static final y0.g<String> f31174h;

    /* renamed from: i  reason: collision with root package name */
    private static final y0.g<String> f31175i;

    /* renamed from: j  reason: collision with root package name */
    private static volatile String f31176j = "gl-java/";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final g f31177a;

    /* renamed from: b  reason: collision with root package name */
    private final p7.a<j> f31178b;

    /* renamed from: c  reason: collision with root package name */
    private final p7.a<String> f31179c;

    /* renamed from: d  reason: collision with root package name */
    private final h0 f31180d;

    /* renamed from: e  reason: collision with root package name */
    private final String f31181e;

    /* renamed from: f  reason: collision with root package name */
    private final i0 f31182f;

    /* compiled from: FirestoreChannel */
    class a extends g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j0 f31183a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ dd.g[] f31184b;

        a(j0 j0Var, dd.g[] gVarArr) {
            this.f31183a = j0Var;
            this.f31184b = gVarArr;
        }

        public void a(j1 j1Var, y0 y0Var) {
            try {
                this.f31183a.b(j1Var);
            } catch (Throwable th) {
                y.this.f31177a.u(th);
            }
        }

        public void b(y0 y0Var) {
            try {
                this.f31183a.c(y0Var);
            } catch (Throwable th) {
                y.this.f31177a.u(th);
            }
        }

        public void c(Object obj) {
            try {
                this.f31183a.d(obj);
                this.f31184b[0].c(1);
            } catch (Throwable th) {
                y.this.f31177a.u(th);
            }
        }

        public void d() {
        }
    }

    /* compiled from: FirestoreChannel */
    class b extends z<ReqT, RespT> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ dd.g[] f31186a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Task f31187b;

        b(dd.g[] gVarArr, Task task) {
            this.f31186a = gVarArr;
            this.f31187b = task;
        }

        public void b() {
            if (this.f31186a[0] == null) {
                this.f31187b.addOnSuccessListener(y.this.f31177a.o(), z.f39321a);
            } else {
                super.b();
            }
        }

        /* access modifiers changed from: protected */
        public dd.g<ReqT, RespT> f() {
            y7.b.d(this.f31186a[0] != null, "ClientCall used before onOpen() callback", new Object[0]);
            return this.f31186a[0];
        }
    }

    /* compiled from: FirestoreChannel */
    class c extends g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f31189a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ dd.g f31190b;

        c(e eVar, dd.g gVar) {
            this.f31189a = eVar;
            this.f31190b = gVar;
        }

        public void a(j1 j1Var, y0 y0Var) {
            this.f31189a.a(j1Var);
        }

        public void c(Object obj) {
            this.f31189a.b(obj);
            this.f31190b.c(1);
        }
    }

    /* compiled from: FirestoreChannel */
    class d extends g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TaskCompletionSource f31192a;

        d(TaskCompletionSource taskCompletionSource) {
            this.f31192a = taskCompletionSource;
        }

        public void a(j1 j1Var, y0 y0Var) {
            if (!j1Var.o()) {
                this.f31192a.setException(y.this.f(j1Var));
            } else if (!this.f31192a.getTask().isComplete()) {
                this.f31192a.setException(new com.google.firebase.firestore.z("Received onClose with status OK, but no message.", z.a.INTERNAL));
            }
        }

        public void c(Object obj) {
            this.f31192a.setResult(obj);
        }
    }

    /* compiled from: FirestoreChannel */
    public static abstract class e<T> {
        public abstract void a(j1 j1Var);

        public abstract void b(T t10);
    }

    static {
        y0.d<String> dVar = y0.f32388e;
        f31173g = y0.g.e("x-goog-api-client", dVar);
        f31174h = y0.g.e("google-cloud-resource-prefix", dVar);
        f31175i = y0.g.e("x-goog-request-params", dVar);
    }

    y(y7.g gVar, Context context, p7.a<j> aVar, p7.a<String> aVar2, l lVar, i0 i0Var) {
        this.f31177a = gVar;
        this.f31182f = i0Var;
        this.f31178b = aVar;
        this.f31179c = aVar2;
        this.f31180d = new h0(gVar, context, lVar, new u(aVar, aVar2));
        f a10 = lVar.a();
        this.f31181e = String.format("projects/%s/databases/%s", new Object[]{a10.f(), a10.e()});
    }

    /* access modifiers changed from: private */
    public com.google.firebase.firestore.z f(j1 j1Var) {
        if (q.j(j1Var)) {
            return new com.google.firebase.firestore.z("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", z.a.c(j1Var.m().d()), j1Var.l());
        }
        return g0.t(j1Var);
    }

    private String g() {
        return String.format("%s fire/%s grpc/", new Object[]{f31176j, "24.9.1"});
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i(dd.g[] gVarArr, j0 j0Var, Task task) {
        gVarArr[0] = (dd.g) task.getResult();
        gVarArr[0].e(new a(j0Var, gVarArr), l());
        j0Var.a();
        gVarArr[0].c(1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void j(TaskCompletionSource taskCompletionSource, Object obj, Task task) {
        dd.g gVar = (dd.g) task.getResult();
        gVar.e(new d(taskCompletionSource), l());
        gVar.c(2);
        gVar.d(obj);
        gVar.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k(e eVar, Object obj, Task task) {
        dd.g gVar = (dd.g) task.getResult();
        gVar.e(new c(eVar, gVar), l());
        gVar.c(1);
        gVar.d(obj);
        gVar.b();
    }

    private y0 l() {
        y0 y0Var = new y0();
        y0Var.p(f31173g, g());
        y0Var.p(f31174h, this.f31181e);
        y0Var.p(f31175i, this.f31181e);
        i0 i0Var = this.f31182f;
        if (i0Var != null) {
            i0Var.a(y0Var);
        }
        return y0Var;
    }

    public static void p(String str) {
        f31176j = str;
    }

    public void h() {
        this.f31178b.b();
        this.f31179c.b();
    }

    /* access modifiers changed from: package-private */
    public <ReqT, RespT> dd.g<ReqT, RespT> m(z0<ReqT, RespT> z0Var, j0<RespT> j0Var) {
        dd.g[] gVarArr = {null};
        Task<dd.g<ReqT, RespT>> i10 = this.f31180d.i(z0Var);
        i10.addOnCompleteListener(this.f31177a.o(), (OnCompleteListener<dd.g<ReqT, RespT>>) new x(this, gVarArr, j0Var));
        return new b(gVarArr, i10);
    }

    /* access modifiers changed from: package-private */
    public <ReqT, RespT> Task<RespT> n(z0<ReqT, RespT> z0Var, ReqT reqt) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f31180d.i(z0Var).addOnCompleteListener(this.f31177a.o(), new v(this, taskCompletionSource, reqt));
        return taskCompletionSource.getTask();
    }

    /* access modifiers changed from: package-private */
    public <ReqT, RespT> void o(z0<ReqT, RespT> z0Var, ReqT reqt, e<RespT> eVar) {
        this.f31180d.i(z0Var).addOnCompleteListener(this.f31177a.o(), new w(this, eVar, reqt));
    }

    public void q() {
        this.f31180d.u();
    }
}
