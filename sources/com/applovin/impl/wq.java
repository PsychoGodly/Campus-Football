package com.applovin.impl;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

public final class wq {

    /* renamed from: a  reason: collision with root package name */
    private final p8 f13132a = new p8();

    /* renamed from: b  reason: collision with root package name */
    private final b f13133b;

    /* renamed from: c  reason: collision with root package name */
    private final e f13134c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13135d;

    /* renamed from: e  reason: collision with root package name */
    private Surface f13136e;

    /* renamed from: f  reason: collision with root package name */
    private float f13137f;

    /* renamed from: g  reason: collision with root package name */
    private float f13138g;

    /* renamed from: h  reason: collision with root package name */
    private float f13139h;

    /* renamed from: i  reason: collision with root package name */
    private float f13140i;

    /* renamed from: j  reason: collision with root package name */
    private int f13141j;

    /* renamed from: k  reason: collision with root package name */
    private long f13142k;

    /* renamed from: l  reason: collision with root package name */
    private long f13143l;

    /* renamed from: m  reason: collision with root package name */
    private long f13144m;

    /* renamed from: n  reason: collision with root package name */
    private long f13145n;

    /* renamed from: o  reason: collision with root package name */
    private long f13146o;

    /* renamed from: p  reason: collision with root package name */
    private long f13147p;

    /* renamed from: q  reason: collision with root package name */
    private long f13148q;

    private static final class a {
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                kc.a("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    private interface b {

        public interface a {
            void a(Display display);
        }

        void a();

        void a(a aVar);
    }

    private static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: g  reason: collision with root package name */
        private static final e f13152g = new e();

        /* renamed from: a  reason: collision with root package name */
        public volatile long f13153a = -9223372036854775807L;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f13154b;

        /* renamed from: c  reason: collision with root package name */
        private final HandlerThread f13155c;

        /* renamed from: d  reason: collision with root package name */
        private Choreographer f13156d;

        /* renamed from: f  reason: collision with root package name */
        private int f13157f;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f13155c = handlerThread;
            handlerThread.start();
            Handler a10 = yp.a(handlerThread.getLooper(), (Handler.Callback) this);
            this.f13154b = a10;
            a10.sendEmptyMessage(0);
        }

        private void b() {
            int i10 = this.f13157f + 1;
            this.f13157f = i10;
            if (i10 == 1) {
                ((Choreographer) a1.a((Object) this.f13156d)).postFrameCallback(this);
            }
        }

        private void c() {
            this.f13156d = Choreographer.getInstance();
        }

        public static e d() {
            return f13152g;
        }

        private void f() {
            int i10 = this.f13157f - 1;
            this.f13157f = i10;
            if (i10 == 0) {
                ((Choreographer) a1.a((Object) this.f13156d)).removeFrameCallback(this);
                this.f13153a = -9223372036854775807L;
            }
        }

        public void a() {
            this.f13154b.sendEmptyMessage(1);
        }

        public void doFrame(long j10) {
            this.f13153a = j10;
            ((Choreographer) a1.a((Object) this.f13156d)).postFrameCallbackDelayed(this, 500);
        }

