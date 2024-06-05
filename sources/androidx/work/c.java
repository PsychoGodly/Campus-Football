package androidx.work;

import android.os.Build;

/* compiled from: Constraints */
public final class c {

    /* renamed from: i  reason: collision with root package name */
    public static final c f5145i = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private q f5146a = q.NOT_REQUIRED;

    /* renamed from: b  reason: collision with root package name */
    private boolean f5147b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5148c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5149d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5150e;

    /* renamed from: f  reason: collision with root package name */
    private long f5151f = -1;

    /* renamed from: g  reason: collision with root package name */
    private long f5152g = -1;

    /* renamed from: h  reason: collision with root package name */
    private d f5153h = new d();

    /* compiled from: Constraints */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f5154a = false;

        /* renamed from: b  reason: collision with root package name */
        boolean f5155b = false;

        /* renamed from: c  reason: collision with root package name */
        q f5156c = q.NOT_REQUIRED;

        /* renamed from: d  reason: collision with root package name */
        boolean f5157d = false;

        /* renamed from: e  reason: collision with root package name */
        boolean f5158e = false;

        /* renamed from: f  reason: collision with root package name */
        long f5159f = -1;

        /* renamed from: g  reason: collision with root package name */
        long f5160g = -1;

        /* renamed from: h  reason: collision with root package name */
        d f5161h = new d();

        public c a() {
            return new c(this);
        }

        public a b(q qVar) {
            this.f5156c = qVar;
            return this;
        }

        public a c(boolean z10) {
            this.f5158e = z10;
            return this;
        }
    }

    public c() {
    }

    public d a() {
        return this.f5153h;
    }

    public q b() {
        return this.f5146a;
    }

    public long c() {
        return this.f5151f;
    }

    public long d() {
        return this.f5152g;
    }

    public boolean e() {
        return this.f5153h.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f5147b == cVar.f5147b && this.f5148c == cVar.f5148c && this.f5149d == cVar.f5149d && this.f5150e == cVar.f5150e && this.f5151f == cVar.f5151f && this.f5152g == cVar.f5152g && this.f5146a == cVar.f5146a) {
            return this.f5153h.equals(cVar.f5153h);
        }
        return false;
    }

    public boolean f() {
        return this.f5149d;
    }

    public boolean g() {
        return this.f5147b;
    }

    public boolean h() {
        return this.f5148c;
    }

    public int hashCode() {
        long j10 = this.f5151f;
        long j11 = this.f5152g;
        return (((((((((((((this.f5146a.hashCode() * 31) + (this.f5147b ? 1 : 0)) * 31) + (this.f5148c ? 1 : 0)) * 31) + (this.f5149d ? 1 : 0)) * 31) + (this.f5150e ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f5153h.hashCode();
    }

    public boolean i() {
        return this.f5150e;
    }

    public void j(d dVar) {
        this.f5153h = dVar;
    }

    public void k(q qVar) {
        this.f5146a = qVar;
    }

    public void l(boolean z10) {
        this.f5149d = z10;
    }

    public void m(boolean z10) {
        this.f5147b = z10;
    }

    public void n(boolean z10) {
        this.f5148c = z10;
    }

    public void o(boolean z10) {
        this.f5150e = z10;
    }

    public void p(long j10) {
        this.f5151f = j10;
    }

    public void q(long j10) {
        this.f5152g = j10;
    }

    c(a aVar) {
        this.f5147b = aVar.f5154a;
        int i10 = Build.VERSION.SDK_INT;
        this.f5148c = i10 >= 23 && aVar.f5155b;
        this.f5146a = aVar.f5156c;
        this.f5149d = aVar.f5157d;
        this.f5150e = aVar.f5158e;
        if (i10 >= 24) {
            this.f5153h = aVar.f5161h;
            this.f5151f = aVar.f5159f;
            this.f5152g = aVar.f5160g;
        }
    }

    public c(c cVar) {
        this.f5147b = cVar.f5147b;
        this.f5148c = cVar.f5148c;
        this.f5146a = cVar.f5146a;
        this.f5149d = cVar.f5149d;
        this.f5150e = cVar.f5150e;
        this.f5153h = cVar.f5153h;
    }
}
