package com.google.firebase.firestore;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.a0;
import com.google.firebase.firestore.e1;
import com.google.firebase.firestore.z;
import com.unity3d.services.UnityAdsConstants;
import d7.b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p7.e;
import p7.i;
import p7.j;
import r7.a1;
import r7.d;
import r7.h;
import r7.j1;
import r7.l;
import r7.o0;
import t7.a3;
import u7.f;
import u7.q;
import u7.r;
import u7.u;
import x7.i0;
import x7.y;
import y7.g;
import y7.p;
import y7.v;
import y7.x;

public class FirebaseFirestore {

    /* renamed from: a  reason: collision with root package name */
    private final Context f26402a;

    /* renamed from: b  reason: collision with root package name */
    private final f f26403b;

    /* renamed from: c  reason: collision with root package name */
    private final String f26404c;

    /* renamed from: d  reason: collision with root package name */
    private final p7.a<j> f26405d;

    /* renamed from: e  reason: collision with root package name */
    private final p7.a<String> f26406e;

    /* renamed from: f  reason: collision with root package name */
    private final g f26407f;

    /* renamed from: g  reason: collision with root package name */
    private final y6.f f26408g;

    /* renamed from: h  reason: collision with root package name */
    private final g1 f26409h;

    /* renamed from: i  reason: collision with root package name */
    private final a f26410i;

    /* renamed from: j  reason: collision with root package name */
    private j7.a f26411j;

    /* renamed from: k  reason: collision with root package name */
    private a0 f26412k = new a0.b().f();

    /* renamed from: l  reason: collision with root package name */
    private volatile o0 f26413l;

    /* renamed from: m  reason: collision with root package name */
    private final i0 f26414m;

