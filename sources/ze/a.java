package ze;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* compiled from: BarcodeScannerView */
public abstract class a extends FrameLayout implements Camera.PreviewCallback {

    /* renamed from: a  reason: collision with root package name */
    private e f39548a;

    /* renamed from: b  reason: collision with root package name */
    private c f39549b;

    /* renamed from: c  reason: collision with root package name */
    private g f39550c;

    /* renamed from: d  reason: collision with root package name */
    private Rect f39551d;

    /* renamed from: f  reason: collision with root package name */
    private b f39552f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f39553g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f39554h = true;

    /* renamed from: i  reason: collision with root package name */
    private boolean f39555i = true;

    /* renamed from: j  reason: collision with root package name */
    private boolean f39556j = true;

    /* renamed from: k  reason: collision with root package name */
    private int f39557k = getResources().getColor(h.viewfinder_laser);

    /* renamed from: l  reason: collision with root package name */
    private int f39558l = getResources().getColor(h.viewfinder_border);

    /* renamed from: m  reason: collision with root package name */
    private int f39559m = getResources().getColor(h.viewfinder_mask);

    /* renamed from: n  reason: collision with root package name */
    private int f39560n = getResources().getInteger(i.viewfinder_border_width);

    /* renamed from: o  reason: collision with root package name */
    private int f39561o = getResources().getInteger(i.viewfinder_border_length);

    /* renamed from: p  reason: collision with root package name */
    private boolean f39562p = false;

    /* renamed from: q  reason: collision with root package name */
    private int f39563q = 0;

    /* renamed from: r  reason: collision with root package name */
    private boolean f39564r = false;

    /* renamed from: s  reason: collision with root package name */
    private float f39565s = 1.0f;

    /* renamed from: t  reason: collision with root package name */
    private int f39566t = 0;

    /* renamed from: u  reason: collision with root package name */
    private float f39567u = 0.1f;

    public a(Context context) {
        super(context);
        d();
    }

    private void d() {
        this.f39550c = a(getContext());
    }

    /* access modifiers changed from: protected */
    public g a(Context context) {
        j jVar = new j(context);
        jVar.setBorderColor(this.f39558l);
        jVar.setLaserColor(this.f39557k);
        jVar.setLaserEnabled(this.f39556j);
        jVar.setBorderStrokeWidth(this.f39560n);
        jVar.setBorderLineLength(this.f39561o);
        jVar.setMaskColor(this.f39559m);
        jVar.setBorderCornerRounded(this.f39562p);
        jVar.setBorderCornerRadius(this.f39563q);
        jVar.setSquareViewFinder(this.f39564r);
        jVar.setViewFinderOffset(this.f39566t);
        return jVar;
    }

    public synchronized Rect b(int i10, int i11) {
        if (this.f39551d == null) {
            Rect framingRect = this.f39550c.getFramingRect();
            int width = this.f39550c.getWidth();
            int height = this.f39550c.getHeight();
            if (!(framingRect == null || width == 0)) {
                if (height != 0) {
                    Rect rect = new Rect(framingRect);
                    if (i10 < width) {
                        rect.left = (rect.left * i10) / width;
                        rect.right = (rect.right * i10) / width;
                    }
                    if (i11 < height) {
                        rect.top = (rect.top * i11) / height;
                        rect.bottom = (rect.bottom * i11) / height;
                    }
                    this.f39551d = rect;
                }
            }
            return null;
        }
        return this.f39551d;
    }

