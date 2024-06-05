package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class Equivalence<T> {

    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<? super T> equivalence;
        @NullableDecl
        private final T reference;

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            Wrapper wrapper = (Wrapper) obj;
            if (this.equivalence.equals(wrapper.equivalence)) {
                return this.equivalence.equivalent(this.reference, wrapper.reference);
            }
            return false;
        }

        @NullableDecl
        public T get() {
            return this.reference;
        }

        public int hashCode() {
            return this.equivalence.hash(this.reference);
        }

        public String toString() {
            return this.equivalence + ".wrap(" + this.reference + ")";
        }

        private Wrapper(Equivalence<? super T> equivalence2, @NullableDecl T t10) {
            this.equivalence = (Equivalence) Preconditions.checkNotNull(equivalence2);
            this.reference = t10;
        }
    }

    static final class b extends Equivalence implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        static final b f6062a = new b();

        b() {
        }

        /* access modifiers changed from: protected */
        public boolean doEquivalent(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        /* access modifiers changed from: protected */
        public int doHash(Object obj) {
            return obj.hashCode();
        }
    }

    private static final class c implements Predicate, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final Equivalence f6063a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f6064b;

        c(Equivalence equivalence, Object obj) {
            this.f6063a = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.f6064b = obj;
        }

        public boolean apply(Object obj) {
            return this.f6063a.equivalent(obj, this.f6064b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f6063a.equals(cVar.f6063a) || !Objects.equal(this.f6064b, cVar.f6064b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hashCode(this.f6063a, this.f6064b);
        }

        public String toString() {
            return this.f6063a + ".equivalentTo(" + this.f6064b + ")";
        }
    }

    static final class d extends Equivalence implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        static final d f6065a = new d();

        d() {
        }

        /* access modifiers changed from: protected */
        public boolean doEquivalent(Object obj, Object obj2) {
            return false;
        }

        /* access modifiers changed from: protected */
        public int doHash(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected Equivalence() {
    }

    public static Equivalence<Object> equals() {
        return b.f6062a;
    }

    public static Equivalence<Object> identity() {
        return d.f6065a;
    }

    /* access modifiers changed from: protected */
    public abstract boolean doEquivalent(T t10, T t11);

    /* access modifiers changed from: protected */
    public abstract int doHash(T t10);

    public final boolean equivalent(@NullableDecl T t10, @NullableDecl T t11) {
        if (t10 == t11) {
            return true;
        }
        if (t10 == null || t11 == null) {
            return false;
        }
        return doEquivalent(t10, t11);
    }

    public final Predicate<T> equivalentTo(@NullableDecl T t10) {
        return new c(this, t10);
    }

    public final int hash(@NullableDecl T t10) {
        if (t10 == null) {
            return 0;
        }
        return doHash(t10);
    }

    public final <S extends T> Wrapper<S> wrap(@NullableDecl S s10) {
        return new Wrapper<>(s10);
    }
}
