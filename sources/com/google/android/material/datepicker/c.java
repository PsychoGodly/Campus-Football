package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import k6.b;
import x5.k;

/* compiled from: CalendarStyle */
final class c {

    /* renamed from: a  reason: collision with root package name */
    final b f25618a;

    /* renamed from: b  reason: collision with root package name */
    final b f25619b;

    /* renamed from: c  reason: collision with root package name */
    final b f25620c;

    /* renamed from: d  reason: collision with root package name */
    final b f25621d;

    /* renamed from: e  reason: collision with root package name */
    final b f25622e;

    /* renamed from: f  reason: collision with root package name */
    final b f25623f;

    /* renamed from: g  reason: collision with root package name */
    final b f25624g;

    /* renamed from: h  reason: collision with root package name */
    final Paint f25625h;

    c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.c(context, x5.b.materialCalendarStyle, h.class.getCanonicalName()), k.D1);
        this.f25618a = b.a(context, obtainStyledAttributes.getResourceId(k.G1, 0));
        this.f25624g = b.a(context, obtainStyledAttributes.getResourceId(k.E1, 0));
        this.f25619b = b.a(context, obtainStyledAttributes.getResourceId(k.F1, 0));
        this.f25620c = b.a(context, obtainStyledAttributes.getResourceId(k.H1, 0));
        ColorStateList a10 = k6.c.a(context, obtainStyledAttributes, k.I1);
        this.f25621d = b.a(context, obtainStyledAttributes.getResourceId(k.K1, 0));
        this.f25622e = b.a(context, obtainStyledAttributes.getResourceId(k.J1, 0));
        this.f25623f = b.a(context, obtainStyledAttributes.getResourceId(k.L1, 0));
        Paint paint = new Paint();
        this.f25625h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
