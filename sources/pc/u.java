package pc;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.h;
import com.google.firebase.auth.n0;
import com.google.firebase.auth.v0;
import dc.a;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.core.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lc.c;
import lc.d;
import lc.k;
import pc.a1;
import y6.f;

/* compiled from: FlutterFirebaseAuthPlugin */
public class u implements FlutterFirebasePlugin, a, ec.a, a1.c {

    /* renamed from: j  reason: collision with root package name */
    static final HashMap<Integer, h> f37186j = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private c f37187a;

    /* renamed from: b  reason: collision with root package name */
    private k f37188b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f37189c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<d, d.C0413d> f37190d = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final q0 f37191f = new q0();

    /* renamed from: g  reason: collision with root package name */
    private final w0 f37192g = new w0();

    /* renamed from: h  reason: collision with root package name */
    private final y0 f37193h = new y0();

    /* renamed from: i  reason: collision with root package name */
    private final z0 f37194i = new z0();

    private Activity O() {
        return this.f37189c;
    }

    static FirebaseAuth P(a1.b bVar) {
        FirebaseAuth instance = FirebaseAuth.getInstance(f.p(bVar.b()));
        if (bVar.c() != null) {
            instance.y(bVar.c());
        }
        String str = i.f33799c.get(bVar.b());
        if (str != null) {
            instance.w(str);
        }
        return instance;
    }

