package com.google.firebase.firestore;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import r7.k;
import r7.p;

/* compiled from: Filter */
public class s {

    /* compiled from: Filter */
    static class a extends s {

        /* renamed from: a  reason: collision with root package name */
        private final List<s> f26528a;

        /* renamed from: b  reason: collision with root package name */
        private final k.a f26529b;

        public a(List<s> list, k.a aVar) {
            this.f26528a = list;
            this.f26529b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f26529b != aVar.f26529b || !Objects.equals(this.f26528a, aVar.f26528a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            List<s> list = this.f26528a;
            int i10 = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            k.a aVar = this.f26529b;
            if (aVar != null) {
                i10 = aVar.hashCode();
            }
            return hashCode + i10;
        }

        public List<s> m() {
            return this.f26528a;
        }

        public k.a n() {
            return this.f26529b;
        }
    }

    /* compiled from: Filter */
    static class b extends s {

        /* renamed from: a  reason: collision with root package name */
        private final q f26530a;

        /* renamed from: b  reason: collision with root package name */
        private final p.b f26531b;

        /* renamed from: c  reason: collision with root package name */
        private final Object f26532c;

        public b(q qVar, p.b bVar, Object obj) {
            this.f26530a = qVar;
            this.f26531b = bVar;
            this.f26532c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f26531b != bVar.f26531b || !Objects.equals(this.f26530a, bVar.f26530a) || !Objects.equals(this.f26532c, bVar.f26532c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            q qVar = this.f26530a;
            int i10 = 0;
            int hashCode = (qVar != null ? qVar.hashCode() : 0) * 31;
            p.b bVar = this.f26531b;
            int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
            Object obj = this.f26532c;
            if (obj != null) {
                i10 = obj.hashCode();
            }
            return hashCode2 + i10;
        }

        public q m() {
            return this.f26530a;
        }

        public p.b n() {
            return this.f26531b;
        }

        public Object o() {
            return this.f26532c;
        }
    }

    public static s a(s... sVarArr) {
        return new a(Arrays.asList(sVarArr), k.a.AND);
    }

    public static s b(q qVar, Object obj) {
        return new b(qVar, p.b.ARRAY_CONTAINS, obj);
    }

    public static s c(q qVar, List<? extends Object> list) {
        return new b(qVar, p.b.ARRAY_CONTAINS_ANY, list);
    }

    public static s d(q qVar, Object obj) {
        return new b(qVar, p.b.EQUAL, obj);
    }

    public static s e(q qVar, Object obj) {
        return new b(qVar, p.b.GREATER_THAN, obj);
    }

    public static s f(q qVar, Object obj) {
        return new b(qVar, p.b.GREATER_THAN_OR_EQUAL, obj);
    }

    public static s g(q qVar, List<? extends Object> list) {
        return new b(qVar, p.b.IN, list);
    }

    public static s h(q qVar, Object obj) {
        return new b(qVar, p.b.LESS_THAN, obj);
    }

    public static s i(q qVar, Object obj) {
        return new b(qVar, p.b.LESS_THAN_OR_EQUAL, obj);
    }

    public static s j(q qVar, Object obj) {
        return new b(qVar, p.b.NOT_EQUAL, obj);
    }

    public static s k(q qVar, List<? extends Object> list) {
        return new b(qVar, p.b.NOT_IN, list);
    }

    public static s l(s... sVarArr) {
        return new a(Arrays.asList(sVarArr), k.a.OR);
    }
}
