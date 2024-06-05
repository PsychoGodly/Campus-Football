package com.startapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import com.startapp.sdk.json.RatingBar;

/* compiled from: Sta */
public class t4 {

    /* renamed from: a  reason: collision with root package name */
    public RelativeLayout f17290a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f17291b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f17292c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f17293d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f17294e;

    /* renamed from: f  reason: collision with root package name */
    public RatingBar f17295f;

    /* renamed from: g  reason: collision with root package name */
    public MetaDataStyle f17296g = null;

    /* compiled from: Sta */
    public class a extends ShapeDrawable {
        public a(t4 t4Var, Shape shape) {
            super(shape);
        }

        public void onDraw(Shape shape, Canvas canvas, Paint paint) {
            paint.setColor(-11363070);
            paint.setMaskFilter(new EmbossMaskFilter(new float[]{1.0f, 1.0f, 1.0f}, 0.4f, 5.0f, 3.0f));
            super.onDraw(shape, canvas, paint);
        }
    }

    public t4(Context context) {
        Context context2 = context;
        context2.setTheme(16973829);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        this.f17290a = new RelativeLayout(context2);
        this.f17290a.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{AdsCommonMetaData.k().p(), AdsCommonMetaData.k().o()}));
        this.f17290a.setLayoutParams(layoutParams);
        int a10 = f9.a(context2, 3);
        int a11 = f9.a(context2, 4);
        int a12 = f9.a(context2, 5);
        int a13 = f9.a(context2, 6);
        int a14 = f9.a(context2, 10);
        int a15 = f9.a(context2, 84);
        this.f17290a.setPadding(a14, a10, a14, a10);
        this.f17290a.setTag(this);
        ImageView imageView = new ImageView(context2);
        this.f17291b = imageView;
        imageView.setId(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a15, a15);
        layoutParams2.addRule(15);
        this.f17291b.setLayoutParams(layoutParams2);
        this.f17291b.setPadding(0, 0, a13, 0);
        TextView textView = new TextView(context2);
        this.f17292c = textView;
        textView.setId(2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(a0.a(17), 1);
        layoutParams3.addRule(6, 1);
        this.f17292c.setLayoutParams(layoutParams3);
        this.f17292c.setPadding(0, 0, 0, a12);
        this.f17292c.setTextColor(AdsCommonMetaData.k().q().intValue());
        this.f17292c.setTextSize((float) AdsCommonMetaData.k().s().intValue());
        this.f17292c.setSingleLine(true);
        this.f17292c.setEllipsize(TextUtils.TruncateAt.END);
        f9.a(this.f17292c, AdsCommonMetaData.k().r());
        TextView textView2 = new TextView(context2);
        this.f17293d = textView2;
        textView2.setId(3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(a0.a(17), 1);
        layoutParams4.addRule(3, 2);
        layoutParams4.setMargins(0, 0, 0, a12);
        this.f17293d.setLayoutParams(layoutParams4);
        this.f17293d.setTextColor(AdsCommonMetaData.k().l().intValue());
        this.f17293d.setTextSize((float) AdsCommonMetaData.k().n().intValue());
        this.f17293d.setSingleLine(true);
        this.f17293d.setEllipsize(TextUtils.TruncateAt.END);
        f9.a(this.f17293d, AdsCommonMetaData.k().m());
        this.f17295f = new RatingBar(context2);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(a0.a(17), 1);
        layoutParams5.addRule(8, 1);
        layoutParams5.setMargins(0, 0, 0, -a12);
        this.f17295f.setLayoutParams(layoutParams5);
        this.f17295f.setPadding(0, 0, 0, a11);
        this.f17295f.setId(5);
        this.f17294e = new TextView(context2);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(a0.a(21));
        layoutParams6.addRule(8, 1);
        this.f17294e.setLayoutParams(layoutParams6);
        a(false);
        this.f17294e.setTextColor(-1);
        this.f17294e.setTextSize(12.0f);
        this.f17294e.setTypeface((Typeface) null, 1);
        this.f17294e.setPadding(a14, a13, a14, a13);
        this.f17294e.setId(4);
        this.f17294e.setShadowLayer(2.5f, -3.0f, 3.0f, -9013642);
        this.f17294e.setBackgroundDrawable(new a(this, new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, (RectF) null, (float[]) null)));
        this.f17290a.addView(this.f17291b);
        this.f17290a.addView(this.f17292c);
        this.f17290a.addView(this.f17293d);
        this.f17290a.addView(this.f17295f);
        this.f17290a.addView(this.f17294e);
    }

    public void a(boolean z10) {
        if (z10) {
            this.f17294e.setText("Open");
        } else {
            this.f17294e.setText("Download");
        }
    }
}
