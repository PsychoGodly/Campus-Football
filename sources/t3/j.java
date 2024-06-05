package t3;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import n2.r1;
import s3.f;
import s6.u;
import t3.k;

/* compiled from: Representation */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public final long f22635a;

    /* renamed from: b  reason: collision with root package name */
    public final r1 f22636b;

    /* renamed from: c  reason: collision with root package name */
    public final u<b> f22637c;

    /* renamed from: d  reason: collision with root package name */
    public final long f22638d;

    /* renamed from: e  reason: collision with root package name */
    public final List<e> f22639e;

    /* renamed from: f  reason: collision with root package name */
    public final List<e> f22640f;

    /* renamed from: g  reason: collision with root package name */
    public final List<e> f22641g;

    /* renamed from: h  reason: collision with root package name */
    private final i f22642h;

    /* compiled from: Representation */
    public static class b extends j implements f {

        /* renamed from: i  reason: collision with root package name */
        final k.a f22643i;

        public b(long j10, r1 r1Var, List<b> list, k.a aVar, List<e> list2, List<e> list3, List<e> list4) {
            super(j10, r1Var, list, aVar, list2, list3, list4);
            this.f22643i = aVar;
        }

        public long a(long j10) {
            return this.f22643i.j(j10);
        }

        public long b(long j10, long j11) {
            return this.f22643i.h(j10, j11);
        }

        public long c(long j10, long j11) {
            return this.f22643i.d(j10, j11);
        }

        public long d(long j10, long j11) {
            return this.f22643i.f(j10, j11);
        }

        public i e(long j10) {
            return this.f22643i.k(this, j10);
        }

        public long f(long j10, long j11) {
            return this.f22643i.i(j10, j11);
        }

        public boolean g() {
            return this.f22643i.l();
        }

        public long h() {
            return this.f22643i.e();
        }

        public long i(long j10) {
            return this.f22643i.g(j10);
        }

        public long j(long j10, long j11) {
            return this.f22643i.c(j10, j11);
        }

        public String k() {
            return null;
        }

        public f l() {
            return this;
        }

        public i m() {
            return null;
        }
    }

    /* compiled from: Representation */
    public static class c extends j {

        /* renamed from: i  reason: collision with root package name */
        public final Uri f22644i;

        /* renamed from: j  reason: collision with root package name */
        public final long f22645j;

        /* renamed from: k  reason: collision with root package name */
        private final String f22646k;

        /* renamed from: l  reason: collision with root package name */
        private final i f22647l;

        /* renamed from: m  reason: collision with root package name */
        private final m f22648m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(long j10, r1 r1Var, List<b> list, k.e eVar, List<e> list2, List<e> list3, List<e> list4, String str, long j11) {
            super(j10, r1Var, list, eVar, list2, list3, list4);
            m mVar;
            List<b> list5 = list;
            this.f22644i = Uri.parse(list.get(0).f22582a);
            i c10 = eVar.c();
            this.f22647l = c10;
            this.f22646k = str;
            this.f22645j = j11;
            if (c10 != null) {
                mVar = null;
            } else {
                mVar = new m(new i((String) null, 0, j11));
            }
            this.f22648m = mVar;
        }

        public String k() {
            return this.f22646k;
        }

        public f l() {
            return this.f22648m;
        }

        public i m() {
            return this.f22647l;
        }
    }

    public static j o(long j10, r1 r1Var, List<b> list, k kVar, List<e> list2, List<e> list3, List<e> list4, String str) {
        k kVar2 = kVar;
        if (kVar2 instanceof k.e) {
            return new c(j10, r1Var, list, (k.e) kVar2, list2, list3, list4, str, -1);
        } else if (kVar2 instanceof k.a) {
            return new b(j10, r1Var, list, (k.a) kVar2, list2, list3, list4);
        } else {
            throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
        }
    }

    public abstract String k();

    public abstract f l();

    public abstract i m();

    public i n() {
        return this.f22642h;
    }

    private j(long j10, r1 r1Var, List<b> list, k kVar, List<e> list2, List<e> list3, List<e> list4) {
        List<e> list5;
        k4.a.a(!list.isEmpty());
        this.f22635a = j10;
        this.f22636b = r1Var;
        this.f22637c = u.u(list);
        if (list2 == null) {
            list5 = Collections.emptyList();
        } else {
            list5 = Collections.unmodifiableList(list2);
        }
        this.f22639e = list5;
        this.f22640f = list3;
        this.f22641g = list4;
        this.f22642h = kVar.a(this);
        this.f22638d = kVar.b();
    }
}
