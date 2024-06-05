package x7;

import com.google.auto.value.AutoValue;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p8.g;
import u7.f;
import x7.y0;

/* compiled from: TestingHooks */
final class w0 {

    /* renamed from: b  reason: collision with root package name */
    private static final w0 f31155b = new w0();

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList<AtomicReference<c>> f31156a = new CopyOnWriteArrayList<>();

    @AutoValue
    /* compiled from: TestingHooks */
    static abstract class a {
        a() {
        }

        static a d(m mVar, boolean z10, int i10, int i11, int i12) {
            return new k(mVar, z10, i10, i11, i12);
        }

        static a e(m mVar, y0.b bVar, r rVar) {
            g b10 = rVar.b();
            if (b10 == null) {
                return null;
            }
            return d(mVar, bVar == y0.b.SUCCESS, b10.h0(), b10.f0().f0().size(), b10.f0().h0());
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a();

        /* access modifiers changed from: package-private */
        public abstract int b();

        /* access modifiers changed from: package-private */
        public abstract m c();

        /* access modifiers changed from: package-private */
        public abstract int f();

        /* access modifiers changed from: package-private */
        public abstract int g();
    }

    @AutoValue
    /* compiled from: TestingHooks */
    static abstract class b {
        b() {
        }

        static b b(int i10, int i11, String str, String str2, a aVar) {
            return new l(i10, i11, str, str2, aVar);
        }

        static b e(int i10, r rVar, f fVar, m mVar, y0.b bVar) {
            return b(i10, rVar.a(), fVar.f(), fVar.e(), a.e(mVar, bVar, rVar));
        }

        /* access modifiers changed from: package-private */
        public abstract a a();

        /* access modifiers changed from: package-private */
        public abstract String c();

        /* access modifiers changed from: package-private */
        public abstract int d();

        /* access modifiers changed from: package-private */
        public abstract int f();

        /* access modifiers changed from: package-private */
        public abstract String g();
    }

    /* compiled from: TestingHooks */
    interface c {
        void a(b bVar);
    }

    private w0() {
    }

    static w0 a() {
        return f31155b;
    }

    /* access modifiers changed from: package-private */
    public void b(b bVar) {
        Iterator<AtomicReference<c>> it = this.f31156a.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next().get();
            if (cVar != null) {
                cVar.a(bVar);
            }
        }
    }
}
