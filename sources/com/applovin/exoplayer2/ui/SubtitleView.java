package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import com.applovin.impl.go;
import com.applovin.impl.kh;
import com.applovin.impl.mh;
import com.applovin.impl.nh;
import com.applovin.impl.od;
import com.applovin.impl.p6;
import com.applovin.impl.qd;
import com.applovin.impl.qo;
import com.applovin.impl.uo;
import com.applovin.impl.uz;
import com.applovin.impl.v2;
import com.applovin.impl.vz;
import com.applovin.impl.we;
import com.applovin.impl.yp;
import com.applovin.impl.yq;
import com.applovin.impl.z4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SubtitleView extends FrameLayout implements nh.e {

    /* renamed from: a  reason: collision with root package name */
    private List f6116a;

    /* renamed from: b  reason: collision with root package name */
    private v2 f6117b;

    /* renamed from: c  reason: collision with root package name */
    private int f6118c;

    /* renamed from: d  reason: collision with root package name */
    private float f6119d;

    /* renamed from: f  reason: collision with root package name */
    private float f6120f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6121g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6122h;

    /* renamed from: i  reason: collision with root package name */
    private int f6123i;

    /* renamed from: j  reason: collision with root package name */
    private a f6124j;

    /* renamed from: k  reason: collision with root package name */
    private View f6125k;

    interface a {
        void a(List list, v2 v2Var, float f10, int i10, float f11);
    }

    public SubtitleView(Context context) {
        this(context, (AttributeSet) null);
    }

    private z4 a(z4 z4Var) {
        z4.b a10 = z4Var.a();
        if (!this.f6121g) {
            h.a(a10);
        } else if (!this.f6122h) {
            h.b(a10);
        }
        return a10.a();
    }

    private void e() {
        this.f6124j.a(getCuesWithStylingPreferencesApplied(), this.f6117b, this.f6119d, this.f6118c, this.f6120f);
    }

    private List<z4> getCuesWithStylingPreferencesApplied() {
        if (this.f6121g && this.f6122h) {
            return this.f6116a;
        }
        ArrayList arrayList = new ArrayList(this.f6116a.size());
        for (int i10 = 0; i10 < this.f6116a.size(); i10++) {
            arrayList.add(a((z4) this.f6116a.get(i10)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (yp.f13662a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private v2 getUserCaptionStyle() {
        if (yp.f13662a < 19 || isInEditMode()) {
            return v2.f12657g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager == null || !captioningManager.isEnabled()) {
            return v2.f12657g;
        }
        return v2.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t10) {
        removeView(this.f6125k);
        View view = this.f6125k;
        if (view instanceof j) {
            ((j) view).a();
        }
        this.f6125k = t10;
        this.f6124j = (a) t10;
        addView(t10);
    }

    public /* synthetic */ void a() {
        vz.a(this);
    }

    public /* synthetic */ void a(float f10) {
        vz.b(this, f10);
    }

    public /* synthetic */ void a(int i10) {
        vz.c(this, i10);
    }

    public /* synthetic */ void a(int i10, int i11) {
        vz.d(this, i10, i11);
    }

    public /* synthetic */ void a(go goVar, int i10) {
        vz.e(this, goVar, i10);
    }

    public /* synthetic */ void a(kh khVar) {
        vz.f(this, khVar);
    }

    public /* synthetic */ void a(mh mhVar) {
        vz.g(this, mhVar);
    }

    public /* synthetic */ void a(nh.b bVar) {
        vz.h(this, bVar);
    }

    public /* synthetic */ void a(nh.f fVar, nh.f fVar2, int i10) {
        vz.i(this, fVar, fVar2, i10);
    }

    public /* synthetic */ void a(nh nhVar, nh.d dVar) {
        vz.j(this, nhVar, dVar);
    }

    public /* synthetic */ void a(od odVar, int i10) {
        vz.k(this, odVar, i10);
    }

    public /* synthetic */ void a(p6 p6Var) {
        vz.l(this, p6Var);
    }

    public /* synthetic */ void a(qd qdVar) {
        vz.m(this, qdVar);
    }

    public /* synthetic */ void a(qo qoVar, uo uoVar) {
        vz.n(this, qoVar, uoVar);
    }

    public /* synthetic */ void a(we weVar) {
        vz.o(this, weVar);
    }

    public /* synthetic */ void a(yq yqVar) {
        vz.p(this, yqVar);
    }

    public /* synthetic */ void a(boolean z10) {
        vz.r(this, z10);
    }

    public /* synthetic */ void a(boolean z10, int i10) {
        vz.s(this, z10, i10);
    }

    public /* synthetic */ void b() {
        uz.l(this);
    }

    public /* synthetic */ void b(int i10) {
        vz.t(this, i10);
    }

    public /* synthetic */ void b(int i10, boolean z10) {
        vz.u(this, i10, z10);
    }

    public /* synthetic */ void b(kh khVar) {
        vz.v(this, khVar);
    }

    public /* synthetic */ void b(boolean z10) {
        vz.w(this, z10);
    }

    public /* synthetic */ void b(boolean z10, int i10) {
        uz.o(this, z10, i10);
    }

    public void c() {
        setStyle(getUserCaptionStyle());
    }

    public /* synthetic */ void c(int i10) {
        vz.x(this, i10);
    }

    public /* synthetic */ void c(boolean z10) {
        vz.y(this, z10);
    }

    public void d() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public /* synthetic */ void d(boolean z10) {
        vz.z(this, z10);
    }

    public /* synthetic */ void e(int i10) {
        uz.s(this, i10);
    }

    public /* synthetic */ void e(boolean z10) {
        uz.t(this, z10);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f6122h = z10;
        e();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f6121g = z10;
        e();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f6120f = f10;
        e();
    }

    public void setCues(List<z4> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f6116a = list;
        e();
    }

    public void setFractionalTextSize(float f10) {
        a(f10, false);
    }

    public void setStyle(v2 v2Var) {
        this.f6117b = v2Var;
        e();
    }

    public void setViewType(int i10) {
        if (this.f6123i != i10) {
            if (i10 == 1) {
                setView(new a(getContext()));
            } else if (i10 == 2) {
                setView(new j(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
            this.f6123i = i10;
        }
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6116a = Collections.emptyList();
        this.f6117b = v2.f12657g;
        this.f6118c = 0;
        this.f6119d = 0.0533f;
        this.f6120f = 0.08f;
        this.f6121g = true;
        this.f6122h = true;
        a aVar = new a(context);
        this.f6124j = aVar;
        this.f6125k = aVar;
        addView(aVar);
        this.f6123i = 1;
    }

    public void a(List list) {
        setCues(list);
    }

    public void a(float f10, boolean z10) {
        a(z10 ? 1 : 0, f10);
    }

    private void a(int i10, float f10) {
        this.f6118c = i10;
        this.f6119d = f10;
        e();
    }
}
