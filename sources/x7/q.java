package x7;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.z;
import dd.j1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLHandshakeException;
import p7.j;
import p8.a0;
import p8.d;
import p8.d0;
import p8.e;
import p8.h;
import p8.i;
import p8.r;
import p8.w;
import p8.x;
import r7.l;
import u7.s;
import u7.w;
import v7.f;
import x7.a1;
import x7.y;
import x7.z0;
import y7.g;
import y7.g0;

/* compiled from: Datastore */
public class q {

    /* renamed from: e  reason: collision with root package name */
    static final Set<String> f31102e = new HashSet(Arrays.asList(new String[]{"date", "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace"}));

    /* renamed from: a  reason: collision with root package name */
    private final l f31103a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final n0 f31104b;

    /* renamed from: c  reason: collision with root package name */
    private final g f31105c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final y f31106d;

    /* compiled from: Datastore */
    class a extends y.e<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f31107a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f31108b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TaskCompletionSource f31109c;

        a(List list, List list2, TaskCompletionSource taskCompletionSource) {
            this.f31107a = list;
            this.f31108b = list2;
            this.f31109c = taskCompletionSource;
        }

        public void a(j1 j1Var) {
            if (j1Var.o()) {
                this.f31109c.trySetResult(Collections.emptyList());
                return;
            }
            z t10 = g0.t(j1Var);
            if (t10.a() == z.a.UNAUTHENTICATED) {
                q.this.f31106d.h();
            }
            this.f31109c.trySetException(t10);
        }

        /* renamed from: c */
        public void b(e eVar) {
            this.f31107a.add(eVar);
            if (this.f31107a.size() == this.f31108b.size()) {
                HashMap hashMap = new HashMap();
                for (e m10 : this.f31107a) {
                    s m11 = q.this.f31104b.m(m10);
                    hashMap.put(m11.getKey(), m11);
                }
                ArrayList arrayList = new ArrayList();
                for (u7.l lVar : this.f31108b) {
                    arrayList.add((s) hashMap.get(lVar));
                }
                this.f31109c.trySetResult(arrayList);
            }
        }
    }

    /* compiled from: Datastore */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31111a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.firebase.firestore.z$a[] r0 = com.google.firebase.firestore.z.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31111a = r0
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31111a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.CANCELLED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31111a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31111a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.DEADLINE_EXCEEDED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31111a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.RESOURCE_EXHAUSTED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31111a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.INTERNAL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f31111a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f31111a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.UNAUTHENTICATED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f31111a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.INVALID_ARGUMENT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f31111a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f31111a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.ALREADY_EXISTS     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f31111a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.PERMISSION_DENIED     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f31111a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.FAILED_PRECONDITION     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f31111a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.ABORTED     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f31111a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.OUT_OF_RANGE     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f31111a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.UNIMPLEMENTED     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f31111a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.firebase.firestore.z$a r1 = com.google.firebase.firestore.z.a.DATA_LOSS     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x7.q.b.<clinit>():void");
        }
    }

    public q(l lVar, g gVar, p7.a<j> aVar, p7.a<String> aVar2, Context context, i0 i0Var) {
        this.f31103a = lVar;
        this.f31105c = gVar;
        this.f31104b = new n0(lVar.a());
        this.f31106d = i(lVar, gVar, aVar, aVar2, context, i0Var);
    }

    public static boolean j(j1 j1Var) {
        j1.b m10 = j1Var.m();
        Throwable l10 = j1Var.l();
        boolean z10 = (l10 instanceof SSLHandshakeException) && l10.getMessage().contains("no ciphers available");
        if (Build.VERSION.SDK_INT >= 21 || !m10.equals(j1.b.UNAVAILABLE) || !z10) {
            return false;
        }
        return true;
    }

    public static boolean k(z.a aVar) {
        switch (b.f31111a[aVar.ordinal()]) {
            case 1:
                throw new IllegalArgumentException("Treated status OK as error");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return true;
            default:
                throw new IllegalArgumentException("Unknown gRPC status code: " + aVar);
        }
    }

    public static boolean l(j1 j1Var) {
        return k(z.a.c(j1Var.m().d()));
    }

    public static boolean m(j1 j1Var) {
        return l(j1Var) && !j1Var.m().equals(j1.b.ABORTED);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List n(Task task) throws Exception {
        if (!task.isSuccessful()) {
            if ((task.getException() instanceof z) && ((z) task.getException()).a() == z.a.UNAUTHENTICATED) {
                this.f31106d.h();
            }
            throw task.getException();
        }
        i iVar = (i) task.getResult();
        w y10 = this.f31104b.y(iVar.f0());
        int i02 = iVar.i0();
        ArrayList arrayList = new ArrayList(i02);
        for (int i10 = 0; i10 < i02; i10++) {
            arrayList.add(this.f31104b.p(iVar.h0(i10), y10));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Map o(HashMap hashMap, Task task) throws Exception {
        if (!task.isSuccessful()) {
            if ((task.getException() instanceof z) && ((z) task.getException()).a() == z.a.UNAUTHENTICATED) {
                this.f31106d.h();
            }
            throw task.getException();
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry next : ((x) task.getResult()).g0().f0().entrySet()) {
            y7.b.d(hashMap.containsKey(next.getKey()), "%s not present in aliasMap", next.getKey());
            hashMap2.put((String) hashMap.get(next.getKey()), (d0) next.getValue());
        }
        return hashMap2;
    }

    public Task<List<v7.i>> e(List<f> list) {
        h.b k02 = h.k0();
        k02.G(this.f31104b.a());
        for (f O : list) {
            k02.F(this.f31104b.O(O));
        }
        return this.f31106d.n(r.b(), (h) k02.build()).continueWith(this.f31105c.o(), new o(this));
    }

    /* access modifiers changed from: package-private */
    public z0 f(z0.a aVar) {
        return new z0(this.f31106d, this.f31105c, this.f31104b, aVar);
    }

    /* access modifiers changed from: package-private */
    public a1 g(a1.a aVar) {
        return new a1(this.f31106d, this.f31105c, this.f31104b, aVar);
    }

    /* access modifiers changed from: package-private */
    public l h() {
        return this.f31103a;
    }

    /* access modifiers changed from: package-private */
    public y i(l lVar, g gVar, p7.a<j> aVar, p7.a<String> aVar2, Context context, i0 i0Var) {
        return new y(gVar, context, aVar, aVar2, lVar, i0Var);
    }

    public Task<List<s>> p(List<u7.l> list) {
        d.b k02 = d.k0();
        k02.G(this.f31104b.a());
        for (u7.l L : list) {
            k02.F(this.f31104b.L(L));
        }
        ArrayList arrayList = new ArrayList();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f31106d.o(r.a(), (d) k02.build(), new a(arrayList, list, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public Task<Map<String, d0>> q(r7.a1 a1Var, List<com.google.firebase.firestore.a> list) {
        a0.d S = this.f31104b.S(a1Var.C());
        HashMap hashMap = new HashMap();
        p8.y U = this.f31104b.U(S, list, hashMap);
        w.b i02 = p8.w.i0();
        i02.F(S.i0());
        i02.G(U);
        return this.f31106d.n(r.d(), (p8.w) i02.build()).continueWith(this.f31105c.o(), new p(this, hashMap));
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.f31106d.q();
    }
}
