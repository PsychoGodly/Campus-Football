package z9;

import android.content.Context;
import android.os.Handler;
import da.a;
import x9.o;
import y9.b;
import y9.c;
import y9.e;
import z9.d;

public class h implements d.a, c {

    /* renamed from: f  reason: collision with root package name */
    private static h f31535f;

    /* renamed from: a  reason: collision with root package name */
    private float f31536a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    private final e f31537b;

    /* renamed from: c  reason: collision with root package name */
    private final b f31538c;

    /* renamed from: d  reason: collision with root package name */
    private y9.d f31539d;

    /* renamed from: e  reason: collision with root package name */
    private c f31540e;

    public h(e eVar, b bVar) {
        this.f31537b = eVar;
        this.f31538c = bVar;
    }

    private c a() {
        if (this.f31540e == null) {
            this.f31540e = c.e();
        }
        return this.f31540e;
    }

    public static h d() {
        if (f31535f == null) {
            f31535f = new h(new e(), new b());
        }
        return f31535f;
    }

    public void a(float f10) {
        this.f31536a = f10;
        for (o p10 : a().a()) {
            p10.p().b(f10);
        }
    }

    public void a(boolean z10) {
        if (z10) {
            a.p().q();
        } else {
            a.p().o();
        }
    }

    public void b(Context context) {
        this.f31539d = this.f31537b.a(new Handler(), context, this.f31538c.a(), this);
    }

    public float c() {
        return this.f31536a;
    }

    public void e() {
        b.k().b(this);
        b.k().i();
        a.p().q();
        this.f31539d.d();
    }

    public void f() {
        a.p().s();
        b.k().j();
        this.f31539d.e();
    }
}
