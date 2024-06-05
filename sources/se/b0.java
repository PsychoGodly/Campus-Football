package se;

import com.google.android.gms.common.api.a;
import re.a;
import te.h;
import ue.l0;
import xd.g;

/* compiled from: SharedFlow.kt */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final l0 f38173a = new l0("NO_VALUE");

    public static final <T> u<T> a(int i10, int i11, a aVar) {
        boolean z10 = true;
        if (i10 >= 0) {
            if (i11 >= 0) {
                if (i10 <= 0 && i11 <= 0 && aVar != a.SUSPEND) {
                    z10 = false;
                }
                if (z10) {
                    int i12 = i11 + i10;
                    if (i12 < 0) {
                        i12 = a.e.API_PRIORITY_OTHER;
                    }
                    return new a0(i10, i12, aVar);
                }
                throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
            }
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i11).toString());
        }
        throw new IllegalArgumentException(("replay cannot be negative, but was " + i10).toString());
    }

    public static /* synthetic */ u b(int i10, int i11, re.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            aVar = re.a.SUSPEND;
        }
        return a(i10, i11, aVar);
    }

    public static final <T> e<T> e(z<? extends T> zVar, g gVar, int i10, re.a aVar) {
        if ((i10 == 0 || i10 == -3) && aVar == re.a.SUSPEND) {
            return zVar;
        }
        return new h(zVar, gVar, i10, aVar);
    }

    /* access modifiers changed from: private */
    public static final Object f(Object[] objArr, long j10) {
        return objArr[(objArr.length - 1) & ((int) j10)];
    }

    /* access modifiers changed from: private */
    public static final void g(Object[] objArr, long j10, Object obj) {
        objArr[(objArr.length - 1) & ((int) j10)] = obj;
    }
}
