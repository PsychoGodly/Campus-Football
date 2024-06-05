package io.flutter.plugins.googlemobileads;

import io.flutter.plugins.googlemobileads.l;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o4.a;

/* compiled from: FlutterAdManagerAdRequest */
class i extends l {

    /* renamed from: j  reason: collision with root package name */
    private final Map<String, String> f34005j;

    /* renamed from: k  reason: collision with root package name */
    private final Map<String, List<String>> f34006k;

    /* renamed from: l  reason: collision with root package name */
    private final String f34007l;

    /* compiled from: FlutterAdManagerAdRequest */
    static class b extends l.a {

        /* renamed from: j  reason: collision with root package name */
        private Map<String, String> f34008j;

        /* renamed from: k  reason: collision with root package name */
        private Map<String, List<String>> f34009k;

        /* renamed from: l  reason: collision with root package name */
        private String f34010l;

        b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public i a() {
            return new i(e(), c(), this.f34008j, this.f34009k, i(), h(), d(), this.f34010l, f(), g(), b(), j());
        }

        public b u(Map<String, String> map) {
            this.f34008j = map;
            return this;
        }

        public b v(Map<String, List<String>> map) {
            this.f34009k = map;
            return this;
        }

        public b w(String str) {
            this.f34010l = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!super.equals(obj) || !Objects.equals(this.f34005j, iVar.f34005j) || !Objects.equals(this.f34006k, iVar.f34006k)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f34005j, this.f34006k});
    }

    /* access modifiers changed from: package-private */
    public o4.a k(String str) {
        a.C0218a aVar = new a.C0218a();
        j(aVar, str);
        Map<String, String> map = this.f34005j;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                aVar.n((String) next.getKey(), (String) next.getValue());
            }
        }
        Map<String, List<String>> map2 = this.f34006k;
        if (map2 != null) {
            for (Map.Entry next2 : map2.entrySet()) {
                aVar.o((String) next2.getKey(), (List) next2.getValue());
            }
        }
        String str2 = this.f34007l;
        if (str2 != null) {
            aVar.q(str2);
        }
        return aVar.c();
    }

    /* access modifiers changed from: protected */
    public Map<String, String> l() {
        return this.f34005j;
    }

    /* access modifiers changed from: protected */
    public Map<String, List<String>> m() {
        return this.f34006k;
    }

    /* access modifiers changed from: protected */
    public String n() {
        return this.f34007l;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private i(List<String> list, String str, Map<String, String> map, Map<String, List<String>> map2, Boolean bool, List<String> list2, Integer num, String str2, String str3, j0 j0Var, Map<String, String> map3, String str4) {
        super(list, str, bool, list2, num, str3, j0Var, map3, str4);
        this.f34005j = map;
        this.f34006k = map2;
        this.f34007l = str2;
    }
}
