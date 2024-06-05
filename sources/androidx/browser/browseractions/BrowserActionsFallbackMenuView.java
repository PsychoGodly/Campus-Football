package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import o.a;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final int f1885a = getResources().getDimensionPixelOffset(a.f20983b);

    /* renamed from: b  reason: collision with root package name */
    private final int f1886b = getResources().getDimensionPixelOffset(a.f20982a);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1885a * 2), this.f1886b), 1073741824), i11);
    }
}
