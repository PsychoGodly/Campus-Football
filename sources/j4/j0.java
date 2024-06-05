package j4;

import android.net.Uri;
import j4.h0;
import j4.p;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import k4.n0;
import p3.q;

/* compiled from: ParsingLoadable */
public final class j0<T> implements h0.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f19351a;

    /* renamed from: b  reason: collision with root package name */
    public final p f19352b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19353c;

    /* renamed from: d  reason: collision with root package name */
    private final o0 f19354d;

    /* renamed from: e  reason: collision with root package name */
    private final a<? extends T> f19355e;

    /* renamed from: f  reason: collision with root package name */
    private volatile T f19356f;

    /* compiled from: ParsingLoadable */
    public interface a<T> {
        T a(Uri uri, InputStream inputStream) throws IOException;
    }

    public j0(l lVar, Uri uri, int i10, a<? extends T> aVar) {
        this(lVar, new p.b().i(uri).b(1).a(), i10, aVar);
    }

    public final void a() throws IOException {
        this.f19354d.t();
        n nVar = new n(this.f19354d, this.f19352b);
        try {
            nVar.i();
            this.f19356f = this.f19355e.a((Uri) k4.a.e(this.f19354d.o()), nVar);
        } finally {
            n0.n(nVar);
        }
    }

    public long b() {
        return this.f19354d.q();
    }

    public final void c() {
    }

    public Map<String, List<String>> d() {
        return this.f19354d.s();
    }

    public final T e() {
        return this.f19356f;
    }

    public Uri f() {
        return this.f19354d.r();
    }

    public j0(l lVar, p pVar, int i10, a<? extends T> aVar) {
        this.f19354d = new o0(lVar);
        this.f19352b = pVar;
        this.f19353c = i10;
        this.f19355e = aVar;
        this.f19351a = q.a();
    }
}
