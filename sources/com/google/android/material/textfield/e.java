package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: EndIconDelegate */
abstract class e {

    /* renamed from: a  reason: collision with root package name */
    TextInputLayout f25968a;

    /* renamed from: b  reason: collision with root package name */
    Context f25969b;

    /* renamed from: c  reason: collision with root package name */
    CheckableImageButton f25970c;

    e(TextInputLayout textInputLayout) {
        this.f25968a = textInputLayout;
        this.f25969b = textInputLayout.getContext();
        this.f25970c = textInputLayout.getEndIconView();
    }

    /* access modifiers changed from: package-private */
    public abstract void a();

    /* access modifiers changed from: package-private */
    public boolean b(int i10) {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return false;
    }
}
