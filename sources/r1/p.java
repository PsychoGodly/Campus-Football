package r1;

import androidx.work.e;
import androidx.work.t;
import androidx.work.y;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: WorkSpec */
public final class p {

    /* renamed from: s  reason: collision with root package name */
    private static final String f21924s = androidx.work.p.f("WorkSpec");

    /* renamed from: t  reason: collision with root package name */
    public static final n.a<List<c>, List<y>> f21925t = new a();

    /* renamed from: a  reason: collision with root package name */
    public String f21926a;

    /* renamed from: b  reason: collision with root package name */
    public y.a f21927b = y.a.ENQUEUED;

    /* renamed from: c  reason: collision with root package name */
    public String f21928c;

    /* renamed from: d  reason: collision with root package name */
    public String f21929d;

    /* renamed from: e  reason: collision with root package name */
    public e f21930e;

    /* renamed from: f  reason: collision with root package name */
    public e f21931f;

    /* renamed from: g  reason: collision with root package name */
    public long f21932g;

    /* renamed from: h  reason: collision with root package name */
    public long f21933h;

    /* renamed from: i  reason: collision with root package name */
    public long f21934i;

    /* renamed from: j  reason: collision with root package name */
    public androidx.work.c f21935j;

    /* renamed from: k  reason: collision with root package name */
    public int f21936k;

    /* renamed from: l  reason: collision with root package name */
    public androidx.work.a f21937l;

    /* renamed from: m  reason: collision with root package name */
    public long f21938m;

    /* renamed from: n  reason: collision with root package name */
    public long f21939n;

    /* renamed from: o  reason: collision with root package name */
    public long f21940o;

    /* renamed from: p  reason: collision with root package name */
    public long f21941p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f21942q;

    /* renamed from: r  reason: collision with root package name */
    public t f21943r;

    /* compiled from: WorkSpec */
    class a implements n.a<List<c>, List<y>> {
        a() {
        }

        /* renamed from: a */
        public List<y> apply(List<c> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (c a10 : list) {
                arrayList.add(a10.a());
            }
            return arrayList;
        }
    }

    /* compiled from: WorkSpec */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f21944a;

