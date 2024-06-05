package jc;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.view.f;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: FlutterRenderer */
public class a implements io.flutter.view.f {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f35720a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicLong f35721b = new AtomicLong(0);

    /* renamed from: c  reason: collision with root package name */
    private Surface f35722c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f35723d = false;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Handler f35724f = new Handler();

    /* renamed from: g  reason: collision with root package name */
    private final Set<WeakReference<f.b>> f35725g = new HashSet();

    /* renamed from: h  reason: collision with root package name */
    private final b f35726h;

    /* renamed from: jc.a$a  reason: collision with other inner class name */
    /* compiled from: FlutterRenderer */
    class C0402a implements b {
        C0402a() {
        }

        public void b() {
            boolean unused = a.this.f35723d = false;
        }

        public void d() {
            boolean unused = a.this.f35723d = true;
        }
    }

    /* compiled from: FlutterRenderer */
    public enum c {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f35735a;

        private c(int i10) {
            this.f35735a = i10;
        }
    }

    /* compiled from: FlutterRenderer */
    public enum d {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f35741a;

        private d(int i10) {
            this.f35741a = i10;
        }
    }

    /* compiled from: FlutterRenderer */
    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final long f35742a;

        /* renamed from: b  reason: collision with root package name */
        private final FlutterJNI f35743b;

        e(long j10, FlutterJNI flutterJNI) {
            this.f35742a = j10;
            this.f35743b = flutterJNI;
        }

