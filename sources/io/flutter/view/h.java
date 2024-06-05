package io.flutter.view;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* compiled from: VsyncWaiter */
public class h {

    /* renamed from: e  reason: collision with root package name */
    private static h f34668e;

    /* renamed from: f  reason: collision with root package name */
    private static b f34669f;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public long f34670a = -1;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public FlutterJNI f34671b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public c f34672c = new c(0);

    /* renamed from: d  reason: collision with root package name */
    private final FlutterJNI.b f34673d = new a();

    /* compiled from: VsyncWaiter */
    class a implements FlutterJNI.b {
        a() {
        }

        private Choreographer.FrameCallback b(long j10) {
            if (h.this.f34672c == null) {
                return new c(j10);
            }
            long unused = h.this.f34672c.f34677a = j10;
            c d10 = h.this.f34672c;
            c unused2 = h.this.f34672c = null;
            return d10;
        }

        public void a(long j10) {
            Choreographer.getInstance().postFrameCallback(b(j10));
        }
    }

    /* compiled from: VsyncWaiter */
    class b implements DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        private DisplayManager f34675a;

        b(DisplayManager displayManager) {
            this.f34675a = displayManager;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f34675a.registerDisplayListener(this, (Handler) null);
        }

        public void onDisplayAdded(int i10) {
        }

        public void onDisplayChanged(int i10) {
            if (i10 == 0) {
                float refreshRate = this.f34675a.getDisplay(0).getRefreshRate();
                long unused = h.this.f34670a = (long) (1.0E9d / ((double) refreshRate));
                h.this.f34671b.setRefreshRateFPS(refreshRate);
            }
        }

        public void onDisplayRemoved(int i10) {
        }
    }

    /* compiled from: VsyncWaiter */
    private class c implements Choreographer.FrameCallback {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public long f34677a;

        c(long j10) {
            this.f34677a = j10;
        }

        public void doFrame(long j10) {
            long nanoTime = System.nanoTime() - j10;
            h.this.f34671b.onVsync(nanoTime < 0 ? 0 : nanoTime, h.this.f34670a, this.f34677a);
            c unused = h.this.f34672c = this;
        }
    }

    private h(FlutterJNI flutterJNI) {
        this.f34671b = flutterJNI;
    }

    public static h f(float f10, FlutterJNI flutterJNI) {
        if (f34668e == null) {
            f34668e = new h(flutterJNI);
        }
        flutterJNI.setRefreshRateFPS(f10);
        h hVar = f34668e;
        hVar.f34670a = (long) (1.0E9d / ((double) f10));
        return hVar;
    }

    public static h g(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f34668e == null) {
            f34668e = new h(flutterJNI);
        }
        if (f34669f == null) {
            h hVar = f34668e;
            Objects.requireNonNull(hVar);
            b bVar = new b(displayManager);
            f34669f = bVar;
            bVar.a();
        }
        if (f34668e.f34670a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f34668e.f34670a = (long) (1.0E9d / ((double) refreshRate));
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f34668e;
    }

    public void h() {
        this.f34671b.setAsyncWaitForVsyncDelegate(this.f34673d);
    }
}
