package ue;

import fe.p;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import pe.a3;
import xd.g;

/* compiled from: ThreadContext.kt */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public static final l0 f38831a = new l0("NO_THREAD_ELEMENTS");

    /* renamed from: b  reason: collision with root package name */
    private static final p<Object, g.b, Object> f38832b = a.f38835a;

    /* renamed from: c  reason: collision with root package name */
    private static final p<a3<?>, g.b, a3<?>> f38833c = b.f38836a;

    /* renamed from: d  reason: collision with root package name */
    private static final p<t0, g.b, t0> f38834d = c.f38837a;

    /* compiled from: ThreadContext.kt */
    static final class a extends n implements p<Object, g.b, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f38835a = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(Object obj, g.b bVar) {
            if (!(bVar instanceof a3)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    /* compiled from: ThreadContext.kt */
    static final class b extends n implements p<a3<?>, g.b, a3<?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f38836a = new b();

        b() {
            super(2);
        }

        /* renamed from: a */
        public final a3<?> invoke(a3<?> a3Var, g.b bVar) {
            if (a3Var != null) {
                return a3Var;
            }
            if (bVar instanceof a3) {
                return (a3) bVar;
            }
            return null;
        }
    }

    /* compiled from: ThreadContext.kt */
    static final class c extends n implements p<t0, g.b, t0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f38837a = new c();

        c() {
            super(2);
        }

        /* renamed from: a */
        public final t0 invoke(t0 t0Var, g.b bVar) {
            if (bVar instanceof a3) {
                a3 a3Var = (a3) bVar;
                t0Var.a(a3Var, a3Var.g0(t0Var.f38849a));
            }
            return t0Var;
        }
    }

    public static final void a(g gVar, Object obj) {
        if (obj != f38831a) {
            if (obj instanceof t0) {
                ((t0) obj).b(gVar);
                return;
            }
            Object fold = gVar.fold(null, f38833c);
            m.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((a3) fold).v0(gVar, obj);
        }
    }

    public static final Object b(g gVar) {
        Object fold = gVar.fold(0, f38832b);
        m.b(fold);
        return fold;
    }

    public static final Object c(g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return f38831a;
        }
        if (obj instanceof Integer) {
            return gVar.fold(new t0(gVar, ((Number) obj).intValue()), f38834d);
        }
        m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((a3) obj).g0(gVar);
    }
}
