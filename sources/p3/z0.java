package p3;

import android.os.Bundle;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import k4.c;
import k4.n0;
import k4.r;
import n2.h;
import s6.u;

/* compiled from: TrackGroupArray */
public final class z0 implements h {

    /* renamed from: d  reason: collision with root package name */
    public static final z0 f21693d = new z0(new x0[0]);

    /* renamed from: f  reason: collision with root package name */
    private static final String f21694f = n0.r0(0);

    /* renamed from: g  reason: collision with root package name */
    public static final h.a<z0> f21695g = y0.f36876a;

    /* renamed from: a  reason: collision with root package name */
    public final int f21696a;

    /* renamed from: b  reason: collision with root package name */
    private final u<x0> f21697b;

    /* renamed from: c  reason: collision with root package name */
    private int f21698c;

    public z0(x0... x0VarArr) {
        this.f21697b = u.v(x0VarArr);
        this.f21696a = x0VarArr.length;
        e();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ z0 d(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f21694f);
        if (parcelableArrayList == null) {
            return new z0(new x0[0]);
        }
        return new z0((x0[]) c.b(x0.f21687i, parcelableArrayList).toArray(new x0[0]));
    }

    private void e() {
        int i10 = 0;
        while (i10 < this.f21697b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f21697b.size(); i12++) {
                if (this.f21697b.get(i10).equals(this.f21697b.get(i12))) {
                    r.d("TrackGroupArray", MaxReward.DEFAULT_LABEL, new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public x0 b(int i10) {
        return this.f21697b.get(i10);
    }

    public int c(x0 x0Var) {
        int indexOf = this.f21697b.indexOf(x0Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z0.class != obj.getClass()) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (this.f21696a != z0Var.f21696a || !this.f21697b.equals(z0Var.f21697b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f21698c == 0) {
            this.f21698c = this.f21697b.hashCode();
        }
        return this.f21698c;
    }
}
