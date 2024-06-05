package io.flutter.plugins.googlemobileads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import n4.g;

/* compiled from: FlutterAdRequest */
class l {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f34027a;

    /* renamed from: b  reason: collision with root package name */
    private final String f34028b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f34029c;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f34030d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f34031e;

    /* renamed from: f  reason: collision with root package name */
    private final String f34032f;

    /* renamed from: g  reason: collision with root package name */
    private final j0 f34033g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, String> f34034h;

    /* renamed from: i  reason: collision with root package name */
    private final String f34035i;

    /* compiled from: FlutterAdRequest */
    protected static class a {

        /* renamed from: a  reason: collision with root package name */
        private List<String> f34036a;

        /* renamed from: b  reason: collision with root package name */
        private String f34037b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f34038c;

        /* renamed from: d  reason: collision with root package name */
        private List<String> f34039d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f34040e;

        /* renamed from: f  reason: collision with root package name */
        private String f34041f;

        /* renamed from: g  reason: collision with root package name */
        private j0 f34042g;

        /* renamed from: h  reason: collision with root package name */
        private Map<String, String> f34043h;

        /* renamed from: i  reason: collision with root package name */
        private String f34044i;

        protected a() {
        }

        /* access modifiers changed from: package-private */
        public l a() {
            return new l(this.f34036a, this.f34037b, this.f34038c, this.f34039d, this.f34040e, this.f34041f, this.f34042g, this.f34043h, this.f34044i);
        }

        /* access modifiers changed from: protected */
        public Map<String, String> b() {
            return this.f34043h;
        }

        /* access modifiers changed from: protected */
        public String c() {
            return this.f34037b;
        }

        /* access modifiers changed from: protected */
        public Integer d() {
            return this.f34040e;
        }

        /* access modifiers changed from: protected */
        public List<String> e() {
            return this.f34036a;
        }

        /* access modifiers changed from: protected */
        public String f() {
            return this.f34041f;
        }

        /* access modifiers changed from: protected */
        public j0 g() {
            return this.f34042g;
        }

        /* access modifiers changed from: protected */
        public List<String> h() {
            return this.f34039d;
        }

        /* access modifiers changed from: protected */
        public Boolean i() {
            return this.f34038c;
        }

        /* access modifiers changed from: protected */
        public String j() {
            return this.f34044i;
        }

        /* access modifiers changed from: package-private */
        public a k(Map<String, String> map) {
            this.f34043h = map;
            return this;
        }

        /* access modifiers changed from: package-private */
        public a l(String str) {
            this.f34037b = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public a m(Integer num) {
            this.f34040e = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        public a n(List<String> list) {
            this.f34036a = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        public a o(String str) {
            this.f34041f = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public a p(j0 j0Var) {
            this.f34042g = j0Var;
            return this;
        }

        /* access modifiers changed from: package-private */
        public a q(List<String> list) {
            this.f34039d = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        public a r(Boolean bool) {
            this.f34038c = bool;
            return this;
        }

        /* access modifiers changed from: package-private */
        public a s(String str) {
            this.f34044i = str;
            return this;
        }
    }

    protected l(List<String> list, String str, Boolean bool, List<String> list2, Integer num, String str2, j0 j0Var, Map<String, String> map, String str3) {
        this.f34027a = list;
        this.f34028b = str;
        this.f34029c = bool;
        this.f34030d = list2;
        this.f34031e = num;
        this.f34032f = str2;
        this.f34033g = j0Var;
        this.f34034h = map;
        this.f34035i = str3;
    }

    private void a(g.a aVar, String str) {
        Class<AdMobAdapter> cls = AdMobAdapter.class;
        HashMap hashMap = new HashMap();
        j0 j0Var = this.f34033g;
        if (j0Var != null) {
            hashMap.putAll(j0Var.a(str, this.f34032f));
        }
        Map<String, String> map = this.f34034h;
        if (map != null && !map.isEmpty()) {
            Bundle bundle = new Bundle();
            for (Map.Entry next : this.f34034h.entrySet()) {
                bundle.putString((String) next.getKey(), (String) next.getValue());
            }
            hashMap.put(cls, bundle);
        }
        Boolean bool = this.f34029c;
        if (bool != null && bool.booleanValue()) {
            Bundle bundle2 = (Bundle) hashMap.get(cls);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("npa", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            hashMap.put(cls, bundle2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            aVar.b((Class) entry.getKey(), (Bundle) entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    public g b(String str) {
        return j(new g.a(), str).c();
    }

    /* access modifiers changed from: protected */
    public Map<String, String> c() {
        return this.f34034h;
    }

    /* access modifiers changed from: protected */
    public String d() {
        return this.f34028b;
    }

    /* access modifiers changed from: protected */
    public Integer e() {
        return this.f34031e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!Objects.equals(this.f34027a, lVar.f34027a) || !Objects.equals(this.f34028b, lVar.f34028b) || !Objects.equals(this.f34029c, lVar.f34029c) || !Objects.equals(this.f34030d, lVar.f34030d) || !Objects.equals(this.f34031e, lVar.f34031e) || !Objects.equals(this.f34032f, lVar.f34032f) || !Objects.equals(this.f34033g, lVar.f34033g) || !Objects.equals(this.f34034h, lVar.f34034h)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public List<String> f() {
        return this.f34027a;
    }

    /* access modifiers changed from: protected */
    public String g() {
        return this.f34032f;
    }

    /* access modifiers changed from: protected */
    public List<String> h() {
        return this.f34030d;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f34027a, this.f34028b, this.f34029c, this.f34030d, this.f34031e, this.f34032f, this.f34033g});
    }

    /* access modifiers changed from: protected */
    public Boolean i() {
        return this.f34029c;
    }

    /* access modifiers changed from: protected */
    public g.a j(g.a aVar, String str) {
        List<String> list = this.f34027a;
        if (list != null) {
            for (String a10 : list) {
                aVar.a(a10);
            }
        }
        String str2 = this.f34028b;
        if (str2 != null) {
            aVar.e(str2);
        }
        a(aVar, str);
        List<String> list2 = this.f34030d;
        if (list2 != null) {
            aVar.g(list2);
        }
        Integer num = this.f34031e;
        if (num != null) {
            aVar.f(num.intValue());
        }
        aVar.h(this.f34035i);
        return aVar;
    }
}
