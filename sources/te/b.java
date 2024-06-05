package te;

import java.util.Arrays;
import kotlin.jvm.internal.m;
import sd.o;
import sd.w;
import se.i0;
import te.d;

/* compiled from: AbstractSharedFlow.kt */
public abstract class b<S extends d<?>> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public S[] f38644a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f38645b;

    /* renamed from: c  reason: collision with root package name */
    private int f38646c;

    /* renamed from: d  reason: collision with root package name */
    private y f38647d;

    public final i0<Integer> e() {
        y yVar;
        synchronized (this) {
            yVar = this.f38647d;
            if (yVar == null) {
                yVar = new y(this.f38645b);
                this.f38647d = yVar;
            }
        }
        return yVar;
    }

    /* access modifiers changed from: protected */
    public final S h() {
        S s10;
        y yVar;
        synchronized (this) {
            S[] sArr = this.f38644a;
            if (sArr == null) {
                sArr = j(2);
                this.f38644a = sArr;
            } else if (this.f38645b >= sArr.length) {
                S[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                m.d(copyOf, "copyOf(this, newSize)");
                this.f38644a = (d[]) copyOf;
                sArr = (d[]) copyOf;
            }
            int i10 = this.f38646c;
            do {
                s10 = sArr[i10];
                if (s10 == null) {
                    s10 = i();
                    sArr[i10] = s10;
                }
                i10++;
                if (i10 >= sArr.length) {
                    i10 = 0;
                }
                m.c(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            } while (!s10.a(this));
            this.f38646c = i10;
            this.f38645b++;
            yVar = this.f38647d;
        }
        if (yVar != null) {
            yVar.Y(1);
        }
        return s10;
    }

    /* access modifiers changed from: protected */
    public abstract S i();

    /* access modifiers changed from: protected */
    public abstract S[] j(int i10);

    /* access modifiers changed from: protected */
    public final void k(S s10) {
        y yVar;
        int i10;
        xd.d[] b10;
        synchronized (this) {
            int i11 = this.f38645b - 1;
            this.f38645b = i11;
            yVar = this.f38647d;
            if (i11 == 0) {
                this.f38646c = 0;
            }
            m.c(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            b10 = s10.b(this);
        }
        for (xd.d dVar : b10) {
            if (dVar != null) {
                o.a aVar = o.f38128b;
                dVar.resumeWith(o.b(w.f38141a));
            }
        }
        if (yVar != null) {
            yVar.Y(-1);
        }
    }

    /* access modifiers changed from: protected */
    public final int l() {
        return this.f38645b;
    }

    /* access modifiers changed from: protected */
    public final S[] m() {
        return this.f38644a;
    }
}
