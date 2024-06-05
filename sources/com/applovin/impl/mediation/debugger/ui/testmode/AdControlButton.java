package com.applovin.impl.mediation.debugger.ui.testmode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.o;
import com.applovin.impl.r3;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.R;

public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final GradientDrawable f9597a;

    /* renamed from: b  reason: collision with root package name */
    private final Button f9598b;

    /* renamed from: c  reason: collision with root package name */
    private final o f9599c;

    /* renamed from: d  reason: collision with root package name */
    private b f9600d;

    /* renamed from: f  reason: collision with root package name */
    private MaxAdFormat f9601f;

    /* renamed from: g  reason: collision with root package name */
    private a f9602g;

    public interface a {
        void onClick(AdControlButton adControlButton);
    }

    public enum b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    private int a(b bVar) {
        if (b.LOAD == bVar) {
            return r3.a(R.color.applovin_sdk_brand_color, getContext());
        }
        if (b.LOADING == bVar) {
            return r3.a(R.color.applovin_sdk_brand_color, getContext());
        }
        return r3.a(R.color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    private String b(b bVar) {
        if (b.LOAD == bVar) {
            return "Load";
        }
        return b.LOADING == bVar ? MaxReward.DEFAULT_LABEL : "Show";
    }

    private void c(b bVar) {
        if (b.LOADING == bVar) {
            setEnabled(false);
            this.f9599c.a();
        } else {
            setEnabled(true);
            this.f9599c.b();
        }
        this.f9598b.setText(b(bVar));
        this.f9597a.setColor(a(bVar));
    }

    public b getControlState() {
        return this.f9600d;
    }

    public MaxAdFormat getFormat() {
        return this.f9601f;
    }

    public void onClick(View view) {
        a aVar = this.f9602g;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }

    public void setControlState(b bVar) {
        if (this.f9600d != bVar) {
            c(bVar);
        }
        this.f9600d = bVar;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f9601f = maxAdFormat;
    }

    public void setOnClickListener(a aVar) {
        this.f9602g = aVar;
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f9597a = gradientDrawable;
        Button button = new Button(getContext());
        this.f9598b = button;
        o oVar = new o(getContext(), 20, 16842873);
        this.f9599c = oVar;
        b bVar = b.LOAD;
        this.f9600d = bVar;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        button.setOnClickListener(this);
        frameLayout.addView(button, new FrameLayout.LayoutParams(-1, -1, 17));
        gradientDrawable.setCornerRadius(20.0f);
        button.setBackground(gradientDrawable);
        a();
        oVar.setColor(-1);
        addView(oVar, new FrameLayout.LayoutParams(-1, -1, 17));
        c(bVar);
    }

    private void a() {
        this.f9598b.setTextColor(new ColorStateList(new int[][]{new int[]{16842919}, new int[0]}, new int[]{r3.a(R.color.applovin_sdk_highlightTextColor, getContext()), -1}));
    }
}
