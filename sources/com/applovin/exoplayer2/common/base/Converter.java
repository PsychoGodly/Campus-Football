package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class Converter<A, B> implements Function<A, B> {
    private final boolean handleNullAutomatically;
    @MonotonicNonNullDecl
    private transient Converter<B, A> reverse;

    class a implements Iterable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterable f6052a;

        /* renamed from: com.applovin.exoplayer2.common.base.Converter$a$a  reason: collision with other inner class name */
        class C0108a implements Iterator {

            /* renamed from: a  reason: collision with root package name */
            private final Iterator f6054a;

            C0108a() {
                this.f6054a = a.this.f6052a.iterator();
            }

            public boolean hasNext() {
                return this.f6054a.hasNext();
            }

            public Object next() {
                return Converter.this.convert(this.f6054a.next());
            }

            public void remove() {
                this.f6054a.remove();
            }
        }

        a(Iterable iterable) {
            this.f6052a = iterable;
        }

        public Iterator iterator() {
            return new C0108a();
        }
    }

    private static final class b extends Converter implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        final Converter f6056a;

        /* renamed from: b  reason: collision with root package name */
        final Converter f6057b;

        b(Converter converter, Converter converter2) {
            this.f6056a = converter;
            this.f6057b = converter2;
        }

        /* access modifiers changed from: package-private */
        public Object correctedDoBackward(Object obj) {
            return this.f6056a.correctedDoBackward(this.f6057b.correctedDoBackward(obj));
        }

        /* access modifiers changed from: package-private */
        public Object correctedDoForward(Object obj) {
            return this.f6057b.correctedDoForward(this.f6056a.correctedDoForward(obj));
        }

        /* access modifiers changed from: protected */
        public Object doBackward(Object obj) {
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        public Object doForward(Object obj) {
            throw new AssertionError();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f6056a.equals(bVar.f6056a) || !this.f6057b.equals(bVar.f6057b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f6056a.hashCode() * 31) + this.f6057b.hashCode();
        }

        public String toString() {
            return this.f6056a + ".andThen(" + this.f6057b + ")";
        }
    }

    private static final class c extends Converter implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final Function f6058a;

        /* renamed from: b  reason: collision with root package name */
        private final Function f6059b;

        /* synthetic */ c(Function function, Function function2, a aVar) {
            this(function, function2);
        }

        /* access modifiers changed from: protected */
        public Object doBackward(Object obj) {
            return this.f6059b.apply(obj);
        }

        /* access modifiers changed from: protected */
        public Object doForward(Object obj) {
            return this.f6058a.apply(obj);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f6058a.equals(cVar.f6058a) || !this.f6059b.equals(cVar.f6059b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f6058a.hashCode() * 31) + this.f6059b.hashCode();
        }

        public String toString() {
            return "Converter.from(" + this.f6058a + ", " + this.f6059b + ")";
        }

        private c(Function function, Function function2) {
            this.f6058a = (Function) Preconditions.checkNotNull(function);
            this.f6059b = (Function) Preconditions.checkNotNull(function2);
        }
    }

    private static final class d extends Converter implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        static final d f6060a = new d();

        private d() {
        }

        /* access modifiers changed from: package-private */
        public Converter doAndThen(Converter converter) {
            return (Converter) Preconditions.checkNotNull(converter, "otherConverter");
        }

        /* access modifiers changed from: protected */
        public Object doBackward(Object obj) {
            return obj;
        }

        /* access modifiers changed from: protected */
        public Object doForward(Object obj) {
            return obj;
        }

        public d reverse() {
            return this;
        }

        public String toString() {
            return "Converter.identity()";
        }
    }

    private static final class e extends Converter implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        final Converter f6061a;

        e(Converter converter) {
            this.f6061a = converter;
        }

        /* access modifiers changed from: package-private */
        public Object correctedDoBackward(Object obj) {
            return this.f6061a.correctedDoForward(obj);
        }

        /* access modifiers changed from: package-private */
        public Object correctedDoForward(Object obj) {
            return this.f6061a.correctedDoBackward(obj);
        }

        /* access modifiers changed from: protected */
        public Object doBackward(Object obj) {
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        public Object doForward(Object obj) {
            throw new AssertionError();
        }

        public boolean equals(Object obj) {
            if (obj instanceof e) {
                return this.f6061a.equals(((e) obj).f6061a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f6061a.hashCode();
        }

        public Converter reverse() {
            return this.f6061a;
        }

        public String toString() {
            return this.f6061a + ".reverse()";
        }
    }

    protected Converter() {
        this(true);
    }

    public static <A, B> Converter<A, B> from(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
        return new c(function, function2, (a) null);
    }

    public static <T> Converter<T, T> identity() {
        return d.f6060a;
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> converter) {
        return doAndThen(converter);
    }

    @NullableDecl
    @Deprecated
    public final B apply(@NullableDecl A a10) {
        return convert(a10);
    }

    @NullableDecl
    public final B convert(@NullableDecl A a10) {
        return correctedDoForward(a10);
    }

    public Iterable<B> convertAll(Iterable<? extends A> iterable) {
        Preconditions.checkNotNull(iterable, "fromIterable");
        return new a(iterable);
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    public A correctedDoBackward(@NullableDecl B b10) {
        if (!this.handleNullAutomatically) {
            return doBackward(b10);
        }
        if (b10 == null) {
            return null;
        }
        return Preconditions.checkNotNull(doBackward(b10));
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    public B correctedDoForward(@NullableDecl A a10) {
        if (!this.handleNullAutomatically) {
            return doForward(a10);
        }
        if (a10 == null) {
            return null;
        }
        return Preconditions.checkNotNull(doForward(a10));
    }

    /* access modifiers changed from: package-private */
    public <C> Converter<A, C> doAndThen(Converter<B, C> converter) {
        return new b(this, (Converter) Preconditions.checkNotNull(converter));
    }

    /* access modifiers changed from: protected */
    public abstract A doBackward(B b10);

    /* access modifiers changed from: protected */
    public abstract B doForward(A a10);

    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public Converter<B, A> reverse() {
        Converter<B, A> converter = this.reverse;
        if (converter != null) {
            return converter;
        }
        e eVar = new e(this);
        this.reverse = eVar;
        return eVar;
    }

    Converter(boolean z10) {
        this.handleNullAutomatically = z10;
    }
}
