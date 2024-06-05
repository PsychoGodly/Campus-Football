package u3;

import android.util.SparseArray;
import k4.j0;

/* compiled from: TimestampAdjusterProvider */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<j0> f22973a = new SparseArray<>();

    public j0 a(int i10) {
        j0 j0Var = this.f22973a.get(i10);
        if (j0Var != null) {
            return j0Var;
        }
        j0 j0Var2 = new j0(9223372036854775806L);
        this.f22973a.put(i10, j0Var2);
        return j0Var2;
    }

    public void b() {
        this.f22973a.clear();
    }
}
