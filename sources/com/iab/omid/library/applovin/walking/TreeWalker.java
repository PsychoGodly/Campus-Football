package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.applovin.processor.a;
import com.iab.omid.library.applovin.utils.f;
import com.iab.omid.library.applovin.utils.h;
import com.iab.omid.library.applovin.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements a.C0285a {

    /* renamed from: i  reason: collision with root package name */
    private static TreeWalker f27436i = new TreeWalker();

    /* renamed from: j  reason: collision with root package name */
    private static Handler f27437j = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static Handler f27438k = null;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final Runnable f27439l = new b();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final Runnable f27440m = new c();

    /* renamed from: a  reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f27441a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private int f27442b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f27443c = false;

    /* renamed from: d  reason: collision with root package name */
    private final List<com.iab.omid.library.applovin.weakreference.a> f27444d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private com.iab.omid.library.applovin.processor.b f27445e = new com.iab.omid.library.applovin.processor.b();

    /* renamed from: f  reason: collision with root package name */
    private a f27446f = new a();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public b f27447g = new b(new com.iab.omid.library.applovin.walking.async.c());

    /* renamed from: h  reason: collision with root package name */
    private long f27448h;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            TreeWalker.this.f27447g.b();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            TreeWalker.getInstance().l();
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            if (TreeWalker.f27438k != null) {
                TreeWalker.f27438k.post(TreeWalker.f27439l);
                TreeWalker.f27438k.postDelayed(TreeWalker.f27440m, 200);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f27448h);
    }

    private void e() {
        this.f27442b = 0;
        this.f27444d.clear();
        this.f27443c = false;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().e()) {
                    this.f27443c = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.f27448h = f.b();
    }

    public static TreeWalker getInstance() {
        return f27436i;
    }

    private void i() {
        if (f27438k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f27438k = handler;
            handler.post(f27439l);
            f27438k.postDelayed(f27440m, 200);
        }
    }

    private void k() {
        Handler handler = f27438k;
        if (handler != null) {
            handler.removeCallbacks(f27440m);
            f27438k = null;
        }
    }

    /* access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f27441a.contains(treeWalkerTimeLogger)) {
            this.f27441a.add(treeWalkerTimeLogger);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f27446f.e();
        long b10 = f.b();
        com.iab.omid.library.applovin.processor.a a10 = this.f27445e.a();
        if (this.f27446f.b().size() > 0) {
            Iterator<String> it = this.f27446f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a11 = a10.a((View) null);
                a(next, this.f27446f.a(next), a11);
                com.iab.omid.library.applovin.utils.c.b(a11);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f27447g.a(a11, hashSet, b10);
            }
        }
        if (this.f27446f.c().size() > 0) {
            JSONObject a12 = a10.a((View) null);
            a((View) null, a10, a12, c.PARENT_VIEW, false);
            com.iab.omid.library.applovin.utils.c.b(a12);
            this.f27447g.b(a12, this.f27446f.c(), b10);
            if (this.f27443c) {
                for (com.iab.omid.library.applovin.adsession.a a13 : com.iab.omid.library.applovin.internal.c.c().a()) {
                    a13.a(this.f27444d);
                }
            }
        } else {
            this.f27447g.b();
        }
        this.f27446f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f27441a.clear();
        f27437j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f27441a.contains(treeWalkerTimeLogger)) {
            this.f27441a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f27441a.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f27441a) {
                next.onTreeProcessed(this.f27442b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f27442b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String d10 = this.f27446f.d(view);
        if (d10 == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, d10);
        com.iab.omid.library.applovin.utils.c.a(jSONObject, Boolean.valueOf(this.f27446f.f(view)));
        this.f27446f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == c.PARENT_VIEW, z10);
    }

    public void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, boolean z10) {
        c e10;
        if (h.d(view) && (e10 = this.f27446f.e(view)) != c.UNDERLYING_VIEW) {
            JSONObject a10 = aVar.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, a10);
            if (!b(view, a10)) {
                boolean z11 = z10 || a(view, a10);
                if (this.f27443c && e10 == c.OBSTRUCTION_VIEW && !z11) {
                    this.f27444d.add(new com.iab.omid.library.applovin.weakreference.a(view));
                }
                a(view, aVar, a10, e10, z11);
            }
            this.f27442b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.applovin.processor.a b10 = this.f27445e.b();
        String b11 = this.f27446f.b(str);
        if (b11 != null) {
            JSONObject a10 = b10.a(view);
            com.iab.omid.library.applovin.utils.c.a(a10, str);
            com.iab.omid.library.applovin.utils.c.b(a10, b11);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, a10);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0287a c10 = this.f27446f.c(view);
        if (c10 == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, c10);
        return true;
    }
}
