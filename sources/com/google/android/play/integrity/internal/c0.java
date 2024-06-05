package com.google.android.play.integrity.internal;

import java.util.Objects;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
public final class c0 implements d {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f26075c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile d f26076a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f26077b = f26075c;

    private c0(d dVar) {
        this.f26076a = dVar;
    }

    public static d b(d dVar) {
        Objects.requireNonNull(dVar);
        if (dVar instanceof c0) {
            return dVar;
        }
        return new c0(dVar);
    }

    public final Object a() {
        Object obj = this.f26077b;
        Object obj2 = f26075c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f26077b;
                if (obj == obj2) {
                    obj = this.f26076a.a();
                    Object obj3 = this.f26077b;
                    if (obj3 != obj2) {
                        if (obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                    }
                    this.f26077b = obj;
                    this.f26076a = null;
                }
            }
        }
        return obj;
    }
}
