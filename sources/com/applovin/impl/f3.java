package com.applovin.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinMediationProvider;

public class f3 extends View {

    /* renamed from: x  reason: collision with root package name */
    private static final int f7587x = Color.rgb(66, 145, 241);

    /* renamed from: y  reason: collision with root package name */
    private static final int f7588y = Color.rgb(66, 145, 241);

    /* renamed from: z  reason: collision with root package name */
    private static final int f7589z = Color.rgb(66, 145, 241);

    /* renamed from: a  reason: collision with root package name */
    private Paint f7590a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f7591b;

    /* renamed from: c  reason: collision with root package name */
    protected Paint f7592c;

    /* renamed from: d  reason: collision with root package name */
    protected Paint f7593d;

    /* renamed from: f  reason: collision with root package name */
    private RectF f7594f;

    /* renamed from: g  reason: collision with root package name */
    private float f7595g;

    /* renamed from: h  reason: collision with root package name */
    private int f7596h;

    /* renamed from: i  reason: collision with root package name */
    private int f7597i;

    /* renamed from: j  reason: collision with root package name */
    private int f7598j;

    /* renamed from: k  reason: collision with root package name */
    private int f7599k;

    /* renamed from: l  reason: collision with root package name */
    private int f7600l;

    /* renamed from: m  reason: collision with root package name */
    private float f7601m;

    /* renamed from: n  reason: collision with root package name */
    private int f7602n;

    /* renamed from: o  reason: collision with root package name */
    private String f7603o;

    /* renamed from: p  reason: collision with root package name */
    private String f7604p;

    /* renamed from: q  reason: collision with root package name */
    private float f7605q;

    /* renamed from: r  reason: collision with root package name */
    private String f7606r;

    /* renamed from: s  reason: collision with root package name */
    private float f7607s;

    /* renamed from: t  reason: collision with root package name */
    private final float f7608t;

    /* renamed from: u  reason: collision with root package name */
    private final float f7609u;

    /* renamed from: v  reason: collision with root package name */
    private final float f7610v;

    /* renamed from: w  reason: collision with root package name */
    private final int f7611w;

    private static class a {
        /* access modifiers changed from: private */
        public static float c(Resources resources, float f10) {
            return (f10 * resources.getDisplayMetrics().density) + 0.5f;
        }

        /* access modifiers changed from: private */
        public static float d(Resources resources, float f10) {
            return f10 * resources.getDisplayMetrics().scaledDensity;
        }
    }

    public f3(Context context) {
        this(context, (AttributeSet) null);
    }

    private float getProgressAngle() {
        return (((float) getProgress()) / ((float) this.f7599k)) * 360.0f;
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.f7600l = f7587x;
        this.f7596h = f7588y;
        this.f7595g = this.f7609u;
        setMax(100);
        setProgress(0);
        this.f7601m = this.f7608t;
        this.f7602n = 0;
        this.f7605q = this.f7610v;
        this.f7597i = f7589z;
    }

    /* access modifiers changed from: protected */
    public void b() {
        TextPaint textPaint = new TextPaint();
        this.f7592c = textPaint;
        textPaint.setColor(this.f7596h);
        this.f7592c.setTextSize(this.f7595g);
        this.f7592c.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.f7593d = textPaint2;
        textPaint2.setColor(this.f7597i);
        this.f7593d.setTextSize(this.f7605q);
        this.f7593d.setAntiAlias(true);
        Paint paint = new Paint();
        this.f7590a = paint;
        paint.setColor(this.f7600l);
        this.f7590a.setStyle(Paint.Style.STROKE);
        this.f7590a.setAntiAlias(true);
        this.f7590a.setStrokeWidth(this.f7601m);
        Paint paint2 = new Paint();
        this.f7591b = paint2;
        paint2.setColor(this.f7602n);
        this.f7591b.setAntiAlias(true);
    }

    public int getFinishedStrokeColor() {
        return this.f7600l;
    }

    public float getFinishedStrokeWidth() {
        return this.f7601m;
    }

    public int getInnerBackgroundColor() {
        return this.f7602n;
    }

    public String getInnerBottomText() {
        return this.f7606r;
    }

    public int getInnerBottomTextColor() {
        return this.f7597i;
    }

    public float getInnerBottomTextSize() {
        return this.f7605q;
    }

    public int getMax() {
        return this.f7599k;
    }

