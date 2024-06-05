package j1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ProxyConfig */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private List<b> f19194a;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f19195b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f19196c;

    /* compiled from: ProxyConfig */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private List<b> f19197a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private List<String> f19198b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private boolean f19199c = false;

        private List<String> f() {
            return this.f19198b;
        }

        private List<b> h() {
            return this.f19197a;
        }

        private boolean j() {
            return this.f19199c;
        }

        public a a(String str) {
            this.f19198b.add(str);
            return this;
        }

        public a b(String str) {
            this.f19197a.add(new b(str, "direct://"));
            return this;
        }

        public a c(String str) {
            this.f19197a.add(new b(str));
            return this;
        }

        public a d(String str, String str2) {
            this.f19197a.add(new b(str2, str));
            return this;
        }

        public c e() {
            return new c(h(), f(), j());
        }

        public a g() {
            return a("<local>");
        }

        public a i() {
            return a("<-loopback>");
        }

        public a k(boolean z10) {
            this.f19199c = z10;
            return this;
        }
    }

    public c(List<b> list, List<String> list2, boolean z10) {
        this.f19194a = list;
        this.f19195b = list2;
        this.f19196c = z10;
    }

    public List<String> a() {
        return Collections.unmodifiableList(this.f19195b);
    }

    public List<b> b() {
        return Collections.unmodifiableList(this.f19194a);
    }

    public boolean c() {
        return this.f19196c;
    }

    /* compiled from: ProxyConfig */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private String f19200a;

        /* renamed from: b  reason: collision with root package name */
        private String f19201b;

        public b(String str, String str2) {
            this.f19200a = str;
            this.f19201b = str2;
        }

        public String a() {
            return this.f19200a;
        }

        public String b() {
            return this.f19201b;
        }

        public b(String str) {
            this("*", str);
        }
    }
}
