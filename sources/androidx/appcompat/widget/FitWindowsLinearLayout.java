package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.j0;

public class FitWindowsLinearLayout extends LinearLayout implements j0 {

    /* renamed from: a  reason: collision with root package name */
    private j0.a f1385a;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        j0.a aVar = this.f1385a;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(j0.a aVar) {
        this.f1385a = aVar;
    }
}
