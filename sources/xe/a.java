package xe;

import androidx.concurrent.futures.b;
import fe.l;
import fe.q;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pe.i1;
import pe.k3;
import pe.m;
import pe.o;
import sd.w;
import ue.i0;
import xd.g;

/* compiled from: Select.kt */
public class a<R> extends m implements b, k3 {

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f39351g = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "state");

    /* renamed from: a  reason: collision with root package name */
    private final g f39352a;

    /* renamed from: b  reason: collision with root package name */
    private List<a<R>.defpackage.a> f39353b;

    /* renamed from: c  reason: collision with root package name */
    private Object f39354c;

    /* renamed from: d  reason: collision with root package name */
    private int f39355d;

    /* renamed from: f  reason: collision with root package name */
    private Object f39356f;
    private volatile Object state;

    /* renamed from: xe.a$a  reason: collision with other inner class name */
    /* compiled from: Select.kt */
    public final class C0463a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f39357a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f39358b;

        /* renamed from: c  reason: collision with root package name */
        public final q<b<?>, Object, Object, l<Throwable, w>> f39359c;

        /* renamed from: d  reason: collision with root package name */
        public Object f39360d;

        /* renamed from: e  reason: collision with root package name */
        public int f39361e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a<R> f39362f;

        public final l<Throwable, w> a(b<?> bVar, Object obj) {
            q<b<?>, Object, Object, l<Throwable, w>> qVar = this.f39359c;
            if (qVar != null) {
                return qVar.invoke(bVar, this.f39358b, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f39360d;
            a<R> aVar = this.f39362f;
            i1 i1Var = null;
            if (obj instanceof i0) {
                ((i0) obj).o(this.f39361e, (Throwable) null, aVar.getContext());
                return;
            }
            if (obj instanceof i1) {
                i1Var = (i1) obj;
            }
            if (i1Var != null) {
                i1Var.dispose();
            }
        }
    }

    private final a<R>.defpackage.a e(Object obj) {
        boolean z10;
        List<a<R>.defpackage.a> list = this.f39353b;
        T t10 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((C0463a) next).f39357a == obj) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                t10 = next;
                break;
            }
        }
        a<R>.defpackage.a aVar = (C0463a) t10;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    private final int g(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39351g;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof o) {
                a<R>.defpackage.a e10 = e(obj);
                if (e10 == null) {
                    continue;
                } else {
                    l<Throwable, w> a10 = e10.a(this, obj2);
                    if (b.a(atomicReferenceFieldUpdater, this, obj3, e10)) {
                        this.f39356f = obj2;
                        if (c.h((o) obj3, a10)) {
                            return 0;
                        }
                        this.f39356f = null;
                        return 2;
                    }
                }
            } else {
                if (kotlin.jvm.internal.m.a(obj3, c.f39365c) ? true : obj3 instanceof C0463a) {
                    return 3;
                }
                if (kotlin.jvm.internal.m.a(obj3, c.f39366d)) {
                    return 2;
                }
                if (kotlin.jvm.internal.m.a(obj3, c.f39364b)) {
                    if (b.a(atomicReferenceFieldUpdater, this, obj3, p.b(obj))) {
                        return 1;
                    }
                } else if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                } else if (b.a(atomicReferenceFieldUpdater, this, obj3, y.D((Collection) obj3, obj))) {
                    return 1;
                }
            }
        }
    }

    public void a(i0<?> i0Var, int i10) {
        this.f39354c = i0Var;
        this.f39355d = i10;
    }

    public boolean b(Object obj, Object obj2) {
        return g(obj, obj2) == 0;
    }

    public void c(Object obj) {
        this.f39356f = obj;
    }

    public void d(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39351g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == c.f39365c) {
                return;
            }
        } while (!b.a(atomicReferenceFieldUpdater, this, obj, c.f39366d));
        List<a<R>.defpackage.a> list = this.f39353b;
        if (list != null) {
            for (C0463a b10 : list) {
                b10.b();
            }
            this.f39356f = c.f39367e;
            this.f39353b = null;
        }
    }

    public final d f(Object obj, Object obj2) {
        return c.a(g(obj, obj2));
    }

    public g getContext() {
        return this.f39352a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        d((Throwable) obj);
        return w.f38141a;
    }
}
