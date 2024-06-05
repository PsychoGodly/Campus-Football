package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: k  reason: collision with root package name */
    private final a f25858k = new a(this);

    public boolean E(View view) {
        return this.f25858k.a(view);
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f25858k.b(coordinatorLayout, view, motionEvent);
        return super.k(coordinatorLayout, view, motionEvent);
    }
}
