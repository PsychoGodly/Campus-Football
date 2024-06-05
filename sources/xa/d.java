package xa;

import lc.j;
import lc.k;

/* compiled from: MethodCallOperation */
public class d extends a {

    /* renamed from: a  reason: collision with root package name */
    public final a f23691a;

    /* renamed from: b  reason: collision with root package name */
    final j f23692b;

    /* compiled from: MethodCallOperation */
    class a implements f {

        /* renamed from: a  reason: collision with root package name */
        final k.d f23693a;

        a(k.d dVar) {
            this.f23693a = dVar;
        }

        public void error(String str, String str2, Object obj) {
            this.f23693a.error(str, str2, obj);
        }

        public void success(Object obj) {
            this.f23693a.success(obj);
        }
    }

    public d(j jVar, k.d dVar) {
        this.f23692b = jVar;
        this.f23691a = new a(dVar);
    }

    public <T> T a(String str) {
        return this.f23692b.a(str);
    }

    public String f() {
        return this.f23692b.f36116a;
    }

    public boolean g(String str) {
        return this.f23692b.c(str);
    }

    public f m() {
        return this.f23691a;
    }
}
