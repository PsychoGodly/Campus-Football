package me;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: _Sequences.kt */
class l extends k {

    /* compiled from: Iterables.kt */
    public static final class a implements Iterable<T>, ge.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f36359a;

        public a(d dVar) {
            this.f36359a = dVar;
        }

        public Iterator<T> iterator() {
            return this.f36359a.iterator();
        }
    }

    public static <T> Iterable<T> f(d<? extends T> dVar) {
        m.e(dVar, "<this>");
        return new a(dVar);
    }

    public static <T> d<T> g(d<? extends T> dVar, fe.l<? super T, Boolean> lVar) {
        m.e(dVar, "<this>");
        m.e(lVar, "predicate");
        return new c(dVar, true, lVar);
    }

    public static <T, R> d<R> h(d<? extends T> dVar, fe.l<? super T, ? extends R> lVar) {
        m.e(dVar, "<this>");
        m.e(lVar, "transform");
        return new m(dVar, lVar);
    }

    public static final <T, C extends Collection<? super T>> C i(d<? extends T> dVar, C c10) {
        m.e(dVar, "<this>");
        m.e(c10, "destination");
        for (Object add : dVar) {
            c10.add(add);
        }
        return c10;
    }

    public static <T> List<T> j(d<? extends T> dVar) {
        m.e(dVar, "<this>");
        return q.h(k(dVar));
    }

    public static final <T> List<T> k(d<? extends T> dVar) {
        m.e(dVar, "<this>");
        return (List) i(dVar, new ArrayList());
    }
}
