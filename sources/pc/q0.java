package pc;

import android.app.Activity;
import android.net.Uri;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.c0;
import com.google.firebase.auth.d1;
import com.google.firebase.auth.h;
import com.google.firebase.auth.i;
import com.google.firebase.auth.n0;
import com.google.firebase.auth.o0;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.util.Map;
import pc.a1;
import y6.f;

/* compiled from: FlutterFirebaseAuthUser */
public class q0 implements a1.e {

    /* renamed from: a  reason: collision with root package name */
    private Activity f37166a;

    public static a0 I(a1.b bVar) {
        FirebaseAuth instance = FirebaseAuth.getInstance(f.p(bVar.b()));
        if (bVar.c() != null) {
            instance.y(bVar.c());
        }
        return instance.m();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void J(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(null);
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void K(a1.b bVar, a1.f0 f0Var, Boolean bool) {
        a0 I = I(bVar);
        if (I == null) {
            f0Var.a(v.d());
            return;
        }
        try {
            f0Var.success(g3.k((c0) Tasks.await(I.w(bool.booleanValue()))));
        } catch (Exception e10) {
            f0Var.a(v.e(e10));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void L(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(g3.h((i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void M(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(g3.h((i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void N(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(g3.h((i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void O(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(g3.h((i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void P(a1.f0 f0Var, a0 a0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(g3.i(a0Var));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void Q(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(null);
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void R(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(null);
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void S(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(g3.h((i) task.getResult()));
            return;
        }
        Exception exception = task.getException();
        if (exception.getMessage().contains("User was not linked to an account with the given provider.")) {
            f0Var.a(v.c());
        } else {
            f0Var.a(v.e(exception));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void T(a1.f0 f0Var, a0 a0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(g3.i(a0Var));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void U(a0 a0Var, a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            a0Var.K().addOnCompleteListener(new d0(f0Var, a0Var));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void V(a1.f0 f0Var, a0 a0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(g3.i(a0Var));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void W(a0 a0Var, a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            a0Var.K().addOnCompleteListener(new b0(f0Var, a0Var));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void X(a1.f0 f0Var, a0 a0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(g3.i(a0Var));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void Y(a0 a0Var, a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            a0Var.K().addOnCompleteListener(new c0(f0Var, a0Var));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void Z(a1.f0 f0Var, a0 a0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(g3.i(a0Var));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a0(a0 a0Var, a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            a0Var.K().addOnCompleteListener(new e0(f0Var, a0Var));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b0(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(null);
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c0(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(null);
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    public void a(a1.b bVar, String str, a1.f0<a1.a0> f0Var) {
        a0 I = I(bVar);
        if (I == null) {
            f0Var.a(v.d());
        } else {
            I.d0(str).addOnCompleteListener(new z(f0Var));
        }
    }

    public void b(a1.b bVar, a1.y yVar, a1.f0<a1.a0> f0Var) {
        a0 I = I(bVar);
        n0.a d10 = n0.d(yVar.c());
        if (yVar.d() != null) {
            d10.c(yVar.d());
        }
        if (yVar.b() != null) {
            d10.a(yVar.b());
        }
        I.c0(this.f37166a, d10.b()).addOnCompleteListener(new y(f0Var));
    }

    public void c(a1.b bVar, a1.y yVar, a1.f0<a1.a0> f0Var) {
        a0 I = I(bVar);
        n0.a d10 = n0.d(yVar.c());
        if (yVar.d() != null) {
            d10.c(yVar.d());
        }
        if (yVar.b() != null) {
            d10.a(yVar.b());
        }
        I.Z(this.f37166a, d10.b()).addOnCompleteListener(new o0(f0Var));
    }

    public void d(a1.b bVar, a1.q qVar, a1.f0<Void> f0Var) {
        a0 I = I(bVar);
        if (I == null) {
            f0Var.a(v.d());
        } else if (qVar == null) {
            I.L().addOnCompleteListener(new x(f0Var));
        } else {
            I.Y(g3.a(qVar)).addOnCompleteListener(new k0(f0Var));
        }
    }

    public void d0(Activity activity) {
        this.f37166a = activity;
    }

    public void e(a1.b bVar, Map<String, Object> map, a1.f0<a1.a0> f0Var) {
        a0 I = I(bVar);
        h b10 = g3.b(map);
        if (I == null) {
            f0Var.a(v.d());
        } else if (b10 == null) {
            f0Var.a(v.b());
        } else {
            I.I(b10).addOnCompleteListener(new l0(f0Var));
        }
    }

    public void f(a1.b bVar, a1.f0<a1.b0> f0Var) {
        a0 I = I(bVar);
        if (I == null) {
            f0Var.a(v.d());
        } else {
            I.K().addOnCompleteListener(new f0(f0Var, I));
        }
    }

    public void g(a1.b bVar, Map<String, Object> map, a1.f0<a1.a0> f0Var) {
        a0 I = I(bVar);
        h b10 = g3.b(map);
        if (I == null) {
            f0Var.a(v.d());
        } else if (b10 == null) {
            f0Var.a(v.b());
        } else {
            I.J(b10).addOnCompleteListener(new m0(f0Var));
        }
    }

    public void h(a1.b bVar, String str, a1.f0<a1.b0> f0Var) {
        a0 I = I(bVar);
        if (I == null) {
            f0Var.a(v.d());
        } else {
            I.e0(str).addOnCompleteListener(new h0(I, f0Var));
        }
    }

    public void i(a1.b bVar, String str, a1.f0<a1.b0> f0Var) {
        a0 I = I(bVar);
        if (I == null) {
            f0Var.a(v.d());
        } else {
            I.f0(str).addOnCompleteListener(new i0(I, f0Var));
        }
    }

    public void j(a1.b bVar, a1.d0 d0Var, a1.f0<a1.b0> f0Var) {
        a0 I = I(bVar);
        if (I == null) {
            f0Var.a(v.d());
            return;
        }
        d1.a aVar = new d1.a();
        if (d0Var.c().booleanValue()) {
            aVar.b(d0Var.b());
        }
        if (d0Var.e().booleanValue()) {
            if (d0Var.d() != null) {
                aVar.c(Uri.parse(d0Var.d()));
            } else {
                aVar.c((Uri) null);
            }
        }
        I.h0(aVar.a()).addOnCompleteListener(new j0(I, f0Var));
    }

    public void k(a1.b bVar, a1.f0<Void> f0Var) {
        a0 I = I(bVar);
        if (I == null) {
            f0Var.a(v.d());
        } else {
            I.v().addOnCompleteListener(new n0(f0Var));
        }
    }

    public void l(a1.b bVar, String str, a1.q qVar, a1.f0<Void> f0Var) {
        a0 I = I(bVar);
        if (I == null) {
            f0Var.a(v.d());
        } else if (qVar == null) {
            I.i0(str).addOnCompleteListener(new p0(f0Var));
        } else {
            I.j0(str, g3.a(qVar)).addOnCompleteListener(new a0(f0Var));
        }
    }

    public void m(a1.b bVar, Map<String, Object> map, a1.f0<a1.b0> f0Var) {
        a0 I = I(bVar);
        if (I == null) {
            f0Var.a(v.d());
            return;
        }
        o0 o0Var = (o0) g3.b(map);
        if (o0Var == null) {
            f0Var.a(v.b());
        } else {
            I.g0(o0Var).addOnCompleteListener(new w(I, f0Var));
        }
    }

    public void n(a1.b bVar, Boolean bool, a1.f0<a1.u> f0Var) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new g0(bVar, f0Var, bool));
    }
}