    public byte[] c(byte[] bArr, Camera camera) {
        Camera.Size previewSize = camera.getParameters().getPreviewSize();
        int i10 = previewSize.width;
        int i11 = previewSize.height;
        int rotationCount = getRotationCount();
        if (rotationCount == 1 || rotationCount == 3) {
            int i12 = 0;
            while (i12 < rotationCount) {
                byte[] bArr2 = new byte[bArr.length];
                for (int i13 = 0; i13 < i11; i13++) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        bArr2[(((i14 * i11) + i11) - i13) - 1] = bArr[(i13 * i10) + i14];
                    }
                }
                i12++;
                bArr = bArr2;
                int i15 = i10;
                i10 = i11;
                i11 = i15;
            }
        }
        return bArr;
    }

    public void e() {
        f(d.b());
    }

    public void f(int i10) {
        if (this.f39552f == null) {
            this.f39552f = new b(this);
        }
        this.f39552f.b(i10);
    }

    public void g() {
        if (this.f39548a != null) {
            this.f39549b.o();
            this.f39549b.k((e) null, (Camera.PreviewCallback) null);
            this.f39548a.f39585a.release();
            this.f39548a = null;
        }
        b bVar = this.f39552f;
        if (bVar != null) {
            bVar.quit();
            this.f39552f = null;
        }
    }

    public boolean getFlash() {
        e eVar = this.f39548a;
        if (eVar == null || !d.c(eVar.f39585a) || !this.f39548a.f39585a.getParameters().getFlashMode().equals("torch")) {
            return false;
        }
        return true;
    }

    public int getRotationCount() {
        return this.f39549b.getDisplayOrientation() / 90;
    }

    public void h() {
        c cVar = this.f39549b;
        if (cVar != null) {
            cVar.o();
        }
    }

    public void i() {
        e eVar = this.f39548a;
        if (eVar != null && d.c(eVar.f39585a)) {
            Camera.Parameters parameters = this.f39548a.f39585a.getParameters();
            if (parameters.getFlashMode().equals("torch")) {
                parameters.setFlashMode("off");
            } else {
                parameters.setFlashMode("torch");
            }
            this.f39548a.f39585a.setParameters(parameters);
        }
    }

    public void setAspectTolerance(float f10) {
        this.f39567u = f10;
    }

    public void setAutoFocus(boolean z10) {
        this.f39554h = z10;
        c cVar = this.f39549b;
        if (cVar != null) {
            cVar.setAutoFocus(z10);
        }
    }

    public void setBorderAlpha(float f10) {
        this.f39565s = f10;
        this.f39550c.setBorderAlpha(f10);
        this.f39550c.a();
    }

    public void setBorderColor(int i10) {
        this.f39558l = i10;
        this.f39550c.setBorderColor(i10);
        this.f39550c.a();
    }

    public void setBorderCornerRadius(int i10) {
        this.f39563q = i10;
        this.f39550c.setBorderCornerRadius(i10);
        this.f39550c.a();
    }

    public void setBorderLineLength(int i10) {
        this.f39561o = i10;
        this.f39550c.setBorderLineLength(i10);
        this.f39550c.a();
    }

    public void setBorderStrokeWidth(int i10) {
        this.f39560n = i10;
        this.f39550c.setBorderStrokeWidth(i10);
        this.f39550c.a();
    }

    public void setFlash(boolean z10) {
        this.f39553g = Boolean.valueOf(z10);
        e eVar = this.f39548a;
        if (eVar != null && d.c(eVar.f39585a)) {
            Camera.Parameters parameters = this.f39548a.f39585a.getParameters();
            if (z10) {
                if (!parameters.getFlashMode().equals("torch")) {
                    parameters.setFlashMode("torch");
                } else {
                    return;
                }
            } else if (!parameters.getFlashMode().equals("off")) {
                parameters.setFlashMode("off");
            } else {
                return;
            }
            this.f39548a.f39585a.setParameters(parameters);
        }
    }

    public void setIsBorderCornerRounded(boolean z10) {
        this.f39562p = z10;
        this.f39550c.setBorderCornerRounded(z10);
        this.f39550c.a();
    }

    public void setLaserColor(int i10) {
        this.f39557k = i10;
        this.f39550c.setLaserColor(i10);
        this.f39550c.a();
    }

    public void setLaserEnabled(boolean z10) {
        this.f39556j = z10;
        this.f39550c.setLaserEnabled(z10);
        this.f39550c.a();
    }

    public void setMaskColor(int i10) {
        this.f39559m = i10;
        this.f39550c.setMaskColor(i10);
        this.f39550c.a();
    }

    public void setShouldScaleToFill(boolean z10) {
        this.f39555i = z10;
    }

    public void setSquareViewFinder(boolean z10) {
        this.f39564r = z10;
        this.f39550c.setSquareViewFinder(z10);
        this.f39550c.a();
    }

    public void setupCameraPreview(e eVar) {
        this.f39548a = eVar;
        if (eVar != null) {
            setupLayout(eVar);
            this.f39550c.a();
            Boolean bool = this.f39553g;
            if (bool != null) {
                setFlash(bool.booleanValue());
            }
            setAutoFocus(this.f39554h);
        }
    }

    public final void setupLayout(e eVar) {
        removeAllViews();
        c cVar = new c(getContext(), eVar, this);
        this.f39549b = cVar;
        cVar.setAspectTolerance(this.f39567u);
        this.f39549b.setShouldScaleToFill(this.f39555i);
        if (!this.f39555i) {
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setGravity(17);
            relativeLayout.setBackgroundColor(-16777216);
            relativeLayout.addView(this.f39549b);
            addView(relativeLayout);
        } else {
            addView(this.f39549b);
        }
        g gVar = this.f39550c;
        if (gVar instanceof View) {
            addView((View) gVar);
            return;
        }
        throw new IllegalArgumentException("IViewFinder object returned by 'createViewFinderView()' should be instance of android.view.View");
    }
}
