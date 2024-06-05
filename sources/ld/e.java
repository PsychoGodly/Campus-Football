package ld;

import dd.a;
import dd.j1;
import dd.k;
import dd.n1;
import dd.q;
import dd.r0;
import dd.x;
import dd.y0;
import io.grpc.internal.e2;
import io.grpc.internal.l2;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import r6.o;
import s6.p;

/* compiled from: OutlierDetectionLoadBalancer */
public final class e extends r0 {
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final a.c<b> f36150k = a.c.a("addressTrackerKey");

    /* renamed from: c  reason: collision with root package name */
    final c f36151c = new c();

    /* renamed from: d  reason: collision with root package name */
    private final n1 f36152d;

    /* renamed from: e  reason: collision with root package name */
    private final r0.d f36153e;

    /* renamed from: f  reason: collision with root package name */
    private final d f36154f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public l2 f36155g;

    /* renamed from: h  reason: collision with root package name */
    private final ScheduledExecutorService f36156h;

    /* renamed from: i  reason: collision with root package name */
    private n1.d f36157i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public Long f36158j;

    /* compiled from: OutlierDetectionLoadBalancer */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        private g f36159a;

        /* renamed from: b  reason: collision with root package name */
        private volatile a f36160b = new a();

        /* renamed from: c  reason: collision with root package name */
        private a f36161c = new a();
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public Long f36162d;

        /* renamed from: e  reason: collision with root package name */
        private int f36163e;

        /* renamed from: f  reason: collision with root package name */
        private final Set<i> f36164f = new HashSet();

        /* compiled from: OutlierDetectionLoadBalancer */
        private static class a {

            /* renamed from: a  reason: collision with root package name */
            AtomicLong f36165a;

            /* renamed from: b  reason: collision with root package name */
            AtomicLong f36166b;

            private a() {
                this.f36165a = new AtomicLong();
                this.f36166b = new AtomicLong();
            }

            /* access modifiers changed from: package-private */
            public void a() {
                this.f36165a.set(0);
                this.f36166b.set(0);
            }
        }

        b(g gVar) {
            this.f36159a = gVar;
        }

        /* access modifiers changed from: package-private */
        public boolean b(i iVar) {
            if (m() && !iVar.n()) {
                iVar.m();
            } else if (!m() && iVar.n()) {
                iVar.p();
            }
            iVar.o(this);
            return this.f36164f.add(iVar);
        }

        /* access modifiers changed from: package-private */
        public void c() {
            int i10 = this.f36163e;
            this.f36163e = i10 == 0 ? 0 : i10 - 1;
        }

        /* access modifiers changed from: package-private */
        public void d(long j10) {
            this.f36162d = Long.valueOf(j10);
            this.f36163e++;
            for (i m10 : this.f36164f) {
                m10.m();
            }
        }

        /* access modifiers changed from: package-private */
        public double e() {
            return ((double) this.f36161c.f36166b.get()) / ((double) f());
        }

        /* access modifiers changed from: package-private */
        public long f() {
            return this.f36161c.f36165a.get() + this.f36161c.f36166b.get();
        }

        /* access modifiers changed from: package-private */
        public void g(boolean z10) {
            g gVar = this.f36159a;
            if (gVar.f36177e != null || gVar.f36178f != null) {
                if (z10) {
                    this.f36160b.f36165a.getAndIncrement();
                } else {
                    this.f36160b.f36166b.getAndIncrement();
                }
            }
        }

        public boolean h(long j10) {
            return j10 > this.f36162d.longValue() + Math.min(this.f36159a.f36174b.longValue() * ((long) this.f36163e), Math.max(this.f36159a.f36174b.longValue(), this.f36159a.f36175c.longValue()));
        }

        /* access modifiers changed from: package-private */
        public boolean i(i iVar) {
            iVar.l();
            return this.f36164f.remove(iVar);
        }

        /* access modifiers changed from: package-private */
        public void j() {
            this.f36160b.a();
            this.f36161c.a();
        }

