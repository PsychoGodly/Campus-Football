package com.applovin.impl;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class xb {

    /* renamed from: a  reason: collision with root package name */
    public TextView f13309a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f13310b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f13311c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f13312d;

    /* renamed from: e  reason: collision with root package name */
    private yb f13313e;

    /* renamed from: f  reason: collision with root package name */
    private int f13314f;

    public int a() {
        return this.f13314f;
    }

    public yb b() {
        return this.f13313e;
    }

    public void a(int i10) {
        this.f13314f = i10;
    }

    public void a(yb ybVar) {
        this.f13313e = ybVar;
        this.f13309a.setText(ybVar.k());
        this.f13309a.setTextColor(ybVar.l());
        if (this.f13310b != null) {
            if (!TextUtils.isEmpty(ybVar.f())) {
                this.f13310b.setTypeface((Typeface) null, 0);
                this.f13310b.setVisibility(0);
                this.f13310b.setText(ybVar.f());
                this.f13310b.setTextColor(ybVar.g());
                if (ybVar.p()) {
                    this.f13310b.setTypeface((Typeface) null, 1);
                }
            } else {
                this.f13310b.setVisibility(8);
            }
        }
        if (this.f13311c != null) {
            if (ybVar.h() > 0) {
                this.f13311c.setImageResource(ybVar.h());
                this.f13311c.setColorFilter(ybVar.i());
                this.f13311c.setVisibility(0);
            } else {
                this.f13311c.setVisibility(8);
            }
        }
        if (this.f13312d == null) {
            return;
        }
        if (ybVar.d() > 0) {
            this.f13312d.setImageResource(ybVar.d());
            this.f13312d.setColorFilter(ybVar.e());
            this.f13312d.setVisibility(0);
            return;
        }
        this.f13312d.setVisibility(8);
    }
}
