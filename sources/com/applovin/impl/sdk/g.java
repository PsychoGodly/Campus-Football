package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.o;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private final k f11604a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final t f11605b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11606c;

    /* renamed from: d  reason: collision with root package name */
    private final long f11607d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final int f11608e;

    /* renamed from: f  reason: collision with root package name */
    private final int f11609f;

    /* renamed from: g  reason: collision with root package name */
    private final int f11610g;

    /* renamed from: h  reason: collision with root package name */
    private WeakReference f11611h = new WeakReference((Object) null);

    /* renamed from: i  reason: collision with root package name */
    private int f11612i = 0;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public Integer f11613j = null;

    /* renamed from: k  reason: collision with root package name */
    private Handler f11614k;

    /* renamed from: l  reason: collision with root package name */
    private HandlerThread f11615l;

    /* renamed from: m  reason: collision with root package name */
    private final Runnable f11616m = new i0(this);

    /* renamed from: n  reason: collision with root package name */
    private c f11617n;

    class b implements PixelCopy.OnPixelCopyFinishedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f11621a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bitmap f11622b;

        b(d dVar, Bitmap bitmap) {
            this.f11621a = dVar;
            this.f11622b = bitmap;
        }

        public void onPixelCopyFinished(int i10) {
            if (i10 == 0) {
                this.f11621a.a(this.f11622b);
                return;
            }
            t unused = g.this.f11605b;
            if (t.a()) {
                t g10 = g.this.f11605b;
                g10.b("BlackViewDetector", "Failed to capture screenshot with error code: " + i10);
            }
            this.f11621a.a(true);
        }
    }

    public interface c {
        void a(View view);
    }

    private interface d {
        void a(Bitmap bitmap);

        void a(boolean z10);
    }

    public g(k kVar) {
        this.f11604a = kVar;
        this.f11605b = kVar.L();
        this.f11606c = ((Long) kVar.a(oj.f10264a6)).longValue();
        this.f11607d = ((Long) kVar.a(oj.Z5)).longValue();
        this.f11608e = ((Integer) kVar.a(oj.f10271b6)).intValue();
        this.f11609f = ((Integer) kVar.a(oj.f10279c6)).intValue();
        this.f11610g = ((Integer) kVar.a(oj.f10287d6)).intValue();
    }

    static /* synthetic */ int e(g gVar) {
        int i10 = gVar.f11612i;
        gVar.f11612i = i10 + 1;
        return i10;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.f11617n = null;
    }

    /* access modifiers changed from: private */
    public void d() {
        long j10 = this.f11606c;
        if (j10 <= 0) {
            if (this.f11612i == 1) {
                e();
            }
            g();
        } else if (this.f11612i > 1) {
            e();
            g();
        } else {
            Handler handler = this.f11614k;
            if (handler != null) {
                handler.postDelayed(this.f11616m, j10);
                return;
            }
            if (t.a()) {
                this.f11605b.k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            g();
        }
    }

    private void e() {
        View view = (View) this.f11611h.get();
        if (t.a()) {
            t tVar = this.f11605b;
            tVar.k("BlackViewDetector", "Detected black view: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new j0(this, view));
    }

    /* access modifiers changed from: private */
    public void f() {
        this.f11612i = 0;
        this.f11613j = null;
    }

    /* access modifiers changed from: private */
    public void g() {
        if (this.f11611h.get() != null) {
            if (t.a()) {
                t tVar = this.f11605b;
                tVar.a("BlackViewDetector", "Stopped monitoring view: " + this.f11611h.get());
            }
            this.f11611h.clear();
        }
        Handler handler = this.f11614k;
        if (handler != null) {
            handler.removeCallbacks(this.f11616m);
            this.f11614k = null;
        }
        if (this.f11617n != null) {
            AppLovinSdkUtils.runOnUiThread(new h0(this));
        }
    }

    public void b() {
        g();
        HandlerThread handlerThread = this.f11615l;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f11615l = null;
        }
    }

    public void a(View view, c cVar) {
        if (((Boolean) this.f11604a.a(oj.Y5)).booleanValue()) {
            View view2 = (View) this.f11611h.get();
            if (view2 == null) {
                if (t.a()) {
                    t tVar = this.f11605b;
                    tVar.a("BlackViewDetector", "Started monitoring view: " + view);
                }
                try {
                    if (this.f11615l == null) {
                        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:black_view_detector");
                        this.f11615l = handlerThread;
                        handlerThread.start();
                    } else {
                        this.f11604a.B().a(o.b.BLACK_VIEW, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                        g();
                    }
                    this.f11617n = cVar;
                    this.f11611h = new WeakReference(view);
                    f();
                    Handler handler = new Handler(this.f11615l.getLooper());
                    this.f11614k = handler;
                    handler.postDelayed(this.f11616m, this.f11607d);
                } catch (Throwable th) {
                    g();
                    this.f11604a.B().a("BlackViewDetector", "maybeStartMonitoring", th);
                }
            } else if (t.a()) {
                t tVar2 = this.f11605b;
                tVar2.k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
            }
        }
    }

    class a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f11618a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11619b;

        a(int i10, int i11) {
            this.f11618a = i10;
            this.f11619b = i11;
        }

        public void a(Bitmap bitmap) {
            int a10 = this.f11618a / g.this.f11608e;
            int a11 = this.f11619b / g.this.f11608e;
            int i10 = a10 / 2;
            for (int i11 = a11 / 2; i11 < this.f11619b; i11 += a11) {
                for (int i12 = i10; i12 < this.f11618a; i12 += a10) {
                    int pixel = bitmap.getPixel(i12, i11);
                    if (g.this.a(pixel)) {
                        bitmap.recycle();
                        g.this.f();
                        g.this.d();
                        return;
                    }
                    if (g.this.f11613j == null) {
                        Integer unused = g.this.f11613j = Integer.valueOf(pixel);
                    }
                }
            }
            g.e(g.this);
            bitmap.recycle();
            g.this.d();
        }

        public void a(boolean z10) {
            if (z10) {
                g.this.g();
            } else {
                g.this.d();
            }
        }
    }

    /* access modifiers changed from: private */
    public void a() {
        ActivityManager.MemoryInfo a10;
        View view = (View) this.f11611h.get();
        if (view == null) {
            if (t.a()) {
                this.f11605b.k("BlackViewDetector", "Monitored view no longer exists.");
            }
            g();
            return;
        }
        Long l10 = (Long) this.f11604a.a(oj.f10318h6);
        if (l10.longValue() <= 0 || (a10 = zp.a((ActivityManager) k.k().getSystemService("activity"))) == null || a10.availMem >= l10.longValue()) {
            if (t.a()) {
                t tVar = this.f11605b;
                tVar.a("BlackViewDetector", "Checking for black view: " + view);
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (measuredWidth == 0 || measuredHeight == 0) {
                if (t.a()) {
                    t tVar2 = this.f11605b;
                    tVar2.k("BlackViewDetector", "Monitored view is not visible due to dimensions (width = " + measuredWidth + ", height = " + measuredHeight + ")");
                }
                f();
                d();
                return;
            }
            a(view, (d) new a(measuredWidth, measuredHeight));
        } else if (t.a()) {
            this.f11605b.k("BlackViewDetector", "Cancelling black view detection due to low memory");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        c cVar = this.f11617n;
        if (cVar != null) {
            cVar.a(view);
        }
    }

    /* access modifiers changed from: private */
    public boolean a(int i10) {
        boolean z10;
        int i11;
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        Integer num = this.f11613j;
        if (num != null) {
            int red2 = Color.red(num.intValue());
            int green2 = Color.green(this.f11613j.intValue());
            int blue2 = Color.blue(this.f11613j.intValue());
            if (Math.abs(red - red2) > this.f11610g || Math.abs(green - green2) > this.f11610g || Math.abs(blue - blue2) > this.f11610g) {
                z10 = true;
                i11 = this.f11609f;
                if (red <= i11 || green > i11 || blue > i11 || z10) {
                    return true;
                }
                return false;
            }
        }
        z10 = false;
        i11 = this.f11609f;
        return red <= i11 ? true : true;
    }

    private void a(View view, d dVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            Activity a10 = this.f11604a.e().a();
            if (a10 == null) {
                if (t.a()) {
                    this.f11605b.b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                dVar.a(false);
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            Rect rect = new Rect(i10, i11, i10 + measuredWidth, i11 + measuredHeight);
            try {
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                PixelCopy.request(a10.getWindow(), rect, createBitmap, new b(dVar, createBitmap), new Handler());
            } catch (Throwable th) {
                if (t.a()) {
                    t tVar = this.f11605b;
                    tVar.b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th);
                }
                dVar.a(true);
            }
        } else {
            if (t.a()) {
                this.f11605b.k("BlackViewDetector", "Unable to capture screenshots on views below API 26");
            }
            dVar.a(true);
        }
    }
}
