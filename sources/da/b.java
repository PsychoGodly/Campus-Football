package da;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import ca.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import x9.o;
import z9.c;
import z9.e;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<View, String> f28717a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<View, a> f28718b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, View> f28719c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<View> f28720d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<String> f28721e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashSet<String> f28722f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, String> f28723g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private final Map<View, Boolean> f28724h = new WeakHashMap();

    /* renamed from: i  reason: collision with root package name */
    private boolean f28725i;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final e f28726a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<String> f28727b = new ArrayList<>();

        public a(e eVar, String str) {
            this.f28726a = eVar;
            b(str);
        }

        public e a() {
            return this.f28726a;
        }

        public void b(String str) {
            this.f28727b.add(str);
        }

        public ArrayList<String> c() {
            return this.f28727b;
        }
    }

    private String b(View view) {
        if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (f(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String a10 = h.a(view);
            if (a10 != null) {
                return a10;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f28720d.addAll(hashSet);
        return null;
    }

    private void d(o oVar) {
        for (e e10 : oVar.j()) {
            e(e10, oVar);
        }
    }

    private void e(e eVar, o oVar) {
        View view = (View) eVar.c().get();
        if (view != null) {
            a aVar = this.f28718b.get(view);
            if (aVar != null) {
                aVar.b(oVar.o());
            } else {
                this.f28718b.put(view, new a(eVar, oVar.o()));
            }
        }
    }

    private Boolean f(View view) {
        if (view.hasWindowFocus()) {
            this.f28724h.remove(view);
            return Boolean.FALSE;
        } else if (this.f28724h.containsKey(view)) {
            return this.f28724h.get(view);
        } else {
            Map<View, Boolean> map = this.f28724h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    public View a(String str) {
        return this.f28719c.get(str);
    }

    public void c() {
        this.f28717a.clear();
        this.f28718b.clear();
        this.f28719c.clear();
        this.f28720d.clear();
        this.f28721e.clear();
        this.f28722f.clear();
        this.f28723g.clear();
        this.f28725i = false;
    }

    public String g(String str) {
        return this.f28723g.get(str);
    }

    public HashSet<String> h() {
        return this.f28722f;
    }

    public a i(View view) {
        a aVar = this.f28718b.get(view);
        if (aVar != null) {
            this.f28718b.remove(view);
        }
        return aVar;
    }

    public HashSet<String> j() {
        return this.f28721e;
    }

    public String k(View view) {
        if (this.f28717a.size() == 0) {
            return null;
        }
        String str = this.f28717a.get(view);
        if (str != null) {
            this.f28717a.remove(view);
        }
        return str;
    }

    public void l() {
        this.f28725i = true;
    }

    public d m(View view) {
        return this.f28720d.contains(view) ? d.PARENT_VIEW : this.f28725i ? d.OBSTRUCTION_VIEW : d.UNDERLYING_VIEW;
    }

    public void n() {
        c e10 = c.e();
        if (e10 != null) {
            for (o next : e10.a()) {
                View h10 = next.h();
                if (next.m()) {
                    String o10 = next.o();
                    if (h10 != null) {
                        String b10 = b(h10);
                        if (b10 == null) {
                            this.f28721e.add(o10);
                            this.f28717a.put(h10, o10);
                            d(next);
                        } else if (b10 != "noWindowFocus") {
                            this.f28722f.add(o10);
                            this.f28719c.put(o10, h10);
                            this.f28723g.put(o10, b10);
                        }
                    } else {
                        this.f28722f.add(o10);
                        this.f28723g.put(o10, "noAdView");
                    }
                }
            }
        }
    }

    public boolean o(View view) {
        if (!this.f28724h.containsKey(view)) {
            return true;
        }
        this.f28724h.put(view, Boolean.TRUE);
        return false;
    }
}
