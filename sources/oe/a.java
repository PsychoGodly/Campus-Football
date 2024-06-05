package oe;

import kotlin.jvm.internal.m;

/* compiled from: TimeSource.kt */
public interface a extends i, Comparable<a> {

    /* renamed from: oe.a$a  reason: collision with other inner class name */
    /* compiled from: TimeSource.kt */
    public static final class C0422a {
        public static int a(a aVar, a aVar2) {
            m.e(aVar2, "other");
            return b.f(aVar.b(aVar2), b.f36768b.a());
        }
    }

    long b(a aVar);
}
