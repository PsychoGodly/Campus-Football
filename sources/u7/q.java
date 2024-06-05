package u7;

import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@AutoValue
/* compiled from: FieldIndex */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public static b f30625a = b.a(0, a.f30627a);

    /* renamed from: b  reason: collision with root package name */
    public static final Comparator<q> f30626b = o.f38736a;

    @AutoValue
    /* compiled from: FieldIndex */
    public static abstract class a implements Comparable<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f30627a = d(w.f30653b, l.d(), -1);

        /* renamed from: b  reason: collision with root package name */
        public static final Comparator<s> f30628b = p.f38737a;

        public static a d(w wVar, l lVar, int i10) {
            return new b(wVar, lVar, i10);
        }

        public static a e(w wVar, int i10) {
            y6.q qVar;
            long d10 = wVar.c().d();
            int c10 = wVar.c().c() + 1;
            if (((double) c10) == 1.0E9d) {
                qVar = new y6.q(d10 + 1, 0);
            } else {
                qVar = new y6.q(d10, c10);
            }
            return d(new w(qVar), l.d(), i10);
        }

        public static a f(i iVar) {
            return d(iVar.f(), iVar.getKey(), -1);
        }

        /* renamed from: c */
        public int compareTo(a aVar) {
            int a10 = i().compareTo(aVar.i());
            if (a10 != 0) {
                return a10;
            }
            int c10 = g().compareTo(aVar.g());
            if (c10 != 0) {
                return c10;
            }
            return Integer.compare(h(), aVar.h());
        }

        public abstract l g();

        public abstract int h();

        public abstract w i();
    }

    @AutoValue
    /* compiled from: FieldIndex */
    public static abstract class b {
        public static b a(long j10, a aVar) {
            return new c(j10, aVar);
        }

        public static b b(long j10, w wVar, l lVar, int i10) {
            return a(j10, a.d(wVar, lVar, i10));
        }

        public abstract a c();

        public abstract long d();
    }

    @AutoValue
    /* compiled from: FieldIndex */
    public static abstract class c implements Comparable<c> {

        /* compiled from: FieldIndex */
        public enum a {
            ASCENDING,
            DESCENDING,
            CONTAINS
        }

        public static c c(r rVar, a aVar) {
            return new d(rVar, aVar);
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            int e10 = d().compareTo(cVar.d());
            if (e10 != 0) {
                return e10;
            }
            return e().compareTo(cVar.e());
        }

        public abstract r d();

        public abstract a e();
    }

    public static q b(int i10, String str, List<c> list, b bVar) {
        return new a(i10, str, list, bVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int i(q qVar, q qVar2) {
        int compareTo = qVar.d().compareTo(qVar2.d());
        if (compareTo != 0) {
            return compareTo;
        }
        Iterator<c> it = qVar.h().iterator();
        Iterator<c> it2 = qVar2.h().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int a10 = it.next().compareTo(it2.next());
            if (a10 != 0) {
                return a10;
            }
        }
        return Boolean.compare(it.hasNext(), it2.hasNext());
    }

    public c c() {
        for (c next : h()) {
            if (next.e().equals(c.a.CONTAINS)) {
                return next;
            }
        }
        return null;
    }

    public abstract String d();

    public List<c> e() {
        ArrayList arrayList = new ArrayList();
        for (c next : h()) {
            if (!next.e().equals(c.a.CONTAINS)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public abstract int f();

    public abstract b g();

    public abstract List<c> h();
}
