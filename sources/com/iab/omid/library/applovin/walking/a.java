package com.iab.omid.library.applovin.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.applovin.internal.c;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<View, String> f27450a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<View, C0287a> f27451b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, View> f27452c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<View> f27453d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<String> f27454e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashSet<String> f27455f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, String> f27456g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private final Map<View, Boolean> f27457h = new WeakHashMap();

    /* renamed from: i  reason: collision with root package name */
    private boolean f27458i;

    /* renamed from: com.iab.omid.library.applovin.walking.a$a  reason: collision with other inner class name */
    public static class C0287a {

        /* renamed from: a  reason: collision with root package name */
        private final e f27459a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<String> f27460b = new ArrayList<>();

        public C0287a(e eVar, String str) {
            this.f27459a = eVar;
            a(str);
        }

        public e a() {
            return this.f27459a;
        }

        public ArrayList<String> b() {
            return this.f27460b;
        }

        public void a(String str) {
            this.f27460b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f27457h.remove(view);
            return Boolean.FALSE;
        } else if (this.f27457h.containsKey(view)) {
            return this.f27457h.get(view);
        } else {
            Map<View, Boolean> map = this.f27457h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    public View a(String str) {
        return this.f27452c.get(str);
    }

    public C0287a c(View view) {
        C0287a aVar = this.f27451b.get(view);
        if (aVar != null) {
            this.f27451b.remove(view);
        }
        return aVar;
    }

    public String d(View view) {
        if (this.f27450a.size() == 0) {
            return null;
        }
        String str = this.f27450a.get(view);
        if (str != null) {
            this.f27450a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        if (this.f27453d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f27458i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f27457h.containsKey(view)) {
            return true;
        }
        this.f27457h.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view) {
        if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (b(view).booleanValue()) {
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
        this.f27453d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f27456g.get(str);
    }

    public HashSet<String> c() {
        return this.f27454e;
    }

    public void d() {
        this.f27458i = true;
    }

    public void e() {
        c c10 = c.c();
        if (c10 != null) {
            for (com.iab.omid.library.applovin.adsession.a next : c10.a()) {
                View c11 = next.c();
                if (next.f()) {
                    String adSessionId = next.getAdSessionId();
                    if (c11 != null) {
                        String a10 = a(c11);
                        if (a10 == null) {
                            this.f27454e.add(adSessionId);
                            this.f27450a.put(c11, adSessionId);
                            a(next);
                        } else if (a10 != "noWindowFocus") {
                            this.f27455f.add(adSessionId);
                            this.f27452c.put(adSessionId, c11);
                            this.f27456g.put(adSessionId, a10);
                        }
                    } else {
                        this.f27455f.add(adSessionId);
                        this.f27456g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f27450a.clear();
        this.f27451b.clear();
        this.f27452c.clear();
        this.f27453d.clear();
        this.f27454e.clear();
        this.f27455f.clear();
        this.f27456g.clear();
        this.f27458i = false;
    }

    public HashSet<String> b() {
        return this.f27455f;
    }

    private void a(com.iab.omid.library.applovin.adsession.a aVar) {
        for (e a10 : aVar.d()) {
            a(a10, aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.applovin.adsession.a aVar) {
        View view = (View) eVar.c().get();
        if (view != null) {
            C0287a aVar2 = this.f27451b.get(view);
            if (aVar2 != null) {
                aVar2.a(aVar.getAdSessionId());
            } else {
                this.f27451b.put(view, new C0287a(eVar, aVar.getAdSessionId()));
            }
        }
    }
}
