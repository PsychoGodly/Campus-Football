package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    class a implements Iterable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterable f6069a;

        /* renamed from: com.applovin.exoplayer2.common.base.Optional$a$a  reason: collision with other inner class name */
        class C0109a extends b {

            /* renamed from: c  reason: collision with root package name */
            private final Iterator f6070c;

            C0109a() {
                this.f6070c = (Iterator) Preconditions.checkNotNull(a.this.f6069a.iterator());
            }

            /* access modifiers changed from: protected */
            public Object a() {
                while (this.f6070c.hasNext()) {
                    Optional optional = (Optional) this.f6070c.next();
                    if (optional.isPresent()) {
                        return optional.get();
                    }
                }
                return b();
            }
        }

        a(Iterable iterable) {
            this.f6069a = iterable;
        }

        public Iterator iterator() {
            return new C0109a();
        }
    }

    Optional() {
    }

    public static <T> Optional<T> absent() {
        return a.a();
    }

    public static <T> Optional<T> fromNullable(@NullableDecl T t10) {
        return t10 == null ? absent() : new d(t10);
    }

    public static <T> Optional<T> of(T t10) {
        return new d(Preconditions.checkNotNull(t10));
    }

    public static <T> Iterable<T> presentInstances(Iterable<? extends Optional<? extends T>> iterable) {
        Preconditions.checkNotNull(iterable);
        return new a(iterable);
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(@NullableDecl Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract Optional<T> or(Optional<? extends T> optional);

    public abstract T or(Supplier<? extends T> supplier);

    public abstract T or(T t10);

    @NullableDecl
    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(Function<? super T, V> function);
}
