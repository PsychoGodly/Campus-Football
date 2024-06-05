package x7;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import dd.b;
import dd.j1;
import dd.y0;
import java.util.concurrent.Executor;
import p7.a;
import p7.j;
import y6.c;
import y7.p;
import y7.v;

/* compiled from: FirestoreCallCredentials */
final class u extends b {

    /* renamed from: c  reason: collision with root package name */
    private static final y0.g<String> f31140c;

    /* renamed from: d  reason: collision with root package name */
    private static final y0.g<String> f31141d;

    /* renamed from: a  reason: collision with root package name */
    private final a<j> f31142a;

    /* renamed from: b  reason: collision with root package name */
    private final a<String> f31143b;

    static {
        y0.d<String> dVar = y0.f32388e;
        f31140c = y0.g.e("Authorization", dVar);
        f31141d = y0.g.e("x-firebase-appcheck", dVar);
    }

    u(a<j> aVar, a<String> aVar2) {
        this.f31142a = aVar;
        this.f31143b = aVar2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(Task task, b.a aVar, Task task2, Task task3) {
        y0 y0Var = new y0();
        if (task.isSuccessful()) {
            String str = (String) task.getResult();
            v.a("FirestoreCallCredentials", "Successfully fetched auth token.", new Object[0]);
            if (str != null) {
                y0.g<String> gVar = f31140c;
                y0Var.p(gVar, "Bearer " + str);
            }
        } else {
            Exception exception = task.getException();
            if (exception instanceof c) {
                v.a("FirestoreCallCredentials", "Firebase Auth API not available, not using authentication.", new Object[0]);
            } else if (exception instanceof i8.a) {
                v.a("FirestoreCallCredentials", "No user signed in, not using authentication.", new Object[0]);
            } else {
                v.e("FirestoreCallCredentials", "Failed to get auth token: %s.", exception);
                aVar.b(j1.f32241n.p(exception));
                return;
            }
        }
        if (task2.isSuccessful()) {
            String str2 = (String) task2.getResult();
            if (str2 != null && !str2.isEmpty()) {
                v.a("FirestoreCallCredentials", "Successfully fetched AppCheck token.", new Object[0]);
                y0Var.p(f31141d, str2);
            }
        } else {
            Exception exception2 = task2.getException();
            if (exception2 instanceof c) {
                v.a("FirestoreCallCredentials", "Firebase AppCheck API not available.", new Object[0]);
            } else {
                v.e("FirestoreCallCredentials", "Failed to get AppCheck token: %s.", exception2);
                aVar.b(j1.f32241n.p(exception2));
                return;
            }
        }
        aVar.a(y0Var);
    }

    public void a(b.C0362b bVar, Executor executor, b.a aVar) {
        Task<String> a10 = this.f31142a.a();
        Task<String> a11 = this.f31143b.a();
        Tasks.whenAll((Task<?>[]) new Task[]{a10, a11}).addOnCompleteListener(p.f31400b, new t(a10, aVar, a11));
    }
}
