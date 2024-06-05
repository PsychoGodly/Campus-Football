package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat */
public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    private final int f3115a;

    /* renamed from: b  reason: collision with root package name */
    private final c f3116b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3117c;

    public a(int i10, c cVar, int i11) {
        this.f3115a = i10;
        this.f3116b = cVar;
        this.f3117c = i11;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3115a);
        this.f3116b.O(this.f3117c, bundle);
    }
}
