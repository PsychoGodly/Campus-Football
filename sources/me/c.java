package me;

import fe.l;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

/* compiled from: Sequences.kt */
public final class c<T> implements d<T> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final d<T> f36346a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final boolean f36347b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final l<T, Boolean> f36348c;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, ge.a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<T> f36349a;

        /* renamed from: b  reason: collision with root package name */
        private int f36350b = -1;

        /* renamed from: c  reason: collision with root package name */
        private T f36351c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c<T> f36352d;

        a(c<T> cVar) {
            this.f36352d = cVar;
            this.f36349a = cVar.f36346a.iterator();
        }

        private final void a() {
            while (this.f36349a.hasNext()) {
                T next = this.f36349a.next();
                if (((Boolean) this.f36352d.f36348c.invoke(next)).booleanValue() == this.f36352d.f36347b) {
                    this.f36351c = next;
                    this.f36350b = 1;
                    return;
                }
            }
            this.f36350b = 0;
        }

        public boolean hasNext() {
            if (this.f36350b == -1) {
                a();
            }
            return this.f36350b == 1;
        }

        public T next() {
            if (this.f36350b == -1) {
                a();
            }
            if (this.f36350b != 0) {
                T t10 = this.f36351c;
                this.f36351c = null;
                this.f36350b = -1;
                return t10;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(d<? extends T> dVar, boolean z10, l<? super T, Boolean> lVar) {
        m.e(dVar, "sequence");
        m.e(lVar, "predicate");
        this.f36346a = dVar;
        this.f36347b = z10;
        this.f36348c = lVar;
    }

    public Iterator<T> iterator() {
        return new a(this);
    }
}
