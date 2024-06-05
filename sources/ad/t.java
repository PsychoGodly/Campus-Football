package ad;

import ad.n;
import android.content.Context;
import android.os.Build;
import android.util.LongSparseArray;
import dc.a;
import io.flutter.view.f;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Objects;
import javax.net.ssl.HttpsURLConnection;
import lc.d;

/* compiled from: VideoPlayerPlugin */
public class t implements dc.a, n.a {

    /* renamed from: a  reason: collision with root package name */
    private final LongSparseArray<p> f31588a = new LongSparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private a f31589b;

    /* renamed from: c  reason: collision with root package name */
    private final q f31590c = new q();

    /* compiled from: VideoPlayerPlugin */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        final Context f31591a;

        /* renamed from: b  reason: collision with root package name */
        final lc.c f31592b;

        /* renamed from: c  reason: collision with root package name */
        final c f31593c;

        /* renamed from: d  reason: collision with root package name */
        final b f31594d;

        /* renamed from: e  reason: collision with root package name */
        final f f31595e;

        a(Context context, lc.c cVar, c cVar2, b bVar, f fVar) {
            this.f31591a = context;
            this.f31592b = cVar;
            this.f31593c = cVar2;
            this.f31594d = bVar;
            this.f31595e = fVar;
        }

        /* access modifiers changed from: package-private */
        public void a(t tVar, lc.c cVar) {
            m.x(cVar, tVar);
        }

        /* access modifiers changed from: package-private */
        public void b(lc.c cVar) {
            m.x(cVar, (n.a) null);
        }
    }

    /* compiled from: VideoPlayerPlugin */
    private interface b {
        String a(String str, String str2);
    }

    /* compiled from: VideoPlayerPlugin */
    private interface c {
        String get(String str);
    }

    private void k() {
        for (int i10 = 0; i10 < this.f31588a.size(); i10++) {
            this.f31588a.valueAt(i10).c();
        }
        this.f31588a.clear();
    }

    public n.i a(n.c cVar) {
        p pVar;
        String str;
        f.c h10 = this.f31589b.f31595e.h();
        lc.c cVar2 = this.f31589b.f31592b;
        d dVar = new d(cVar2, "flutter.io/videoPlayer/videoEvents" + h10.c());
        if (cVar.b() != null) {
            if (cVar.e() != null) {
                str = this.f31589b.f31594d.a(cVar.b(), cVar.e());
            } else {
                str = this.f31589b.f31593c.get(cVar.b());
            }
            Context context = this.f31589b.f31591a;
            pVar = new p(context, dVar, h10, "asset:///" + str, (String) null, new HashMap(), this.f31590c);
        } else {
            f.c cVar3 = h10;
            pVar = new p(this.f31589b.f31591a, dVar, cVar3, cVar.f(), cVar.c(), cVar.d(), this.f31590c);
        }
        this.f31588a.put(h10.c(), pVar);
        return new n.i.a().b(Long.valueOf(h10.c())).a();
    }

    public void b(n.g gVar) {
        this.f31588a.get(gVar.c().longValue()).l(gVar.b().doubleValue());
    }

    public void c(n.h hVar) {
        this.f31588a.get(hVar.c().longValue()).g(hVar.b().intValue());
    }

    public n.h d(n.i iVar) {
        p pVar = this.f31588a.get(iVar.b().longValue());
        n.h a10 = new n.h.a().b(Long.valueOf(pVar.d())).c(iVar.b()).a();
        pVar.h();
        return a10;
    }

    public void e(n.j jVar) {
        this.f31588a.get(jVar.b().longValue()).n(jVar.c().doubleValue());
    }

    public void f(n.i iVar) {
        this.f31588a.get(iVar.b().longValue()).e();
    }

    public void g(n.e eVar) {
        this.f31588a.get(eVar.c().longValue()).k(eVar.b().booleanValue());
    }

    public void h(n.i iVar) {
        this.f31588a.get(iVar.b().longValue()).f();
    }

    public void i(n.i iVar) {
        this.f31588a.get(iVar.b().longValue()).c();
        this.f31588a.remove(iVar.b().longValue());
    }

    public void initialize() {
        k();
    }

    public void j(n.f fVar) {
        this.f31590c.f31587a = fVar.b().booleanValue();
    }

    public void onAttachedToEngine(a.b bVar) {
        if (Build.VERSION.SDK_INT < 21) {
            try {
                HttpsURLConnection.setDefaultSSLSocketFactory(new a());
            } catch (KeyManagementException | NoSuchAlgorithmException e10) {
                xb.b.h("VideoPlayerPlugin", "Failed to enable TLSv1.1 and TLSv1.2 Protocols for API level 19 and below.\nFor more information about Socket Security, please consult the following link:\nhttps://developer.android.com/reference/javax/net/ssl/SSLSocket", e10);
            }
        }
        xb.a e11 = xb.a.e();
        Context a10 = bVar.a();
        lc.c b10 = bVar.b();
        bc.f c10 = e11.c();
        Objects.requireNonNull(c10);
        s sVar = new s(c10);
        bc.f c11 = e11.c();
        Objects.requireNonNull(c11);
        a aVar = new a(a10, b10, sVar, new r(c11), bVar.f());
        this.f31589b = aVar;
        aVar.a(this, bVar.b());
    }

    public void onDetachedFromEngine(a.b bVar) {
        if (this.f31589b == null) {
            xb.b.i("VideoPlayerPlugin", "Detached from the engine before registering to it.");
        }
        this.f31589b.b(bVar.b());
        this.f31589b = null;
        initialize();
    }
}
