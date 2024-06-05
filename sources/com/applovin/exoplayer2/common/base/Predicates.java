package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class Predicates {

    private static class b implements Predicate, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final List f6072a;

        public boolean apply(Object obj) {
            for (int i10 = 0; i10 < this.f6072a.size(); i10++) {
                if (!((Predicate) this.f6072a.get(i10)).apply(obj)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f6072a.equals(((b) obj).f6072a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6072a.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.toStringHelper("and", this.f6072a);
        }

        private b(List list) {
            this.f6072a = list;
        }
    }

    private static class c implements Predicate, Serializable {

        /* renamed from: a  reason: collision with root package name */
        final Predicate f6073a;

        /* renamed from: b  reason: collision with root package name */
        final Function f6074b;

        public boolean apply(Object obj) {
            return this.f6073a.apply(this.f6074b.apply(obj));
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f6074b.equals(cVar.f6074b) || !this.f6073a.equals(cVar.f6073a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f6074b.hashCode() ^ this.f6073a.hashCode();
        }

        public String toString() {
            return this.f6073a + "(" + this.f6074b + ")";
        }

        private c(Predicate predicate, Function function) {
            this.f6073a = (Predicate) Preconditions.checkNotNull(predicate);
            this.f6074b = (Function) Preconditions.checkNotNull(function);
        }
    }

    private static class d implements Predicate, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final Collection f6075a;

        public boolean apply(Object obj) {
            try {
                return this.f6075a.contains(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f6075a.equals(((d) obj).f6075a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6075a.hashCode();
        }

        public String toString() {
            return "Predicates.in(" + this.f6075a + ")";
        }

        private d(Collection collection) {
            this.f6075a = (Collection) Preconditions.checkNotNull(collection);
        }
    }

    private static class e implements Predicate, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final Class f6076a;

        public boolean apply(Object obj) {
            return this.f6076a.isInstance(obj);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof e) || this.f6076a != ((e) obj).f6076a) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f6076a.hashCode();
        }

        public String toString() {
            return "Predicates.instanceOf(" + this.f6076a.getName() + ")";
        }

        private e(Class cls) {
            this.f6076a = (Class) Preconditions.checkNotNull(cls);
        }
    }

    private static class f implements Predicate, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final Object f6077a;

        public boolean apply(Object obj) {
            return this.f6077a.equals(obj);
        }

        public boolean equals(Object obj) {
            if (obj instanceof f) {
                return this.f6077a.equals(((f) obj).f6077a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6077a.hashCode();
        }

        public String toString() {
            return "Predicates.equalTo(" + this.f6077a + ")";
        }

        private f(Object obj) {
            this.f6077a = obj;
        }
    }

    private static class g implements Predicate, Serializable {

        /* renamed from: a  reason: collision with root package name */
        final Predicate f6078a;

        g(Predicate predicate) {
            this.f6078a = (Predicate) Preconditions.checkNotNull(predicate);
        }

        public boolean apply(Object obj) {
            return !this.f6078a.apply(obj);
        }

        public boolean equals(Object obj) {
            if (obj instanceof g) {
                return this.f6078a.equals(((g) obj).f6078a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f6078a.hashCode();
        }

        public String toString() {
            return "Predicates.not(" + this.f6078a + ")";
        }
    }

    enum h implements Predicate {
        ALWAYS_TRUE {
            public boolean apply(Object obj) {
                return true;
            }

            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE {
            public boolean apply(Object obj) {
                return false;
            }

            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL {
            public boolean apply(Object obj) {
                return obj == null;
            }

            public String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL {
            public boolean apply(Object obj) {
                return obj != null;
            }

            public String toString() {
                return "Predicates.notNull()";
            }
        };

        /* access modifiers changed from: package-private */
        public Predicate b() {
            return this;
        }
    }

    private static class i implements Predicate, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final List f6084a;

        public boolean apply(Object obj) {
            for (int i10 = 0; i10 < this.f6084a.size(); i10++) {
                if (((Predicate) this.f6084a.get(i10)).apply(obj)) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof i) {
                return this.f6084a.equals(((i) obj).f6084a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6084a.hashCode() + 87855567;
        }

        public String toString() {
            return Predicates.toStringHelper("or", this.f6084a);
        }

        private i(List list) {
            this.f6084a = list;
        }
    }

    private static class j implements Predicate, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final Class f6085a;

        public boolean equals(Object obj) {
            if (!(obj instanceof j) || this.f6085a != ((j) obj).f6085a) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f6085a.hashCode();
        }

        public String toString() {
            return "Predicates.subtypeOf(" + this.f6085a.getName() + ")";
        }

        private j(Class cls) {
            this.f6085a = (Class) Preconditions.checkNotNull(cls);
        }

        public boolean apply(Class cls) {
            return this.f6085a.isAssignableFrom(cls);
        }
    }

    private Predicates() {
    }

    public static <T> Predicate<T> alwaysFalse() {
        return h.ALWAYS_FALSE.b();
    }

    public static <T> Predicate<T> alwaysTrue() {
        return h.ALWAYS_TRUE.b();
    }

    public static <T> Predicate<T> and(Iterable<? extends Predicate<? super T>> iterable) {
        return new b(defensiveCopy(iterable));
    }

    private static <T> List<Predicate<? super T>> asList(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return Arrays.asList(new Predicate[]{predicate, predicate2});
    }

    public static <A, B> Predicate<A> compose(Predicate<B> predicate, Function<A, ? extends B> function) {
        return new c(predicate, function);
    }

    private static <T> List<T> defensiveCopy(T... tArr) {
        return defensiveCopy(Arrays.asList(tArr));
    }

    public static <T> Predicate<T> equalTo(@NullableDecl T t10) {
        return t10 == null ? isNull() : new f(t10);
    }

    public static <T> Predicate<T> in(Collection<? extends T> collection) {
        return new d(collection);
    }

    public static Predicate<Object> instanceOf(Class<?> cls) {
        return new e(cls);
    }

    public static <T> Predicate<T> isNull() {
        return h.IS_NULL.b();
    }

    public static <T> Predicate<T> not(Predicate<T> predicate) {
        return new g(predicate);
    }

    public static <T> Predicate<T> notNull() {
        return h.NOT_NULL.b();
    }

    public static <T> Predicate<T> or(Iterable<? extends Predicate<? super T>> iterable) {
        return new i(defensiveCopy(iterable));
    }

    public static Predicate<Class<?>> subtypeOf(Class<?> cls) {
        return new j(cls);
    }

    /* access modifiers changed from: private */
    public static String toStringHelper(String str, Iterable<?> iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z10 = true;
        for (Object next : iterable) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(next);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    @SafeVarargs
    public static <T> Predicate<T> and(Predicate<? super T>... predicateArr) {
        return new b(defensiveCopy((T[]) predicateArr));
    }

    static <T> List<T> defensiveCopy(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T checkNotNull : iterable) {
            arrayList.add(Preconditions.checkNotNull(checkNotNull));
        }
        return arrayList;
    }

    @SafeVarargs
    public static <T> Predicate<T> or(Predicate<? super T>... predicateArr) {
        return new i(defensiveCopy((T[]) predicateArr));
    }

    public static <T> Predicate<T> and(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new b(asList((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }

    public static <T> Predicate<T> or(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new i(asList((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }
}
