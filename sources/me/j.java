package me;

import java.util.Iterator;
import kotlin.jvm.internal.m;

/* compiled from: Sequences.kt */
class j extends i {

    /* compiled from: Sequences.kt */
    public static final class a implements d<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f36358a;

        public a(Iterator it) {
            this.f36358a = it;
        }

        public Iterator<T> iterator() {
            return this.f36358a;
        }
    }

    public static <T> d<T> c(Iterator<? extends T> it) {
        m.e(it, "<this>");
        return d(new a(it));
    }

    public static <T> d<T> d(d<? extends T> dVar) {
        m.e(dVar, "<this>");
        return dVar instanceof a ? dVar : new a(dVar);
    }

    public static <T> d<T> e() {
        return b.f36345a;
    }
}
