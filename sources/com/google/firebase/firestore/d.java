package com.google.firebase.firestore;

import com.google.firebase.firestore.a;
import com.google.firebase.firestore.n;
import java.util.Map;
import java.util.Objects;
import p8.d0;
import y7.x;

/* compiled from: AggregateQuerySnapshot */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final c f26446a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, d0> f26447b;

    d(c cVar, Map<String, d0> map) {
        x.b(cVar);
        this.f26446a = cVar;
        this.f26447b = map;
    }

    private <T> T a(Object obj, a aVar, Class<T> cls) {
        if (obj == null) {
            return null;
        }
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        throw new RuntimeException("AggregateField '" + aVar.c() + "' is not a " + cls.getName());
    }

    private Object g(a aVar) {
        if (this.f26447b.containsKey(aVar.c())) {
            return new h1(this.f26446a.c().f26544b, n.a.f26512d).f(this.f26447b.get(aVar.c()));
        }
        throw new IllegalArgumentException("'" + aVar.e() + "(" + aVar.d() + ")' was not requested in the aggregation query.");
    }

    private <T> T i(a aVar, Class<T> cls) {
        return a(g(aVar), aVar, cls);
    }

    public long b(a.c cVar) {
        Long h10 = h(cVar);
        if (h10 != null) {
            return h10.longValue();
        }
        throw new IllegalArgumentException("RunAggregationQueryResponse alias " + cVar.c() + " is null");
    }

    public Double c(a.b bVar) {
        return f(bVar);
    }

    public Object d(a aVar) {
        return g(aVar);
    }

    public long e() {
        return b(a.b());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f26446a.equals(dVar.f26446a) || !this.f26447b.equals(dVar.f26447b)) {
            return false;
        }
        return true;
    }

    public Double f(a aVar) {
        Number number = (Number) i(aVar, Number.class);
        if (number != null) {
            return Double.valueOf(number.doubleValue());
        }
        return null;
    }

    public Long h(a aVar) {
        Number number = (Number) i(aVar, Number.class);
        if (number != null) {
            return Long.valueOf(number.longValue());
        }
        return null;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f26446a, this.f26447b});
    }
}
