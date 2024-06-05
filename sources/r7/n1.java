package r7;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.f1;
import com.google.firebase.firestore.z;
import x7.q;
import x7.r0;
import y7.g;
import y7.r;
import y7.t;

/* compiled from: TransactionRunner */
public class n1<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private g f29951a;

    /* renamed from: b  reason: collision with root package name */
    private r0 f29952b;

    /* renamed from: c  reason: collision with root package name */
    private t<j1, Task<TResult>> f29953c;

    /* renamed from: d  reason: collision with root package name */
    private int f29954d;

    /* renamed from: e  reason: collision with root package name */
    private r f29955e;

    /* renamed from: f  reason: collision with root package name */
    private TaskCompletionSource<TResult> f29956f = new TaskCompletionSource<>();

    public n1(g gVar, r0 r0Var, f1 f1Var, t<j1, Task<TResult>> tVar) {
        this.f29951a = gVar;
        this.f29952b = r0Var;
        this.f29953c = tVar;
        this.f29954d = f1Var.a();
        this.f29955e = new r(gVar, g.d.RETRY_TRANSACTION);
    }

    private void d(Task task) {
        if (this.f29954d <= 0 || !e(task.getException())) {
            this.f29956f.setException(task.getException());
        } else {
            j();
        }
    }

    private static boolean e(Exception exc) {
        if (!(exc instanceof z)) {
            return false;
        }
        z zVar = (z) exc;
        z.a a10 = zVar.a();
        if (a10 == z.a.ABORTED || a10 == z.a.ALREADY_EXISTS || a10 == z.a.FAILED_PRECONDITION || !q.k(zVar.a())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(Task task, Task task2) {
        if (task2.isSuccessful()) {
            this.f29956f.setResult(task.getResult());
        } else {
            d(task2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(j1 j1Var, Task task) {
        if (!task.isSuccessful()) {
            d(task);
        } else {
            j1Var.c().addOnCompleteListener(this.f29951a.o(), new k1(this, task));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h() {
        j1 q10 = this.f29952b.q();
        this.f29953c.apply(q10).addOnCompleteListener(this.f29951a.o(), new l1(this, q10));
    }

    private void j() {
        this.f29954d--;
        this.f29955e.b(new m1(this));
    }

    public Task<TResult> i() {
        j();
        return this.f29956f.getTask();
    }
}
