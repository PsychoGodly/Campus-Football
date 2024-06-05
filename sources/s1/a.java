package s1;

import androidx.work.impl.WorkDatabase;
import androidx.work.s;
import androidx.work.y;
import java.util.LinkedList;
import java.util.UUID;
import k1.e;
import k1.f;
import k1.i;
import r1.q;

/* compiled from: CancelWorkRunnable */
public abstract class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final k1.c f22288a = new k1.c();

    /* renamed from: s1.a$a  reason: collision with other inner class name */
    /* compiled from: CancelWorkRunnable */
    class C0231a extends a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f22289b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ UUID f22290c;

        C0231a(i iVar, UUID uuid) {
            this.f22289b = iVar;
            this.f22290c = uuid;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        public void h() {
            WorkDatabase q10 = this.f22289b.q();
            q10.c();
            try {
                a(this.f22289b, this.f22290c.toString());
                q10.r();
                q10.g();
                g(this.f22289b);
            } catch (Throwable th) {
                q10.g();
                throw th;
            }
        }
    }

    /* compiled from: CancelWorkRunnable */
    class b extends a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f22291b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f22292c;

        b(i iVar, String str) {
            this.f22291b = iVar;
            this.f22292c = str;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        public void h() {
            WorkDatabase q10 = this.f22291b.q();
            q10.c();
            try {
                for (String a10 : q10.B().o(this.f22292c)) {
                    a(this.f22291b, a10);
                }
                q10.r();
                q10.g();
                g(this.f22291b);
            } catch (Throwable th) {
                q10.g();
                throw th;
            }
        }
    }

    /* compiled from: CancelWorkRunnable */
    class c extends a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f22293b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f22294c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f22295d;

        c(i iVar, String str, boolean z10) {
            this.f22293b = iVar;
            this.f22294c = str;
            this.f22295d = z10;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        public void h() {
            WorkDatabase q10 = this.f22293b.q();
            q10.c();
            try {
                for (String a10 : q10.B().k(this.f22294c)) {
                    a(this.f22293b, a10);
                }
                q10.r();
                q10.g();
                if (this.f22295d) {
                    g(this.f22293b);
                }
            } catch (Throwable th) {
                q10.g();
                throw th;
            }
        }
    }

    public static a b(UUID uuid, i iVar) {
        return new C0231a(iVar, uuid);
    }

    public static a c(String str, i iVar, boolean z10) {
        return new c(iVar, str, z10);
    }

    public static a d(String str, i iVar) {
        return new b(iVar, str);
    }

    private void f(WorkDatabase workDatabase, String str) {
        q B = workDatabase.B();
        r1.b t10 = workDatabase.t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            y.a l10 = B.l(str2);
            if (!(l10 == y.a.SUCCEEDED || l10 == y.a.FAILED)) {
                B.b(y.a.CANCELLED, str2);
            }
            linkedList.addAll(t10.b(str2));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(i iVar, String str) {
        f(iVar.q(), str);
        iVar.o().l(str);
        for (e e10 : iVar.p()) {
            e10.e(str);
        }
    }

    public s e() {
        return this.f22288a;
    }

    /* access modifiers changed from: package-private */
    public void g(i iVar) {
        f.b(iVar.k(), iVar.q(), iVar.p());
    }

    /* access modifiers changed from: package-private */
    public abstract void h();

    public void run() {
        try {
            h();
            this.f22288a.a(s.f5341a);
        } catch (Throwable th) {
            this.f22288a.a(new s.b.a(th));
        }
    }
}
