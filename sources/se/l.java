package se;

import fe.p;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* compiled from: Distinct.kt */
final /* synthetic */ class l {

    /* renamed from: a  reason: collision with root package name */
    private static final fe.l<Object, Object> f38227a = b.f38230a;

    /* renamed from: b  reason: collision with root package name */
    private static final p<Object, Object, Boolean> f38228b = a.f38229a;

    /* compiled from: Distinct.kt */
    static final class a extends n implements p<Object, Object, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f38229a = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(m.a(obj, obj2));
        }
    }

    /* compiled from: Distinct.kt */
    static final class b extends n implements fe.l<Object, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f38230a = new b();

        b() {
            super(1);
        }

        public final Object invoke(Object obj) {
            return obj;
        }
    }

    public static final <T> e<T> a(e<? extends T> eVar) {
        return eVar instanceof i0 ? eVar : b(eVar, f38227a, f38228b);
    }

    private static final <T> e<T> b(e<? extends T> eVar, fe.l<? super T, ? extends Object> lVar, p<Object, Object, Boolean> pVar) {
        if (eVar instanceof d) {
            d dVar = (d) eVar;
            if (dVar.f38178b == lVar && dVar.f38179c == pVar) {
                return eVar;
            }
        }
        return new d(eVar, lVar, pVar);
    }
}
