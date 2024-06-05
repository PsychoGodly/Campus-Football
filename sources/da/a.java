package da;

import aa.a;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import ca.f;
import ca.h;
import da.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import x9.o;

public class a implements a.C0256a {

    /* renamed from: i  reason: collision with root package name */
    private static a f28703i = new a();

    /* renamed from: j  reason: collision with root package name */
    private static Handler f28704j = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static Handler f28705k = null;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final Runnable f28706l = new d();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final Runnable f28707m = new e();

    /* renamed from: a  reason: collision with root package name */
    private List<b> f28708a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private int f28709b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f28710c = false;

    /* renamed from: d  reason: collision with root package name */
    private final List<fa.a> f28711d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private aa.b f28712e = new aa.b();

    /* renamed from: f  reason: collision with root package name */
    private b f28713f = new b();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public c f28714g = new c(new ea.c());

    /* renamed from: h  reason: collision with root package name */
    private long f28715h;

    /* renamed from: da.a$a  reason: collision with other inner class name */
    public interface C0297a extends b {
        void onTreeProcessedNano(int i10, long j10);
    }

    public interface b {
        void onTreeProcessed(int i10, long j10);
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            a.this.f28714g.c();
        }
    }

    class d implements Runnable {
        d() {
        }

        public void run() {
            a.p().u();
        }
    }

    class e implements Runnable {
        e() {
        }

        public void run() {
            if (a.f28705k != null) {
                a.f28705k.post(a.f28706l);
                a.f28705k.postDelayed(a.f28707m, 200);
            }
        }
    }

    a() {
    }

    private void d(long j10) {
        if (this.f28708a.size() > 0) {
            for (b next : this.f28708a) {
                next.onTreeProcessed(this.f28709b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (next instanceof C0297a) {
                    ((C0297a) next).onTreeProcessedNano(this.f28709b, j10);
                }
            }
        }
    }

    private void e(View view, aa.a aVar, JSONObject jSONObject, d dVar, boolean z10) {
        aVar.a(view, jSONObject, this, dVar == d.PARENT_VIEW, z10);
    }

    private void f(String str, View view, JSONObject jSONObject) {
        aa.a b10 = this.f28712e.b();
        String g10 = this.f28713f.g(str);
        if (g10 != null) {
            JSONObject a10 = b10.a(view);
            ca.c.g(a10, str);
            ca.c.n(a10, g10);
            ca.c.i(jSONObject, a10);
        }
    }

    private boolean g(View view, JSONObject jSONObject) {
        b.a i10 = this.f28713f.i(view);
        if (i10 == null) {
            return false;
        }
        ca.c.e(jSONObject, i10);
        return true;
    }

    private boolean j(View view, JSONObject jSONObject) {
        String k10 = this.f28713f.k(view);
        if (k10 == null) {
            return false;
        }
        ca.c.g(jSONObject, k10);
        ca.c.f(jSONObject, Boolean.valueOf(this.f28713f.o(view)));
        this.f28713f.l();
        return true;
    }

    private void l() {
        d(f.b() - this.f28715h);
    }

    private void m() {
        this.f28709b = 0;
        this.f28711d.clear();
        this.f28710c = false;
        Iterator<o> it = z9.c.e().a().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().l()) {
                    this.f28710c = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.f28715h = f.b();
    }

    public static a p() {
        return f28703i;
    }

    private void r() {
        if (f28705k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f28705k = handler;
            handler.post(f28706l);
            f28705k.postDelayed(f28707m, 200);
        }
    }

    private void t() {
        Handler handler = f28705k;
        if (handler != null) {
            handler.removeCallbacks(f28707m);
            f28705k = null;
        }
    }

    /* access modifiers changed from: private */
    public void u() {
        m();
        n();
        l();
    }

    public void a(View view, aa.a aVar, JSONObject jSONObject, boolean z10) {
        d m10;
        if (h.d(view) && (m10 = this.f28713f.m(view)) != d.UNDERLYING_VIEW) {
            JSONObject a10 = aVar.a(view);
            ca.c.i(jSONObject, a10);
            if (!j(view, a10)) {
                boolean z11 = z10 || g(view, a10);
                if (this.f28710c && m10 == d.OBSTRUCTION_VIEW && !z11) {
                    this.f28711d.add(new fa.a(view));
                }
                e(view, aVar, a10, m10, z11);
            }
            this.f28709b++;
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
        this.f28713f.n();
        long b10 = f.b();
        aa.a a10 = this.f28712e.a();
        if (this.f28713f.h().size() > 0) {
            Iterator<String> it = this.f28713f.h().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a11 = a10.a((View) null);
                f(next, this.f28713f.a(next), a11);
                ca.c.m(a11);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f28714g.b(a11, hashSet, b10);
            }
        }
        if (this.f28713f.j().size() > 0) {
            JSONObject a12 = a10.a((View) null);
            e((View) null, a10, a12, d.PARENT_VIEW, false);
            ca.c.m(a12);
            this.f28714g.d(a12, this.f28713f.j(), b10);
            if (this.f28710c) {
                for (o f10 : z9.c.e().a()) {
                    f10.f(this.f28711d);
                }
            }
        } else {
            this.f28714g.c();
        }
        this.f28713f.c();
    }

    public void o() {
        t();
    }

    public void q() {
        r();
    }

    public void s() {
        o();
        this.f28708a.clear();
        f28704j.post(new c());
    }
}
