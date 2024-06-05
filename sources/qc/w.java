package qc;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.a0;
import com.google.firebase.firestore.b1;
import com.google.firebase.firestore.e1;
import com.google.firebase.firestore.i1;
import com.google.firebase.firestore.k0;
import com.google.firebase.firestore.m;
import com.google.firebase.firestore.n;
import com.google.firebase.firestore.q;
import com.google.firebase.firestore.q0;
import com.google.firebase.firestore.v0;
import com.google.firebase.firestore.x0;
import com.google.firebase.firestore.z0;
import com.unity3d.services.UnityAdsConstants;
import dc.a;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import lc.c;
import lc.d;
import lc.s;
import qc.y;
import rc.e;
import rc.f;
import rc.h;
import rc.j;
import rc.o;
import sc.b;

/* compiled from: FlutterFirebaseFirestorePlugin */
public class w implements FlutterFirebasePlugin, dc.a, ec.a, y.g {

    /* renamed from: i  reason: collision with root package name */
    protected static final HashMap<FirebaseFirestore, b> f37610i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    public static final Map<Integer, n.a> f37611j = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    final s f37612a = new s(c.f37490d);

    /* renamed from: b  reason: collision with root package name */
    private c f37613b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<Activity> f37614c = new AtomicReference<>((Object) null);

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, e1> f37615d = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, d> f37616f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, d.C0413d> f37617g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, f> f37618h = new HashMap();

