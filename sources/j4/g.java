package j4;

import java.util.ArrayList;
import java.util.Map;
import k4.a;
import k4.n0;

/* compiled from: BaseDataSource */
public abstract class g implements l {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f19307a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<p0> f19308b = new ArrayList<>(1);

    /* renamed from: c  reason: collision with root package name */
    private int f19309c;

    /* renamed from: d  reason: collision with root package name */
    private p f19310d;

    protected g(boolean z10) {
        this.f19307a = z10;
    }

    public final void e(p0 p0Var) {
        a.e(p0Var);
        if (!this.f19308b.contains(p0Var)) {
            this.f19308b.add(p0Var);
            this.f19309c++;
        }
    }

    public /* synthetic */ Map k() {
        return k.a(this);
    }

    /* access modifiers changed from: protected */
    public final void q(int i10) {
        p pVar = (p) n0.j(this.f19310d);
        for (int i11 = 0; i11 < this.f19309c; i11++) {
            this.f19308b.get(i11).g(this, pVar, this.f19307a, i10);
        }
    }

    /* access modifiers changed from: protected */
    public final void r() {
        p pVar = (p) n0.j(this.f19310d);
        for (int i10 = 0; i10 < this.f19309c; i10++) {
            this.f19308b.get(i10).e(this, pVar, this.f19307a);
        }
        this.f19310d = null;
    }

    /* access modifiers changed from: protected */
    public final void s(p pVar) {
        for (int i10 = 0; i10 < this.f19309c; i10++) {
            this.f19308b.get(i10).a(this, pVar, this.f19307a);
        }
    }

    /* access modifiers changed from: protected */
    public final void t(p pVar) {
        this.f19310d = pVar;
        for (int i10 = 0; i10 < this.f19309c; i10++) {
            this.f19308b.get(i10).c(this, pVar, this.f19307a);
        }
    }
}
