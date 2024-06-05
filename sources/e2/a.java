package e2;

import b2.l;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n7.d;

/* compiled from: ClientMetrics */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    private static final a f17754e = new C0183a().b();

    /* renamed from: a  reason: collision with root package name */
    private final f f17755a;

    /* renamed from: b  reason: collision with root package name */
    private final List<d> f17756b;

    /* renamed from: c  reason: collision with root package name */
    private final b f17757c;

    /* renamed from: d  reason: collision with root package name */
    private final String f17758d;

    /* renamed from: e2.a$a  reason: collision with other inner class name */
    /* compiled from: ClientMetrics */
    public static final class C0183a {

        /* renamed from: a  reason: collision with root package name */
        private f f17759a = null;

        /* renamed from: b  reason: collision with root package name */
        private List<d> f17760b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private b f17761c = null;

        /* renamed from: d  reason: collision with root package name */
        private String f17762d = MaxReward.DEFAULT_LABEL;

        C0183a() {
        }

        public C0183a a(d dVar) {
            this.f17760b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f17759a, Collections.unmodifiableList(this.f17760b), this.f17761c, this.f17762d);
        }

        public C0183a c(String str) {
            this.f17762d = str;
            return this;
        }

        public C0183a d(b bVar) {
            this.f17761c = bVar;
            return this;
        }

        public C0183a e(f fVar) {
            this.f17759a = fVar;
            return this;
        }
    }

    a(f fVar, List<d> list, b bVar, String str) {
        this.f17755a = fVar;
        this.f17756b = list;
        this.f17757c = bVar;
        this.f17758d = str;
    }

    public static C0183a e() {
        return new C0183a();
    }

    @d(tag = 4)
    public String a() {
        return this.f17758d;
    }

    @d(tag = 3)
    public b b() {
        return this.f17757c;
    }

    @d(tag = 2)
    public List<d> c() {
        return this.f17756b;
    }

    @d(tag = 1)
    public f d() {
        return this.f17755a;
    }

    public byte[] f() {
        return l.a(this);
    }
}
