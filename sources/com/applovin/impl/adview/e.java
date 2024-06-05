package com.applovin.impl.adview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public abstract class e extends View {

    /* renamed from: a  reason: collision with root package name */
    protected float f6453a = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f6454b;

    public enum a {
        WHITE_ON_BLACK(0),
        WHITE_ON_TRANSPARENT(1),
        INVISIBLE(2),
        TRANSPARENT_SKIP(3);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f6460a;

        private a(int i10) {
            this.f6460a = i10;
        }

        public int b() {
            return this.f6460a;
        }
    }

    protected e(Context context) {
        super(context);
        this.f6454b = context;
    }

    public void a(int i10) {
        setViewScale(((float) i10) / 30.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) getSize();
            layoutParams.height = (int) getSize();
        }
    }

    public float getSize() {
        return this.f6453a * 30.0f;
    }

    public abstract a getStyle();

    public void setViewScale(float f10) {
        this.f6453a = f10;
    }

    public static e a(a aVar, Context context) {
        if (aVar.equals(a.INVISIBLE)) {
            return new h(context);
        }
        if (aVar.equals(a.WHITE_ON_TRANSPARENT)) {
            return new i(context);
        }
        if (aVar.equals(a.TRANSPARENT_SKIP)) {
            return new j(context);
        }
        return new n(context);
    }
}
