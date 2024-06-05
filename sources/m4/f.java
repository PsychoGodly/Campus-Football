package m4;

import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.view.Surface;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l4.j;

/* compiled from: SphericalGLSurfaceView */
public final class f extends GLSurfaceView {

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f20083a;

    /* renamed from: b  reason: collision with root package name */
    private final SensorManager f20084b;

    /* renamed from: c  reason: collision with root package name */
    private final Sensor f20085c;

    /* renamed from: d  reason: collision with root package name */
    private final c f20086d;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f20087f;

    /* renamed from: g  reason: collision with root package name */
    private final d f20088g;

    /* renamed from: h  reason: collision with root package name */
    private SurfaceTexture f20089h;

    /* renamed from: i  reason: collision with root package name */
    private Surface f20090i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f20091j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f20092k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f20093l;

    /* compiled from: SphericalGLSurfaceView */
    public interface a {
        void D(Surface surface);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        Surface surface = this.f20090i;
        if (surface != null) {
            Iterator<a> it = this.f20083a.iterator();
            while (it.hasNext()) {
                it.next().D(surface);
            }
        }
        c(this.f20089h, surface);
        this.f20089h = null;
        this.f20090i = null;
    }

    private static void c(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void e() {
        boolean z10 = this.f20091j && this.f20092k;
        Sensor sensor = this.f20085c;
        if (sensor != null && z10 != this.f20093l) {
            if (z10) {
                this.f20084b.registerListener(this.f20086d, sensor, 0);
            } else {
                this.f20084b.unregisterListener(this.f20086d);
            }
            this.f20093l = z10;
        }
    }

    public void d(a aVar) {
        this.f20083a.remove(aVar);
    }

    public a getCameraMotionListener() {
        return this.f20088g;
    }

    public j getVideoFrameMetadataListener() {
        return this.f20088g;
    }

    public Surface getVideoSurface() {
        return this.f20090i;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20087f.post(new e(this));
    }

    public void onPause() {
        this.f20092k = false;
        e();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f20092k = true;
        e();
    }

    public void setDefaultStereoMode(int i10) {
        throw null;
    }

    public void setUseSensorRotation(boolean z10) {
        this.f20091j = z10;
        e();
    }
}
