package ze;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

/* compiled from: ViewFinderView */
public class j extends View implements g {

    /* renamed from: q  reason: collision with root package name */
    private static final int[] f39587q = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: a  reason: collision with root package name */
    private Rect f39588a;

    /* renamed from: b  reason: collision with root package name */
    private int f39589b;

    /* renamed from: c  reason: collision with root package name */
    private final int f39590c = getResources().getColor(h.viewfinder_laser);

    /* renamed from: d  reason: collision with root package name */
    private final int f39591d = getResources().getColor(h.viewfinder_mask);

    /* renamed from: f  reason: collision with root package name */
    private final int f39592f = getResources().getColor(h.viewfinder_border);

    /* renamed from: g  reason: collision with root package name */
    private final int f39593g = getResources().getInteger(i.viewfinder_border_width);

    /* renamed from: h  reason: collision with root package name */
    private final int f39594h = getResources().getInteger(i.viewfinder_border_length);

    /* renamed from: i  reason: collision with root package name */
    protected Paint f39595i;

    /* renamed from: j  reason: collision with root package name */
    protected Paint f39596j;

    /* renamed from: k  reason: collision with root package name */
    protected Paint f39597k;

    /* renamed from: l  reason: collision with root package name */
    protected int f39598l;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f39599m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f39600n;

    /* renamed from: o  reason: collision with root package name */
    private float f39601o;

    /* renamed from: p  reason: collision with root package name */
    private int f39602p = 0;

    public j(Context context) {
        super(context);
        e();
    }

    private void e() {
        Paint paint = new Paint();
        this.f39595i = paint;
        paint.setColor(this.f39590c);
        this.f39595i.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f39596j = paint2;
        paint2.setColor(this.f39591d);
        Paint paint3 = new Paint();
        this.f39597k = paint3;
        paint3.setColor(this.f39592f);
        this.f39597k.setStyle(Paint.Style.STROKE);
        this.f39597k.setStrokeWidth((float) this.f39593g);
        this.f39597k.setAntiAlias(true);
        this.f39598l = this.f39594h;
    }

    public void a() {
        f();
        invalidate();
    }

    public void b(Canvas canvas) {
        Rect framingRect = getFramingRect();
        Paint paint = this.f39595i;
        int[] iArr = f39587q;
        paint.setAlpha(iArr[this.f39589b]);
        this.f39589b = (this.f39589b + 1) % iArr.length;
        int height = (framingRect.height() / 2) + framingRect.top;
        canvas.drawRect((float) (framingRect.left + 2), (float) (height - 1), (float) (framingRect.right - 1), (float) (height + 2), this.f39595i);
        postInvalidateDelayed(80, framingRect.left - 10, framingRect.top - 10, framingRect.right + 10, framingRect.bottom + 10);
    }

    public void c(Canvas canvas) {
        Rect framingRect = getFramingRect();
        Path path = new Path();
        path.moveTo((float) framingRect.left, (float) (framingRect.top + this.f39598l));
        path.lineTo((float) framingRect.left, (float) framingRect.top);
        path.lineTo((float) (framingRect.left + this.f39598l), (float) framingRect.top);
        canvas.drawPath(path, this.f39597k);
        path.moveTo((float) framingRect.right, (float) (framingRect.top + this.f39598l));
        path.lineTo((float) framingRect.right, (float) framingRect.top);
        path.lineTo((float) (framingRect.right - this.f39598l), (float) framingRect.top);
        canvas.drawPath(path, this.f39597k);
        path.moveTo((float) framingRect.right, (float) (framingRect.bottom - this.f39598l));
        path.lineTo((float) framingRect.right, (float) framingRect.bottom);
        path.lineTo((float) (framingRect.right - this.f39598l), (float) framingRect.bottom);
        canvas.drawPath(path, this.f39597k);
        path.moveTo((float) framingRect.left, (float) (framingRect.bottom - this.f39598l));
        path.lineTo((float) framingRect.left, (float) framingRect.bottom);
        path.lineTo((float) (framingRect.left + this.f39598l), (float) framingRect.bottom);
        canvas.drawPath(path, this.f39597k);
    }

    public void d(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        Rect framingRect = getFramingRect();
        float f10 = (float) width;
        canvas.drawRect(0.0f, 0.0f, f10, (float) framingRect.top, this.f39596j);
        canvas.drawRect(0.0f, (float) framingRect.top, (float) framingRect.left, (float) (framingRect.bottom + 1), this.f39596j);
        Canvas canvas2 = canvas;
        float f11 = f10;
        canvas2.drawRect((float) (framingRect.right + 1), (float) framingRect.top, f11, (float) (framingRect.bottom + 1), this.f39596j);
        canvas2.drawRect(0.0f, (float) (framingRect.bottom + 1), f11, (float) height, this.f39596j);
    }

    public synchronized void f() {
        int i10;
        int i11;
        int i12;
        Point point = new Point(getWidth(), getHeight());
        int a10 = f.a(getContext());
        if (this.f39599m) {
            if (a10 != 1) {
                i12 = getHeight();
            } else {
                i12 = getWidth();
            }
            i11 = (int) (((float) i12) * 0.625f);
            i10 = i11;
        } else if (a10 != 1) {
            int height = (int) (((float) getHeight()) * 0.625f);
            i10 = height;
            i11 = (int) (((float) height) * 1.4f);
        } else {
            i11 = (int) (((float) getWidth()) * 0.75f);
            i10 = (int) (((float) i11) * 0.75f);
        }
        if (i11 > getWidth()) {
            i11 = getWidth() - 50;
        }
        if (i10 > getHeight()) {
            i10 = getHeight() - 50;
        }
        int i13 = (point.x - i11) / 2;
        int i14 = (point.y - i10) / 2;
        int i15 = this.f39602p;
        this.f39588a = new Rect(i13 + i15, i14 + i15, (i13 + i11) - i15, (i14 + i10) - i15);
    }

    public Rect getFramingRect() {
        return this.f39588a;
    }

    public void onDraw(Canvas canvas) {
        if (getFramingRect() != null) {
            d(canvas);
            c(canvas);
            if (this.f39600n) {
                b(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        f();
    }

    public void setBorderAlpha(float f10) {
        this.f39601o = f10;
        this.f39597k.setAlpha((int) (255.0f * f10));
    }

    public void setBorderColor(int i10) {
        this.f39597k.setColor(i10);
    }

    public void setBorderCornerRadius(int i10) {
        this.f39597k.setPathEffect(new CornerPathEffect((float) i10));
    }

    public void setBorderCornerRounded(boolean z10) {
        if (z10) {
            this.f39597k.setStrokeJoin(Paint.Join.ROUND);
        } else {
            this.f39597k.setStrokeJoin(Paint.Join.BEVEL);
        }
    }

    public void setBorderLineLength(int i10) {
        this.f39598l = i10;
    }

    public void setBorderStrokeWidth(int i10) {
        this.f39597k.setStrokeWidth((float) i10);
    }

    public void setLaserColor(int i10) {
        this.f39595i.setColor(i10);
    }

    public void setLaserEnabled(boolean z10) {
        this.f39600n = z10;
    }

    public void setMaskColor(int i10) {
        this.f39596j.setColor(i10);
    }

    public void setSquareViewFinder(boolean z10) {
        this.f39599m = z10;
    }

    public void setViewFinderOffset(int i10) {
        this.f39602p = i10;
    }
}