    private void Q(c cVar) {
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_auth", this);
        this.f37188b = new k(cVar, "plugins.flutter.io/firebase_auth");
        x1.T(cVar, this);
        m2.D(cVar, this.f37191f);
        b3.l(cVar, this.f37192g);
        o2.d(cVar, this.f37192g);
        s2.h(cVar, this.f37193h);
        v2.f(cVar, this.f37194i);
        this.f37187a = cVar;
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
            f0Var.success(g3.e((com.google.firebase.auth.d) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void T(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(null);
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void U(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(g3.h((com.google.firebase.auth.i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void V(TaskCompletionSource taskCompletionSource) {
        try {
            j0();
            f37186j.clear();
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void W(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(((v0) task.getResult()).a());
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void X(f fVar, TaskCompletionSource taskCompletionSource) {
        a1.b0 b0Var;
        try {
            HashMap hashMap = new HashMap();
            FirebaseAuth instance = FirebaseAuth.getInstance(fVar);
            a0 m10 = instance.m();
            String p10 = instance.p();
            if (m10 == null) {
                b0Var = null;
            } else {
                b0Var = g3.i(m10);
            }
            if (p10 != null) {
                hashMap.put("APP_LANGUAGE_CODE", p10);
            }
            if (b0Var != null) {
                hashMap.put("APP_CURRENT_USER", b0Var.d());
            }
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void Y(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(null);
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void Z(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(null);
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a0(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(null);
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b0(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(g3.h((com.google.firebase.auth.i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c0(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(g3.h((com.google.firebase.auth.i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d0(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(g3.h((com.google.firebase.auth.i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e0(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(g3.h((com.google.firebase.auth.i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f0(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(g3.h((com.google.firebase.auth.i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void g0(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(g3.h((com.google.firebase.auth.i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void h0(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success((String) task.getResult());
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    private void j0() {
        for (d next : this.f37190d.keySet()) {
            d.C0413d dVar = this.f37190d.get(next);
            if (dVar != null) {
                dVar.g((Object) null);
            }
            next.d((d.C0413d) null);
        }
        this.f37190d.clear();
    }

    public void a(a1.b bVar, String str, String str2, a1.f0<a1.a0> f0Var) {
        P(bVar).D(str, str2).addOnCompleteListener(new d(f0Var));
    }

    public void b(a1.b bVar, String str, a1.q qVar, a1.f0<Void> f0Var) {
        FirebaseAuth P = P(bVar);
        if (qVar == null) {
            P.t(str).addOnCompleteListener(new t(f0Var));
        } else {
            P.u(str, g3.a(qVar)).addOnCompleteListener(new g(f0Var));
        }
    }

    public void c(a1.b bVar, String str, a1.f0<Void> f0Var) {
        P(bVar).g(str).addOnCompleteListener(new c(f0Var));
    }

    public void d(a1.b bVar, a1.t tVar, a1.f0<Void> f0Var) {
        try {
            FirebaseAuth P = P(bVar);
            P.o().b(tVar.b().booleanValue());
            if (tVar.c() != null) {
                P.o().a(tVar.c().booleanValue());
            }
            if (!(tVar.d() == null || tVar.e() == null)) {
                P.o().c(tVar.d(), tVar.e());
            }
            f0Var.success(null);
        } catch (Exception e10) {
            f0Var.a(e10);
        }
    }

    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new i(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public void e(a1.b bVar, String str, a1.f0<Void> f0Var) {
    }

    public void f(a1.b bVar, String str, Long l10, a1.f0<Void> f0Var) {
        try {
            P(bVar).H(str, l10.intValue());
            f0Var.success(null);
        } catch (Exception e10) {
            f0Var.a(e10);
        }
    }

    public void g(a1.b bVar, String str, a1.f0<a1.a0> f0Var) {
        P(bVar).B(str).addOnCompleteListener(new f(f0Var));
    }

    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(f fVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new j(fVar, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public void h(a1.b bVar, String str, a1.f0<String> f0Var) {
        P(bVar).I(str).addOnCompleteListener(new m(f0Var));
    }

    public void i(a1.b bVar, a1.f0<String> f0Var) {
        try {
            FirebaseAuth P = P(bVar);
            d3 d3Var = new d3(P);
            String str = "plugins.flutter.io/firebase_auth/id-token/" + P.l().q();
            d dVar = new d(this.f37187a, str);
            dVar.d(d3Var);
            this.f37190d.put(dVar, d3Var);
            f0Var.success(str);
        } catch (Exception e10) {
            f0Var.a(e10);
        }
    }

    public void j(a1.b bVar, a1.f0<Void> f0Var) {
        try {
            P(bVar).E();
            f0Var.success(null);
        } catch (Exception e10) {
            f0Var.a(e10);
        }
    }

    public void k(a1.b bVar, String str, a1.q qVar, a1.f0<Void> f0Var) {
        P(bVar).v(str, g3.a(qVar)).addOnCompleteListener(new r(f0Var));
    }

    public void l(a1.b bVar, String str, a1.f0<a1.o> f0Var) {
        P(bVar).h(str).addOnCompleteListener(new n(f0Var));
    }

    public void m(a1.b bVar, String str, a1.f0<List<String>> f0Var) {
        P(bVar).k(str).addOnCompleteListener(new e(f0Var));
    }

    public void n(a1.b bVar, String str, String str2, a1.f0<Void> f0Var) {
        P(bVar).i(str, str2).addOnCompleteListener(new l(f0Var));
    }

    public void o(a1.b bVar, String str, String str2, a1.f0<a1.a0> f0Var) {
        P(bVar).j(str, str2).addOnCompleteListener(new s(f0Var));
    }

    public void onAttachedToActivity(ec.c cVar) {
        Activity activity = cVar.getActivity();
        this.f37189c = activity;
        this.f37191f.d0(activity);
    }

    public void onAttachedToEngine(a.b bVar) {
        Q(bVar.b());
    }

    public void onDetachedFromActivity() {
        this.f37189c = null;
        this.f37191f.d0((Activity) null);
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f37189c = null;
        this.f37191f.d0((Activity) null);
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.f37188b.e((k.c) null);
        x1.T(this.f37187a, (a1.c) null);
        m2.D(this.f37187a, (a1.e) null);
        b3.l(this.f37187a, (a1.m) null);
        o2.d(this.f37187a, (a1.h) null);
        s2.h(this.f37187a, (a1.j) null);
        v2.f(this.f37187a, (a1.l) null);
        this.f37188b = null;
        this.f37187a = null;
        j0();
    }

    public void onReattachedToActivityForConfigChanges(ec.c cVar) {
        Activity activity = cVar.getActivity();
        this.f37189c = activity;
        this.f37191f.d0(activity);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.google.firebase.auth.j0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.google.firebase.auth.t0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p(pc.a1.b r11, pc.a1.e0 r12, pc.a1.f0<java.lang.String> r13) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009b }
            r0.<init>()     // Catch:{ Exception -> 0x009b }
            java.lang.String r1 = "plugins.flutter.io/firebase_auth/phone/"
            r0.append(r1)     // Catch:{ Exception -> 0x009b }
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch:{ Exception -> 0x009b }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x009b }
            r0.append(r1)     // Catch:{ Exception -> 0x009b }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x009b }
            lc.d r1 = new lc.d     // Catch:{ Exception -> 0x009b }
            lc.c r2 = r10.f37187a     // Catch:{ Exception -> 0x009b }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x009b }
            java.lang.String r2 = r12.e()     // Catch:{ Exception -> 0x009b }
            r3 = 0
            if (r2 == 0) goto L_0x0035
            java.util.Map<java.lang.String, com.google.firebase.auth.l0> r2 = pc.w0.f37207b     // Catch:{ Exception -> 0x009b }
            java.lang.String r4 = r12.e()     // Catch:{ Exception -> 0x009b }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x009b }
            com.google.firebase.auth.l0 r2 = (com.google.firebase.auth.l0) r2     // Catch:{ Exception -> 0x009b }
            r6 = r2
            goto L_0x0036
        L_0x0035:
            r6 = r3
        L_0x0036:
            java.lang.String r2 = r12.d()     // Catch:{ Exception -> 0x009b }
            if (r2 == 0) goto L_0x0080
            java.util.Map<java.lang.String, com.google.firebase.auth.k0> r4 = pc.w0.f37208c     // Catch:{ Exception -> 0x009b }
            java.util.Set r4 = r4.keySet()     // Catch:{ Exception -> 0x009b }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x009b }
        L_0x0046:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x009b }
            if (r5 == 0) goto L_0x0080
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x009b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x009b }
            java.util.Map<java.lang.String, com.google.firebase.auth.k0> r7 = pc.w0.f37208c     // Catch:{ Exception -> 0x009b }
            java.lang.Object r5 = r7.get(r5)     // Catch:{ Exception -> 0x009b }
            com.google.firebase.auth.k0 r5 = (com.google.firebase.auth.k0) r5     // Catch:{ Exception -> 0x009b }
            java.util.List r5 = r5.w()     // Catch:{ Exception -> 0x009b }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x009b }
        L_0x0062:
            boolean r7 = r5.hasNext()     // Catch:{ Exception -> 0x009b }
            if (r7 == 0) goto L_0x0046
            java.lang.Object r7 = r5.next()     // Catch:{ Exception -> 0x009b }
            com.google.firebase.auth.j0 r7 = (com.google.firebase.auth.j0) r7     // Catch:{ Exception -> 0x009b }
            java.lang.String r8 = r7.c()     // Catch:{ Exception -> 0x009b }
            boolean r8 = r8.equals(r2)     // Catch:{ Exception -> 0x009b }
            if (r8 == 0) goto L_0x0062
            boolean r8 = r7 instanceof com.google.firebase.auth.t0     // Catch:{ Exception -> 0x009b }
            if (r8 == 0) goto L_0x0062
            r3 = r7
            com.google.firebase.auth.t0 r3 = (com.google.firebase.auth.t0) r3     // Catch:{ Exception -> 0x009b }
            goto L_0x0046
        L_0x0080:
            r7 = r3
            pc.f3 r9 = new pc.f3     // Catch:{ Exception -> 0x009b }
            android.app.Activity r3 = r10.O()     // Catch:{ Exception -> 0x009b }
            pc.k r8 = pc.k.f37113a     // Catch:{ Exception -> 0x009b }
            r2 = r9
            r4 = r11
            r5 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x009b }
            r1.d(r9)     // Catch:{ Exception -> 0x009b }
            java.util.Map<lc.d, lc.d$d> r11 = r10.f37190d     // Catch:{ Exception -> 0x009b }
            r11.put(r1, r9)     // Catch:{ Exception -> 0x009b }
            r13.success(r0)     // Catch:{ Exception -> 0x009b }
            goto L_0x009f
        L_0x009b:
            r11 = move-exception
            r13.a(r11)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.u.p(pc.a1$b, pc.a1$e0, pc.a1$f0):void");
    }

    public void q(a1.b bVar, String str, String str2, a1.f0<a1.a0> f0Var) {
        P(bVar).C(str, str2).addOnCompleteListener(new h(f0Var));
    }

    public void r(a1.b bVar, Map<String, Object> map, a1.f0<a1.a0> f0Var) {
        FirebaseAuth P = P(bVar);
        h b10 = g3.b(map);
        if (b10 != null) {
            P.A(b10).addOnCompleteListener(new q(f0Var));
            return;
        }
        throw v.b();
    }

    public void s(a1.b bVar, a1.f0<String> f0Var) {
        try {
            FirebaseAuth P = P(bVar);
            b bVar2 = new b(P);
            String str = "plugins.flutter.io/firebase_auth/auth-state/" + P.l().q();
            d dVar = new d(this.f37187a, str);
            dVar.d(bVar2);
            this.f37190d.put(dVar, bVar2);
            f0Var.success(str);
        } catch (Exception e10) {
            f0Var.a(e10);
        }
    }

    public void t(a1.b bVar, a1.y yVar, a1.f0<a1.a0> f0Var) {
        FirebaseAuth P = P(bVar);
        n0.a d10 = n0.d(yVar.c());
        if (yVar.d() != null) {
            d10.c(yVar.d());
        }
        if (yVar.b() != null) {
            d10.a(yVar.b());
        }
        P.F(O(), d10.b()).addOnCompleteListener(new o(f0Var));
    }

    public void u(a1.b bVar, a1.f0<a1.a0> f0Var) {
        P(bVar).z().addOnCompleteListener(new p(f0Var));
    }

    public void v(a1.b bVar, String str, a1.f0<String> f0Var) {
        try {
            FirebaseAuth P = P(bVar);
            if (str == null) {
                P.G();
            } else {
                P.x(str);
            }
            f0Var.success(P.p());
        } catch (Exception e10) {
            f0Var.a(e10);
        }
    }
}
