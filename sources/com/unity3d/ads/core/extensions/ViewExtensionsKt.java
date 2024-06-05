package com.unity3d.ads.core.extensions;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: ViewExtensions.kt */
public final class ViewExtensionsKt {
    public static final void removeViewFromParent(View view) {
        ViewGroup viewGroup = null;
        ViewParent parent = view != null ? view.getParent() : null;
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        }
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }
}
