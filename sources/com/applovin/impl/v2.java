package com.applovin.impl;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

public final class v2 {

    /* renamed from: g  reason: collision with root package name */
    public static final v2 f12657g = new v2(-1, -16777216, 0, 0, -1, (Typeface) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f12658a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12659b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12660c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12661d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12662e;

    /* renamed from: f  reason: collision with root package name */
    public final Typeface f12663f;

    public v2(int i10, int i11, int i12, int i13, int i14, Typeface typeface) {
        this.f12658a = i10;
        this.f12659b = i11;
        this.f12660c = i12;
        this.f12661d = i13;
        this.f12662e = i14;
        this.f12663f = typeface;
    }

    public static v2 a(CaptioningManager.CaptionStyle captionStyle) {
        if (yp.f13662a >= 21) {
            return c(captionStyle);
        }
        return b(captionStyle);
    }

    private static v2 b(CaptioningManager.CaptionStyle captionStyle) {
        return new v2(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    private static v2 c(CaptioningManager.CaptionStyle captionStyle) {
        return new v2(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f12657g.f12658a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f12657g.f12659b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f12657g.f12660c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f12657g.f12661d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f12657g.f12662e, captionStyle.getTypeface());
    }
}
