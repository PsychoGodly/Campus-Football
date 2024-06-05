package x9;

import android.view.View;
import ba.b;
import ba.c;
import ca.g;
import fa.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import z9.e;
import z9.h;

public class o extends b {

    /* renamed from: l  reason: collision with root package name */
    private static final Pattern f31279l = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a  reason: collision with root package name */
    private final d f31280a;

    /* renamed from: b  reason: collision with root package name */
    private final c f31281b;

    /* renamed from: c  reason: collision with root package name */
    private final List<e> f31282c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private a f31283d;

    /* renamed from: e  reason: collision with root package name */
    private ba.a f31284e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f31285f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f31286g = false;

    /* renamed from: h  reason: collision with root package name */
    private final String f31287h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f31288i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f31289j;

    /* renamed from: k  reason: collision with root package name */
    private m f31290k;

    o(c cVar, d dVar) {
        this.f31281b = cVar;
        this.f31280a = dVar;
        String uuid = UUID.randomUUID().toString();
        this.f31287h = uuid;
        k((View) null);
        this.f31284e = (dVar.c() == e.HTML || dVar.c() == e.JAVASCRIPT) ? new b(uuid, dVar.j()) : new c(uuid, dVar.f(), dVar.g());
        this.f31284e.t();
        z9.c.e().b(this);
        this.f31284e.h(cVar);
    }

    private void e() {
        if (this.f31288i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void g() {
        if (this.f31289j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void i(View view) {
        Collection<o> c10 = z9.c.e().c();
        if (c10 != null && !c10.isEmpty()) {
            for (o next : c10) {
                if (next != this && next.h() == view) {
                    next.f31283d.clear();
                }
            }
        }
    }

    private void k(View view) {
        this.f31283d = new a(view);
    }

    public void b() {
        if (!this.f31286g) {
            this.f31283d.clear();
            u();
            this.f31286g = true;
            p().p();
            z9.c.e().d(this);
            p().l();
            this.f31284e = null;
            this.f31290k = null;
        }
    }

    public void c(View view) {
        if (!this.f31286g) {
            g.b(view, "AdView is null");
            if (h() != view) {
                k(view);
                p().a();
                i(view);
            }
        }
    }

    public void d() {
        if (!this.f31285f) {
            this.f31285f = true;
            z9.c.e().f(this);
            this.f31284e.b(h.d().c());
            this.f31284e.e(z9.a.a().c());
            this.f31284e.i(this, this.f31280a);
        }
    }

    public void f(List<a> list) {
        if (l()) {
            ArrayList arrayList = new ArrayList();
            for (a aVar : list) {
                View view = (View) aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f31290k.onPossibleObstructionsDetected(this.f31287h, arrayList);
        }
    }

    public View h() {
        return (View) this.f31283d.get();
    }

    public List<e> j() {
        return this.f31282c;
    }

    public boolean l() {
        return this.f31290k != null;
    }

    public boolean m() {
        return this.f31285f && !this.f31286g;
    }

    public boolean n() {
        return this.f31286g;
    }

    public String o() {
        return this.f31287h;
    }

    public ba.a p() {
        return this.f31284e;
    }

    public boolean q() {
        return this.f31281b.b();
    }

    public boolean r() {
        return this.f31285f;
    }

    /* access modifiers changed from: package-private */
    public void s() {
        e();
        p().q();
        this.f31288i = true;
    }

    /* access modifiers changed from: package-private */
    public void t() {
        g();
        p().s();
        this.f31289j = true;
    }

    public void u() {
        if (!this.f31286g) {
            this.f31282c.clear();
        }
    }
}
