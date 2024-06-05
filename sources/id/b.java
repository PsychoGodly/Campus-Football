package id;

import gd.e;

/* compiled from: Request */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final a f33329a;

    /* renamed from: b  reason: collision with root package name */
    private final e f33330b;

    /* renamed from: id.b$b  reason: collision with other inner class name */
    /* compiled from: Request */
    public static class C0378b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public a f33331a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public e.b f33332b = new e.b();

        public b c() {
            if (this.f33331a != null) {
                return new b(this);
            }
            throw new IllegalStateException("url == null");
        }

        public C0378b d(String str, String str2) {
            this.f33332b.f(str, str2);
            return this;
        }

        public C0378b e(a aVar) {
            if (aVar != null) {
                this.f33331a = aVar;
                return this;
            }
            throw new IllegalArgumentException("url == null");
        }
    }

    public e a() {
        return this.f33330b;
    }

    public a b() {
        return this.f33329a;
    }

    public String toString() {
        return "Request{url=" + this.f33329a + '}';
    }

    private b(C0378b bVar) {
        this.f33329a = bVar.f33331a;
        this.f33330b = bVar.f33332b.c();
    }
}
