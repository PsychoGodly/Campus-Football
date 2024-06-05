package com.startapp.sdk.ads.banner.banner3d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.mediation.MaxReward;
import com.startapp.a0;
import com.startapp.f9;
import com.startapp.i0;
import com.startapp.sdk.ads.banner.banner3d.Banner3DSize;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.json.RatingBar;

/* compiled from: Sta */
public class Banner3DView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public TextView f16441a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f16442b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f16443c;

    /* renamed from: d  reason: collision with root package name */
    public RatingBar f16444d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f16445e;

    /* renamed from: f  reason: collision with root package name */
    public Point f16446f;

    /* compiled from: Sta */
    public enum Template {
        S,
        M,
        L,
        XL
    }

    /* compiled from: Sta */
    public class a extends ShapeDrawable {
        public a(Banner3DView banner3DView, Shape shape) {
            super(shape);
        }

        public void onDraw(Shape shape, Canvas canvas, Paint paint) {
            paint.setColor(-11363070);
            paint.setMaskFilter(new EmbossMaskFilter(new float[]{1.0f, 1.0f, 1.0f}, 0.4f, 5.0f, 3.0f));
            super.onDraw(shape, canvas, paint);
        }
    }

    public Banner3DView(Context context) {
        super(context);
        a();
    }

    public final void a() {
        Context context = getContext();
        Template template = Template.S;
        int i10 = this.f16446f.x;
        Banner3DSize.Size size = Banner3DSize.Size.SMALL;
        if (i10 > size.getSize().f16191a.x || this.f16446f.y > size.getSize().f16191a.y) {
            template = Template.M;
        }
        int i11 = this.f16446f.x;
        Banner3DSize.Size size2 = Banner3DSize.Size.MEDIUM;
        if (i11 > size2.getSize().f16191a.x || this.f16446f.y > size2.getSize().f16191a.y) {
            template = Template.L;
        }
        int i12 = this.f16446f.x;
        Banner3DSize.Size size3 = Banner3DSize.Size.LARGE;
        if (i12 > size3.getSize().f16191a.x || this.f16446f.y > size3.getSize().f16191a.y) {
            template = Template.XL;
        }
        setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{AdsCommonMetaData.f16770h.p(), AdsCommonMetaData.f16770h.o()}));
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int a10 = f9.a(context, 2);
        int a11 = i0.a(context, 1, (float) 3);
        Math.round(TypedValue.applyDimension(1, (float) 4, context.getResources().getDisplayMetrics()));
        int a12 = i0.a(context, 1, (float) 5);
        int a13 = i0.a(context, 1, (float) 6);
        int a14 = i0.a(context, 1, (float) 8);
        Math.round(TypedValue.applyDimension(1, (float) 10, context.getResources().getDisplayMetrics()));
        int a15 = i0.a(context, 1, (float) 20);
        Math.round(TypedValue.applyDimension(1, (float) 84, context.getResources().getDisplayMetrics()));
        int a16 = i0.a(context, 1, (float) 90);
        setPadding(a12, 0, a12, 0);
        setTag(this);
        ImageView imageView = new ImageView(context);
        this.f16443c = imageView;
        imageView.setId(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a16, a16);
        layoutParams.addRule(15);
        this.f16443c.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        this.f16441a = textView;
        textView.setId(2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(a0.a(17), 1);
        layoutParams2.addRule(14);
        this.f16441a.setLayoutParams(layoutParams2);
        this.f16441a.setTextColor(AdsCommonMetaData.f16770h.q().intValue());
        this.f16441a.setGravity(a0.a(8388611));
        this.f16441a.setBackgroundColor(0);
        int ordinal = template.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            this.f16441a.setTextSize(17.0f);
            this.f16441a.setPadding(a11, 0, 0, a10);
            layoutParams2.width = f9.a(getContext(), (int) (((double) this.f16446f.x) * 0.55d));
        } else if (ordinal == 2) {
            this.f16441a.setTextSize(17.0f);
            this.f16441a.setPadding(a11, 0, 0, a10);
            layoutParams2.width = f9.a(getContext(), (int) (((double) this.f16446f.x) * 0.65d));
        } else if (ordinal == 3 || ordinal == 4) {
            this.f16441a.setTextSize(22.0f);
            this.f16441a.setPadding(a11, 0, 0, a12);
        }
        this.f16441a.setSingleLine(true);
        this.f16441a.setEllipsize(TextUtils.TruncateAt.END);
        f9.a(this.f16441a, AdsCommonMetaData.f16770h.r());
        TextView textView2 = new TextView(context);
        this.f16442b = textView2;
        textView2.setId(3);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(a0.a(17), 1);
        layoutParams3.addRule(3, 2);
        layoutParams3.setMargins(0, 0, 0, a12);
        this.f16442b.setLayoutParams(layoutParams3);
        this.f16442b.setTextColor(AdsCommonMetaData.f16770h.l().intValue());
        this.f16442b.setTextSize(18.0f);
        this.f16442b.setMaxLines(2);
        this.f16442b.setLines(2);
        this.f16442b.setSingleLine(false);
        this.f16442b.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f16442b.setHorizontallyScrolling(true);
        this.f16442b.setPadding(a11, 0, 0, 0);
        RatingBar ratingBar = new RatingBar(getContext());
        this.f16444d = ratingBar;
        ratingBar.setId(5);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        int ordinal2 = template.ordinal();
        if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2) {
            layoutParams4.addRule(a0.a(17), 1);
            layoutParams4.addRule(8, 1);
        } else if (ordinal2 == 3 || ordinal2 == 4) {
            layoutParams4.addRule(a0.a(17), 2);
            layoutParams3.width = f9.a(getContext(), (int) (((double) this.f16446f.x) * 0.6d));
        }
        layoutParams4.setMargins(a11, a14, a11, 0);
        this.f16444d.setLayoutParams(layoutParams4);
        this.f16445e = new TextView(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        int ordinal3 = template.ordinal();
        if (ordinal3 == 0 || ordinal3 == 1 || ordinal3 == 2) {
            this.f16445e.setTextSize(13.0f);
            layoutParams5.addRule(a0.a(17), 2);
            layoutParams5.addRule(15);
        } else if (ordinal3 == 3) {
            layoutParams5.addRule(a0.a(17), 3);
            layoutParams5.addRule(15);
            layoutParams5.setMargins(a15, 0, 0, 0);
            this.f16445e.setTextSize(26.0f);
        } else if (ordinal3 == 4) {
            layoutParams5.addRule(a0.a(17), 3);
            layoutParams5.addRule(15);
            layoutParams5.setMargins(a15 * 7, 0, 0, 0);
            this.f16445e.setTextSize(26.0f);
        }
        this.f16445e.setPadding(a13, a13, a13, a13);
        this.f16445e.setLayoutParams(layoutParams5);
        setButtonText(false);
        this.f16445e.setTextColor(-1);
        this.f16445e.setTypeface((Typeface) null, 1);
        this.f16445e.setId(4);
        this.f16445e.setShadowLayer(2.5f, -3.0f, 3.0f, -9013642);
        this.f16445e.setBackgroundDrawable(new a(this, new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, (RectF) null, (float[]) null)));
        addView(this.f16443c);
        addView(this.f16441a);
        int ordinal4 = template.ordinal();
        if (ordinal4 == 0 || ordinal4 == 1 || ordinal4 == 2) {
            addView(this.f16445e);
        } else if (ordinal4 == 3 || ordinal4 == 4) {
            addView(this.f16445e);
            addView(this.f16442b);
        }
        addView(this.f16444d);
    }

    public void setButtonText(boolean z10) {
        if (z10) {
            this.f16445e.setText("OPEN");
        } else {
            this.f16445e.setText("DOWNLOAD");
        }
    }

    public void setDescription(String str) {
        if (str != null) {
            String str2 = MaxReward.DEFAULT_LABEL;
            if (str.compareTo(str2) != 0) {
                String[] a10 = a(str);
                String str3 = a10[0];
                if (a10[1] != null) {
                    str2 = a(a10[1])[0];
                }
                if (str.length() >= 110) {
                    str2 = str2 + "...";
                }
                this.f16442b.setText(str3 + "\n" + str2);
            }
        }
    }

    public void setImage(Bitmap bitmap) {
        this.f16443c.setImageBitmap(bitmap);
    }

    public void setRating(float f10) {
        try {
            this.f16444d.setRating(f10);
        } catch (NullPointerException unused) {
        }
    }

    public void setText(String str) {
        this.f16441a.setText(str);
    }

    public void setImage(int i10, int i11, int i12) {
        this.f16443c.setImageResource(i10);
        ViewGroup.LayoutParams layoutParams = this.f16443c.getLayoutParams();
        layoutParams.width = i11;
        layoutParams.height = i12;
        this.f16443c.setLayoutParams(layoutParams);
    }

    public Banner3DView(Context context, Point point) {
        super(context);
        this.f16446f = point;
        a();
    }

    public Banner3DView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public void setImage(Bitmap bitmap, int i10, int i11) {
        this.f16443c.setImageBitmap(bitmap);
        ViewGroup.LayoutParams layoutParams = this.f16443c.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i11;
        this.f16443c.setLayoutParams(layoutParams);
    }

    public Banner3DView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a();
    }

    public final String[] a(String str) {
        boolean z10;
        String[] strArr = new String[2];
        int i10 = 55;
        if (str.length() > 55) {
            char[] charArray = str.substring(0, 55).toCharArray();
            int length = charArray.length - 1;
            int i11 = length - 1;
            while (true) {
                if (i11 <= 0) {
                    z10 = false;
                    break;
                } else if (charArray[i11] == ' ') {
                    length = i11;
                    z10 = true;
                    break;
                } else {
                    i11--;
                }
            }
            if (z10) {
                i10 = length;
            }
            strArr[0] = str.substring(0, i10);
            strArr[1] = str.substring(i10 + 1, str.length());
        } else {
            strArr[0] = str;
            strArr[1] = null;
        }
        return strArr;
    }
}
