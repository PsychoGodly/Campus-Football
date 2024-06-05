package lc;

import java.nio.ByteBuffer;
import lc.c;

/* compiled from: MethodChannel */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final c f36118a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f36119b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final l f36120c;

    /* renamed from: d  reason: collision with root package name */
    private final c.C0412c f36121d;

    /* compiled from: MethodChannel */
    private final class a implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private final c f36122a;

        /* renamed from: lc.k$a$a  reason: collision with other inner class name */
        /* compiled from: MethodChannel */
        class C0414a implements d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c.b f36124a;

            C0414a(c.b bVar) {
                this.f36124a = bVar;
            }

            public void error(String str, String str2, Object obj) {
                this.f36124a.a(k.this.f36120c.e(str, str2, obj));
            }

            public void notImplemented() {
                this.f36124a.a((ByteBuffer) null);
            }

            public void success(Object obj) {
                this.f36124a.a(k.this.f36120c.c(obj));
            }
        }

        a(c cVar) {
            this.f36122a = cVar;
        }

        public void a(ByteBuffer byteBuffer, c.b bVar) {
            try {
                this.f36122a.onMethodCall(k.this.f36120c.a(byteBuffer), new C0414a(bVar));
            } catch (RuntimeException e10) {
                xb.b.c("MethodChannel#" + k.this.f36119b, "Failed to handle method call", e10);
                bVar.a(k.this.f36120c.d("error", e10.getMessage(), (Object) null, xb.b.d(e10)));
            }
        }
    }

    /* compiled from: MethodChannel */
    private final class b implements c.b {

        /* renamed from: a  reason: collision with root package name */
        private final d f36126a;

        b(d dVar) {
            this.f36126a = dVar;
        }

        public void a(ByteBuffer byteBuffer) {
            if (byteBuffer == null) {
                try {
                    this.f36126a.notImplemented();
                } catch (RuntimeException e10) {
                    xb.b.c("MethodChannel#" + k.this.f36119b, "Failed to handle method call result", e10);
                }
            } else {
                try {
                    this.f36126a.success(k.this.f36120c.f(byteBuffer));
                } catch (e e11) {
                    this.f36126a.error(e11.f36112a, e11.getMessage(), e11.f36113b);
                }
            }
        }
    }

    /* compiled from: MethodChannel */
    public interface c {
        void onMethodCall(j jVar, d dVar);
    }

    /* compiled from: MethodChannel */
    public interface d {
        void error(String str, String str2, Object obj);

        void notImplemented();

        void success(Object obj);
    }

    public k(c cVar, String str) {
        this(cVar, str, s.f36131b);
    }

    public void c(String str, Object obj) {
        d(str, obj, (d) null);
    }

    public void d(String str, Object obj, d dVar) {
        b bVar;
        c cVar = this.f36118a;
        String str2 = this.f36119b;
        ByteBuffer b10 = this.f36120c.b(new j(str, obj));
        if (dVar == null) {
            bVar = null;
        } else {
            bVar = new b(dVar);
        }
        cVar.d(str2, b10, bVar);
    }

    public void e(c cVar) {
        a aVar = null;
        if (this.f36121d != null) {
            c cVar2 = this.f36118a;
            String str = this.f36119b;
            if (cVar != null) {
                aVar = new a(cVar);
            }
            cVar2.e(str, aVar, this.f36121d);
            return;
        }
        c cVar3 = this.f36118a;
        String str2 = this.f36119b;
        if (cVar != null) {
            aVar = new a(cVar);
        }
        cVar3.i(str2, aVar);
    }

    public k(c cVar, String str, l lVar) {
        this(cVar, str, lVar, (c.C0412c) null);
    }

    public k(c cVar, String str, l lVar, c.C0412c cVar2) {
        this.f36118a = cVar;
        this.f36119b = str;
        this.f36120c = lVar;
        this.f36121d = cVar2;
    }
}
