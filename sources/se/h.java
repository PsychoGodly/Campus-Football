package se;

import fe.p;
import re.r;
import sd.w;
import xd.d;
import xd.g;

/* compiled from: Builders.kt */
final /* synthetic */ class h {

    /* compiled from: SafeCollector.common.kt */
    public static final class a implements e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f38198a;

        public a(Object obj) {
            this.f38198a = obj;
        }

        public Object collect(f<? super T> fVar, d<? super w> dVar) {
            Object emit = fVar.emit(this.f38198a, dVar);
            if (emit == d.c()) {
                return emit;
            }
            return w.f38141a;
        }
    }

    public static final <T> e<T> a(p<? super r<? super T>, ? super d<? super w>, ? extends Object> pVar) {
        return new b(pVar, (g) null, 0, (re.a) null, 14, (kotlin.jvm.internal.h) null);
    }

    public static final <T> e<T> b(p<? super r<? super T>, ? super d<? super w>, ? extends Object> pVar) {
        return new c(pVar, (g) null, 0, (re.a) null, 14, (kotlin.jvm.internal.h) null);
    }

    public static final <T> e<T> c(p<? super f<? super T>, ? super d<? super w>, ? extends Object> pVar) {
        return new y(pVar);
    }

    public static final <T> e<T> d(T t10) {
        return new a(t10);
    }
}