        /* access modifiers changed from: package-private */
        public void k() {
            this.f36163e = 0;
        }

        /* access modifiers changed from: package-private */
        public void l(g gVar) {
            this.f36159a = gVar;
        }

        /* access modifiers changed from: package-private */
        public boolean m() {
            return this.f36162d != null;
        }

        /* access modifiers changed from: package-private */
        public double n() {
            return ((double) this.f36161c.f36165a.get()) / ((double) f());
        }

        /* access modifiers changed from: package-private */
        public void o() {
            this.f36161c.a();
            a aVar = this.f36160b;
            this.f36160b = this.f36161c;
            this.f36161c = aVar;
        }

        /* access modifiers changed from: package-private */
        public void p() {
            o.v(this.f36162d != null, "not currently ejected");
            this.f36162d = null;
            for (i p10 : this.f36164f) {
                p10.p();
            }
        }
    }

    /* compiled from: OutlierDetectionLoadBalancer */
    static class c extends p<SocketAddress, b> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<SocketAddress, b> f36167a = new HashMap();

        c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Map<SocketAddress, b> a() {
            return this.f36167a;
        }

        /* access modifiers changed from: package-private */
        public void g() {
            for (b next : this.f36167a.values()) {
                if (next.m()) {
                    next.p();
                }
                next.k();
            }
        }

        /* access modifiers changed from: package-private */
        public double h() {
            if (this.f36167a.isEmpty()) {
                return 0.0d;
            }
            int i10 = 0;
            int i11 = 0;
            for (b m10 : this.f36167a.values()) {
                i11++;
                if (m10.m()) {
                    i10++;
                }
            }
            return (((double) i10) / ((double) i11)) * 100.0d;
        }

        /* access modifiers changed from: package-private */
        public void i(Long l10) {
            for (b next : this.f36167a.values()) {
                if (!next.m()) {
                    next.c();
                }
                if (next.m() && next.h(l10.longValue())) {
                    next.p();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void j(g gVar, Collection<SocketAddress> collection) {
            for (SocketAddress next : collection) {
                if (!this.f36167a.containsKey(next)) {
                    this.f36167a.put(next, new b(gVar));
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void k() {
            for (b j10 : this.f36167a.values()) {
                j10.j();
            }
        }

        /* access modifiers changed from: package-private */
        public void l() {
            for (b o10 : this.f36167a.values()) {
                o10.o();
            }
        }

        /* access modifiers changed from: package-private */
        public void m(g gVar) {
            for (b l10 : this.f36167a.values()) {
                l10.l(gVar);
            }
        }
    }

    /* compiled from: OutlierDetectionLoadBalancer */
    class d extends b {

        /* renamed from: a  reason: collision with root package name */
        private r0.d f36168a;

        d(r0.d dVar) {
            this.f36168a = dVar;
        }

        public r0.h a(r0.b bVar) {
            i iVar = new i(this.f36168a.a(bVar));
            List<x> a10 = bVar.a();
            if (e.m(a10) && e.this.f36151c.containsKey(a10.get(0).a().get(0))) {
                b bVar2 = (b) e.this.f36151c.get(a10.get(0).a().get(0));
                bVar2.b(iVar);
                if (bVar2.f36162d != null) {
                    iVar.m();
                }
            }
            return iVar;
        }

        public void f(dd.p pVar, r0.i iVar) {
            this.f36168a.f(pVar, new h(iVar));
        }

        /* access modifiers changed from: protected */
        public r0.d g() {
            return this.f36168a;
        }
    }

    /* renamed from: ld.e$e  reason: collision with other inner class name */
    /* compiled from: OutlierDetectionLoadBalancer */
    class C0416e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        g f36170a;

        C0416e(g gVar) {
            this.f36170a = gVar;
        }

        public void run() {
            e eVar = e.this;
            Long unused = eVar.f36158j = Long.valueOf(eVar.f36155g.a());
            e.this.f36151c.l();
            for (j a10 : f.a(this.f36170a)) {
                e eVar2 = e.this;
                a10.a(eVar2.f36151c, eVar2.f36158j.longValue());
            }
            e eVar3 = e.this;
            eVar3.f36151c.i(eVar3.f36158j);
        }
    }

    /* compiled from: OutlierDetectionLoadBalancer */
    static class f implements j {

        /* renamed from: a  reason: collision with root package name */
        private final g f36172a;

        f(g gVar) {
            this.f36172a = gVar;
        }

        public void a(c cVar, long j10) {
            List<b> l10 = e.n(cVar, this.f36172a.f36178f.f36190d.intValue());
            if (l10.size() >= this.f36172a.f36178f.f36189c.intValue() && l10.size() != 0) {
                for (b bVar : l10) {
                    if (cVar.h() < ((double) this.f36172a.f36176d.intValue())) {
                        if (bVar.f() >= ((long) this.f36172a.f36178f.f36190d.intValue())) {
                            if (bVar.e() > ((double) this.f36172a.f36178f.f36187a.intValue()) / 100.0d && new Random().nextInt(100) < this.f36172a.f36178f.f36188b.intValue()) {
                                bVar.d(j10);
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* compiled from: OutlierDetectionLoadBalancer */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final Long f36173a;

        /* renamed from: b  reason: collision with root package name */
        public final Long f36174b;

        /* renamed from: c  reason: collision with root package name */
        public final Long f36175c;

        /* renamed from: d  reason: collision with root package name */
        public final Integer f36176d;

        /* renamed from: e  reason: collision with root package name */
        public final c f36177e;

        /* renamed from: f  reason: collision with root package name */
        public final b f36178f;

        /* renamed from: g  reason: collision with root package name */
        public final e2.b f36179g;

        /* compiled from: OutlierDetectionLoadBalancer */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            Long f36180a = 10000000000L;

            /* renamed from: b  reason: collision with root package name */
            Long f36181b = 30000000000L;

            /* renamed from: c  reason: collision with root package name */
            Long f36182c = 30000000000L;

            /* renamed from: d  reason: collision with root package name */
            Integer f36183d = 10;

            /* renamed from: e  reason: collision with root package name */
            c f36184e;

            /* renamed from: f  reason: collision with root package name */
            b f36185f;

            /* renamed from: g  reason: collision with root package name */
            e2.b f36186g;

            public g a() {
                o.u(this.f36186g != null);
                return new g(this.f36180a, this.f36181b, this.f36182c, this.f36183d, this.f36184e, this.f36185f, this.f36186g);
            }

            public a b(Long l10) {
                o.d(l10 != null);
                this.f36181b = l10;
                return this;
            }

            public a c(e2.b bVar) {
                o.u(bVar != null);
                this.f36186g = bVar;
                return this;
            }

            public a d(b bVar) {
                this.f36185f = bVar;
                return this;
            }

            public a e(Long l10) {
                o.d(l10 != null);
                this.f36180a = l10;
                return this;
            }

            public a f(Integer num) {
                o.d(num != null);
                this.f36183d = num;
                return this;
            }

            public a g(Long l10) {
                o.d(l10 != null);
                this.f36182c = l10;
                return this;
            }

            public a h(c cVar) {
                this.f36184e = cVar;
                return this;
            }
        }

        /* compiled from: OutlierDetectionLoadBalancer */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public final Integer f36187a;

            /* renamed from: b  reason: collision with root package name */
            public final Integer f36188b;

            /* renamed from: c  reason: collision with root package name */
            public final Integer f36189c;

            /* renamed from: d  reason: collision with root package name */
            public final Integer f36190d;

            /* compiled from: OutlierDetectionLoadBalancer */
            public static class a {

                /* renamed from: a  reason: collision with root package name */
                Integer f36191a = 85;

                /* renamed from: b  reason: collision with root package name */
                Integer f36192b = 100;

                /* renamed from: c  reason: collision with root package name */
                Integer f36193c = 5;

                /* renamed from: d  reason: collision with root package name */
                Integer f36194d = 50;

                public b a() {
                    return new b(this.f36191a, this.f36192b, this.f36193c, this.f36194d);
                }

                public a b(Integer num) {
                    boolean z10 = true;
                    o.d(num != null);
                    if (num.intValue() < 0 || num.intValue() > 100) {
                        z10 = false;
                    }
                    o.d(z10);
                    this.f36192b = num;
                    return this;
                }

                public a c(Integer num) {
                    boolean z10 = true;
                    o.d(num != null);
                    if (num.intValue() < 0) {
                        z10 = false;
                    }
                    o.d(z10);
                    this.f36193c = num;
                    return this;
                }

                public a d(Integer num) {
                    boolean z10 = true;
                    o.d(num != null);
                    if (num.intValue() < 0) {
                        z10 = false;
                    }
                    o.d(z10);
                    this.f36194d = num;
                    return this;
                }

                public a e(Integer num) {
                    boolean z10 = true;
                    o.d(num != null);
                    if (num.intValue() < 0 || num.intValue() > 100) {
                        z10 = false;
                    }
                    o.d(z10);
                    this.f36191a = num;
                    return this;
                }
            }

            b(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f36187a = num;
                this.f36188b = num2;
                this.f36189c = num3;
                this.f36190d = num4;
            }
        }

        /* compiled from: OutlierDetectionLoadBalancer */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public final Integer f36195a;

            /* renamed from: b  reason: collision with root package name */
            public final Integer f36196b;

            /* renamed from: c  reason: collision with root package name */
            public final Integer f36197c;

            /* renamed from: d  reason: collision with root package name */
            public final Integer f36198d;

            /* compiled from: OutlierDetectionLoadBalancer */
            public static final class a {

                /* renamed from: a  reason: collision with root package name */
                Integer f36199a = 1900;

                /* renamed from: b  reason: collision with root package name */
                Integer f36200b = 100;

                /* renamed from: c  reason: collision with root package name */
                Integer f36201c = 5;

                /* renamed from: d  reason: collision with root package name */
                Integer f36202d = 100;

                public c a() {
                    return new c(this.f36199a, this.f36200b, this.f36201c, this.f36202d);
                }

                public a b(Integer num) {
                    boolean z10 = true;
                    o.d(num != null);
                    if (num.intValue() < 0 || num.intValue() > 100) {
                        z10 = false;
                    }
                    o.d(z10);
                    this.f36200b = num;
                    return this;
                }

                public a c(Integer num) {
                    boolean z10 = true;
                    o.d(num != null);
                    if (num.intValue() < 0) {
                        z10 = false;
                    }
                    o.d(z10);
                    this.f36201c = num;
                    return this;
                }

                public a d(Integer num) {
                    boolean z10 = true;
                    o.d(num != null);
                    if (num.intValue() < 0) {
                        z10 = false;
                    }
                    o.d(z10);
                    this.f36202d = num;
                    return this;
                }

                public a e(Integer num) {
                    o.d(num != null);
                    this.f36199a = num;
                    return this;
                }
            }

            c(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f36195a = num;
                this.f36196b = num2;
                this.f36197c = num3;
                this.f36198d = num4;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return (this.f36177e == null && this.f36178f == null) ? false : true;
        }

        private g(Long l10, Long l11, Long l12, Integer num, c cVar, b bVar, e2.b bVar2) {
            this.f36173a = l10;
            this.f36174b = l11;
            this.f36175c = l12;
            this.f36176d = num;
            this.f36177e = cVar;
            this.f36178f = bVar;
            this.f36179g = bVar2;
        }
    }

    /* compiled from: OutlierDetectionLoadBalancer */
    class h extends r0.i {

        /* renamed from: a  reason: collision with root package name */
        private final r0.i f36203a;

        /* compiled from: OutlierDetectionLoadBalancer */
        class a extends dd.k {

            /* renamed from: a  reason: collision with root package name */
            b f36205a;

            public a(b bVar) {
                this.f36205a = bVar;
            }

            public void i(j1 j1Var) {
                this.f36205a.g(j1Var.o());
            }
        }

        /* compiled from: OutlierDetectionLoadBalancer */
        class b extends k.a {

            /* renamed from: a  reason: collision with root package name */
            private final b f36207a;

            b(b bVar) {
                this.f36207a = bVar;
            }

            public dd.k a(k.b bVar, y0 y0Var) {
                return new a(this.f36207a);
            }
        }

        h(r0.i iVar) {
            this.f36203a = iVar;
        }

        public r0.e a(r0.f fVar) {
            r0.e a10 = this.f36203a.a(fVar);
            r0.h c10 = a10.c();
            return c10 != null ? r0.e.i(c10, new b((b) c10.c().b(e.f36150k))) : a10;
        }
    }

    /* compiled from: OutlierDetectionLoadBalancer */
    class i extends c {

        /* renamed from: a  reason: collision with root package name */
        private final r0.h f36209a;

        /* renamed from: b  reason: collision with root package name */
        private b f36210b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public boolean f36211c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public q f36212d;

        /* renamed from: e  reason: collision with root package name */
        private r0.j f36213e;

        /* compiled from: OutlierDetectionLoadBalancer */
        class a implements r0.j {

            /* renamed from: a  reason: collision with root package name */
            private final r0.j f36215a;

            a(r0.j jVar) {
                this.f36215a = jVar;
            }

            public void a(q qVar) {
                q unused = i.this.f36212d = qVar;
                if (!i.this.f36211c) {
                    this.f36215a.a(qVar);
                }
            }
        }

        i(r0.h hVar) {
            this.f36209a = hVar;
        }

        public dd.a c() {
            if (this.f36210b != null) {
                return this.f36209a.c().d().d(e.f36150k, this.f36210b).a();
            }
            return this.f36209a.c();
        }

        public void g(r0.j jVar) {
            this.f36213e = jVar;
            super.g(new a(jVar));
        }

        public void h(List<x> list) {
            if (e.m(b()) && e.m(list)) {
                if (e.this.f36151c.containsValue(this.f36210b)) {
                    this.f36210b.i(this);
                }
                SocketAddress socketAddress = list.get(0).a().get(0);
                if (e.this.f36151c.containsKey(socketAddress)) {
                    ((b) e.this.f36151c.get(socketAddress)).b(this);
                }
            } else if (!e.m(b()) || e.m(list)) {
                if (!e.m(b()) && e.m(list)) {
                    SocketAddress socketAddress2 = list.get(0).a().get(0);
                    if (e.this.f36151c.containsKey(socketAddress2)) {
                        ((b) e.this.f36151c.get(socketAddress2)).b(this);
                    }
                }
            } else if (e.this.f36151c.containsKey(a().a().get(0))) {
                b bVar = (b) e.this.f36151c.get(a().a().get(0));
                bVar.i(this);
                bVar.j();
            }
            this.f36209a.h(list);
        }

        /* access modifiers changed from: protected */
        public r0.h i() {
            return this.f36209a;
        }

        /* access modifiers changed from: package-private */
        public void l() {
            this.f36210b = null;
        }

        /* access modifiers changed from: package-private */
        public void m() {
            this.f36211c = true;
            this.f36213e.a(q.b(j1.f32248u));
        }

        /* access modifiers changed from: package-private */
        public boolean n() {
            return this.f36211c;
        }

        /* access modifiers changed from: package-private */
        public void o(b bVar) {
            this.f36210b = bVar;
        }

        /* access modifiers changed from: package-private */
        public void p() {
            this.f36211c = false;
            q qVar = this.f36212d;
            if (qVar != null) {
                this.f36213e.a(qVar);
            }
        }
    }

    /* compiled from: OutlierDetectionLoadBalancer */
    interface j {
        void a(c cVar, long j10);
    }

    /* compiled from: OutlierDetectionLoadBalancer */
    static class k implements j {

        /* renamed from: a  reason: collision with root package name */
        private final g f36217a;

        k(g gVar) {
            o.e(gVar.f36177e != null, "success rate ejection config is null");
            this.f36217a = gVar;
        }

        static double b(Collection<Double> collection) {
            double d10 = 0.0d;
            for (Double doubleValue : collection) {
                d10 += doubleValue.doubleValue();
            }
            return d10 / ((double) collection.size());
        }

        static double c(Collection<Double> collection, double d10) {
            double d11 = 0.0d;
            for (Double doubleValue : collection) {
                double doubleValue2 = doubleValue.doubleValue() - d10;
                d11 += doubleValue2 * doubleValue2;
            }
            return Math.sqrt(d11 / ((double) collection.size()));
        }

        public void a(c cVar, long j10) {
            List<b> l10 = e.n(cVar, this.f36217a.f36177e.f36198d.intValue());
            if (l10.size() >= this.f36217a.f36177e.f36197c.intValue() && l10.size() != 0) {
                ArrayList arrayList = new ArrayList();
                for (b n10 : l10) {
                    arrayList.add(Double.valueOf(n10.n()));
                }
                double b10 = b(arrayList);
                double c10 = b10 - (c(arrayList, b10) * ((double) (((float) this.f36217a.f36177e.f36195a.intValue()) / 1000.0f)));
                for (b bVar : l10) {
                    if (cVar.h() < ((double) this.f36217a.f36176d.intValue())) {
                        if (bVar.n() < c10 && new Random().nextInt(100) < this.f36217a.f36177e.f36196b.intValue()) {
                            bVar.d(j10);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public e(r0.d dVar, l2 l2Var) {
        d dVar2 = new d((r0.d) o.p(dVar, "helper"));
        this.f36153e = dVar2;
        this.f36154f = new d(dVar2);
        this.f36152d = (n1) o.p(dVar.d(), "syncContext");
        this.f36156h = (ScheduledExecutorService) o.p(dVar.c(), "timeService");
        this.f36155g = l2Var;
    }

    /* access modifiers changed from: private */
    public static boolean m(List<x> list) {
        int i10 = 0;
        for (x a10 : list) {
            i10 += a10.a().size();
            if (i10 > 1) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static List<b> n(c cVar, int i10) {
        ArrayList arrayList = new ArrayList();
        for (b bVar : cVar.values()) {
            if (bVar.f() >= ((long) i10)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public boolean a(r0.g gVar) {
        Long l10;
        g gVar2 = (g) gVar.c();
        ArrayList arrayList = new ArrayList();
        for (x a10 : gVar.a()) {
            arrayList.addAll(a10.a());
        }
        this.f36151c.keySet().retainAll(arrayList);
        this.f36151c.m(gVar2);
        this.f36151c.j(gVar2, arrayList);
        this.f36154f.r(gVar2.f36179g.b());
        if (gVar2.a()) {
            if (this.f36158j == null) {
                l10 = gVar2.f36173a;
            } else {
                l10 = Long.valueOf(Math.max(0, gVar2.f36173a.longValue() - (this.f36155g.a() - this.f36158j.longValue())));
            }
            n1.d dVar = this.f36157i;
            if (dVar != null) {
                dVar.a();
                this.f36151c.k();
            }
            this.f36157i = this.f36152d.d(new C0416e(gVar2), l10.longValue(), gVar2.f36173a.longValue(), TimeUnit.NANOSECONDS, this.f36156h);
        } else {
            n1.d dVar2 = this.f36157i;
            if (dVar2 != null) {
                dVar2.a();
                this.f36158j = null;
                this.f36151c.g();
            }
        }
        this.f36154f.d(gVar.e().d(gVar2.f36179g.a()).a());
        return true;
    }

    public void c(j1 j1Var) {
        this.f36154f.c(j1Var);
    }

    public void f() {
        this.f36154f.f();
    }
}
