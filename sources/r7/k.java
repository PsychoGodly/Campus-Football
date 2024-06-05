package r7;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u7.i;

/* compiled from: CompositeFilter */
public class k extends q {

    /* renamed from: a  reason: collision with root package name */
    private final List<q> f29932a;

    /* renamed from: b  reason: collision with root package name */
    private final a f29933b;

    /* renamed from: c  reason: collision with root package name */
    private List<p> f29934c;

    /* compiled from: CompositeFilter */
    public enum a {
        AND("and"),
        OR("or");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f29938a;

        private a(String str) {
            this.f29938a = str;
        }

        public String toString() {
            return this.f29938a;
        }
    }

    public k(List<q> list, a aVar) {
        this.f29932a = new ArrayList(list);
        this.f29933b = aVar;
    }

    public String a() {
        StringBuilder sb2 = new StringBuilder();
        if (i()) {
            for (q a10 : this.f29932a) {
                sb2.append(a10.a());
            }
            return sb2.toString();
        }
        sb2.append(this.f29933b.toString() + "(");
        sb2.append(TextUtils.join(",", this.f29932a));
        sb2.append(")");
        return sb2.toString();
    }

    public List<q> b() {
        return Collections.unmodifiableList(this.f29932a);
    }

    public List<p> c() {
        List<p> list = this.f29934c;
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        this.f29934c = new ArrayList();
        for (q c10 : this.f29932a) {
            this.f29934c.addAll(c10.c());
        }
        return Collections.unmodifiableList(this.f29934c);
    }

    public boolean d(i iVar) {
        if (f()) {
            for (q d10 : this.f29932a) {
                if (!d10.d(iVar)) {
                    return false;
                }
            }
            return true;
        }
        for (q d11 : this.f29932a) {
            if (d11.d(iVar)) {
                return true;
            }
        }
        return false;
    }

    public a e() {
        return this.f29933b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f29933b != kVar.f29933b || !this.f29932a.equals(kVar.f29932a)) {
            return false;
        }
        return true;
    }

    public boolean f() {
        return this.f29933b == a.AND;
    }

    public boolean g() {
        return this.f29933b == a.OR;
    }

    public boolean h() {
        for (q qVar : this.f29932a) {
            if (qVar instanceof k) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((1147 + this.f29933b.hashCode()) * 31) + this.f29932a.hashCode();
    }

    public boolean i() {
        return h() && f();
    }

    public k j(List<q> list) {
        ArrayList arrayList = new ArrayList(this.f29932a);
        arrayList.addAll(list);
        return new k(arrayList, this.f29933b);
    }

    public String toString() {
        return a();
    }
}
