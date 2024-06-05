package l4;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import k4.n0;
import k4.r;

/* compiled from: VideoFrameReleaseHelper */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final e f19970a = new e();

    /* renamed from: b  reason: collision with root package name */
    private final b f19971b;

    /* renamed from: c  reason: collision with root package name */
    private final e f19972c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f19973d;

    /* renamed from: e  reason: collision with root package name */
    private Surface f19974e;

    /* renamed from: f  reason: collision with root package name */
    private float f19975f;

    /* renamed from: g  reason: collision with root package name */
    private float f19976g;

    /* renamed from: h  reason: collision with root package name */
    private float f19977h;

    /* renamed from: i  reason: collision with root package name */
    private float f19978i;

    /* renamed from: j  reason: collision with root package name */
    private int f19979j;

    /* renamed from: k  reason: collision with root package name */
    private long f19980k;

    /* renamed from: l  reason: collision with root package name */
    private long f19981l;

    /* renamed from: m  reason: collision with root package name */
    private long f19982m;

    /* renamed from: n  reason: collision with root package name */
    private long f19983n;

    /* renamed from: o  reason: collision with root package name */
    private long f19984o;

    /* renamed from: p  reason: collision with root package name */
    private long f19985p;

    /* renamed from: q  reason: collision with root package name */
    private long f19986q;

    /* compiled from: VideoFrameReleaseHelper */
    private static final class a {
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                r.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    /* compiled from: VideoFrameReleaseHelper */
    private interface b {

        /* compiled from: VideoFrameReleaseHelper */
        public interface a {
            void a(Display display);
        }

        void a(a aVar);

        void b();
    }

    /* compiled from: VideoFrameReleaseHelper */
    private static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final WindowManager f19987a;

        private c(WindowManager windowManager) {
            this.f19987a = windowManager;
        }

        public static b c(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        public void a(b.a aVar) {
            aVar.a(this.f19987a.getDefaultDisplay());
        }

        public void b() {
        }
    }

    /* compiled from: VideoFrameReleaseHelper */
    private static final class d implements b, DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        private final DisplayManager f19988a;

        /* renamed from: b  reason: collision with root package name */
        private b.a f19989b;

        private d(DisplayManager displayManager) {
            this.f19988a = displayManager;
        }

        private Display c() {
            return this.f19988a.getDisplay(0);
        }

        public static b d(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        public void a(b.a aVar) {
            this.f19989b = aVar;
            this.f19988a.registerDisplayListener(this, n0.w());
            aVar.a(c());
        }

        public void b() {
            this.f19988a.unregisterDisplayListener(this);
            this.f19989b = null;
        }

        public void onDisplayAdded(int i10) {
        }

        public void onDisplayChanged(int i10) {
            b.a aVar = this.f19989b;
            if (aVar != null && i10 == 0) {
                aVar.a(c());
            }
        }

        public void onDisplayRemoved(int i10) {
        }
    }

    /* compiled from: VideoFrameReleaseHelper */
    private static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: g  reason: collision with root package name */
        private static final e f19990g = new e();

        /* renamed from: a  reason: collision with root package name */
        public volatile long f19991a = -9223372036854775807L;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f19992b;

        /* renamed from: c  reason: collision with root package name */
        private final HandlerThread f19993c;

        /* renamed from: d  reason: collision with root package name */
        private Choreographer f19994d;

        /* renamed from: f  reason: collision with root package name */
        private int f19995f;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f19993c = handlerThread;
            handlerThread.start();
            Handler v10 = n0.v(handlerThread.getLooper(), this);
            this.f19992b = v10;
            v10.sendEmptyMessage(0);
        }

        private void b() {
            Choreographer choreographer = this.f19994d;
            if (choreographer != null) {
                int i10 = this.f19995f + 1;
                this.f19995f = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void c() {
            try {
                this.f19994d = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                r.j("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }

        public static e d() {
            return f19990g;
        }

        private void f() {
            Choreographer choreographer = this.f19994d;
            if (choreographer != null) {
                int i10 = this.f19995f - 1;
                this.f19995f = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f19991a = -9223372036854775807L;
                }
            }
        }

        public void a() {
            this.f19992b.sendEmptyMessage(1);
        }

        public void doFrame(long j10) {
            this.f19991a = j10;
            ((Choreographer) k4.a.e(this.f19994d)).postFrameCallbackDelayed(this, 500);
        }

        public void e() {
            this.f19992b.sendEmptyMessage(2);
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c();
                return true;
            } else if (i10 == 1) {
                b();
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                f();
                return true;
            }
        }
    }

    public l(Context context) {
        b f10 = f(context);
        this.f19971b = f10;
        this.f19972c = f10 != null ? e.d() : null;
        this.f19980k = -9223372036854775807L;
        this.f19981l = -9223372036854775807L;
        this.f19975f = -1.0f;
        this.f19978i = 1.0f;
        this.f19979j = 0;
    }

    private static boolean c(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    private void d() {
        Surface surface;
        if (n0.f19738a >= 30 && (surface = this.f19974e) != null && this.f19979j != Integer.MIN_VALUE && this.f19977h != 0.0f) {
            this.f19977h = 0.0f;
            a.a(surface, 0.0f);
        }
    }

    private static long e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            long j15 = j14;
            j14 = j12 + j14;
            j13 = j15;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    private static b f(Context context) {
        b bVar = null;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (n0.f19738a >= 17) {
            bVar = d.d(applicationContext);
        }
        return bVar == null ? c.c(applicationContext) : bVar;
    }

    private void n() {
        this.f19982m = 0;
        this.f19985p = -1;
        this.f19983n = -1;
    }

    /* access modifiers changed from: private */
    public void p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f19980k = refreshRate;
            this.f19981l = (refreshRate * 80) / 100;
            return;
        }
        r.i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f19980k = -9223372036854775807L;
        this.f19981l = -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (java.lang.Math.abs(r0 - r8.f19976g) >= (r8.f19970a.e() && (r8.f19970a.d() > 5000000000L ? 1 : (r8.f19970a.d() == 5000000000L ? 0 : -1)) >= 0 ? 0.02f : 1.0f)) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
        if (r8.f19970a.c() >= 30) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void q() {
        /*
            r8 = this;
            int r0 = k4.n0.f19738a
            r1 = 30
            if (r0 < r1) goto L_0x0073
            android.view.Surface r0 = r8.f19974e
            if (r0 != 0) goto L_0x000c
            goto L_0x0073
        L_0x000c:
            l4.e r0 = r8.f19970a
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x001b
            l4.e r0 = r8.f19970a
            float r0 = r0.b()
            goto L_0x001d
        L_0x001b:
            float r0 = r8.f19975f
        L_0x001d:
            float r2 = r8.f19976g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0024
            return
        L_0x0024:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 0
            r5 = 1
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0061
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0061
            l4.e r1 = r8.f19970a
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0049
            l4.e r1 = r8.f19970a
            long r1 = r1.d()
            r6 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x0049
            r1 = 1
            goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            if (r1 == 0) goto L_0x0050
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L_0x0052
        L_0x0050:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0052:
            float r2 = r8.f19976g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x005f
            goto L_0x006c
        L_0x005f:
            r5 = 0
            goto L_0x006c
        L_0x0061:
            if (r6 == 0) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            l4.e r2 = r8.f19970a
            int r2 = r2.c()
            if (r2 < r1) goto L_0x005f
        L_0x006c:
            if (r5 == 0) goto L_0x0073
            r8.f19976g = r0
            r8.r(r4)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.l.q():void");
    }

    private void r(boolean z10) {
        Surface surface;
        if (n0.f19738a >= 30 && (surface = this.f19974e) != null && this.f19979j != Integer.MIN_VALUE) {
            float f10 = 0.0f;
            if (this.f19973d) {
                float f11 = this.f19976g;
                if (f11 != -1.0f) {
                    f10 = this.f19978i * f11;
                }
            }
            if (z10 || this.f19977h != f10) {
                this.f19977h = f10;
                a.a(surface, f10);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long b(long r11) {
        /*
            r10 = this;
            long r0 = r10.f19985p
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0030
            l4.e r0 = r10.f19970a
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0030
            l4.e r0 = r10.f19970a
            long r0 = r0.a()
            long r2 = r10.f19986q
            long r4 = r10.f19982m
            long r6 = r10.f19985p
            long r4 = r4 - r6
            long r0 = r0 * r4
            float r0 = (float) r0
            float r1 = r10.f19978i
            float r0 = r0 / r1
            long r0 = (long) r0
            long r2 = r2 + r0
            boolean r0 = c(r11, r2)
            if (r0 == 0) goto L_0x002d
            r4 = r2
            goto L_0x0031
        L_0x002d:
            r10.n()
        L_0x0030:
            r4 = r11
        L_0x0031:
            long r11 = r10.f19982m
            r10.f19983n = r11
            r10.f19984o = r4
            l4.l$e r11 = r10.f19972c
            if (r11 == 0) goto L_0x0058
            long r0 = r10.f19980k
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0047
            goto L_0x0058
        L_0x0047:
            long r6 = r11.f19991a
            int r11 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r11 != 0) goto L_0x004e
            return r4
        L_0x004e:
            long r8 = r10.f19980k
            long r11 = e(r4, r6, r8)
            long r0 = r10.f19981l
            long r11 = r11 - r0
            return r11
        L_0x0058:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.l.b(long):long");
    }

    public void g(float f10) {
        this.f19975f = f10;
        this.f19970a.g();
        q();
    }

    public void h(long j10) {
        long j11 = this.f19983n;
        if (j11 != -1) {
            this.f19985p = j11;
            this.f19986q = this.f19984o;
        }
        this.f19982m++;
        this.f19970a.f(j10 * 1000);
        q();
    }

    public void i(float f10) {
        this.f19978i = f10;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f19973d = true;
        n();
        if (this.f19971b != null) {
            ((e) k4.a.e(this.f19972c)).a();
            this.f19971b.a(new k(this));
        }
        r(false);
    }

    public void l() {
        this.f19973d = false;
        b bVar = this.f19971b;
        if (bVar != null) {
            bVar.b();
            ((e) k4.a.e(this.f19972c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (surface instanceof i) {
            surface = null;
        }
        if (this.f19974e != surface) {
            d();
            this.f19974e = surface;
            r(true);
        }
    }

    public void o(int i10) {
        if (this.f19979j != i10) {
            this.f19979j = i10;
            r(true);
        }
    }
}
