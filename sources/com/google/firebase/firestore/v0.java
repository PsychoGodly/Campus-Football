package com.google.firebase.firestore;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.s;
import com.google.firebase.firestore.z;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p8.b;
import p8.d0;
import r7.a1;
import r7.d;
import r7.h;
import r7.i;
import r7.k;
import r7.o;
import r7.p;
import r7.q;
import r7.x1;
import r7.z0;
import u7.l;
import u7.r;
import u7.u;
import u7.z;
import y7.g0;
import y7.x;

/* compiled from: Query */
public class v0 {

    /* renamed from: a  reason: collision with root package name */
    final a1 f26543a;

    /* renamed from: b  reason: collision with root package name */
    final FirebaseFirestore f26544b;

    /* compiled from: Query */
    class a extends ArrayList<a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f26545a;

        a(a aVar) {
            this.f26545a = aVar;
            add(aVar);
        }
    }

    /* compiled from: Query */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f26547a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                r7.p$b[] r0 = r7.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26547a = r0
                r7.p$b r1 = r7.p.b.NOT_EQUAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26547a     // Catch:{ NoSuchFieldError -> 0x001d }
                r7.p$b r1 = r7.p.b.ARRAY_CONTAINS_ANY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26547a     // Catch:{ NoSuchFieldError -> 0x0028 }
                r7.p$b r1 = r7.p.b.IN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26547a     // Catch:{ NoSuchFieldError -> 0x0033 }
                r7.p$b r1 = r7.p.b.NOT_IN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.v0.b.<clinit>():void");
        }
    }

    /* compiled from: Query */
    public enum c {
        ASCENDING,
        DESCENDING
    }

    v0(a1 a1Var, FirebaseFirestore firebaseFirestore) {
        this.f26543a = (a1) x.b(a1Var);
        this.f26544b = (FirebaseFirestore) x.b(firebaseFirestore);
    }

    private q A(s sVar) {
        boolean z10 = sVar instanceof s.b;
        y7.b.d(z10 || (sVar instanceof s.a), "Parsing is only supported for Filter.UnaryFilter and Filter.CompositeFilter.", new Object[0]);
        if (z10) {
            return z((s.b) sVar);
        }
        return x((s.a) sVar);
    }

    private void D(Object obj, p.b bVar) {
        if (!(obj instanceof List) || ((List) obj).size() == 0) {
            throw new IllegalArgumentException("Invalid Query. A non-empty array is required for '" + bVar.toString() + "' filters.");
        }
    }

    private void E() {
        if (this.f26543a.l().equals(a1.a.LIMIT_TO_LAST) && this.f26543a.h().isEmpty()) {
            throw new IllegalStateException("limitToLast() queries require specifying at least one orderBy() clause");
        }
    }

    private void F(a1 a1Var, p pVar) {
        p.b g10 = pVar.g();
        p.b l10 = l(a1Var.i(), i(g10));
        if (l10 == null) {
            return;
        }
        if (l10 == g10) {
            throw new IllegalArgumentException("Invalid Query. You cannot use more than one '" + g10.toString() + "' filter.");
        }
        throw new IllegalArgumentException("Invalid Query. You cannot use '" + g10.toString() + "' filters with '" + l10.toString() + "' filters.");
    }

    private void G(q qVar) {
        a1 a1Var = this.f26543a;
        for (p next : qVar.c()) {
            F(a1Var, next);
            a1Var = a1Var.e(next);
        }
    }

    private f0 f(Executor executor, o.a aVar, Activity activity, o<x0> oVar) {
        E();
        h hVar = new h(executor, new u0(this, oVar));
        return d.c(activity, new r7.v0(this.f26544b.s(), this.f26544b.s().d0(this.f26543a, aVar, hVar), hVar));
    }

    private i h(String str, Object[] objArr, boolean z10) {
        List<z0> h10 = this.f26543a.h();
        if (objArr.length <= h10.size()) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < objArr.length; i10++) {
                String str2 = objArr[i10];
                if (!h10.get(i10).c().equals(r.f30633b)) {
                    arrayList.add(this.f26544b.w().h(str2));
                } else if (str2 instanceof String) {
                    String str3 = str2;
                    if (this.f26543a.q() || !str3.contains(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH)) {
                        u uVar = (u) this.f26543a.n().c(u.p(str3));
                        if (l.n(uVar)) {
                            arrayList.add(z.F(this.f26544b.t(), l.g(uVar)));
                        } else {
                            throw new IllegalArgumentException("Invalid query. When querying a collection group and ordering by FieldPath.documentId(), the value passed to " + str + "() must result in a valid document path, but '" + uVar + "' is not because it contains an odd number of segments.");
                        }
                    } else {
                        throw new IllegalArgumentException("Invalid query. When querying a collection and ordering by FieldPath.documentId(), the value passed to " + str + "() must be a plain document ID, but '" + str3 + "' contains a slash.");
                    }
                } else {
                    throw new IllegalArgumentException("Invalid query. Expected a string for document ID in " + str + "(), but got " + str2 + ".");
                }
            }
            return new i(arrayList, z10);
        }
        throw new IllegalArgumentException("Too many arguments provided to " + str + "(). The number of arguments must be less than or equal to the number of orderBy() clauses.");
    }

    private List<p.b> i(p.b bVar) {
        int i10 = b.f26547a[bVar.ordinal()];
        if (i10 == 1) {
            return Arrays.asList(new p.b[]{p.b.NOT_EQUAL, p.b.NOT_IN});
        } else if (i10 == 2 || i10 == 3) {
            return Arrays.asList(new p.b[]{p.b.NOT_IN});
        } else if (i10 != 4) {
            return new ArrayList();
        } else {
            return Arrays.asList(new p.b[]{p.b.ARRAY_CONTAINS_ANY, p.b.IN, p.b.NOT_IN, p.b.NOT_EQUAL});
        }
    }

    private p.b l(List<q> list, List<p.b> list2) {
        for (q c10 : list) {
            Iterator<p> it = c10.c().iterator();
            while (true) {
                if (it.hasNext()) {
                    p next = it.next();
                    if (list2.contains(next.g())) {
                        return next.g();
                    }
                }
            }
        }
        return null;
    }

    private Task<x0> o(b1 b1Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        o.a aVar = new o.a();
        aVar.f29961a = true;
        aVar.f29962b = true;
        aVar.f29963c = true;
        taskCompletionSource2.setResult(f(y7.p.f31400b, aVar, (Activity) null, new t0(taskCompletionSource, taskCompletionSource2, b1Var)));
        return taskCompletionSource.getTask();
    }

    private static o.a p(o0 o0Var) {
        o.a aVar = new o.a();
        o0 o0Var2 = o0.INCLUDE;
        boolean z10 = true;
        aVar.f29961a = o0Var == o0Var2;
        if (o0Var != o0Var2) {
            z10 = false;
        }
        aVar.f29962b = z10;
        aVar.f29963c = false;
        return aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q(o oVar, x1 x1Var, z zVar) {
        if (zVar != null) {
            oVar.a(null, zVar);
            return;
        }
        y7.b.d(x1Var != null, "Got event without value or error set", new Object[0]);
        oVar.a(new x0(this, x1Var, this.f26544b), (z) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ x0 r(Task task) throws Exception {
        return new x0(new v0(this.f26543a, this.f26544b), (x1) task.getResult(), this.f26544b);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void s(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, b1 b1Var, x0 x0Var, z zVar) {
        if (zVar != null) {
            taskCompletionSource.setException(zVar);
            return;
        }
        try {
            ((f0) Tasks.await(taskCompletionSource2.getTask())).remove();
            if (!x0Var.h().b() || b1Var != b1.SERVER) {
                taskCompletionSource.setResult(x0Var);
            } else {
                taskCompletionSource.setException(new z("Failed to get documents from server. (However, these documents may exist in the local cache. Run again without setting source to SERVER to retrieve the cached documents.)", z.a.UNAVAILABLE));
            }
        } catch (ExecutionException e10) {
            throw y7.b.b(e10, "Failed to register a listener for a query result", new Object[0]);
        } catch (InterruptedException e11) {
            Thread.currentThread().interrupt();
            throw y7.b.b(e11, "Failed to register a listener for a query result", new Object[0]);
        }
    }

    private v0 w(r rVar, c cVar) {
        z0.a aVar;
        x.c(cVar, "Provided direction must not be null.");
        if (this.f26543a.o() != null) {
            throw new IllegalArgumentException("Invalid query. You must not call Query.startAt() or Query.startAfter() before calling Query.orderBy().");
        } else if (this.f26543a.g() == null) {
            if (cVar == c.ASCENDING) {
                aVar = z0.a.ASCENDING;
            } else {
                aVar = z0.a.DESCENDING;
            }
            return new v0(this.f26543a.A(z0.d(aVar, rVar)), this.f26544b);
        } else {
            throw new IllegalArgumentException("Invalid query. You must not call Query.endAt() or Query.endBefore() before calling Query.orderBy().");
        }
    }

    private q x(s.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (s A : aVar.m()) {
            q A2 = A(A);
            if (!A2.b().isEmpty()) {
                arrayList.add(A2);
            }
        }
        if (arrayList.size() == 1) {
            return (q) arrayList.get(0);
        }
        return new k(arrayList, aVar.n());
    }

    private d0 y(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty()) {
                throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid document ID, but it was an empty string.");
            } else if (this.f26543a.q() || !str.contains(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH)) {
                u uVar = (u) this.f26543a.n().c(u.p(str));
                if (l.n(uVar)) {
                    return u7.z.F(n().t(), l.g(uVar));
                }
                throw new IllegalArgumentException("Invalid query. When querying a collection group by FieldPath.documentId(), the value provided must result in a valid document path, but '" + uVar + "' is not because it has an odd number of segments (" + uVar.k() + ").");
            } else {
                throw new IllegalArgumentException("Invalid query. When querying a collection by FieldPath.documentId() you must provide a plain document ID, but '" + str + "' contains a '/' character.");
            }
        } else if (obj instanceof m) {
            return u7.z.F(n().t(), ((m) obj).l());
        } else {
            throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid String or DocumentReference, but it was of type: " + g0.B(obj));
        }
    }

    private p z(s.b bVar) {
        d0 d0Var;
        q m10 = bVar.m();
        p.b n10 = bVar.n();
        Object o10 = bVar.o();
        x.c(m10, "Provided field path must not be null.");
        x.c(n10, "Provided op must not be null.");
        if (!m10.c().r()) {
            p.b bVar2 = p.b.IN;
            if (n10 == bVar2 || n10 == p.b.NOT_IN || n10 == p.b.ARRAY_CONTAINS_ANY) {
                D(o10, n10);
            }
            d0Var = this.f26544b.w().i(o10, n10 == bVar2 || n10 == p.b.NOT_IN);
        } else if (n10 == p.b.ARRAY_CONTAINS || n10 == p.b.ARRAY_CONTAINS_ANY) {
            throw new IllegalArgumentException("Invalid query. You can't perform '" + n10.toString() + "' queries on FieldPath.documentId().");
        } else if (n10 == p.b.IN || n10 == p.b.NOT_IN) {
            D(o10, n10);
            b.C0323b o02 = p8.b.o0();
            for (Object y10 : (List) o10) {
                o02.G(y(y10));
            }
            d0Var = (d0) d0.C0().G(o02).build();
        } else {
            d0Var = y(o10);
        }
        return p.e(m10.c(), n10, d0Var);
    }

    public v0 B(Object... objArr) {
        return new v0(this.f26543a.B(h("startAfter", objArr, false)), this.f26544b);
    }

    public v0 C(Object... objArr) {
        return new v0(this.f26543a.B(h("startAt", objArr, true)), this.f26544b);
    }

    public v0 H(s sVar) {
        q A = A(sVar);
        if (A.b().isEmpty()) {
            return this;
        }
        G(A);
        return new v0(this.f26543a.e(A), this.f26544b);
    }

    public v0 I(q qVar, Object obj) {
        return H(s.b(qVar, obj));
    }

    public v0 J(q qVar, List<? extends Object> list) {
        return H(s.c(qVar, list));
    }

    public v0 K(q qVar, Object obj) {
        return H(s.d(qVar, obj));
    }

    public v0 L(q qVar, Object obj) {
        return H(s.e(qVar, obj));
    }

    public v0 M(q qVar, Object obj) {
        return H(s.f(qVar, obj));
    }

    public v0 N(q qVar, List<? extends Object> list) {
        return H(s.g(qVar, list));
    }

    public v0 O(q qVar, Object obj) {
        return H(s.h(qVar, obj));
    }

    public v0 P(q qVar, Object obj) {
        return H(s.i(qVar, obj));
    }

    public v0 Q(q qVar, Object obj) {
        return H(s.j(qVar, obj));
    }

    public v0 R(q qVar, List<? extends Object> list) {
        return H(s.k(qVar, list));
    }

    public f0 d(o0 o0Var, o<x0> oVar) {
        return e(y7.p.f31399a, o0Var, oVar);
    }

    public f0 e(Executor executor, o0 o0Var, o<x0> oVar) {
        x.c(executor, "Provided executor must not be null.");
        x.c(o0Var, "Provided MetadataChanges value must not be null.");
        x.c(oVar, "Provided EventListener must not be null.");
        return f(executor, p(o0Var), (Activity) null, oVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (!this.f26543a.equals(v0Var.f26543a) || !this.f26544b.equals(v0Var.f26544b)) {
            return false;
        }
        return true;
    }

    public c g(a aVar, a... aVarArr) {
        a aVar2 = new a(aVar);
        aVar2.addAll(Arrays.asList(aVarArr));
        return new c(this, aVar2);
    }

    public int hashCode() {
        return (this.f26543a.hashCode() * 31) + this.f26544b.hashCode();
    }

    public v0 j(Object... objArr) {
        return new v0(this.f26543a.d(h("endAt", objArr, true)), this.f26544b);
    }

    public v0 k(Object... objArr) {
        return new v0(this.f26543a.d(h("endBefore", objArr, false)), this.f26544b);
    }

    public Task<x0> m(b1 b1Var) {
        E();
        if (b1Var == b1.CACHE) {
            return this.f26544b.s().C(this.f26543a).continueWith(y7.p.f31400b, new s0(this));
        }
        return o(b1Var);
    }

    public FirebaseFirestore n() {
        return this.f26544b;
    }

    public v0 t(long j10) {
        if (j10 > 0) {
            return new v0(this.f26543a.s(j10), this.f26544b);
        }
        throw new IllegalArgumentException("Invalid Query. Query limit (" + j10 + ") is invalid. Limit must be positive.");
    }

    public v0 u(long j10) {
        if (j10 > 0) {
            return new v0(this.f26543a.t(j10), this.f26544b);
        }
        throw new IllegalArgumentException("Invalid Query. Query limitToLast (" + j10 + ") is invalid. Limit must be positive.");
    }

    public v0 v(q qVar, c cVar) {
        x.c(qVar, "Provided field path must not be null.");
        return w(qVar.c(), cVar);
    }
}
