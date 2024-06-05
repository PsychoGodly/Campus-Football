package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.a0;

/* compiled from: CircleImageView */
class a extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private Animation.AnimationListener f4809a;

    /* renamed from: b  reason: collision with root package name */
    private int f4810b;

    /* renamed from: c  reason: collision with root package name */
    private int f4811c;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a  reason: collision with other inner class name */
    /* compiled from: CircleImageView */
    private static class C0082a extends OvalShape {

        /* renamed from: a  reason: collision with root package name */
        private Paint f4812a = new Paint();

        /* renamed from: b  reason: collision with root package name */
        private int f4813b;

        /* renamed from: c  reason: collision with root package name */
        private a f4814c;

        C0082a(a aVar, int i10) {
            this.f4814c = aVar;
            this.f4813b = i10;
            a((int) rect().width());
        }

        private void a(int i10) {
            float f10 = (float) (i10 / 2);
            this.f4812a.setShader(new RadialGradient(f10, f10, (float) this.f4813b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = this.f4814c.getWidth() / 2;
            float f10 = (float) width;
            float height = (float) (this.f4814c.getHeight() / 2);
            canvas.drawCircle(f10, height, f10, this.f4812a);
            canvas.drawCircle(f10, height, (float) (width - this.f4813b), paint);
        }

        /* access modifiers changed from: protected */
        public void onResize(float f10, float f11) {
            super.onResize(f10, f11);
            a((int) f10);
        }
    }

    a(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f10 = getContext().getResources().getDisplayMetrics().density;
        int i10 = (int) (1.75f * f10);
        int i11 = (int) (0.0f * f10);
        this.f4810b = (int) (3.5f * f10);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(f1.a.f17983f);
        this.f4811c = obtainStyledAttributes.getColor(f1.a.f17984g, -328966);
        obtainStyledAttributes.recycle();
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            a0.v0(this, f10 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0082a(this, this.f4810b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f4810b, (float) i11, (float) i10, 503316480);
            int i12 = this.f4810b;
            setPadding(i12, i12, i12, i12);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f4811c);
        a0.r0(this, shapeDrawable);
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f4809a = animationListener;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f4809a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f4809a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f4810b * 2), getMeasuredHeight() + (this.f4810b * 2));
        }
    }

    public void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
            this.f4811c = i10;
        }
    }
}
