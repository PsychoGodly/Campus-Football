package r1;

import androidx.room.h;
import androidx.work.e;
import c1.f;
import y0.d;

/* compiled from: WorkProgressDao_Impl */
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    private final h f21917a;

    /* renamed from: b  reason: collision with root package name */
    private final y0.a<m> f21918b;

    /* renamed from: c  reason: collision with root package name */
    private final d f21919c;

    /* renamed from: d  reason: collision with root package name */
    private final d f21920d;

    /* compiled from: WorkProgressDao_Impl */
    class a extends y0.a<m> {
        a(h hVar) {
            super(hVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void g(f fVar, m mVar) {
            String str = mVar.f21915a;
            if (str == null) {
                fVar.j0(1);
            } else {
                fVar.t(1, str);
            }
            byte[] n10 = e.n(mVar.f21916b);
            if (n10 == null) {
                fVar.j0(2);
            } else {
                fVar.S(2, n10);
            }
        }
    }

    /* compiled from: WorkProgressDao_Impl */
    class b extends d {
        b(h hVar) {
            super(hVar);
        }

        public String d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* compiled from: WorkProgressDao_Impl */
    class c extends d {
        c(h hVar) {
            super(hVar);
        }

        public String d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(h hVar) {
        this.f21917a = hVar;
        this.f21918b = new a(hVar);
        this.f21919c = new b(hVar);
        this.f21920d = new c(hVar);
    }

    public void a(String str) {
        this.f21917a.b();
        f a10 = this.f21919c.a();
        if (str == null) {
            a10.j0(1);
        } else {
            a10.t(1, str);
        }
        this.f21917a.c();
        try {
            a10.w();
            this.f21917a.r();
        } finally {
            this.f21917a.g();
            this.f21919c.f(a10);
        }
    }

    public void b(m mVar) {
        this.f21917a.b();
        this.f21917a.c();
        try {
            this.f21918b.h(mVar);
            this.f21917a.r();
        } finally {
            this.f21917a.g();
        }
    }

    public void c() {
        this.f21917a.b();
        f a10 = this.f21920d.a();
        this.f21917a.c();
        try {
            a10.w();
            this.f21917a.r();
        } finally {
            this.f21917a.g();
            this.f21920d.f(a10);
        }
    }
}
