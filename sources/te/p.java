package te;

import se.e;
import xd.g;
import xd.h;

/* compiled from: ChannelFlow.kt */
public interface p<T> extends e<T> {

    /* compiled from: ChannelFlow.kt */
    public static final class a {
        public static /* synthetic */ e a(p pVar, g gVar, int i10, re.a aVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    gVar = h.f39347a;
                }
                if ((i11 & 2) != 0) {
                    i10 = -3;
                }
                if ((i11 & 4) != 0) {
                    aVar = re.a.SUSPEND;
                }
                return pVar.d(gVar, i10, aVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    e<T> d(g gVar, int i10, re.a aVar);
}
