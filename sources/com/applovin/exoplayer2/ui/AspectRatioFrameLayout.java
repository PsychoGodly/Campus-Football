package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.sdk.R;

public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final c f6108a;

    /* renamed from: b  reason: collision with root package name */
    private float f6109b;

    /* renamed from: c  reason: collision with root package name */
    private int f6110c;

    public interface b {
    }

    private final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private float f6111a;

        /* renamed from: b  reason: collision with root package name */
        private float f6112b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f6113c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f6114d;

        private c() {
        }

        public void a(float f10, float f11, boolean z10) {
            this.f6111a = f10;
            this.f6112b = f11;
            this.f6113c = z10;
            if (!this.f6114d) {
                this.f6114d = true;
                AspectRatioFrameLayout.this.post(this);
            }
        }

        public void run() {
            this.f6114d = false;
            b unused = AspectRatioFrameLayout.this.getClass();
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public int getResizeMode() {
        return this.f6110c;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f6109b > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f12 = (float) measuredWidth;
            float f13 = (float) measuredHeight;
            float f14 = f12 / f13;
            float f15 = (this.f6109b / f14) - 1.0f;
            if (Math.abs(f15) <= 0.01f) {
                this.f6108a.a(this.f6109b, f14, false);
                return;
            }
            int i12 = this.f6110c;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 4) {
                            if (f15 > 0.0f) {
                                f10 = this.f6109b;
                            } else {
                                f11 = this.f6109b;
                            }
                        }
                        this.f6108a.a(this.f6109b, f14, true);
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                    }
                    f10 = this.f6109b;
                    measuredWidth = (int) (f13 * f10);
                    this.f6108a.a(this.f6109b, f14, true);
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                }
                f11 = this.f6109b;
            } else if (f15 > 0.0f) {
                f11 = this.f6109b;
            } else {
                f10 = this.f6109b;
                measuredWidth = (int) (f13 * f10);
                this.f6108a.a(this.f6109b, f14, true);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
            measuredHeight = (int) (f12 / f11);
            this.f6108a.a(this.f6109b, f14, true);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    public void setAspectRatio(float f10) {
        if (this.f6109b != f10) {
            this.f6109b = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
    }

    public void setResizeMode(int i10) {
        if (this.f6110c != i10) {
            this.f6110c = i10;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6110c = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AppLovinAspectRatioFrameLayout, 0, 0);
            try {
                this.f6110c = obtainStyledAttributes.getInt(R.styleable.AppLovinAspectRatioFrameLayout_al_resize_mode, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f6108a = new c();
    }
}
