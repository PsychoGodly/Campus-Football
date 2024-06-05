package oe;

import kotlin.jvm.internal.m;
import nf.b;
import oe.a;

/* compiled from: TimeSource.kt */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f36786a = new j();

    /* compiled from: TimeSource.kt */
    public static final class a implements a {

        /* renamed from: a  reason: collision with root package name */
        private final long f36787a;

        private /* synthetic */ a(long j10) {
            this.f36787a = j10;
        }

        public static final /* synthetic */ a c(long j10) {
            return new a(j10);
        }

        public static long e(long j10) {
            return j10;
        }

        public static long f(long j10) {
            return h.f36784a.b(j10);
        }

        public static boolean g(long j10, Object obj) {
            return (obj instanceof a) && j10 == ((a) obj).l();
        }

        public static int h(long j10) {
            return b.a(j10);
        }

        public static final long i(long j10, long j11) {
            return h.f36784a.a(j10, j11);
        }

        public static long j(long j10, a aVar) {
            m.e(aVar, "other");
            if (aVar instanceof a) {
                return i(j10, ((a) aVar).l());
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + k(j10) + " and " + aVar);
        }

        public static String k(long j10) {
            return "ValueTimeMark(reading=" + j10 + ')';
        }

        public long a() {
            return f(this.f36787a);
        }

        public long b(a aVar) {
            m.e(aVar, "other");
            return j(this.f36787a, aVar);
        }

        /* renamed from: d */
        public int compareTo(a aVar) {
            return a.C0422a.a(this, aVar);
        }

        public boolean equals(Object obj) {
            return g(this.f36787a, obj);
        }

        public int hashCode() {
            return h(this.f36787a);
        }

        public final /* synthetic */ long l() {
            return this.f36787a;
        }

        public String toString() {
            return k(this.f36787a);
        }
    }

    private j() {
    }

    public long a() {
        return h.f36784a.c();
    }

    public String toString() {
        return h.f36784a.toString();
    }
}
