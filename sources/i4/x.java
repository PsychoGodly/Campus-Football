package i4;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import k4.a;
import k4.n0;
import n2.h;
import p3.x0;
import s6.u;
import v6.e;

/* compiled from: TrackSelectionOverride */
public final class x implements h {

    /* renamed from: c  reason: collision with root package name */
    private static final String f19072c = n0.r0(0);

    /* renamed from: d  reason: collision with root package name */
    private static final String f19073d = n0.r0(1);

    /* renamed from: f  reason: collision with root package name */
    public static final h.a<x> f19074f = w.f33290a;

    /* renamed from: a  reason: collision with root package name */
    public final x0 f19075a;

    /* renamed from: b  reason: collision with root package name */
    public final u<Integer> f19076b;

    public x(x0 x0Var, List<Integer> list) {
        if (list.isEmpty() || (((Integer) Collections.min(list)).intValue() >= 0 && ((Integer) Collections.max(list)).intValue() < x0Var.f21688a)) {
            this.f19075a = x0Var;
            this.f19076b = u.u(list);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ x c(Bundle bundle) {
        return new x(x0.f21687i.a((Bundle) a.e(bundle.getBundle(f19072c))), e.c((int[]) a.e(bundle.getIntArray(f19073d))));
    }

    public int b() {
        return this.f19075a.f21690c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        if (!this.f19075a.equals(xVar.f19075a) || !this.f19076b.equals(xVar.f19076b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f19075a.hashCode() + (this.f19076b.hashCode() * 31);
    }
}
