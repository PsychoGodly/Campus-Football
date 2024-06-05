package h1;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import h1.m;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionSet */
public class q extends m {
    private ArrayList<m> L = new ArrayList<>();
    private boolean M = true;
    int N;
    boolean O = false;
    private int P = 0;

    /* compiled from: TransitionSet */
    class a extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f18691a;

        a(m mVar) {
            this.f18691a = mVar;
        }

        public void a(m mVar) {
            this.f18691a.Y();
            mVar.U(this);
        }
    }

    /* compiled from: TransitionSet */
    static class b extends n {

        /* renamed from: a  reason: collision with root package name */
        q f18693a;

        b(q qVar) {
            this.f18693a = qVar;
        }

        public void a(m mVar) {
            q qVar = this.f18693a;
            int i10 = qVar.N - 1;
            qVar.N = i10;
            if (i10 == 0) {
                qVar.O = false;
                qVar.s();
            }
            mVar.U(this);
        }

        public void d(m mVar) {
            q qVar = this.f18693a;
            if (!qVar.O) {
                qVar.f0();
                this.f18693a.O = true;
            }
        }
    }

    private void k0(m mVar) {
        this.L.add(mVar);
        mVar.f18668s = this;
    }

    private void t0() {
        b bVar = new b(this);
        Iterator<m> it = this.L.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.N = this.L.size();
    }

    public void S(View view) {
        super.S(view);
        int size = this.L.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.L.get(i10).S(view);
        }
    }

    public void W(View view) {
        super.W(view);
        int size = this.L.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.L.get(i10).W(view);
        }
    }

    /* access modifiers changed from: protected */
    public void Y() {
        if (this.L.isEmpty()) {
            f0();
            s();
            return;
        }
        t0();
        if (!this.M) {
            for (int i10 = 1; i10 < this.L.size(); i10++) {
                this.L.get(i10 - 1).a(new a(this.L.get(i10)));
            }
            m mVar = this.L.get(0);
            if (mVar != null) {
                mVar.Y();
                return;
            }
            return;
        }
        Iterator<m> it = this.L.iterator();
        while (it.hasNext()) {
            it.next().Y();
        }
    }

    public void a0(m.e eVar) {
        super.a0(eVar);
        this.P |= 8;
        int size = this.L.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.L.get(i10).a0(eVar);
        }
    }

    public void c0(g gVar) {
        super.c0(gVar);
        this.P |= 4;
        if (this.L != null) {
            for (int i10 = 0; i10 < this.L.size(); i10++) {
                this.L.get(i10).c0(gVar);
            }
        }
    }

    public void d0(p pVar) {
        super.d0(pVar);
        this.P |= 2;
        int size = this.L.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.L.get(i10).d0(pVar);
        }
    }

    public void g(s sVar) {
        if (L(sVar.f18698b)) {
            Iterator<m> it = this.L.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.L(sVar.f18698b)) {
                    next.g(sVar);
                    sVar.f18699c.add(next);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public String g0(String str) {
        String g02 = super.g0(str);
        for (int i10 = 0; i10 < this.L.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(g02);
            sb2.append("\n");
            sb2.append(this.L.get(i10).g0(str + "  "));
            g02 = sb2.toString();
        }
        return g02;
    }

    /* renamed from: h0 */
    public q a(m.f fVar) {
        return (q) super.a(fVar);
    }

    /* renamed from: i0 */
    public q b(View view) {
        for (int i10 = 0; i10 < this.L.size(); i10++) {
            this.L.get(i10).b(view);
        }
        return (q) super.b(view);
    }

    /* access modifiers changed from: package-private */
    public void j(s sVar) {
        super.j(sVar);
        int size = this.L.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.L.get(i10).j(sVar);
        }
    }

    public q j0(m mVar) {
        k0(mVar);
        long j10 = this.f18653c;
        if (j10 >= 0) {
            mVar.Z(j10);
        }
        if ((this.P & 1) != 0) {
            mVar.b0(w());
        }
        if ((this.P & 2) != 0) {
            mVar.d0(B());
        }
        if ((this.P & 4) != 0) {
            mVar.c0(z());
        }
        if ((this.P & 8) != 0) {
            mVar.a0(v());
        }
        return this;
    }

    public void k(s sVar) {
        if (L(sVar.f18698b)) {
            Iterator<m> it = this.L.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.L(sVar.f18698b)) {
                    next.k(sVar);
                    sVar.f18699c.add(next);
                }
            }
        }
    }

    public m l0(int i10) {
        if (i10 < 0 || i10 >= this.L.size()) {
            return null;
        }
        return this.L.get(i10);
    }

    public int m0() {
        return this.L.size();
    }

    /* renamed from: n0 */
    public q U(m.f fVar) {
        return (q) super.U(fVar);
    }

    /* renamed from: o */
    public m clone() {
        q qVar = (q) super.clone();
        qVar.L = new ArrayList<>();
        int size = this.L.size();
        for (int i10 = 0; i10 < size; i10++) {
            qVar.k0(this.L.get(i10).clone());
        }
        return qVar;
    }

    /* renamed from: o0 */
    public q V(View view) {
        for (int i10 = 0; i10 < this.L.size(); i10++) {
            this.L.get(i10).V(view);
        }
        return (q) super.V(view);
    }

    /* renamed from: p0 */
    public q Z(long j10) {
        ArrayList<m> arrayList;
        super.Z(j10);
        if (this.f18653c >= 0 && (arrayList = this.L) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.L.get(i10).Z(j10);
            }
        }
        return this;
    }

    /* renamed from: q0 */
    public q b0(TimeInterpolator timeInterpolator) {
        this.P |= 1;
        ArrayList<m> arrayList = this.L;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.L.get(i10).b0(timeInterpolator);
            }
        }
        return (q) super.b0(timeInterpolator);
    }

    /* access modifiers changed from: protected */
    public void r(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        long D = D();
        int size = this.L.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = this.L.get(i10);
            if (D > 0 && (this.M || i10 == 0)) {
                long D2 = mVar.D();
                if (D2 > 0) {
                    mVar.e0(D2 + D);
                } else {
                    mVar.e0(D);
                }
            }
            mVar.r(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    public q r0(int i10) {
        if (i10 == 0) {
            this.M = true;
        } else if (i10 == 1) {
            this.M = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
        }
        return this;
    }

    /* renamed from: s0 */
    public q e0(long j10) {
        return (q) super.e0(j10);
    }
}
