package com.google.android.material.internal;

import android.widget.ImageButton;

/* compiled from: VisibilityAwareImageButton */
public class i extends ImageButton {

    /* renamed from: a  reason: collision with root package name */
    private int f25857a;

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f25857a = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f25857a;
    }

    public void setVisibility(int i10) {
        b(i10, true);
    }
}
