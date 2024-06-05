package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.ui.SubtitleView;
import com.applovin.impl.v2;
import com.applovin.impl.z4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class a extends View implements SubtitleView.a {

    /* renamed from: a  reason: collision with root package name */
    private final List f6126a;

    /* renamed from: b  reason: collision with root package name */
    private List f6127b;

    /* renamed from: c  reason: collision with root package name */
    private int f6128c;

    /* renamed from: d  reason: collision with root package name */
    private float f6129d;

    /* renamed from: f  reason: collision with root package name */
    private v2 f6130f;

    /* renamed from: g  reason: collision with root package name */
    private float f6131g;

    public a(Context context) {
        this(context, (AttributeSet) null);
    }

    private static z4 a(z4 z4Var) {
        z4.b b10 = z4Var.a().b(-3.4028235E38f).b((int) RecyclerView.UNDEFINED_DURATION).b((Layout.Alignment) null);
        if (z4Var.f13757g == 0) {
            b10.a(1.0f - z4Var.f13756f, 0);
        } else {
            b10.a((-z4Var.f13756f) - 1.0f, 1);
        }
        int i10 = z4Var.f13758h;
        if (i10 == 0) {
            b10.a(2);
        } else if (i10 == 2) {
            b10.a(0);
        }
        return b10.a();
    }

    public void dispatchDraw(Canvas canvas) {
        List list = this.f6127b;
        if (!list.isEmpty()) {
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int paddingBottom = height - getPaddingBottom();
            if (paddingBottom > paddingTop && width > paddingLeft) {
                int i10 = paddingBottom - paddingTop;
                float a10 = h.a(this.f6128c, this.f6129d, height, i10);
                if (a10 > 0.0f) {
                    int size = list.size();
                    int i11 = 0;
                    while (i11 < size) {
                        z4 z4Var = (z4) list.get(i11);
                        if (z4Var.f13767q != Integer.MIN_VALUE) {
                            z4Var = a(z4Var);
                        }
                        z4 z4Var2 = z4Var;
                        float f10 = a10;
                        int i12 = paddingBottom;
                        ((g) this.f6126a.get(i11)).a(z4Var2, this.f6130f, f10, h.a(z4Var2.f13765o, z4Var2.f13766p, height, i10), this.f6131g, canvas, paddingLeft, paddingTop, width, i12);
                        i11++;
                        size = size;
                        i10 = i10;
                        paddingBottom = i12;
                        width = width;
                    }
                }
            }
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6126a = new ArrayList();
        this.f6127b = Collections.emptyList();
        this.f6128c = 0;
        this.f6129d = 0.0533f;
        this.f6130f = v2.f12657g;
        this.f6131g = 0.08f;
    }

    public void a(List list, v2 v2Var, float f10, int i10, float f11) {
        this.f6127b = list;
        this.f6130f = v2Var;
        this.f6129d = f10;
        this.f6128c = i10;
        this.f6131g = f11;
        while (this.f6126a.size() < list.size()) {
            this.f6126a.add(new g(getContext()));
        }
        invalidate();
    }
}
