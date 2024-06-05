package com.startapp.sdk.inappbrowser;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.f9;
import com.startapp.u5;
import java.util.Map;

/* compiled from: Sta */
public class NavigationBarLayout extends RelativeLayout {

    /* renamed from: j  reason: collision with root package name */
    public static final int f17223j = Color.rgb(78, 86, 101);

    /* renamed from: k  reason: collision with root package name */
    public static final int f17224k = Color.rgb(148, 155, 166);

    /* renamed from: a  reason: collision with root package name */
    public RelativeLayout f17225a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f17226b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f17227c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f17228d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f17229e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f17230f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f17231g;

    /* renamed from: h  reason: collision with root package name */
    public Boolean f17232h = Boolean.FALSE;

    /* renamed from: i  reason: collision with root package name */
    public Map<String, u5> f17233i;

    public NavigationBarLayout(Context context) {
        super(context);
    }

    public void a(WebView webView) {
        if (this.f17232h.booleanValue()) {
            if (webView.canGoBack()) {
                this.f17229e.setImageBitmap(this.f17233i.get("BACK_DARK").f17366a);
                this.f17229e.setEnabled(true);
            } else {
                this.f17229e.setImageBitmap(this.f17233i.get("BACK").f17366a);
                this.f17229e.setEnabled(false);
            }
            if (webView.canGoForward()) {
                this.f17227c.setImageBitmap(this.f17233i.get("FORWARD_DARK").f17366a);
                this.f17227c.setEnabled(true);
            } else {
                this.f17227c.setImageBitmap(this.f17233i.get("FORWARD").f17366a);
                this.f17227c.setEnabled(false);
            }
            if (webView.getTitle() != null) {
                this.f17230f.setText(webView.getTitle());
            }
        } else if (webView.canGoBack()) {
            this.f17229e.setImageBitmap(this.f17233i.get("BACK_DARK").f17366a);
            addView(this.f17229e, f9.a(getContext(), new int[]{6, 0, 0, 0}, new int[]{15, 9}));
            ImageView imageView = this.f17227c;
            RelativeLayout.LayoutParams a10 = f9.a(getContext(), new int[]{9, 0, 0, 0}, new int[]{15});
            a10.addRule(1, 2105);
            addView(imageView, a10);
            removeView(this.f17225a);
            this.f17225a.removeView(this.f17231g);
            this.f17225a.removeView(this.f17230f);
            this.f17225a.addView(this.f17230f, f9.a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14}));
            RelativeLayout relativeLayout = this.f17225a;
            TextView textView = this.f17231g;
            RelativeLayout.LayoutParams a11 = f9.a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14});
            a11.addRule(3, 2102);
            relativeLayout.addView(textView, a11);
            RelativeLayout.LayoutParams a12 = f9.a(getContext(), new int[]{16, 0, 16, 0}, new int[]{15});
            a12.addRule(1, 2106);
            a12.addRule(0, 2104);
            addView(this.f17225a, a12);
            this.f17232h = Boolean.TRUE;
        }
    }

    public void setButtonsListener(View.OnClickListener onClickListener) {
        this.f17226b.setOnClickListener(onClickListener);
        this.f17229e.setOnClickListener(onClickListener);
        this.f17227c.setOnClickListener(onClickListener);
        this.f17228d.setOnClickListener(onClickListener);
    }

    public void a() {
        if (Build.VERSION.SDK_INT < 11) {
            ((BitmapDrawable) this.f17226b.getDrawable()).getBitmap().recycle();
            ((BitmapDrawable) this.f17228d.getDrawable()).getBitmap().recycle();
            ((BitmapDrawable) this.f17229e.getDrawable()).getBitmap().recycle();
            ((BitmapDrawable) this.f17227c.getDrawable()).getBitmap().recycle();
        }
        this.f17233i = null;
    }
}