    /* compiled from: FlutterFirebaseFirestorePlugin */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f37619a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f37620b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                qc.y$u[] r0 = qc.y.u.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37620b = r0
                r1 = 1
                qc.y$u r2 = qc.y.u.DELETE_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f37620b     // Catch:{ NoSuchFieldError -> 0x001d }
                qc.y$u r3 = qc.y.u.UPDATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f37620b     // Catch:{ NoSuchFieldError -> 0x0028 }
                qc.y$u r4 = qc.y.u.SET     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                qc.y$d[] r3 = qc.y.d.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f37619a = r3
                qc.y$d r4 = qc.y.d.COUNT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f37619a     // Catch:{ NoSuchFieldError -> 0x0043 }
                qc.y$d r3 = qc.y.d.SUM     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f37619a     // Catch:{ NoSuchFieldError -> 0x004d }
                qc.y$d r1 = qc.y.d.AVERAGE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qc.w.a.<clinit>():void");
        }
    }

    private void P(ec.c cVar) {
        this.f37614c.set(cVar.getActivity());
    }

    private static void Q(FirebaseFirestore firebaseFirestore) {
        HashMap<FirebaseFirestore, b> hashMap = f37610i;
        synchronized (hashMap) {
            if (hashMap.get(firebaseFirestore) != null) {
                hashMap.remove(firebaseFirestore);
            }
        }
    }

    private void R() {
        this.f37614c.set((Object) null);
    }

    protected static b S(FirebaseFirestore firebaseFirestore) {
        b bVar;
        HashMap<FirebaseFirestore, b> hashMap = f37610i;
        synchronized (hashMap) {
            bVar = hashMap.get(firebaseFirestore);
        }
        return bVar;
    }

    public static FirebaseFirestore T(y.i iVar) {
        synchronized (f37610i) {
            if (U(iVar.b(), iVar.c()) != null) {
                FirebaseFirestore U = U(iVar.b(), iVar.c());
                return U;
            }
            FirebaseFirestore u10 = FirebaseFirestore.u(y6.f.p(iVar.b()), iVar.c());
            u10.J(V(iVar));
            t0(u10, iVar.c());
            return u10;
        }
    }

    protected static FirebaseFirestore U(String str, String str2) {
        for (Map.Entry next : f37610i.entrySet()) {
            if (((b) next.getValue()).b().r().q().equals(str) && ((b) next.getValue()).a().equals(str2)) {
                return (FirebaseFirestore) next.getKey();
            }
        }
        return null;
    }

    static a0 V(y.i iVar) {
        a0.b bVar = new a0.b();
        if (iVar.d().c() != null) {
            bVar.g(iVar.d().c());
        }
        if (iVar.d().e() != null) {
            bVar.i(iVar.d().e().booleanValue());
        }
        if (iVar.d().d() != null) {
            if (iVar.d().d().booleanValue()) {
                Long b10 = iVar.d().b();
                if (b10 == null || b10.longValue() == -1) {
                    b10 = 104857600L;
                }
                bVar.h(q0.b().b(b10.longValue()).a());
            } else {
                bVar.h(k0.b().a());
            }
        }
        return bVar.f();
    }

    private void W(c cVar) {
        this.f37613b = cVar;
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_firestore", this);
        v0.T(this.f37613b, this);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void X(com.google.firebase.firestore.c cVar, y.c cVar2, List list, y.v vVar) {
        try {
            com.google.firebase.firestore.d dVar = (com.google.firebase.firestore.d) Tasks.await(cVar.b(b.b(cVar2)));
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                y.a aVar = (y.a) it.next();
                int i10 = a.f37619a[aVar.c().ordinal()];
                if (i10 == 1) {
                    y.b.a aVar2 = new y.b.a();
                    aVar2.c(y.d.COUNT);
                    aVar2.d(Double.valueOf((double) dVar.e()));
                    arrayList.add(aVar2.a());
                } else if (i10 == 2) {
                    y.b.a aVar3 = new y.b.a();
                    aVar3.c(y.d.SUM);
                    Object d10 = dVar.d(com.google.firebase.firestore.a.f(aVar.b()));
                    Objects.requireNonNull(d10);
                    aVar3.d(Double.valueOf(((Number) d10).doubleValue()));
                    aVar3.b(aVar.b());
                    arrayList.add(aVar3.a());
                } else if (i10 == 3) {
                    y.b.a aVar4 = new y.b.a();
                    aVar4.c(y.d.AVERAGE);
                    Double c10 = dVar.c(com.google.firebase.firestore.a.a(aVar.b()));
                    Objects.requireNonNull(c10);
                    aVar4.d(c10);
                    aVar4.b(aVar.b());
                    arrayList.add(aVar4.a());
                }
            }
            vVar.success(arrayList);
        } catch (Exception e10) {
            sc.a.b(vVar, e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void Y(y.i iVar, y.v vVar) {
        try {
            Tasks.await(T(iVar).k());
            vVar.success(null);
        } catch (Exception e10) {
            sc.a.b(vVar, e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Z(TaskCompletionSource taskCompletionSource) {
        try {
            for (Map.Entry<FirebaseFirestore, b> key : f37610i.entrySet()) {
                FirebaseFirestore firebaseFirestore = (FirebaseFirestore) key.getKey();
                Tasks.await(firebaseFirestore.M());
                Q(firebaseFirestore);
            }
            s0();
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a0(y.i iVar, y.v vVar) {
        try {
            Tasks.await(T(iVar).n());
            vVar.success(null);
        } catch (Exception e10) {
            sc.a.b(vVar, e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b0(y.i iVar, y.f fVar, y.v vVar) {
        try {
            vVar.success((Void) Tasks.await(T(iVar).o(fVar.d()).h()));
        } catch (Exception e10) {
            sc.a.b(vVar, e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c0(y.f fVar, y.i iVar, y.v vVar) {
        try {
            vVar.success(b.j((n) Tasks.await(T(iVar).o(fVar.d()).j(b.e(fVar.f()))), b.d(fVar.e())));
        } catch (Exception e10) {
            sc.a.b(vVar, e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d0(y.i iVar, y.f fVar, y.v vVar) {
        Task task;
        try {
            m o10 = T(iVar).o(fVar.d());
            Object b10 = fVar.b();
            Objects.requireNonNull(b10);
            if (fVar.c().b() != null && fVar.c().b().booleanValue()) {
                task = o10.t(b10, z0.c());
            } else if (fVar.c().c() != null) {
                List<List<String>> c10 = fVar.c().c();
                Objects.requireNonNull(c10);
                task = o10.t(b10, z0.d(b.c(c10)));
            } else {
                task = o10.s(b10);
            }
            vVar.success((Void) Tasks.await(task));
        } catch (Exception e10) {
            sc.a.b(vVar, e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e0(y.i iVar, y.f fVar, y.v vVar) {
        try {
            m o10 = T(iVar).o(fVar.d());
            Map<Object, Object> b10 = fVar.b();
            Objects.requireNonNull(b10);
            Map map = b10;
            HashMap hashMap = new HashMap();
            for (Object next : map.keySet()) {
                if (next instanceof String) {
                    hashMap.put(q.d((String) next), map.get(next));
                } else if (next instanceof q) {
                    hashMap.put((q) next, map.get(next));
                } else {
                    throw new IllegalArgumentException("Invalid key type in update data. Supported types are String and FieldPath.");
                }
            }
            q qVar = (q) hashMap.keySet().iterator().next();
            Object obj = hashMap.get(qVar);
            ArrayList arrayList = new ArrayList();
            for (q qVar2 : hashMap.keySet()) {
                if (!qVar2.equals(qVar)) {
                    arrayList.add(qVar2);
                    arrayList.add(hashMap.get(qVar2));
                }
            }
            vVar.success((Void) Tasks.await(o10.u(qVar, obj, arrayList.toArray())));
        } catch (Exception e10) {
            sc.a.b(vVar, e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f0(y.i iVar, y.v vVar) {
        try {
            Tasks.await(T(iVar).p());
            vVar.success(null);
        } catch (Exception e10) {
            sc.a.b(vVar, e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void g0(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void h0(y.i iVar, String str, y.v vVar, y.o oVar) {
        try {
            v0 v0Var = (v0) Tasks.await(T(iVar).v(str));
            if (v0Var == null) {
                vVar.a(new NullPointerException("Named query has not been found. Please check it has been loaded properly via loadBundle()."));
            } else {
                vVar.success(b.l((x0) Tasks.await(v0Var.m(b.e(oVar.c()))), b.d(oVar.b())));
            }
        } catch (Exception e10) {
            sc.a.b(vVar, e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void i0(y.o oVar, y.i iVar, String str, Boolean bool, y.p pVar, y.v vVar) {
        try {
            b1 e10 = b.e(oVar.c());
            v0 f10 = b.f(T(iVar), str, bool.booleanValue(), pVar);
            if (f10 == null) {
                vVar.a(new y.j("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", (Object) null));
            } else {
                vVar.success(b.l((x0) Tasks.await(f10.m(e10)), b.d(oVar.b())));
            }
        } catch (Exception e11) {
            sc.a.b(vVar, e11);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void j0(y.i iVar, String str, y.v vVar) {
        try {
            Tasks.await(T(iVar).K(str));
            vVar.success(null);
        } catch (Exception e10) {
            sc.a.b(vVar, e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void k0(Boolean bool, y.v vVar) {
        try {
            FirebaseFirestore.L(bool.booleanValue());
            vVar.success(null);
        } catch (Exception e10) {
            sc.a.b(vVar, e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void l0(y.i iVar, y.v vVar) {
        try {
            FirebaseFirestore T = T(iVar);
            Tasks.await(T.M());
            Q(T);
            vVar.success(null);
        } catch (Exception e10) {
            sc.a.b(vVar, e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m0(String str, e1 e1Var) {
        this.f37615d.put(str, e1Var);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void n0(y.i iVar, String str, String str2, y.v vVar) {
        try {
            m o10 = T(iVar).o(str);
            e1 e1Var = this.f37615d.get(str2);
            if (e1Var == null) {
                vVar.a(new Exception("Transaction.getDocument(): No transaction handler exists for ID: " + str2));
                return;
            }
            vVar.success(b.j(e1Var.c(o10), n.a.NONE));
        } catch (Exception e10) {
            sc.a.b(vVar, e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void o0(y.i iVar, y.v vVar) {
        try {
            Tasks.await(T(iVar).O());
            vVar.success(null);
        } catch (Exception e10) {
            sc.a.b(vVar, e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void p0(y.i iVar, List list, y.v vVar) {
        try {
            FirebaseFirestore T = T(iVar);
            i1 j10 = T.j();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                y.s sVar = (y.s) it.next();
                y.u e10 = sVar.e();
                Objects.requireNonNull(e10);
                String d10 = sVar.d();
                Objects.requireNonNull(d10);
                Map<String, Object> b10 = sVar.b();
                m o10 = T.o(d10);
                int i10 = a.f37620b[e10.ordinal()];
                if (i10 == 1) {
                    j10 = j10.b(o10);
                } else if (i10 == 2) {
                    Objects.requireNonNull(b10);
                    j10 = j10.e(o10, b10);
                } else if (i10 == 3) {
                    y.l c10 = sVar.c();
                    Objects.requireNonNull(c10);
                    if (c10.b() != null && c10.b().booleanValue()) {
                        Objects.requireNonNull(b10);
                        j10 = j10.d(o10, b10, z0.c());
                    } else if (c10.c() != null) {
                        List<List<String>> c11 = c10.c();
                        Objects.requireNonNull(c11);
                        List<q> c12 = b.c(c11);
                        Objects.requireNonNull(b10);
                        j10 = j10.d(o10, b10, z0.d(c12));
                    } else {
                        Objects.requireNonNull(b10);
                        j10 = j10.c(o10, b10);
                    }
                }
            }
            Tasks.await(j10.a());
            vVar.success(null);
        } catch (Exception e11) {
            sc.a.b(vVar, e11);
        }
    }

    private String q0(String str, String str2, d.C0413d dVar) {
        d dVar2 = new d(this.f37613b, str + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH + str2, this.f37612a);
        dVar2.d(dVar);
        this.f37616f.put(str2, dVar2);
        this.f37617g.put(str2, dVar);
        return str2;
    }

    private String r0(String str, d.C0413d dVar) {
        return q0(str, UUID.randomUUID().toString().toLowerCase(Locale.US), dVar);
    }

    private void s0() {
        synchronized (this.f37616f) {
            for (String str : this.f37616f.keySet()) {
                this.f37616f.get(str).d((d.C0413d) null);
            }
            this.f37616f.clear();
        }
        synchronized (this.f37617g) {
            for (String str2 : this.f37617g.keySet()) {
                this.f37617g.get(str2).g((Object) null);
            }
            this.f37617g.clear();
        }
        this.f37618h.clear();
    }

    protected static void t0(FirebaseFirestore firebaseFirestore, String str) {
        HashMap<FirebaseFirestore, b> hashMap = f37610i;
        synchronized (hashMap) {
            if (hashMap.get(firebaseFirestore) == null) {
                hashMap.put(firebaseFirestore, new b(firebaseFirestore, str));
            }
        }
    }

    public void a(y.i iVar, List<y.s> list, y.v<Void> vVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new u(iVar, list, vVar));
    }

    public void b(String str, y.t tVar, List<y.s> list, y.v<Void> vVar) {
        f fVar = this.f37618h.get(str);
        Objects.requireNonNull(fVar);
        fVar.a(tVar, list);
        vVar.success(null);
    }

    public void c(y.i iVar, String str, y.v<Void> vVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new s(iVar, str, vVar));
    }

    public void d(y.i iVar, String str, y.o oVar, y.v<y.q> vVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new t(iVar, str, vVar, oVar));
    }

    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new p(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public void e(y.i iVar, y.v<String> vVar) {
        vVar.success(r0("plugins.flutter.io/firebase_firestore/snapshotsInSync", new j(T(iVar))));
    }

    public void f(y.i iVar, y.v<Void> vVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(iVar, vVar));
    }

    public void g(y.i iVar, String str, String str2, y.v<y.m> vVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new q(this, iVar, str2, str, vVar));
    }

    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(y6.f fVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new d(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public void h(y.i iVar, y.v<Void> vVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new j(iVar, vVar));
    }

    public void i(y.i iVar, y.f fVar, y.v<Void> vVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(iVar, fVar, vVar));
    }

    public void j(y.i iVar, y.v<Void> vVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new h(iVar, vVar));
    }

    public void k(Boolean bool, y.v<Void> vVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new o(bool, vVar));
    }

    public void l(y.i iVar, y.f fVar, y.v<Void> vVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new v(iVar, fVar, vVar));
    }

    public void m(y.i iVar, y.f fVar, y.v<Void> vVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new e(iVar, fVar, vVar));
    }

    public void n(y.i iVar, String str, Boolean bool, y.p pVar, y.o oVar, y.v<y.q> vVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new l(oVar, iVar, str, bool, pVar, vVar));
    }

    public void o(y.i iVar, y.v<Void> vVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new k(iVar, vVar));
    }

    public void onAttachedToActivity(ec.c cVar) {
        P(cVar);
    }

    public void onAttachedToEngine(a.b bVar) {
        W(bVar.b());
    }

    public void onDetachedFromActivity() {
        R();
    }

    public void onDetachedFromActivityForConfigChanges() {
        R();
    }

    public void onDetachedFromEngine(a.b bVar) {
        s0();
        this.f37613b = null;
    }

    public void onReattachedToActivityForConfigChanges(ec.c cVar) {
        P(cVar);
    }

    public void p(y.i iVar, byte[] bArr, y.v<String> vVar) {
        vVar.success(r0("plugins.flutter.io/firebase_firestore/loadBundle", new e(T(iVar), bArr)));
    }

    public void q(y.i iVar, y.v<Void> vVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new i(iVar, vVar));
    }

    public void r(y.i iVar, y.f fVar, Boolean bool, y.v<String> vVar) {
        vVar.success(r0("plugins.flutter.io/firebase_firestore/document", new rc.b(T(iVar), T(iVar).o(fVar.d()), bool, b.d(fVar.e()))));
    }

    public void s(y.i iVar, Long l10, Long l11, y.v<String> vVar) {
        FirebaseFirestore T = T(iVar);
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        o oVar = new o(new m(this, lowerCase), T, lowerCase, l10, l11);
        q0("plugins.flutter.io/firebase_firestore/transaction", lowerCase, oVar);
        this.f37618h.put(lowerCase, oVar);
        vVar.success(lowerCase);
    }

    public void t(y.i iVar, y.f fVar, y.v<y.m> vVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new r(fVar, iVar, vVar));
    }

    public void u(y.i iVar, String str, y.p pVar, y.c cVar, List<y.a> list, Boolean bool, y.v<List<y.b>> vVar) {
        v0 f10 = b.f(T(iVar), str, bool.booleanValue(), pVar);
        ArrayList arrayList = new ArrayList();
        for (y.a next : list) {
            int i10 = a.f37619a[next.c().ordinal()];
            if (i10 == 1) {
                arrayList.add(com.google.firebase.firestore.a.b());
            } else if (i10 == 2) {
                arrayList.add(com.google.firebase.firestore.a.f(next.b()));
            } else if (i10 == 3) {
                arrayList.add(com.google.firebase.firestore.a.a(next.b()));
            }
        }
        FlutterFirebasePlugin.cachedThreadPool.execute(new n(f10.g((com.google.firebase.firestore.a) arrayList.get(0), (com.google.firebase.firestore.a[]) arrayList.subList(1, arrayList.size()).toArray(new com.google.firebase.firestore.a[0])), cVar, list, vVar));
    }

    public void v(y.i iVar, String str, Boolean bool, y.p pVar, y.o oVar, Boolean bool2, y.v<String> vVar) {
        v0 f10 = b.f(T(iVar), str, bool.booleanValue(), pVar);
        if (f10 == null) {
            vVar.a(new y.j("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", (Object) null));
        } else {
            vVar.success(r0("plugins.flutter.io/firebase_firestore/query", new h(f10, bool2, b.d(oVar.b()))));
        }
    }
}
