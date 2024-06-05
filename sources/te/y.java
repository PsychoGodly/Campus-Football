package te;

import com.google.android.gms.common.api.a;
import se.a0;
import se.i0;

/* compiled from: AbstractSharedFlow.kt */
final class y extends a0<Integer> implements i0<Integer> {
    public y(int i10) {
        super(1, a.e.API_PRIORITY_OTHER, re.a.DROP_OLDEST);
        c(Integer.valueOf(i10));
    }

    public final boolean Y(int i10) {
        boolean c10;
        synchronized (this) {
            c10 = c(Integer.valueOf(((Number) L()).intValue() + i10));
        }
        return c10;
    }
}
