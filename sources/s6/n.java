package s6;

import java.util.Comparator;
import v6.e;
import v6.g;

/* compiled from: ComparisonChain */
public abstract class n {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final n f30215a = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final n f30216b = new b(-1);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final n f30217c = new b(1);

    /* compiled from: ComparisonChain */
    class a extends n {
        a() {
            super((a) null);
        }

        public n d(int i10, int i11) {
            return k(e.e(i10, i11));
        }

        public n e(long j10, long j11) {
            return k(g.a(j10, j11));
        }

        public <T> n f(T t10, T t11, Comparator<T> comparator) {
            return k(comparator.compare(t10, t11));
        }

        public n g(boolean z10, boolean z11) {
            return k(v6.a.a(z10, z11));
        }

        public n h(boolean z10, boolean z11) {
            return k(v6.a.a(z11, z10));
        }

        public int i() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public n k(int i10) {
            if (i10 < 0) {
                return n.f30216b;
            }
            return i10 > 0 ? n.f30217c : n.f30215a;
        }
    }

    /* compiled from: ComparisonChain */
    private static final class b extends n {

        /* renamed from: d  reason: collision with root package name */
        final int f30218d;

        b(int i10) {
            super((a) null);
            this.f30218d = i10;
        }

        public n d(int i10, int i11) {
            return this;
        }

        public n e(long j10, long j11) {
            return this;
        }

        public <T> n f(T t10, T t11, Comparator<T> comparator) {
            return this;
        }

        public n g(boolean z10, boolean z11) {
            return this;
        }

        public n h(boolean z10, boolean z11) {
            return this;
        }

        public int i() {
            return this.f30218d;
        }
    }

    /* synthetic */ n(a aVar) {
        this();
    }

    public static n j() {
        return f30215a;
    }

    public abstract n d(int i10, int i11);

    public abstract n e(long j10, long j11);

    public abstract <T> n f(T t10, T t11, Comparator<T> comparator);

    public abstract n g(boolean z10, boolean z11);

    public abstract n h(boolean z10, boolean z11);

    public abstract int i();

    private n() {
    }
}
