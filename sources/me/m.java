package me;

import fe.l;
import java.util.Iterator;

/* compiled from: Sequences.kt */
public final class m<T, R> implements d<R> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final d<T> f36360a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final l<T, R> f36361b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<R>, ge.a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<T> f36362a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m<T, R> f36363b;

        a(m<T, R> mVar) {
            this.f36363b = mVar;
            this.f36362a = mVar.f36360a.iterator();
        }

        public boolean hasNext() {
            return this.f36362a.hasNext();
        }

        public R next() {
            return this.f36363b.f36361b.invoke(this.f36362a.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public m(d<? extends T> dVar, l<? super T, ? extends R> lVar) {
        kotlin.jvm.internal.m.e(dVar, "sequence");
        kotlin.jvm.internal.m.e(lVar, "transformer");
        this.f36360a = dVar;
        this.f36361b = lVar;
    }

    public Iterator<R> iterator() {
        return new a(this);
    }
}
