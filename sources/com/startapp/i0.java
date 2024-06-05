package com.startapp;

import android.content.Context;
import android.util.TypedValue;

/* compiled from: Sta */
public final /* synthetic */ class i0 {
    public static int a(Context context, int i10, float f10) {
        return Math.round(TypedValue.applyDimension(i10, f10, context.getResources().getDisplayMetrics()));
    }
}
