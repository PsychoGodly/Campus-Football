package q7;

import com.google.firebase.firestore.i0;
import g7.c;
import g7.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import u7.i;
import u7.j;
import u7.l;
import u7.s;
import y7.x;

/* compiled from: BundleLoader */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final a f29678a;

    /* renamed from: b  reason: collision with root package name */
    private final e f29679b;

    /* renamed from: c  reason: collision with root package name */
    private final List<j> f29680c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final Map<l, h> f29681d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private c<l, s> f29682e = j.b();

    /* renamed from: f  reason: collision with root package name */
    private long f29683f;

    /* renamed from: g  reason: collision with root package name */
    private h f29684g;

    public d(a aVar, e eVar) {
        this.f29678a = aVar;
        this.f29679b = eVar;
    }

    private Map<String, e<l>> c() {
        HashMap hashMap = new HashMap();
        for (j b10 : this.f29680c) {
            hashMap.put(b10.b(), l.e());
        }
        for (h next : this.f29681d.values()) {
            for (String next2 : next.c()) {
                hashMap.put(next2, ((e) hashMap.get(next2)).e(next.b()));
            }
        }
        return hashMap;
    }

    public i0 a(c cVar, long j10) {
        x.a(!(cVar instanceof e), "Unexpected bundle metadata element.", new Object[0]);
        int size = this.f29682e.size();
        if (cVar instanceof j) {
            this.f29680c.add((j) cVar);
        } else if (cVar instanceof h) {
            h hVar = (h) cVar;
            this.f29681d.put(hVar.b(), hVar);
            this.f29684g = hVar;
            if (!hVar.a()) {
                this.f29682e = this.f29682e.h(hVar.b(), s.p(hVar.b(), hVar.d()).t(hVar.d()));
                this.f29684g = null;
            }
        } else if (cVar instanceof b) {
            b bVar = (b) cVar;
            if (this.f29684g == null || !bVar.b().equals(this.f29684g.b())) {
                throw new IllegalArgumentException("The document being added does not match the stored metadata.");
            }
            this.f29682e = this.f29682e.h(bVar.b(), bVar.a().t(this.f29684g.d()));
            this.f29684g = null;
        }
        this.f29683f += j10;
        if (size != this.f29682e.size()) {
            return new i0(this.f29682e.size(), this.f29679b.e(), this.f29683f, this.f29679b.d(), (Exception) null, i0.a.RUNNING);
        }
        return null;
    }

    public c<l, i> b() {
        x.a(this.f29684g == null, "Bundled documents end with a document metadata element instead of a document.", new Object[0]);
        x.a(this.f29679b.a() != null, "Bundle ID must be set", new Object[0]);
        x.a(this.f29682e.size() == this.f29679b.e(), "Expected %s documents, but loaded %s.", Integer.valueOf(this.f29679b.e()), Integer.valueOf(this.f29682e.size()));
        c<l, i> c10 = this.f29678a.c(this.f29682e, this.f29679b.a());
        Map<String, e<l>> c11 = c();
        for (j next : this.f29680c) {
            this.f29678a.a(next, c11.get(next.b()));
        }
        this.f29678a.b(this.f29679b);
        return c10;
    }
}
