package rc;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.e1;
import com.google.firebase.firestore.f1;
import com.google.firebase.firestore.m;
import com.google.firebase.firestore.z;
import com.google.firebase.firestore.z0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import lc.d;
import qc.x;
import qc.y;

/* compiled from: TransactionStreamHandler */
public class o implements f, d.C0413d {

    /* renamed from: a  reason: collision with root package name */
    final b f37937a;

    /* renamed from: b  reason: collision with root package name */
    final FirebaseFirestore f37938b;

    /* renamed from: c  reason: collision with root package name */
    final String f37939c;

    /* renamed from: d  reason: collision with root package name */
    final Long f37940d;

    /* renamed from: f  reason: collision with root package name */
    final Long f37941f;

    /* renamed from: g  reason: collision with root package name */
    final Semaphore f37942g = new Semaphore(0);

    /* renamed from: h  reason: collision with root package name */
    private y.t f37943h;

    /* renamed from: i  reason: collision with root package name */
    private List<y.s> f37944i;

    /* renamed from: j  reason: collision with root package name */
    final Handler f37945j = new Handler(Looper.getMainLooper());

    /* compiled from: TransactionStreamHandler */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f37946a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                qc.y$u[] r0 = qc.y.u.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37946a = r0
                qc.y$u r1 = qc.y.u.DELETE_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37946a     // Catch:{ NoSuchFieldError -> 0x001d }
                qc.y$u r1 = qc.y.u.UPDATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37946a     // Catch:{ NoSuchFieldError -> 0x0028 }
                qc.y$u r1 = qc.y.u.SET     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rc.o.a.<clinit>():void");
        }
    }

    /* compiled from: TransactionStreamHandler */
    public interface b {
        void a(e1 e1Var);
    }

    public o(b bVar, FirebaseFirestore firebaseFirestore, String str, Long l10, Long l11) {
        this.f37937a = bVar;
        this.f37938b = firebaseFirestore;
        this.f37939c = str;
        this.f37940d = l10;
        this.f37941f = l11;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ x i(d.b bVar, e1 e1Var) throws z {
        this.f37937a.a(e1Var);
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.f37938b.r().q());
        this.f37945j.post(new n(bVar, hashMap));
        try {
            if (!this.f37942g.tryAcquire(this.f37940d.longValue(), TimeUnit.MILLISECONDS)) {
                return x.b(new z("timed out", z.a.DEADLINE_EXCEEDED));
            }
            if (this.f37944i.isEmpty()) {
                return x.a();
            }
            if (this.f37943h == y.t.FAILURE) {
                return x.a();
            }
            for (y.s next : this.f37944i) {
                m o10 = this.f37938b.o(next.d());
                int i10 = a.f37946a[next.e().ordinal()];
                if (i10 == 1) {
                    e1Var.b(o10);
                } else if (i10 == 2) {
                    Map<String, Object> b10 = next.b();
                    Objects.requireNonNull(b10);
                    e1Var.h(o10, b10);
                } else if (i10 == 3) {
                    y.l c10 = next.c();
                    Objects.requireNonNull(c10);
                    z0 z0Var = null;
                    if (c10.b() != null && c10.b().booleanValue()) {
                        z0Var = z0.c();
                    } else if (c10.c() != null) {
                        List<List<String>> c11 = c10.c();
                        Objects.requireNonNull(c11);
                        z0Var = z0.d(sc.b.c(c11));
                    }
                    Map<String, Object> b11 = next.b();
                    Objects.requireNonNull(b11);
                    Map map = b11;
                    if (z0Var == null) {
                        e1Var.f(o10, map);
                    } else {
                        e1Var.g(o10, map, z0Var);
                    }
                }
            }
            return x.a();
        } catch (InterruptedException unused) {
            return x.b(new z("interrupted", z.a.DEADLINE_EXCEEDED));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void j(d.b bVar, HashMap hashMap) {
        bVar.success(hashMap);
        bVar.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k(d.b bVar, Task task) {
        HashMap hashMap = new HashMap();
        if (task.getException() != null || ((x) task.getResult()).f37621a != null) {
            Exception exception = task.getException() != null ? task.getException() : ((x) task.getResult()).f37621a;
            hashMap.put("appName", this.f37938b.r().q());
            hashMap.put("error", sc.a.a(exception));
        } else if (task.getResult() != null) {
            hashMap.put("complete", Boolean.TRUE);
        }
        this.f37945j.post(new m(bVar, hashMap));
    }

    public void a(y.t tVar, List<y.s> list) {
        this.f37943h = tVar;
        this.f37944i = list;
        this.f37942g.release();
    }

    public void g(Object obj) {
        this.f37942g.release();
    }

    public void h(Object obj, d.b bVar) {
        this.f37938b.H(new f1.b().b(this.f37941f.intValue()).a(), new l(this, bVar)).addOnCompleteListener(new k(this, bVar));
    }
}