    public String getPrefixText() {
        return this.f7603o;
    }

    public int getProgress() {
        return this.f7598j;
    }

    public String getSuffixText() {
        return this.f7604p;
    }

    public int getTextColor() {
        return this.f7596h;
    }

    public float getTextSize() {
        return this.f7595g;
    }

    public void invalidate() {
        b();
        super.invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f7601m;
        this.f7594f.set(f10, f10, ((float) getWidth()) - f10, ((float) getHeight()) - f10);
        float f11 = this.f7601m;
        canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, ((((float) getWidth()) - f11) + f11) / 2.0f, this.f7591b);
        canvas.drawArc(this.f7594f, 270.0f, -getProgressAngle(), false, this.f7590a);
        String str = this.f7603o + this.f7598j + this.f7604p;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (((float) getWidth()) - this.f7592c.measureText(str)) / 2.0f, (((float) getWidth()) - (this.f7592c.descent() + this.f7592c.ascent())) / 2.0f, this.f7592c);
        }
        if (!TextUtils.isEmpty(getInnerBottomText())) {
            this.f7593d.setTextSize(this.f7605q);
            canvas.drawText(getInnerBottomText(), (((float) getWidth()) - this.f7593d.measureText(getInnerBottomText())) / 2.0f, (((float) getHeight()) - this.f7607s) - ((this.f7592c.descent() + this.f7592c.ascent()) / 2.0f), this.f7593d);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(a(i10), a(i11));
        this.f7607s = (float) (getHeight() - ((getHeight() * 3) / 4));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f7596h = bundle.getInt("text_color");
            this.f7595g = bundle.getFloat("text_size");
            this.f7605q = bundle.getFloat("inner_bottom_text_size");
            this.f7606r = bundle.getString("inner_bottom_text");
            this.f7597i = bundle.getInt("inner_bottom_text_color");
            this.f7600l = bundle.getInt("finished_stroke_color");
            this.f7601m = bundle.getFloat("finished_stroke_width");
            this.f7602n = bundle.getInt("inner_background_color");
            b();
            setMax(bundle.getInt(AppLovinMediationProvider.MAX));
            setProgress(bundle.getInt("progress"));
            this.f7603o = bundle.getString("prefix");
            this.f7604p = bundle.getString("suffix");
            super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", getTextColor());
        bundle.putFloat("text_size", getTextSize());
        bundle.putFloat("inner_bottom_text_size", getInnerBottomTextSize());
        bundle.putFloat("inner_bottom_text_color", (float) getInnerBottomTextColor());
        bundle.putString("inner_bottom_text", getInnerBottomText());
        bundle.putInt("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putInt("finished_stroke_color", getFinishedStrokeColor());
        bundle.putInt(AppLovinMediationProvider.MAX, getMax());
        bundle.putInt("progress", getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        return bundle;
    }

    public void setFinishedStrokeColor(int i10) {
        this.f7600l = i10;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f10) {
        this.f7601m = f10;
        invalidate();
    }

    public void setInnerBackgroundColor(int i10) {
        this.f7602n = i10;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f7606r = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i10) {
        this.f7597i = i10;
        invalidate();
    }

    public void setInnerBottomTextSize(float f10) {
        this.f7605q = f10;
        invalidate();
    }

    public void setMax(int i10) {
        if (i10 > 0) {
            this.f7599k = i10;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f7603o = str;
        invalidate();
    }

    public void setProgress(int i10) {
        this.f7598j = i10;
        if (i10 > getMax()) {
            this.f7598j %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f7604p = str;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.f7596h = i10;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f7595g = f10;
        invalidate();
    }

    public f3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public f3(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7594f = new RectF();
        this.f7598j = 0;
        this.f7603o = MaxReward.DEFAULT_LABEL;
        this.f7604p = MaxReward.DEFAULT_LABEL;
        this.f7606r = MaxReward.DEFAULT_LABEL;
        this.f7609u = a.d(getResources(), 14.0f);
        this.f7611w = (int) a.c(getResources(), 100.0f);
        this.f7608t = a.c(getResources(), 4.0f);
        this.f7610v = a.d(getResources(), 18.0f);
        a();
        b();
    }

    private int a(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            return size;
        }
        int i11 = this.f7611w;
        return mode == Integer.MIN_VALUE ? Math.min(i11, size) : i11;
    }
}
