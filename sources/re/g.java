package re;

import com.google.android.gms.common.api.a;
import fe.l;
import sd.w;

/* compiled from: Channel.kt */
public final class g {
    public static final <E> d<E> a(int i10, a aVar, l<? super E, w> lVar) {
        d<E> oVar;
        if (i10 != -2) {
            boolean z10 = false;
            if (i10 == -1) {
                if (aVar == a.SUSPEND) {
                    z10 = true;
                }
                if (z10) {
                    return new o(1, a.DROP_OLDEST, lVar);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            } else if (i10 != 0) {
                if (i10 == Integer.MAX_VALUE) {
                    return new b(a.e.API_PRIORITY_OTHER, lVar);
                }
                if (aVar == a.SUSPEND) {
                    return new b(i10, lVar);
                }
                return new o(i10, aVar, lVar);
            } else if (aVar == a.SUSPEND) {
                oVar = new b<>(0, lVar);
            } else {
                oVar = new o<>(1, aVar, lVar);
            }
        } else if (aVar == a.SUSPEND) {
            oVar = new b<>(d.C1.a(), lVar);
        } else {
            oVar = new o<>(1, aVar, lVar);
        }
        return oVar;
    }

    public static /* synthetic */ d b(int i10, a aVar, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return a(i10, aVar, lVar);
    }
}
