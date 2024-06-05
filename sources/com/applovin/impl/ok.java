package com.applovin.impl;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import com.applovin.impl.ko;
import com.applovin.impl.ug;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class ok extends GLSurfaceView {

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList f10465a;

    /* renamed from: b  reason: collision with root package name */
    private final SensorManager f10466b;

    /* renamed from: c  reason: collision with root package name */
    private final Sensor f10467c;

    /* renamed from: d  reason: collision with root package name */
    private final ug f10468d;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f10469f;

    /* renamed from: g  reason: collision with root package name */
    private final ko f10470g;

    /* renamed from: h  reason: collision with root package name */
    private final zi f10471h;

    /* renamed from: i  reason: collision with root package name */
    private SurfaceTexture f10472i;

    /* renamed from: j  reason: collision with root package name */
    private Surface f10473j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f10474k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f10475l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f10476m;

    public interface b {
        void a(Surface surface);

        void b(Surface surface);
    }

    public ok(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public void b(SurfaceTexture surfaceTexture) {
        this.f10469f.post(new a10(this, surfaceTexture));
    }

    public t2 getCameraMotionListener() {
        return this.f10471h;
    }

    public vq getVideoFrameMetadataListener() {
        return this.f10471h;
    }

    public Surface getVideoSurface() {
        return this.f10473j;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10469f.post(new z00(this));
    }

    public void onPause() {
        this.f10475l = false;
        b();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f10475l = true;
        b();
    }

    public void setDefaultStereoMode(int i10) {
        this.f10471h.a(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f10474k = z10;
        b();
    }

    final class a implements GLSurfaceView.Renderer, ko.a, ug.a {

        /* renamed from: a  reason: collision with root package name */
        private final zi f10477a;

        /* renamed from: b  reason: collision with root package name */
        private final float[] f10478b = new float[16];

        /* renamed from: c  reason: collision with root package name */
        private final float[] f10479c = new float[16];

        /* renamed from: d  reason: collision with root package name */
        private final float[] f10480d;

        /* renamed from: e  reason: collision with root package name */
        private final float[] f10481e;

        /* renamed from: f  reason: collision with root package name */
        private final float[] f10482f;

        /* renamed from: g  reason: collision with root package name */
        private float f10483g;

        /* renamed from: h  reason: collision with root package name */
        private float f10484h;

        /* renamed from: i  reason: collision with root package name */
        private final float[] f10485i;

        /* renamed from: j  reason: collision with root package name */
        private final float[] f10486j;

        public a(zi ziVar) {
            float[] fArr = new float[16];
            this.f10480d = fArr;
            float[] fArr2 = new float[16];
            this.f10481e = fArr2;
            float[] fArr3 = new float[16];
            this.f10482f = fArr3;
            this.f10485i = new float[16];
            this.f10486j = new float[16];
            this.f10477a = ziVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f10484h = 3.1415927f;
        }

        private float a(float f10) {
            if (f10 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f10))) * 2.0d);
            }
            return 90.0f;
        }

        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f10486j, 0, this.f10480d, 0, this.f10482f, 0);
                Matrix.multiplyMM(this.f10485i, 0, this.f10481e, 0, this.f10486j, 0);
            }
            Matrix.multiplyMM(this.f10479c, 0, this.f10478b, 0, this.f10485i, 0);
            this.f10477a.a(this.f10479c, false);
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return ok.this.performClick();
        }

        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = ((float) i10) / ((float) i11);
            Matrix.perspectiveM(this.f10478b, 0, a(f10), f10, 0.1f, 100.0f);
        }

        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            ok.this.b(this.f10477a.b());
        }

        public synchronized void a(float[] fArr, float f10) {
            float[] fArr2 = this.f10480d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f10484h = -f10;
            a();
        }

        public synchronized void a(PointF pointF) {
            this.f10483g = pointF.y;
            a();
            Matrix.setRotateM(this.f10482f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        private void a() {
            Matrix.setRotateM(this.f10481e, 0, -this.f10483g, (float) Math.cos((double) this.f10484h), (float) Math.sin((double) this.f10484h), 0.0f);
        }
    }

    public ok(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10465a = new CopyOnWriteArrayList();
        this.f10469f = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) a1.a(context.getSystemService("sensor"));
        this.f10466b = sensorManager;
        Sensor defaultSensor = yp.f13662a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f10467c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        zi ziVar = new zi();
        this.f10471h = ziVar;
        a aVar = new a(ziVar);
        ko koVar = new ko(context, aVar, 25.0f);
        this.f10470g = koVar;
        this.f10468d = new ug(((WindowManager) a1.a((Object) (WindowManager) context.getSystemService("window"))).getDefaultDisplay(), koVar, aVar);
        this.f10474k = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(koVar);
    }

    public void a(b bVar) {
        this.f10465a.add(bVar);
    }

    public void b(b bVar) {
        this.f10465a.remove(bVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        Surface surface = this.f10473j;
        if (surface != null) {
            Iterator it = this.f10465a.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(surface);
            }
        }
        a(this.f10472i, surface);
        this.f10472i = null;
        this.f10473j = null;
    }

    private void b() {
        boolean z10 = this.f10474k && this.f10475l;
        Sensor sensor = this.f10467c;
        if (sensor != null && z10 != this.f10476m) {
            if (z10) {
                this.f10466b.registerListener(this.f10468d, sensor, 0);
            } else {
                this.f10466b.unregisterListener(this.f10468d);
            }
            this.f10476m = z10;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f10472i;
        Surface surface = this.f10473j;
        Surface surface2 = new Surface(surfaceTexture);
        this.f10472i = surfaceTexture;
        this.f10473j = surface2;
        Iterator it = this.f10465a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b(surface2);
        }
        a(surfaceTexture2, surface);
    }

    private static void a(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }
}
