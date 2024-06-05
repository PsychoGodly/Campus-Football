package r7;

import com.applovin.mediation.MaxReward;
import u7.r;
import v7.p;
import y7.b;

/* compiled from: UserData */
public class q1 {

    /* renamed from: a  reason: collision with root package name */
    private final p1 f30001a;

    /* renamed from: b  reason: collision with root package name */
    private final r f30002b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f30003c;

    /* synthetic */ q1(p1 p1Var, r rVar, boolean z10, o1 o1Var) {
        this(p1Var, rVar, z10);
    }

    private void k() {
        if (this.f30002b != null) {
            for (int i10 = 0; i10 < this.f30002b.k(); i10++) {
                l(this.f30002b.h(i10));
            }
        }
    }

    private void l(String str) {
        if (str.isEmpty()) {
            throw f("Document fields must not be empty");
        } else if (j() && str.startsWith("__") && str.endsWith("__")) {
            throw f("Document fields cannot begin and end with \"__\"");
        }
    }

    public void a(r rVar) {
        this.f30001a.b(rVar);
    }

    public void b(r rVar, p pVar) {
        this.f30001a.c(rVar, pVar);
    }

    public q1 c(int i10) {
        return new q1(this.f30001a, (r) null, true);
    }

    public q1 d(String str) {
        r rVar = this.f30002b;
        q1 q1Var = new q1(this.f30001a, rVar == null ? null : (r) rVar.a(str), false);
        q1Var.l(str);
        return q1Var;
    }

    public q1 e(r rVar) {
        r rVar2 = this.f30002b;
        q1 q1Var = new q1(this.f30001a, rVar2 == null ? null : (r) rVar2.c(rVar), false);
        q1Var.k();
        return q1Var;
    }

    public RuntimeException f(String str) {
        String str2;
        r rVar = this.f30002b;
        if (rVar == null || rVar.i()) {
            str2 = MaxReward.DEFAULT_LABEL;
        } else {
            str2 = " (found in field " + this.f30002b.toString() + ")";
        }
        return new IllegalArgumentException("Invalid data. " + str + str2);
    }

    public t1 g() {
        return this.f30001a.f29997a;
    }

    public r h() {
        return this.f30002b;
    }

    public boolean i() {
        return this.f30003c;
    }

    public boolean j() {
        int i10 = o1.f29980a[this.f30001a.f29997a.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4 || i10 == 5) {
            return false;
        }
        throw b.a("Unexpected case for UserDataSource: %s", this.f30001a.f29997a.name());
    }

    private q1(p1 p1Var, r rVar, boolean z10) {
        this.f30001a = p1Var;
        this.f30002b = rVar;
        this.f30003c = z10;
    }
}
