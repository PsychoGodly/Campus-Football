package ze;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.List;

/* compiled from: CameraPreview */
public class c extends SurfaceView implements SurfaceHolder.Callback {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public e f39573a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f39574b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f39575c = true;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f39576d = true;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f39577f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f39578g = true;

    /* renamed from: h  reason: collision with root package name */
    private Camera.PreviewCallback f39579h;

    /* renamed from: i  reason: collision with root package name */
    private float f39580i = 0.1f;

    /* renamed from: j  reason: collision with root package name */
    private Runnable f39581j = new a();

    /* renamed from: k  reason: collision with root package name */
    Camera.AutoFocusCallback f39582k = new b();

    /* compiled from: CameraPreview */
    class a implements Runnable {
        a() {
        }

        public void run() {
            if (c.this.f39573a != null && c.this.f39575c && c.this.f39576d && c.this.f39577f) {
                c.this.i();
            }
        }
    }

    /* compiled from: CameraPreview */
    class b implements Camera.AutoFocusCallback {
        b() {
        }

        public void onAutoFocus(boolean z10, Camera camera) {
            c.this.j();
        }
    }

    public c(Context context, e eVar, Camera.PreviewCallback previewCallback) {
        super(context);
        h(eVar, previewCallback);
    }

    private void f(Camera.Size size) {
        Point g10 = g(new Point(getWidth(), getHeight()));
        float f10 = ((float) size.width) / ((float) size.height);
        int i10 = g10.x;
        int i11 = g10.y;
        if (((float) i10) / ((float) i11) > f10) {
            l((int) (((float) i11) * f10), i11);
        } else {
            l(i10, (int) (((float) i10) / f10));
        }
    }

    private Point g(Point point) {
        if (getDisplayOrientation() % 180 == 0) {
            return point;
        }
        return new Point(point.y, point.x);
    }

    private Camera.Size getOptimalPreviewSize() {
        e eVar = this.f39573a;
        Camera.Size size = null;
        if (eVar == null) {
            return null;
        }
        List<Camera.Size> supportedPreviewSizes = eVar.f39585a.getParameters().getSupportedPreviewSizes();
        int width = getWidth();
        int height = getHeight();
        if (f.a(getContext()) == 1) {
            int i10 = height;
            height = width;
            width = i10;
        }
        double d10 = ((double) width) / ((double) height);
        if (supportedPreviewSizes == null) {
            return null;
        }
        double d11 = Double.MAX_VALUE;
        double d12 = Double.MAX_VALUE;
        for (Camera.Size next : supportedPreviewSizes) {
            if (Math.abs((((double) next.width) / ((double) next.height)) - d10) <= ((double) this.f39580i) && ((double) Math.abs(next.height - height)) < d12) {
                d12 = (double) Math.abs(next.height - height);
                size = next;
            }
        }
        if (size == null) {
            for (Camera.Size next2 : supportedPreviewSizes) {
                if (((double) Math.abs(next2.height - height)) < d11) {
                    size = next2;
                    d11 = (double) Math.abs(next2.height - height);
                }
            }
        }
        return size;
    }

    /* access modifiers changed from: private */
    public void j() {
        this.f39574b.postDelayed(this.f39581j, 1000);
    }

    private void l(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (getDisplayOrientation() % 180 != 0) {
            int i12 = i11;
            i11 = i10;
            i10 = i12;
        }
        if (this.f39578g) {
            float f10 = (float) i10;
            float width = ((float) ((View) getParent()).getWidth()) / f10;
            float f11 = (float) i11;
            float height = ((float) ((View) getParent()).getHeight()) / f11;
            if (width <= height) {
                width = height;
            }
            i10 = Math.round(f10 * width);
            i11 = Math.round(f11 * width);
        }
        layoutParams.width = i10;
        layoutParams.height = i11;
        setLayoutParams(layoutParams);
    }

    public int getDisplayOrientation() {
        int i10 = 0;
        if (this.f39573a == null) {
            return 0;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i11 = this.f39573a.f39586b;
        if (i11 == -1) {
            Camera.getCameraInfo(0, cameraInfo);
        } else {
            Camera.getCameraInfo(i11, cameraInfo);
        }
        int rotation = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                i10 = 90;
            } else if (rotation == 2) {
                i10 = 180;
            } else if (rotation == 3) {
                i10 = 270;
            }
        }
        if (cameraInfo.facing == 1) {
            return (360 - ((cameraInfo.orientation + i10) % 360)) % 360;
        }
        return ((cameraInfo.orientation - i10) + 360) % 360;
    }

    public void h(e eVar, Camera.PreviewCallback previewCallback) {
        k(eVar, previewCallback);
        this.f39574b = new Handler();
        getHolder().addCallback(this);
        getHolder().setType(3);
    }

    public void i() {
        try {
            this.f39573a.f39585a.autoFocus(this.f39582k);
        } catch (RuntimeException unused) {
            j();
        }
    }

    public void k(e eVar, Camera.PreviewCallback previewCallback) {
        this.f39573a = eVar;
        this.f39579h = previewCallback;
    }

    public void m() {
        Camera.Size optimalPreviewSize = getOptimalPreviewSize();
        Camera.Parameters parameters = this.f39573a.f39585a.getParameters();
        parameters.setPreviewSize(optimalPreviewSize.width, optimalPreviewSize.height);
        this.f39573a.f39585a.setParameters(parameters);
        f(optimalPreviewSize);
    }

    public void n() {
        if (this.f39573a != null) {
            try {
                getHolder().addCallback(this);
                this.f39575c = true;
                m();
                this.f39573a.f39585a.setPreviewDisplay(getHolder());
                this.f39573a.f39585a.setDisplayOrientation(getDisplayOrientation());
                this.f39573a.f39585a.setOneShotPreviewCallback(this.f39579h);
                this.f39573a.f39585a.startPreview();
                if (!this.f39576d) {
                    return;
                }
                if (this.f39577f) {
                    i();
                } else {
                    j();
                }
            } catch (Exception e10) {
                Log.e("CameraPreview", e10.toString(), e10);
            }
        }
    }

    public void o() {
        if (this.f39573a != null) {
            try {
                this.f39575c = false;
                getHolder().removeCallback(this);
                this.f39573a.f39585a.cancelAutoFocus();
                this.f39573a.f39585a.setOneShotPreviewCallback((Camera.PreviewCallback) null);
                this.f39573a.f39585a.stopPreview();
            } catch (Exception e10) {
                Log.e("CameraPreview", e10.toString(), e10);
            }
        }
    }

    public void setAspectTolerance(float f10) {
        this.f39580i = f10;
    }

    public void setAutoFocus(boolean z10) {
        if (this.f39573a != null && this.f39575c && z10 != this.f39576d) {
            this.f39576d = z10;
            if (!z10) {
                Log.v("CameraPreview", "Cancelling autofocus");
                this.f39573a.f39585a.cancelAutoFocus();
            } else if (this.f39577f) {
                Log.v("CameraPreview", "Starting autofocus");
                i();
            } else {
                j();
            }
        }
    }

    public void setShouldScaleToFill(boolean z10) {
        this.f39578g = z10;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        if (surfaceHolder.getSurface() != null) {
            o();
            n();
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f39577f = true;
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f39577f = false;
        o();
    }
}
