package pc;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.h0;
import com.google.firebase.auth.i;
import com.google.firebase.auth.i0;
import com.google.firebase.auth.k0;
import com.google.firebase.auth.l0;
import com.google.firebase.auth.q0;
import com.google.firebase.auth.s0;
import i8.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import pc.a1;

/* compiled from: FlutterFirebaseMultiFactor */
public class w0 implements a1.m, a1.h {

    /* renamed from: a  reason: collision with root package name */
    static final Map<String, Map<String, h0>> f37206a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    static final Map<String, l0> f37207b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    static final Map<String, k0> f37208c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    static final Map<String, i0> f37209d = new HashMap();

    /* access modifiers changed from: private */
    public static /* synthetic */ void m(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(null);
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void n(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(null);
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void o(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            String uuid = UUID.randomUUID().toString();
            f37207b.put(uuid, (l0) task.getResult());
            f0Var.success(new a1.w.a().b(uuid).a());
            return;
        }
        f0Var.a(v.e(task.getException()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void p(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(g3.h((i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void q(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(null);
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    public void a(a1.b bVar, a1.x xVar, String str, a1.f0<Void> f0Var) {
        try {
            l(bVar).a(s0.a(q0.a(xVar.c(), xVar.b())), str).addOnCompleteListener(new u0(f0Var));
        } catch (a e10) {
            f0Var.a(e10);
        }
    }

    public void b(a1.b bVar, String str, String str2, a1.f0<Void> f0Var) {
        try {
            l(bVar).a(f37209d.get(str), str2).addOnCompleteListener(new s0(f0Var));
        } catch (a e10) {
            f0Var.a(e10);
        }
    }

    public void c(a1.b bVar, a1.f0<a1.w> f0Var) {
        try {
            l(bVar).c().addOnCompleteListener(new r0(f0Var));
        } catch (a e10) {
            f0Var.a(e10);
        }
    }

    public void d(a1.b bVar, String str, a1.f0<Void> f0Var) {
        try {
            l(bVar).d(str).addOnCompleteListener(new v0(f0Var));
        } catch (a e10) {
            f0Var.a(v.e(e10));
        }
    }

    public void e(String str, a1.x xVar, String str2, a1.f0<a1.a0> f0Var) {
        i0 i0Var;
        k0 k0Var = f37208c.get(str);
        if (k0Var == null) {
            f0Var.a(v.e(new Exception("Resolver not found")));
            return;
        }
        if (xVar != null) {
            i0Var = s0.a(q0.a(xVar.c(), xVar.b()));
        } else {
            i0Var = f37209d.get(str2);
        }
        k0Var.y(i0Var).addOnCompleteListener(new t0(f0Var));
    }

    public void f(a1.b bVar, a1.f0<List<a1.v>> f0Var) {
        try {
            f0Var.success(g3.d(l(bVar).b()));
        } catch (a e10) {
            f0Var.a(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public h0 l(a1.b bVar) throws a {
        a0 I = q0.I(bVar);
        if (I != null) {
            Map<String, Map<String, h0>> map = f37206a;
            if (map.get(bVar.b()) == null) {
                map.put(bVar.b(), new HashMap());
            }
            Map map2 = map.get(bVar.b());
            if (map2.get(I.c()) == null) {
                map2.put(I.c(), I.y());
            }
            return (h0) map2.get(I.c());
        }
        throw new a("No user is signed in");
    }
}
