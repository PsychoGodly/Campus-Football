package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.Locale;
import jc.c;

/* compiled from: FlutterImageView */
public class g extends View implements c {

    /* renamed from: a  reason: collision with root package name */
    private ImageReader f33412a;

    /* renamed from: b  reason: collision with root package name */
    private Image f33413b;

    /* renamed from: c  reason: collision with root package name */
    private Bitmap f33414c;

    /* renamed from: d  reason: collision with root package name */
    private jc.a f33415d;

    /* renamed from: f  reason: collision with root package name */
    private b f33416f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f33417g;

    /* compiled from: FlutterImageView */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f33418a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.flutter.embedding.android.g$b[] r0 = io.flutter.embedding.android.g.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33418a = r0
                io.flutter.embedding.android.g$b r1 = io.flutter.embedding.android.g.b.background     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33418a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.embedding.android.g$b r1 = io.flutter.embedding.android.g.b.overlay     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.g.a.<clinit>():void");
        }
    }

    /* compiled from: FlutterImageView */
    public enum b {
        background,
        overlay
    }

    public g(Context context, int i10, int i11, b bVar) {
        this(context, f(i10, i11), bVar);
    }

    private void d() {
        Image image = this.f33413b;
        if (image != null) {
            image.close();
            this.f33413b = null;
        }
    }

    private static ImageReader f(int i10, int i11) {
        int i12;
        int i13;
        if (i10 <= 0) {
            h("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i10));
            i12 = 1;
        } else {
            i12 = i10;
        }
        if (i11 <= 0) {
            h("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i11));
            i13 = 1;
        } else {
            i13 = i11;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return ImageReader.newInstance(i12, i13, 1, 3, 768);
        }
        return ImageReader.newInstance(i12, i13, 1, 3);
    }

    private void g() {
        setAlpha(0.0f);
    }

    private static void h(String str, Object... objArr) {
        xb.b.g("FlutterImageView", String.format(Locale.US, str, objArr));
    }

    private void j() {
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = this.f33413b.getHardwareBuffer();
            this.f33414c = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.f33413b.getPlanes();
        if (planes.length == 1) {
            Image.Plane plane = planes[0];
            int rowStride = plane.getRowStride() / plane.getPixelStride();
            int height = this.f33413b.getHeight();
            Bitmap bitmap = this.f33414c;
            if (!(bitmap != null && bitmap.getWidth() == rowStride && this.f33414c.getHeight() == height)) {
                this.f33414c = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
            }
            ByteBuffer buffer = plane.getBuffer();
            buffer.rewind();
            this.f33414c.copyPixelsFromBuffer(buffer);
        }
    }

    public void a(jc.a aVar) {
        if (a.f33418a[this.f33416f.ordinal()] == 1) {
            aVar.x(this.f33412a.getSurface());
        }
        setAlpha(1.0f);
        this.f33415d = aVar;
        this.f33417g = true;
    }

    public void b() {
        if (this.f33417g) {
            setAlpha(0.0f);
            c();
            this.f33414c = null;
            d();
            invalidate();
            this.f33417g = false;
        }
    }

    public boolean c() {
        if (!this.f33417g) {
            return false;
        }
        Image acquireLatestImage = this.f33412a.acquireLatestImage();
        if (acquireLatestImage != null) {
            d();
            this.f33413b = acquireLatestImage;
            invalidate();
        }
        if (acquireLatestImage != null) {
            return true;
        }
        return false;
    }

    public void e() {
        this.f33412a.close();
    }

    public jc.a getAttachedRenderer() {
        return this.f33415d;
    }

    public ImageReader getImageReader() {
        return this.f33412a;
    }

    public Surface getSurface() {
        return this.f33412a.getSurface();
    }

    public void i(int i10, int i11) {
        if (this.f33415d != null) {
            if (i10 != this.f33412a.getWidth() || i11 != this.f33412a.getHeight()) {
                d();
                e();
                this.f33412a = f(i10, i11);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f33413b != null) {
            j();
        }
        Bitmap bitmap = this.f33414c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (!(i10 == this.f33412a.getWidth() && i11 == this.f33412a.getHeight()) && this.f33416f == b.background && this.f33417g) {
            i(i10, i11);
            this.f33415d.x(this.f33412a.getSurface());
        }
    }

    public void pause() {
    }

    g(Context context, ImageReader imageReader, b bVar) {
        super(context, (AttributeSet) null);
        this.f33417g = false;
        this.f33412a = imageReader;
        this.f33416f = bVar;
        g();
    }
}