    public interface a {
        void remove(String str);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, p7.a<p7.j>] */
    /* JADX WARNING: type inference failed for: r5v0, types: [p7.a<java.lang.String>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    FirebaseFirestore(android.content.Context r1, u7.f r2, java.lang.String r3, p7.a<p7.j> r4, p7.a<java.lang.String> r5, y7.g r6, y6.f r7, com.google.firebase.firestore.FirebaseFirestore.a r8, x7.i0 r9) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = y7.x.b(r1)
            android.content.Context r1 = (android.content.Context) r1
            r0.f26402a = r1
            java.lang.Object r1 = y7.x.b(r2)
            u7.f r1 = (u7.f) r1
            java.lang.Object r1 = y7.x.b(r1)
            u7.f r1 = (u7.f) r1
            r0.f26403b = r1
            com.google.firebase.firestore.g1 r1 = new com.google.firebase.firestore.g1
            r1.<init>(r2)
            r0.f26409h = r1
            java.lang.Object r1 = y7.x.b(r3)
            java.lang.String r1 = (java.lang.String) r1
            r0.f26404c = r1
            java.lang.Object r1 = y7.x.b(r4)
            p7.a r1 = (p7.a) r1
            r0.f26405d = r1
            java.lang.Object r1 = y7.x.b(r5)
            p7.a r1 = (p7.a) r1
            r0.f26406e = r1
            java.lang.Object r1 = y7.x.b(r6)
            y7.g r1 = (y7.g) r1
            r0.f26407f = r1
            r0.f26408g = r7
            r0.f26410i = r8
            r0.f26414m = r9
            com.google.firebase.firestore.a0$b r1 = new com.google.firebase.firestore.a0$b
            r1.<init>()
            com.google.firebase.firestore.a0 r1 = r1.f()
            r0.f26412k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.FirebaseFirestore.<init>(android.content.Context, u7.f, java.lang.String, p7.a, p7.a, y7.g, y6.f, com.google.firebase.firestore.FirebaseFirestore$a, x7.i0):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ v0 A(Task task) throws Exception {
        a1 a1Var = (a1) task.getResult();
        if (a1Var != null) {
            return new v0(a1Var, this);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object B(e1.a aVar, j1 j1Var) throws Exception {
        return aVar.a(new e1(j1Var, this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task C(Executor executor, e1.a aVar, j1 j1Var) {
        return Tasks.call(executor, new x(this, aVar, j1Var));
    }

    private a0 F(a0 a0Var, j7.a aVar) {
        return a0Var;
    }

    static FirebaseFirestore G(Context context, y6.f fVar, b8.a<b> aVar, b8.a<c7.b> aVar2, String str, a aVar3, i0 i0Var) {
        String g10 = fVar.r().g();
        if (g10 != null) {
            String str2 = str;
            f c10 = f.c(g10, str);
            g gVar = new g();
            b8.a<b> aVar4 = aVar;
            b8.a<c7.b> aVar5 = aVar2;
            return new FirebaseFirestore(context, c10, fVar.q(), new i(aVar), new e(aVar2), gVar, fVar, aVar3, i0Var);
        }
        throw new IllegalArgumentException("FirebaseOptions.getProjectId() cannot be null");
    }

    private <ResultT> Task<ResultT> I(f1 f1Var, e1.a<ResultT> aVar, Executor executor) {
        q();
        return this.f26413l.j0(f1Var, new y(this, executor, aVar));
    }

    public static void L(boolean z10) {
        if (z10) {
            v.d(v.b.DEBUG);
        } else {
            v.d(v.b.WARN);
        }
    }

    private f0 h(Executor executor, Activity activity, Runnable runnable) {
        q();
        h hVar = new h(executor, new u(runnable));
        this.f26413l.x(hVar);
        return d.c(activity, new v(this, hVar));
    }

    private void q() {
        if (this.f26413l == null) {
            synchronized (this.f26403b) {
                if (this.f26413l == null) {
                    this.f26413l = new o0(this.f26402a, new l(this.f26403b, this.f26404c, this.f26412k.c(), this.f26412k.e()), this.f26412k, this.f26405d, this.f26406e, this.f26407f, this.f26414m);
                }
            }
        }
    }

    @Keep
    static void setClientLanguage(String str) {
        y.p(str);
    }

    public static FirebaseFirestore u(y6.f fVar, String str) {
        x.c(fVar, "Provided FirebaseApp must not be null.");
        x.c(str, "Provided database name must not be null.");
        b0 b0Var = (b0) fVar.k(b0.class);
        x.c(b0Var, "Firestore component is not present.");
        return b0Var.b(str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void x(Runnable runnable, Void voidR, z zVar) {
        y7.b.d(zVar == null, "snapshots-in-sync listeners should never get errors.", new Object[0]);
        runnable.run();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y(h hVar) {
        hVar.d();
        this.f26413l.f0(hVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void z(TaskCompletionSource taskCompletionSource) {
        try {
            if (this.f26413l != null) {
                if (!this.f26413l.F()) {
                    throw new z("Persistence cannot be cleared while the firestore instance is running.", z.a.FAILED_PRECONDITION);
                }
            }
            a3.s(this.f26402a, this.f26403b, this.f26404c);
            taskCompletionSource.setResult(null);
        } catch (z e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public h0 D(InputStream inputStream) {
        q();
        h0 h0Var = new h0();
        this.f26413l.e0(inputStream, h0Var);
        return h0Var;
    }

    public h0 E(byte[] bArr) {
        return D(new ByteArrayInputStream(bArr));
    }

    public <TResult> Task<TResult> H(f1 f1Var, e1.a<TResult> aVar) {
        x.c(aVar, "Provided transaction update function must not be null.");
        return I(f1Var, aVar, j1.g());
    }

    public void J(a0 a0Var) {
        a0 F = F(a0Var, this.f26411j);
        synchronized (this.f26403b) {
            x.c(F, "Provided settings must not be null.");
            if (this.f26413l != null) {
                if (!this.f26412k.equals(F)) {
                    throw new IllegalStateException("FirebaseFirestore has already been started and its settings can no longer be changed. You can only call setFirestoreSettings() before calling any other methods on a FirebaseFirestore object.");
                }
            }
            this.f26412k = F;
        }
    }

    @Deprecated
    public Task<Void> K(String str) {
        q();
        x.e(this.f26412k.d(), "Cannot enable indexes when persistence is disabled");
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("indexes")) {
                JSONArray jSONArray = jSONObject.getJSONArray("indexes");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    String string = jSONObject2.getString("collectionGroup");
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray optJSONArray = jSONObject2.optJSONArray("fields");
                    int i11 = 0;
                    while (optJSONArray != null && i11 < optJSONArray.length()) {
                        JSONObject jSONObject3 = optJSONArray.getJSONObject(i11);
                        r p10 = r.p(jSONObject3.getString("fieldPath"));
                        if ("CONTAINS".equals(jSONObject3.optString("arrayConfig"))) {
                            arrayList2.add(q.c.c(p10, q.c.a.CONTAINS));
                        } else if ("ASCENDING".equals(jSONObject3.optString("order"))) {
                            arrayList2.add(q.c.c(p10, q.c.a.ASCENDING));
                        } else {
                            arrayList2.add(q.c.c(p10, q.c.a.DESCENDING));
                        }
                        i11++;
                    }
                    arrayList.add(q.b(-1, string, arrayList2, q.f30625a));
                }
            }
            return this.f26413l.y(arrayList);
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Failed to parse index configuration", e10);
        }
    }

    public Task<Void> M() {
        this.f26410i.remove(t().e());
        q();
        return this.f26413l.i0();
    }

    /* access modifiers changed from: package-private */
    public void N(m mVar) {
        x.c(mVar, "Provided DocumentReference must not be null.");
        if (mVar.k() != this) {
            throw new IllegalArgumentException("Provided document reference is from a different Cloud Firestore instance.");
        }
    }

    public Task<Void> O() {
        q();
        return this.f26413l.l0();
    }

    public f0 g(Runnable runnable) {
        return i(p.f31399a, runnable);
    }

    public f0 i(Executor executor, Runnable runnable) {
        return h(executor, (Activity) null, runnable);
    }

    public i1 j() {
        q();
        return new i1(this);
    }

    public Task<Void> k() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f26407f.m(new w(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public g l(String str) {
        x.c(str, "Provided collection path must not be null.");
        q();
        return new g(u.p(str), this);
    }

    public v0 m(String str) {
        x.c(str, "Provided collection ID must not be null.");
        if (!str.contains(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH)) {
            q();
            return new v0(new a1(u.f30652b, str), this);
        }
        throw new IllegalArgumentException(String.format("Invalid collectionId '%s'. Collection IDs must not contain '/'.", new Object[]{str}));
    }

    public Task<Void> n() {
        q();
        return this.f26413l.z();
    }

    public m o(String str) {
        x.c(str, "Provided document path must not be null.");
        q();
        return m.i(u.p(str), this);
    }

    public Task<Void> p() {
        q();
        return this.f26413l.A();
    }

    public y6.f r() {
        return this.f26408g;
    }

    /* access modifiers changed from: package-private */
    public o0 s() {
        return this.f26413l;
    }

    /* access modifiers changed from: package-private */
    public f t() {
        return this.f26403b;
    }

    public Task<v0> v(String str) {
        q();
        return this.f26413l.D(str).continueWith(new t(this));
    }

    /* access modifiers changed from: package-private */
    public g1 w() {
        return this.f26409h;
    }
}