        /* renamed from: b  reason: collision with root package name */
        public y.a f21945b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f21945b != bVar.f21945b) {
                return false;
            }
            return this.f21944a.equals(bVar.f21944a);
        }

        public int hashCode() {
            return (this.f21944a.hashCode() * 31) + this.f21945b.hashCode();
        }
    }

    /* compiled from: WorkSpec */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f21946a;

        /* renamed from: b  reason: collision with root package name */
        public y.a f21947b;

        /* renamed from: c  reason: collision with root package name */
        public e f21948c;

        /* renamed from: d  reason: collision with root package name */
        public int f21949d;

        /* renamed from: e  reason: collision with root package name */
        public List<String> f21950e;

        /* renamed from: f  reason: collision with root package name */
        public List<e> f21951f;

        public y a() {
            e eVar;
            List<e> list = this.f21951f;
            if (list == null || list.isEmpty()) {
                eVar = e.f5166c;
            } else {
                eVar = this.f21951f.get(0);
            }
            return new y(UUID.fromString(this.f21946a), this.f21947b, this.f21948c, this.f21950e, eVar, this.f21949d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f21949d != cVar.f21949d) {
                return false;
            }
            String str = this.f21946a;
            if (str == null ? cVar.f21946a != null : !str.equals(cVar.f21946a)) {
                return false;
            }
            if (this.f21947b != cVar.f21947b) {
                return false;
            }
            e eVar = this.f21948c;
            if (eVar == null ? cVar.f21948c != null : !eVar.equals(cVar.f21948c)) {
                return false;
            }
            List<String> list = this.f21950e;
            if (list == null ? cVar.f21950e != null : !list.equals(cVar.f21950e)) {
                return false;
            }
            List<e> list2 = this.f21951f;
            List<e> list3 = cVar.f21951f;
            if (list2 != null) {
                return list2.equals(list3);
            }
            if (list3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f21946a;
            int i10 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            y.a aVar = this.f21947b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            e eVar = this.f21948c;
            int hashCode3 = (((hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.f21949d) * 31;
            List<String> list = this.f21950e;
            int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<e> list2 = this.f21951f;
            if (list2 != null) {
                i10 = list2.hashCode();
            }
            return hashCode4 + i10;
        }
    }

    public p(String str, String str2) {
        e eVar = e.f5166c;
        this.f21930e = eVar;
        this.f21931f = eVar;
        this.f21935j = androidx.work.c.f5145i;
        this.f21937l = androidx.work.a.EXPONENTIAL;
        this.f21938m = 30000;
        this.f21941p = -1;
        this.f21943r = t.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f21926a = str;
        this.f21928c = str2;
    }

    public long a() {
        long j10;
        boolean z10 = false;
        if (c()) {
            if (this.f21937l == androidx.work.a.LINEAR) {
                z10 = true;
            }
            if (z10) {
                j10 = this.f21938m * ((long) this.f21936k);
            } else {
                j10 = (long) Math.scalb((float) this.f21938m, this.f21936k - 1);
            }
            return this.f21939n + Math.min(18000000, j10);
        }
        long j11 = 0;
        if (d()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j12 = this.f21939n;
            long j13 = j12 == 0 ? currentTimeMillis + this.f21932g : j12;
            long j14 = this.f21934i;
            long j15 = this.f21933h;
            if (j14 != j15) {
                z10 = true;
            }
            if (z10) {
                if (j12 == 0) {
                    j11 = j14 * -1;
                }
                return j13 + j15 + j11;
            }
            if (j12 != 0) {
                j11 = j15;
            }
            return j13 + j11;
        }
        long j16 = this.f21939n;
        if (j16 == 0) {
            j16 = System.currentTimeMillis();
        }
        return j16 + this.f21932g;
    }

    public boolean b() {
        return !androidx.work.c.f5145i.equals(this.f21935j);
    }

    public boolean c() {
        return this.f21927b == y.a.ENQUEUED && this.f21936k > 0;
    }

    public boolean d() {
        return this.f21933h != 0;
    }

    public void e(long j10) {
        if (j10 > 18000000) {
            androidx.work.p.c().h(f21924s, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            j10 = 18000000;
        }
        if (j10 < UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
            androidx.work.p.c().h(f21924s, "Backoff delay duration less than minimum value", new Throwable[0]);
            j10 = 10000;
        }
        this.f21938m = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f21932g != pVar.f21932g || this.f21933h != pVar.f21933h || this.f21934i != pVar.f21934i || this.f21936k != pVar.f21936k || this.f21938m != pVar.f21938m || this.f21939n != pVar.f21939n || this.f21940o != pVar.f21940o || this.f21941p != pVar.f21941p || this.f21942q != pVar.f21942q || !this.f21926a.equals(pVar.f21926a) || this.f21927b != pVar.f21927b || !this.f21928c.equals(pVar.f21928c)) {
            return false;
        }
        String str = this.f21929d;
        if (str == null ? pVar.f21929d != null : !str.equals(pVar.f21929d)) {
            return false;
        }
        if (this.f21930e.equals(pVar.f21930e) && this.f21931f.equals(pVar.f21931f) && this.f21935j.equals(pVar.f21935j) && this.f21937l == pVar.f21937l && this.f21943r == pVar.f21943r) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f21926a.hashCode() * 31) + this.f21927b.hashCode()) * 31) + this.f21928c.hashCode()) * 31;
        String str = this.f21929d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j10 = this.f21932g;
        long j11 = this.f21933h;
        long j12 = this.f21934i;
        long j13 = this.f21938m;
        long j14 = this.f21939n;
        long j15 = this.f21940o;
        long j16 = this.f21941p;
        return ((((((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.f21930e.hashCode()) * 31) + this.f21931f.hashCode()) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f21935j.hashCode()) * 31) + this.f21936k) * 31) + this.f21937l.hashCode()) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31) + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f21942q ? 1 : 0)) * 31) + this.f21943r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f21926a + "}";
    }

    public p(p pVar) {
        e eVar = e.f5166c;
        this.f21930e = eVar;
        this.f21931f = eVar;
        this.f21935j = androidx.work.c.f5145i;
        this.f21937l = androidx.work.a.EXPONENTIAL;
        this.f21938m = 30000;
        this.f21941p = -1;
        this.f21943r = t.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f21926a = pVar.f21926a;
        this.f21928c = pVar.f21928c;
        this.f21927b = pVar.f21927b;
        this.f21929d = pVar.f21929d;
        this.f21930e = new e(pVar.f21930e);
        this.f21931f = new e(pVar.f21931f);
        this.f21932g = pVar.f21932g;
        this.f21933h = pVar.f21933h;
        this.f21934i = pVar.f21934i;
        this.f21935j = new androidx.work.c(pVar.f21935j);
        this.f21936k = pVar.f21936k;
        this.f21937l = pVar.f21937l;
        this.f21938m = pVar.f21938m;
        this.f21939n = pVar.f21939n;
        this.f21940o = pVar.f21940o;
        this.f21941p = pVar.f21941p;
        this.f21942q = pVar.f21942q;
        this.f21943r = pVar.f21943r;
    }
}
