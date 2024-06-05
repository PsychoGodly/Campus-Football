package com.applovin.impl.adview;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.e;

public class g extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private e f6471a;

    /* renamed from: b  reason: collision with root package name */
    private int f6472b;

    public g(e.a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        e a10 = e.a(aVar, activity);
        this.f6471a = a10;
        addView(a10);
    }

    public void a(e.a aVar) {
        if (aVar != null && aVar != this.f6471a.getStyle()) {
            ViewGroup.LayoutParams layoutParams = this.f6471a.getLayoutParams();
            removeView(this.f6471a);
            e a10 = e.a(aVar, getContext());
            this.f6471a = a10;
            addView(a10);
            this.f6471a.setLayoutParams(layoutParams);
            this.f6471a.a(this.f6472b);
        }
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f6472b = i10;
        int i14 = i11 + i10 + i12;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i14;
            layoutParams.width = i14;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i14, i14));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i10, i10, i13);
        layoutParams2.setMargins(i12, i12, i12, 0);
        this.f6471a.setLayoutParams(layoutParams2);
        this.f6471a.a(i10);
    }
}
