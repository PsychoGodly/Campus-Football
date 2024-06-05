package j4;

import android.content.Context;
import android.net.Uri;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import j4.l;
import j4.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k4.n0;
import k4.r;

/* compiled from: DefaultDataSource */
public final class t implements l {

    /* renamed from: a  reason: collision with root package name */
    private final Context f19451a;

    /* renamed from: b  reason: collision with root package name */
    private final List<p0> f19452b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final l f19453c;

    /* renamed from: d  reason: collision with root package name */
    private l f19454d;

    /* renamed from: e  reason: collision with root package name */
    private l f19455e;

    /* renamed from: f  reason: collision with root package name */
    private l f19456f;

    /* renamed from: g  reason: collision with root package name */
    private l f19457g;

    /* renamed from: h  reason: collision with root package name */
    private l f19458h;

    /* renamed from: i  reason: collision with root package name */
    private l f19459i;

    /* renamed from: j  reason: collision with root package name */
    private l f19460j;

    /* renamed from: k  reason: collision with root package name */
    private l f19461k;

    /* compiled from: DefaultDataSource */
    public static final class a implements l.a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f19462a;

        /* renamed from: b  reason: collision with root package name */
        private final l.a f19463b;

        /* renamed from: c  reason: collision with root package name */
        private p0 f19464c;

        public a(Context context) {
            this(context, new u.b());
        }

        /* renamed from: b */
        public t a() {
            t tVar = new t(this.f19462a, this.f19463b.a());
            p0 p0Var = this.f19464c;
            if (p0Var != null) {
                tVar.e(p0Var);
            }
            return tVar;
        }

        public a(Context context, l.a aVar) {
            this.f19462a = context.getApplicationContext();
            this.f19463b = aVar;
        }
    }

    public t(Context context, l lVar) {
        this.f19451a = context.getApplicationContext();
        this.f19453c = (l) k4.a.e(lVar);
    }

    private void q(l lVar) {
        for (int i10 = 0; i10 < this.f19452b.size(); i10++) {
            lVar.e(this.f19452b.get(i10));
        }
    }

    private l r() {
        if (this.f19455e == null) {
            c cVar = new c(this.f19451a);
            this.f19455e = cVar;
            q(cVar);
        }
        return this.f19455e;
    }

    private l s() {
        if (this.f19456f == null) {
            h hVar = new h(this.f19451a);
            this.f19456f = hVar;
            q(hVar);
        }
        return this.f19456f;
    }

    private l t() {
        if (this.f19459i == null) {
            j jVar = new j();
            this.f19459i = jVar;
            q(jVar);
        }
        return this.f19459i;
    }

    private l u() {
        if (this.f19454d == null) {
            y yVar = new y();
            this.f19454d = yVar;
            q(yVar);
        }
        return this.f19454d;
    }

    private l v() {
        if (this.f19460j == null) {
            k0 k0Var = new k0(this.f19451a);
            this.f19460j = k0Var;
            q(k0Var);
        }
        return this.f19460j;
    }

    private l w() {
        if (this.f19457g == null) {
            try {
                l lVar = (l) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f19457g = lVar;
                q(lVar);
            } catch (ClassNotFoundException unused) {
                r.i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f19457g == null) {
                this.f19457g = this.f19453c;
            }
        }
        return this.f19457g;
    }

    private l x() {
        if (this.f19458h == null) {
            q0 q0Var = new q0();
            this.f19458h = q0Var;
            q(q0Var);
        }
        return this.f19458h;
    }

    private void y(l lVar, p0 p0Var) {
        if (lVar != null) {
            lVar.e(p0Var);
        }
    }

    public void close() throws IOException {
        l lVar = this.f19461k;
        if (lVar != null) {
            try {
                lVar.close();
            } finally {
                this.f19461k = null;
            }
        }
    }

    public void e(p0 p0Var) {
        k4.a.e(p0Var);
        this.f19453c.e(p0Var);
        this.f19452b.add(p0Var);
        y(this.f19454d, p0Var);
        y(this.f19455e, p0Var);
        y(this.f19456f, p0Var);
        y(this.f19457g, p0Var);
        y(this.f19458h, p0Var);
        y(this.f19459i, p0Var);
        y(this.f19460j, p0Var);
    }

    public long f(p pVar) throws IOException {
        k4.a.f(this.f19461k == null);
        String scheme = pVar.f19387a.getScheme();
        if (n0.w0(pVar.f19387a)) {
            String path = pVar.f19387a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f19461k = u();
            } else {
                this.f19461k = r();
            }
        } else if ("asset".equals(scheme)) {
            this.f19461k = r();
        } else if ("content".equals(scheme)) {
            this.f19461k = s();
        } else if ("rtmp".equals(scheme)) {
            this.f19461k = w();
        } else if ("udp".equals(scheme)) {
            this.f19461k = x();
        } else if (JsonStorageKeyNames.DATA_KEY.equals(scheme)) {
            this.f19461k = t();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f19461k = v();
        } else {
            this.f19461k = this.f19453c;
        }
        return this.f19461k.f(pVar);
    }

    public Map<String, List<String>> k() {
        l lVar = this.f19461k;
        return lVar == null ? Collections.emptyMap() : lVar.k();
    }

    public Uri o() {
        l lVar = this.f19461k;
        if (lVar == null) {
            return null;
        }
        return lVar.o();
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return ((l) k4.a.e(this.f19461k)).read(bArr, i10, i11);
    }
}
