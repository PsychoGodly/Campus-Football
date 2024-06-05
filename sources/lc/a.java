package lc;

import java.nio.ByteBuffer;
import lc.c;

/* compiled from: BasicMessageChannel */
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final c f36092a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f36093b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final i<T> f36094c;

    /* renamed from: d  reason: collision with root package name */
    private final c.C0412c f36095d;

    /* compiled from: BasicMessageChannel */
    private final class b implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private final d<T> f36096a;

        /* renamed from: lc.a$b$a  reason: collision with other inner class name */
        /* compiled from: BasicMessageChannel */
        class C0411a implements e<T> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c.b f36098a;

            C0411a(c.b bVar) {
                this.f36098a = bVar;
            }

            public void a(T t10) {
                this.f36098a.a(a.this.f36094c.a(t10));
            }
        }

        public void a(ByteBuffer byteBuffer, c.b bVar) {
            try {
                this.f36096a.a(a.this.f36094c.b(byteBuffer), new C0411a(bVar));
            } catch (RuntimeException e10) {
                xb.b.c("BasicMessageChannel#" + a.this.f36093b, "Failed to handle message", e10);
                bVar.a((ByteBuffer) null);
            }
        }

        private b(d<T> dVar) {
            this.f36096a = dVar;
        }
    }

    /* compiled from: BasicMessageChannel */
    private final class c implements c.b {

        /* renamed from: a  reason: collision with root package name */
        private final e<T> f36100a;

        public void a(ByteBuffer byteBuffer) {
            try {
                this.f36100a.a(a.this.f36094c.b(byteBuffer));
            } catch (RuntimeException e10) {
                xb.b.c("BasicMessageChannel#" + a.this.f36093b, "Failed to handle message reply", e10);
            }
        }

        private c(e<T> eVar) {
            this.f36100a = eVar;
        }
    }

    /* compiled from: BasicMessageChannel */
    public interface d<T> {
        void a(T t10, e<T> eVar);
    }

    /* compiled from: BasicMessageChannel */
    public interface e<T> {
        void a(T t10);
    }

    public a(c cVar, String str, i<T> iVar) {
        this(cVar, str, iVar, (c.C0412c) null);
    }

    public void c(T t10) {
        d(t10, (e) null);
    }

    public void d(T t10, e<T> eVar) {
        c cVar = this.f36092a;
        String str = this.f36093b;
        ByteBuffer a10 = this.f36094c.a(t10);
        c cVar2 = null;
        if (eVar != null) {
            cVar2 = new c(eVar);
        }
        cVar.d(str, a10, cVar2);
    }

    public void e(d<T> dVar) {
        b bVar = null;
        if (this.f36095d != null) {
            c cVar = this.f36092a;
            String str = this.f36093b;
            if (dVar != null) {
                bVar = new b(dVar);
            }
            cVar.e(str, bVar, this.f36095d);
            return;
        }
        c cVar2 = this.f36092a;
        String str2 = this.f36093b;
        if (dVar != null) {
            bVar = new b(dVar);
        }
        cVar2.i(str2, bVar);
    }

    public a(c cVar, String str, i<T> iVar, c.C0412c cVar2) {
        this.f36092a = cVar;
        this.f36093b = str;
        this.f36094c = iVar;
        this.f36095d = cVar2;
    }
}