        public void run() {
            if (this.f35743b.isAttached()) {
                xb.b.f("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f35742a + ").");
                this.f35743b.unregisterTexture(this.f35742a);
            }
        }
    }

    /* compiled from: FlutterRenderer */
    final class f implements f.c, f.b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final long f35744a;

        /* renamed from: b  reason: collision with root package name */
        private final SurfaceTextureWrapper f35745b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public boolean f35746c;

        /* renamed from: d  reason: collision with root package name */
        private f.b f35747d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public f.a f35748e;

        /* renamed from: f  reason: collision with root package name */
        private final Runnable f35749f;

        /* renamed from: g  reason: collision with root package name */
        private SurfaceTexture.OnFrameAvailableListener f35750g = new b();

        /* renamed from: jc.a$f$a  reason: collision with other inner class name */
        /* compiled from: FlutterRenderer */
        class C0403a implements Runnable {
            C0403a() {
            }

            public void run() {
                if (f.this.f35748e != null) {
                    f.this.f35748e.a();
                }
            }
        }

        /* compiled from: FlutterRenderer */
        class b implements SurfaceTexture.OnFrameAvailableListener {
            b() {
            }

            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (!f.this.f35746c && a.this.f35720a.isAttached()) {
                    f fVar = f.this;
                    a.this.m(fVar.f35744a);
                }
            }
        }

        f(long j10, SurfaceTexture surfaceTexture) {
            C0403a aVar = new C0403a();
            this.f35749f = aVar;
            this.f35744a = j10;
            this.f35745b = new SurfaceTextureWrapper(surfaceTexture, aVar);
            if (Build.VERSION.SDK_INT >= 21) {
                b().setOnFrameAvailableListener(this.f35750g, new Handler());
            } else {
                b().setOnFrameAvailableListener(this.f35750g);
            }
        }

        private void h() {
            a.this.r(this);
        }

        public void a(f.b bVar) {
            this.f35747d = bVar;
        }

        public SurfaceTexture b() {
            return this.f35745b.surfaceTexture();
        }

        public long c() {
            return this.f35744a;
        }

        public void d(f.a aVar) {
            this.f35748e = aVar;
        }

        /* access modifiers changed from: protected */
        public void finalize() throws Throwable {
            try {
                if (!this.f35746c) {
                    a.this.f35724f.post(new e(this.f35744a, a.this.f35720a));
                    super.finalize();
                }
            } finally {
                super.finalize();
            }
        }

        public SurfaceTextureWrapper i() {
            return this.f35745b;
        }

        public void onTrimMemory(int i10) {
            f.b bVar = this.f35747d;
            if (bVar != null) {
                bVar.onTrimMemory(i10);
            }
        }

        public void release() {
            if (!this.f35746c) {
                xb.b.f("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f35744a + ").");
                this.f35745b.release();
                a.this.y(this.f35744a);
                h();
                this.f35746c = true;
            }
        }
    }

    /* compiled from: FlutterRenderer */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public float f35754a = 1.0f;

        /* renamed from: b  reason: collision with root package name */
        public int f35755b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f35756c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f35757d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f35758e = 0;

        /* renamed from: f  reason: collision with root package name */
        public int f35759f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f35760g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f35761h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f35762i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f35763j = 0;

        /* renamed from: k  reason: collision with root package name */
        public int f35764k = 0;

        /* renamed from: l  reason: collision with root package name */
        public int f35765l = 0;

        /* renamed from: m  reason: collision with root package name */
        public int f35766m = 0;

        /* renamed from: n  reason: collision with root package name */
        public int f35767n = 0;

        /* renamed from: o  reason: collision with root package name */
        public int f35768o = 0;

        /* renamed from: p  reason: collision with root package name */
        public int f35769p = -1;

        /* renamed from: q  reason: collision with root package name */
        public List<b> f35770q = new ArrayList();

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f35755b > 0 && this.f35756c > 0 && this.f35754a > 0.0f;
        }
    }

    public a(FlutterJNI flutterJNI) {
        C0402a aVar = new C0402a();
        this.f35726h = aVar;
        this.f35720a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
    }

    private void i() {
        Iterator<WeakReference<f.b>> it = this.f35725g.iterator();
        while (it.hasNext()) {
            if (((f.b) it.next().get()) == null) {
                it.remove();
            }
        }
    }

    /* access modifiers changed from: private */
    public void m(long j10) {
        this.f35720a.markTextureFrameAvailable(j10);
    }

    private void p(long j10, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.f35720a.registerTexture(j10, surfaceTextureWrapper);
    }

    /* access modifiers changed from: private */
    public void y(long j10) {
        this.f35720a.unregisterTexture(j10);
    }

    public void f(b bVar) {
        this.f35720a.addIsDisplayingFlutterUiListener(bVar);
        if (this.f35723d) {
            bVar.d();
        }
    }

    /* access modifiers changed from: package-private */
    public void g(f.b bVar) {
        i();
        this.f35725g.add(new WeakReference(bVar));
    }

    public f.c h() {
        xb.b.f("FlutterRenderer", "Creating a SurfaceTexture.");
        return o(new SurfaceTexture(0));
    }

    public void j(ByteBuffer byteBuffer, int i10) {
        this.f35720a.dispatchPointerDataPacket(byteBuffer, i10);
    }

    public boolean k() {
        return this.f35723d;
    }

    public boolean l() {
        return this.f35720a.getIsSoftwareRenderingEnabled();
    }

    public void n(int i10) {
        Iterator<WeakReference<f.b>> it = this.f35725g.iterator();
        while (it.hasNext()) {
            f.b bVar = (f.b) it.next().get();
            if (bVar != null) {
                bVar.onTrimMemory(i10);
            } else {
                it.remove();
            }
        }
    }

    public f.c o(SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        f fVar = new f(this.f35721b.getAndIncrement(), surfaceTexture);
        xb.b.f("FlutterRenderer", "New SurfaceTexture ID: " + fVar.c());
        p(fVar.c(), fVar.i());
        g(fVar);
        return fVar;
    }

    public void q(b bVar) {
        this.f35720a.removeIsDisplayingFlutterUiListener(bVar);
    }

    /* access modifiers changed from: package-private */
    public void r(f.b bVar) {
        for (WeakReference next : this.f35725g) {
            if (next.get() == bVar) {
                this.f35725g.remove(next);
                return;
            }
        }
    }

    public void s(boolean z10) {
        this.f35720a.setSemanticsEnabled(z10);
    }

    public void t(g gVar) {
        g gVar2 = gVar;
        if (gVar.a()) {
            xb.b.f("FlutterRenderer", "Setting viewport metrics\nSize: " + gVar2.f35755b + " x " + gVar2.f35756c + "\nPadding - L: " + gVar2.f35760g + ", T: " + gVar2.f35757d + ", R: " + gVar2.f35758e + ", B: " + gVar2.f35759f + "\nInsets - L: " + gVar2.f35764k + ", T: " + gVar2.f35761h + ", R: " + gVar2.f35762i + ", B: " + gVar2.f35763j + "\nSystem Gesture Insets - L: " + gVar2.f35768o + ", T: " + gVar2.f35765l + ", R: " + gVar2.f35766m + ", B: " + gVar2.f35766m + "\nDisplay Features: " + gVar2.f35770q.size());
            int[] iArr = new int[(gVar2.f35770q.size() * 4)];
            int[] iArr2 = new int[gVar2.f35770q.size()];
            int[] iArr3 = new int[gVar2.f35770q.size()];
            for (int i10 = 0; i10 < gVar2.f35770q.size(); i10++) {
                b bVar = gVar2.f35770q.get(i10);
                int i11 = i10 * 4;
                Rect rect = bVar.f35728a;
                iArr[i11] = rect.left;
                iArr[i11 + 1] = rect.top;
                iArr[i11 + 2] = rect.right;
                iArr[i11 + 3] = rect.bottom;
                iArr2[i10] = bVar.f35729b.f35741a;
                iArr3[i10] = bVar.f35730c.f35735a;
            }
            int[] iArr4 = iArr3;
            FlutterJNI flutterJNI = this.f35720a;
            flutterJNI.setViewportMetrics(gVar2.f35754a, gVar2.f35755b, gVar2.f35756c, gVar2.f35757d, gVar2.f35758e, gVar2.f35759f, gVar2.f35760g, gVar2.f35761h, gVar2.f35762i, gVar2.f35763j, gVar2.f35764k, gVar2.f35765l, gVar2.f35766m, gVar2.f35767n, gVar2.f35768o, gVar2.f35769p, iArr, iArr2, iArr4);
        }
    }

    public void u(Surface surface, boolean z10) {
        if (this.f35722c != null && !z10) {
            v();
        }
        this.f35722c = surface;
        this.f35720a.onSurfaceCreated(surface);
    }

    public void v() {
        this.f35720a.onSurfaceDestroyed();
        this.f35722c = null;
        if (this.f35723d) {
            this.f35726h.b();
        }
        this.f35723d = false;
    }

    public void w(int i10, int i11) {
        this.f35720a.onSurfaceChanged(i10, i11);
    }

    public void x(Surface surface) {
        this.f35722c = surface;
        this.f35720a.onSurfaceWindowChanged(surface);
    }

    /* compiled from: FlutterRenderer */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f35728a;

        /* renamed from: b  reason: collision with root package name */
        public final d f35729b;

        /* renamed from: c  reason: collision with root package name */
        public final c f35730c;

        public b(Rect rect, d dVar, c cVar) {
            this.f35728a = rect;
            this.f35729b = dVar;
            this.f35730c = cVar;
        }

        public b(Rect rect, d dVar) {
            this.f35728a = rect;
            this.f35729b = dVar;
            this.f35730c = c.UNKNOWN;
        }
    }
}