        public void e() {
            this.f13154b.sendEmptyMessage(2);
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

    public wq(Context context) {
        b a10 = a(context);
        this.f13133b = a10;
        this.f13134c = a10 != null ? e.d() : null;
        this.f13142k = -9223372036854775807L;
        this.f13143l = -9223372036854775807L;
        this.f13137f = -1.0f;
        this.f13140i = 1.0f;
        this.f13141j = 0;
    }

    private void g() {
        this.f13144m = 0;
        this.f13147p = -1;
        this.f13145n = -1;
    }

    private void h() {
        if (yp.f13662a >= 30 && this.f13136e != null) {
            float b10 = this.f13132a.e() ? this.f13132a.b() : this.f13137f;
            float f10 = this.f13138g;
            if (b10 != f10) {
                int i10 = (b10 > -1.0f ? 1 : (b10 == -1.0f ? 0 : -1));
                if (i10 != 0 && f10 != -1.0f) {
                    if (Math.abs(b10 - this.f13138g) < ((!this.f13132a.e() || this.f13132a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                        return;
                    }
                } else if (i10 == 0 && this.f13132a.c() < 30) {
                    return;
                }
                this.f13138g = b10;
                a(false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long a(long r11) {
        /*
            r10 = this;
            long r0 = r10.f13147p
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0030
            com.applovin.impl.p8 r0 = r10.f13132a
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0030
            com.applovin.impl.p8 r0 = r10.f13132a
            long r0 = r0.a()
            long r2 = r10.f13148q
            long r4 = r10.f13144m
            long r6 = r10.f13147p
            long r4 = r4 - r6
            long r0 = r0 * r4
            float r0 = (float) r0
            float r1 = r10.f13140i
            float r0 = r0 / r1
            long r0 = (long) r0
            long r2 = r2 + r0
            boolean r0 = a((long) r11, (long) r2)
            if (r0 == 0) goto L_0x002d
            r4 = r2
            goto L_0x0031
        L_0x002d:
            r10.g()
        L_0x0030:
            r4 = r11
        L_0x0031:
            long r11 = r10.f13144m
            r10.f13145n = r11
            r10.f13146o = r4
            com.applovin.impl.wq$e r11 = r10.f13134c
            if (r11 == 0) goto L_0x0058
            long r0 = r10.f13142k
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0047
            goto L_0x0058
        L_0x0047:
            long r6 = r11.f13153a
            int r11 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r11 != 0) goto L_0x004e
            return r4
        L_0x004e:
            long r8 = r10.f13142k
            long r11 = a(r4, r6, r8)
            long r0 = r10.f13143l
            long r11 = r11 - r0
            return r11
        L_0x0058:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.wq.a(long):long");
    }

    public void b() {
        b bVar = this.f13133b;
        if (bVar != null) {
            bVar.a();
            ((e) a1.a((Object) this.f13134c)).e();
        }
    }

    public void c() {
        if (this.f13133b != null) {
            ((e) a1.a((Object) this.f13134c)).a();
            this.f13133b.a(new h70(this));
        }
    }

    public void d() {
        g();
    }

    public void e() {
        this.f13135d = true;
        g();
        a(false);
    }

    public void f() {
        this.f13135d = false;
        a();
    }

    private static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final WindowManager f13149a;

        private c(WindowManager windowManager) {
            this.f13149a = windowManager;
        }

        public static b a(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        public void a() {
        }

        public void a(b.a aVar) {
            aVar.a(this.f13149a.getDefaultDisplay());
        }
    }

    private static final class d implements b, DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        private final DisplayManager f13150a;

        /* renamed from: b  reason: collision with root package name */
        private b.a f13151b;

        private d(DisplayManager displayManager) {
            this.f13150a = displayManager;
        }

        public static b a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        private Display b() {
            return this.f13150a.getDisplay(0);
        }

        public void onDisplayAdded(int i10) {
        }

        public void onDisplayChanged(int i10) {
            b.a aVar = this.f13151b;
            if (aVar != null && i10 == 0) {
                aVar.a(b());
            }
        }

        public void onDisplayRemoved(int i10) {
        }

        public void a(b.a aVar) {
            this.f13151b = aVar;
            this.f13150a.registerDisplayListener(this, yp.a());
            aVar.a(b());
        }

        public void a() {
            this.f13150a.unregisterDisplayListener(this);
            this.f13151b = null;
        }
    }

    public void b(long j10) {
        long j11 = this.f13145n;
        if (j11 != -1) {
            this.f13147p = j11;
            this.f13148q = this.f13146o;
        }
        this.f13144m++;
        this.f13132a.a(j10 * 1000);
        h();
    }

    public void b(float f10) {
        this.f13140i = f10;
        g();
        a(false);
    }

    private static boolean a(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    private static long a(long j10, long j11, long j12) {
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

    private static b a(Context context) {
        b bVar = null;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (yp.f13662a >= 17) {
            bVar = d.a(applicationContext);
        }
        return bVar == null ? c.a(applicationContext) : bVar;
    }

    public void a(float f10) {
        this.f13137f = f10;
        this.f13132a.f();
        h();
    }

    public void a(Surface surface) {
        if (surface instanceof f7) {
            surface = null;
        }
        if (this.f13136e != surface) {
            a();
            this.f13136e = surface;
            a(true);
        }
    }

    public void a(int i10) {
        if (this.f13141j != i10) {
            this.f13141j = i10;
            a(true);
        }
    }

    /* access modifiers changed from: private */
    public void a(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f13142k = refreshRate;
            this.f13143l = (refreshRate * 80) / 100;
            return;
        }
        kc.d("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f13142k = -9223372036854775807L;
        this.f13143l = -9223372036854775807L;
    }

    private void a(boolean z10) {
        Surface surface;
        if (yp.f13662a >= 30 && (surface = this.f13136e) != null && this.f13141j != Integer.MIN_VALUE) {
            float f10 = 0.0f;
            if (this.f13135d) {
                float f11 = this.f13138g;
                if (f11 != -1.0f) {
                    f10 = this.f13140i * f11;
                }
            }
            if (z10 || this.f13139h != f10) {
                this.f13139h = f10;
                a.a(surface, f10);
            }
        }
    }

    private void a() {
        Surface surface;
        if (yp.f13662a >= 30 && (surface = this.f13136e) != null && this.f13141j != Integer.MIN_VALUE && this.f13139h != 0.0f) {
            this.f13139h = 0.0f;
            a.a(surface, 0.0f);
        }
    }
}
