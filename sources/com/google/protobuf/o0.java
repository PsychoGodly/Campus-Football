package com.google.protobuf;

import com.google.protobuf.b2;
import java.io.IOException;

/* compiled from: MapEntryLite */
public class o0<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final a<K, V> f27162a;

    /* renamed from: b  reason: collision with root package name */
    private final K f27163b;

    /* renamed from: c  reason: collision with root package name */
    private final V f27164c;

    /* compiled from: MapEntryLite */
    static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final b2.b f27165a;

        /* renamed from: b  reason: collision with root package name */
        public final K f27166b;

        /* renamed from: c  reason: collision with root package name */
        public final b2.b f27167c;

        /* renamed from: d  reason: collision with root package name */
        public final V f27168d;

        public a(b2.b bVar, K k10, b2.b bVar2, V v10) {
            this.f27165a = bVar;
            this.f27166b = k10;
            this.f27167c = bVar2;
            this.f27168d = v10;
        }
    }

    private o0(b2.b bVar, K k10, b2.b bVar2, V v10) {
        this.f27162a = new a<>(bVar, k10, bVar2, v10);
        this.f27163b = k10;
        this.f27164c = v10;
    }

    static <K, V> int b(a<K, V> aVar, K k10, V v10) {
        return v.d(aVar.f27165a, 1, k10) + v.d(aVar.f27167c, 2, v10);
    }

    public static <K, V> o0<K, V> d(b2.b bVar, K k10, b2.b bVar2, V v10) {
        return new o0<>(bVar, k10, bVar2, v10);
    }

    static <K, V> void e(l lVar, a<K, V> aVar, K k10, V v10) throws IOException {
        v.A(lVar, aVar.f27165a, 1, k10);
        v.A(lVar, aVar.f27167c, 2, v10);
    }

    public int a(int i10, K k10, V v10) {
        return l.V(i10) + l.D(b(this.f27162a, k10, v10));
    }

    /* access modifiers changed from: package-private */
    public a<K, V> c() {
        return this.f27162a;
    }
}
