package me;

import ge.a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.m;
import sd.o;
import sd.p;
import sd.w;
import xd.d;
import xd.g;

/* compiled from: SequenceBuilder.kt */
final class e<T> extends f<T> implements Iterator<T>, d<w>, a {

    /* renamed from: a  reason: collision with root package name */
    private int f36353a;

    /* renamed from: b  reason: collision with root package name */
    private T f36354b;

    /* renamed from: c  reason: collision with root package name */
    private Iterator<? extends T> f36355c;

    /* renamed from: d  reason: collision with root package name */
    private d<? super w> f36356d;

    private final Throwable b() {
        int i10 = this.f36353a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f36353a);
    }

    private final T d() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    public Object a(T t10, d<? super w> dVar) {
        this.f36354b = t10;
        this.f36353a = 3;
        this.f36356d = dVar;
        Object c10 = d.c();
        if (c10 == d.c()) {
            h.c(dVar);
        }
        return c10 == d.c() ? c10 : w.f38141a;
    }

    public final void e(d<? super w> dVar) {
        this.f36356d = dVar;
    }

    public g getContext() {
        return xd.h.f39347a;
    }

    public boolean hasNext() {
        while (true) {
            int i10 = this.f36353a;
            if (i10 != 0) {
                if (i10 == 1) {
                    Iterator<? extends T> it = this.f36355c;
                    m.b(it);
                    if (it.hasNext()) {
                        this.f36353a = 2;
                        return true;
                    }
                    this.f36355c = null;
                } else if (i10 == 2 || i10 == 3) {
                    return true;
                } else {
                    if (i10 == 4) {
                        return false;
                    }
                    throw b();
                }
            }
            this.f36353a = 5;
            d<? super w> dVar = this.f36356d;
            m.b(dVar);
            this.f36356d = null;
            o.a aVar = o.f38128b;
            dVar.resumeWith(o.b(w.f38141a));
        }
    }

    public T next() {
        int i10 = this.f36353a;
        if (i10 == 0 || i10 == 1) {
            return d();
        }
        if (i10 == 2) {
            this.f36353a = 1;
            Iterator<? extends T> it = this.f36355c;
            m.b(it);
            return it.next();
        } else if (i10 == 3) {
            this.f36353a = 0;
            T t10 = this.f36354b;
            this.f36354b = null;
            return t10;
        } else {
            throw b();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void resumeWith(Object obj) {
        p.b(obj);
        this.f36353a = 4;
    }
}
